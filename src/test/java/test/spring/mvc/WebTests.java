package test.spring.mvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"
						,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class WebTests {
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mock;
	
	@Before
	public void before() {
		this.mock =MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void isOK() throws Exception{
		MockHttpServletRequestBuilder mhr= MockMvcRequestBuilders.get("/user/loginForm");
		ResultActions ra=mock.perform(mhr);
		ra=ra.andExpect(status().isOk());
		ra.andExpect(content().string("loginForm page"));
	}
	
	
	
	
	@Test
	public void test() throws Exception{
		//테스트를 위한 가짜 MVC환경 구성
		//브라우저 실행을 대신 수행
		
		ModelMap result=mock.perform(MockMvcRequestBuilders.get("/user/main")
						  .param("id", "teststestset")
						  .param("name", "agree"))
						  .andReturn()
						  .getModelAndView()
						  .getModelMap();
		System.out.println("count======"+result.get("count"));
		System.out.println("name======"+result.get("name"));
		System.out.println("=======mock======"+result);
	}
}
