package com.xsimo.horario.test;

import java.util.ArrayList;

import org.junit.Test;

import com.xsimo.horario.Constante;
import com.xsimo.horario.Cours;
import com.xsimo.horario.Horario;
import com.xsimo.horario.Selection;
import com.xsimo.horario.Travaux;

public class TestHorario {
	@Test
	public void testHorario(){
		int c = 0;
		ArrayList<Horario> possi = new ArrayList<Horario>();
		Cours cours1 = new Cours();
		cours1.nom = "TEST1";
		cours1.periode_magistrale = 1;
		cours1.t = new ArrayList<Travaux>();
		cours1.t.add(0,new Travaux(1,2,3));
		cours1.t.add(1,new Travaux(2,4,5));
		
		Cours cours2 = new Cours();
		cours2.nom = "TEST2";
		cours2.periode_magistrale = 6;
		cours2.t = new ArrayList<Travaux>();
		cours2.t.add(0,new Travaux(1,7,8));
		cours2.t.add(1,new Travaux(2,9,10));
		
		Cours cours3 = new Cours();
		cours3.nom = "TEST3";
		cours3.periode_magistrale = 11;
		cours3.t = new ArrayList<Travaux>();
		cours3.t.add(0,new Travaux(1,12,13));
		cours3.t.add(1,new Travaux(2,14,15));
		
		Cours cours4 = new Cours();
		cours4.nom = "TEST4";
		cours4.periode_magistrale = 16;
		cours4.t = new ArrayList<Travaux>();
		cours4.t.add(0,new Travaux(1,14,15));
		cours4.t.add(1,new Travaux(2,19,20));

		for(int i =0 ; i<cours1.t.size();i++){
			Selection s1 = new Selection();
			s1.c = cours1;
			s1.g = i;
			for(int j = 0 ; j < cours2.t.size();j++){
				Selection s2 = new Selection();
				s2.c = cours2;
				s2.g = j;
				for(int k = 0 ; k< cours3.t.size();k++){
					Selection s3 = new Selection();
					s3.c = cours3;
					s3.g = k;
					for (int l = 0; l<cours4.t.size();l++){
						Selection s4 = new Selection();
						s4.c = cours4;
						s4.g = l;
						Horario h = new Horario();
						Selection [] s = new Selection[4];
						s[0] = s1;
						s[1] = s2;
						s[2] = s3;
						s[3] = s4;
						h.s = s;
						
						if(Constante.validate(h.s)){
							System.out.println(true);
							h.numeroHoraire = c++;
							possi.add(h);
						}else{
							System.out.println("false");
						}
					}
				}
			}
		}
		//System.out.println("resultat de 2^4 est "+c);
		System.out.println((int)13/5);
		for(int m = 0 ; m< possi.size();m++){
			System.out.println(possi.get(m).toString());
		}
	}
}
