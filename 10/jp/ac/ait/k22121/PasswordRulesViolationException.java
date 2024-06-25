package jp.ac.ait.k22121;

public class PasswordRulesViolationException extends Exception{
    PasswordRulesViolationException(){
        super();
    }

    PasswordRulesViolationException(String message){
        super(message);
    }

    PasswordRulesViolationException(String message,Throwable cause){
        super(message,cause);
    }

    protected PasswordRulesViolationException(
            String message,Throwable cause,boolean enableSuppression,boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }

    PasswordRulesViolationException(Throwable cause){
        super(cause);
    }

}