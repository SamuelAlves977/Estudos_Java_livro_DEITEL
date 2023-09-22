package assunto_while;

import java.util.Scanner;

public class MediaSentinela {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);

        int total=0;
        int counter =0;

        System.out.println("Valor da primeira nota nota");
        int grade = read.nextInt();

        while (grade != -1){
            total =+ grade;
            counter ++;

            System.out.print("Enter grade or -1 to quit");
            grade = read.nextInt();
        }
        if(counter != 0){
            double media = (double)total/counter;
            System.out.println("Total de notas:" +counter+" valor da media: " + media);
        }else {
            System.out.println("No grades were entered");
        }
    }
}
