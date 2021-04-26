package readWrite;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteArrayList extends BaseReadWrite {

    @Override
    public void write(Object o) {

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
