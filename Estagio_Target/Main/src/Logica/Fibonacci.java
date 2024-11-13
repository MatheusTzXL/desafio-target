package Logica;

// 1) Sequência de Fibonacci
public class Fibonacci {
    public boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, c;
        while (a <= num) {
            if (a == num) {
                return true;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return false;
    }
}
