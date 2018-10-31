package com.skilltrace.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="employeeSkills1")
public class EmployeeSkill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long employeeSkillsId;
	
	@NotNull(message="Cannot be empty")
	private long employeeId;
	
	@NotEmpty(message="Cannot be empty")
	private String employeeName;
	
	@NotNull(message="Cannot be null")
	private long skillId;
	
	@NotEmpty(message="Cannot be empty")
	private String skillName;
	
	
	@NotEmpty(message="Cannot be empty")
	@Size(min=1, max=10)
	private int Level;
	
	public EmployeeSkill() {
		
	}

	public EmployeeSkill(long employeeSkillsId,long employeeId,String employeeName,long skillId,String skillName, int level) {
		super();
		this.employeeSkillsId = employeeSkillsId;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.skillId = skillId;
		this.skillName = skillName;
		Level = level;
	}

	public long getEmployeeSkillsId() {
		return employeeSkillsId;
	}

	public void setEmployeeSkillsId(long employeeSkillsId) {
		this.employeeSkillsId = employeeSkillsId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}
	
	
	
	

	
	
}
