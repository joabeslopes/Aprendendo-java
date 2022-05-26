//Um programa em java começa com uma public class, seguida do nome do programa
//Note que o código inteiro está inserido dentro das chaves {}

public class PrimeiroPrograma {

    public static void main(String[] args) {
//Essa linha representa a "partida" do programa, chamada de método main (main method)

        var BoasVindas = "Olá, bem vindo ao meu primeiro programa";

//Isso é uma variável, um espaço na memória do pc onde você atribui um nome e um valor.
//Esse valor pode variar, por isso o nome variável.
//O comando var é para criar uma variável que recebe qualquer coisa, mas também é possível
//criar variáveis específicas, como:

        String palavra = "variável que recebe palavras";
        int numero = 1;
        double NumeroQuebrado = 4.526;
        boolean VerdadeiroOuFalso = false;

//Agora vamos mandar o programa escrever essas variáveis:

        System.out.println(BoasVindas);
        System.out.println(palavra);
        System.out.println(numero);
        System.out.println(VerdadeiroOuFalso);
        System.out.println(NumeroQuebrado);

    }

}
