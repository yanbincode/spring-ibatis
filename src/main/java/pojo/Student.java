package pojo;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -3275378188512857880L;

	private Long stuId;
	private String stuName;
	private String stuGender;
	private Long stuAge;

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public Long getStuAge() {
		return stuAge;
	}

	public void setStuAge(Long stuAge) {
		this.stuAge = stuAge;
	}

}
