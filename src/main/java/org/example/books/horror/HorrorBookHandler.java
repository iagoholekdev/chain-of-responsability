package org.example.books.horror;

import org.example.books.exception.NoBooksForThisGenreException;
import org.example.utils.enums.ErrorLevelEnum;
import org.example.utils.consts.StringConsts;
import org.example.utils.responsability.StringHandler;

public class HorrorBookHandler extends StringHandler {

    @Override
    public void handleResponsibility(String userInput) throws NoBooksForThisGenreException {
        log(ErrorLevelEnum.INFO,"horror generation books", getClass().getSimpleName(), new Object(){}.getClass().getEnclosingMethod().getName());
        if (StringConsts.HORROR_BOOK.equalsIgnoreCase(userInput)) {
            System.out.println(StringConsts.BOOKS_HORROR);
        } else {
            super.handleResponsibility(userInput);
        }
    }

}
