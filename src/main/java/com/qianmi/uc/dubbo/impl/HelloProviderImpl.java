package com.qianmi.uc.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qianmi.uc.dubbo.HelloProvider;
import com.qianmi.uc.dubbo.domain.Store;
import com.qianmi.uc.dubbo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.uc.dubbo.impl.HelloProviderImpl</p>
 * <p>Date: 2017-08-14 14:50.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Service(version = "1.0.0")
public class HelloProviderImpl implements HelloProvider {

    @Autowired
    private StoreService storeService;

    @Override
    public String findMyName(String enName) {
        Store store = storeService.getOne("A910917");
        return enName + " English Name is LiLonglong ";
    }
}
