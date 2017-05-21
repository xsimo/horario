package com.xsimo.horario;

public class Horario {
	public Selection[] s;
	public int numeroHoraire;
	public String toString(){
		StringBuffer string= new StringBuffer();
		string.append("----------------\n");
		string.append("HORAIRE # "+numeroHoraire+"\n");
		for(int i = 0;i<4;i++){
			string.append(s[i].c.nom+"\n");
			string.append("\t"+s[i].c.periode_magistrale+" : cours magistral \n");
			string.append("\t"+s[i].c.t.get(s[i].g).TRAVAUX1+"-"+s[i].c.t.get(s[i].g).TRAVAUX2+" : TD/TME \n");
		}
		string.append("----------------\n");
		return string.toString();
	}
	public String toStringFancy(){
		java.util.SortedSet<Integer> m = new java.util.TreeSet<Integer>();
		StringBuffer string = new StringBuffer();
		for(int i = 0; i< 4;i++){
			m.add(this.s[i].c.periode_magistrale);
			m.add(this.s[i].c.t.get(this.s[i].g).TRAVAUX1);
			m.add(this.s[i].c.t.get(this.s[i].g).TRAVAUX2);
		}
		char[] jours = {'L','M','M','J','V'};
		string.append("--------------------------------------------------------------------------------\n<br>");
		string.append("HORAIRE # "+this.numeroHoraire+"\n<br>");
		string.append("----------------------------\n<br>");
		
		for(int i = 0;i<5;i++){
			string.append("|"+jours[i]+"|");
			for(int p = 0 ; p< 5 ;p++){
				if(m.contains((i*5)+p+1)){
					if(((i*5)+p+1)<10){
						string.append(" 0");
					}else{
						string.append(" ");
					}
					string.append((i*5)+p+1+" |");
				}else{
					string.append("&nbsp;&nbsp;&nbsp;&nbsp;|");
				}
				if(p==4){
					string.append("\n<br>");
				}
			}
		}
		string.append("----------------------------\n<br>");
		for(int i = 0; i< 4;i++){
			string.append(s[i].c.nom+"\n<br>");
			string.append("\t"+s[i].c.periode_magistrale+" : cours magistral \n<br>");
			string.append("\t"+s[i].c.t.get(s[i].g).TRAVAUX1+"-"+s[i].c.t.get(s[i].g).TRAVAUX2+" : TD/TME \n<br>");
		}
		
		return string.toString();
		/*
DESIRED
--------------------------------------------------------------------------------
HORAIRE # 1
----------------------------
----------------------------
|L| 01 | 02 | -- | 03 | 04 |
|M| 06 | 07 | 08 | -- | -- |
|M| 11 | 12 | 13 | 14 | 15 |
|J| -- | -- | -- | -- | -- |
|V| -- | -- | -- | -- | -- |
----------------------------
Principes des sytèmes d'exploitation
 	6 : cours magistral 
	1-2 : TD/TME 
Applications et interfaces homme-machine
	11 : cours magistral 
	4-5 : TD/TME 
Modélisation et résolution de problèmes
	7 : cours magistral 
	12-13 : TD/TME 
Algorithmique appliquée à l'optimisation
	8 : cours magistral 
	14-15 : TD/TME 
--------------------------------------------------------------------------------


 
		 */
	}
}
