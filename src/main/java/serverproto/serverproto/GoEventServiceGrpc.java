package serverproto.serverproto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Go为服务端 事件服务器与客户端和链交互
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: eventServer.proto")
public final class GoEventServiceGrpc {

  private GoEventServiceGrpc() {}

  public static final String SERVICE_NAME = "server.GoEventService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ClientRegisterAddressReq,
          ClientRegisterAddressRes> METHOD_GO_CLIENT_REGIST_EVENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "server.GoEventService", "GoClientRegistEvent"),
          io.grpc.protobuf.ProtoUtils.marshaller(ClientRegisterAddressReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ClientRegisterAddressRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ClientTransactionReq,
          ClientTransactionRes> METHOD_GO_CLIENT_REQUEST_EVENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "server.GoEventService", "GoClientRequestEvent"),
          io.grpc.protobuf.ProtoUtils.marshaller(ClientTransactionReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ClientTransactionRes.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ChainTranscationReq,
          ChainTranscationRes> METHOD_GO_CHAIN_REQUEST_EVENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "server.GoEventService", "GoChainRequestEvent"),
          io.grpc.protobuf.ProtoUtils.marshaller(ChainTranscationReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ChainTranscationRes.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GoEventServiceStub newStub(io.grpc.Channel channel) {
    return new GoEventServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GoEventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GoEventServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GoEventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GoEventServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Go为服务端 事件服务器与客户端和链交互
   * </pre>
   */
  public static abstract class GoEventServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void goClientRegistEvent(ClientRegisterAddressReq request,
        io.grpc.stub.StreamObserver<ClientRegisterAddressRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GO_CLIENT_REGIST_EVENT, responseObserver);
    }

    /**
     */
    public void goClientRequestEvent(ClientTransactionReq request,
        io.grpc.stub.StreamObserver<ClientTransactionRes> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GO_CLIENT_REQUEST_EVENT, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ChainTranscationReq> goChainRequestEvent(
        io.grpc.stub.StreamObserver<ChainTranscationRes> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GO_CHAIN_REQUEST_EVENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GO_CLIENT_REGIST_EVENT,
            asyncUnaryCall(
              new MethodHandlers<
                      ClientRegisterAddressReq,
                      ClientRegisterAddressRes>(
                  this, METHODID_GO_CLIENT_REGIST_EVENT)))
          .addMethod(
            METHOD_GO_CLIENT_REQUEST_EVENT,
            asyncUnaryCall(
              new MethodHandlers<
                      ClientTransactionReq,
                      ClientTransactionRes>(
                  this, METHODID_GO_CLIENT_REQUEST_EVENT)))
          .addMethod(
            METHOD_GO_CHAIN_REQUEST_EVENT,
            asyncBidiStreamingCall(
              new MethodHandlers<
                      ChainTranscationReq,
                      ChainTranscationRes>(
                  this, METHODID_GO_CHAIN_REQUEST_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Go为服务端 事件服务器与客户端和链交互
   * </pre>
   */
  public static final class GoEventServiceStub extends io.grpc.stub.AbstractStub<GoEventServiceStub> {
    private GoEventServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoEventServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoEventServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoEventServiceStub(channel, callOptions);
    }

    /**
     */
    public void goClientRegistEvent(ClientRegisterAddressReq request,
        io.grpc.stub.StreamObserver<ClientRegisterAddressRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GO_CLIENT_REGIST_EVENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void goClientRequestEvent(ClientTransactionReq request,
        io.grpc.stub.StreamObserver<ClientTransactionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GO_CLIENT_REQUEST_EVENT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ChainTranscationReq> goChainRequestEvent(
        io.grpc.stub.StreamObserver<ChainTranscationRes> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_GO_CHAIN_REQUEST_EVENT, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Go为服务端 事件服务器与客户端和链交互
   * </pre>
   */
  public static final class GoEventServiceBlockingStub extends io.grpc.stub.AbstractStub<GoEventServiceBlockingStub> {
    private GoEventServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoEventServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoEventServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoEventServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ClientRegisterAddressRes goClientRegistEvent(ClientRegisterAddressReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GO_CLIENT_REGIST_EVENT, getCallOptions(), request);
    }

    /**
     */
    public ClientTransactionRes goClientRequestEvent(ClientTransactionReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GO_CLIENT_REQUEST_EVENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Go为服务端 事件服务器与客户端和链交互
   * </pre>
   */
  public static final class GoEventServiceFutureStub extends io.grpc.stub.AbstractStub<GoEventServiceFutureStub> {
    private GoEventServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GoEventServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GoEventServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GoEventServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ClientRegisterAddressRes> goClientRegistEvent(
        ClientRegisterAddressReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GO_CLIENT_REGIST_EVENT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ClientTransactionRes> goClientRequestEvent(
        ClientTransactionReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GO_CLIENT_REQUEST_EVENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GO_CLIENT_REGIST_EVENT = 0;
  private static final int METHODID_GO_CLIENT_REQUEST_EVENT = 1;
  private static final int METHODID_GO_CHAIN_REQUEST_EVENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GoEventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GoEventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GO_CLIENT_REGIST_EVENT:
          serviceImpl.goClientRegistEvent((ClientRegisterAddressReq) request,
              (io.grpc.stub.StreamObserver<ClientRegisterAddressRes>) responseObserver);
          break;
        case METHODID_GO_CLIENT_REQUEST_EVENT:
          serviceImpl.goClientRequestEvent((ClientTransactionReq) request,
              (io.grpc.stub.StreamObserver<ClientTransactionRes>) responseObserver);
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
        case METHODID_GO_CHAIN_REQUEST_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.goChainRequestEvent(
              (io.grpc.stub.StreamObserver<ChainTranscationRes>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class GoEventServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return JavaTranscationServerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GoEventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GoEventServiceDescriptorSupplier())
              .addMethod(METHOD_GO_CLIENT_REGIST_EVENT)
              .addMethod(METHOD_GO_CLIENT_REQUEST_EVENT)
              .addMethod(METHOD_GO_CHAIN_REQUEST_EVENT)
              .build();
        }
      }
    }
    return result;
  }
}
