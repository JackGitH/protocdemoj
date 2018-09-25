package client;
import serverproto.serverproto.GoEventServiceGrpc;;
import serverproto.serverproto.ClientRegisterAddressReq;
import serverproto.serverproto.ClientRegisterAddressRes;
import helloworld.demo.GreeterGrpc;
import helloworld.demo.HelloReply;
import helloworld.demo.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class EventServerClient {

    private final ManagedChannel channel;
    private final GoEventServiceGrpc.GoEventServiceBlockingStub blockingStub;


    public EventServerClient(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();

        blockingStub = GoEventServiceGrpc.newBlockingStub(channel);
    }


    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public  void GoClientRegistEvent(String ip, String port){
        ClientRegisterAddressReq request = ClientRegisterAddressReq.newBuilder().setAddRessIpReq(ip).setAddRessPortReq(port).setRemarkReq("备注").build();

        ClientRegisterAddressRes response = blockingStub.goClientRegistEvent(request);
        System.out.print("isSuccess:"+response.getIsSuccess()+"--"+"id:"+response.getMessageIDRes()+"--"+"message:"+response.getMessageRes());

    }

    public static void main(String[] args) throws InterruptedException {
        EventServerClient client = new EventServerClient("127.0.0.1", 8852);

            client.GoClientRegistEvent("10.10.144.29","6666");

        client.shutdown();
    }
}
