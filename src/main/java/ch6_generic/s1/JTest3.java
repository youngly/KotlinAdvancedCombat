package ch6_generic.s1;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.reflect.TypeToken;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JTest3 {

    <T> T printType(String s) {

        Person person = new Gson().fromJson("{\n" + "            \"age\":1\n" + "        }", new TypeToken<Person>() {
        });
        return (T) person;
    }

    public static void main(String[] args) {
        JTest3 jTest3 = new JTest3();
//        Integer x = jTest3.<Integer>printType("111");
//        x = 4;
//        System.out.println(x);

        System.out.println(jTest3.<Person>printType("").getAge());

        ArrayList<Student> c = new ArrayList<>();
        Collections.addAll(c, new Student[]{new Student("Tom", 2),
                new Student("Jerry", 3), new Student("Lucy", 2)});

        Map<Integer, List<Student>> integerListMap = jTest3.listToMapByGroup(c, Student::getClassNum);
        System.out.println(integerListMap);

        Map<Integer, List<Student>> collect = c.stream().collect(Collectors.groupingBy(Student::getClassNum));
        System.out.println(collect);

        System.out.println(jTest3.<Integer, String>trans(1));

        // 泛型不支持基本类型
//        JTest3.<int>getValue(1);
    }

    public static <T> T getValue(T a) {
        return a;
    }

    public <I, R> R trans(I i) {
        return ((R) i);
    }

    public <K, V> Map<K, List<V>> listToMapByGroup(List<V> list, Function<V, K> function) {
        HashMap<K, List<V>> kvHashMap = new HashMap<>();
        for (V v : list) {
            K apply = function.apply(v);
            if (kvHashMap.containsKey(apply)) {
                kvHashMap.get(apply).add(v);
            } else {
                ArrayList<V> vs = new ArrayList<>();
                vs.add(v);
                kvHashMap.put(apply, vs);
            }
        }
        return kvHashMap;
    }
}

class Student {
    private final String name;
    private final int classNum;

    public Student(String name, int classNum) {
        this.name = name;
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public int getClassNum() {
        return classNum;
    }
}
