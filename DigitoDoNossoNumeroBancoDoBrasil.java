/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitodonossonumerobancodobrasil;

/**
 *
 * @author cleiton
 *
 */
public class DigitoDoNossoNumeroBancoDoBrasil {

/**
	 * Retorna o(s) qtdDig Dígitos de Controle Módulo 11 do
	 * dado, limitando o Valor de Multiplicação em limMult:
	 *
	 *     Números Comuns:            NumDig      LimMult
	 *       CPF                        2           12
	 *       CNPJ                       2            9
	 *       PIS,C/C,Age                1            9
	 *
	 * @param dado    String contendo o nossonúmero
	 * @param qtdDig  Quantidade de dígitos
	 * @param limMult Limite de Multiplicação
	 * @return Dígitos calculados
	 */

	static String dado = "nossonúmero";
	private static int qtdDig = 1;
	private static int limMult = 9; 
	
	
	public static void main(String[] args) {


			int mult, soma, i, n;

			for (n = 1; n <= qtdDig; n++) {
				soma = 0;
				mult = 2;
				for (i = dado.length() - 1; i >= 0; i--) {
					soma += (mult * Integer.parseInt(dado.substring(i, i + 1)));
					if (++mult > limMult)
						mult = 2;
				}
				dado += String.valueOf(((soma * 10) % 11) % 10);
			}

			int variavel = Integer.parseInt(dado.substring(dado.length() - qtdDig, dado.length()));

			Object resultado = new Object();

			if (variavel > 9) {
				resultado = "X";
			} else {
				resultado = variavel;
			}

			System.out.println(resultado.toString());
		

	}
    
}
