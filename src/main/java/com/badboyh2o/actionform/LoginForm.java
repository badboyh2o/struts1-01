package com.badboyh2o.actionform;

import org.apache.struts.action.ActionForm;
 
public class LoginForm  extends ActionForm {
    
     private static final long serialVersionUID = 1L;
        private String userName;//接收表单数据，字段名必须与表单一致
        private String password;
        private String msg;//返回错误信息
 
        public String getMsg() {
            return msg;
        }
 
 
        public void setMsg(String msg) {
            this.msg = msg;
        }
 
 
        public String getUserName() {
            return userName;
        }
        public void setUserName(String userName) {
            this.userName = userName;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
 
 
 
}