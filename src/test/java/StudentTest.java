import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testStudent() {
        Student naszPierwszyStudent = new Student("Tomasz", "Reksio", "1");

        naszPierwszyStudent.przedstawSie();

        Student naszDrugiStudent = new Student("Filemon","Kot", "2");
        naszDrugiStudent.przedstawSie();
    }
}
