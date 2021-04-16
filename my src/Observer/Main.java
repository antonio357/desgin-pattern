package Observer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        java.lang.String input, email, messageTextContent;
        Pattern pattern; Matcher matcher;

        while (true) {
            input = read.nextLine();

            // getting email
            pattern = Pattern.compile("\\s*\\S+@\\S+\\s*");
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                email = matcher.group(0);
                email = email.strip();
                System.out.println(email);
            }
            else {
                System.out.println("missing email, try again");
                continue;
            }

            if (input.contains("add")) {}
            else if (input.contains("del")) {}
            else {
                // getting messageTextContent
                pattern = Pattern.compile("\".*\"");
                matcher = pattern.matcher(input);
                if (matcher.find()) {
                    messageTextContent = matcher.group(0);
                    messageTextContent = messageTextContent.strip();
                    StringBuilder stringBuilder = new StringBuilder(messageTextContent);
                    stringBuilder.deleteCharAt(messageTextContent.length() - 1);
                    stringBuilder.deleteCharAt(0);
                    messageTextContent = stringBuilder.toString();
                    System.out.println(messageTextContent);

                    // posting
                    Message message = new Message(email, messageTextContent);
                }
                else {
                    System.out.println("missing messageTextContent, try again");
                    continue;
                }
            }
        }
    }
}

