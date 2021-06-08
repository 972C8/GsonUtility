package utility;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.HashMap;

public class ReadWriteHashMap<K, V> extends BaseReadWrite<HashMap<K, V>> {

    @Override
    public void write(HashMap<K, V> o) throws Exception {
        try {
            writeToFile(o);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public HashMap<K, V> read() throws Exception {
        try {
            String fileContent = readFromFile();
            return gson.fromJson(fileContent, new TypeToken<HashMap<K, V>>() {
            }.getType());
        } catch (IOException io) {
            throw new IOException(io);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
