package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        private int[] arr;
        private int max, min; //elem 은 for loop에 들어 갈 때 돌아가는 값
        @Override
        public String toString(){
            return String.format("최소값:%d, 최대값:%d" ,min,max);

        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void Test(){
        int[] arr = {3,1,9,5,10};
        SolutionService f = e ->{
            int max = 0;
            int min = 10;
            for(int i : e.getArr()){
                if(i<min) min=i;
                else if(i>max) max=i;
            }
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));


    }
}
/***
public int getmin(){
        int[] intArr={3,5,1,9,10};
        Integer max = Arrays.stream(intArr) //기본배열을 intStream으로 반환
        .max()  //결과를 Optional객체로 반환
        .getAsInt();
        return
 ***/

