package org.harryng.communication.endpoint;

import org.harryng.communication.dto.ChatMessage
import org.harryng.communication.dto.ChatMessageDecoder
import org.harryng.communication.dto.ChatMessageEncoder
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.IOException
import java.util.concurrent.CopyOnWriteArraySet
import java.util.function.Consumer
import javax.websocket.*
import javax.websocket.server.PathParam
import javax.websocket.server.ServerEndpoint

@ServerEndpoint(
    value = "/ws/chat-basic/{username}",
    encoders = [ChatMessageEncoder::class],
    decoders = [ChatMessageDecoder::class]
)
class ChatEndpoint {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(ChatEndpoint::class.java)
        private val chatEndpoints: MutableSet<ChatEndpoint> = CopyOnWriteArraySet()
        private val users: MutableMap<String, String> = HashMap()

        @Throws(IOException::class, EncodeException::class)
        private fun broadcast(message: ChatMessage) {
            chatEndpoints.forEach(Consumer { endpoint: ChatEndpoint ->
                synchronized(endpoint) {
                    try {
                        endpoint.session!!.basicRemote.sendObject(message)
                    } catch (e: IOException) {
                        logger.error("", e)
                    } catch (e: EncodeException) {
                        logger.error("", e)
                    }
                }
            })
        }
    }

    private lateinit var session: Session

    fun postConstruct() {
        logger.info("Chat Endpoint is created!")
    }

    @OnOpen
    @Throws(IOException::class, EncodeException::class)
    fun onOpen(session: Session, @PathParam("username") username: String) {
        logger.info("session id: " + session.id)
        this.session = session
        chatEndpoints.add(this)
        users[session.id] = username
        val message = ChatMessage()
        message.from = username
        message.content = "Connected!"
        broadcast(message)
    }

    //    @OnMessage(maxMessageSize=1024*1024*100)
    //    public void onJsonMessage(Session session, ChatMessage message) throws IOException, EncodeException {
    //        message.setFrom(users.get(session.getId()));
    //        logger.info("from: " + message.getContent());
    //        broadcast(message);
    //    }
    @OnMessage
    @Throws(IOException::class, EncodeException::class)
    fun onTextMessage(session: Session?, message: String) {
//        message.setFrom(users.get(session.getId()));
        logger.info("from: $message")
        //        broadcast(message);
    }

    @OnClose
    @Throws(IOException::class, EncodeException::class)
    fun onClose(session: Session) {
        chatEndpoints.remove(this)
        val message = ChatMessage()
        message.from = users[session.id].toString()
        message.content = "Disconnected!"
        broadcast(message)
    }

    @OnError
    fun onError(session: Session?, throwable: Throwable?) {
        logger.error("", throwable)
    }
}
