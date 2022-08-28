public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        String str = "Biernok";
        char[] ch = str.toCharArray();
        int n = str.length();
        int count = 0, count1 = 0;
        for (int i = 0; i < n / 2; i++) {
            if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
                count++;
            }

        }
        for (int i = n / 2; i < n; i++) {
            if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
                count1++;
            }
        }
        if (count == count1) {
            System.out.println(true);
        } else System.out.println(false);
    }
}