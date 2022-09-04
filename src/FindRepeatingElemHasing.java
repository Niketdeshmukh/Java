public class FindRepeatingElemHasing {
    public static void repeatingElem(int arr[]){
        // Initialize index of first repeating element
        int min = -1;
        HashSet<Integer> set=new HashSet<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if (set.contains(arr[i]))
                min=i;
            else set.add(arr[i])
        }
        if (min!=-1){
            System.out.println("The repeating elem is: "+ arr[min]);
        }
        else System.out.println("No repeating elem");
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        repeatingElem(arr[]);
    }
}