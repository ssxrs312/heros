package study.heros.mapper;

import org.apache.ibatis.annotations.*;
import study.heros.entity.Hero;

import java.util.List;

@Mapper
public interface HeroMapper {

    @Insert("insert into hero(name,hp) values(#{name},#{hp})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int add(Hero hero);

    @Delete("delete from hero where id = #{id}")
    public void delete(int id);

    @Update("update hero set name=#{name},hp=#{hp} where id = #{id}")
    public int update(Hero hero);

    @Select("select * from hero where id =#{id}")
    public Hero get(int id);

    @Select("select * from hero")
    public List<Hero> queryAll();



}
