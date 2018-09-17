package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author sunlssd@qq.com
 * @Description:
 * @date 2018-09-12 21:47
 */
@Controller
public class IndexController {
    @RequestMapping(path={"/","/index"})
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping(value="/profile/{gorupId}/{userId}")
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value="type" ,defaultValue = "1") int type,
                          @RequestParam(value="key",defaultValue="nowcoder")String key) {
        return "ss";
    }
    @RequestMapping("/news")
    public String news(){
        return "news";
    }
}
