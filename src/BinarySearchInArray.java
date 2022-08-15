public class BinarySearchInArray {
    public  static  int binarySearch(int array[],int first,int end,int key){
        while (first<=end){
            int mid=(first+end)/2;
            if (key==array[mid]){
                return  mid;
            }
            else if(key>array[mid]) {
                first=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,60,70};
        int key=90;
        int first = 0;
        int end = array.length-1;
        int result = binarySearch(array,first,end,key);
        System.out.println(result);
    }
}