package ch6_generic.s1;

import java.util.ArrayList;
import java.util.List;

public class JTest4 {
    public static void main(String[] args) {
//        String[] strings = new String[10];
//        Object[] objects = strings;
//        objects[0] = 1;

        List a = new ArrayList<String>();
        a.add(1);
        a.add("");
        a = new ArrayList<Integer>();
        a.add(1);
        a.add(new JTest3());

//        Class<Number> numberClass = Integer.class;

    }

    public static void addItem(List<?> list) {

    }
}
