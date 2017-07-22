
public class Brad04 {
	public static final int STOP = 1;
	public static final int UP = 2;
	public static final int DOWN = 3;
	public static final int LEFT = 4;
	public static final int RIGHT = 5;
	
	public static void main(String[] args) {
		Zone zone1 = Zone.area2;
		Zone zone2 = Zone.area2;
		System.out.println(zone1.getCode());
		switch (zone2) {
			case area1:
				break;
			case area2:
				break;
			case area3:
				break;
			case area4:
				break;
		}
		
		int myDir = Brad04.STOP;
		switch (myDir) {
			case Brad04.STOP:
				break;
			case Brad04.UP:
				break;
			case Brad04.DOWN:
				break;
			case Brad04.LEFT:
				break;
			case Brad04.RIGHT:
				break;
			case 123:
				break;
		}
		
		
	}
}

enum Dir {
	STOP, UP, DOWN, RIGHT, LEFT
}
enum Zone {
	area1("401"), area2("402"), area3("403"), area4("404");
	private String code;
	private Zone(String code) {
		//System.out.println("zone");
		this.code = code;
	}
	public String getCode() {
		return code;
	}
}
