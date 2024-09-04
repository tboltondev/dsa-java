package dev.tombolton.dsa.quicksort.examples;

public class SortableArray {
    protected int[] array;

    public SortableArray(int[] array) {
        this.array = array;
    }

    public void quicksort() {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        if (rightIndex - leftIndex <= 0) return;

        int pivotIndex = partition(leftIndex, rightIndex);

        quicksort(leftIndex, pivotIndex - 1);
        quicksort(pivotIndex + 1, rightIndex);
    }

    private void quicksort(int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) return;

        int pivotIndex = partition(leftIndex, rightIndex);

        quicksort(leftIndex, pivotIndex - 1);
        quicksort(pivotIndex + 1, rightIndex);
    }

    public int quickselect(int kthLowestValue) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        if (rightIndex - leftIndex <= 0) return array[leftIndex];

        int pivotIndex = partition(leftIndex, rightIndex);

        if (kthLowestValue < pivotIndex) {
            return quickselect(kthLowestValue, leftIndex, pivotIndex - 1);
        } else if (kthLowestValue > pivotIndex) {
            return quickselect(kthLowestValue, pivotIndex + 1, rightIndex);
        } else {
            return array[pivotIndex];
        }
    }

    private int quickselect(int kthLowestValue, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) return array[leftIndex];

        int pivotIndex = partition(leftIndex, rightIndex);

        if (kthLowestValue < pivotIndex) {
            return quickselect(kthLowestValue, leftIndex, pivotIndex - 1);
        } else if (kthLowestValue > pivotIndex) {
            return quickselect(kthLowestValue, pivotIndex + 1, rightIndex);
        } else {
            return array[pivotIndex];
        }
    }

    private int partition(int leftPointer, int rightPointer) {
        int pivotIndex = rightPointer;
        int pivot = array[pivotIndex];

        rightPointer -= 1;

        while (true) {
            while (leftPointer < array.length && array[leftPointer] < pivot) {
                leftPointer += 1;
            }

            while (rightPointer > -1 && array[rightPointer] > pivot) {
                rightPointer -= 1;
            }

            if (leftPointer >= rightPointer) {
                break;
            }

            int leftPointerVal = array[leftPointer];
            array[leftPointer] = array[rightPointer];
            array[rightPointer] = leftPointerVal;

            leftPointer += 1;
        }

        int leftPointerVal = array[leftPointer];
        array[leftPointer] = array[pivotIndex];
        array[pivotIndex] = leftPointerVal;

        return leftPointer;
    }
}
