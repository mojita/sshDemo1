<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <body>
        <s:form action="role_edit">
            <s:hidden name="id"/>
            <s:textfield label="岗位名称" name="name"/> <br>
            <s:textfield label="岗位描述" name="description"/> <br>
            <s:submit value="提交"/>
        </s:form>
    </body>
</html>
