package utility;

import com.google.gson.reflect.TypeToken;
import tests.TestClass;

import java.io.IOException;

public class ReadWriteObject<T> extends BaseReadWrite<T> {

    @Override
    public void write(T o) throws Exception {
        try {
            writeToFile(o);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public T read() throws Exception {
        try {
            String fileContent = readFromFile();

            //Generic "new TypeToken<T>" is not possible. Therefore "new TypeToken<TestClass>" was used to provide an example.
            //For concrete implementation: Provide the class type that the json should be parsed to
            return gson.fromJson(fileContent, new TypeToken<TestClass>() {
            }.getType());
        } catch (IOException io) {
            throw new IOException(io);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
