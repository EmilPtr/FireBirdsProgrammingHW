/*******************************************************************************************************************************
 * Person.java                                                                                                                 *                                                
 * Created by Emil on 2025-07-14                                                                                               *                                  
 * This class represents a Person with attributes such as name, age, yearly salary, monthly spending, and bank balance.        *
 * It includes methods to prove humanity, go years into the future, ask for bank balance, and get money through illicit means. *
 * The class demonstrates encapsulation and access modifiers in Java.                                                          *               
 *******************************************************************************************************************************/

package U1_L2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person josh = new Person("Josh Josh", 400, 1.02f, true); 
        Person untitiled1 = new Person("Untitled 1", 0, 0.0f, false); 
        Person not = new Person("Not A. person", 30, 4246294.03f, false); 
        Person billie = new Person("Billie Joe Armstrong", 51, 100000.00f, true); 
        Person john = new Person("John Firebird", -5, 50000.00f, true);

        josh.goYearsInFuture(2121);
        josh.askBankBalance(); // Asks for Josh's bank balance
        untitiled1.proveThatPersonIsHuman(); // Proves that Untitled 1 is a human
        untitiled1.getMoneyThroughIllicitMeans(2837349.10f); // Untitled 1 gets money through illicit means
        untitiled1.askBankBalance(); // Asks for Untitled 1's bank balance
        not.proveThatPersonIsHuman(); // Proves that Not A. person is a human
        not.goYearsInFuture(1); // Goes 1 year into the future for Not A. person
        not.askBankBalance(); // Asks for Not A. person's bank balance
        billie.proveThatPersonIsHuman(); // Proves that Billie Joe Armstrong is a human
        billie.goYearsInFuture(10); // Goes 10 years into the future for Billie Joe Armstrong
        billie.askBankBalance(); // Asks for Billie Joe Armstrong's bank balance
        john.proveThatPersonIsHuman(); // Proves that John Firebird is a human
        john.goYearsInFuture(100); // Goes 100 years into the future for John Firebird
        john.askBankBalance(); // Asks for John Firebird's bank balance

        Person.makeRelationship(john, untitiled1);  // Creates a relationship between John Firebird and Untitled 1
        Person.makeRelationship(josh, billie); // Creates a relationship between Josh and Billie Joe Armstrong
        Person.makeRelationship(not, josh); // Creates a relationship between Not A. person and Josh
        Person.makeRelationship(billie, not); // Creates a relationship between Billie Joe Armstrong and Not A. person
        Person.makeRelationship(john, billie); // Creates a relationship between John Firebird and Billie Joe Armstrong

        System.out.println("All persons have been created and their actions have been performed :D back to the void they go!"); 
    }
}

class Person {

    public String   name;
    protected int   age;
    private float   yearlySalary;
    protected float monthlySpending = 10000;
    private float   currentBankBalance = 0;
    public boolean  isActuallyHuman;
    public ArrayList<RealEstateAsset> realEstateAssets = new ArrayList<>(); // List of real estate assets owned by the person

    public Person(String name, int age, float yearlySalary, boolean isActuallyHuman) {
        this.name = name; // Sets the name of the person
        this.age = age; // Sets the age of the person
        this.yearlySalary = yearlySalary; // Sets the yearly salary of the person
        this.isActuallyHuman = isActuallyHuman; // Initially, the person is not proven to be human
        System.out.println("A new person has been created: " + name + ", Age: " + age + ", Yearly Salary: " + yearlySalary);
        int assetCount = (int) (Math.random() * 11); // Randomly generates a number of real estate assets between 0 and 10
        for (int i = 0; i < assetCount; i++) {
            realEstateAssets.add(new RealEstateAsset((float) Math.random() * 100000001)); // Adds a new real estate asset to the person's real estate assets list with a random value between 0 and 100,000,000
        }
    }

    public void proveThatPersonIsHuman() {
        System.out.println("Hello fellow human! I am a person, just like you! Totally not a skinwalker or anything :D");
        this.isActuallyHuman = true; // This must be a person!
    }

    public int goYearsInFuture(int years) {
        this.age += years; // Increases the age by 10 years
        System.out.println(years + " years later...");
        this.currentBankBalance += (yearlySalary * years) - (12 * years * monthlySpending); //
        return this.age; // Returns the new age
    }

    public float askBankBalance() { // How rude...
        System.out.println("How rude! My bank balance is private, but I will tell you anyway.");
        System.out.println("My current bank balance is: " + this.currentBankBalance);
        this.printAssets();
        float netWorth = this.currentBankBalance + this.sumUpAssetValue(); // Initializes net worth with the current bank balance
        System.out.println("So my total net worth is: " + netWorth); // Prints the total net worth
        return this.currentBankBalance; // Returns the current bank balance
    }

    public float getMoneyThroughIllicitMeans(float money) { // if only I could print(money)...
        System.out.println("La di da, I am going to gain some money through illicit means!");
        System.out.println("A few illegal things later...");
        this.currentBankBalance += money; // Adds the money to the current bank balance
        System.out.println("I now have " + this.currentBankBalance + " in my bank account!"); // Prints the new bank balance
        return this.currentBankBalance; // Returns the new bank balance
    }   

    static void makeRelationship(Person person1, Person person2) {
        String[] relationshipTypes = {"friends", "enemies", "lovers", "colleagues", "acquaintances", "who tf is this guy"};
        int randomIndex = (int) (Math.random() * relationshipTypes.length); // Generates a random index to select a relationship type, note casting to in floors the originial value
        String relationship = relationshipTypes[randomIndex]; // Selects a random relationship type from the array
        System.out.println(person1.name + " and " + person2.name + " are now " + relationship + "!"); // Prints the relationship between the two persons
    }

    public void printAssets() {
        if (realEstateAssets.isEmpty()) {
            System.out.println("I have no real estate assets.");
        } else {
            for (int i = 0; i < realEstateAssets.size(); i++) {
                System.out.println("My Real Estate Asset #" + i+1 + " Value: $" + realEstateAssets.get(i).value);
            }
        }
    }

    private float sumUpAssetValue() {
        float totalValue = 0; // Initializes total value to 0
        for (RealEstateAsset asset : realEstateAssets) {
            totalValue += asset.value; // Sums up the value of each real estate asset
        }
        return totalValue; // Returns the total value of all real estate assets
    }
}

class RealEstateAsset {
    public float value;

    public RealEstateAsset(float value) {
        this.value = value; // Sets the value of the real estate asset
    }
}