package org.example;

public class BinarySearch {
    protected int indexOfElement(int[] sortedArr, int element){
        int firstIndex = 0;
        int lastIndex = sortedArr.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            //Середній елемент - шуканий
            if (sortedArr[middleIndex] == element) {
                return middleIndex;
            }

            //Середній елемент менше, отже йдемо вправо
            else if (sortedArr[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            }

            //Середній елемент більше, отже йдемо вліво
            else if (sortedArr[middleIndex] > element) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
