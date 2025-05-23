public class ArrayOperations {
    public static void main(String[] args) {

        int[] numbers = {20, 25, 30, 35, 40};


        System.out.println("Array Elements:");
        for
        (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        double average = (double) sum / numbers.length;


        System.out.println("Average of array elements: " + average);
    }
}
