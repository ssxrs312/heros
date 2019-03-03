package study.heros.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.heros.entity.Hero;
import study.heros.mapper.HeroMapper;
import study.heros.service.HeroService;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    HeroMapper heroMapper;

    @Override
    public int add(Hero hero) {
        return heroMapper.add(hero);
    }

    @Override
    public void delete(int id) {
        heroMapper.delete(id);
    }

    @Override
    public int update(Hero hero) {
         return heroMapper.update(hero);
    }

    @Override
    public Hero get(int id) {
        Hero hero = heroMapper.get(id);
        return hero;
    }

    @Override
    public List<Hero> queryAll() {
        List<Hero> hs = heroMapper.queryAll();
        return hs;
    }
}
