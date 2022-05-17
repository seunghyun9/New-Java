package kr.co.clozet.common.streams;

import kr.co.clozet.common.dataStructure.AppleApp;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HelloStream {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Hello{
        private String greeting, inLanguage;

        @Override
        public String toString() {
            return String.format(" 인사 : %s, %s", inLanguage,greeting);
        }
    }
    interface HelloService{
        Set<Hello> greet(List<Hello> arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public Set<Hello> greet(List<Hello> arr) {
            return arr
                    .stream()
                    .filter(e -> e.getInLanguage().equals("영어"))
                    .collect(Collectors.toSet());
        }
    }
    @Test
    void helloTest(){
        List<Hello> arr = Arrays.asList(
                Hello.builder().inLanguage("영어").greeting("Hello").build(),
                Hello.builder().inLanguage("한국어").greeting("안녕").build()
        );
        new HelloServiceImpl()
                .greet(arr)
                .forEach(System.out::print);
    }
}
