package java9.ch05;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by parkey19 on 2019. 7. 29..
 */
public class ProxyTest {

    public static Object[] createObj() {
        Object[] values = new Object[1000];

        for (int i = 0; i < values.length; i++) {
            Object val = new Integer(i);
            values[i] = Proxy.newProxyInstance(null, val.getClass().getInterfaces(),
                    (Object proxy, Method m, Object[] margs) -> {
                        System.out.println(val + "." + m.getName() + Arrays.toString(margs));
                        return m.invoke(val, margs);
                    }
            );

        }
        return values;
    }

    public static void main(String[] args) {
//        Class.forName(String.class);
        Object[] obj = ProxyTest.createObj();

        Arrays.binarySearch(obj, new Integer(500));
    }
}
