package com.cn.oa.utils;

import com.cn.oa.domain.Department;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lijunhong on 16/8/26.
 */
//对部门的树形结构进行操作
public class DepartmentUtil {

    public static List<Department> getAllDepartments(Collection<Department> topList){
        List<Department> list = new ArrayList<>();
        walkDepartmentTree(topList,"┣",list);
        return list;
    }

    public static void walkDepartmentTree(Collection<Department> topList,String prefix,List<Department> list){
        for (Department top:topList){
            //顶点
            Department copy = new Department();
            copy.setId(top.getId());
            copy.setName(top.getName());
            list.add(copy);
            walkDepartmentTree(top.getChildren(),"  ┣",list);
        }
    }
}
