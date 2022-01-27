package Renombrar;
/**
 * @autor:Alvaro Perez
 * */
public class Conversor {
	private static final float EUROS_PESETAS_CHANGE_RATE = 166.386f;

	public float eurosToPesetas(float euros) {
		float pesetas = euros * EUROS_PESETAS_CHANGE_RATE;
		return pesetas;
	}
}

