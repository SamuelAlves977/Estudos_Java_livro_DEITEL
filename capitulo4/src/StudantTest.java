public class StudantTest {
    public static void main(String []args){
        Studant account1 = new Studant("samuel", 90);
        Studant account2 = new Studant("Doug", 50);
        Studant account3 = new Studant("Vivi", 95);

        System.out.printf("%s's latter grade is: %s%n", account1.getName(),account1.getLetterGrade());
        System.out.printf("%s's latter grade is: %s%n", account2.getName(),account2.getLetterGrade());
    }
}
