package Logica;

// 1) Sequência de Fibonacci
// O metodo usa dois números iniciais da sequência e os soma em um loop até que o número solicitado seja encontrado ou ultrapassado
public class Fibonacci {
    public boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, c;
        while (a <= num) { // Enquanto não ultrapassar o número fornecido, ocorre o loop
            if (a == num) { // Verifica se 'a' é igual o número fornecido
                return true; // Se for verdadeiro, retorna true
            }
            // Calcula e atualiza os números da sequência
            c = a + b;
            a = b;
            b = c;
        }
        return false; //Se for falso, retorna false
    }
}
