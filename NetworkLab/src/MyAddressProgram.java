import java.net.*;

public class MyAddressProgram {
    public static void main(String[] args){
        try {
            InetAddress me = InetAddress.getLocalHost();
            String dottedQuad = me.getHostAddress();
            System.out.println("My address: " + dottedQuad);
        } catch (UnknownHostException ex) {
            System.out.println("Myan! I got no address");
        }
    }
}
