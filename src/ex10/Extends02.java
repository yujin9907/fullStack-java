package ex10;

class Animal{
	int num=10;
}
class Dog extends Animal{ // 부모는 자식이 많을 수 있지만 자식은 하나밖에 상속 못함. 다중 상속 안 됨
	int num=20;
}

public class Extends02 {

	public static void main(String[] args) {
		Dog d = new Dog(); // 포인터는 현재, 도그를 가리키고 dog, animal이 메모리에 뜬 상태 ->dog, animal
		System.out.println(d.num);
		Animal a = new Dog(); // 마찬가지로 두개가 다 뜬 상태, dog, ->animal 포인터는 현재 애니멀을 가리킴
		System.out.println(a.num);
		
	}

}
