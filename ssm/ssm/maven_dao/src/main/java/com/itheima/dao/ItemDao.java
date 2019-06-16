package com.itheima.dao;

import com.sun.tools.javac.jvm.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemDao {
    @Select("select * from items where id= #{id}")
    public Items findById(Integer id);
}
