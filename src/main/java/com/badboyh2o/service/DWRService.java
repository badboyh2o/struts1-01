package com.badboyh2o.service;

public class DWRService {

    public String getMessage() {
        return "this is the dwr invoke test!";
    }
    
    
    
    
//    动态将Java转为js发送给浏览器   dwr/DWRService.js
    
//    if (dwr == null) var dwr = {};
//    if (dwr.engine == null) dwr.engine = {};
//    if (DWREngine == null) var DWREngine = dwr.engine;
//
//    if (DWRService == null) var DWRService = {};
//    DWRService._path = '/dwr';
//    DWRService.getMessage = function(callback) {
//      dwr.engine._execute(DWRService._path, 'DWRService', 'getMessage', callback);
//    }
    
    
    
}
