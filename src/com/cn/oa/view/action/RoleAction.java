package com.cn.oa.view.action;

import com.cn.oa.base.BaseAction;
import com.cn.oa.domain.Role;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by lijunhong on 16/8/24.
 */
@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role>{

//    @Resource
//    private RoleService roleService;
//    private Role mode = new Role();     //采用modelDriven模式传递数据
//
//    @Override
//    public Role getModel() {
//        return mode;
//    }


    ///----------------------下面这种是采用property model的方式传递数据,代码量大

//    private Long        id;//为了得到页面传递过来的id,自动封装的
//    private String      name;
//    private String      description;
//
//
//    public RoleService getRoleService() {
//        return roleService;
//    }
//
//    public void setRoleService(RoleService roleService) {
//        this.roleService = roleService;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    /**
     * 添加Role页面
     * @return
     * @throws Exception
     */
    public String addUI() throws Exception {
        return "saveUI";
    }

    /**
     * 添加
     * @return
     * @throws Exception
     */
    public String add() throws Exception {
        //获取页面数据,封装成对象
        Role role = new Role();
        role.setName(getModel().getName());
        role.setDescription(getModel().getDescription());

        //将数据添加到数据库中
        roleService.save(role);

        return "toList";
    }

    /**
     * 列表
     * @return
     * @throws Exception
     */
    public String list() throws Exception {
        //准备数据
        List<Role> roleList = roleService.findAll();
        ActionContext.getContext().put("roleList",roleList);
        return "list";
    }

    /**
     * 删除
     * @return
     * @throws Exception
     */
    public String delete() throws Exception {
        roleService.delete(getModel().getId());
        return "toList";
    }

    /**
     * 修改页面
     * @return
     * @throws Exception
     */
    public String editUI() throws Exception {
        //获取页面数据,显示到页面上
        Role role   = roleService.getByID(getModel().getId());
        //这个是property mode方式
//        name        = role.getName();
//        description = role.getDescription();

        //这是modeldiver方式
        ActionContext.getContext().getValueStack().push(role);

        return "saveUI";
    }

    /**
     * 修改
     * @return
     * @throws Exception
     */
    public String edit() throws Exception {
        //从数据库中获取原数据
        Role role = roleService.getByID(getModel().getId());
        role.setDescription(getModel().getDescription());
        role.setName(getModel().getName());
        //将数据保存到数据库中
        roleService.update(role);
        return "toList";
    }



}
