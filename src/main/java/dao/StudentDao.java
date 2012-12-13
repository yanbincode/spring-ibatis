package dao;

import java.util.List;

import pojo.Student;

/**
 * dao接口
 * 
 * @author yanbin
 * 
 */
public interface StudentDao {

	/**
	 * 根据ID获取一条记录
	 * 
	 * @param stuId
	 * @return
	 */
	public Student get(Long stuId);

	/**
	 * 获取所有的student
	 * 
	 * @return
	 */
	public List<Student> getAll();

	/**
	 * 添加
	 * 
	 * @param student
	 */
	public void insert(Student student);

	/**
	 * 修改
	 * 
	 * @param student
	 */
	public void update(Student student);

	/**
	 * 删除
	 * 
	 * @param student
	 */
	public void delete(Student student);

}
