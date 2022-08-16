public class AllNegElemOneSideAndPosOneSide {
    public static void moveElem(int array[],int len){
        int j=0, temp=0;
        for (int i = 0; i < len; i++) {
            if (array[i]<0){
                if (i!=j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }
    public static void display(int array[],int len){
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {-3,4,6,-2,8,7,-1,2};
        int len = array.length;
        moveElem(array,len);
        display(array,len);
    }
}
