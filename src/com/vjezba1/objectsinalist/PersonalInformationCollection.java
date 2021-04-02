package com.vjezba1.objectsinalist;

/*

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformationCollection> poc = new ArrayList<>();

// Read the names, lastNames and ID of persons from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the surname of the person " + name + ": ");
            String lastName = scanner.nextLine();

            System.out.println("Enter id of: "+ name + " " + lastName);
            int id = scanner.nextInt();

            poc.add(new PersonalInformationCollection(name,lastName, id));
        }
        System.out.println();
        System.out.println("Persons in total: " + poc.size());
        System.out.println("Persons: ");

        for (PersonalInformationCollection personalInformationCollection: poc) {
            System.out.println(personalInformationCollection);
        }
 */

public class PersonalInformationCollection {

    private  int id;
    private String name;
    private String lastName;

    public PersonalInformationCollection(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }



    public void setId(int id){
        this.id = id;
    }


    @Override
    public String toString() {
        return  name + " " + lastName;
    }
}
