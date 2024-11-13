package Principal;

import Logica.Fibonacci;  // Importando a classe Fibonacci
import Logica.LetraA;      // Importando a classe LetraA
import Logica.Soma;        // Importando a classe Soma
import Logica.Sequencias;  // Importando a classe Sequencias
import Logica.Interruptores; // Importando a classe Interruptores

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando instâncias das classes do pacote Logica
        Fibonacci fibonacci = new Fibonacci();
        LetraA letraA = new LetraA();
        Soma soma = new Soma();
        Sequencias sequencias = new Sequencias();
        Interruptores interruptores = new Interruptores();

        // 1) Fibonacci
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Exibe se pertence ou se não pertence a sequência
        if (fibonacci.pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }


        // 2) Verificação da letra 'a'
        System.out.print("Digite uma string para verificar quantas letras 'a' possuem: ");
        scanner.nextLine();  // Consumir a quebra de linha pendente
        String str = scanner.nextLine();
        int contador = letraA.contarLetraA(str);
        System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");


        // 3) Lógica do código fornecido
        System.out.println("O valor da variável SOMA é: " + soma.calcularSoma(12));


        // 4) Completar sequências
        sequencias.exibirSequencias();


        // 5) Resolver o problema dos interruptores
        interruptores.resolver();

        scanner.close();
    }
}





