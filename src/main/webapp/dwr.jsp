<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>    
<html>    
    <head>
        <% String path = request.getContextPath(); %>
 
        <title>首页</title>    
        <script type="text/javascript" src="<%=path%>/dwr/engine.js"></script>    
        <script type="text/javascript" src="<%=path%>/dwr/util.js"></script>    
        <script type="text/javascript" src="<%=path%>/dwr/interface/DWRService.js"></script>    
        <script type="text/javascript"> 
  
            // 调用服务端getMessage方法   
            function firstDwr(){    
              DWRService.getMessage(callBackHello);    
            }    
             // 回调方法，显示从服务器返回的信息   
            function callBackHello(data){    
                alert(data);    
            }    
        </script>    
    </head>
    <body>    
        <input type="button" name="button" value="测试" onclick="firstDwr()">
        <!-- firstDwr() 方法内发起   http://localhost:8080/dwr/call/plaincall/DWRService.getMessage.dwr -->
    </body>    
</html>  