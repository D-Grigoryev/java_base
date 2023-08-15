package OOP.model.Filehendler;

import java.io.Serializable;

public interface Writeable{
    void saveFile(Serializable o);
    Object loadFile(String f);
}
