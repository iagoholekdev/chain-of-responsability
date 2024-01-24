package org.example.books.exception;

import org.example.utils.enums.ErrorLevelEnum;
import org.example.utils.responsability.StringHandler;

public class BookExceptionHandler extends StringHandler {

    @Override
    public void handleResponsability(String userInput) throws NoBooksForThisGenreException {
       String log = "exception in books request, user input: " + userInput;
       log(ErrorLevelEnum.ERROR, log, getClass().getSimpleName(), new Object(){}.getClass().getEnclosingMethod().getName());
       throw new NoBooksForThisGenreException();
    }

}
