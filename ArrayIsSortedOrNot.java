public class ArrayIsSortedOrNot {

    public static boolean isSorted(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 49, 45, 13};
        boolean result = isSorted(numbers);
        System.out.println(result);
    }
}
