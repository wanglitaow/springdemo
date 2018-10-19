package com.wlt.mall.serivce;

import com.wlt.mall.dao.OrderLogDAO;
import com.wlt.mall.dao.QuestionDAO;
import com.wlt.mall.pojo.OrderLog;
import com.wlt.mall.pojo.OrderLogExample;
import com.wlt.mall.pojo.Question;
import com.wlt.mall.pojo.QuestionExample;
import com.wlt.mall.vo.OrderLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderLogService {

    @Autowired
    private OrderLogDAO orderLogDAO;

    @Autowired
    private QuestionDAO questionDAO;





    public  Long getCnt(){
        OrderLogExample ex = new OrderLogExample();
        ex.createCriteria().andOrderIdEqualTo("888332011");
        return  orderLogDAO.countByExample(ex);
    }


    public List<OrderLog>getList(){
        List<OrderLog> list = new ArrayList<>();
        OrderLogExample example = new OrderLogExample();
        example.createCriteria().andOrderIdEqualTo("100000004220242");
        return orderLogDAO.selectByExample(example);
    }


    public OrderLog getInfo(Integer id){
        OrderLogExample example = new OrderLogExample();
        return orderLogDAO.selectByPrimaryKey(id);
    }


    public Integer update(Integer id){

        OrderLogExample example = new OrderLogExample();

        example.createCriteria().andIdEqualTo(id);

        OrderLog  orderLog =  orderLogDAO.selectByPrimaryKey(id);

        if(orderLog ==null ){
            return  0;
        }

        orderLog.setIp("111.222.222.333");
        return orderLogDAO.updateByPrimaryKey(orderLog);
    }



    public Integer del(Integer id){
        OrderLogExample example = new OrderLogExample();
        Integer res =  orderLogDAO.deleteByPrimaryKey(id);
        return  res;
    }


    public Question QsInfo(Integer id){

        QuestionExample example = new QuestionExample();

        return questionDAO.selectByPrimaryKey(id);

    }





}
