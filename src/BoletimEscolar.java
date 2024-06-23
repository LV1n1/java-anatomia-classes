public class BoletimEscolar {

    public static void main(String[] args) {

        String nomeAluno = "Vinícius";

        double nota1 = 7.8;
        double nota2 = 0.8;
        double nota3 = 0.8;
        double nota4 = 0.8;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.printf("ALUNO: " + nomeAluno +
                    "\nSITUAÇÃO: APROVADO");
        } else if (media <= 6) {
            System.out.printf("ALUNO: " + nomeAluno + "\nSITUAÇÃO: RECUPERAÇÃO");

        } else {
            System.out.println("ALUNO: " + nomeAluno + "\nSITUAÇÃO: REPROVADO");
        }

        System.out.println("\nMEDIA FINAL " + media);

    }

}
