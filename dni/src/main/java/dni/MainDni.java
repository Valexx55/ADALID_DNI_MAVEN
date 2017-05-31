package dni;

public class MainDni {
	
	public static void main(String[] args) {
		
		char letra;
		try {
			//letra = Dni.calculaLetra(-53130985);
			letra = Dni.calculaLetra("X53130985");
			System.out.println("LETRA = " + letra);
		} catch (DniNegativoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
