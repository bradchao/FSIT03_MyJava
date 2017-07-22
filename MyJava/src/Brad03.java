import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Brad03 {
	public static void main(String[] args) {
		Brad031 obj1 = new Brad031();
		obj1.m1();
		Brad032 obj2 = new Brad032();
		obj2.m1();
		Brad033 obj3 = new Brad033();
		obj3.m1();
		Brad035 obj5 = new Brad035();
		obj5.m1();
	}
}
// Marker Annotation => 自己本身提供資訊
@interface Debug{}

class Brad031 {
	@Debug
	void m1() {}
}

@interface Debug2 {
	String value();
}
class Brad032 {
	@Debug2(value = "debug2")
	void m1() {}
}
class Brad033 {
	@Debug2("debug2")
	void m1(){}
}
// 傳遞多個值
@interface Debug3 {
	String[] value();
}
class Brad034 {
	@Debug3(value={"A1","A2","B1","B2"} )
	void m1() {}
}

@Retention(RetentionPolicy.RUNTIME)	// 宣告用來處理 Runtime
@interface Debug4{
	String[] value() default "Brad";
}
class Brad035 {
	@Debug4(value={"a","b","c"})
	public void m1() {
		try {
			Debug4 debug4 = getClass().getMethod("m1", null).getAnnotation(Debug4.class);
			String[] values = debug4.value();
			for (String value : values) {
				System.out.println(value);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface Debug5 {
	public enum Dir {
		STOP, UP, DOWN, RIGHT, LEFT
	};
	Dir dir() default Dir.STOP;
	String[] names() default {"guest"};
	boolean isWinner() default false;
}

class Brad036 {
	@Debug5(
			dir = Debug5.Dir.LEFT,
			names = {"brad1", "brad2"}
		)
	public void m1() {
		
	}
}








