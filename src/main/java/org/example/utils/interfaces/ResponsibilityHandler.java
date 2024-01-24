package org.example.utils.interfaces;

import org.example.books.exception.NoBooksForThisGenreException;

public interface ResponsibilityHandler<T> {

    void handleResponsability(T handable) throws NoBooksForThisGenreException;

}
