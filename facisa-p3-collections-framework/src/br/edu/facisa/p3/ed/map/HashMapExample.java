package br.edu.facisa.p3.ed.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Um mapa � composto por um conjunto de associa��es entre um objeto chave a um objeto valor.
 * 
 * Usado para "indexar" objetos de acordo com determinado crit�rio.
 * 
 * Suas principais implementa��es s�o o HashMap, o TreeMap e o Hashtable.
 * 
 * m�todo keySet() retorna um Set com as chaves daquele mapa 
 * m�todo values() retorna a Collection com todos os valores 
 * 
 * @author Daniel Abella
 *
 */
public class HashMapExample {

	public static void main(String[] args) {
	
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor", new ContaCorrente());
		mapaDeContas.put("gerente", new ContaCorrente());

		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");

	}

}
