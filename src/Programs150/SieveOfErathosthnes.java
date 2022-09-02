package Programs150;

public class SieveOfErathosthnes {
    public static void sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }


    public static void main(String args[])
    {
        int n = 30;
        sieveOfEratosthenes(n);
    }
}
//p*p isly likha h kyuki square k bad ke hi number milenge examplle 2 ke multiples 2 ke square mtlb 4 ke badse hi milenge phir 3
//ke multiples 9 k badse hi milenge kyuki 6 to already 2 ne cover krlia h

