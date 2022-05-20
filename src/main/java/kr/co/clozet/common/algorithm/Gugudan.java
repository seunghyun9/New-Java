package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :Gugudan.java
 * author          : kimseunghyun
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           kimseunghyun      최초 생성
 **/
public class Gugudan {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    static class Solution{
        int[][] arr;

        @Override
        public String toString() {
            return String.format("");
        }
    }



    @FunctionalInterface private interface ISolution{
        void solution();
    }

    @Test
    void testSolution(){
        ISolution is = () -> {
            for(int k = 2; k < 10; k+=4) {
                for (int i = 1; i < 10; i++) {
                    for (int j = k; j < k+4; j++) {
                        System.out.print(j + "*" + i+ "=" +(j*i)+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        };
        is.solution();
    }



}
