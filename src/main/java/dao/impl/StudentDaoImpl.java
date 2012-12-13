package dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import pojo.Student;
import dao.StudentDao;

/**
 * dao实现类
 * 
 * @author yanbin
 * 
 */
public class StudentDaoImpl extends SqlMapClientDaoSupport implements StudentDao {

	@Override
	public Student get(Long stuId) {
		// 注意:queryForObject方法返回一个Object,第一个参数与Student.xml的select元素 的id属性值对应,
		// 第二个参数的类型与Student.xml的select元素的parameterClass属性值对应.
		// 返回值与Student.xml的select元素的resultClass对应.
		return (Student) getSqlMapClientTemplate().queryForObject("getById", stuId);
	}

	@Override
	public List<Student> getAll() {
		@SuppressWarnings("unchecked")
		List<Student> students = getSqlMapClientTemplate().queryForList("getAll");
		return students;
	}

	@Override
	public void insert(Student student) {
		getSqlMapClientTemplate().insert("insert", student);
	}

	@Override
	public void update(Student student) {
		getSqlMapClientTemplate().update("update", student);
	}

	@Override
	public void delete(Student student) {
		getSqlMapClientTemplate().delete("delete", student);
	}

}
