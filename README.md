# Parallel Computing Task (Java)

This repository is a practice and testing space for trying out **parallel computing concepts** in Java.

It contains simple Java programs that demonstrate basic computing models:

- `Serial`
- `Parallel`
- `SISD` (Single Instruction, Single Data)
- `SIMD` (Single Instruction, Multiple Data)
- `MISD` (Multiple Instruction, Single Data)
- `MIMD` (Multiple Instruction, Multiple Data)

The goal of this task is to compare how data and instructions are processed in each model using small, easy-to-understand examples.

## Project Structure

- `serial/` - Sequential palindrome checking
- `parallel/` - Square calculation using `parallelStream()`
- `SISD/` - One instruction applied to one data item at a time
- `SIMD/` - One instruction applied to multiple data elements
- `MISD/` - Multiple instructions on one temperature input (using threads)
- `MIMD/` - Multiple instructions on different data (using threads)

Each folder is a standalone NetBeans/Ant Java project with its own `src/`, `build.xml`, and `manifest.mf`.

## Requirements

- JDK 8 or higher
- Apache Ant (optional, if you want to run with Ant)
- NetBeans (optional, if you want to open projects in an IDE)

## How to Run

You can run each module independently.

### Option 1: Using NetBeans

1. Open the desired project folder (`serial`, `parallel`, `SISD`, `SIMD`, `MISD`, or `MIMD`) in NetBeans.
2. Run the project.

### Option 2: Using Command Line (javac/java)

From repository root:

```bash
# Serial
javac -d out serial/src/serial/Serial.java
java -cp out serial.Serial

# Parallel
javac -d out parallel/src/parallel/Parallel.java
java -cp out parallel.Parallel

# SISD
javac -d out SISD/src/sisd/SISD.java
java -cp out sisd.SISD

# SIMD
javac -d out SIMD/src/simd/SIMD.java
java -cp out simd.SIMD

# MISD
javac -d out MISD/src/misd/MISD.java
java -cp out misd.MISD

# MIMD
javac -d out MIMD/src/mimd/MIMD.java
java -cp out mimd.MIMD
```

Note:
- `MISD` requires keyboard input (temperature value).
- Output order in thread-based modules (`MISD`, `MIMD`, and `parallel`) may vary because of concurrent execution.

## Short Explanation of Each Module

1. `Serial`:
   Checks whether a text is a palindrome by comparing characters from both ends sequentially.

2. `Parallel`:
   Uses Java `parallelStream()` to square numbers concurrently and prints the thread name for each result.

3. `SISD`:
   Processes an integer array with one loop and one instruction path, item by item.

4. `SIMD`:
   Performs element-wise addition on multiple arrays with the same operation pattern.

5. `MISD`:
   Reads one temperature input, then runs multiple different instructions in separate threads:
   safety check, unit conversion, and status classification.

6. `MIMD`:
   Runs different tasks on different data simultaneously:
   one thread prints text while another computes a numeric total.

## Author

`solthera`
