package prime_numbers;

import java.util.ArrayList;

public class EratosthenesSieve {

    private ArrayList<Integer> primes;

    public EratosthenesSieve() {
        primes = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getPrimes() {
        return primes;
    }

    public void fill(Integer n) {
        primes.clear();

        int[] buffer = new int[n+1];

        for (Integer i = 1; i <= n; i++) {
            buffer[i] = i;
        }

        for (Integer p = 2; p <= n; p++) {
            if (buffer[p] != 0) {
                primes.add(p);
                for (Integer j = p*p; j <= n; j += p) {
                    buffer[j] = 0;
                }
            }
        }
    }
}
