package com.ruoyi.module.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

/**
 * @Author ftm
 * @Date 2022-09-19 17:54:13
 * @Description Query分页构造器
 */

@Data
public class PageQuery {
    Integer size;
    Integer current;
    public IPage Page(){
        IPage page = new Page<>(current, size);
        return page;
    }

    public IPage page(){
        IPage page = new Page<>(current, size);
        return page;
    }
}