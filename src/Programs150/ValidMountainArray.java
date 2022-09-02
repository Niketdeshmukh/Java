package Programs150;

public class ValidMountainArray {
        public static boolean isValidMountainArray(int[] arr){
            int n = arr.length-1;
            int i=0;
            int j= arr.length-1;
            while(i+1<n&& arr[i]<arr[i+1]){
                i++;
            }
            while (j>0&&arr[j]<arr[j-1]){
                j--;
            }
            return (i>0 && j<n && i==j);
        }
    public static void main(String[] args) {
        int arr[]= {0,3,2,1};
        boolean result = isValidMountainArray(arr);
        System.out.println(result);
    }
}
