import java.util.ArrayList;

public class Student {
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(ArrayList<Integer> grades){
        double average = 0.0;
        for(Integer grade: grades){
            average += grade;
        }
        return average / grades.size();
    }


    private long id;
    private static String name;
    private static ArrayList<Integer> grades;
}
