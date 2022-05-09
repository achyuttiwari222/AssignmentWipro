
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ans2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader userInput = new BufferedReader(inStream);
        String inputValues;

        System.out.println(" enter thr string");


        while ((inputValues = userInput.readLine()) != null
                && inputValues.indexOf('.') == -1) {
            int length = inputValues.length();
            for (int i = 0; i < length; i++) {
                char charCounter = inputValues.charAt(i);
                 if (Character.isLowerCase(charCounter)) {
                    System.out.println(Character.toUpperCase(charCounter));
                }
            }
        }
    }
}