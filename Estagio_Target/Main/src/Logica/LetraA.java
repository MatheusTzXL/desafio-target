package Logica;

// 2) Verificar a existência de 'a' na string e contar quantas vezes aparece
public class LetraA {
    public int contarLetraA(String str) {
        int contador = 0;

        for (char c : str.toCharArray()) {
            if (Character.toLowerCase(c) == 'a') { // Converte todos caracteres por minúsculo e verifica se é igual a 'a'
                contador++;
            }
        }
        return contador;
    }
}
