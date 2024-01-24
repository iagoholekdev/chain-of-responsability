package org.example.books.exception;

public class NoBooksForThisGenreException extends Exception {

    public NoBooksForThisGenreException() {
        super("Book not found for the given request.");
    }

    public NoBooksForThisGenreException(String message) {
        super(message);
    }

}
