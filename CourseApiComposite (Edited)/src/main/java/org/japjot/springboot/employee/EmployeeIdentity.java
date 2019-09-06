package org.japjot.springboot.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Embeddable
public class EmployeeIdentity implements Serializable{

	@Id
    @Size(max=20)
    @Column
	private Long empId;
	@Id
	@Size(max=20)
	@Column 
	private Long companyId;

	public EmployeeIdentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeIdentity(@Size(max = 20) Long empId, @Size(max = 20) Long companyId) {
		super();
		this.empId = empId;
		this.companyId = companyId;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeIdentity that = (EmployeeIdentity) o;

        if (!empId.equals(that.empId)) return false;
        return companyId.equals(that.companyId);
    }

    @Override
    public int hashCode() {
        int result = empId.hashCode();
        result = 31 * result + companyId.hashCode();
        return result;

    }
}
