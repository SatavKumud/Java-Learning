package  Core_Java;
class MEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){

        return id;
    }
}
public class Private_AM {

    public static void main(String[] args) {
        MEmployee me = new MEmployee();
        me.setId(32);
        me.setName("Kumud Satav");

        System.out.println("My name is: " +me.getName());
        System.out.println("My empId is: "+me.getId());


    }
}
