import java.io.*;
import java.net.*;
public class URLEncodeProgram {
    public static void main(String[] args)
    {
        try
        {
        System.out.println(URLEncoder.encode("Yo string ma spaces xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo*string*ma*asterisks*xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo%string%ma%percent%signs%xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo+string+ma+pluses%xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo/string/ma/slashes/xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo\"string\"ma\"quote\"marks\"xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo:string:ma:colons:xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo~string~ma~tildes~xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo(string)ma(parentheses)xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo.string.ma.periods.xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo=string=ma=equals=signs=xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yo&string&ma&ampersands&xa","UTF-8"));
        System.out.println(URLEncoder.encode("Yoéstringémaé non-ASCII characters xa","UTF-8"));
    }
        catch (UnsupportedEncodingException ex)
        {
            System.out.println("Broken VM does not support UTF-8");
        }
    }
}