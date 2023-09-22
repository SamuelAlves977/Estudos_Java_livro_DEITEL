package assunto_while;

import java.util.Scanner;

public class MediaSentinela {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);

        int total=0;
        int counter =0;

        System.out.print("Valor da primeira nota nota: ");
        int grade = read.nextInt();

        while (grade != -1){
            total = total + grade;
            counter ++;

            System.out.print("Enter grade or -1 to quit: ");
            grade = read.nextInt();
        }
        if(counter != 0){
            double media = (double)total/counter;
            System.out.printf("%nTotal de %d grades entered is %d%n", counter, total);
            System.out.printf("Valor da media: %.2f%n",media);
        }else {
            System.out.print("No grades were entered");
        }
    }
}

