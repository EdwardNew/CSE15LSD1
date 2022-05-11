import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testMultiplyInts(){
        assertEquals(0, SkillDemo.multiplyInts(2, 3));
    }
}