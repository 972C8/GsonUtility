package tests;

import utility.ReadWriteArrayList;
import java.util.ArrayList;

class ReadWriteArrayListTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void write() {
    }

    @org.junit.jupiter.api.Test
    void read() throws Exception {
        ReadWriteArrayList obj = new ReadWriteArrayList();

        String location = System.getProperty("user.dir") + "/test.json";
        obj.setLocation(location);

        ArrayList<Object> object = obj.read();
        System.out.println(object);
    }
}