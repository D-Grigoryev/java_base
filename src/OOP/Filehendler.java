package OOP;


import java.io.*;

public class Filehendler implements Writeable {
   private String filename;

    public Filehendler(String filename) {
        this.filename = filename;
    }

    @Override
    public void saveFile(Serializable o) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object loadFile(String filename) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
           return in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
