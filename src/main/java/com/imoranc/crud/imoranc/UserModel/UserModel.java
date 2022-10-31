package com.imoranc.crud.imoranc.UserModel;

import javax.persistence.*;

@Entity
@Table(name = "userModel")
public class UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true, length = 10)
    private long id;
    @Column(name = "nombre", nullable = false , length = 255)
    private String name;
    @Column(name = "apellido", nullable = false , length = 255)

    private String surname;
    @Column(name = "pais", nullable = false , length = 255)

    private String country;
    @Column(name = "ocupacion", nullable = false , length = 255)

    private String ocupation;
    @Column(name = "profesional", nullable = false , length = 255)

    private String profesional;
    @Column(name = "edad", nullable = false , length = 20)

    private Integer age;

    public UserModel()
    {
        name="ivan";
        surname="moran";
        country="peru";
        ocupation="informatico";
        profesional="informatico";
        age=33;
    }

    public UserModel(String name, String surname, String country, String ocupation, String profesional, Integer age) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.ocupation = ocupation;
        this.profesional = profesional;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
