package org.example;

public class App {
    public static void main( String[] args ) {
        int[] sortArr = {4, 6, 10, 12, 15};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.indexOfElement(sortArr, 15));
    }
}
