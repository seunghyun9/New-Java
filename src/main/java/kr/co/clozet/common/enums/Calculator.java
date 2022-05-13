package kr.co.clozet.common.enums;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

public class Calculator {

    @RequiredArgsConstructor enum Operation{
        PLUS("+",(x,y)->(x+y)),
        MINUS("-",(x,y)->(x-y)),
        MULTI("*",(x,y)->(x*y)),
        DIV("/",(x,y)->(x/y))
        ; // +,-가 enum 처리 될 상수들
        private final String opcode;
        private final BiFunction<Integer, Integer, Integer> f; //Alt + Enter 로 둘 다 잡고 Enter
        @Override public String toString() {return opcode;}
        public int execute (int a, int b){return f.apply(a,b);}// 호출해서 진짜 내부에서 작동하는건 f.apply, CallBack함수
    }
    @Test
        void calculatorTest(){
        System.out.println("+:" + Operation.PLUS.execute(7,5));
        System.out.println("-:" + Operation.MINUS.execute(7,5));
        System.out.println("*:" + Operation.MULTI.execute(7,5));
        System.out.println("/:" + Operation.DIV.execute(7,5));
    }
    }
