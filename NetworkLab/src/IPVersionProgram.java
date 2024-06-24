import java.net.*;

public class IPVersionProgram {
    public static  void main(String[] args){
        try {
            InetAddress ia = InetAddress.getByName("192.168.11.73");

            byte[] address = ia.getAddress();

            if(address.length==4)
                System.out.println(ia + " is IPv4.");
            else if(address.length==16)
                System.out.println(ia + " is IPv6.");
        } catch (UnknownHostException ex) {
            System.out.println("Invalid IP!");
        }
    }
}
