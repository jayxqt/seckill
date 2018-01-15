package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by jay-xqt on 2018/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKillDaoTest {

    @Resource
    private SuccessKillDao successKillDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id=1000L;
        long phone=15300085307L;
        int insertCount=successKillDao.insertSuccessKilled(id, phone);
        System.out.print("insertCount=="+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        SuccessKilled successKilled=successKillDao.queryByIdWithSeckill(1000L, 15300085307L);
        System.out.print(successKilled);
        System.out.print(successKilled.getSeckill());
    }
}