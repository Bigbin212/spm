package com.bigbincom.bigbin.service;

import com.bigbincom.bigbin.dao.BZUserMapper;
import com.bigbincom.bigbin.entity.BZUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BZUserService {

    @Autowired
    BZUserMapper bzUserDao;

    public List<BZUser> selectAll() {
        return bzUserDao.selectAll();
    }

    public void insertPatch(List<BZUser> list) {
        bzUserDao.insertPatch(list);
    }
}
