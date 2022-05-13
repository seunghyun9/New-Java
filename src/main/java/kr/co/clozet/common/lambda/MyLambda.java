package kr.co.clozet.common.lambda;

public class MyLambda {
    @FunctionalInterface interface MyFunction{ int execute(String arg);}
    @FunctionalInterface interface MySupplier{ int execute();}
    @FunctionalInterface interface MyConsumer{ void execute(String arg);}
    @FunctionalInterface interface MyPredicate{ boolean execute(String arg);}

    @FunctionalInterface interface MyInterface{ String myMethod();}
    @FunctionalInterface interface MyUnaryOP{ int operator(Integer a);}
    @FunctionalInterface interface LengthOfString{ int execute(String arg);}
}
