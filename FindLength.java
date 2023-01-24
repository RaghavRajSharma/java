public class FindLength {
    static int findLength(int[] ribbons, int k) {
        int low = 0, high = 10;
        while (low < high) {
            int mid = (low + high ) ;
            int count = 0;
            for (int ribbon : ribbons) {
                count += ribbon / mid;
            }
            if (count < k) {
                high = mid - 1;
            } 
            else {
                low = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] n= {5,7,2,4,9};
        int a = 9;
        System.out.println(findLength(n, a));
    }
}
