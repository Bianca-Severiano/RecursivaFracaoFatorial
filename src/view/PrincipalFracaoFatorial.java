package view;
import controller.ControllerFracaoFatorial;

public class PrincipalFracaoFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		
		ControllerFracaoFatorial cff = new ControllerFracaoFatorial();

		double res = cff.Fracao(N);
		System.out.println(res);
	}

}
