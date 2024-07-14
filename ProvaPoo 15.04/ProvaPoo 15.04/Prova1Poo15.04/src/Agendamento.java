
public class Agendamento {
	Medico medico = new Medico();
	public int dia;
	public int mes;
	
	public Agendamento()
    {

    }

    public Agendamento(Medico medico, int dia, int mes)
    {
    	this.medico = medico;
    	this.dia = dia;
    	this.mes = mes;
    }
    
    public String relatorio() 
    {
    	return "Nome: " + this.medico.getnome()  
    			+ "\nEspecialidade: " + this.medico.getEspecialidade()
    			+ "\nData de agendamento: " + this.dia + " / " + this.mes;
    }

    public void setMedico(Medico medico)
    {
    	this.medico = medico;
    }
    
	public void setDia(int dia) 
	{
		this.dia = dia;
	}
	public int getDia() 
	{
		return this.dia;
	}
	public void setMes(int Mes) 
	{
		this.mes = mes;
	}
	public int getMes() 
	{
		return this.mes;
	}
}
