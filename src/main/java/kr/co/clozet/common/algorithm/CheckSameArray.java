package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :CheckSameArray.java
 * author          : kimseunghyun
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           kimseunghyun      최초 생성
 **/
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
