# SMA-Documents-Sharing
Réalisation d'un Système Multi-Agents (SMA) pour le partage des documents en utilisant la plateforme JADE.

Les utilisateurs doivent d'abord s'inscrire au système afin de pouvoir envoyer/recevoir tout type de ressources documentaires. 
<img  src="ScreenShots/Home.PNG">

Chaque utilisateur représenté par un agent autonome peut partager des documents avec les autres utilisateurs qui ont le même centre d'intérêt que lui (IA ou SMA).
Comme exemple nous allons créer 4 agents : Fatma, Rym, Sarah et Lina. 

Fatma et Rym font partie de la communauté IA. 

Sarah et Lina font partie de la communauté SMA. 

Fatma envoie le document "machine_learning_with_python_tutorial.pdf" aux utilisateurs de la communauté IA (Rym). 
<img  src="ScreenShots/Boite d'envoi IA (Fatma) .PNG">

Rym reçoit le document. 
<img  src="ScreenShots/Boite réception IA (rym) .PNG">

Sarah envoie le document "Jade documentation.pdf" aux utilisateurs de la communauté SMA (Lina). 
<img  src="ScreenShots/Boite d'envoi SMA (Sarah).PNG">

Lina reçoit le document. 
<img  src="ScreenShots/Boite réception SMA (Lina).PNG">

Visualisation des messages échangés entre les différents agents via l'agent Sniffer de Jade. 
<img  src="ScreenShots/Massages échangés (Sniffer).PNG" width=700>
