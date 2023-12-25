import java.io.BufferedReader;

import java.io.FileReader;


/**
 * Класс для описания процесса чтения файла
 */
public class ReaderNotes {
    String notesName;

    public ReaderNotes(String notesName) {
        this.notesName = notesName;
    }

    /**
     * Метод для чтения и вывода содержимого файла
     * @throws Exception
     */
    public void ReadNotes () throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(notesName));
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }

}
