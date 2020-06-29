package com.ray.dao;

import com.ray.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao {
    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();
    //保存账户
    @Insert("insert into account (name,money) value (#{name},#{money})")
    public void saveAccount(Account account);
}
