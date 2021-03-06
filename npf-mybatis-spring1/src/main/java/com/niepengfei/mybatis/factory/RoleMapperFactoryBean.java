package com.niepengfei.mybatis.factory;

import com.niepengfei.mybatis.mapper.RoleMapper;
import com.niepengfei.mybatis.session.NpfMybatisSqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author niepengfei
 * @version 1.0.0
 * @since 2020/1/4
 */
public class RoleMapperFactoryBean<T> implements FactoryBean<T> {

    @Override
    public T getObject() throws Exception {
        return NpfMybatisSqlSession.getMapper(RoleMapper.class);
    }

    @Override
    public Class<?> getObjectType() {
        return RoleMapper.class;
    }
}
