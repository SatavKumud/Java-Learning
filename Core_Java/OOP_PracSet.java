package  Core_Java;
class Employee1{
    int ID;
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public String getNme(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}
public class OOP_PracSet {

    public static void main(String[] args) {
        Employee1 e =  new Employee1();
        e.salary = 20000;
        System.out.println(e.getSalary());
        e.setName("Kumud Satav");
        System.out.println(e.getNme());

    }
}
