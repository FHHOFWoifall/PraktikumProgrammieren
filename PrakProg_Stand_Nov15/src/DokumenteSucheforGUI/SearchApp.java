package DokumenteSucheforGUI;

import DokumenteSuche.SearchAlt;

public class SearchApp {
	/*1.12 Zwischenpr�seentation
	 * wird eigentlich nicht mehr ben�tigt, da die Index App automatisch eine Suche instanziertt
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s  =  new Search("C:/test/","du");
		try{
		s.find();
		System.out.println("Funtst");
	}catch(Exception e){
		System.out.println("fehler !!!");
		e.printStackTrace();
	
	}
	}
}
