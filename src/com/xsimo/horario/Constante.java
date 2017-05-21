package com.xsimo.horario;

import java.util.ArrayList;
public class Constante {
	public static ArrayList<Cours> getCoursOptionnelOfferts(){
		ArrayList<Cours> cours = new ArrayList<Cours>();
		Cours XmlA_322 = new Cours();
		XmlA_322.nom = "De XML aux arbres";
		XmlA_322.periode_magistrale = 1;
		XmlA_322.t = new ArrayList<Travaux>();
		XmlA_322.t.add(0,new Travaux(1,2,8));
		XmlA_322.t.add(1,new Travaux(2,22,23));
		cours.add(XmlA_322);
		Cours CAA_325 = new Cours();
		CAA_325.nom = "Conception d'algorithmes et applications";
		CAA_325.periode_magistrale = 2;
		CAA_325.t = new ArrayList<Travaux>();
		CAA_325.t.add(0,new Travaux(1,3,4));
		CAA_325.t.add(1,new Travaux(2,14,15));
		//INUTILE POUR L'ALGO
		//CAA_325.t.add(2,new Travaux(3,14,15));
		cours.add(CAA_325);
		Cours IR_320 = new Cours();
		IR_320.nom = "Ingénierie des réseaux";
		IR_320.periode_magistrale = 3;
		IR_320.t = new ArrayList<Travaux>();
		IR_320.t.add(0,new Travaux(1,6,7));
		IR_320.t.add(1,new Travaux(2,1,2));
		cours.add(IR_320);
		Cours PObj_314 = new Cours();
		PObj_314.nom = "Programmation par objets";
		PObj_314.periode_magistrale = 4;
		PObj_314.t = new ArrayList<Travaux>();
		PObj_314.t.add(0,new Travaux(1,11,12));
		PObj_314.t.add(1,new Travaux(2,16,17));
		PObj_314.t.add(2,new Travaux(3,9,10));
		//INUTILE POUR L'ALGO
		//PObj_314.t.add(3,new Travaux(4,9,10));
		PObj_314.t.add(3,new Travaux(4,17,18));
		PObj_314.t.add(4,new Travaux(5,22,23));
		cours.add(PObj_314);
		Cours MoReP_353 = new Cours();
		MoReP_353.nom = "Modélisation et résolution de problèmes";
		MoReP_353.periode_magistrale = 7;
		MoReP_353.t = new ArrayList<Travaux>();
		MoReP_353.t.add(0,new Travaux(1,12,13));
		cours.add(MoReP_353);
		Cours AlgOpt_348 = new Cours();
		AlgOpt_348.nom = "Algorithmique appliquée à l'optimisation";
		AlgOpt_348.periode_magistrale = 8;
		AlgOpt_348.t = new ArrayList<Travaux>();
		AlgOpt_348.t.add(0,new Travaux(1,14,15));
		cours.add(AlgOpt_348);
		Cours PDLC_354 = new Cours();
		PDLC_354.nom = "Programmation déclarative, logique et contraintes";
		PDLC_354.periode_magistrale = 9;
		PDLC_354.t = new ArrayList<Travaux>();
		PDLC_354.t.add(0,new Travaux(1,10,11));
		cours.add(PDLC_354);
		Cours PMcI_326 = new Cours();
		PMcI_326.nom = "Programmation des microcontrôleurs industriels";
		PMcI_326.periode_magistrale = 10;
		PMcI_326.t = new ArrayList<Travaux>();
		PMcI_326.t.add(0,new Travaux(1,24,25));
		cours.add(PMcI_326);
		Cours EnvDev_362 = new Cours();
		EnvDev_362.nom = "Environnement de développement";
		EnvDev_362.periode_magistrale = 12;
		EnvDev_362.t = new ArrayList<Travaux>();
		EnvDev_362.t.add(0,new Travaux(1,9,10));
		EnvDev_362.t.add(1,new Travaux(2,13,21));
		cours.add(EnvDev_362);
		Cours LPC_339 = new Cours();
		LPC_339.nom = "Logique, preuves et calculabilité";
		LPC_339.periode_magistrale = 13;
		LPC_339.t = new ArrayList<Travaux>();
		LPC_339.t.add(0,new Travaux(1,3,20));
		cours.add(LPC_339);
		Cours AProc_335 = new Cours();
		AProc_335.nom = "Architecture des processeurs";
		AProc_335.periode_magistrale = 14;
		AProc_335.t = new ArrayList<Travaux>();
		AProc_335.t.add(0,new Travaux(1,4,5));
		cours.add(AProc_335);
		Cours AACS_334 = new Cours();
		AACS_334.nom = "Algorithmique avancée pour le calcul scientifique";
		AACS_334.periode_magistrale = 15;
		AACS_334.t = new ArrayList<Travaux>();
		AACS_334.t.add(0,new Travaux(1,6,11));
		cours.add(AACS_334);
		Cours Crypto_336 = new Cours();
		Crypto_336.nom = "Introduction à la cryptologie";
		Crypto_336.periode_magistrale = 16;
		Crypto_336.t = new ArrayList<Travaux>();
		Crypto_336.t.add(0,new Travaux(1,4,5));
		cours.add(Crypto_336);
		Cours IIN_316 = new Cours();
		IIN_316.nom = "Introduction à l'imagerie numérique";
		IIN_316.periode_magistrale = 17;
		IIN_316.t = new ArrayList<Travaux>();
		IIN_316.t.add(0,new Travaux(1,22,23));
		IIN_316.t.add(1,new Travaux(2,16,21));
		IIN_316.t.add(2,new Travaux(3,18,19));
		cours.add(IIN_316);
		Cours Admin_350 = new Cours();
		Admin_350.nom = "Initiation à l'administration de systèmes";
		Admin_350.periode_magistrale = 18;
		Admin_350.t = new ArrayList<Travaux>();
		Admin_350.t.add(0,new Travaux(1,1,2));
		Admin_350.t.add(1,new Travaux(2,4,5));
		Admin_350.t.add(2,new Travaux(3,24,25));
		cours.add(Admin_350);
		Cours PACS_355 = new Cours();
		PACS_355.nom = "Programmation des Architectures Clients-Serveur";
		PACS_355.periode_magistrale = 19;
		PACS_355.t = new ArrayList<Travaux>();
		PACS_355.t.add(0,new Travaux(1,2,12));
		PACS_355.t.add(1,new Travaux(2,4,6));
		cours.add(PACS_355);
		Cours Posix_356 = new Cours();
		Posix_356.nom = "Programmation POSIX / Système";
		Posix_356.periode_magistrale = 15;
		Posix_356.t = new ArrayList<Travaux>();
		Posix_356.t.add(0,new Travaux(1,18,19));
		cours.add(Posix_356);
		Cours BDSitesWeb_345 = new Cours();
		BDSitesWeb_345.nom = "Bases de données et sites Web";
		BDSitesWeb_345.periode_magistrale = 21;
		BDSitesWeb_345.t = new ArrayList<Travaux>();
		BDSitesWeb_345.t.add(0,new Travaux(1,6,7));
		BDSitesWeb_345.t.add(1,new Travaux(2,7,11));
		BDSitesWeb_345.t.add(2,new Travaux(3,12,16));
		BDSitesWeb_345.t.add(3,new Travaux(4,18,19));
		cours.add(BDSitesWeb_345);
		Cours Stati_323 = new Cours();
		Stati_323.nom = "Statistique et informatique";
		Stati_323.periode_magistrale = 22;
		Stati_323.t = new ArrayList<Travaux>();
		Stati_323.t.add(0,new Travaux(1,23,24));
		cours.add(Stati_323);
		Cours TER_357 = new Cours();
		TER_357.nom = "Techniques événemetielles et réactives";
		TER_357.periode_magistrale = 23;
		TER_357.t = new ArrayList<Travaux>();
		TER_357.t.add(0,new Travaux(1,9,15));
		cours.add(TER_357);
		Cours InIA_351 = new Cours();
		InIA_351.nom = "Introduction à l'Intelligence Artificielle";
		InIA_351.periode_magistrale = 24;
		InIA_351.t = new ArrayList<Travaux>();
		InIA_351.t.add(0,new Travaux(1,1,11));
		InIA_351.t.add(1,new Travaux(2,21,22));
		InIA_351.t.add(2,new Travaux(3,13,14));
		cours.add(InIA_351);
		Cours BAMBI_369 = new Cours();
		BAMBI_369.nom = "Bases, Algorithmes, Méthodes en BioInformatique";
		BAMBI_369.periode_magistrale = 25;
		BAMBI_369.t = new ArrayList<Travaux>();
		BAMBI_369.t.add(0,new Travaux(1,22,23));
		cours.add(BAMBI_369);
		return cours;
	}

	public static Cours getAIHM() {
		Cours AIHM = new Cours();
		AIHM.nom = "Applications et interfaces homme-machine";
		AIHM.periode_magistrale = 11;
		AIHM.t = new ArrayList<Travaux>();
		AIHM.t.add(0,new Travaux(1,4,5));
		AIHM.t.add(1,new Travaux(2,16,17));
		AIHM.t.add(2,new Travaux(3,24,25));
		return AIHM;
	}

	public static Cours getOS() {
		Cours OS = new Cours();
		OS.nom = "Principes des sytèmes d'exploitation";
		OS.periode_magistrale = 6;
		OS.t = new ArrayList<Travaux>();
		OS.t.add(0,new Travaux(1,1,2));
		OS.t.add(1,new Travaux(2,7,8));
		OS.t.add(2,new Travaux(3,9,10));
		OS.t.add(3,new Travaux(4,12,13));
		//INUTILE POUR L'ALGO
		//OS.t.add(4,new Travaux(5,12,13));
		OS.t.add(4,new Travaux(5,21,22));
		return OS;
	}

	public static boolean validate(Selection[] s) {
		ArrayList<Integer> semaine = new ArrayList<Integer>();
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				if(i==j){
					continue;
				}else{
					//l'indice de l'ArrayList de Travaux doit correspondre avec (numéroGroupe - 1)
					if((s[i].c.periode_magistrale)==(s[j].c.t.get(s[j].g).TRAVAUX1)){
						return false;
					}
					if((s[i].c.periode_magistrale)==(s[j].c.t.get(s[j].g).TRAVAUX2)){
						return false;
					}
					if((s[i].c.t.get(s[i].g).TRAVAUX1)==(s[j].c.t.get(s[j].g).TRAVAUX1)){
						return false;
					}
					if((s[i].c.t.get(s[i].g).TRAVAUX1)==(s[j].c.t.get(s[j].g).TRAVAUX2)){
						return false;
					}
					if((s[i].c.t.get(s[i].g).TRAVAUX2)==(s[j].c.t.get(s[j].g).TRAVAUX1)){
						return false;
					}
					if((s[i].c.t.get(s[i].g).TRAVAUX2)==(s[j].c.t.get(s[j].g).TRAVAUX2)){
						return false;
					}
				}
			}
			int jour = ((s[i].c.periode_magistrale)-1)/5;
			if(!semaine.contains(jour))semaine.add(jour);

			int jourT1 = ((s[i].c.t.get(s[i].g).TRAVAUX1)-1)/5;
			if(!semaine.contains(jourT1))semaine.add(jourT1);

			int jourT2 = ((s[i].c.t.get(s[i].g).TRAVAUX2)-1)/5;
			if(!semaine.contains(jourT2))semaine.add(jourT2);
			
		}
		
		if(semaine.size()==4){
			return true;
		}
		return false;
	}

	public static boolean already(ArrayList<Horario> possi, Selection[] s) {
		for(int f = 0 ; f < possi.size();f++){
			Selection [] sf = possi.get(f).s;
			if(!(sf[0].g==s[0].g)){
				continue;
			}
			if(!(sf[1].g==s[1].g)){
				continue;
			}
			if(
					
					((sf[2].c.periode_magistrale != s[2].c.periode_magistrale) 
					&& (sf[2].c.periode_magistrale != s[3].c.periode_magistrale))
				
					||
					
					((sf[3].c.periode_magistrale != s[2].c.periode_magistrale) 
					&& (sf[3].c.periode_magistrale != s[3].c.periode_magistrale))
					
			)
			{
				continue;
			}
			
			if(sf[2].c.periode_magistrale==s[2].c.periode_magistrale){
				if(sf[2].g!=s[2].g || sf[3].g!=s[3].g){
					continue;
				}
			}else{
				if(sf[2].g!=s[3].g || sf[3].g!=s[2].g){
					continue;
				}
			}
			
			return true;
		}
		return false;
	}
}
