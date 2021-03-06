# Gson Utility

GsonUtility is a Java library providing a generic implementation of https://github.com/google/gson to convert Java Objects into JSON or JSON strings to an equivalent Java Object.

This generic implementation already works out-of-the-box. You only need to specify your desired object type. Check example classes in utility to get a quick start.

### Goal
* Provide a generic abstract class to handle conversion for you
* Provide subclasses for different object types to simplify conversion with a `write()` and `read()` method
* Custom subclasses can be extended from the abstract base class to support custom objects

### Working examples included for:
* ArrayList\<T>
* HashMap<K,V>
* Object

### Example

Read JSON and convert to ArrayList:
```
ReadWriteArrayList<TestClass> readWriteObject = new ReadWriteArrayList<>();
readWriteObject.setLocation(System.getProperty("user.dir") + "/tests/arraylist.json");

ArrayList<TestClass> testObject = readWriteObject.read();
System.out.println(testObject);
```

Write ArrayList to JSON:
```
ReadWriteArrayList<TestClass> readWriteObject = new ReadWriteArrayList<>();
readWriteObject.setLocation(System.getProperty("user.dir") + "/tests/arraylist.json");

ArrayList<TestClass> testObject = new ArrayList<>();
testObject.add(new TestClass(1, "john"));
testObject.add(new TestClass(2, "doe"));

readWriteObject.write(testObject);
```

### Contributing

Implemented another object type? Feel free to contribute it.

### License
GsonUtility is released under the MIT license.
```
MIT License

Copyright (c) 2021 972C8

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```