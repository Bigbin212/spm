package com.bigbincom.bigbin.dao;

import com.bigbincom.bigbin.entity.BZUser;
import com.bigbincom.bigbin.entity.BZUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BZUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    long countByExample(BZUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int deleteByExample(BZUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int deleteByPrimaryKey(String xlh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int insert(BZUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int insertSelective(BZUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    List<BZUser> selectByExample(BZUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    BZUser selectByPrimaryKey(String xlh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int updateByExampleSelective(@Param("record") BZUser record, @Param("example") BZUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int updateByExample(@Param("record") BZUser record, @Param("example") BZUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int updateByPrimaryKeySelective(BZUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_z_user
     *
     * @mbg.generated Tue Jan 19 10:39:20 CST 2021
     */
    int updateByPrimaryKey(BZUser record);

    List<BZUser> selectAll();

    void insertPatch(List<BZUser> list);
}