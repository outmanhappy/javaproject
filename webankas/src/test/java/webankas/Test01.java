package webankas;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hd.model.Userbean;
import com.hd.service.IuserService;

public class Test01 {

	@Test
	public void testQuery() throws IOException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-config.xml");
		IuserService userservice = (IuserService) ac.getBean("userServiceImpl");
		Userbean user = userservice.findById(2);
		System.out.println(user.getCustomername());
		
	}

}
