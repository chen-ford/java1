package test;

import org.junit.Assert;
import org.junit.Test;

public class TestCook {
    @Test
    public void test() {
        String expected = "厨师正在聊天";
        String actual = Cook.chat();
        Assert.assertEquals("有bug", expected, actual);
    }
}
