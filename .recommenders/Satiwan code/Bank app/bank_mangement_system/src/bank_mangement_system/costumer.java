package bank_mangement_system;

public class costumer {
	Account acc=new Account();
	String firstname;
	String lastname;
	int nic;
	int phone_no;
    Account account;
    costumer(String firstname,String lastname,int nic,int phone_no){
    	this.firstname=firstname;
    	this.lastname=lastname;
    	this.nic=nic;
    	this.phone_no=phone_no;
    	
    	
    }
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getNic() {
		return nic;
	}
	public void setNic(int nic) {
		this.nic = nic;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "costumer [acc=" + acc + ", firstname=" + firstname + ", lastname=" + lastname + ", nic=" + nic
				+ ", phone_no=" + phone_no ;
	}
    
    
    
    
    
    
    
    
}
