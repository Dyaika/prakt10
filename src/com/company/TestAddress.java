package com.company;

public class TestAddress {
    public static void test(){
        String str = "Country, Region, City, Street, House, Building, Apartment";
        Address a = new Address(str);
        System.out.println(str + ":");
        System.out.println(a + "\n");

        str = "Country. Region. City. Street. House. Building. Apartment";
        System.out.println(str + ":");
        a = new Address(str);
        System.out.println(a + "\n");

        str = "Country; Region; City; Street; House; Building; Apartment";
        System.out.println(str + ":");
        a = new Address(str);
        System.out.println(a + "\n");

        str = "Country- Region- City- Street- House- Building- Apartment";
        System.out.println(str + ":");
        a = new Address(str);
        System.out.println(a);
    }
}
