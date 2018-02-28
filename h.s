#!/bin/bash
list=("Amelioration du code", "Edit README", "Optimisation de l algorithme en nlog n", "Mise en place de decimation", "Passage sur version stable", "Amelioration de performances", "Mise a jours de la base de donnees", "Update Meh", "Meh", "Ajout de commentaires oublies" , "Factorisation du code !")
for i in {1..29}
do
	touch temp$i.txt
	git add -A
	a="Mon Mar "
	b=$i
	c=" 5:00 2018 +0530"
	export GIT_AUTHOR_DATE=$a$b$c
	export GIT_COMMITTER_DATE=$a$b$c
	git commit -am "`echo ${list[$RANDOM % ${#list[@]} ]}`"
	rm temp$i.txt
	export GIT_AUTHOR_DATE=$a$b$c
	export GIT_COMMITTER_DATE=$a$b$c
	export GIT_AUTHOR_NAME="David MOLINARI"
	export GIT_AUTHOR_EMAIL="contact@davidmolinari.fr"
	export GIT_COMMITTER_NAME="$GIT_AUTHOR_NAME"
	export GIT_COMMITTER_EMAIL="$GIT_AUTHOR_EMAIL"
	git commit -m "Addes some patches"
	git commit -am "`echo ${list[$RANDOM % ${#list[@]} ]}`"
done
