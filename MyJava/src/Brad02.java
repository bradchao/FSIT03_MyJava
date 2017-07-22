
/*
 * Annotation => key-value => metadata
 * 1. Compile Time
 * 2. �o���ɴ�
 * 3. Run Time
 * �榡: @Entity
 * @Author(name="Brad", date="2017/07/22")
 * @Xxx(value="default")
 * @Xxx("default")
 * �H�U�i�P�ɦh�ӬۦP
 * @Author("Brad1")
 * @Author("Brad2")
 * @Author("Brad3")
 */

public class Brad02 {
	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		obj1.m1();
		obj1.m2();
	}
}

class Test1 {
	void m1() {}
	@Deprecated
	void m2() {}
}
class Test2 extends Test1 {
	//@Override
	void m11() {}
	@Override
	void m1() {}
}


