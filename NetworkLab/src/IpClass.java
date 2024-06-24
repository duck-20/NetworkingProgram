import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpClass {
    public static void main(String[] args){
        try{
            InetAddress ipAddress=InetAddress.getByName("142.250.194.196");
            System.out.println(ipAddress.getCanonicalHostName());
        }
        catch (UnknownHostException e){
            System.out.println("Invalid IP Address!");
        }
    }
}
