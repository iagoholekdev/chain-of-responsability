package org.example.books.programming;

import org.example.books.exception.NoBooksForThisGenreException;
import org.example.utils.enums.ErrorLevelEnum;
import org.example.utils.consts.StringConsts;
import org.example.utils.responsability.StringHandler;

public class ProgrammingBookHandler extends StringHandler  {

    @Override
    public void handleResponsibility(String userInput) throws NoBooksForThisGenreException {
        log(ErrorLevelEnum.INFO,"programming books", getClass().getSimpleName(), new Object(){}.getClass().getEnclosingMethod().getName());
        if (StringConsts.PROGRAMMING_BOOK.equalsIgnoreCase(userInput)) {
            System.out.println(StringConsts.BOOKS_PROGRAMMING);
        } else {
            super.handleResponsibility(userInput);
        }
    }

}
