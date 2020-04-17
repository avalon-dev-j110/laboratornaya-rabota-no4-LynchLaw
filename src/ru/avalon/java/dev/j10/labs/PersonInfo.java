package ru.avalon.java.dev.j10.labs;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PersonInfo implements Person {
    private String name;
    private Date birthDate;

    public PersonInfo(String name, String birthDate){
        this.name = name;
        try{
            String[] date = birthDate.split("\\.");
            Calendar calendar = Calendar.getInstance();
            int y = Integer.parseInt(date[2]);
            int m = Integer.parseInt(date[1]) - 1;
            int d = Integer.parseInt(date[0]);
            calendar.set(y, m, d);
            this.birthDate = calendar.getTime();
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
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
