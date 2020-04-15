package objetos3;

import java.util.concurrent.SynchronousQueue;

public class TestAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pinguino tux = new Pinguino(Sexo.Hermafrodita);
		tux.come();
		tux.vuela();
		tux.programa();

		Canario tuiti = new Canario();
		tuiti.camina(2);
		tuiti.canta();
		tuiti.come("china");

		Gato tom = new Gato();
		Gato botas = new Gato(Sexo.Macho);
		tom.amamanta();
		tom.anda();
		tom.caza();
		tom.cuidarCrias();
		tom.peleaCon(botas);

		Lagarto chino = new Lagarto();
		chino.comeCarne();
		chino.escondete();
	}

}
