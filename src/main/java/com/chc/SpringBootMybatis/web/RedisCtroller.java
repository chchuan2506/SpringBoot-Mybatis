package com.chc.SpringBootMybatis.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chc.SpringBootMybatis.entity.EMP;
import com.chc.SpringBootMybatis.entity.UserEntity;
import com.chc.SpringBootMybatis.mapper.EMPMapper;
import com.chc.SpringBootMybatis.mapper.UserMapper;
import com.chc.SpringBootMybatis.redis.service.RedisOps;

/**
 * @RestController:spring mvc的注解， 相当于@Controller与@ResponseBody的合体，可以直接返回json
 */
@RestController
@RequestMapping("/redis")
public class RedisCtroller {
	@Autowired
	private RedisOps redisOps;
	@Autowired
    private EMPMapper eMPMapper;

	@RequestMapping("/del")
	public String del() {
		redisOps.delForKey("e");
		return "string";
	}
	@RequestMapping("/getEMPs")
    public List<EMP> getEMPs() {
        List<EMP> emps=eMPMapper.getAll();
        return emps;
    }
}
