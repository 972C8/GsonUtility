package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utility.ReadWriteObject;

class ReadWriteObjectTest {

    private ReadWriteObject<TestClass> readWriteObject;
    private String location;

    @BeforeEach
    void setUp() {
        readWriteObject = new ReadWriteObject<>();
        location = System.getProperty("user.dir") + "/tests/object.json";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void write() throws Exception {
        readWriteObject.setLocation(location);
        TestClass testObject = new TestClass(1, "john");

        readWriteObject.write(testObject);
    }

    @Test
    void read() throws Exception {
        readWriteObject.setLocation(location);

        TestClass testObject = readWriteObject.read();

        System.out.println("Read result: " + testObject);
    }
}