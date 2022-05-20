package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;


/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :MaxMin.java
 * author          : kimseunghyun
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           kimseunghyun      최초 생성
 **/
public class MaxMin {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    private static class Solution{
        private int[] arr;
        private int max, min;

        @Override
        public String toString() {
            return String.format("최솟값: %d, 최댓값: %d", min, max);
        }
    }

    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }

    @Test
    void testSolution(){
        int[] arr = {3, 1, 9, 5, 10};
        SolutionService f = e -> {
            int min = 10;
            for (int i : e.getArr()){
                if(i < min) min = i;
            }
            int max = 1;
            for (int i : e.getArr()){
                if(i > max) max = i;
            }
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }









}
