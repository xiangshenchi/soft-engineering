public class Prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 20000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}