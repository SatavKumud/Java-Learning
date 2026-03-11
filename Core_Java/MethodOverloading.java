package  Core_Java;
public class MethodOverloading {

    static void foo(){
        System.out.println("Good morning bro");
    }

    static void foo(int a){
        System.out.println("Good morning"+ a+ "bro");
    }


//    static void change(int x){//value will not change as the copy is sent
//        x = 98;
//    }
//    static void change2(int [] arr){ //refernce is passed so the value will change
//        arr[0] = 98;
//    }
    public static void main(String[] args) {
        //int [] marks ={45, 67,98,98,34};
        //changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("Value of x after running change:"+ x);

        //changing the array
//        change2(marks);
//        System.out.println("The value of x after running change2: "+ marks[0]);



        //Method Overloading
        foo();
        foo(3000);

    }
}
