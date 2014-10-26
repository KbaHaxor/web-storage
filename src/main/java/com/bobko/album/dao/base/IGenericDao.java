package com.bobko.album.dao.base;

import java.util.List;

public interface IGenericDao<E, K> {

    public void add(E entity);

    public void update(E entity);

    public void remove(E entity);

    public E find(K key);

    public List<E> list();

    public List<E> rankList(int shift, int count);
    
    public List<E> getByField(String field, String value);

}