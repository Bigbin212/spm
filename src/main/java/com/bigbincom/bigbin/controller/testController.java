package com.bigbincom.bigbin.controller;

import com.bigbincom.bigbin.entity.BZUser;
import com.bigbincom.bigbin.service.BZUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class testController {

    @Autowired
    BZUserService bzUserService;

    @CrossOrigin
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String test(HttpServletRequest request){
        return "ok";
    }

    @CrossOrigin
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public Object getAll(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        List<BZUser> list = bzUserService.selectAll();
        jsonObject.put("list",list);
        return jsonObject;
    }

    /**
     * 测试批量新增和数据排重
     * @param list
     * @param request
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/addUserList", method = RequestMethod.POST)
    public Object addUserList(@RequestBody List<BZUser> list, HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",true);
        List<BZUser> list1 = new ArrayList<BZUser>();
        try{
            list.forEach(e->{
                e.setYhqx("1");
            });

            // 多个对象去重
            /*list1 = list.stream().collect(
                    Collectors.collectingAndThen(
                            Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o->o.getXlh()+ ";" + o.getUsername()))),
                            ArrayList::new
                    )
            );*/
            bzUserService.insertPatch(list);
        }catch (Exception e){
            jsonObject.put("success",false);
            jsonObject.put("result",e.getMessage());
        }
        jsonObject.put("list",list1);
        return jsonObject;
    }

}
