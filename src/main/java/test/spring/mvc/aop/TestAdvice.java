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
//			System.out.println("����Ȯ�� ==>"+end);
//			System.out.println("===================================[ aop around 222]=========================");
//		return obj;
//		
//	}
//	
//	//����������(��������) ����Ÿ��(��������) ��Ű��(���������ϳ� ������� �����ۼ���) Ŭ������(��������-���Ŭ����) �޼����(..,..)-�Ű�����2�������� Ÿ�Ի������ ���� 
//	//execution(public void test.spring.mvc.TestController.main() )
//	
//
	
	
	
}
