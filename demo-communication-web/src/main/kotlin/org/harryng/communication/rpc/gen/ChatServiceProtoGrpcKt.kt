package org.harryng.communication.rpc.gen

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.bidiStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.bidiStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow
import org.harryng.communication.rpc.gen.ChatServiceGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * org.harryng.communication.grpc.ChatService.
 */
object ChatServiceGrpcKt {
  const val SERVICE_NAME: String = ChatServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = ChatServiceGrpc.getServiceDescriptor()

  val getCurrentDateMethod: MethodDescriptor<GetCurrentDateRequest, GetCurrentDateResponse>
    @JvmStatic
    get() = ChatServiceGrpc.getGetCurrentDateMethod()

  val loginChatMethod: MethodDescriptor<AuthRequest, AuthResponse>
    @JvmStatic
    get() = ChatServiceGrpc.getLoginChatMethod()

  val logoutChatMethod: MethodDescriptor<AuthRequest, AuthResponse>
    @JvmStatic
    get() = ChatServiceGrpc.getLogoutChatMethod()

  val sendChatStreamMethod: MethodDescriptor<ChatMessage, ChatSignal>
    @JvmStatic
    get() = ChatServiceGrpc.getSendChatStreamMethod()

  /**
   * A stub for issuing RPCs to a(n) org.harryng.communication.grpc.ChatService service as
   * suspending coroutines.
   */
  @StubFor(ChatServiceGrpc::class)
  class ChatServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<ChatServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ChatServiceCoroutineStub =
        ChatServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun getCurrentDate(request: GetCurrentDateRequest): GetCurrentDateResponse = unaryRpc(
      channel,
      ChatServiceGrpc.getGetCurrentDateMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun loginChat(request: AuthRequest): AuthResponse = unaryRpc(
      channel,
      ChatServiceGrpc.getLoginChatMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun logoutChat(request: AuthRequest): AuthResponse = unaryRpc(
      channel,
      ChatServiceGrpc.getLogoutChatMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * The [Flow] of requests is collected once each time the [Flow] of responses is
     * collected. If collection of the [Flow] of responses completes normally or
     * exceptionally before collection of `requests` completes, the collection of
     * `requests` is cancelled.  If the collection of `requests` completes
     * exceptionally for any other reason, then the collection of the [Flow] of responses
     * completes exceptionally for the same reason and the RPC is cancelled with that reason.
     *
     * @param requests A [Flow] of request messages.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun sendChatStream(requests: Flow<ChatMessage>): Flow<ChatSignal> = bidiStreamingRpc(
      channel,
      ChatServiceGrpc.getSendChatStreamMethod(),
      requests,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the org.harryng.communication.grpc.ChatService service based on
   * Kotlin coroutines.
   */
  abstract class ChatServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for org.harryng.communication.grpc.ChatService.GetCurrentDate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getCurrentDate(request: GetCurrentDateRequest): GetCurrentDateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.harryng.communication.grpc.ChatService.GetCurrentDate is unimplemented"))

    /**
     * Returns the response to an RPC for org.harryng.communication.grpc.ChatService.LoginChat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun loginChat(request: AuthRequest): AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.harryng.communication.grpc.ChatService.LoginChat is unimplemented"))

    /**
     * Returns the response to an RPC for org.harryng.communication.grpc.ChatService.LogoutChat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun logoutChat(request: AuthRequest): AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.harryng.communication.grpc.ChatService.LogoutChat is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * org.harryng.communication.grpc.ChatService.SendChatStream.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param requests A [Flow] of requests from the client.  This flow can be
     *        collected only once and throws [java.lang.IllegalStateException] on attempts to
     * collect
     *        it more than once.
     */
    open fun sendChatStream(requests: Flow<ChatMessage>): Flow<ChatSignal> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.harryng.communication.grpc.ChatService.SendChatStream is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ChatServiceGrpc.getGetCurrentDateMethod(),
      implementation = ::getCurrentDate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ChatServiceGrpc.getLoginChatMethod(),
      implementation = ::loginChat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ChatServiceGrpc.getLogoutChatMethod(),
      implementation = ::logoutChat
    ))
      .addMethod(bidiStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ChatServiceGrpc.getSendChatStreamMethod(),
      implementation = ::sendChatStream
    )).build()
  }
}
