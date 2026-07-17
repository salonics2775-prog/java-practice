public class LargestInArray {
    public static void main(String[] args) {

        int[] numbers = {15, 45, 10, 90, 30};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }

        System.out.println("Largest Number = " + largest);
    }
}
