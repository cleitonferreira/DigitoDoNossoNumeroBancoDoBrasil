# DigitoDoNossoNumeroBancoDoBrasil
DigitoDoNossoNumeroBancoDoBrasil


 Cálculo Dígito Módulo 11 (CPF, CNPJ, PIS, etc):
 
 Cálculo para encontrar o último dígito do nossonumero, para gerar boleta do Banco Brasil.
 
 
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
