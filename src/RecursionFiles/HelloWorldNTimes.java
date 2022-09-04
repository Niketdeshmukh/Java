package RecursionFiles;

public class HelloWorldNTimes {
    static int count=0;
    public static void printMessage(int n){
        count++;
        if(count<=n){
            System.out.println("Hello World");
            printMessage(n);
        }
    }
    public static void main(String[] args) {
        int n=20;
        printMessage(n);
    }
}
