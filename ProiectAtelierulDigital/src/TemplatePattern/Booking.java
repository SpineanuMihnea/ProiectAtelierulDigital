package TemplatePattern;
//Aceasta este o aplicatie unde pattern-ul Template este folosit in creearea rezervarilor la un hotel in baza preferintelor clientiilor.
public class Booking {

    public static void main(String[] args){

       NormalGuest rezervation1 = new NormalGuest();

        rezervation1.makeRezervation();

        System.out.println();

        VIP rezervation2 = new VIP();

        rezervation2.makeRezervation();

    }

}