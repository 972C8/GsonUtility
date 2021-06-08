package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utility.ReadWriteHashMap;

import java.util.HashMap;

class ReadWriteHashMapTest {

    //HashMap<Key, Value> specified as <Integer, TestClass>. Can be changed to required type parameter
    private ReadWriteHashMap<Integer, TestClass> readWriteObject;
    private String location;

    @BeforeEach
    void setUp() {
        readWriteObject = new ReadWriteHashMap<>();
        location = System.getProperty("user.dir") + "/tests/hashmap.json";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws Exception {
        readWriteObject.setLocation(location);
        HashMap<Integer, TestClass> testObject = new HashMap<>();
        testObject.put(1, new TestClass(1, "john"));
        testObject.put(2, new TestClass(2, "doe"));

        readWriteObject.write(testObject);
    }

    @Test
    void read() throws Exception {
        readWriteObject.setLocation(location);
        HashMap<Integer, TestClass> testObject = readWriteObject.read();

        System.out.println("Read result: " + testObject);
    }
}