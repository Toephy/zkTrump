import java.util.*;

/**
 * Created by Toephy on 2016.12.15 17:03
 */
public class Test {
    // 在以上代码中，若临时变量s为空的话，则会进入死循环。
    // 这是由于没有正确的理解continue的用法，
    // continue会结束其后跟随的语句而直接开始下一次的循环，
    // 在这里s为空，则直接进行下一次循环，没有执行到it.next()，
    // 所有iterator的序列值没有发生变化，hasNext永远都是真，进入死循环。
    //
    // 另外，在对集合做遍历操作的时候不允许有插入或者删除操作，否则会抛异常。
    // 若要删除可以使用iterator的remove方法，也可以在元素中做一个标记，循环结束后再做操作。
    /*public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("yaoyuan");
        list.add("tiancai");

        Iterator it = list.iterator();
        String s = null;
        while (it.hasNext()) {
            System.out.println("aaa");
            if (s == null) {
                System.out.println("@@@");
                continue;
            }
            // System.out.println(it.next());
            if ((it.next()).equals("yaoyuan")) {
                it.remove();
            }
        }
        for (String string : list) {
            System.out.println(string);
        }
    }*/

    public static void main(String[] args) {

        Map<String, Boolean> serviceStatusMap = new HashMap<String, Boolean>();
        serviceStatusMap.put("Novel_Index_Service", false);
        serviceStatusMap.put("VIP_BOOK_CATALOG", false);

        for (Iterator<String> it = serviceStatusMap.keySet().iterator(); it.hasNext(); ) {
            String serviceName = it.next();

            System.out.println("$服务状态监控获取服务[" + serviceName + "]状态为:" + serviceStatusMap.get(serviceName));

            if (serviceStatusMap.get(serviceName) == false) {

                if (1 < 2) {
                    continue;
                } else {
                    //超过一定时间重试服务，重置状态
                    System.out.println("超过一定时间重试服务，重置状态");
                }
            }
        }
    }
}
