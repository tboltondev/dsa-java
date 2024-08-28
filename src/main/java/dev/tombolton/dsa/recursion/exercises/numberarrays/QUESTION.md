## Chapter 10 Exercise 4 (pg. 160)

Here is an array containing both numbers as well as other arrays, which in turn contain numbers and arrays:

> The question is asked using a JavaScript array which can contain any type of values, so to make this work in Java I
> have created a class called `IntOrArr` that can hold either an `Integer` or an array of `IntOrArr` objects. For this
> question I have included the original JavaScript array because it shows more clearly the structure, whereas the Java
> implementation of this (see the test `NumberArraysTest`) is quite ugly.

```js
array = [ 1,
          2,
          3,
          [4, 5, 6],
          7,
          [8,
            [9, 10, 11,
                [12, 13, 14]
            ]
          ],
          [15, 16, 17, 18, 19,
            [20, 21, 22,
                [23, 24, 25,
                    [26, 27, 28, 29]
                ], 30, 31
            ], 32
          ], 33
        ]
```
