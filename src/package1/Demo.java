package package1;

import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
// import java.util.Map;
// import java.util.Set;

public class Demo {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List list = new ArrayList();
        list.add("a");// 向集合中追加元素
        list.add(1, "b");// 向集合的制定位置中追加元素
        list.addAll(list);// 向集合追加一个collection，只可追加collection，由于java不提供collection的实现，由它的下级接口来实现
        list.addAll(4, list);// 与上述含义相同， “4”意为追加元素所放的位置
        int i = list.size();// 长度
        System.out.println(i);
        System.out.println(list.toString());
        list.get(0);// 根据元素下标来取集合中的元素
        list.remove(7);// 根据集合中元素下标位置来删除元素
        System.out.println(list.toString());
        // 此方法是用来比较的，与equals比较相似，现在list的元素中有[a, b, a, b, a, b, a],来和"a,b,c"比较会返回false，
        // 但是注意再用来比较String字符串的时候会进行局部的比较，两组字符串部分相同的情况下会返回true
        System.out.println(list.contains("a,b,c"));
        //为了将List转为数组，JDK提供了toArray
        //实现方式一：
        String [] array=(String[]) list.toArray(new String[list.size()]);
        for(String arrays: array) {
            System.out.println(arrays);
        }
        //方式二：
        String [] arr=new String [list.size()];
        list.toArray(arr);
        for(String arrs: arr) {
            System.out.println(arrs);
        }
        //在集合中判断是否为空 ，不空返回false，空会返回true，常常会与null！=list来共同判定集合是否为空，
        //null！=list和list.isempty最大的区别是：一个人要喝水，前者判断是否有水杯，后者判断的是水杯是否有水
        System.out.println(list.isEmpty());//false
        System.out.println(null!=list);//true
        //该方法去比较两个对象时，首先先去判断两个对象是否具有相同的地址，如果是同一个对象的引用，则直接放回true；如果地址不一样，
        //则证明不是引用同一个对象，接下来就是挨个去比较两个字符串对象的内容是否一致，完全相等返回true，否则false。
        //这里会涉及到hashcode相关内容，我会单独开一篇来介绍
        System.out.println(list.equals(arr));//false
        //在集合中查找元素 ，"a"如果有 ,返回所查找元素的下标,如果不存在则返回-1
        System.out.println(list.indexOf("a"));
        //打印集合元素
        //方式一：
        Iterator it=list.iterator();
        while(it.hasNext()) {
            String string=(String) it.next();
            System.out.println(string);
        }
        //方式二：
        for (Object o:list) {
            System.out.println(o);
        }
        //方式三：
        for(int s=0;s<list.size();s++) {
            System.out.println(list.get(s));
        }
        //将list释放，元素清空，且无返回值
        list.clear();
        System.out.println(list);

        
    
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1, "aaaa");
//        map.put(2, "bbbb");
//        map.put(3, "cccc");
//        System.out.println(map);
//        
//        Set<Integer> ks = map.keySet();
//        Iterator<Integer> it = ks.iterator();
//        while (it.hasNext()) {
//            Integer key = it.next(); // 获取 key
//            String value = map.get(key); // 通过 key 获取 value
//            System.out.println("key=" + key + " value=" + value);
//        }
//        
//        Collection<String> vs = map.values();
//        System.out.println(vs);
//        Iterator<String> it1 = vs.iterator();
//        System.out.println(it1.toString());
//        while (it1.hasNext()) {
//            String value = it1.next();
//            System.out.println(" value=" + value);
//        }
//        
//        Set<Map.Entry<Integer, String>> es = map.entrySet();
//        Iterator<Map.Entry<Integer, String>> it2 = es.iterator();
//        while (it2.hasNext()) {
//            Map.Entry<Integer, String> en = it2.next();
//            Integer key = en.getKey();
//            String value = en.getValue();
//            System.out.println("key=" + key + " value=" + value);
//        }
        
    }
    
}
