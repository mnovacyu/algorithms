![](2018-10-02-21-40-28.png)

=====

## Summary: Union-Find
1. Dynamic Connectivity problem
2. Quick Find (eager approach algorithm)
3. Quick Union
4. Quick-Union Improvements
5. Quick-Find Applications

  -----

### Steps to developing a usable algorithm:
1. Model the the problem.
2. Find an algorithm to solve it.
3. Fast enough? Fits in memory?
4. If not, figure out why.
5. Find a way to address the problem.
6. Iterate until satisfied.

  -----

### 1. Dynamic Connectivity Problem
  * Given a set of N objects
    * Union Command: connect two objects
    * Find/connected query: is there a path connecting the two objects?

  ![](slides/2018-09-30-16-47-39.png)
  
  -----
  ![](slides/2018-10-02-21-17-19.png)
  
  -----
  ![](slides/2018-10-02-20-24-00.png)
  
  -----
  ![](slides/2018-10-02-20-24-39.png)

  -----

### 2. Quick Find (eager approach algorithm)
  * Quick to find, but slow to union -- O(N^2). Becomes too slow overall for huge problems.)

  ![](slides/2018-10-02-20-29-00.png)
  
  -----
  ![](slides/2018-10-02-20-30-09.png)
  
  -----
  ![](slides/2018-10-02-20-43-16.png)
  
  -----
  ![](slides/2018-10-02-21-23-01.png)
  
  -----
  ![](slides/2018-10-02-21-35-13.png)

  -----

### 3. Quick Union (lazy approach algorithm)
  * Union should be faster, but still could be just as slow in worst case scenarios. Trees can also get too tall from union, which makes find way too expensive.

  ![](slides/2018-10-04-21-25-51.png)

  -----
  ![](slides/2018-10-04-21-37-07.png)

  -----
  ![](slides/2018-10-04-21-46-40.png)

  -----

### 4. Quick-Union Improvements
  * Use "Weighted Quick-Union"
    * By size or by height
    * Modify quick-union to avoid tall/large trees
  * *Even* better, use Weighted Quick-Union with Path compression
    * Just after computing root of p, set the id of each examined node to point to that root
    * Reduces time from 30 years to 6 seconds!

  ![](slides/2018-10-04-21-53-06.png)

  -----
  ![](slides/2018-10-04-21-55-50.png)

  -----
  ![](slides/2018-10-04-21-57-55.png)

  -----
  ![](slides/2018-10-06-12-25-31.png)

  -----
  ![](slides/2018-10-06-12-26-54.png)

  -----
  ![](slides/2018-10-06-12-30-52.png)

  -----
  ![](slides/2018-10-06-12-35-49.png)

  -----
  ![](slides/2018-10-06-12-36-28.png)

  -----
  ![](slides/2018-10-06-12-37-19.png)

  -----
  ![](slides/2018-10-06-12-40-29.png)

  -----
  ![](slides/2018-10-06-12-42-12.png)

  -----

### 5. Quick-Find Applications
  * Percolation, Games (Go, Hex), Dynamic Connectivity, Image processing, etc.
  
  ![](slides/2018-10-06-12-55-02.png)
  ![](slides/2018-10-06-12-56-25.png)

  -----
  ![](slides/2018-10-06-12-59-40.png)

  -----
  ![](slides/2018-10-06-13-00-22.png)

  -----
  ![](slides/2018-10-06-14-36-43.png)

  -----
  ![](slides/2018-10-06-14-37-50.png)

  -----
  ![](slides/2018-10-06-14-38-59.png)

  -----
  ![](slides/2018-10-06-14-40-13.png)

======

## Analysis of Algorithms

#### Suggested Reading
Section 1.4 and 1.5 in Algorithms, 4th edition.