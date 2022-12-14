package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthonticationAspect {

	@Pointcut("within(demo..*)")
	public void authonticatingPointCut() {

	}

	@Pointcut("within(demo..*)")
	public void authrationonPointCut() {

	}

	
	@Before("authonticatingPointCut() && authrationonPointCut()")
	public void authenticate() {
		
		System.out.println("Authenticating the Request");
	}
}
