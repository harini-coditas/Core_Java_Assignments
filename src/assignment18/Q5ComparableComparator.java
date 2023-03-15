package assignment18;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    int id;
    String name;
    float salary;
    Employee(){

    }
    Employee(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public int compareTo(Employee o){
        return (int)(this.salary-o.salary);
    }
}
class SortByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Q5ComparableComparator extends Employee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"harini", 17000));
        list.add(new Employee(2,"krati", 17000));
        list.add(new Employee(3, "shreya", 25000));
        list.add(new Employee(4,"mrunmai", 22000));
        list.add(new Employee(5, "aniket", 18000));
        list.add(new Employee(6,"adi",13000));
//     Comparable<Employee> comparable = new Comparable<Employee>() {
//         @Override
//         public int compareTo(Employee o) {
//             if(o.salary>15000)
//             return o.id;
//         }
//     };
//
//        Comparator<Employee> comparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
        Collections.sort(list,new SortByName());
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

       // Collections.sort(list);
        for(Employee e:list){
            if(e.salary>15000){
                System.out.println("id: "+e.id+" salary: "+e.salary+" name: "+e.name);
            }
        }

    }
}

/*
Employee{id=6, name='adi', salary=13000.0}
Employee{id=5, name='aniket', salary=18000.0}
Employee{id=1, name='harini', salary=17000.0}
Employee{id=2, name='krati', salary=17000.0}
Employee{id=4, name='mrunmai', salary=22000.0}
Employee{id=3, name='shreya', salary=25000.0}
id: 5 salary: 18000.0 name: aniket
id: 1 salary: 17000.0 name: harini
id: 2 salary: 17000.0 name: krati
id: 4 salary: 22000.0 name: mrunmai
id: 3 salary: 25000.0 name: shreya
 */