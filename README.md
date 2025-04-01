# MultiThreadedApplication

**Educational project on multithreading in Java**

## Table of contents
1. [Description](#description)
2. [Tehnologies](#technologies)
3. [Installation and Launch](#installation-and-launch)
4. [Author](#author)
5. [License](#license)
6. [Usage Examples](#usage-examples)

## Description

This project was created to learn the basics of multithreading in Java. It implements the fundamental concepts of threading and parallel computing.

### Concepts:
- Creation and management of threads(Threads, Runnable)
- Processing of parallel tasks

## Technologies

- **Java 17**
- **Threads** (Threads, Runnable)

## Installation and Launch

1. Clone the repository:
    ```bash
    git clone https://github.com/YuliyaZimenina/MultiThreadedApplication.git
    cd MultiThreadedApplication
    ```
2. Open the project in your favorite IDE (IntelliJ IDEA, Eclipse, etc.).
3. Run the main class (for example, `Main.java `).

## Author

[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## License

This project is distributed under the MIT license.

## Usage Examples

Code example showing the use of multithreading in a project:

```java
package multi_thread;

public class MoreTreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // Create and start a threads
        MyThread myThread1 = MyThread.createAndStart("Child #1");
        MyThread myThread2 = MyThread.createAndStart("Child #2");
        MyThread myThread3 = MyThread.createAndStart("Child #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException exception){
                System.out.println("Main thread was interrupted");
            }
        }while (myThread1.thread.isAlive()||
        myThread2.thread.isAlive() ||
        myThread3.thread.isAlive());
        System.out.println("Main thread ending");
    }
}
