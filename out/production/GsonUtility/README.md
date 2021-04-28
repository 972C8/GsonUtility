# Gson Utility

GsonUtility is a Java library providing a generic implementation of https://github.com/google/gson to convert Java Objects into JSON or JSON strings to an equivalent Java object.

### Goal
* Provide a generic abstract class to handle conversion for you
* Provide subclasses for different object types to simplify conversion with a `write()` and `read()` method
* Custom subclasses can be extended from the abstract class to support custom objects

### Example

Read JSON and convert to ArrayList:
```
ReadWriteArrayList reader = new ReadWriteArrayList();
reader.setLocation(System.getProperty("user.dir") + "/example.json");

ArrayList<Object> object = reader.read();
System.out.println(object);
```

### License
_TODO_

### Contributing

Feel free to contribute!