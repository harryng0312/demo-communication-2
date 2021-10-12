package org.harryng.communication.endpoint

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.server.HandshakeInterceptor
import java.net.URLDecoder


class HttpChatInterceptor : HandshakeInterceptor {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(HttpChatInterceptor::class.java)
    }

    /**
     * Before shaking hands
     *
     * @param request
     * @param response
     * @param wsHandler
     * @param attributes
     * @return
     * @throws Exception
     */
    @Throws(Exception::class)
    override fun beforeHandshake(
        request: ServerHttpRequest,
        response: ServerHttpResponse,
        wsHandler: WebSocketHandler,
        attributes: MutableMap<String, Any>
    ): Boolean {
        logger.info("Shake hands start")
        if (request.uri.query != null) {
            val query = URLDecoder.decode(request.uri.query, "utf-8")
            val paramMap: MutableMap<String, String> = HashMap()
            val pairs = query.split("&").toTypedArray()
            for (pair in pairs) {
                val idx = pair.indexOf("=")
                paramMap[URLDecoder.decode(pair.substring(0, idx), "UTF-8")] =
                    URLDecoder.decode(pair.substring(idx + 1), "UTF-8")
            }
            val uid = paramMap["username"]
            if ((uid != null) && uid.isNotEmpty()) {
                // Put in property field
                attributes["username"] = uid
                logger.info("username $uid Handshake successful!")
                return true
            }
        }
        logger.info("User login failed")
        return false
    }

    /**
     * After shaking hands
     *
     * @param request
     * @param response
     * @param wsHandler
     * @param exception
     */
    override fun afterHandshake(
        request: ServerHttpRequest,
        response: ServerHttpResponse,
        wsHandler: WebSocketHandler,
        exception: Exception
    ) {
        logger.info("Shake hands finish")
    }
}