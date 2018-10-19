package com.wlt.mall.serivce;

import com.wlt.mall.dao.BookDAO;
import com.wlt.mall.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;




    public  Long getCnt(){
        BookExample ex = new BookExample();
        ex.createCriteria().andIdEqualTo(1);
        return  bookDAO.countByExample(ex);
    }


    public List<Book> getList(){
        List<Book> list = new ArrayList<>();
        BookExample example = new BookExample();
        example.createCriteria().andIdEqualTo(1);
        return bookDAO.selectByExample(example);
    }


    public Book getInfo(Integer id){
        BookExample example = new BookExample();
        return bookDAO.selectByPrimaryKey(id);
    }


    public Integer update(Integer id){

        BookExample example = new BookExample();

        example.createCriteria().andIdEqualTo(id);

        Book  orderLog =  bookDAO.selectByPrimaryKey(id);

        if(orderLog ==null ){
            return  0;
        }

        orderLog.setName("111.222.222.333");
        return bookDAO.updateByPrimaryKey(orderLog);
    }



    public Integer del(Integer id){
        BookExample example = new BookExample();
        Integer res =  bookDAO.deleteByPrimaryKey(id);
        return  res;
    }



}
