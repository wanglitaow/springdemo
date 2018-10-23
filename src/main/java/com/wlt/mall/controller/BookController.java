package com.wlt.mall.controller;

import com.wlt.mall.common.BaseResponse;
import com.wlt.mall.pojo.Book;
import com.wlt.mall.serivce.BookService;
import com.wlt.mall.vo.BookVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/book/*")

public class BookController {


    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list" )
    private BaseResponse List() {
        List<Book> list =  bookService.getList();
        return new BaseResponse<>(list);
    }


    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    private BaseResponse Info(@RequestParam(value = "id") Integer id) {
        BookVo bookVo = new BookVo();
        Book book = bookService.getInfo(id);
        BeanUtils.copyProperties(book, bookVo);
        return new BaseResponse<>(bookVo);
    }


    @RequestMapping(value = "/update" ,method = RequestMethod.POST)
    private BaseResponse Update(@RequestParam(value = "id") Integer id) {
        Integer res= bookService.update(id);
        return new BaseResponse<>(res);
    }


    @RequestMapping(value = "/del" ,method = RequestMethod.POST)
    private BaseResponse del(@RequestParam(value = "id") Integer id) {
        Integer res= bookService.del(id);
        return new BaseResponse<>(res);
    }
    @RequestMapping(value = "/send" ,method = RequestMethod.GET)
    private BaseResponse pushQueus(@RequestParam(value = "id") Integer id) {




        return new BaseResponse<>(1);
    }







}
