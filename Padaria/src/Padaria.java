
public class Padaria {

	public static void main(String[] args) {
		Cookie cookie = new Cookie("caramelo", "Doces");
		Pao pao = new Pao("P�o frances", "Sal");
		
		System.out.println(cookie.getNomeItem() + cookie.getDepartamento());
		System.out.println(pao.getNomeItem() + pao.getDepartamento());
	}

}
