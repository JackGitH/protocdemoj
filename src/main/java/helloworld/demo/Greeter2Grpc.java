package helloworld.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: helloworld.proto")
public final class Greeter2Grpc {

  private Greeter2Grpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<HelloRequest,
          HelloReply> METHOD_CHANGE_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "helloworld.Greeter2", "ChangeSayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(HelloReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Greeter2Stub newStub(io.grpc.Channel channel) {
    return new Greeter2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Greeter2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Greeter2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static Greeter2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Greeter2FutureStub(channel);
  }

  /**
   */
  public static abstract class Greeter2ImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<HelloRequest> changeSayHello(
        io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_CHANGE_SAY_HELLO, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CHANGE_SAY_HELLO,
            asyncBidiStreamingCall(
              new MethodHandlers<
                      HelloRequest,
                      HelloReply>(
                  this, METHODID_CHANGE_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class Greeter2Stub extends io.grpc.stub.AbstractStub<Greeter2Stub> {
    private Greeter2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Greeter2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected Greeter2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Greeter2Stub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<HelloRequest> changeSayHello(
        io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_CHANGE_SAY_HELLO, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Greeter2BlockingStub extends io.grpc.stub.AbstractStub<Greeter2BlockingStub> {
    private Greeter2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Greeter2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected Greeter2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Greeter2BlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class Greeter2FutureStub extends io.grpc.stub.AbstractStub<Greeter2FutureStub> {
    private Greeter2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Greeter2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected Greeter2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Greeter2FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHANGE_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Greeter2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Greeter2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHANGE_SAY_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.changeSayHello(
              (io.grpc.stub.StreamObserver<HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class Greeter2DescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HelloWorldProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Greeter2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Greeter2DescriptorSupplier())
              .addMethod(METHOD_CHANGE_SAY_HELLO)
              .build();
        }
      }
    }
    return result;
  }
}
