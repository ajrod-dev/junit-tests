import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testName(){
        Student student = new Student(001, "Alex");
        assertNotNull(student.getName());
        assertNotEquals(student.getName(), "");
    }
    @Test
    public void testStudentObj(){
        Student student = new Student(001, "Alex");
        assertNotNull(student);
    }
    @Test
    public void testStudentGrades(){
        Student student = new Student(001, "Alex");
        student.addGrade(100);
        assertNotNull(student.getGrades());
    }
    @Test
    public void testGetId(){
        Student student = new Student(001, "Alex");
        assertTrue(student.getId() >= 0);
    }
    @Test
    public void testGetGradeAverage(){
        Student student = new Student(001, "Alex");
        student.addGrade(100);
        student.addGrade(50);
        assertTrue(student.getGradeAverage(student.getGrades()) > 0 && student.getGradeAverage(student.getGrades()) < 100);
    }

}
