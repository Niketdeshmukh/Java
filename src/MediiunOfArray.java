import java.util.Arrays;

public class MediiunOfArray {
    public static void main(String[] args) {
        int array[] = {20,30,60,30,80,40,70,10,50,90};
        Arrays.sort(array);
        for(int a:array){
            System.out.print(a +" ");
        }
        System.out.println();
        if(array.length%2!=0){
            int median=array[array.length/2];
            System.out.println(median);
        }else {
            int median1=array[array.length/2];
            int median2=array[(array.length/2)-1];
            int median3=(median1+median2)/2;
            System.out.println(median3);
        }
    }
}
