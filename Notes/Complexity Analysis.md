# Time & Space Complexity

## What is Time complexity?

Time complexity is the amount of time an algorithm takes to run as a function of the length of the input.

## Why do we need it?

- To make a better program, check whether it is faster or slower or takes up more spaces or less space.

- Comparing different algos
  - ***Example:*** Suppose we have two programs with different priorities-

      - ***High priority(slow)*** : Algo A
      - ***Low priority(fast)*** : Algo B

      If we run Program A on a fast machine and Program B on a slower machine, we might mistakenly judge their priority based on how long they take to run.
     To evaluate each program properly before running them, we need to look at their time complexity.
## Types of Time Complexity:
- Big O notation
- Theta (⊖) notation
- Omega(Ω) notation 

```
Constant time O(1)
Linear time O(n)
Logarithmic time O(logn)
Quadratic time O(n^2)
Cubic time O(n^3)
```

### Big O notation(upper bound): worst case scenario, denotes the maximum time a program takes.

The function f(n) = O(g(n);
if and only if there exist positive constants c and n0 such that

f(n)<=c * g(n) //for all n;where n >= n0

### Theta (⊖) notation: average case scenario, denotes the average time a program takes.

The function f(n) = ⊖(g(n);
if and only if there exist positive constants c1,c2, and n0 such that

c1 * g(n) <= f(n) <=c2 * g(n) //for all n;where n >= n0

### Omega(Ω) notation(Lower bound): best case scenario, denotes the minimum time a program takes.

The function f(n) = Ω(g(n);
if and only if there exist positive constants c and n0 such that

f(n)>=c * g(n) //for all n;where n >= n0

