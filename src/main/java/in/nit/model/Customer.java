package in.nit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custid")

public class Customer {
	
	@Id
	@Column(name="cid")
	private Integer custId;
	@Column(name="cname")
	private String custName;
	@Column(name="custAddr")
	private String custAddr;

	public Customer() {
		super();
		
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddr=" + custAddr + "]";
	}
	
	
	

}

