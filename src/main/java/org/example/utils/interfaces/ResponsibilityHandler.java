package org.example.utils.interfaces;

import org.example.books.exception.NoBooksForThisGenreException;

public interface ResponsibilityHandler<T> {

    void handleResponsibility(T handable) throws NoBooksForThisGenreException;

}
