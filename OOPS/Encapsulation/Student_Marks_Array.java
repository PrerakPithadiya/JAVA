package OOPS.Encapsulation;

import java.util.Arrays;

public class Student_Marks_Array {
    static class Main {
        private int[] marks;

        Main(int[] arr) {
            this.marks = new int[arr.length];
            for (int i = 0; i < marks.length; i++) {
                marks[i] = arr[i];
            }
            // this.marks = arr;
        }

        int[] getInfo() {
            return this.marks;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 34, 67, 89, 55};
        Main obj = new Main(arr);
        System.out.println(arr);
        System.out.println(obj.getInfo());
        arr[1] = 0;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(obj.getInfo()));
    }
}

