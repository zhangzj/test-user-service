package com.zzj.test;

import com.zzj.dao.DeviceUserMapper;
import com.zzj.model.DeviceUser;
import com.zzj.model.DeviceUserExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSecond {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");

        DeviceUserMapper deviceUserMapper = (DeviceUserMapper) applicationContext.getBean("deviceUserMapper");

        DeviceUser deviceUser = deviceUserMapper.selectByPrimaryKey(new Integer(1));

        if (deviceUser == null)
        {
            System.out.println("device user not found");
        }
        else
        {
            System.out.println("select from table bu primary key id " + deviceUser.toString() + deviceUser.getName());
        }

        List<DeviceUser> userList = deviceUserMapper.selectByExample(new DeviceUserExample());
        System.out.println(userList.toString());
        for (DeviceUser u :
                userList) {
            System.out.println("user name " + u.getName());
        }
    }
}
