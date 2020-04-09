import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumToText {
    public static String a;
    public static String s;
    public static void main(final String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C://Users//GOUST//IdeaProjects//PrInj4//src//Text.txt"))) {
            // чтение построчно
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (final IOException ex) {
            System.out.println(ex.getMessage());
        }
            a = "111 000 фиолетовых оленей";
            s = a;
        System.out.println(a);
    }
}
