package com.xsimo.horario;

import java.io.IOException;
import java.util.ArrayList;
public class Main {
	public static void main(String [] args){
		int compteur = 0;
		ArrayList<Cours> cours = Constante.getCoursOptionnelOfferts();
		ArrayList<Horario> possi = new ArrayList<Horario>();
		Cours AIHM = Constante.getAIHM();
		Cours OS = Constante.getOS();
		//for each obligatoire config
		for(int x=0;x<=4;x++){
			Selection s1 = new Selection();
			s1.c = OS;
			s1.g = x;
			for(int y=0;y<=2;y++){
				Selection s2 = new Selection();
				s2.c = AIHM;
				s2.g = y;
				//for each config optionnelle
				for(int i=0;i<cours.size();i++){
					Cours courant = cours.get(i);
					cours.remove(i);
					for(int g = 0;g<courant.t.size();g++){
						Selection si = new Selection();
						si.c = courant;
						si.g = g;
						for(int j = 0; j<cours.size();j++){
							Cours coursj = cours.get(j);
							for(int d = 0 ; d<coursj.t.size();d++){
								Selection sj = new Selection();
								sj.c = coursj;
								sj.g = d;
								Selection [] s = new Selection[4];
								s[0] = s1;
								s[1] = s2;
								s[2] = si;
								s[3] = sj;
								if(Constante.validate(s)&&!Constante.already(possi,s) ){
									compteur++;
									Horario h = new Horario();
									h.s = s;
									h.numeroHoraire = compteur;
									possi.add(h);
								}
							}
						}
					}
					cours.add(i,courant);
				}
			}
		}
		StringBuffer string = new StringBuffer();
		string.append("<html><body><font style=\"font-family:courier\">");
		for(int w = 0 ; w< possi.size();w++){
			string.append(possi.get(w).toStringFancy());
		}
		string.append("</font></body></html>");
		java.io.File f = new java.io.File("c:\\Program Files\\galileo\\workspace\\xsimo.com\\4DaysChoices.html");
		java.io.FileWriter fw = null;
		try{
			fw = new java.io.FileWriter(f);
			fw.write(string.toString());
			fw.close();
		}catch(java.io.IOException e){
			try{fw.close();}catch(Exception d){;}
			e.printStackTrace();
		}
	}
}
