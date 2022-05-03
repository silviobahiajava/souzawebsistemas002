package br.com.souzawebsistemas.daos;

import java.util.ArrayList;
import java.util.List;
import br.com.souzawebsistemas.model.*;
public class CartConviteFactory {
	public static List load(){
		CartaConvite cartaConvite=new CartaConvite();
		List<CartaConvite>lista=new ArrayList<CartaConvite>();
		lista.add(cartaConvite);
		return lista;
	}
}
