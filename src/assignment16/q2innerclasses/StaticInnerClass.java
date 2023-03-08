package assignment16.q2innerclasses;

class OuterClass2{
    private static int studentId = 3;
    public static class InnerClass2{
        public void innerMethod(){
            System.out.println("Accessing studentId using static class: "+studentId);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass2.InnerClass2 innerClass2Object = new OuterClass2.InnerClass2();
        innerClass2Object.innerMethod();
    }
}
/*
    Accessing studentId using static class: 3
  */

  /*
    since InnerClass is a static class, we can create objects of InnerClass without creating objects of OuterClass.
 Additionally, static inner classes cannot access non-static members of the outer class.
 */