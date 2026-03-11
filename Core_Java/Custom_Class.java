package Core_Java;
class Employee{
    int id;
    String name;

    public void printDetails(){
        //printing the properties
        System.out.println("The ID of the employee is: "+id);
        System.out.println("Name of the employee is: "+name);
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        Employee e =  new Employee(); //instantiating a new object
        Employee e1 = new Employee();

        // setting properties
        e.id = 32;
        e.name = "Kumud";

        e1.id = 33;
        e1.name = "Mamta";

        //calling custom method
        e.printDetails();
        e1.printDetails();
    }
}
