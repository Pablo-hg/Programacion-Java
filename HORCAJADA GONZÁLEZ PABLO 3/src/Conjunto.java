

import java.util.ArrayList;

public class Conjunto<E> {
	
	private ArrayList<E> conj;

	public Conjunto() {
		conj = new ArrayList<E>();
	}
	
	public Conjunto(Conjunto c){
		
		this.conj = new ArrayList<E>(c.conj);
		/*for (int i = 0; i < c.conj.size(); i++)
			this.conj.add(c.conj.get(i));*/
		
	}
	
	public boolean anadirElemento (E el){
		boolean res = false;
		if (!this.conj.contains(el)){
			res = true;
			this.conj.add(el);
		}
		return res;		
		
		
	}
	
	public boolean quitarElemento (E el){
		
		return this.conj.remove(el);
		
	}
	
	public void vaciar(){
		this.conj.clear();
		
	}
	
	public Conjunto union (Conjunto c){
		
		Conjunto res = new Conjunto (c);
		for (int i = 0; i < this.conj.size(); i++)
			res.anadirElemento(this.conj.get(i));
		return res;
		
		
	}
	
	public Conjunto interseccion (Conjunto c){
		
		Conjunto res = new Conjunto();
		
		for (int i = 0; i < this.conj.size(); i++)
			if (c.conj.contains(this.conj.get(i)))
				res.conj.add(this.conj.get(i));
		return res;
		
	}
	
	

}
