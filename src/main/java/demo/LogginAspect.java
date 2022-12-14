package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	
	@Before("execution(* demo.ShoppingCard.checkOut(..))")
	public void beoreLogger(JoinPoint jp) {
		System.out.println(jp.getSignature());
		System.out.println(jp.getArgs()[0].toString());
		System.out.println("Before Loggers");
	}
	

	@After("execution(* *.*.checkOut(..))")
	public void afterLogger() {
		System.out.println("After Loggers");
	}

	@Pointcut("execution(* demo.ShoppingCard.quantity(..))")
	public void afterReturningPointcut() {
	}
	
	@AfterReturning(pointcut = "afterReturningPointcut()",
			returning="retVal")
	public void afterRetuning(String retVal) {
		System.out.println("After Returning: "+ retVal);
	}
}
