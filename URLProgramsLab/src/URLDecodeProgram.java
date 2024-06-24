import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
public class URLDecodeProgram {
    public static void main(String[] args) {
        try {
            String input = "https://www.google.com/search?q=Total+war+hammer&oq=Total+war+hamme";
            String query = input.substring(input.indexOf('?') + 1);
            String decodedQuery = URLDecoder.decode(query, "UTF-8");
            String output = input.substring(0, input.indexOf('?') + 1) + decodedQuery;
            System.out.println("Original URL: " + input);
            System.out.println("Decoded URL: " + output);

        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
        }
    }
}