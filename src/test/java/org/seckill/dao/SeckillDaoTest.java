package org.seckill.dao;

import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.read.ListAppender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.Resources;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 * Created by jay-xqt on 2018/1/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest{

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        Date killTime=new Date();
        int updateCount=seckillDao.reduceNumber(1000L, killTime);
        System.out.print("updateCount="+updateCount);
    }

    @Test
    public void queryById() throws Exception {
        long id=1000;
        Seckill seckill=seckillDao.queryById(id);
        System.out.print(seckill.getName());
        System.out.print(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> all=seckillDao.queryAll(0, 100);
        for(Seckill seckill: all){
            System.out.println(seckill);
        }
    }
}