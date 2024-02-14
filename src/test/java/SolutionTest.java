import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String num = "1432219";
        int k = 3;
        String expected = "1219";
        String actual = new Solution().removeKdigits(num, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test2(){
        String num = "10200";
        int k = 1;
        String expected = "200";
        String actual = new Solution().removeKdigits(num, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test3(){
        String num = "10";
        int k = 2;
        String expected = "0";
        String actual = new Solution().removeKdigits(num, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test4(){
        String num = "9";
        int k = 1;
        String expected = "0";
        String actual = new Solution().removeKdigits(num, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test5(){
        String num = "112";
        int k = 1;
        String expected = "11";
        String actual = new Solution().removeKdigits(num, k);

        Assert.assertEquals(expected, actual);

    }
}
