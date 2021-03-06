package GuiaMyExtra.Interactions;

import co.proyectobase.myextra.util.Evidencia;
import co.proyectobase.myextra.util.myextra.MyExtra_init;
import co.proyectobase.myextra.util.myextra.Screen;
import co.proyectobase.myextra.util.myextra._Session;
import co.proyectobase.myextra.util.myextra._System;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class EscribirTexto implements Interaction{

	
	private String texto;
	private int fila;
	private int columna;
	public _System sSystem = null;
	public Screen screen = null;
	public _Session Sess0 = null;
	public int g_HostSettleTime = 3000;
	Evidencia evidencia = new Evidencia();
	
	public EscribirTexto(String texto, int fila, int columna) {
		this.texto = texto;
		this.fila = fila;
		this.columna = columna;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		sSystem = MyExtra_init.crearSistema();
		Sess0 = MyExtra_init.crearSesion(sSystem);
		screen = MyExtra_init.crearPantalla(Sess0);
		screen.putString(texto, fila, columna, null);
		screen.waitHostQuiet(g_HostSettleTime);
		Evidencia.captureScreen();	
		
	}

}
