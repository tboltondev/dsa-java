## Chapter 12 Exercise 3 (pg. 197)

Here is a solution to the "Unique Paths" problem from an exercise in the previous chapter. Use memoization to improve
its efficiency:

```java
public class UniquePaths {
    public static int countUniquePaths(int rows, int columns) {
        if (rows == 1 || columns == 1) return 1;
        return countUniquePaths(rows - 1, columns) + countUniquePaths(rows, columns - 1);
    }
}
```
