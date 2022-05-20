package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;


public class CheckSameArray {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class CheckSame{
        private int[] arr1;
        private int[] arr2;
        boolean tf;

        @Override
        public String toString() {
            return String.format("A배열과 B배열은 %s 입니다", tf);
        }
    }
    @FunctionalInterface private interface CheckSameService{
        CheckSame check(CheckSame c);
    }
    @Test
    void testCheckSame(){
        int[] arr1 = {1,3,2};
        int[] arr2 = {2,3,1};
        boolean tf;
        CheckSameService c = e ->{
            return CheckSame.builder().build();
        };

    }
}
