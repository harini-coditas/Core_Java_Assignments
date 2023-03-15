package assignment18;

import java.util.Hashtable;
import java.util.Map;

public class Q1HashtableWorking {
    public static void main(String[] args) {
        Map<String,Integer> age = new Hashtable<>();
        age.put("Harini", 21);
        age.put("Krati", 21);
        age.put("Bala", 22);
        age.put("Sujan", 22);
        age.put("Yash", 23);
        System.out.println(age.get("Harini"));
        age.put("Harini", 22);
        System.out.println(age);
        age.putIfAbsent("Tanmay", 23);
        System.out.println(age);
        System.out.println(age.size());
    }
}

/*
21
{Krati=21, Sujan=22, Bala=22, Harini=22, Yash=23}
{Krati=21, Tanmay=23, Sujan=22, Bala=22, Harini=22, Yash=23}
6

 */