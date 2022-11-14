package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    void testCorrectNumberOfBinarySearch() {
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.indexOfElement(sortedArr, 3);

        assertThat(index).isEqualTo(2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void testAllCorrectNumberOfBinarySearch(int number) {
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.indexOfElement(sortedArr, number);

        assertThat(index).isNotEqualTo(-1);
    }

    @Test
    void testIncorrectNumberOfBinarySearch() {
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.indexOfElement(sortedArr, 7);

        assertThat(index).isEqualTo(-1);
    }
}
