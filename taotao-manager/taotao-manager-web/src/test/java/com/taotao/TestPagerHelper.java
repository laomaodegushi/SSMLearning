package com.taotao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPagerHelper {
    @Test
    public void testPage() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-*.xml");
        TbItemMapper tbItemMapper = ctx.getBean(TbItemMapper.class);
        PageHelper.startPage(1, 30);

        TbItemExample example = new TbItemExample();
        List<TbItem> list = tbItemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        
        long total = pageInfo.getTotal();
        System.out.println("total:" + total);
        int pages = pageInfo.getPages();
        System.out.println("pages:" + pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize:" + pageSize);


    }
}
