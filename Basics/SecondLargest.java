public class SecondLargest {
    public static void main(String[] args) {

        int arr[] = {10, 20, 5, 8, 25};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }

            else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }

        System.out.println("Second largest = " + second);
    }
}