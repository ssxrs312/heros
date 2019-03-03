package study.heros.service;


import study.heros.entity.Hero;

import java.util.List;

public interface HeroService {

    //增加
    public int add(Hero hero);

    //删除
    public void delete(int id);

    //修改
    public int update(Hero hero);

    //查询，根据id查询hero
    public Hero get(int id);

    //查询所有hero数据集合
    public List<Hero> queryAll();


}
