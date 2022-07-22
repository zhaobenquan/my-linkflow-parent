package com.zhaobenquan.linkflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhaobenquan
 * @date 2022/7/21 6:10 下午
 */
@SpringBootApplication
//如果不添加  默认扫描项目路径启动类路径下的所有包
//如果添加  需要同时指定当前项目路径扫描
@ComponentScan({"com.zhaobenquan.web.mybatis.plus","com.zhaobenquan.linkflow"})
public class LinkFlowApplication {
    public static void main(String[] args) {
        SpringApplication.run(LinkFlowApplication.class, args);
    }
}
