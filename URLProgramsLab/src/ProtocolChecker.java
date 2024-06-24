import java.net.*;
public class ProtocolChecker {
    public static void main(String[] args) {
        testProtocol("http://www.Whatsapp.com");
         testProtocol("https://www.DrDuck.com");
        testProtocol("ftp://ImageUploader.to");
        testProtocol("mailto:Pakhrinayush56@gmail.com");
        testProtocol("telnet://ARStore.to");
        testProtocol("file:///BlahBlah/UserData");
        testProtocol("gopher://gopher.anc.org.za/");
        testProtocol("ldap://TU.com");
        testProtocol("jar:http://LavieGarden.com");
        testProtocol("nfs://utopia.poly.edu/usr/tmp/");
        testProtocol("jdbc:mysql://Amazon.com:5000/Products");
        testProtocol("rmi://ibiblio.org/RenderEngine");
        testProtocol("doc:/UsersGuide/release.html");
        testProtocol("netdoc:/UsersGuide/release.html");
        testProtocol("systemresource://www.youtube.com/index.html");
        testProtocol("verbatim:http://www.Facebook.com/");

    }
    private static void testProtocol(String url) {
        try {
                URL u = new URL(url);
                System.out.println(u.getProtocol() + " is supported");
            } catch (MalformedURLException ex) {
                String protocol = url.substring(0, url.indexOf(':')); System.out.println(protocol + " is not supported");
            }
            }

}
