import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        float[] numbers = {1.57f, 7.654f, 9.986f};
        int[] dogs = {1, 3, 5};

        System.out.println("Задание 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] );
            if( i< weight.length-1){
                System.out.print(",");
            }

        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i<numbers.length-1 ){
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i] );
            if (i<dogs.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        int[] arr = new int[]{1, 2, 3};
        for (int i = arr.length - 1; i >= 0; i = i - 1) {
            System.out.print(arr[i]);
            if (i>0){
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i>0){
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = dogs.length - 1; i >= 0; i--) {
            System.out.print(dogs[i]);
            if (i>0){
                System.out.print(" , ");
            }
        }

        System.out.println();
        System.out.println("Задание 4 ");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] = arr1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr1));


    }
}