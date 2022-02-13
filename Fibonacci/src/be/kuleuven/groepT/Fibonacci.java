package be.kuleuven.groepT;

public class Fibonacci {
    public long Generate(int n) {
        long prevprevValue = 0;
        long prevValue = 1;
        System.out.println(prevprevValue);
        System.out.println(prevValue);

        long result = 0;
        for(int i = 1; i < n; i++)
        {
            result = prevprevValue + prevValue;
            prevprevValue = prevValue;
            prevValue = result;
            System.out.println("Fibonacci nr " + i + " = " + result);
        }
        return result;
    }
}
