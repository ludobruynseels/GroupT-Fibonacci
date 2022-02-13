package be.kuleuven.groepT;

public class Fibonacci {
    public int Generate(int n) {
        int prevprevValue = 0;
        int prevValue = 1;
        System.out.println(prevprevValue);
        System.out.println(prevValue);

        int result = 0;
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
