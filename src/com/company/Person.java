package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.PublicKey;

public class Person {
    private StringBuilder first_name;
    private StringBuilder last_name;
    private StringBuilder otchestvo;

    public Person(String last_name) {
        this.last_name = new StringBuilder().append(last_name);
    }

    public Person(String first_name, String last_name) {
        this.first_name = new StringBuilder().append(first_name);
        this.last_name = new StringBuilder().append(last_name);
    }

    public Person(String first_name, String otchestvo, String last_name) {
        this.first_name = new StringBuilder().append(first_name);
        this.last_name = new StringBuilder().append(last_name);
        this.otchestvo = new StringBuilder().append(otchestvo);
    }
    public String getFIO(){
        StringBuilder temp = new StringBuilder().append(last_name);
        if (first_name != null && !first_name.isEmpty()){
            temp.append(' ');
            temp.append(first_name.charAt(0));
            temp.append('.');
            if (otchestvo != null && !otchestvo.isEmpty()){
                temp.append(otchestvo.charAt(0));
                temp.append('.');
            }
        }
        return temp.toString();
    }

    public static void testPerson(){
        Person p1 = new Person("Barinov");
        Person p2 = new Person("Viktor", "Barinov");
        Person p3 = new Person("Viktor", "Petrovich", "Barinov");
        System.out.println(p1.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
    }
}
