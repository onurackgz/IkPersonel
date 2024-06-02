package com.rd.IkUygulamasi;

public class PersonellList {
    public static void main(String[] args) {


        Personell per1 = new Personell();
        Personell per2 = new Personell();
        Personell per3 = new Personell();
        Personell per4 = new Personell();

        per1.name = "Onur";
        per1.age = 29;
        per1.hobbies = "basketball,swimming,bicycle";
        per1.city = "Adana";
        per1.email = "onurbla@bla.com";

        per2.name = "İrem";
        per2.age = 32;
        per2.hobbies = "tennis";
        per2.city = "Ankara";
        per2.email = "irembla@bla.com";

        per3.name = "Ülkü";
        per3.age = 36;
        per3.hobbies = "piano";
        per3.city = "İstanbul";
        per3.email = "ülkübla@bla.com";

        per4.name = "Osman";
        per4.age = 18;
        per4.hobbies = "camping";
        per4.city = "İzmir";
        per4.email = "osmanbla@bla.com";

        per1.run();
        per2.run();
        per3.run();
        per4.run();

    }
}
