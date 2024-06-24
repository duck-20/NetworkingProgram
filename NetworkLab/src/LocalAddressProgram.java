import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalAddressProgram {
    public static void main(String[] args){
        try{
            InetAddress localIp=InetAddress.getLocalHost();
            System.out.println(localIp);
        }
        catch (UnknownHostException e){
            System.out.println("Man!! I got no address.");
        }
    }
}
//
//            System.out.println(localIp.getHostName());
//        System.out.println(localIp.getCanonicalHostName());
//        System.out.println(localIp.getHostAddress());