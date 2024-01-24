package org.example.utils.logger;

import org.example.utils.enums.ErrorLevelEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractLogger {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public void log(ErrorLevelEnum level, String message, Object... arguments) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final String className = stackTrace[2].getClassName();
        final String methodName = stackTrace[2].getMethodName();
        final String formattedMessage = String.format(message, arguments);
        final String pattern = "{} - Method: {} - {} - Arguments: {}";

        switch (level) {
            case ERROR:
                logger.error(pattern, className, methodName, formattedMessage, arguments);
                break;
            case WARNING:
                logger.warn(pattern, className, methodName, formattedMessage, arguments);
                break;
            case INFO:
                logger.info(pattern, className, methodName, formattedMessage, arguments);
                break;
        }
    }

}