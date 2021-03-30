package com.uih.activiti.util.exception;

import com.uih.activiti.util.Status;
import com.uih.activiti.util.ToWeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理，捕获所有Controller中抛出的异常。
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	//处理自定义的异常
	@ExceptionHandler(BaseException.class)
	@ResponseBody
	public Object customHandler(BaseException e){
		return ToWeb.buildResult().status(e.getCode()).msg(e.getMessage());
	}

	//其他未处理的异常
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Object exceptionHandler(Exception e){
		LOG.error("GlobalExceptionHandler", e);
		return ToWeb.buildResult().status(Status.FAIL).msg("系统错误");
	}
}
