public class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        /*다형성에서 기억해야 할 것.
        * 1. 참조변수의 형에 따라 사용할 수 있는 멤버가 달라진다.
        * 2. 자손,조상 중복된 메서드는 오버라이딩된 메서드를 쓴다.
        * 3. 참조형과 인스턴스가 같아야하는 이유는 멤버를 사용하기 위함이다.
        * 4. 인스턴스에 따라 참조 변수의 형에 따라 멤버가 달라질 수 있다.
        *       다만 범위를 축소하는 것은 가능하지만 늘리는 것은 불가능 하다.*/

        System.out.println(p.x);        //100
        System.out.println(c.x);        //200

    }
}

class Parent    {
    int x = 100;

    void method()   {
        System.out.println("Parent Method");
    }
}
class Child extends Parent  {
    int x = 200;
    void method()   {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
