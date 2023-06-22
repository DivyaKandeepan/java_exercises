package com.stackroute.oops;

/*
 This class is used to store Voter details
 */
public class Voter {
    public static void main(String[] args) {
        // Creating a new Voter object
        Voter voter = new Voter("John", 25);
    
        // Printing Voter details
        System.out.println(voter.toString());
    
        // Printing Voter age criteria
        System.out.println("Voter age criteria: " + voter.getAgeCriteria());
    
        // Creating a new Voter object using VoterService
        Voter voter2 = VoterService.createVoter("Jane", 17);
    
        // Printing Voter details
        System.out.println(voter2.toString());
    
        // Printing Voter age criteria using VoterService
        System.out.println("Voter age criteria: " + VoterService.getVoterDescription(voter2));
    }
    

    private String name;
    private int age;

    /* Parameterised constructor */
    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
       Returns Voter details in a formatted String
    */
    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
        Returns the age criteria of voter based on the below criteria
            ADULT : >=18
            UNDERAGE : < 18
     */
    public String getAgeCriteria() {
        return age >= 18 ? "ADULT" : "UNDERAGE";
    }
}
