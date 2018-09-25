package serverproto.serverproto;

import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * java为服务端 与事件服务器交互
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: eventServer.proto")
public final class JavaEventServiceGrpc {

  private JavaEventServiceGrpc() {}

  public static final String SERVICE_NAME = "server.JavaEventService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ClientTransactionJavaReq,
          ClientTransactionJavaRes> METHOD_JAVA_CLIENT_REQUEST_EVENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "server.JavaEventService", "JavaClientRequestEvent"),
          io.grpc.protobuf.ProtoUtils.marshaller(ClientTransactionJavaReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ClientTransactionJavaRes.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JavaEventServiceStub newStub(io.grpc.Channel channel) {
    return new JavaEventServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JavaEventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JavaEventServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JavaEventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JavaEventServiceFutureStub(channel);
  }

  /**
   * <pre>
   * java为服务端 与事件服务器交互
   * </pre>
   */
  public static abstract class JavaEventServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ClientTransactionJavaReq> javaClientRequestEvent(
        io.grpc.stub.StreamObserver<ClientTransactionJavaRes> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_JAVA_CLIENT_REQUEST_EVENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_JAVA_CLIENT_REQUEST_EVENT,
            asyncBidiStreamingCall(
              new MethodHandlers<
                      ClientTransactionJavaReq,
                      ClientTransactionJavaRes>(
                  this, METHODID_JAVA_CLIENT_REQUEST_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * java为服务端 与事件服务器交互
   * </pre>
   */
  public static final class JavaEventServiceStub extends io.grpc.stub.AbstractStub<JavaEventServiceStub> {
    private JavaEventServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JavaEventServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaEventServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JavaEventServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ClientTransactionJavaReq> javaClientRequestEvent(
        io.grpc.stub.StreamObserver<ClientTransactionJavaRes> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_JAVA_CLIENT_REQUEST_EVENT, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * java为服务端 与事件服务器交互
   * </pre>
   */
  public static final class JavaEventServiceBlockingStub extends io.grpc.stub.AbstractStub<JavaEventServiceBlockingStub> {
    private JavaEventServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JavaEventServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaEventServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JavaEventServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * java为服务端 与事件服务器交互
   * </pre>
   */
  public static final class JavaEventServiceFutureStub extends io.grpc.stub.AbstractStub<JavaEventServiceFutureStub> {
    private JavaEventServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JavaEventServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaEventServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JavaEventServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_JAVA_CLIENT_REQUEST_EVENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JavaEventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JavaEventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JAVA_CLIENT_REQUEST_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.javaClientRequestEvent(
              (io.grpc.stub.StreamObserver<ClientTransactionJavaRes>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class JavaEventServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return JavaTranscationServerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JavaEventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JavaEventServiceDescriptorSupplier())
              .addMethod(METHOD_JAVA_CLIENT_REQUEST_EVENT)
              .build();
        }
      }
    }
    return result;
  }
}
