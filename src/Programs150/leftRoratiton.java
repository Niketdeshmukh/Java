package Programs150;

public class leftRoratiton {
       public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

        for(int j=0;j<3;j++){
            int temp=arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                int a=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=a;
            }
            arr[arr.length-1]=temp;
        }


        for(int i:arr)
        {
            System.out.print(i);
        }
    }
}
