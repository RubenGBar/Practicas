package ejerciciosprueba;

public class Fibonnacci {
	
	int num;
	
	public Fibonnacci() {

	}
	
	public Fibonnacci(int num) {
		this.num = num;
	}

	public double Fibonnaci() {
		double res = 0;
		int dosVecesAnterior = 0;
		int unaVezAnterior = 1;

		if (num == 0) {
			res = 0;
		} else if (num == 1) {
			res = 1;
		} else {
			
			 for (int i = 2; i <= num; i++) {
		            int suma = dosVecesAnterior + unaVezAnterior;
		            dosVecesAnterior = unaVezAnterior;
		            unaVezAnterior = suma;
		            
		            res = unaVezAnterior;
		        }

		}

		return res;
	}

}
