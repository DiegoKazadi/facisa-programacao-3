package br.edu.facisa.p3.ed.stack;

import java.util.Stack;

/**
 * Exemplo de Pilha em Java
 * 
 * @author daniel
 *
 */
public class StackJavaTest {

	public static void main(String[] args) {

		//cria��o da pilha fornecida pelo Java
		Stack<String> pilha = new Stack<String>();
		
		//empilhando os elementos "a" e "b"
		pilha.push("a");
		pilha.push("b");
		
		//fun��o que exibe (n�o desempilha) quem est� no topo
		//se a pilha estiver vazia, pode lan�ar StackEmptyException
		System.out.println(pilha.peek());
		
		//desempilha o objeto
		//se a pilha estiver vazia, pode lan�ar StackEmptyException
		String elementoDesempilhado = pilha.pop();
		System.out.println(elementoDesempilhado);

		//agora que desempilhamos "b", o elemento "a" est� no topo
		System.out.println(pilha.peek());
		
		
		
	}
	

}
