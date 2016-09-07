<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!--显示数据-->

<html>
        <s:iterator value="roleList">
            <s:property value="id"/>
            <s:property value="name"/>
            <s:property value="description"/>
            <!--使用struts2 a标签,会自动在前面添加工程名称,在后面添加参数-->
            <s:a action="role_delete?id=%{id}" onclick="return confirm('您确定要删除嘛?')">
                <%--<s:param name="id" value="%{id}"/>--%>
                删除
            </s:a>

            <s:a action="role_editUI?id=%{id}">修改</s:a> <br>
        </s:iterator>
            <s:a action="role_addUI">添加</s:a>
    </body>
</html>
