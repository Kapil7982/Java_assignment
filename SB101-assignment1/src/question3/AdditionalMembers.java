package question3;

import java.time.LocalDate;
import java.util.Comparator;

public class AdditionalMembers implements Comparator<AdditionalMembers> {

	private int memberId;
	private String memberName;
	private int membershipNo;
	private LocalDate membershipEnddate;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public int getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}
	
	public LocalDate getMembershipEnddate() {
		return membershipEnddate;
	}
	public void setMembershipEnddate(LocalDate membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}
	
	public AdditionalMembers(int memberId, String memberName, int membershipNo, LocalDate membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	
	public AdditionalMembers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "AdditionalMembers [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo="
				+ membershipNo + ", membershipEnddate=" + membershipEnddate + "]";
	}
	@Override
	public int compare(AdditionalMembers o1, AdditionalMembers o2) {
		if(o1.getMemberId()!=o2.getMemberId() &&o1.getMembershipNo() !=o2.getMembershipNo()) {
			if(o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate())>0) {
			return 1;	
			}
			else if(o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate())<0) {
				return -1;	
				}
			else {
				if(o1.getMemberId()>o2.memberId)
					return 1;
				else
					return -1;
			}
		}
		else {
			return 0;
		}
	}
	
	
}