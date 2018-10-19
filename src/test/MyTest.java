package test;


import com.wlt.mall.Anno.Authority;
import com.wlt.mall.dto.UserDTO;
import com.wlt.mall.serivce.AnnoService;

@Authority(describe = "注解类测试")
public class MyTest {

    @Authority(name = "test", describe = "注解方法测试")
    public void test() {
        System.out.println("hello annotation");
    }


    public static void main(String[] args) {
        AnnoService.getFruitInfo(UserDTO.class);
    }




}