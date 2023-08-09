public class calculadoraProfessor {
	
	public static void main (String[] args) {

	float pi = 3.14f;
	float raio = 5.3f;
		
	// Calculando a área do circulo
	float areaCirculo = (raio * 2) * pi;
	System.out.println("Area do circulo: " + areaCirculo);
		
	// Calculando a área do circulo usando CASTING para forçar conversão de float para inteiro
	int conversaoTipoAreaCirculo = (int) areaCirculo;
	System.out.println("Area do circulo convertida para o tipo int : " + conversaoTipoAreaCirculo );
	
	}

}
