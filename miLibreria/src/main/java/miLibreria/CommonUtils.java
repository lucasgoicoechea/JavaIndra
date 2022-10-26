package miLibreria;

/* Clase singleton o patron sigleton*/
public class CommonUtils {
	
	static CommonUtils instances = new CommonUtils();
	
	public CommonUtils() {
		if (CommonUtils.instances != null) {
			return;
		}
		CommonUtils.instances = new CommonUtils();
	}
	
	public int sumaCien(int nro) {
		return nro + 100;
	}

}
