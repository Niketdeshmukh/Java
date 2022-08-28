public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String str = "Hi Welcome Here";
        int[] freq = new int[str.length()];
        int i,j;
        char string[]=str.toCharArray();
        for (i = 0; i < string.length; i++) {
            freq[i]=1;
            for ( j = 0; j < string.length; j++) {
                if(string[i]==string[j]){
                    freq[i]++;
                    string[i]='0';
                }
            }
        }System.out.println("Hi Welcome Here");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
}
