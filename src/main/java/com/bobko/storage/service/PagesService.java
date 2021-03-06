package com.bobko.storage.service;

/**
 * @author oleksii bobko
 * @data 12.08.2013
 * @see PagesService
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bobko.storage.dao.interfaces.IPagesHolderDao;
import com.bobko.storage.domain.StoragePage;
import com.bobko.storage.service.interfaces.IPagesService;

@Service
public class PagesService implements IPagesService {

    @Autowired
    private IPagesHolderDao pagesDao;
    
    @Transactional
    public List<StoragePage> list() {
        return pagesDao.list();
    }

    @Transactional
    public int getShift() {
        return pagesDao.getShift();
    }

    @Transactional
    public void setShift(int index) {
        pagesDao.setShift(index);
    }

    @Transactional
    public void nextPage() {
        pagesDao.nextPage();
    }

    @Transactional
    public void prevPage() {
        pagesDao.prevPage();
    }

}
