package Logica;

// 3) Lógica do código fornecido
public class Soma {
    public int calcularSoma(int limite) {
        int indice = 12, soma = 0, k = 1;

        // Um loop que soma os números de 1 até 12.
        // O loop só começa a somar a partir de k=2, porque 'k' é incrementado no início de cada interação.
        while (k < indice) {
            k += 1;
            soma += k;
        }
        return soma;
    }
}
