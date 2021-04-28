package utility;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class BaseReadWrite<T> {

    protected static final Gson gson = new Gson();

    protected String location = null;

    protected void writeToFile(T o) throws Exception {
        //Create new file if it doesn't exist yet
        File file = new File(location);
        if (!file.exists()) {
            try {
                File directory = new File(file.getParent());
                if (!directory.exists()) {
                    directory.mkdirs();
                }
                file.createNewFile();
            } catch (Exception e) {
                throw new Exception(e);
            }
        }

        //Write T to file
        try {
            //Get JSON string of T
            String json = gson.toJson(o);

            //Write JSON to file
            FileWriter writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(json);
            bufferWriter.close();
        } catch (IOException e) {
            throw new IOException(e);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    protected String readFromFile() throws Exception {

        if (location == null) {
            throw new IOException("File location must not be null.");
        }

        File file = new File(location);
        if (!file.exists()) throw new IOException("Invalid file location.");
        try {
            return Files.readString(Paths.get(location));
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public abstract void write(T o) throws Exception;

    public abstract T read() throws Exception;
}
