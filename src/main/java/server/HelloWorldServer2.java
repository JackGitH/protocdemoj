package server;
import helloworld.demo.Greeter2Grpc;
import helloworld.demo.GreeterGrpc;
import helloworld.demo.HelloReply;
import helloworld.demo.HelloRequest;
import io.grpc.Server;
import java.io.IOException;
import io.grpc.ServerBuilder;
import io.grpc.BindableService;
import io.grpc.stub.StreamObserver;
import io.netty.util.internal.logging.Log4J2LoggerFactory;

public class HelloWorldServer2 {
    private int port = 8851;
    private Server server;

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService((BindableService) new GreeterChangeHelloWorldImpl())
                .build()
                .start();

        System.out.println("service start...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {

                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloWorldServer2.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    private void blockUntilShutdown() throws InterruptedException,IOException{
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        final HelloWorldServer2 server = new HelloWorldServer2();
        server.start();

        server.blockUntilShutdown();
    }


    private class  GreeterChangeHelloWorldImpl extends Greeter2Grpc.Greeter2ImplBase{
        @Override
        public StreamObserver<HelloRequest> changeSayHello(final StreamObserver<HelloReply> responseObserver) {
            return new StreamObserver<HelloRequest>() {
                @Override
                public void onNext(HelloRequest helloRequest) {
                    HelloReply reply = HelloReply.newBuilder().setMessage(("HelloHashReceive: " + helloRequest.getName())).build();
                    responseObserver.onNext(reply);
                }

                @Override
                public void onError(Throwable throwable) {
                    //log.warn("调用出错:{}",throwable.getMessage());
                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };

        }
    }
}
