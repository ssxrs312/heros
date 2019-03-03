package study.heros.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import study.heros.entity.Hero;
import study.heros.service.HeroService;

import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroService heroService;

    //restful风格
    @GetMapping("/heroes") //获取queryAll，get
    public PageInfo<Hero> list(@RequestParam(value = "start",defaultValue = "1")int start,
                       @RequestParam(value = "size",defaultValue = "5")int size)throws Exception{
        PageHelper.startPage(start,size,"id desc");
        List<Hero> heros = heroService.queryAll();
        PageInfo<Hero> page = new PageInfo<>(heros,5); //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }

    @PostMapping("heroes")  //增加，post
    public String add(@RequestBody Hero hero){  //axios传来json对象，hero4Add: { id: 0, name: '', hp: '0'}
        heroService.add(hero);
        return "success";
    }

    @DeleteMapping("heroes/{id}")  //删除，delete
    public String delete(@PathVariable("id")Integer id){
        heroService.delete(id);
        return "success";
    }

    @GetMapping("heroes/{id}")  //获取，get
    public Hero get(@PathVariable("id")Integer id){
        Hero h = heroService.get(id);
        return h;
    }

    @PutMapping("heroes")  //修改，put
    public String update(@RequestBody Hero hero){
        heroService.update(hero);
        return "success";
    }


    //页面跳转
    @RequestMapping(value="/listHero", method=RequestMethod.GET)
    public ModelAndView listHero(){
        ModelAndView mv = new ModelAndView("listHero");
        return mv;
    }

    @RequestMapping(value="/editHero", method=RequestMethod.GET)
    public ModelAndView editHero(){
        ModelAndView mv = new ModelAndView("editHero");
        return mv;
    }



}

