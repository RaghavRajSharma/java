import java.util.Arrays;

public class MaxElement {

    static void maxElement(int arr[] , int n){
        boolean isMax;
        for(int i=0 ; i<n ; i++){
            isMax = true ; 
            for(int j=0 ; j<n ; j++){
                if (arr[j]>arr[i]) {
                    isMax = false ;
                    break ;
                }
            }
            if(isMax){
                System.out.println("Max Element " + arr[i]);
                return ;
            }
        }
    }

    static void approach(int arr[] ,int n){
        int max = arr[0];
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
                System.out.println("Max Element  " + arr[i]);
            }
        }
    }

    static void approach_2(int arr[] , int n){
        Arrays.sort(arr);
        int max = arr[n-1];
        System.out.println("Max Element  " + max);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,7,1,12,6};
        int  n = arr.length;
        //maxElement(arr, n);
        //approach(arr , n);
        approach_2(arr , n);
    }
}