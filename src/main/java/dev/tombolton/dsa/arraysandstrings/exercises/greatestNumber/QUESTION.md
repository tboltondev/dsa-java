## Chapter 4 Exercise 4 (pg. 61)
The following function finds the greatest single number within an array, but has an efficieny of $O(N^2)$. Rewrite the function so that it becomes a speedy $O(N)$:

```java
class GreatestNumber {
    public static int greatestNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isIValTheGreatest = true;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isIValTheGreatest = false;
                }
            }

            if (isIValTheGreatest) {
                return arr[i];
            }
        }
        // shouldn't be reached
        return 0;
    }
}
```
