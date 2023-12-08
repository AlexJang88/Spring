package test.spring.mvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAdvice {

//	@Around("execution(* test.spring.mvc.controller.*.*(..))")
//	public Object around(ProceedingJoinPoint jp) throws Throwable{
//		Object obj=null;
//			System.out.println("===================================[ aop around 111]=========================");
//			long start = System.currentTimeMillis();
//			obj=jp.proceed();
//			long end = System.currentTimeMillis()-start;
//			System.out.println("성능확인 ==>"+end);
//			System.out.println("===================================[ aop around 222]=========================");
//		return obj;
//		
//	}
//	
//	//접근제어자(생략가능) 리턴타입(생략가능) 패키지(생략가능하나 여기부턴 보통작성함) 클래스명(생략가능-모든클래스) 메서드명(..,..)-매개변수2개이지만 타입상관없음 예외 
//	//execution(public void test.spring.mvc.TestController.main() )
//	
//
	
	
	
}
