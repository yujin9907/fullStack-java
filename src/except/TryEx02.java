package except;

class 동물{}
class 강아지 extends 동물{}
class 개1 extends 강아지{}
class 개2 extends 강아지{}

public class TryEx02 {

    public static void main(String[] args) {
        동물 s1 = new 강아지();
        강아지 s2 = null;

        try {
            s2 = (개1) s1;
        } catch (RuntimeException e){ // 런타임익셉션: 런타임시 무슨 문제가 날지 모름
            // 클래스, 널익셉션 ... 의 부모임(정확히 모름). 알아서 오버라이딩하기 때문에 런타임을 잡아서 getmessage하면 class익셉션에 getmessage가 알아서 호출됨
            // 즉, 모르겠다 하면 일단 런타임익셉션을 걸어야 됨
            System.out.println(e.getMessage());
            s2 = new 개1();
            // 문자전송
            // 파일로 기록
        }
    }
}
