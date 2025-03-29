# MultiThreadedApplication

**Educational project on multithreading in Java**

## Table of contents
1. [Description](#description)
2. [Tehnologies](#technologies)
3. [Installation and Launch](#installation-and-launch)
4. [Author](#author)
5. [License](#license)
6. [Contribution](#contribution)
7. [Usage Examples](#usage-examples)

## Description

This project was created to learn the basics of multithreading in Java. It implements the fundamental concepts of threading, synchronization, and parallel computing.

### Concepts:
- Creation and management of threads(Threads, Runnable)
- Synchronization of threads (synchronized)
- Processing of parallel tasks

## Technologies

- **Java 17**
- **Threads** (Threads, Runnable)
- **Synchronization** (synchronized)

## Installation and Launch

1. Clone the repository:
    ```bash
    git clone https://github.com/YuliyaZimenina/MultiThreadedApplication.git
    cd MultiThreadedApplication
    ```
2. Open the project in your favorite IDE (IntelliJ IDEA, Eclipse and etc.).
3. Run the main class (for example, `Main.java `).

## Author

[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## License

This project is distributed under the MIT license.

## Contribution

If you want to contribute to the project, create a fork of the repository, make changes, and send a pull request. All suggestions are welcome!

## Usage Examples

Code example showing the use of multithreading in a project:

```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableTask());
        thread.start();
    }
}
