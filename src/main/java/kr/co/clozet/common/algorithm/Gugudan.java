package kr.co.clozet.common.algorithm;


import lombok.*;
import org.junit.jupiter.api.Test;

public class Gugudan {//입력받을 값이 없어서 위에 생략 가능
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        int [][]arr = new int[18][19];

        @Override
        public String toString(){
            return String.format("");
        }
    }

    @FunctionalInterface interface Isolution{
        void solution();
    }
    @Test
        void Test(){
        Isolution i = () -> { //함수형 객체를 만드는 공식
        };
        i.solution();

    }
}
