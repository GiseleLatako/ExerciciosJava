package EstruturaDeRepeticao;

import java.util.Scanner;

public class ExercicioIdadeDoUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = 0;

        do {
            System.out.print("Digite sua idade: ");
            idade = Integer.parseInt(leitor.nextLine());

            if (idade < 18)
                System.out.print("Idade invalida! ");
        } while (idade < 18);
        System.out.print("Idade invalida! ");
    }
}
