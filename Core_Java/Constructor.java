package Core_Java;
class MainEmp{
    private  int id;
    private String name;


    //constructor
    public MainEmp(){
        id = 32;
        name = "Satav Kumud";
    }
    public MainEmp(String myname){
        id = 32;
        name = myname;
    }


    //will we make all these setter and getter methods for all the properties
    // if they are 1000 they will will not do so tht where constructor cmes in picture
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

}


public class Constructor {

    public static void main(String[] args) {
        MainEmp me = new MainEmp("Kumud Satav");
        System.out.println(me.getId());
        System.out.println(me.getName());
    }
}
