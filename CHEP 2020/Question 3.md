## 3.a) 
In the following code segment, print method is a generic method. Write two different suitable method headers for
method print that can be written in line 8. 
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

## 3.b)
What does the following statement do? Why do we need Thread pools? 
``` java
ExecutorService executor = Executors.newCachedThreadPool();
```
- Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. 
- Starting a new thread for each task could limit throughput and cause
poor performance. A thread pool is ideal to manage the number of
tasks executing concurrently

## 3.c) What is the difference between concurrent programming and procedural programming? 
| Procedural programming | Concurrent programming |
| ---------------------- | ---------------------- |
| focuses on defining a sequence of instructions to be executed in order to solve a problem. In procedural programming, the program is divided into smaller procedures or functions, and these procedures are executed one after another in a linear fashion| focuses on executing multiple tasks or processes simultaneously. It deals with situations where several independent tasks need to be performed concurrently or in parallel. The goal is to achieve efficient utilization of system resources and improve performance by executing tasks concurrently.   |




