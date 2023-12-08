package test.spring.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.spring.mvc.service.AopService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AopTests {
	
	@Autowired
	private AopService service;
	
	@Test
	public void tests() {
		service.test();
		service.msg("Çì·Õ~Çì·Õ~");
		service.doAdd(30, 80);
	}
	

}
