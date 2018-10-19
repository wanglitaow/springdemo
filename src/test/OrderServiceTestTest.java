package test;

import com.wlt.mall.config.WltConfig;
import com.wlt.mall.dto.UserDTO;
import com.wlt.mall.serivce.OrderService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/** 
* OrderServiceTest Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 16, 2018</pre> 
* @version 1.0 
*/ 
public class OrderServiceTestTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;



@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 


@Test
public void TestGetA(){


    OrderService orderService = new OrderService();

    orderService.setA(1);

    System.out.println(orderService.getA());


}


@Test
public void TestGetB(){
    OrderService orderService = new OrderService();
    orderService.setA(1111);

    System.out.println(orderService.getA());


}


@Test
public void TestBean(){

//    ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//
//
//    UserDTO bean = (UserDTO) ((ClassPathXmlApplicationContext) ac).getBean("user");
//    System.out.println(bean.getAge());
//    System.out.println(bean.getName());

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WltConfig.class);

    UserDTO userDTO1 = applicationContext.getBean(UserDTO.class);
    System.out.println(userDTO1.getName());



}


@Test
    public void TestString(){


//    UserDTO userDTO = new UserDTO(1,"sss");
//    redisTemplate.opsForValue().set("a",userDTO);




}



} 
