package com.qianmi.uc;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianmi.uc.dubbo.HelloProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.uc.StoreProviderTest</p>
 * <p>Date: 2017-08-16 16:55.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StoreProviderTest {

    @Reference(version = "1.0.0")
    private HelloProvider helloProvider;

    @Test
    public void TestGetOne(){
        System.out.println("000000000");
        helloProvider.findMyName("lilonglong");
        System.out.println("111111111");
    }

}
