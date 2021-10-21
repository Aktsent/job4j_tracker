package ru.job4j.tracker.oop;

public class Dentist extends Doctor {
   private Doctor pacient;

   public Doctor getPacient(Doctor pacient) {
       this.pacient = pacient;
       return pacient;
   }

}
