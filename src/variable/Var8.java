package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;
        double d = 10.0;

        /*메모리를 작게 사용하면 작은 숫자를 표현할 수 있고, 메모리를 많이 사용하면 큰 숫자를 표현할 수 있다.
        * 변수를 선언하면 표현 범위에 따라 메모리 공간을 차지한다. 그래서 필요에 맞도록 다양한 타입을 제공한다.*/


        /*다음 타입은 실무에서 거의 사용하지 않는다.
        * byte, short, float, char
        * 참고 : 메모리 용량은 매우 저렵하다. 따라서 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효과적이다.*/
    }
}
