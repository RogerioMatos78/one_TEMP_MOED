package oneTempModePck;

import javax.swing.JOptionPane;

public class conversorMoeda {
	//conversor modeda
public String converterMoeda(String paismod, double valorRet) {
		
		double moedavalorConvertido = 0;
		String text = null;
		
		try {
			switch(paismod) {
			
			case "Reais => D�llar":
				moedavalorConvertido = valorRet * 0.69;
				return text = "Voc� tem USD "+moedavalorConvertido+ " d�lares";
			
			case "Reais => Euro":
				moedavalorConvertido = valorRet * 0.28;
				return text = "Voc� tem EUR "+moedavalorConvertido+ " euros";
				
			case "Reais => Libras Esterlinas":
				moedavalorConvertido = valorRet * 0.56;
				return text = "Voc� tem GBP "+moedavalorConvertido+ " libras esterlinas";
				
			case "Reais => Peso Argentino":
				moedavalorConvertido = valorRet * 37.97;
				return text = "Voc� tem ARS "+moedavalorConvertido+ " pesos argetinos";
			
			case "Reais => Peso Chileno":
				moedavalorConvertido = valorRet * 165;
				return text = "Voc� tem CLP "+moedavalorConvertido+ " pesos chilenos";
				
				
			case "D�lar => Reais":
				moedavalorConvertido = valorRet * 5.89;
				return text = "Voc� tem R$ "+moedavalorConvertido+ " reais";
				
			case "Euro => Reais":
				moedavalorConvertido = valorRet * 6.11;
				return text = "Voc� tem R$ "+moedavalorConvertido+ " reais";
			
			case "Libras Esterlinas => Reais":
				moedavalorConvertido = valorRet * 7.21;
				return text = "Voc� tem R$ "+moedavalorConvertido+ " reais";
				
			case "Peso Argentino =>  Reais":
				moedavalorConvertido = valorRet * 0.07;
				return text = "Voc� tem R$ "+moedavalorConvertido+ " reais";
				
			case "Peso Chileno => Reais":
				moedavalorConvertido = valorRet * 0.06;
				return text = "Voc� tem R$ "+moedavalorConvertido+ " reais";
		}
		
		
		} catch (NumberFormatException  e) {
			JOptionPane.showMessageDialog(null, "Erro: Valor digitado n�o � um n�mero v�lido");
		}
		
		return text;

	}
}
