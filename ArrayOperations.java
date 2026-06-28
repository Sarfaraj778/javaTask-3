public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = {5,2,9,1,5};

        int sum = 0;

        for(int num : numbers){

            sum += num;

        }

        System.out.println("Array Elements");

        for(int num : numbers){

            System.out.print(num + " ");

        }

        System.out.println("\nArray Sum = " + sum);

    }
}