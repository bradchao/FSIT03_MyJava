import java.lang.reflect.Constructor;

public class Brad05 {
	public static void main(String[] args) {
		String[] name = {"Brad"};
		Class nameClass = name.getClass();
		System.out.println(nameClass.getName());
		System.out.println(nameClass.isInterface());
		System.out.println(nameClass.isPrimitive());
		System.out.println(nameClass.isArray());
		System.out.println(nameClass.getSuperclass().getName());
		System.out.println("------");
		Class strClass = String.class;

		try {
			Class c1 = Class.forName("Brad051");
			c1.newInstance();
			
		}catch(Exception ee) {
			System.out.println(ee.toString());
		}
		System.out.println("------");
		
		try {
			Class c2 = Class.forName("tw.brad.app01.Brad01");
			System.out.println(c2.getName());
			System.out.println(c2.getPackage().getName());
			Constructor[] cs =  c2.getConstructors();
			System.out.println(cs.length);
			for (Constructor cc : cs) {
				Class[] types = cc.getParameterTypes();
				for (Class type : types) {
					System.out.println(type.getName());
				}
				System.out.println("-----");
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
		
	}
}

class Brad051 {
	static {
		System.out.println("Load Brad051");
	}
	{
		System.out.println("Brad051 object");
	}
}


