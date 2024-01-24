package org.example.utils.responsability;


import org.example.books.exception.NoBooksForThisGenreException;
import org.example.utils.interfaces.ResponsibilityHandler;
import org.example.utils.logger.AbstractLogger;


public abstract class StringHandler extends AbstractLogger implements ResponsibilityHandler<String> {

    private ResponsibilityHandler<String> nextHandler;

    @Override
    public void handleResponsability(String userInput) throws NoBooksForThisGenreException {
        if (nextHandler != null) {
            nextHandler.handleResponsability(userInput);
        }
    }

    public void setNextHandler(ResponsibilityHandler<String> nextHandler) {
        this.nextHandler = nextHandler;
    }

}


