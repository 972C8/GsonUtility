package tests;

import utility.ReadWriteArrayList;

import java.util.ArrayList;

class ReadWriteArrayListTest {

    private ReadWriteArrayList<TestClass> readWriteObject;
    private String location;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        readWriteObject = new ReadWriteArrayList<TestClass>();
        location = System.getProperty("user.dir") + "/tests/test.json";
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void write() throws Exception {
        readWriteObject.setLocation(location);
        ArrayList<TestClass> testObject = new ArrayList<>();
        testObject.add(new TestClass(1, "john"));
        testObject.add(new TestClass(2, "doe"));

        readWriteObject.write(testObject);
    }

    @org.junit.jupiter.api.Test
    void read() throws Exception {
        readWriteObject.setLocation(location);
        ArrayList<TestClass> testObject = readWriteObject.read();

        System.out.println(testObject);
    }
}