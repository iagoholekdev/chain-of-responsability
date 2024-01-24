package org.example.utils.responsability;


import org.example.books.exception.NoBooksForThisGenreException;
import org.example.utils.interfaces.ResponsibilityHandler;
import org.example.utils.logger.AbstractLogger;

import java.util.Objects;


public abstract class StringHandler extends AbstractLogger implements ResponsibilityHandler<String> {

    private ResponsibilityHandler<String> nextHandler;

    @Override
    public void handleResponsability(String userInput) throws NoBooksForThisGenreException {
        if (Objects.nonNull(this.nextHandler)) {
            nextHandler.handleResponsability(userInput);
        }
    }

    public void setNextHandler(ResponsibilityHandler<String> nextHandler) {
        this.nextHandler = nextHandler;
    }

}


