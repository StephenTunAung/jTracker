package info.jtrac.wicket.yui;

import java.util.HashMap;
import java.util.Map;
import junit.framework.TestCase;

public class YuiUtilsTest extends TestCase {
    
    public void testJsonConversion() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("foo", true);
        map.put("bar", false);        
        assertEquals("{bar : false, foo : true}", YuiUtils.getJson(map));
    }
    
}
