## 3.a)
``` java
public void readFile(String filename) {
        File file = new File(filename);
        try {
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
```

## 3.b)
### first method
``` java
public static void print(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].toString());
        }
    }
```
### second method
``` java
public static <T> void print(T[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].toString());
        }
    }
```

## 3.c)
![image](https://github.com/AhmedBakrXI/-java-exams/assets/114930002/eea6f9b2-6e90-4dd9-a687-f1cabeb8fd53)
### Output:
``` 
aaaabbbb
```
