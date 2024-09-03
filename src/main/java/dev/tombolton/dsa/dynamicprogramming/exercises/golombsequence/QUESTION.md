## Chapter 12 Exercise 2 (pg. 197)

The following function uses recursion to calculate the Nth number from a mathematical sequence known as the "Golomb
sequence." It's terribly inefficient, though! Use memoization to optimize it. (You don't have to actually understand how
the Golomb sequence works to do this exercise.)

```java
public class GolombSequence {
    public static int valueAt(int n) {
        if (n == 1) return 1;
        return 1 + valueAt(n - valueAt(valueAt(n - 1)));
    }
}
```
