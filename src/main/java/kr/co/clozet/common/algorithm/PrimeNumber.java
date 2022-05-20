package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :PrimeNumber.java
 * author          : kimseunghyun
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           kimseunghyun      최초 생성
 **/
public class PrimeNumber {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    private static class Solution{
        private int start, end;
        private List<Integer> primes;

        @Override
        public String toString() {
            return String.format("시작점: %d, 끝점: %d, 소수: %d", start, end, primes);
        }
    }

    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }

    @Test
    void primeTest(){
        List<Integer> list = Arrays.asList(0);
        SolutionService f = e -> {
            int count = 0;
            int start = 1;
            int end = 10;
            for (int i=start; i<=end; start++){
                for(int j=2; j<=start; j++){
                    if(start%j==0) {
                        count++;
                    }
                }
                if (count==1){
                    System.out.println(start+"");
                }
                count=0;
            }
            return Solution.builder().start(1).end(10).primes(list).build();
        };
        Solution s = Solution.builder().primes(list).build();
        System.out.println(f.solution(s));

    }












}
