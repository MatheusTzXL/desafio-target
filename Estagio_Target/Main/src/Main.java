import java.util.Scanner;

public class Main {

    // 1) Sequência de Fibonacci
    // O metodo usa dois números iniciais da sequência e os soma em um loop até que o número solicitado seja encontrado ou ultrapassado
    public static void fibonacci(int num) {
        int a = 0, b = 1, c;
        boolean pertence = false;

        while (a <= num) { // Enquanto não ultrapassar o número fornecido, ocorre o loop
            if (a == num) { // Verifica se 'a' é igual o número fornecido
                pertence = true;
                break; // Se encontrar o número, encerra o loop
            }
            // Calcular e atualizar os números da sequência
            c = a + b;
            a = b;
            b = c;
        }

        // Exibe se pertence ou se não pertence a sequência
        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
    }


    // 2) Verificar a existência de 'a' na string e contar quantas vezes aparece
    public static void verificarLetraA(String str) {
        int contador = 0;

        // O metodo toCharArray converte a string em um array. foreach percorre cada caractere da array.
        for (char c : str.toCharArray()) {
            if (Character.toLowerCase(c) == 'a') { // Converte todos caracteres por minúsculo e verifica se é igual a 'a'
                contador++;
            }
        }
        System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
    }


    // 3) Lógica do código fornecido
    public static void calcularSoma() {
        int indice = 12, soma = 0, k = 1;

        // Um loop que soma os números de 1 até 12.
        // O loop só começa a somar a partir de k=2, porque 'k' é incrementado no início de cada interação.
        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("O valor da variável SOMA é: " + soma);
    }

    // 4) Completar a sequência de números
    public static void completarSequencias() {
        System.out.println("a) 1, 3, 5, 7, 9");
        System.out.println("b) 2, 4, 8, 16, 32, 64, 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, 49");
        System.out.println("d) 4, 16, 36, 64, 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8, 13");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, 20");
    }

    // 5) Resolver o problema dos interruptores
    public static void resolverInterruptores() {
        System.out.println("Para descobrir qual interruptor controla qual lâmpada eu faria o seguinte caminho:");
        System.out.println("1. Ligaria o primeiro interruptor por um tempo, desligaria e ligaria o segundo.");
        System.out.println("2. Iria até duas das salas e verificaria: a lâmpada quente é do primeiro interruptor que foi ligado e desligado, a acesa é do segundo, e a apagada é do terceiro que eu não acendi.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Fibonacci
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        fibonacci(numero);

        // 2) Verificação da letra 'a'
        System.out.print("Digite uma string para verificar quantas letras 'a' possuem: ");
        scanner.nextLine();  // Consumir a quebra de linha pendente
        String str = scanner.nextLine();
        verificarLetraA(str);

        // 3) Lógica do código fornecido
        calcularSoma();

        // 4) Completar sequências
        completarSequencias();

        // 5) Resolver o problema dos interruptores
        resolverInterruptores();

        scanner.close();
    }
}
