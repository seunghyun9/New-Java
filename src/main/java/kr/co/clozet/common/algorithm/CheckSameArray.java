package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

public class CheckSameArray {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Array{
        private String result;
        private int[] arr1;
        private int[] arr2;

        @Override
        public String toString(){
            return String.format("배열과 배열은 %s배열이다.",result);
        }
    }
    @FunctionalInterface private interface ArrayService{
        Array array(Array array);
    }
    @Test
    void Test(){
        int[] arr1 = {1,3,2};
        int[] arr2 = {2,3,1};

        ArrayService f = e-> {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {

                } else {
                    continue;
                }
            }
            return Array.builder().arr1(arr1).arr2(arr2).build();
        };
        Array array = Array.builder().build();
        System.out.println(f.array(array));
    }
}
