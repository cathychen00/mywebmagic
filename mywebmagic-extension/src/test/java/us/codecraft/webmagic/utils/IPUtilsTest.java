package us.codecraft.webmagic.utils;

import org.junit.Test;
import us.codecraft.webmagic.utils.IPUtils;

/**
 * @author code4crafer@gmail.com
 */
public class IPUtilsTest {

    @Test
    public void testGetFirstNoLoopbackIPAddresses() throws Exception {
        System.out.println(IPUtils.getFirstNoLoopbackIPAddresses());
    }
}
