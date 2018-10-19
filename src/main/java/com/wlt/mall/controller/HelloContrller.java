package com.wlt.mall.controller;

import com.wlt.mall.dao.RedisDao;
import com.wlt.mall.serivce.OrderLogService;
import com.wlt.mall.serivce.OrderService;
import com.wlt.mall.config.WltConfig;
//import main.java.springboot.dao.RedisDao;
//import main.java.springboot.dao.RedisDao;
import com.wlt.mall.dto.UserDTO;
import com.wlt.mall.serivce.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.wlt.mall.domain.User;

@RestController
@RequestMapping("/hello/*")
public class HelloContrller {


    @Autowired
    RedisDao redisDao ;

    @Value("${server.port}")
    public Integer port;




    @Autowired
    private OrderLogService orderLogService;
//    @Autowired
//    RedisTemplate redisTemplate;

    @Autowired
    private WltConfig wltConfig;

    @Autowired
    private RedisService redisService;

	@Autowired
	private OrderService orderService ;

	@RequestMapping(value = "/{name}")
	private String sayHello(@PathVariable("name") String name) {
		return "hello " + name  ;
	}

	@RequestMapping(value = "getjson", method = RequestMethod.GET, produces = {"application/json;chartset=UTF-8"})
	private User getUserJson(String name) {
		return new User(name);
	}

	@RequestMapping(value = "getxml", produces = {"application/xml;chartset=UTF-8"})
	private User getUserXML(String name) {
		return new User(name);
	}
    @RequestMapping(value = "/redis" )
    private String RedisTest(@RequestParam(value = "name") String name) {

		UserDTO userDTO = new UserDTO();
		userDTO.setAge(1);
		userDTO.setName("dddd");
        redisDao.putToValue("bxx",userDTO);

        redisDao.putToValue("ssss",userDTO);

        UserDTO x = (UserDTO)redisDao.getFromValue("ssss");


        System.out.println(orderLogService.getCnt());
	    return "success"+orderLogService.getCnt();
    }


}
