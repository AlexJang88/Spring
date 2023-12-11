package test.spring.mvc;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.spring.mvc.bean.TestDTO;

//Junit �� ����� ����Ǵ� Ŭ����
@RunWith(SpringJUnit4ClassRunner.class)
//�׽�Ʈ�� ���� ���ð� ���� �����ϱ� ������ ������ �ٽ� �������
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/test-root-context.xml"
						,"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BeanTests {
	
	@Autowired
	private Date day;
	
	@Autowired
	private TestDTO dto;
	
	@Test
	public void test1() {
		System.out.println("day==========="+day);
	}
	@Test
	public void test2() {
		System.out.println("dto=========="+dto.getName()+"dto======="+dto.getDay());
	}
		

}
