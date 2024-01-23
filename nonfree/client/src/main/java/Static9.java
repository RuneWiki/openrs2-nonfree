import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "[Lclient!gd;")
	public static Class60[] aClass60Array2;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "[I")
	public static int[] anIntArray245 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[F")
	public static float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Lclient!qf;")
	public static Class146 aClass146_11 = null;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public static int anInt3022 = -1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method2417() {
		@Pc(7) int local7 = 0;
		@Pc(18) int[] local18 = new int[Static61.anInt1211];
		@Pc(20) int local20;
		for (local20 = 0; local20 < Static61.anInt1211; local20++) {
			@Pc(31) Class149 local31 = Static271.method4006(local20);
			if (local31.anInt4796 >= 0 || local31.anInt4768 >= 0) {
				local18[local7++] = local20;
			}
		}
		Static268.anIntArray536 = new int[local7];
		for (local20 = 0; local20 < local7; local20++) {
			Static268.anIntArray536[local20] = local18[local20];
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V")
	public static void method2418(@OriginalArg(1) boolean arg0) {
		Static85.aBoolean121 = arg0;
		Static67.aBoolean110 = !Static62.method1046();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method2419(@OriginalArg(0) Class138 arg0) {
		Static271.aClass138_74 = arg0;
		Static78.anInt1465 = Static271.aClass138_74.method3365(4);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method2421() {
		Static84.aString51 = "M";
		Static39.aString23 = "Verbindung abgebrochen.";
		Static145.aString100 = "Schriftsätze geladen.";
		Static142.aString97 = "gleiten:";
		Static89.aString58 = "Benutzeroberfläche geladen.";
		Static202.aString136 = "Konfig geladen.";
		Static172.aString5 = "Lade Titelbild - ";
		Static77.aString178 = "3D-Softwarebibliothek gestartet.";
		Static6.aString3 = "Suche nach Updates - ";
		Static279.aString174 = "welle:";
		Static94.aString64 = "Speicher wird zugewiesen.";
		Static234.aString154 = "Stufe: ";
		Static88.aString57 = ": ";
		Static169.aString109 = "Angreifen";
		Static132.aString96 = "Verbindung mit Update-Server...";
		Static177.aString82 = "Okay";
		Static131.aString94 = "Titelbild geladen.";
		Static105.aString77 = "RuneScape wird geladen - bitte warten...";
		Static68.aString42 = "scrollen:";
		Static165.aString106 = "Ladevorgang - bitte warte.";
		Static281.aString176 = "Lade...";
		Static288.aString182 = "blaugrün:";
		Static161.aString105 = " steht bereits auf deiner Ignorieren-Liste!";
		Static88.aString56 = "Lade Liste der Welten";
		Static52.aString31 = "Nehmen";
		Static97.aString65 = "Verbindung zum Update-Server hergestellt.";
		Static128.aString90 = "Hierhin drehen";
		Static69.aString44 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Static253.aString157 = "Versteckt";
		Static258.aString166 = "Lade Texturen - ";
		Static143.aString98 = "Wähl eine Option";
		Static292.aString187 = " weitere Optionen";
		Static144.aString99 = "T";
		Static189.aString125 = "Spielwelt erstellt.";
		Static253.aString156 = "Zugewiesener Speicher.";
		Static33.aString22 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
		Static84.aString52 = "Schließen";
		Static192.aString132 = "T";
		Static129.aString91 = "Wordpack geladen.";
		Static87.aString55 = "leuchten3:";
		Static131.aString93 = "rot:";
		Static130.aString92 = "Update-Liste geladen.";
		Static252.aString164 = "schütteln:";
		Static310.aString41 = "Texturen geladen.";
		Static167.aString107 = "Musik-Engine vorbereitet.";
		Static14.aString8 = "lila:";
		Static238.aString161 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Static249.aString163 = "Benutzen";
		Static132.aString95 = "welle2:";
		Static101.aString67 = "Bitte entferne ";
		Static152.aString102 = " loggt sich aus.";
		Static202.aString135 = "Lade Standardeinstellungen - ";
		Static81.aString49 = "Spieler kann nicht gefunden werden: ";
		Static175.aString112 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Static236.aString160 = "Lade Sprites - ";
		Static286.aString181 = "Fallen lassen";
		Static278.aString173 = " zuerst von deiner Freunde-Liste!";
		Static118.aString87 = "blinken1:";
		Static66.aString39 = " loggt sich ein.";
		Static212.aString138 = "Eingabeprozedur geladen.";
		Static5.aString2 = " zuerst von deiner Ignorieren-Liste!";
		Static235.aString158 = "Lade Benutzeroberfläche - ";
		Static300.aString191 = "Untersuchen";
		Static106.aString83 = " steht bereits auf deiner Freunde-Liste!";
		Static189.aString126 = "Ablegen";
		Static257.aString165 = "Lade Schriftsätze - ";
		Static188.aString124 = "Bitte warte...";
		Static171.aString110 = "Titelbild geöffnet.";
		Static269.aString16 = "Abbrechen";
		Static297.aString190 = "Fertigkeit: ";
		Static15.aString10 = "Kampfstufe: ";
		Static208.aString137 = "Lade Wordpack - ";
		Static269.aString15 = "Hierhin gehen";
		Static152.aString101 = "Starte 3D-Softwarebibliothek.";
		Static177.aString81 = "M";
		Static253.aString155 = "Mechscape wird geladen - bitte warten...";
		Static10.aString6 = "weiss:";
		Static286.aString180 = "Gegenstand für Mitglieder";
		Static190.aString131 = "Auswählen";
		Static309.aString194 = "Weiter";
		Static57.aString33 = "leuchten1:";
		Static285.aString179 = "Liste der Welten geladen";
		Static289.aString183 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Static175.aString111 = "Standardeinstellungen geladen";
		Static81.aString48 = "Lade Konfiguration - ";
		Static158.aString69 = "gelb:";
		Static77.aString177 = "leuchten2:";
		Static15.aString11 = "Sprites geladen.";
		Static274.aString171 = "grün:";
		Static4.aString1 = "Bitte entferne ";
		Static304.aString192 = "blinken2:";
		Static59.aString34 = "blinken3:";
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public static void method2422() {
		if (Static140.method2232() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static168.anInt5864 - 4 & 0xFF);
		@Pc(24) int local24 = Static168.anInt5864 % 104;
		@Pc(26) int local26;
		@Pc(31) int local31;
		for (local26 = 0; local26 < 4; local26++) {
			for (local31 = 0; local31 < 104; local31++) {
				Static172.aByteArrayArrayArray2[local26][local24][local31] = local20;
			}
		}
		if (Static295.anInt5586 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static101.anIntArray168[local26] = -1000000;
			Static214.anIntArray338[local26] = 1000000;
			Static137.anIntArray223[local26] = 0;
			Static242.anIntArray438[local26] = 1000000;
			Static142.anIntArray232[local26] = 0;
		}
		if (Static101.anInt1895 != 1) {
			local26 = Static104.method1648(Static295.anInt5586, Static243.anInt5653, Static105.anInt2016);
			if (local26 - Static141.anInt2760 < 800 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][Static243.anInt5653 >> 7][Static105.anInt2016 >> 7] & 0x4) != 0) {
				Static247.method3812(Static105.anInt2016 >> 7, Static243.anInt5653 >> 7, 1, Static122.aClass1_Sub17ArrayArrayArray3, false);
			}
			return;
		}
		if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7][Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7] & 0x4) != 0) {
			Static247.method3812(Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7, Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7, 0, Static122.aClass1_Sub17ArrayArrayArray3, false);
		}
		if (Static140.anInt2757 >= 310) {
			return;
		}
		local26 = Static243.anInt5653 >> 7;
		@Pc(140) int local140 = Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7;
		local31 = Static105.anInt2016 >> 7;
		@Pc(156) int local156;
		if (local140 <= local26) {
			local156 = local26 - local140;
		} else {
			local156 = local140 - local26;
		}
		@Pc(168) int local168 = Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7;
		@Pc(180) int local180;
		if (local168 > local31) {
			local180 = local168 - local31;
		} else {
			local180 = local31 - local168;
		}
		if (local156 == 0 && local180 == 0 || local156 <= -104 || local156 >= 104 || local180 <= -104 || local180 >= 104) {
			Static195.method3178("RC: " + local26 + "," + local31 + " " + local140 + "," + local168 + " " + Static290.anInt5497 + "," + Static118.anInt2409, null);
			return;
		}
		@Pc(255) int local255;
		@Pc(257) int local257;
		if (local180 >= local156) {
			local255 = local156 * 65536 / local180;
			local257 = 32768;
			while (local31 != local168) {
				if (local31 < local168) {
					local31++;
				} else if (local31 > local168) {
					local31--;
				}
				if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][local26][local31] & 0x4) != 0) {
					Static247.method3812(local31, local26, 1, Static122.aClass1_Sub17ArrayArrayArray3, false);
					break;
				}
				local257 += local255;
				if (local257 >= 65536) {
					local257 -= 65536;
					if (local26 < local140) {
						local26++;
					} else if (local26 > local140) {
						local26--;
					}
					if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][local26][local31] & 0x4) != 0) {
						Static247.method3812(local31, local26, 1, Static122.aClass1_Sub17ArrayArrayArray3, false);
						break;
					}
				}
			}
			return;
		}
		local255 = local180 * 65536 / local156;
		local257 = 32768;
		while (local26 != local140) {
			if (local140 > local26) {
				local26++;
			} else if (local140 < local26) {
				local26--;
			}
			if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][local26][local31] & 0x4) != 0) {
				Static247.method3812(local31, local26, 1, Static122.aClass1_Sub17ArrayArrayArray3, false);
				break;
			}
			local257 += local255;
			if (local257 >= 65536) {
				if (local31 < local168) {
					local31++;
				} else if (local168 < local31) {
					local31--;
				}
				local257 -= 65536;
				if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][local26][local31] & 0x4) != 0) {
					Static247.method3812(local31, local26, 1, Static122.aClass1_Sub17ArrayArrayArray3, false);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!ph;)[Lclient!wi;")
	public static Class103_Sub2[] method2423(@OriginalArg(1) int arg0, @OriginalArg(2) Class138 arg1) {
		return Static109.method1792(arg0, arg1) ? Static131.method2058() : null;
	}
}
