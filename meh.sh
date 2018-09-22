#!/bin/bash
list=("Copie de la calculatrice de David")
for i in {23..24}
do
	touch temp$i.txt
	git add -A
	a="Mon Sep "
	b=$i
	c=" 5:00 2018 +0530"
	export GIT_AUTHOR_DATE=$a$b$c
	export GIT_COMMITTER_DATE=$a$b$c
	git commit -am "`echo ${list[$RANDOM % ${#list[@]} ]}`"
	rm temp$i.txt
	export GIT_AUTHOR_DATE=$a$b$c
	export GIT_COMMITTER_DATE=$a$b$c
	export GIT_AUTHOR_NAME="Quentin Luppo"
	export GIT_AUTHOR_EMAIL="quentinluppo@orange.fr"
	export GIT_COMMITTER_NAME="$GIT_AUTHOR_NAME"
	export GIT_COMMITTER_EMAIL="$GIT_AUTHOR_EMAIL"
	git commit -m "Addes some patches"
	git commit -am "`echo ${list[$RANDOM % ${#list[@]} ]}`"
done
