package com.zhaobenquan.linkflow.controller;

import com.zhaobenquan.linkflow.entitys.AccountBook;
import com.zhaobenquan.linkflow.service.AccountBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaobenquan
 * @date 2022/7/22 10:23 上午
 */
@RestController
@RequestMapping("/account_book")
public class AccountBookController {

    @Autowired
    private AccountBookService accountBookService;

    @GetMapping("/id")
    public String findOne() {
        AccountBook accountBook = new AccountBook();
        accountBook.setCode("999001");
        return "index";
    }
}
