import java.io.*;
import java.util.Date;

/**
 * Класс для описания процесса записи в файл
 */
public class WriteNotes {
    String notesName;

    public WriteNotes(String notesName) {
        this.notesName = notesName;
    }

    /**
     * Метод для записи в файл
     * @param input Принимает строку, которую нужно записать
     */
    public void WriteNote (String input){
        Date date = new Date();
        try (FileWriter fw = new FileWriter(notesName.toString(),true)) {
            fw.append( date + "->" + input + "\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}