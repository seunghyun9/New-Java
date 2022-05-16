package kr.co.clozet.common.streams;

import kr.co.clozet.common.dataStructure.AppleApp;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class HelloStream {
    @Data
    public static class Hello{
    private String greeting, inLanguage;

    public Hello(Builder builder) {
        this.greeting = builder.greeting;
        this.inLanguage = builder.inLanguage;
    }
    @NoArgsConstructor
        static public class Builder{
        private String greeting,inLanguage;
        public Builder greeting(String greeting){this.greeting=greeting; return this;}
        public Builder inLanguage(String inLanguage){this.inLanguage=inLanguage;return this;}
    }
    }
    interface HelloService{
        Set<String> greet(String[] arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public Set<String> greet(String[] arr) {
            return Arrays.asList(arr)
                    .stream()
                    .filter(e -> e.startsWith("한국어"))
                    .collect(Collectors.toSet());

        }
    }

    @Test // 서버에 올라가면 삭제되는 기능
    void HelloStreamTest(){
        String[] arr = {"한국어 안녕", "영어 Hello"};
        HelloService h = new HelloServiceImpl();
        Set<String> s2 = h.greet(arr);
        s2.forEach(System.out::print);
    }
}
