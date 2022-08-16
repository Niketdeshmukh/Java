public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {30,10,50,40,60,70,20,90,80};
        int len = array.length;
        int temp=0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len-i; j++) {
                if (array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }

        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
