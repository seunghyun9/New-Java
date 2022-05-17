package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        private int start,end;
        private int[] prims;

    @Override
    public String toString(){

        return String.format("");
    }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution solution);
    }
    @Test
    void Test(){
        List<Integer> l = Arrays.asList();
    }

}
