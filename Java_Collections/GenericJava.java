package Java_Collections;

public class GenericJava<T>{
    T container;
    public  GenericJava(T container){
        this.container = container;
    }
    public Object getValue(){
        return this.container;
    }

    public static void main(String[] args) {
        GenericJava<String> s = new GenericJava<>("Kumud");
        System.out.println(s.getValue());

        System.out.println(s.container.getClass().getName());

        GenericJava<Integer> i = new GenericJava<>(123);
        System.out.println(i.getValue());
    }

}