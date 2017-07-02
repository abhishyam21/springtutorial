package com.abhishyam.learn.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Customer {
    private List<Object> list;
    private Set<Object> set;
    private Map<Object,Object> map;
    Properties properties;

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    public void printList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.valueOf(list.get(i)));
        }
    }

    public void printSet(){
        for (Object o : set) {
            System.out.println(String.valueOf(o));
        }
    }
    public void  printMap(){
        for (Map.Entry<Object, Object> entity : map.entrySet()) {
            System.out.println(entity.getKey()+"\t"+entity.getValue());
        }
    }

    public void printProperties(){
    }
}
