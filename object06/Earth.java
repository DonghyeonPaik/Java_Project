package object06;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { // static final 변수를 초기화하는 다른 방법
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	// static final은 stack 영역에 저장해서 모든 객체들이 공유하도록 함.
}
