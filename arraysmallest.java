public class ArraySmallest {

    public static void main(String[] args) {

        int[] numbers = {10, 80, 30, 60, 40};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        System.out.println("Smallest = " + smallest);

    }

}
