package EstruturaDeRepeticao;

import java.util.Scanner;

public class ExercicioVerificacaoLogin {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do usuario: ");
        String usuario = leitor.nextLine();

        System.out.print("Digite a senha: ");
        String senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123"))
            System.out.print("Login bem-sucedido! ");

        else {
            System.out.println("Nome do usuario ou senha incorretos ");

        }

    }

    ;

}


