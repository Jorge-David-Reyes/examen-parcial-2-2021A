package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.Nota;

public class Guitarra implements Instrumento{
	Nota nota;
	@Override
	public void tocaNota(Nota nota) {
		this.nota=nota;		
	}
	
}
