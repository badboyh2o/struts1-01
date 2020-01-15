package com.badboyh2o.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.badboyh2o.actionform.LoginForm;
 
public class LoginAction extends Action {
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //将传进来的ActionForm对象向下转型，获得数据
        LoginForm user = (LoginForm) form;
        String userName = user.getUserName();
        System.out.println(userName);
        String password = user.getPassword();
        System.out.println(password);
        //判断登录结果，并响应给Action
        if("zhang".equals(userName) && "123".equals(password))
            return mapping.findForward("sucess");
        else
            return mapping.findForward("fail");
    }
 
}