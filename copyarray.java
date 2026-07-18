public class CopyArray {
    public static void main(String[] args) {

        int[] first = {10,20,30,40,50};
        int[] second = new int[first.length];

        for(int i=0;i<first.length;i++){
            second[i]=first[i];
        }

        System.out.println("Copied Array:");

        for(int i=0;i<second.length;i++){
            System.out.println(second[i]);
        }
    }
}
