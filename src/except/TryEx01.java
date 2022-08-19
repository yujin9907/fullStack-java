package except;

class 지구인 {}
class 아시아인 extends 지구인{}
class 아프리카인 extends 지구인{}
class 한국인 extends 아시아인{}

public class TryEx01 {
    // 상속은 타입을 일치시키기 위함. 물려받기 위해선 컴포지션도 가능

    한국인 p1=new 한국인();
}
