## Chapter 13 Exercise 2 (pg. 224)

The following function finds the "missing number" from an array of integers. That is, the array is expected to have all
integers from `0` up to the array's length, but one is missing. As examples, the array, `[ 5, 2, 4, 1, 0 ]` is missing
the number `3`, and the array, `[9, 3, 2, 5, 6, 7, 1, 0, 4]` is missing the number `8`. Here's an implementation that is
$O(N^2)$ (the includes method alone is already $O(N)$, since the computer needs to search the entire array to find `n`):

```java
import java.util.List;

public class MissingNumber {
    public static Integer findMissingNumber(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (!array.contains(i)) {
                return i;
            }
        }
        return null;
    }
}
```

Use sorting to write a new implementation of this function that only takes
$O(N \log N)$. (There are even faster implementations, but we're focusing on using sorting as a technique to make code
faster.)