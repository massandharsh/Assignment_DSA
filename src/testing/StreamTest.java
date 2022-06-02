package testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static question.Stream.indexOf;


public class StreamTest {
    @Test
    public void findElement(){
        assertEquals(4,indexOf(new int[]{1,2,3,4,5,6,7,8},5));
        assertNotEquals(3,indexOf(new int[]{1,10,12,17},100));
        assertEquals(-1,indexOf(new int[]{10,30,80,100,500},20));
        assertEquals(5,indexOf(new int[]{1,2,10,100,7000,8000,160000},8000));
        assertEquals(0,indexOf(new int[]{1},1));
    }
}
