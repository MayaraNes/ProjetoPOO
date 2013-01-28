import static org.junit.Assert.*;

import org.junit.Test;




public class TesteFachada{
	
	
	@Test
	public void TesteRemoverNivel(){
		Pergunta pergunta = new Pergunta("Elefante","E");
		Fachada.getInstance().adicionaNivel(1);
		Nivel n = Fachada.getInstance().pesquisa(1);
		n.remover(pergunta);
		assertEquals(n.pesquisa("Elefante"),pergunta);
	
	}
	
	
	
	
	

}
