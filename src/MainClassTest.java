import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        Assert.assertEquals("метод возвращает не 14",14, MainClass.getLocalNumber());
    }
    @Test
    public void testGetClassNumber(){
        MainClass mc = new MainClass();
        int tmp = mc.getClassNumber();
        System.out.println(tmp);
        Assert.assertTrue("меньше или равно 45", tmp > 45);
    }
    @Test
    public void testGetClassString(){
        MainClass mc = new MainClass();
        String tmp = mc.getClassString();
        System.out.println(tmp);
        int index1 = tmp.lastIndexOf("hello");
        int index2 = tmp.lastIndexOf("Hello");
        Assert.assertTrue("нет подстроки hello или Hello",index1 != -1 || index2 != -1);
    }
}
