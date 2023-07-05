package lesson_2;
import java.io.*;
public class task_1 {
    public static void main(String[] args) {
    try(FileInputStream f = new FileInputStream("note.txt"); FileOutputStream log = new FileOutputStream("note_new.txt")){
        byte [] buffer = new byte[256];
        int i;
        while ((i = f.read(buffer)) != -1){
            //System.out.print((char)i); //вывод посимовльно в консоль
            //log.write(buffer, 0, i); //запись прочитанных данных в новый файл
        }
        System.out.println((char) buffer[5]);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
