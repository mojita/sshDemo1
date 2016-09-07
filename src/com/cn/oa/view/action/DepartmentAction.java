package com.cn.oa.view.action;

import com.cn.oa.base.BaseAction;
import com.cn.oa.domain.Department;
import com.cn.oa.utils.DepartmentUtil;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by lijunhong on 16/8/26.
 */
@Controller
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{

    private Long parentId;
    public Long getParentId() {
        return parentId;
    }
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String save(){
        if(parentId != null){
            model.setParent(departmentService.getByID(parentId));
        }
        departmentService.save(model);
        return "toList";
    }

    public String saveUI(){
        List<Department> topList = departmentService.findTopList();
        List<Department> departmentList = DepartmentUtil.getAllDepartments(topList);

        ActionContext.getContext().put("departmentList",departmentList);
        return "saveUI";
    }

    public String delete(){
        departmentService.delete(model.getId());
        return "toList";
    }

    public String list(){
        //准备数据显示
        List<Department> departmentList = departmentService.findAll();
        ActionContext.getContext().put("departmentList",departmentList);
        return "list";
    }

    public String edit(){
        Department department = departmentService.getByID(model.getId());
        //修改数据
        department.setParent(departmentService.getByID(parentId));
        department.setName(model.getName());
        department.setDescription(model.getDescription());
        departmentService.update(department);
        return "toList";
    }

    public String editUI(){
        //准备部门数据
        List<Department> topList = departmentService.findTopList();
        List<Department> departmentList = DepartmentUtil.getAllDepartments(topList);
        ActionContext.getContext().put("departmentList",departmentList);

        Department department = departmentService.getByID(model.getId());
        ActionContext.getContext().getValueStack().push(department);
        if(department.getParent() != null)
            parentId = department.getParent().getId();

        return "saveUI";
    }
}
