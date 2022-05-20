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
 * fileName        :RemoveDuplicateElementsArray.java
 * author          : kimseunghyun
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           kimseunghyun      최초 생성
 **/
public class RemoveDuplicatedElementsArray {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    static class DuplicatedArray{
        private int[] arr;
        private int[] result;

        @Override
        public String toString() {
            return String.format("중복된 요소를 제거한 새 배열: %d", result);
        }
    }
    @FunctionalInterface private interface DuplicatedArrayService{
        DuplicatedArray duplicate(DuplicatedArray d);
    }
    @Test
    void testDuplicated(){
        int[] arr = {5,10,9,27,2,8,10,4,27,1};
        int[] result = new int[10];
        DuplicatedArrayService d = e ->{
            return DuplicatedArray.builder().build();
            };
        }

}
