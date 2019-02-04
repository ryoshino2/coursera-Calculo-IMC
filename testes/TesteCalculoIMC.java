import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculoIMC {
	 @Test
	    public void testeBaixoPesoMuitoGrave() {
	        Paciente p = new Paciente(51.0, 1.80);
	        assertEquals("Baixo peso muito grave = IMC abaixo de 16 kg/m²", p.verificarIMC());
	    }

	    public void testeBaixoPesoGrave() {
	        Paciente p = new Paciente(55.0,1.8);
	        assertEquals("Baixo peso grave = IMC entre 16 e 16,99 kg/m²", p.verificarIMC());
	    }

	    @Test
	    public void testeBaixoPeso() {
	        Paciente p = new Paciente(58.0,1.8);
	        assertEquals("Baixo peso = IMC entre 17 e 18,49 kg/m²", p.verificarIMC());
	    }

	    @Test
	    public void testeNormal() {
	        Paciente p = new Paciente(77.0,1.8);
	        assertEquals("Peso normal = IMC entre 18,50 e 24,99 kg/m²", p.verificarIMC());
	    }

	    @Test
	    public void testeSobrepeso() {
	        Paciente p = new Paciente(84.1,1.8);
	        assertEquals("Sobrepeso = IMC entre 25 e 29,99 kg/m²", p.verificarIMC());
	    }

	    @Test
	    public void testeObesidadeGrauI() {
	        Paciente p = new Paciente(100.0,1.8);
	        assertEquals("Obesidade grau I = IMC entre 30 e 34,99 kg/m²", p.verificarIMC());
	    }

	    @Test
	    public void testeObesidadeGrauII() {
	        Paciente p = new Paciente(117.0,1.8);
	        assertEquals("Obesidade grau II = IMC entre 35 e 39,99 kg/m²", p.verificarIMC());
	    }
	    
	    @Test
	    public void testeObesidadeGrauIII() {
	        Paciente p = new Paciente(143.0, 1.8);
	        assertEquals("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²", p.verificarIMC());
	    }
}
