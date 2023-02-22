package oneTempModePck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

public class executaTM {

	private JFrame frameTela;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					executaTM window = new executaTM();
					window.frameTela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public executaTM() {
		initialize();
	}

	
	private void initialize() {
		frameTela = new JFrame();
		frameTela.setBounds(100, 100, 450, 300);
		frameTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frameTela.getContentPane().setLayout(springLayout);
		executarConversor();
		frameTela.dispose();
	}
	
	
	private void executarConversor( ) {
		String type = (JOptionPane.showInputDialog(null, "Escolha uma opção:","Menu de Conversão",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Converter Moedas", "Converter Temperatura"},null)).toString();
		
		if(type == null) {
			System.exit(0);
		}
		
		Object[] opcoes = new Object[] {
				"Reais => Dóllar",
				"Reais => Euro",
				"Reais => Libras Esterlinas",
				"Reais => Peso Argentino",
				"Reais => Peso Chileno",
				"Dólar => Reais",
				"Euro => Reais",
				"Libras Esterlinas => Reais",
				"Peso Argentino =>  Reais",
				"Peso Chileno => Reais"
		};

		
		if(type == "Converter Moedas") {
			String input = JOptionPane.showInputDialog(null, "Digite um valor:");
			
			if(input == null) {
				System.exit(0);
			}
			
			String dinheiro = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro","Moeda",
					JOptionPane.PLAIN_MESSAGE, null, opcoes,null)).toString();
			
			if(dinheiro == null) {
				System.exit(0);
			}
			
			try {
				double numeroDouble  = Double.parseDouble(input);
				
				conversorMoeda converterMoeda =  new conversorMoeda();
				
				String moedaConvertida = converterMoeda.converterMoeda(dinheiro, numeroDouble);
				
				JOptionPane.showMessageDialog(frameTela, moedaConvertida, "Message", JOptionPane.INFORMATION_MESSAGE);
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				
				if (escolha == JOptionPane.YES_OPTION) {
		    
		            executarConversor();
		            
		        } else if (escolha == JOptionPane.NO_OPTION) {
		            JOptionPane.showMessageDialog(frameTela, "Conversor ONE finalizado", "Message", JOptionPane.INFORMATION_MESSAGE);
		            System.exit(0);
		        } else if (escolha == JOptionPane.CANCEL_OPTION) {
		            
		            System.exit(0);
		        }
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Erro: Valor digitado não é um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
				executarConversor();
			}	

		} else {
			String tipoDeConversor = (JOptionPane.showInputDialog(null, "Escolha uma opção:","Converter Temperatura",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celsius para Fahrenheit", "Fahrenheit para Celsius"},null)).toString();
			
			if(tipoDeConversor == null) {
				System.exit(0);
			}
			
			if(tipoDeConversor == "Celsius para Fahrenheit") {
				
				try {
					String input = JOptionPane.showInputDialog(null, "Insira um valor:");
					
					if(input == null) {
						System.exit(0);
					}
					
					double numeroDouble  = Double.parseDouble(input);
					conversorTemperatura converter = new conversorTemperatura();
					String retorno = converter.CelsiusToFahrenheit(numeroDouble);
					
					JOptionPane.showMessageDialog(frameTela, retorno, "Message", JOptionPane.INFORMATION_MESSAGE);
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
					if (escolha == JOptionPane.YES_OPTION) {
			            
			            executarConversor();
			            
			        } else if (escolha == JOptionPane.NO_OPTION) {
			            JOptionPane.showMessageDialog(frameTela, "Conversor ONE finalizado", "Message", JOptionPane.INFORMATION_MESSAGE);
			            System.exit(0);
			        } else if (escolha == JOptionPane.CANCEL_OPTION) {
			            
			            System.exit(0);
			        }
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Erro: Valor digitado não é um número válido, verifique!", "Erro", JOptionPane.ERROR_MESSAGE);
					executarConversor();
				}
				
			} else {
				try {
					String input = JOptionPane.showInputDialog(null, "Insira um valor:");
					
					if(input == null) {
						System.exit(0);
					}
					
					double numeroDouble  = Double.parseDouble(input);
					conversorTemperatura converter = new conversorTemperatura();
					String retorno = converter.FahrenheitToCelsius(numeroDouble);
					
					JOptionPane.showMessageDialog(frameTela, retorno, "Message", JOptionPane.INFORMATION_MESSAGE);
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					if (escolha == JOptionPane.YES_OPTION) {
			            
			            executarConversor();
			            
			        } else if (escolha == JOptionPane.NO_OPTION) {
			           
			            JOptionPane.showMessageDialog(frameTela, "Conversor ONE finalizado", "Message", JOptionPane.INFORMATION_MESSAGE);
			            System.exit(0);
			        } else if (escolha == JOptionPane.CANCEL_OPTION) {
			            
			            System.exit(0);
			        }
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Erro: Valor digitado não é um número válido, verifique!", "Erro", JOptionPane.ERROR_MESSAGE);
					executarConversor();
				}
			}
		}
	}

}
