## 3.a)
``` java
try {
            System.out.print("A");  // print A
            int num = 99 / 0;       // ArithmeticException with no catch
            System.out.print("B");
        } finally {
            System.out.print("C"); // print C
        }
      // Exception is thrown
        System.out.print("D");
```
### Output:
``` 
ACException in thread "main" java.lang.ArithmeticException: / by zero
```

## 3.b)
``` java
        try {
            System.out.print("A"); // A
            throw new Exception(); // go to catch
        } catch (Exception e) {
            System.out.print("B"); // B
        } finally {
            System.out.print("C");  // C
            int num = 7 / 0;        // throw ArithmeticException
            System.out.print("D");
            System.out.print("E");

        }
```
### Output:
```
ABCException in thread "main" java.lang.ArithmeticException: / by zero
```

## 3.c)
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/ddd1b0b8-2fec-4957-8169-657d0f0cdbc4)
### Output:
```
aaaabbbb
```

