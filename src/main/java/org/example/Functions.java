package org.example;

public class Functions {

    public static void bubbleSort(int[] mas){
        int n = mas.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(mas[j] > mas[j+1]){
                    int vr = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = vr;
                }
            }
        }
    }


    public static int binarySearch(int[] mas, int el){
        int l = 0;
        int r = mas.length-1;

        while (r - l > 1) {

            int mid = (r - l) / 2;

            if (mas[mid] < el) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        if (mas[l] == el){
            System.out.println("El index is " + l);
            return l;
        }
        else if (mas[r] == el){
            System.out.println("El index is " + r);
            return r;
        }
        else {
            System.out.println("El index isn't found");
            return -1;
        }


    }
}
