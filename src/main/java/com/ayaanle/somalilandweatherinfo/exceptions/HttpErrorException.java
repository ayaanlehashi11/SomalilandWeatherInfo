package com.ayaanle.somalilandweatherinfo.exceptions;

import java.util.Arrays;

public class HttpErrorException extends Exception {
    String message;
    StackTraceElement [] stackTraceElements;
    @SuppressWarnings("CallToPrintStackTrace")
    public HttpErrorException(String message, Throwable cause) {
        super(message, cause);
        cause = new Throwable();
        cause.printStackTrace();
        message = cause.getMessage();
        stackTraceElements = cause.getStackTrace();
    }

    public String PrintCauseMessage()
    {
        return this.message;
    }
    public void stackTraceer()
    {
        int line_number;
        String class_name;
        String file_name;
        String method_name;
        for (StackTraceElement stackTraceElement : stackTraceElements)
        {
            file_name = stackTraceElement.getFileName();
            class_name = stackTraceElement.getClassName();
            method_name = stackTraceElement.getMethodName();
            line_number = stackTraceElement.getLineNumber();
            System.out.println("error occured at : ");
            System.err.format("file : \t %s \n method: \t %s \n class : %s" ,
                    file_name , method_name , class_name);
            System.err.format("at line: %d" , line_number);
        }
    }
}
