# Multithreaded Java Web Server

This project demonstrates the implementation and performance comparison of three types of web servers built in Java:  
1. **Single-threaded Web Server**  
2. **Multithreaded Web Server**  
3. **Multithreaded Web Server with Thread Pool (Pool Size: 100)**  

By simulating **1 million requests** using jmeter, we evaluate the throughput and response times of each server type, highlighting the performance benefits of multithreading and thread pooling.

---

## Overview
A web server processes client requests and responds with the requested resources. This project explores various implementations to demonstrate the trade-offs between simplicity, performance, and resource efficiency.  

The servers were evaluated under heavy load using simulated requests to measure their **throughput**, **latency**, and **CPU/memory usage**.

---

## Concepts

### Single-threaded Web Server
The **single-threaded server** processes one request at a time. This design is simple but leads to significant bottlenecks when handling multiple simultaneous connections.  

- **Pros**: Easy to implement and debug.  
- **Cons**: Poor scalability and high latency under load.  

---

### Multithreaded Web Server
The **multithreaded server** creates a new thread for each incoming request, allowing concurrent processing.  

- **Pros**: Handles multiple requests simultaneously, improving performance under load.  
- **Cons**: High resource consumption due to thread creation overhead.  

---

### Multithreaded Web Server with Thread Pool
The **thread-pooled server** uses a fixed pool of threads (size: 100) to manage requests. Threads are reused for new connections, reducing the overhead of thread creation and destruction.  

- **Pros**: Efficient resource utilization and consistent performance.  
- **Cons**: Slightly more complex implementation.  

---

## Implementation Details
- **Language**: Java  
- **Libraries**: `java.net` for sockets, `ExecutorService` for thread pooling.  
- **Simulated Requests**: Apache JMeter was used to generate 1 million requests for benchmarking.  

---

<!-- ## Performance Comparison
Below is the throughput comparison of the three implementations:  

| Server Type                         | Throughput (req/sec) | Avg Response Time (ms) | 
|-------------------------------------|----------------------|------------------------|
| Single-threaded Web Server          | 1,000                | 1,000                   |
| Multithreaded Web Server            | 8,000                | 200                    |
| Multithreaded Web Server (Thread Pool) | 10,000            | 100                    |  -->
