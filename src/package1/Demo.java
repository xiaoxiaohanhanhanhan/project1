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
        list.add("a");// �򼯺���׷��Ԫ��
        list.add(1, "b");// �򼯺ϵ��ƶ�λ����׷��Ԫ��
        list.addAll(list);// �򼯺�׷��һ��collection��ֻ��׷��collection������java���ṩcollection��ʵ�֣��������¼��ӿ���ʵ��
        list.addAll(4, list);// ������������ͬ�� ��4����Ϊ׷��Ԫ�����ŵ�λ��
        int i = list.size();// ����
        System.out.println(i);
        System.out.println(list.toString());
        list.get(0);// ����Ԫ���±���ȡ�����е�Ԫ��
        list.remove(7);// ���ݼ�����Ԫ���±�λ����ɾ��Ԫ��
        System.out.println(list.toString());
        // �˷����������Ƚϵģ���equals�Ƚ����ƣ�����list��Ԫ������[a, b, a, b, a, b, a],����"a,b,c"�Ƚϻ᷵��false��
        // ����ע���������Ƚ�String�ַ�����ʱ�����оֲ��ıȽϣ������ַ���������ͬ������»᷵��true
        System.out.println(list.contains("a,b,c"));
        //Ϊ�˽�ListתΪ���飬JDK�ṩ��toArray
        //ʵ�ַ�ʽһ��
        String [] array=(String[]) list.toArray(new String[list.size()]);
        for(String arrays: array) {
            System.out.println(arrays);
        }
        //��ʽ����
        String [] arr=new String [list.size()];
        list.toArray(arr);
        for(String arrs: arr) {
            System.out.println(arrs);
        }
        //�ڼ������ж��Ƿ�Ϊ�� �����շ���false���ջ᷵��true����������null��=list����ͬ�ж������Ƿ�Ϊ�գ�
        //null��=list��list.isempty���������ǣ�һ����Ҫ��ˮ��ǰ���ж��Ƿ���ˮ���������жϵ���ˮ���Ƿ���ˮ
        System.out.println(list.isEmpty());//false
        System.out.println(null!=list);//true
        //�÷���ȥ�Ƚ���������ʱ��������ȥ�ж����������Ƿ������ͬ�ĵ�ַ�������ͬһ����������ã���ֱ�ӷŻ�true�������ַ��һ����
        //��֤����������ͬһ�����󣬽��������ǰ���ȥ�Ƚ������ַ�������������Ƿ�һ�£���ȫ��ȷ���true������false��
        //������漰��hashcode������ݣ��һᵥ����һƪ������
        System.out.println(list.equals(arr));//false
        //�ڼ����в���Ԫ�� ��"a"����� ,����������Ԫ�ص��±�,����������򷵻�-1
        System.out.println(list.indexOf("a"));
        //��ӡ����Ԫ��
        //��ʽһ��
        Iterator it=list.iterator();
        while(it.hasNext()) {
            String string=(String) it.next();
            System.out.println(string);
        }
        //��ʽ����
        for (Object o:list) {
            System.out.println(o);
        }
        //��ʽ����
        for(int s=0;s<list.size();s++) {
            System.out.println(list.get(s));
        }
        //��list�ͷţ�Ԫ����գ����޷���ֵ
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
//            Integer key = it.next(); // ��ȡ key
//            String value = map.get(key); // ͨ�� key ��ȡ value
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
