package com.abhishyam.learn.specificcollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Customer {
    private List<Integer> list;
    private Set<Integer> set;
    Map<String,Integer> map;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void printList(){
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public void printSet(){
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

    public void printMap(){
        for (Map.Entry<String, Integer> entity : map.entrySet()) {
            System.out.println(entity.getKey()+"\t"+entity.getValue());
        }

    }
}
