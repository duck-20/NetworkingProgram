
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DomainClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter URL:");
        String url=sc.next();
        try{
        InetAddress address=InetAddress.getByName(url);
        System.out.println(address);
        }
        catch (UnknownHostException e){
            System.out.println("Invalid "+url);
        }
    }
}
