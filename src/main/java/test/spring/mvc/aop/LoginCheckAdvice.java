package test.spring.mvc.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class LoginCheckAdvice {

	@Around("execution(* test.spring.mvc.controller.Member*.ok_*(..))")
	public Object loginCheck(ProceedingJoinPoint jp) throws Throwable {
		RequestAttributes ra= RequestContextHolder.currentRequestAttributes();
		ServletRequestAttributes sra = (ServletRequestAttributes)ra;
		HttpServletRequest request = sra.getRequest();
		HttpSession session = request.getSession();
		String memId = (String)session.getAttribute("memId");
		Object obj = jp.proceed();
		if(memId !=null && !memId.equals("")) {
			obj=jp.proceed();
		}else {
			obj="/user/loginForm";
		}
		
		return obj;
	}
	
}
