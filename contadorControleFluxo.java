import java.util.Scanner;

public class contadorControleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = terminal.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(valor1, valor2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }

        terminal.close();
    }

    // Método de contagem
    static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
        // Validação
        if (valor1 >= valor2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = valor2 - valor1;

        System.out.println("Contando de 1 até " + contagem + ":");
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}

// Classe da exceção personalizada
class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException() {
		super("O segundo parâmetro deve ser maior que o primeiro.");
	}
}
