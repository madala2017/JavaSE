package com.java.se.other;

public class Demo {
    public static void main(String[] args) {
        String s =" ";
        String name = "sipho.cimela";
        name = name.replace(".",";");
        String[] nameSplit = name.split(";");
        String avatar = String.valueOf(nameSplit[0].charAt(0))+ String.valueOf(nameSplit[1].charAt(0));
        String nameSurname = nameSplit[0] + " " +nameSplit[1];
        System.out.println(avatar.toUpperCase());
        System.out.println(nameSurname);

        //System.out.println(nameSplit[0].substring(0,1));
//        System.out.println(s.isEmpty());
//        System.out.println("s"+s.trim()+"p");
    }
}
