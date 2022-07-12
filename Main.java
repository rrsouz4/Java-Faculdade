package Application;
import java.util.Scanner;
import java.util.Locale;
import Alunos.Aluno;

public class Main{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Aluno aluno = new Aluno();

        System.out.print("Digite seu nome: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Entre com a 3 notas: ");
        aluno.setNota1(sc.nextDouble());
        aluno.setNota2(sc.nextDouble());
        aluno.setNota3(sc.nextDouble());

        System.out.println();
        System.out.printf("NOME DIGITADO: %s\n",aluno.getNome());
        System.out.printf("MEDIA: %.2f\n",aluno.getMedia());

        if (aluno.getMedia() < 60){
            System.out.printf("REPROVADO\nFaltam %.2f pontos",(60-aluno.getMedia()));
        } else {
            System.out.println("APROVADO");
        }

        sc.close();

        System.exit(0);


    }
}
