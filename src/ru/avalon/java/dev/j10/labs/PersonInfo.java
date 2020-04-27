package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class PersonInfo implements Person {
    private String name;
    private Date birthDate;

    public PersonInfo(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int compareTo(Person person){
        int compare = this.name.compareTo(person.getName());
        if (compare == 0){
            compare = this.birthDate.compareTo(person.getBirthDate());
        }
        return compare;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getBirthDate() {
        return this.birthDate;
    }
}
