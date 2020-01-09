package com.niepengfei.mybatis.custom;

import org.apache.ibatis.annotations.Select;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2020/1/4
 */
public class NpfInvocationHandler implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Select select = method.getAnnotation(Select.class);
        String value = select.value()[0];
        System.out.println("执行的sql语句是 : " +value );
        //假设这里执行数据库操作
        Map<String,String> map = new HashMap<String, String>();
        map.put("id","2");
        map.put("name","name2");
        map.put("password","password2");
        return map;
    }
}
