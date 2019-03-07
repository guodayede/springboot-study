package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Resource
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user=new User();
		user.setName("jack");
//		List<User> userList = userMapper.selectList(new QueryWrapper<>(user));
//		userList.forEach(one-> System.out.println(one.toString()));
		Page page=new Page(3,2);
		IPage iPage = userMapper.selectPage(page, null);
		List records = iPage.getRecords();
		records.forEach(one-> System.out.println(one.toString()));
	}

}
