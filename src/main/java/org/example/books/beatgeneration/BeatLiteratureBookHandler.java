package org.example.books.beatgeneration;

import org.example.books.exception.NoBooksForThisGenreException;
import org.example.utils.enums.ErrorLevelEnum;
import org.example.utils.consts.StringConsts;
import org.example.utils.responsability.StringHandler;

public class BeatLiteratureBookHandler extends StringHandler {

    @Override
    public void handleResponsability(String userInput) throws NoBooksForThisGenreException {
        log(ErrorLevelEnum.INFO, "Stream of consciousness books", getClass().getSimpleName(), new Object(){}.getClass().getEnclosingMethod().getName());
        if (StringConsts.BEAT_LITERATURE_BOOK.equalsIgnoreCase(userInput)) {
            System.out.println(StringConsts.BOOKS_BEAT_LITERATURE);
        } else {
            super.handleResponsability(userInput);
        }

    }


}
