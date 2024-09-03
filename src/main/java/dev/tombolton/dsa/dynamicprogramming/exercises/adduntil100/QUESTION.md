## Chapter 12 Exercise 1 (pg. 197)

The following function accepts an array of numbers and returns the sum, as long as a particular number doesn't bring the
sum above 100. If adding a particular number will make the sum higher than 100, that number is ignored. However, this
function makes unnecessary recursive calls. Fix the code to eliminate the unnecessary recursion:

```java
import java.util.Arrays;

public class AddUntil100 {
    public static int add(int[] array) {
        if (array.length == 0) return 0;

        if (array[0] + add(Arrays.copyOfRange(array, 1, array.length - 1)) > 100) {
            return add(Arrays.copyOfRange(array, 1, array.length - 1));
        }

        return array[0] + add(Arrays.copyOfRange(array, 1, array.length - 1));
    }
}
```
