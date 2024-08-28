package dev.tombolton.dsa.recursion.exercises.numberarrays;

public class IntOrArr {
    private Integer integer;
    private IntOrArr[] array;

    public IntOrArr(Integer integer) {
        this.integer = integer;
    }

    public IntOrArr(IntOrArr[] array) {
        this.array = array;
    }

    public static IntOrArr integer(Integer integer) {
        return new IntOrArr(integer);
    }

    public static IntOrArr array(IntOrArr[] array) {
        return new IntOrArr(array);
    }

    public boolean isArray() {
        return this.array != null;
    }

    public Integer getInteger() {
        return integer;
    }

    public IntOrArr[] getArray() {
        return array;
    }
}
