package abstraction;

public class Automation  extends MultipleLangauge{

	public void Selenium() {
		System.out.println("Selenium Webdriver");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby Language");
	}
	public static void main(String[] args) {
		Automation am = new Automation();
		am.Java();
		am.Selenium();
		am.python();
		am.ruby();
	}
}
