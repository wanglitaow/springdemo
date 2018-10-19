package com.wlt.mall.serivce;


import com.wlt.mall.dao.OrderLogDAO;
import com.wlt.mall.pojo.OrderLogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


//    @Autowired
//    OrderLogDAO orderLogDAO;


    public void addCache(String key , String v){

        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.opsForValue().set("a","b");
        stringRedisTemplate.opsForList().rightPush("myList","a");
        stringRedisTemplate.opsForList().rightPush("myList","b");
        stringRedisTemplate.opsForSet().add("myset","a");
        stringRedisTemplate.opsForSet().add("myset","d");
        stringRedisTemplate.opsForSet().add("myset","c");
        stringRedisTemplate.opsForHash().put("myHash","key1","val1");
        stringRedisTemplate.opsForHash().put("myHash","key2","val2");
        stringRedisTemplate.opsForHash().put("myHash","key3","val3");

    }


   public String getCache(String key){
       StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        return  stringRedisTemplate.opsForValue().get(key);

    }


    public Integer cnt(){

//        OrderLogExample ex = new OrderLogExample();
//        OrderLogExample.Criteria ca = ex.createCriteria().andOrderIdEqualTo("ssss");
//        return (int) orderLogDAO.countByExample(ex);

        return  1;

    }


    private Integer a ;

    private String b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
