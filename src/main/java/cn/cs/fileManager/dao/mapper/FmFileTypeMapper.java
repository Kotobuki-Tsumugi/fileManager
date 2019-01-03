package cn.cs.fileManager.dao.mapper;

import cn.cs.fileManager.dao.model.FmFileType;
import cn.cs.fileManager.dao.model.FmFileTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FmFileTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	long countByExample(FmFileTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	int deleteByExample(FmFileTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	int insert(FmFileType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	int insertSelective(FmFileType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	List<FmFileType> selectByExample(FmFileTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	int updateByExampleSelective(@Param("record") FmFileType record, @Param("example") FmFileTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	int updateByExample(@Param("record") FmFileType record, @Param("example") FmFileTypeExample example);
}