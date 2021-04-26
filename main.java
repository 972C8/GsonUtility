import readWrite.ReadWriteArrayList;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws Exception {
        ReadWriteArrayList o = new ReadWriteArrayList();

        String location = System.getProperty("user.dir") + "/test.json";
        o.setLocation(location);

        ArrayList<Object> object = o.read();

        System.out.println(object);
    }
}
