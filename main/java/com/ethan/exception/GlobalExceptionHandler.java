package com.ethan.exception;

import com.ethan.model.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理器，处理项目中抛出的业务异常
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result<String> exception(Exception e) {
        log.error("【系统异常】{}", e.getMessage(), e);
        return Result.error("系统异常：" + e.getMessage());
    }


}
