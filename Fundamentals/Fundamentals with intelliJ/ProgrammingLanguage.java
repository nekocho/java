package bites.examples;

public class ProgrammingLanguage {
    String name;
    Integer yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, Integer yearOfCreation, String creator) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName() {
        return this.name;
    }

    public Integer getYear() {
        return this.yearOfCreation;
    }

    public String getCreator() {
        return this.creator;
    }



    public static void main(String[] args) {
        ProgrammingLanguage programming = new ProgrammingLanguage("Python", 1991, "Guido van Rossum");
        System.out.println("Programming Language name: " + programming.getName());
        System.out.println("Year of Creation: " + programming.getYear());
        System.out.println("Creator: " + programming.getCreator());


    }
}
