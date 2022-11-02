package ch6_generic.s1;

public class JTest2 {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "hello";
        System.out.println(strings[0]);

        Object[] a = strings;
        a[0] = "11";
        a[2] = 10;
    }
}
