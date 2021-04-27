package utility;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteArrayList extends BaseReadWrite {

    @Override
    public void write(Object o) throws Exception {

        //TODO: Remove and check through parameter type declaration
        if (!(o instanceof ArrayList)) {
            throw new Exception("Object must be of type ArrayList");
        }

        try {
            writeToFile(o);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public <T> ArrayList<T> read() throws Exception {
        try {
            String fileContent = readFromFile();
            return gson.fromJson(fileContent, new TypeToken<ArrayList<T>>() {
            }.getType());
        } catch (IOException io) {
            throw new IOException(io);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
