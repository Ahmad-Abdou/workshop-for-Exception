package se.lexicon.exceptions.workshop.Exceptions;

public class DuplicateNameException extends Exception{
    private String name;

    public DuplicateNameException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
