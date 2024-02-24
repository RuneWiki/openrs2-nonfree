package app;

import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/da")
final class Class6 {

	@OriginalMember(owner = "jagexappletviewer!app/da", name = "a", descriptor = "(IB)V")
	static final void method26(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -82) {
			return;
		}
		@Pc(7) Hashtable local7 = appletviewer.aHashtable4;
		local7.clear();
		if (arg0 == 0) {
			local7.put("err_missing_config", "Missing com.jagex.config setting");
			local7.put("err_invalid_config", "Invalid com.jagex.config setting");
			local7.put("loading_config", "Loading configuration");
			local7.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
			local7.put("err_decode_config", "Error decoding configuration");
			local7.put("loaderbox_initial", "Loading...");
			local7.put("error", "Error");
			local7.put("quit", "Quit");
			local7.put("alreadyopen", "Please close your existing game before loading another one");
		} else if (arg0 == 1) {
			local7.put("err_missing_config", "Einstellung com.jagex.config fehlt");
			local7.put("err_invalid_config", "Einstellung com.jagex.config ist ungültig");
			local7.put("loading_config", "Lade Konfiguration");
			local7.put("err_load_config", "Beim Laden der Spielkonfiguration von der Website ist ein Fehler aufgetreten.\nBitte überprüfen Sie Ihre Firewall-Einstellungen.");
			local7.put("err_decode_config", "Fehler beim Entschlüsseln der Konfiguration");
			local7.put("loaderbox_initial", "Lade...");
			local7.put("error", "Fehler");
			local7.put("quit", "Beenden");
			local7.put("alreadyopen", "Bitte schließe dein bestehendes Spiel, bevor du ein weiteres öffnest");
		} else if (arg0 == 2) {
			local7.put("err_missing_config", "Paramètre com.jagex.config manquant");
			local7.put("err_invalid_config", "Paramètre com.jagex.config non valide");
			local7.put("loading_config", "Chargement de la configuration");
			local7.put("err_load_config", "Une erreur s'est produite lors du chargement de la configuration du jeu.\nSi un pare-feu est actif sur votre ordinateur, assurez-vous\nqu'il laisse ce programme accéder à internet.");
			local7.put("err_decode_config", "Erreur de décodage de configuration");
			local7.put("loaderbox_initial", "Chargement...");
			local7.put("error", "Erreur");
			local7.put("quit", "Quitter");
			local7.put("alreadyopen", "Veuillez fermer votre session de jeu actuelle avant d’en démarrer une nouvelle");
		} else if (arg0 == 3) {
			local7.put("err_missing_config", "Faltando configuração de com.jagex.config");
			local7.put("err_invalid_config", "Configuração inválida de com.jagex.config");
			local7.put("loading_config", "Carregando configuração");
			local7.put("err_load_config", "Houve um erro quando a configuração do jogo estava sendo carregada no site.\nSe você tiver firewall, verifique se o programa pode ter acesso à internet.");
			local7.put("err_decode_config", "Erro ao decodificar configuração");
			local7.put("loaderbox_initial", "Carregando...");
			local7.put("error", "Erro");
			local7.put("quit", "Fechar");
			local7.put("alreadyopen", "Feche a sua sessão de jogo atual antes de abrir uma nova");
		} else if (arg0 == 4) {
			local7.put("err_missing_config", "Missing com.jagex.config setting");
			local7.put("err_invalid_config", "Invalid com.jagex.config setting");
			local7.put("loading_config", "Loading config");
			local7.put("err_load_config", "Error loading config");
			local7.put("err_decode_config", "Error decoding config");
			local7.put("loaderbox_initial", "Loading...");
			local7.put("error", "Error");
			local7.put("quit", "Quit");
			local7.put("alreadyopen", "Please close your existing game before loading another one");
		} else if (arg0 == 5) {
			local7.put("err_missing_config", "Missing com.jagex.config setting");
			local7.put("err_invalid_config", "Invalid com.jagex.config setting");
			local7.put("loading_config", "Loading config");
			local7.put("err_load_config", "Error loading config");
			local7.put("err_decode_config", "Error decoding config");
			local7.put("loaderbox_initial", "Loading...");
			local7.put("error", "Error");
			local7.put("quit", "Quit");
			local7.put("alreadyopen", "Cierra tu partida actual antes de abrir otra");
		}
	}
}
