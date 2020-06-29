package com.ray.test;

import com.ray.dao.ItemsDao;
import com.ray.domain.Items;
import com.ray.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*//从容器中拿到所需的dao的代理对象
        ItemsDao items = ac.getBean(ItemsDao.class);
       //调用方法
        Items items1 = items.findById(1);
        System.out.println(items1.getName());*/
        ItemsService service = ac.getBean(ItemsService.class);
        Items items = service.findById(1);
        System.out.println(items.getName());
    }
}
