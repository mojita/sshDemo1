package com.cn.oa.test;

import com.cn.oa.domain.Department;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by lijunhong on 16/8/25.
 */
public class TreeViewPractice {

    //-------------模拟树形列表--------



    //练习一：打印所有顶层部门及其子孙部门的信息（名称） 提示：假设有一个 打印部门树 的信息 的方法
    @Test
    public void printAllDepts_1(){
        //方法一
        List<Department> topList = findTopLevelDepartmentList();
//        for (Department top:topList)
//            showTree(top);

        //方法二
        showTreeList(topList);

    }

    //显示一棵树的信息(使用到递归)
    public void showTree(Department top){
        //获取到顶点
        System.out.println(top.getName());
        for (Department children:top.getChildren())
            showTree(children);
    }


    //显示多棵树的信息
    public void showTreeList(Collection<Department> topList){
        for (Department top:topList){
            System.out.println(top.getName());
            showTreeList(top.getChildren());
        }

    }


    //练习二：打印所有顶层部门及其子孙部门的信息（名称），用不同的缩进表示层次（使用全角空格）。
    //子部门的名称前比上级部门多一个空格，最顶层部门的名字前没有空格。 提示：假设有一个打印部门集合中所有部门信息的方法
    //┣
    @Test
    public void printAllDepts_2(){
        List<Department> topList = findTopLevelDepartmentList();
        showTreeList(topList,"┣");
    }

    public void showTreeList(Collection<Department> topList,String prefix){
        for (Department top:topList){
            System.out.println(prefix+top.getName());
            showTreeList(top.getChildren(),"  "+prefix);
        }
    }



    /**
     *
     * 模拟数据库中的数据
     * 将数据结构整理成这种样子
     * 市场部
     *      宣传部
     *      业务部
     *          业务一部
     *           业务二部
     * 开发部
     *      开发一部
     *      开发二部
     */
    public static List<Department> findTopLevelDepartmentList(){
        Department dept_1_1 = new Department();
        dept_1_1.setId(new Long(11));
        dept_1_1.setName("宣传部");

        Department dept_1_2 = new Department();
        dept_1_2.setId(new Long(12));
        dept_1_2.setName("业务部");

        Department dept_1_2_1 = new Department();
        dept_1_2_1.setId(new Long(121));
        dept_1_2_1.setName("业务一部");

        Department dept_1_2_2 = new Department();
        dept_1_2_2.setId(new Long(122));
        dept_1_2_2.setName("业务二部");

        dept_1_2_1.setParent(dept_1_2);
        dept_1_2_2.setParent(dept_1_2);

        Set<Department> children_0 = new LinkedHashSet<>();
        children_0.add(dept_1_2_1);
        children_0.add(dept_1_2_2);

        dept_1_2.setChildren(children_0);

        //-------------

        Department dept_1 = new Department();
        dept_1.setId(new Long(1));
        dept_1.setName("市场部");

        dept_1_1.setParent(dept_1);
        dept_1_2.setParent(dept_1);

        Set<Department> children_1 = new LinkedHashSet<>();
        children_1.add(dept_1_1);
        children_1.add(dept_1_2);

        dept_1.setChildren(children_1);

        //--------------

        Department dept_2 = new Department();
        dept_2.setId(new Long(2));
        dept_2.setName("开发部");

        Department dept_2_1 = new Department();
        dept_2_1.setId(new Long(21));
        dept_2_1.setName("开发一部");

        Department dept_2_2 = new Department();
        dept_2_2.setId(new Long(22));
        dept_2_2.setName("开发二部");


        dept_2_1.setParent(dept_2);
        dept_2_2.setParent(dept_2);

        Set<Department> children_2 = new LinkedHashSet<>();
        children_2.add(dept_2_1);
        children_2.add(dept_2_2);
        dept_2.setChildren(children_2);

        List<Department> depts = new ArrayList<>();
        depts.add(dept_1);
        depts.add(dept_2);

        return depts;
    }

}
