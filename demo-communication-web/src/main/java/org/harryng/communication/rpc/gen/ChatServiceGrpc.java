package org.harryng.communication.rpc.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "org.harryng.communication.grpc.ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.GetCurrentDateRequest,
      org.harryng.communication.rpc.gen.GetCurrentDateResponse> getGetCurrentDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentDate",
      requestType = org.harryng.communication.rpc.gen.GetCurrentDateRequest.class,
      responseType = org.harryng.communication.rpc.gen.GetCurrentDateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.GetCurrentDateRequest,
      org.harryng.communication.rpc.gen.GetCurrentDateResponse> getGetCurrentDateMethod() {
    io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.GetCurrentDateRequest, org.harryng.communication.rpc.gen.GetCurrentDateResponse> getGetCurrentDateMethod;
    if ((getGetCurrentDateMethod = ChatServiceGrpc.getGetCurrentDateMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getGetCurrentDateMethod = ChatServiceGrpc.getGetCurrentDateMethod) == null) {
          ChatServiceGrpc.getGetCurrentDateMethod = getGetCurrentDateMethod =
              io.grpc.MethodDescriptor.<org.harryng.communication.rpc.gen.GetCurrentDateRequest, org.harryng.communication.rpc.gen.GetCurrentDateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.GetCurrentDateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.GetCurrentDateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("GetCurrentDate"))
              .build();
        }
      }
    }
    return getGetCurrentDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.AuthRequest,
      org.harryng.communication.rpc.gen.AuthResponse> getLoginChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginChat",
      requestType = org.harryng.communication.rpc.gen.AuthRequest.class,
      responseType = org.harryng.communication.rpc.gen.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.AuthRequest,
      org.harryng.communication.rpc.gen.AuthResponse> getLoginChatMethod() {
    io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.AuthRequest, org.harryng.communication.rpc.gen.AuthResponse> getLoginChatMethod;
    if ((getLoginChatMethod = ChatServiceGrpc.getLoginChatMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getLoginChatMethod = ChatServiceGrpc.getLoginChatMethod) == null) {
          ChatServiceGrpc.getLoginChatMethod = getLoginChatMethod =
              io.grpc.MethodDescriptor.<org.harryng.communication.rpc.gen.AuthRequest, org.harryng.communication.rpc.gen.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("LoginChat"))
              .build();
        }
      }
    }
    return getLoginChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.AuthRequest,
      org.harryng.communication.rpc.gen.AuthResponse> getLogoutChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogoutChat",
      requestType = org.harryng.communication.rpc.gen.AuthRequest.class,
      responseType = org.harryng.communication.rpc.gen.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.AuthRequest,
      org.harryng.communication.rpc.gen.AuthResponse> getLogoutChatMethod() {
    io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.AuthRequest, org.harryng.communication.rpc.gen.AuthResponse> getLogoutChatMethod;
    if ((getLogoutChatMethod = ChatServiceGrpc.getLogoutChatMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getLogoutChatMethod = ChatServiceGrpc.getLogoutChatMethod) == null) {
          ChatServiceGrpc.getLogoutChatMethod = getLogoutChatMethod =
              io.grpc.MethodDescriptor.<org.harryng.communication.rpc.gen.AuthRequest, org.harryng.communication.rpc.gen.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogoutChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.AuthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("LogoutChat"))
              .build();
        }
      }
    }
    return getLogoutChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.ChatMessage,
      org.harryng.communication.rpc.gen.ChatSignal> getSendChatStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendChatStream",
      requestType = org.harryng.communication.rpc.gen.ChatMessage.class,
      responseType = org.harryng.communication.rpc.gen.ChatSignal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.ChatMessage,
      org.harryng.communication.rpc.gen.ChatSignal> getSendChatStreamMethod() {
    io.grpc.MethodDescriptor<org.harryng.communication.rpc.gen.ChatMessage, org.harryng.communication.rpc.gen.ChatSignal> getSendChatStreamMethod;
    if ((getSendChatStreamMethod = ChatServiceGrpc.getSendChatStreamMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getSendChatStreamMethod = ChatServiceGrpc.getSendChatStreamMethod) == null) {
          ChatServiceGrpc.getSendChatStreamMethod = getSendChatStreamMethod =
              io.grpc.MethodDescriptor.<org.harryng.communication.rpc.gen.ChatMessage, org.harryng.communication.rpc.gen.ChatSignal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendChatStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.harryng.communication.rpc.gen.ChatSignal.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("SendChatStream"))
              .build();
        }
      }
    }
    return getSendChatStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceStub>() {
        @java.lang.Override
        public ChatServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceStub(channel, callOptions);
        }
      };
    return ChatServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceBlockingStub>() {
        @java.lang.Override
        public ChatServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceBlockingStub(channel, callOptions);
        }
      };
    return ChatServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatServiceFutureStub>() {
        @java.lang.Override
        public ChatServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatServiceFutureStub(channel, callOptions);
        }
      };
    return ChatServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrentDate(org.harryng.communication.rpc.gen.GetCurrentDateRequest request,
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.GetCurrentDateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentDateMethod(), responseObserver);
    }

    /**
     */
    public void loginChat(org.harryng.communication.rpc.gen.AuthRequest request,
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginChatMethod(), responseObserver);
    }

    /**
     */
    public void logoutChat(org.harryng.communication.rpc.gen.AuthRequest request,
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutChatMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.ChatMessage> sendChatStream(
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.ChatSignal> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendChatStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.harryng.communication.rpc.gen.GetCurrentDateRequest,
                org.harryng.communication.rpc.gen.GetCurrentDateResponse>(
                  this, METHODID_GET_CURRENT_DATE)))
          .addMethod(
            getLoginChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.harryng.communication.rpc.gen.AuthRequest,
                org.harryng.communication.rpc.gen.AuthResponse>(
                  this, METHODID_LOGIN_CHAT)))
          .addMethod(
            getLogoutChatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.harryng.communication.rpc.gen.AuthRequest,
                org.harryng.communication.rpc.gen.AuthResponse>(
                  this, METHODID_LOGOUT_CHAT)))
          .addMethod(
            getSendChatStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.harryng.communication.rpc.gen.ChatMessage,
                org.harryng.communication.rpc.gen.ChatSignal>(
                  this, METHODID_SEND_CHAT_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceStub extends io.grpc.stub.AbstractAsyncStub<ChatServiceStub> {
    private ChatServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentDate(org.harryng.communication.rpc.gen.GetCurrentDateRequest request,
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.GetCurrentDateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginChat(org.harryng.communication.rpc.gen.AuthRequest request,
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logoutChat(org.harryng.communication.rpc.gen.AuthRequest request,
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.ChatMessage> sendChatStream(
        io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.ChatSignal> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendChatStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.harryng.communication.rpc.gen.GetCurrentDateResponse getCurrentDate(org.harryng.communication.rpc.gen.GetCurrentDateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.harryng.communication.rpc.gen.AuthResponse loginChat(org.harryng.communication.rpc.gen.AuthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.harryng.communication.rpc.gen.AuthResponse logoutChat(org.harryng.communication.rpc.gen.AuthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutChatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.harryng.communication.rpc.gen.GetCurrentDateResponse> getCurrentDate(
        org.harryng.communication.rpc.gen.GetCurrentDateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.harryng.communication.rpc.gen.AuthResponse> loginChat(
        org.harryng.communication.rpc.gen.AuthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.harryng.communication.rpc.gen.AuthResponse> logoutChat(
        org.harryng.communication.rpc.gen.AuthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutChatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_DATE = 0;
  private static final int METHODID_LOGIN_CHAT = 1;
  private static final int METHODID_LOGOUT_CHAT = 2;
  private static final int METHODID_SEND_CHAT_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_DATE:
          serviceImpl.getCurrentDate((org.harryng.communication.rpc.gen.GetCurrentDateRequest) request,
              (io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.GetCurrentDateResponse>) responseObserver);
          break;
        case METHODID_LOGIN_CHAT:
          serviceImpl.loginChat((org.harryng.communication.rpc.gen.AuthRequest) request,
              (io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.AuthResponse>) responseObserver);
          break;
        case METHODID_LOGOUT_CHAT:
          serviceImpl.logoutChat((org.harryng.communication.rpc.gen.AuthRequest) request,
              (io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.AuthResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_CHAT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendChatStream(
              (io.grpc.stub.StreamObserver<org.harryng.communication.rpc.gen.ChatSignal>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentDateMethod())
              .addMethod(getLoginChatMethod())
              .addMethod(getLogoutChatMethod())
              .addMethod(getSendChatStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
