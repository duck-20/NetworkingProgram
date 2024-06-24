import java.net.*;

public class SameIPProgram {
    public static void main(String[] args) {
        try {
            InetAddress site1 = InetAddress.getByName("Animension.net");
            InetAddress site2 = InetAddress.getByName("Animension.to");
            if (site1.equals(site2)) {
                System.out.println("Both Site are same!");
            } else {
                System.out.println("Different Site");
            }
        } catch (UnknownHostException ex) {
            System.out.println("Host lookup failed.");
        }
    }
}
