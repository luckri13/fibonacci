import java.math.BigInteger;

/**
 * Basic fibonacci printer
 * @author Lucas Kristiansson
 * @version 1.0
 */
public class Fibonacci {

    private void printFibonacci(BigInteger range){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;

        for(BigInteger i = BigInteger.valueOf(0); i.compareTo(range) != 0; i = i.add(BigInteger.valueOf(1))){
            if(i.compareTo(BigInteger.valueOf(1)) < 1){
                c = i;
            }
            else{
                c = a.add(b);
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.printFibonacci(BigInteger.valueOf(100));
    }
}
