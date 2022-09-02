package Programs150;

public class PronicNumberOrNot {
    public static void main(String[] args) {
        int num=192;
        for (int i = 0; i < num; i++) {
            if ((i) * (i + 1) == num) {
                System.out.println("Pronic number");
                break;
            }
        }
    }
}
