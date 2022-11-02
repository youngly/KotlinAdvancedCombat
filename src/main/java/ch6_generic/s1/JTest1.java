package ch6_generic.s1;

import java.util.ArrayList;
import java.util.List;

public class JTest1 {
    public static void main(String[] args) {
        // javap -c JTest1.class
        // 反编译发现类型被擦除了
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
    }
}
