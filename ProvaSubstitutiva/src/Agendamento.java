
public class Agendamento {
	private String especialidade;
	private String dia;
	private String mes;
	private Medico medico;
	private String relatorio;
	
	public Agendamento(String especialidade, String dia, String mes, Medico medico) 
	{
		this.especialidade = especialidade;
		this.dia = dia;
		this.mes = mes;
		this.medico = medico;
	}
	
	public Agendamento(String especialidade, String dia, String mes) 
	{
		this.especialidade = especialidade;
		this.dia = dia;
		this.mes = mes;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
}
