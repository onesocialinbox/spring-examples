package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodAspect {
	
	@Before("execution(* demo.*.*some*(..))")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Entered method:::" + jp.getSignature().getDeclaringTypeName());
	}

	@After("execution(* demo.*.*(..))")
	public void afterAdvice(JoinPoint jp) {
		System.out.println("Exit....method:::" + jp.getTarget().getClass().getName());
		System.out.println("Exit....method Type Name:::" + jp.getSignature().getDeclaringTypeName());
	}
	
	/*@After("execution(* demo.*.*(..))")
	public void after(){
		System.out.println("Without  jointpoint......");
	}*/

}
