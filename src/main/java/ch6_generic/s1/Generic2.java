package ch6_generic.s1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Generic2 {
    public static void main(String[] args) {
        new GenericChild().printType();
        // 类型 Type，编译不过，Father<String> != Father<Integer>
//        Father<String> father = new Father<Integer>();
    }
}

class Father<T> {
    public void printType() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        System.out.println(genericSuperclass);
        if (genericSuperclass instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            System.out.println(actualTypeArguments[0]);
        }
    }
}

class GenericChild extends Father<String> {

}
