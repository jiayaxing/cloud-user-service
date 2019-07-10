package com.jiayaxing.clouddemo.clouduserservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "UserServiceController",description = "被调用接口")
@RequestMapping(value = "userServiceController")
public class UserServiceController {
    private static Logger log = LoggerFactory.getLogger(UserServiceController.class);

    @ResponseBody
    @ApiOperation(value = "文件上传接口1", notes = "可以一次上传多个文件1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aa", value = "电视剧名称", required = true,dataType = "string", paramType = "query"),
    })
    @GetMapping(value = "/getName")
    public String getName(@RequestParam("aa") String aa) {
        StringBuffer str =  new StringBuffer();
        str.append("调用成功").append(aa);
        log.info("被调用");
        return str.toString();
    }

    @ResponseBody
    @ApiOperation(value = "文件上传接口2", notes = "可以一次上传多个文件2")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aa", value = "电视剧名称", required = true,dataType = "string", paramType = "query"),
    })
    @GetMapping(value = "/getName1")
    public String getName1(@RequestParam("aa") String aa) throws InterruptedException {
        Thread.sleep(1000);
        StringBuffer str =  new StringBuffer();
        str.append("调用成功").append(aa);
        log.info("被调用");
        return str.toString();
    }
}
