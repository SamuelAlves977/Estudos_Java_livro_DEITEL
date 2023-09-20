package assunto_while;

import java.util.Random;
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] arg){
        // instanciando uma nova instancia da classe Scanner para utilizar como entrada do teclado
        Scanner imput = new Scanner(System.in);

        //variaveis globais
        int total = 0;
        int gradeCounter = 1;
        int grade=0;

        //salvando as 10 notas dos alunos
        while (gradeCounter < 10){
            try {
                //recebendo as notas e salvando as notas
                System.out.print("Enter Grade: ");
                grade = imput.nextInt();

                // verificação de as notas estão dentro do limite permitido > 0 e < 100
                while (grade < 0 || grade > 100) {
                    System.out.println("invalid value");
                    System.out.print("Enter Grade: ");
                    grade = imput.nextInt();
                }
            }
            catch (Exception e){
                System.out.println("valores fora do padrão");
                gradeCounter = 10;
            }
            total = total + grade; //somando o valor total de todas as notas
            gradeCounter++; //incrementando em 1 o contador de acordo com a quantidade de notas que forem sendo inseridas
        }

        int average = total / 10;   //calculo average, média geral entre com as notas dos 10 alunos.

        //retornando os valores na tela
        System.out.println("Total of all 10 grade is: " + total);
        System.out.println("Class Average is: " + average);
    }
}
