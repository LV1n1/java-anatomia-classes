public class MinhaClasse {

    public static void main(String[] agrs) {

        String meuNome = "Vinícius";
        int idade = 20;
        double altura = 1.76;
        boolean verdadeiro = true;

        System.out.printf("Nome: " + meuNome);
        System.out.printf("\nIdade: " + idade);
        System.out.printf("\nAltura: " + altura);
        System.out.printf("\nHabilitado? " + verdadeiro);

        String primeiroNome = "Vinícius";
        String segundoNome = "Fonseca";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("\n" + nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Nome Completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
