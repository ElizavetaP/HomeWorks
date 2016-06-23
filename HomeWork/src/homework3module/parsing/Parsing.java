package homework3module.parsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {
    public static void main(String[] args) throws IOException {
        Pattern imagesPattern = Pattern.compile("[А-Я][^.!?]*?\\([Рр]ис. (\\d+)\\).*?[.!?]");
        Matcher matcher = imagesPattern.matcher(getText());

        int expected = 1;
        int pictures = 0;
        int wrong = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            pictures++;
            int current = Integer.parseInt(matcher.group(1));
            if (current < expected) {
                System.out.println("Wrong order, expected " + expected + " but was " + current);
                wrong++;
            }
            expected = current;
            System.out.println();
        }
        System.out.println("Total " + pictures + " and " + wrong + " in wrong order");
    }

    private static String getText() throws IOException {
        return new String(Files.readAllBytes(Paths.get("resources/article.html")), "windows-1251").replaceAll("<.*?>", "");
    }

}
