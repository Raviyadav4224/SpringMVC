package com.ravi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Pointcut("execution(* com.ravi..*(..))")
	public void logAllMethods() {
	}

	@Before("logAllMethods()")
	public void logBefore(JoinPoint jp) {
		logger.info("Method Entered " + jp.getSignature().toShortString());
	}

	@AfterReturning(pointcut = "allMethods()", returning = "result")
	public void logAfter(JoinPoint jp, Object result) {
		logger.info("Exiting method : " + jp.getSignature().toShortString() + " Result : " + result);
	}

	@AfterThrowing(pointcut = "allMethods()", throwing = "ex")
	public void logException(JoinPoint jp, Exception ex) {
		logger.error("Exception in method ", jp.getSignature().toShortString(), ex.getMessage(), ex);
	}
}
