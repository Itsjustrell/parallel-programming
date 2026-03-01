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
