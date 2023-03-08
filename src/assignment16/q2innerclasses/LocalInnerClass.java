package assignment16.q2innerclasses;

class OuterClass{
    public void outerMethod(){
        System.out.println("This is a method of Outer class");
        //Local inner class defined inside the outer method
        class InnerClass{
            public void innerMethod(){
                System.out.println("This is method of Inner class");
            }
        }
        InnerClass innerClassObject = new InnerClass();
        innerClassObject.innerMethod();
    }

}
public class LocalInnerClass {
    public static void main(String[] args) {
         OuterClass outerClassObject = new OuterClass();
         outerClassObject.outerMethod();
    }
}

/*
This is a method of Outer class
This is method of Inner class
 */