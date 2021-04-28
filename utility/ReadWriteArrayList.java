package utility;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteArrayList<T> extends BaseReadWrite<ArrayList<T>> {


    @Override
    public void write(ArrayList<T> o) throws Exception {
        try {
            writeToFile(o);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public ArrayList<T> read() throws Exception {
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
