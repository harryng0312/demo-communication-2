package org.harryng.communication.rpc.service

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import org.harryng.communication.rpc.ChatServiceKt
import org.harryng.communication.rpc.gen.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.text.SimpleDateFormat
import java.util.*

open class ChatServiceKtImpl : ChatServiceGrpcKt.ChatServiceCoroutineImplBase(), ChatServiceKt {
    companion object{
        val dataFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
        val logger: Logger = LoggerFactory.getLogger(ChatServiceKtImpl::class.java)
    }
    override suspend fun getCurrentDate(request: GetCurrentDateRequest): GetCurrentDateResponse {
        val res = GetCurrentDateResponse.newBuilder().apply {
            val now = Date()
            this.result = dataFormat.format(now)
        }.build()
        return res
    }

    override suspend fun loginChat(request: AuthRequest): AuthResponse {
        return super.loginChat(request)
    }

    override suspend fun logoutChat(request: AuthRequest): AuthResponse {
        return super.logoutChat(request)
    }

    override fun sendChatStream(requests: Flow<ChatMessage>): Flow<ChatSignal> {
        val response = flow<ChatSignal> {
            requests.collect { msg ->
                logger.info("Client msg on Server: ${msg.state} - ${msg.message.toString("utf8")}")
                val chatSignal = ChatSignal.newBuilder()
                chatSignal.state = MessageState.SENDING
                emit(chatSignal.build())
            }
        }
        return response
    }
}