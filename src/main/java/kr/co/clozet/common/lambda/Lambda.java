package kr.co.clozet.common.lambda;
import static kr.co.clozet.common.dataStructure.AppleList.Apple;
import com.sun.jdi.IntegerType;

import java.io.File;
import java.util.Arrays;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
//        System.out.println(Lambda.integer("900"));
        System.out.println(Lambda.string(900));
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(string(
                Arrays.asList(
                        new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                        new Apple.Builder().origin("영동").color("BLUE").price(3000).build(),
                        new Apple.Builder().origin("풍기").color("BLUE").price(3000).build()
                )
        ));
        System.out.println(equals("홍길동", "홍"));
        System.out.println(equals("홍길동", "홍길동"));
        System.out.println(array(8).length);
    }

    public static int integer(String arg) {
//        Integer i = Integer.parseInt("900")  << i 는 객체가 아니다 속성만 있지 기능이 없음
        Function<String, Integer> f = Integer::parseInt; // <파라미터타입, 리턴타입> // :: 메소드 참조
        return f.apply(arg);
    }

    public static String string(Object o) {
//        String s = String.valueOf(o); // JSON.stringify() // JSON을 문자열로 반환
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
    }

    public static boolean equals(String s1, String s2) {
//        boolean b = "홍길동".equals("홍%");
        BiPredicate<String, String> p = String::equals; // Predicate은 이미 리턴타입이 boolean으로 fix
        return p.test(s1, s2);
    }

    //    int[] arr = new int[8];
//    int 타입의 size를 파라미터로 던지면 arr가 생성됨
    public static int[] array(Integer i) {
        Function<Integer, int[]> f = int[]::new;
        return f.apply(i);
    }

    public static int random(Integer start, Integer end) {
        Supplier<Double> d = Math::random;
        return (int) (d.get() * end) + start;
    }
    int random(int min,int max){
        Supplier<Double> f = Math::random;
        return (int)(f.get()*max)+min;
    }
    public static int random2(int min, int max){
        BiFunction<Integer, Integer, Integer> f = (min2, max2) -> (int)(Math.random()*max2)+min2;  //Bi 는 바이사클로 파라미터 2개가 들어감을 의미
        return f.apply(min,max);
        // static으로 껍데기만 우선 생성 된 것, public static int random2(int min, int max)은 이미 존재했기에 밑에 파라미터 이름을 다르게 준다.
        // 위의 min max 와 아래 min max 가 같으면 실행 순서가 달라짐,
    }
    public static File makeFile(String a){
        Function<String, File> f = File::new;
        return f.apply(a);
    }

}
