package com.example.SpringDataJPA;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Student2")
@Table(
        name = "student2",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "student_email_unique", columnNames = "email"
                )
        }
)
public class Student2 {
   @Id  //No identifier was there so to provide it we used @Id annotation and it shows id is primary key
   @SequenceGenerator(
           name = "student2_sequence",
           sequenceName = "student2_sequence",
           allocationSize = 1  //how much the sequence increase from
   )
   @GeneratedValue(
           strategy = SEQUENCE,
           generator = "student2_sequence"
   )
   @Column(
           name = "id",
           updatable = false

   )
    private Long id;

   @Column(
           name = "firstName",
           nullable = false,
           columnDefinition = "TEXT"

   )
    private String firstName;

    @Column(
            name = "lastName",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private  String lastName;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String email;

    @Column(
            name = "age",
            nullable = false
    )
    private Integer age;


    public Student2(
                    String firstName,
                    String lastName,
                    String email,
                    Integer age) {
       
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
