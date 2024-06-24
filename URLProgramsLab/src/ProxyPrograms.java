import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.*;

public class ProxyPrograms {
    public static  void main(String[] args){
        java.net.ProxySelector.setDefault(new LocalProxySelector());
        try {
            URL url=new URL("https://www.youtube.com");
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.connect();
            System.out.println("HTTP Request Succeeded: "+connection.getResponseCode());
        }catch(IOException e){
            System.out.println("HTTP Request Failed!");
        }
        try {
            URL url=new URL("https://www.facebook.com");
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.connect();
            System.out.println("HTTP Request Succeeded: "+connection.getResponseCode());
        }catch(IOException e){
            System.out.println("HTTP Request Failed!");
        }
        try {
            URL url=new URL("https://www.instagram.com");
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.connect();
            System.out.println("HTTP Request Succeeded: "+connection.getResponseCode());
        }catch(IOException e){
            System.out.println("HTTP Request Failed!");
        }
        try {
            URL url=new URL("https://www.asdasd.com");
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.connect();
            System.out.println("HTTP Request Succeeded: "+connection.getResponseCode());
        }catch(IOException e){
            System.out.println("HTTP Request Failed!");
        }
    }
}
