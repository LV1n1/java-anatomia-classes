import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Seu nome é: " + nome);

        System.out.println("Informe sua primeira nota: ");
        String nota1 = entrada.nextLine();

        System.out.println("Informe sua segunda nota: ");
        String nota2 = entrada.nextLine();

        double primeiraNota = Double.parseDouble(nota1);
        double segundaNota = Double.parseDouble(nota2);

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            System.out.println("APROVADO");
            System.out.println("NOME DO ALUNO: " + nome + "\nMEDIA FINAL: " + media);
        } else {
            System.out.println("RECUPERAÇÃO");
            System.out.println("NOME DO ALUNO: " + nome + "\nMEDIA FINAL: " + media);
        }

    }

}
