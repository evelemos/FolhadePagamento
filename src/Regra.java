import javax.swing.JOptionPane;

public class Regra {
	public static void main(String args[]) {
		
		
		Funcionario lista[];
		
		lista = new Funcionario[10];
		
		lista[0] = new Funcionario(1, "Gilberto", "Analista de Sistema pl", 10000);
		lista[1] = new Funcionario(2, "Isilda", "Operador de caixa", 5000);
		lista[2] = new Funcionario(3, "Robert", "Programador Jr", 8000);
		lista[3] = new Funcionario(4, "Isabella", "Programado Sr", 110000);
		lista[4] = new Funcionario(5, "Fatima", "Analista de Sistema", 120000);
		lista[5] = new Funcionario(6, "Roberval", "Analista de Sistema jr", 130000);
		lista[6] = new Funcionario(7, "Ester", "Programador", 140000);
		lista[7] = new Funcionario(8, "Estrela", "Arquiteto", 150000);
		lista[8] = new Funcionario(9, "Felipe", "Designer", 160000);
		lista[9] = new Funcionario(10, "Cardoso", "Analista de Sistema sr", 180000);
		
		
		for (int i = 0 ;   i <= 9     ; i++  ) {
					
			System.out.println("Nome: "+ lista[i].getNome());
			System.out.println("Funcao" + lista[i].getFuncao());
			System.out.println("SalarioBruto"+ lista[i].getSalarioBruto());
			System.out.println("Impoto"+ lista[i].calcularImposto());
		}
		
	}
	

}
