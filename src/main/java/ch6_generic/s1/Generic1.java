package ch6_generic.s1;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Generic1 {

    static class InnerClass<T> {
    }

    public static void main(String[] args) {
        InnerClass<String> stringInnerClass = new InnerClass<String>() {
        };
        Type genericSuperclass = stringInnerClass.getClass().getGenericSuperclass();
        System.out.println(genericSuperclass);
        ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? ((ParameterizedType) genericSuperclass) : null;
        Type actualTypeArgument = parameterizedType.getActualTypeArguments()[0];
        System.out.println(actualTypeArgument);

    }
}
