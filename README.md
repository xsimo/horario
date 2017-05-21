**contexte**

En janvier 2010, je devais valider 4 cours à [Paris VIe][1] pour terminer mon diplome d'informaticien de l'Université de Montréal:

Aussi, devant faire face à mes obligations financières, je devais travailler à temps partiel pendant le semestre.
C'est pourquoi, le choix de cours est pour moi un enjeu majeur afin de me libérer stratégiquement pour l'emploi et ce un maximum de jours par semaine.

**Formulation**

La fonction "objectif" à minimiser est donc le nombre de jours par semaine ou l'étudiant suis des cours
Il s'agit donc de trouver le meilleur agencement de cours sujet aux contrantes suivantes:

1. Un des cours doit être [Principes des sytèmes d'exploitation][2]
2. Un des cours doit être [Applications et interfaces homme-machine][3]
3. Les 2 autres cours doivent être choisis et ce parmi[les cours offerts en licence 3](http://github.com/xsimo/horario/blob/master/licence.md "licence 3 jussieu")  (*Je croyais au départ envisageable de planifier [des unités d'enseignement de niveau master](http://github.com/xsimo/horario/blob/master/master.md "master 1 jussieu") comme ce fut le cas à l'automne 2009 mais je m'en suis tenu à celles de la licence pour différentes raisons administratives entre autres.*).
4. Les 2 cours à options sont en outre sensé plus ou moins équivaloir à 2 [cours à options de l'Université de Montréal](http://github.com/xsimo/horario/blob/master/bac.md "bac UdeM") et doivent me permettre d'élargir mes horizons en vue du 2e cycle.
5. Il faut aussi choisir un horaire pour ces cours dans [l'emploi du temps de la licence](PlanningL3S2.pdf "planning l3s2") en tant que tel.

**Résolution**

Je trouvais la tache fastidieuse à réaliser à la main alors je me suis fait aidé par mon ordinateur. Le résultat n'est pas immédiat mais le code source que j'ai écrit en Java m'a permis de générer les grilles horaires suivantes:

* [Toutes les grilles](http://github.com/xsimo/horario/blob/master/allChoices.html "Toutes les grilles") (les 1749 grilles satifaisant les contraintes)
* [Les grilles de 4 jours](http://github.com/xsimo/horario/blob/master/4DaysChoices.html "Les grilles de 4 jours") (les 517 grilles s'étalant sur 4 jours et satifaisant les contraintes)
* [Les grilles de 3 jours](http://github.com/xsimo/horario/blob/master/3DaysChoices.html "Les grilles de 3 jours") (les 19 grilles s'étalant sur seulement 3 jours et satifaisant les contraintes)

Ces grilles m'ont ensuite servi comme support à la révision de ma décision instinctive initiale.
Il s'agit en quelques sortes d'un problème de recherche opérationnelle intéressants à différents égards.
J'ai en définitive obtenu des bons [résultats](Resultats_Simon_Universite_Paris6.htm results)  globaux
et suis satisfait des cursus sélectionnés;

[1]: http://www.upmc.fr
[2]: http://www-licence.ufr-info-p6.jussieu.fr/lmd/licence/2009/ue-lmd/LI324-2010fev/
[3]: http://www-licence.ufr-info-p6.jussieu.fr/lmd/licence/2009/ue-lmd/LI344-2010fev/