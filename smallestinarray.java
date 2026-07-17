public class SmallestInArray {
    public static void main(String[] args) {

        int[] numbers = {15, 45, 10, 90, 30};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        System.out.println("Smallest Number = " + smallest);
    }
}
