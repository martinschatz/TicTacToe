# TicTacToe
Ein Tic-Tac-Toe Programm mit den Patterns: Observer, Factory, Singleton und Command

Zur Erstellung der Zeichen wird ein Factory-Pattern verwendet - dieses Factory ist zusätzlich im Singleton geschrieben, somit wird verhindert, dass es mehr als eine Factory geben kann. 

Die Tic-Tac-Toe Applikation hat zur Unterhaltung noch ein schönes Feature: Kommentatoren. Diese sind zurzeit nur in Englisch und Deutsch verfügbar, gelöst wurde dies mithilfe des Observer-Pattern, bei jeder Veränderung wird den zwei Kommmentatoren mitgeteilt, welches Zeichen gesetzt werden und abhängig vom Zeichen werden verschiedene Kommentare zum Spielzug abgegeben. 

Zu guter letzt wurde noch ein Command-Pattern verwendet, dies wurde zur Implementation eines redos eingeführt. Der Benutzer hat vor jedem Zug die Möglichkeit, den vorherigen Zug rückgängig zu machen. Dazu wird bei jedem rückgängig gemachtem Zug ein passendes Kommentar dazu abgegeben (siehe Observer). 
