import java.net.*;
public class URLsCompareProgram {
    public static void main(String[] args) {
        try
        {
            URL first = new URL("https://www.animension.to/");
            URL second = new URL("https://www.animension.com/");
            if (second.equals(first)) {
                System.out.println(second + " is the same as " + first);
            } else {
                System.out.println(second + " is not the same as " + first);
            }
        }
        catch (MalformedURLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
