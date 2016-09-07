
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <bod>
        <s:form action="role_add">
            <s:textfield label="岗位名称" name="name"/> <br>
            <s:textfield label="岗位说明" name="description"/> <br>
            <s:submit value="保存"/>
        </s:form>
    </bod>
</html>
