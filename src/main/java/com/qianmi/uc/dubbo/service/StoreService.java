package com.qianmi.uc.dubbo.service;

import com.qianmi.uc.dubbo.domain.Store;
import com.qianmi.uc.dubbo.domain.StoreJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.uc.dubbo.service.StoreService</p>
 * <p>Date: 2017-08-16 16:51.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Service
public class StoreService {

    @Autowired
    private StoreJpaRepository storeJpaRepository;

    public Store getOne(String id){
        return storeJpaRepository.getOne(id);
    }
}
