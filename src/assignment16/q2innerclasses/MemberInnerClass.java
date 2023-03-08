package assignment16.q2innerclasses;

class OuterClass1{
    private int outerVariable = 13;
    public class InnerClass1{
        public void innerMethod(){
            System.out.println("Outer Class variable i: "+outerVariable);
        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass1 outerClass1Object = new OuterClass1();
        OuterClass1.InnerClass1 innerClass1Object = outerClass1Object.new InnerClass1();
        innerClass1Object.innerMethod();
    }
}

/*
Outer Class variable i: 13
 */