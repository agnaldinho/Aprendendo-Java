
public abstract class Mamifero implements Animal{
	private String corPelagem;
	public int espectativaIdade;
	
	public String getCorPelagem() {
		return corPelagem;
	}
	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}
	
	public abstract int getEspectativaIdade();
}
