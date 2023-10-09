public class ruumala {
	public static double silinder (String a, String h) {
	float raadius = Float.parseFloat(a);
	float korgus = Float.parseFloat(h);
	double s =3.14* (raadius + korgus);
	return s;
	}
	
	public static double koonus (String a, String h) {
	float raadius = Float.parseFloat(a);
	float korgus = Float.parseFloat(h);
	double s =(0.33) * raadius * korgus;
	return s;
	}
	
	public static double risttahulisepuramiidiruumala (String a, String h) {
	float pindala = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
	double s =(0.33) * pindala * korgus;
	return s;
	}
	 }