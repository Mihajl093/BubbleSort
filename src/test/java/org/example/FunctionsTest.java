package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class FunctionsTest extends TestCase {
    @Test
    public void testBubbleSort() {
        int[] mas = {3,2,4,5,6};
        int[] mas2 = {2,3,4,5,6};
        Functions.bubbleSort(mas);
        assertEquals(mas2, mas);
    }

    @Test
    public void testShouldFoundBinarySearch() {
        int[] mas = {3,2,4,5,6};
        int el = 6;
        int i = Functions.binarySearch(mas, el);
        assertEquals(4, i);
    }

    @Test
    public void testShouldNotFoundBinarySearch(){
        int[] mas = {3,2,4,5,6};
        int el = 7;
        int i = Functions.binarySearch(mas, el);
        assertEquals(-1, i);
    }
}
