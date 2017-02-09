package com.tarena.dao;

import java.util.List;

import com.tarena.annotation.MyBatisRespository;
import com.tarena.entity.Emp;

/**
 * 自定义注解的Dao
 * @author wgs
 *
 */
@MyBatisRespository
public interface EmpDao {
	List<Emp> findAll();
}
