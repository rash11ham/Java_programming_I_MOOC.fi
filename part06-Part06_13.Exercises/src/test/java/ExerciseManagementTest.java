
import static org.junit.Assert.assertEquals;
import org.junit.Test;




public class ExerciseManagementTest {

    @Test
    public void ExerciseManagementInitialValue(){
        ExerciseManagement em = new ExerciseManagement();
        assertEquals(0,em.getValue());
    }
    
    @Test
    public void valueFiveWhenFiveAdded() {
        ExerciseManagement em = new ExerciseManagement();
        em.add(5);
        assertEquals(5, em.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        ExerciseManagement em = new ExerciseManagement();
        em.subtract(2);
        assertEquals(-2, em.getValue());
    }
}
