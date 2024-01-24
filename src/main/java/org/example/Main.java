package org.example;

import org.example.books.beatgeneration.BeatLiteratureBookHandler;
import org.example.books.exception.BookExceptionHandler;
import org.example.books.exception.NoBooksForThisGenreException;
import org.example.books.horror.HorrorBookHandler;
import org.example.books.programming.ProgrammingBookHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoBooksForThisGenreException {
        HorrorBookHandler horrorHandler = new HorrorBookHandler();
        BeatLiteratureBookHandler beatHandler = new BeatLiteratureBookHandler();
        ProgrammingBookHandler programmingHandler = new ProgrammingBookHandler();
        BookExceptionHandler bookExceptionHandler = new BookExceptionHandler();

        horrorHandler.setNextHandler(beatHandler);
        beatHandler.setNextHandler(programmingHandler);
        programmingHandler.setNextHandler(bookExceptionHandler);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of book genre do you like?");
        String genre = scanner.nextLine();

        horrorHandler.handleResponsibility(genre);
    }

}