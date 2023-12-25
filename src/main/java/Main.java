
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input;
        WriteNotes wn = new WriteNotes("Test.txt");
        ReaderNotes rn = new ReaderNotes("Test.txt");

        while (true){
            System.out.println("Введите заметку");
            input = sc.next().toString();
            wn.WriteNote(input);
            rn.ReadNotes();
        }



    }
}
