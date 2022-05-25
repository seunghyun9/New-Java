package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;


/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :Fruits.java
 * author          : kimseunghyun
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           kimseunghyun      최초 생성
 **/
public class Fruits {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    private static class Solution{
        private int[][] arr;
        private int sum, avgA, avgG, avgO;

        @Override
        public String toString() {
            return String.format("총합: %d, 사과평균: %d, 포도평균: %d, 오렌지평균: %d", sum, avgA, avgG, avgO);
        }
    }

    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }

    @Test
    void testSolution(){
        int[][] arr = {
                {10000, 20000, 12000},
                {8000, 3000, 15000},
                {20000, 15000, 38000},
                {13000, 20000, 30000},
                {30000, 12000, 20000},
                {35000, 30000, 25000},
                {50000, 23000, 10000}
        };
        ISolution f = e -> {
            int sum = 0;
            int apple = 0;
            int grape = 0;
            int orange = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j==0) {
                        apple += arr[i][j];
                    } else if (j==1) {
                        grape += arr[i][j];
                    } else {
                        orange += arr[i][j];
                    }
                    sum += arr[i][j];
                }
            }
            return Solution.builder().sum(sum).avgA(apple/arr.length).avgG(grape/arr.length).avgO(orange/arr.length).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }










}
