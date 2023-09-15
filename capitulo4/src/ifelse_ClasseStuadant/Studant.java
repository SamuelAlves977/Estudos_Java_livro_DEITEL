package ifelse_ClasseStuadant;

public class Studant {
    private String name;
    private double average;

    //construtor da classe
    public Studant(String name, double average){
        this.name=name;

        if(average >= 0.0){
            if(average <= 100.0){
                this.average = average; // atribui á variavél de instância
            }
        }
    }

    //define o nome de Student
    public void setName(String name) {
        this.name = name;
    }
    //recupera o nome de Student
    public String getName(){
        return name;
    }

    // define a média de ifelse_ClasseStuadant.Studant
    public void setAverage(double average){
        if(average > 0.0){
            if(average <100.0){
                this.average = average;
            }
        }
    }

    public double getAverege(){
        return average;
    }

    public String getLetterGrade(){
        String letterGrade = "";

        if (average >=90.0){
            letterGrade ="A";
        }else if(average >=80.0){
            letterGrade = "B";
        }else if(average >= 70.0){
            letterGrade = "C";
        }else if(average >= 60){
            letterGrade = "D";
        }else
            letterGrade = "F";
        return letterGrade;
    }
}
