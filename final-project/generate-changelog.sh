#!/bin/bash

cd "$(dirname "$0")" || exit 1

START_REV="54a7e76082f8b5d31b2bdabb3dc9a58aa2d6d622"

git log --reverse --pretty=format:'%ad & %an%n\begin{itemize}[topsep=0pt,itemsep=0pt,parsep=0pt,partopsep=0pt,leftmargin=12pt]%n\item %B%n\end{itemize}%n\\ \hline%n' --date=short $START_REV^..HEAD | sed 's/\*/\\item/g' | sed 's/---------//g' | sed 's/\#/\\\#/g'
