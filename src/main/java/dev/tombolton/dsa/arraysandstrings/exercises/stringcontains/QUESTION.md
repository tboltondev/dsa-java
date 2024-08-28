## Chapter 6 Exercise 4 (pg. 94)
The following function returns whether or not a capital "X" is present within a string:

```java
class StringContains {
    public static boolean containsX(String str) {
        boolean foundX = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                foundX = true;
            }
        }

        return foundX;
    }
}
```
What is the function's time complexity in terms of Big O Notation?
$O(N)$
Then modify the code to improve the algorithm's efficiency for best- and average-case scenarios.