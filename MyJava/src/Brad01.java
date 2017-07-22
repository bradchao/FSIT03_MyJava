
public class Brad01 {

	public static void main(String[] args) {
		try {
			MemberV2 member = new MemberV2();
			member.setAccount("test1");
			member.setPasswd("123");
			member.setRealname("Test 1");
			if (member.newInsert()) {
				System.out.println("Success");
			}else {
				System.out.println("Failure");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
