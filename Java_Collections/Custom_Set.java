package Java_Collections;

import java.util.*;

public class Custom_Set  {
    String name;
    int rollno;
    public Custom_Set(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    @Override
    public String toString(){
        return "Custom_Set{" +
                "name =' "+ name + '\'' +
                ", rollno= "+ rollno +
                '}';
    }

    //if equals is overriden hashcde must be overridden
    @Override
    public boolean equals(Object o){
        if(this == o) return true; //agar obj same hai dono ka to same hai hi
        if(o == null || getClass() != o.getClass()) return false; //agar ek bhi null
        // hai to dono same nahi cause real obj can never be null
        //getClass() != o.getClass() --> ensures both objs are of same class prevents comparing with diff class objs
        Custom_Set student = (Custom_Set) o; // --> typecasting converts obj into your class so fields can be accessed.
        return rollno == student.rollno; // aur agar roll no same hai to same hai
    }
    @Override
    public int hashCode(){
        return Objects.hash(rollno); //calls hashCode() if hash matches
        // calls equals() if equals returns true i.e duplicate and rejected
    }
    //without equals and hashCode methods which specifies the difference between value.
    // our hashset or any other set treats new object as different element.
    // and accept the duplicate values also
    //so we need to define seperately using equals and hashCode function the difference logic to get the difference between values.

    public static void main(String[] args) {
        Set<Custom_Set> student= new HashSet<>();
        student.add(new Custom_Set("Kumud", 32));
        student.add(new Custom_Set("Mamta", 33));
        student.add(new Custom_Set("Sarita", 34));
        student.add(new Custom_Set("Mamta", 32)); //because of equals and hashCode this value is added once
        // because its treated as duplicate value
        //if we remove the equals and hashCode method then it will treat it as unique value and add in the set.


        System.out.println(student);
    }

    
}
