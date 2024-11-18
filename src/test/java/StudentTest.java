import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCalculateGrade() {
        Student student = new Student("Ahmed", 82.0);
        String grade = student.calculateGrade();
        Assert.assertEquals("B", grade, "Grade should be B");
    }
}

