package com.zzj.dao;

import com.zzj.model.DeviceUser;
import com.zzj.model.DeviceUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DeviceUserMapper {
    long countByExample(DeviceUserExample example);

    int deleteByExample(DeviceUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceUser record);

    int insertSelective(DeviceUser record);

    List<DeviceUser> selectByExampleWithRowbounds(DeviceUserExample example, RowBounds rowBounds);

    List<DeviceUser> selectByExample(DeviceUserExample example);

    DeviceUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceUser record, @Param("example") DeviceUserExample example);

    int updateByExample(@Param("record") DeviceUser record, @Param("example") DeviceUserExample example);

    int updateByPrimaryKeySelective(DeviceUser record);

    int updateByPrimaryKey(DeviceUser record);
}