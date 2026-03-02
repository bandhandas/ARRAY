
    import java.util.Arrays;

     public class MeanAndMedian {

        public static int mean(int[] arr) {
            int sum = 0;
            int n = arr.length;

            for(int i = 0; i < n; i++){
                sum += arr[i];
            }

            return sum / n;
        }

        public static int median(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);

            if(n % 2 != 0){
                return arr[n/2];
            } else {
                return (arr[n/2 - 1] + arr[n/2]) / 2;
            }
        }

        public static void main(String[] args){
            int[] arr = {1,2,19,28,5};

            System.out.println("Mean is " + mean(arr));
            System.out.println("Median is " + median(arr));
        }
    }

