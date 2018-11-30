package org.task.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.task.app.SpringTimer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TaskTest {

    @Autowired
    SpringTimer springTimerTest;

    @Test
    public void springTask() {
        try{
            Thread.sleep(1000000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
