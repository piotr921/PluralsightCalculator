package com.selfLearning.calcengine;

/**
 * Created by Comarch on 2016-10-06.
 */
public class InvalidStatementException extends Exception {

    public InvalidStatementException(String reason, String statement){
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    }
}
