package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        String pattern = "Hi {0}, anda bisa mencari data anda dengan mengetikkan \"{0}\" di pencarian.";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[] {
                "Dede"
        });
        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);
        var pattern = resourceBundle.getString("welcome.message");
        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[] {
                "Dede", "Programmer Zaman Now"
        });
        System.out.println(format);
    }
}
