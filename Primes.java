public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        int firstNum = 2;
        boolean[] isPrime = new boolean[n + 1];
        System.out.println("Prime numbers up to " + n + ":");
       
        for(int i = 2; i < n; i++) isPrime[i] = true;
      
        while (firstNum <= Math.sqrt(n)) {
            for(int i = 2; i < n; i++){
                if (i != firstNum) {
                    if ( (i % firstNum == 0)) {
                        isPrime[i] = false;
                    } 
                }
            }
            firstNum++;
        }
        
        int finalPrime = 0;
        double count = 0.0;
        for(int i = 2; i < n; i++){
            if (isPrime[i] == true){
                System.out.println(i);
                count++;
                finalPrime = i;
             } 
            }
        int percent = (int) ((count / (double) n) * 100);
        System.out.println("There are " + count + " primes between 2 and "
        + finalPrime + " (" + percent + " are primes)");
        }
}