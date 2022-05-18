package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

public class Fruits {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        private int [] arr;
        private int sum, apple, orange, grape;

        @Override
        public String toString(){
            return String.format("총합: %d, 사과평균: %d, 포도평균: %d, 오렌지평균: %d", sum, apple, orange, grape);
        }
        @FunctionalInterface interface ISolution{
            Solution solution(Solution s);
        }
        @Test
        void solutionTest(){}
    }
}
