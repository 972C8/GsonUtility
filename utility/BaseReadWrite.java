package utility;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class BaseReadWrite {

    protected static final Gson gson = new Gson();

    protected String location = null;

    protected void writeToFile() {
    }

    protected String readFromFile() throws Exception {

        if (location == null) {
            throw new IOException("File location must not be null.");
        }

        File file = new File(location);
        if (!file.exists()) throw new IOException("Invalid file location.");
        try {
            String fileContent = Files.readString(Paths.get(location));
            return fileContent;
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

    public abstract void write(Object o);

    public abstract <T> Object read() throws Exception;
}
