import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 4) {
				Static68.method1071("argument count");
			}
			Static216.anInt4214 = Integer.parseInt(arg0[0]);
			Static166.anInt3406 = 2;
			if (arg0[1].equals("live")) {
				Static298.anInt5544 = 0;
			} else if (arg0[1].equals("rc")) {
				Static298.anInt5544 = 1;
			} else if (arg0[1].equals("wip")) {
				Static298.anInt5544 = 2;
			} else {
				Static68.method1071("modewhat");
			}
			Static47.aBoolean52 = false;
			Static9.anInt124 = Static115.method1818(arg0[2]);
			if (Static9.anInt124 == -1) {
				if (arg0[2].equals("english")) {
					Static9.anInt124 = 0;
				} else if (arg0[2].equals("german")) {
					Static9.anInt124 = 1;
				} else {
					Static68.method1071("language");
				}
			}
			Static110.method1777(Static9.anInt124);
			Static75.aBoolean102 = false;
			Static170.aBoolean231 = false;
			if (arg0[3].equals("game0")) {
				Static76.anInt5724 = 0;
			} else if (arg0[3].equals("game1")) {
				Static76.anInt5724 = 1;
			} else {
				Static68.method1071("game");
			}
			Static227.aString268 = "";
			Static83.aBoolean118 = false;
			Static188.anInt6080 = 0;
			Static259.anInt4939 = 0;
			@Pc(131) client local131 = new client();
			Static292.aClient1 = local131;
			local131.method679(Static298.anInt5544 + 32, Static76.anInt5724 == 1 ? "mechscape" : "runescape");
			Static172.aFrame2.setLocation(40, 40);
		} catch (@Pc(156) Exception local156) {
			Static193.method3072(local156, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method683() {
		for (Static265.anInt5089 = 0; Static148.method2368() && Static265.anInt5089 < 128; Static265.anInt5089++) {
			Static212.anIntArray441[Static265.anInt5089] = Static54.anInt1042;
			Static203.anIntArray419[Static265.anInt5089] = Static265.aChar4;
		}
		Static211.anInt4156++;
		if (Static107.anInt5399 != -1) {
			Static66.method1060(Static107.anInt5399, Static31.anInt526, 0, 0, 0, 0, Static40.anInt690);
		}
		Static261.anInt4980++;
		if (Static94.aBoolean138) {
			label195: for (@Pc(56) int local56 = 0; local56 < 32768; local56++) {
				@Pc(65) Class53_Sub1_Sub2 local65 = Static110.aClass53_Sub1_Sub2Array1[local56];
				if (local65 != null) {
					@Pc(71) byte local71 = local65.aClass171_1.aByte21;
					if ((local71 & 0x2) > 0 && local65.anInt3965 == 0 && Math.random() * 1000.0D < 10.0D) {
						@Pc(98) int local98 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						@Pc(106) int local106 = (int) Math.round(Math.random() * 2.0D - 1.0D);
						if (local98 != 0 || local106 != 0) {
							local65.aByteArray51[0] = 1;
							local65.anIntArray422[0] = local98 + (local65.anInt3974 >> 7);
							local65.anIntArray426[0] = (local65.anInt4002 >> 7) + local106;
							Static296.aClass30Array1[Static281.anInt5335].method568(0, local65.anInt4002 >> 7, local65.method3324(), false, local65.anInt3974 >> 7, local65.method3324(), false);
							if (local65.anIntArray422[0] >= 0 && local65.anIntArray422[0] <= 104 - local65.method3324() && local65.anIntArray426[0] >= 0 && local65.anIntArray426[0] <= 104 - local65.method3324() && Static296.aClass30Array1[Static281.anInt5335].method575(local65.anIntArray426[0], local65.anInt4002 >> 7, local65.anIntArray422[0], local65.anInt3974 >> 7)) {
								if (local65.method3324() > 1) {
									for (@Pc(240) int local240 = local65.anIntArray422[0]; local240 < local65.anIntArray422[0] + local65.method3324(); local240++) {
										for (@Pc(256) int local256 = local65.anIntArray426[0]; local65.anIntArray426[0] + local65.method3324() > local256; local256++) {
											if ((Static296.aClass30Array1[Static281.anInt5335].anIntArrayArray6[local240][local256] & 0x2401FF) != 0) {
												continue label195;
											}
										}
									}
								}
								local65.anInt3965 = 1;
							}
						}
					}
					Static257.method4061(local65);
					Static272.method4284(local65);
					Static55.method939(local65);
					Static296.aClass30Array1[Static281.anInt5335].method567(false, false, local65.method3324(), local65.method3324(), local65.anInt4002 >> 7, local65.anInt3974 >> 7);
				}
			}
		}
		if (!Static94.aBoolean138 && Static76.anInt5724 == 0) {
			Static66.method1059();
		} else if (Static133.anInt2574 == 0 && Static250.anInt4760 == 0) {
			if (Static41.anInt772 == 2) {
				Static157.method2550();
			} else {
				Static84.method1496();
			}
			if (Static129.anInt2519 >> 7 < 14 || Static129.anInt2519 >> 7 >= 90 || Static302.anInt5682 >> 7 < 14 || Static302.anInt5682 >> 7 >= 90) {
				Static207.method3335();
			}
		}
		while (true) {
			@Pc(389) Class4_Sub13 local389;
			@Pc(395) Class189 local395;
			@Pc(406) Class189 local406;
			do {
				local389 = (Class4_Sub13) Static57.aClass114_6.method2621();
				if (local389 == null) {
					while (true) {
						do {
							local389 = (Class4_Sub13) Static83.aClass114_10.method2621();
							if (local389 == null) {
								while (true) {
									do {
										local389 = (Class4_Sub13) Static135.aClass114_14.method2621();
										if (local389 == null) {
											if (Static35.aClass189_1 != null) {
												Static65.method1047();
											}
											if (Static3.aClass185_1 != null && Static3.aClass185_1.anInt5623 == 1) {
												if (Static3.aClass185_1.anObject7 != null) {
													Static307.method4756(Static238.aString276, Static151.aBoolean206);
												}
												Static3.aClass185_1 = null;
												Static151.aBoolean206 = false;
												Static238.aString276 = null;
											}
											if (Static50.anInt954 % 1500 == 0) {
												Static149.method2394();
											}
											return;
										}
										local395 = local389.aClass189_7;
										if (local395.anInt5972 < 0) {
											break;
										}
										local406 = Static114.method1814(local395.anInt5941);
									} while (local406 == null || local406.aClass189Array4 == null || local406.aClass189Array4.length <= local395.anInt5972 || local406.aClass189Array4[local395.anInt5972] != local395);
									Static135.method2020(local389);
								}
							}
							local395 = local389.aClass189_7;
							if (local395.anInt5972 < 0) {
								break;
							}
							local406 = Static114.method1814(local395.anInt5941);
						} while (local406 == null || local406.aClass189Array4 == null || local395.anInt5972 >= local406.aClass189Array4.length || local406.aClass189Array4[local395.anInt5972] != local395);
						Static135.method2020(local389);
					}
				}
				local395 = local389.aClass189_7;
				if (local395.anInt5972 < 0) {
					break;
				}
				local406 = Static114.method1814(local395.anInt5941);
			} while (local406 == null || local406.aClass189Array4 == null || local395.anInt5972 >= local406.aClass189Array4.length || local406.aClass189Array4[local395.anInt5972] != local395);
			Static135.method2020(local389);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method684(@OriginalArg(1) int arg0) {
		Static288.aClass51_2.anInt1359 = arg0;
		Static110.aClass52_5 = null;
		Static288.aClass51_2.anInt1358++;
		Static259.anInt4953 = 0;
		Static187.aClass185_4 = null;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method686() {
		if (!Static205.aBoolean278) {
			label264: while (true) {
				do {
					if (!Static148.method2368()) {
						break label264;
					}
				} while (Static265.aChar4 != 's' && Static265.aChar4 != 'S');
				Static205.aBoolean278 = true;
			}
		}
		@Pc(41) int local41;
		if (Static222.anInt4286 == 0) {
			@Pc(32) Runtime local32 = Runtime.getRuntime();
			local41 = (int) ((local32.totalMemory() - local32.freeMemory()) / 1024L);
			@Pc(44) long local44 = Static101.method1677();
			if (Static86.aLong66 == 0L) {
				Static86.aLong66 = local44;
			}
			if (local41 > 16384 && local44 - Static86.aLong66 < 5000L) {
				if (local44 - Static98.aLong67 > 1000L) {
					System.gc();
					Static98.aLong67 = local44;
				}
				Static243.anInt4622 = 5;
				Static212.aString243 = Static140.aString160;
			} else {
				Static243.anInt4622 = 5;
				Static212.aString243 = Static228.aString269;
				Static222.anInt4286 = 10;
			}
			return;
		}
		@Pc(93) int local93;
		if (Static222.anInt4286 == 10) {
			for (local93 = 0; local93 < 4; local93++) {
				Static296.aClass30Array1[local93] = new Class30(104, 104);
			}
			Static222.anInt4286 = 30;
			Static212.aString243 = Static277.aString324;
			Static243.anInt4622 = 10;
		} else if (Static222.anInt4286 == 30) {
			if (Static39.aClass119_1 == null) {
				Static39.aClass119_1 = new Class119(Static288.aClass51_2, Static61.aClass93_1);
			}
			if (Static39.aClass119_1.method2720()) {
				Static99.aClass58_46 = Static201.method3244(true, false, 0, true);
				Static150.aClass58_66 = Static201.method3244(true, false, 1, true);
				Static70.aClass58_39 = Static201.method3244(false, true, 2, true);
				Static51.aClass58_27 = Static201.method3244(true, false, 3, true);
				Static258.aClass58_92 = Static201.method3244(true, false, 4, true);
				Static102.aClass58_47 = Static201.method3244(true, true, 5, true);
				Static278.aClass58_98 = Static201.method3244(true, true, 6, false);
				Static161.aClass58_69 = Static201.method3244(true, false, 7, true);
				Static7.aClass58_4 = Static201.method3244(true, false, 8, true);
				Static54.aClass58_29 = Static201.method3244(true, false, 9, true);
				Static233.aClass58_71 = Static201.method3244(true, false, 10, true);
				Static127.aClass58_57 = Static201.method3244(true, false, 11, true);
				Static165.aClass58_73 = Static201.method3244(true, false, 12, true);
				Static152.aClass58_67 = Static201.method3244(true, false, 13, true);
				Static210.aClass58_78 = Static201.method3244(true, false, 14, false);
				Static225.aClass58_83 = Static201.method3244(true, false, 15, true);
				Static174.aClass58_76 = Static201.method3244(true, false, 16, true);
				Static275.aClass58_96 = Static201.method3244(true, false, 17, true);
				Static249.aClass58_88 = Static201.method3244(true, false, 18, true);
				Static204.aClass58_79 = Static201.method3244(true, false, 19, true);
				Static2.aClass58_1 = Static201.method3244(true, false, 20, true);
				Static16.aClass58_24 = Static201.method3244(true, false, 21, true);
				Static28.aClass58_10 = Static201.method3244(true, false, 22, true);
				Static219.aClass58_82 = Static201.method3244(true, true, 23, true);
				Static248.aClass58_87 = Static201.method3244(true, false, 24, true);
				Static21.aClass58_30 = Static201.method3244(true, false, 25, true);
				Static153.aClass58_68 = Static201.method3244(true, true, 26, true);
				Static305.aClass58_102 = Static201.method3244(true, false, 27, true);
				Static206.aClass58_80 = Static201.method3244(true, true, 28, true);
				Static243.anInt4622 = 15;
				Static212.aString243 = Static13.aString23;
				Static222.anInt4286 = 40;
			} else {
				Static243.anInt4622 = 12;
				Static212.aString243 = Static312.aString371;
			}
		} else if (Static222.anInt4286 == 40) {
			local93 = 0;
			for (local41 = 0; local41 < 29; local41++) {
				local93 += Static239.aClass62_Sub1Array2[local41].method4701() * Static45.anIntArray60[local41] / 100;
			}
			if (local93 == 100) {
				Static212.aString243 = Static168.aString199;
				Static243.anInt4622 = 20;
				Static167.method2959(Static7.aClass58_4);
				Static245.method3167(Static7.aClass58_4);
				Static172.method2724(Static7.aClass58_4);
				Static222.anInt4286 = 41;
			} else {
				Static243.anInt4622 = 20;
				if (local93 != 0) {
					Static212.aString243 = Static240.aString282 + local93 + "%";
				}
			}
		} else if (Static222.anInt4286 == 41) {
			if (Static206.aClass58_80.method1360()) {
				this.method688(Static206.aClass58_80.method1343(1));
				Static222.anInt4286 = 45;
				Static212.aString243 = Static4.aString7;
				Static243.anInt4622 = 25;
			} else {
				Static212.aString243 = Static128.aString149 + Static206.aClass58_80.method1345() + "%";
				Static243.anInt4622 = 25;
			}
		} else if (Static222.anInt4286 == 45) {
			Static10.method175(Static273.aBoolean122);
			Static31.aClass4_Sub6_Sub2_2 = new Class4_Sub6_Sub2();
			Static31.aClass4_Sub6_Sub2_2.method2512();
			Static30.aClass103_1 = Static179.method2820(Static188.aCanvas115, 22050, Static276.aClass139_4, 0);
			Static30.aClass103_1.method3021(Static31.aClass4_Sub6_Sub2_2);
			Static301.method4588(Static31.aClass4_Sub6_Sub2_2, Static225.aClass58_83, Static210.aClass58_78, Static258.aClass58_92);
			Static249.aClass103_2 = Static179.method2820(Static188.aCanvas115, 2048, Static276.aClass139_4, 1);
			Static211.aClass4_Sub6_Sub3_2 = new Class4_Sub6_Sub3();
			Static249.aClass103_2.method3021(Static211.aClass4_Sub6_Sub3_2);
			Static297.aClass173_1 = new Class173(22050, Static288.anInt5395);
			Static285.anInt5612 = Static278.aClass58_98.method1362("scape main");
			Static212.aString243 = Static166.aString211;
			Static222.anInt4286 = 50;
			Static243.anInt4622 = 30;
		} else if (Static222.anInt4286 == 50) {
			local93 = Static29.method464(Static152.aClass58_67, Static7.aClass58_4);
			local41 = Static91.method1565();
			if (local93 >= local41) {
				Static212.aString243 = Static190.aString218;
				Static222.anInt4286 = 60;
				Static243.anInt4622 = 35;
			} else {
				Static243.anInt4622 = 35;
				Static212.aString243 = Static205.aString233 + local93 * 100 / local41 + "%";
			}
		} else if (Static222.anInt4286 == 60) {
			local93 = Static65.method1046(Static7.aClass58_4);
			local41 = Static28.method393();
			if (local41 <= local93) {
				Static222.anInt4286 = 65;
				Static243.anInt4622 = 40;
				Static212.aString243 = Static208.aString240;
			} else {
				Static243.anInt4622 = 40;
				Static212.aString243 = Static45.aString56 + local93 * 100 / local41 + "%";
			}
		} else if (Static222.anInt4286 == 65) {
			Static8.method113(Static7.aClass58_4, Static152.aClass58_67);
			Static212.aString243 = Static128.aString147;
			Static243.anInt4622 = 45;
			Static15.method233(5);
			Static222.anInt4286 = 70;
		} else if (Static222.anInt4286 == 70) {
			Static70.aClass58_39.method1360();
			local93 = Static70.aClass58_39.method1345();
			Static174.aClass58_76.method1360();
			local93 += Static174.aClass58_76.method1345();
			Static275.aClass58_96.method1360();
			local93 += Static275.aClass58_96.method1345();
			Static249.aClass58_88.method1360();
			local93 += Static249.aClass58_88.method1345();
			Static204.aClass58_79.method1360();
			local93 += Static204.aClass58_79.method1345();
			Static2.aClass58_1.method1360();
			local93 += Static2.aClass58_1.method1345();
			Static16.aClass58_24.method1360();
			local93 += Static16.aClass58_24.method1345();
			Static28.aClass58_10.method1360();
			local93 += Static28.aClass58_10.method1345();
			Static248.aClass58_87.method1360();
			local93 += Static248.aClass58_87.method1345();
			Static21.aClass58_30.method1360();
			local93 += Static21.aClass58_30.method1345();
			Static305.aClass58_102.method1360();
			local93 += Static305.aClass58_102.method1345();
			if (local93 < 1100) {
				Static243.anInt4622 = 50;
				Static212.aString243 = Static20.aString30 + local93 / 11 + "%";
			} else {
				Static15.method231(Static70.aClass58_39);
				Static200.method3241(Static70.aClass58_39);
				Static294.method3851(Static70.aClass58_39);
				Static300.method4560(Static161.aClass58_69, Static70.aClass58_39);
				Static271.method4269(Static174.aClass58_76, Static161.aClass58_69);
				Static261.method4117(Static161.aClass58_69, Static249.aClass58_88);
				Static72.method1171(Static204.aClass58_79, Static51.aClass4_Sub3_Sub5_Sub2_2, Static161.aClass58_69);
				Static118.method1851(Static70.aClass58_39);
				Static312.method4822(Static2.aClass58_1, Static150.aClass58_66, Static99.aClass58_46);
				Static248.method3921(Static70.aClass58_39);
				Static148.method2369(Static16.aClass58_24, Static161.aClass58_69);
				Static268.method4235(Static28.aClass58_10);
				Static18.method262(Static70.aClass58_39);
				Static312.method4824(Static7.aClass58_4, Static152.aClass58_67, Static51.aClass58_27, Static161.aClass58_69);
				Static133.method2012(Static70.aClass58_39);
				Static128.method1965(Static275.aClass58_96);
				Static86.method1521(Static21.aClass58_30, new Class130(), Static248.aClass58_87);
				Static82.method1473(Static248.aClass58_87, Static21.aClass58_30);
				Static89.method1560(Static70.aClass58_39);
				Static161.method2612(Static70.aClass58_39);
				Static25.method346(Static70.aClass58_39);
				Static32.method514(Static70.aClass58_39, Static7.aClass58_4);
				Static3.method5(Static7.aClass58_4, Static70.aClass58_39);
				Static214.method3487(Static70.aClass58_39, Static7.aClass58_4);
				Static243.anInt4622 = 50;
				Static212.aString243 = Static159.aString375;
				Static78.method1338();
				Static222.anInt4286 = 80;
			}
		} else if (Static222.anInt4286 == 80) {
			local93 = Static35.method558(Static7.aClass58_4);
			local41 = Static70.method1084();
			if (local93 >= local41) {
				Static280.method667(Static7.aClass58_4);
				Static212.aString243 = Static234.aString272;
				Static243.anInt4622 = 60;
				Static222.anInt4286 = 90;
			} else {
				Static212.aString243 = Static315.aString376 + local93 * 100 / local41 + "%";
				Static243.anInt4622 = 60;
			}
		} else if (Static222.anInt4286 == 90) {
			if (Static153.aClass58_68.method1360()) {
				@Pc(960) Class24_Sub1 local960 = new Class24_Sub1(Static54.aClass58_29, Static153.aClass58_68, Static7.aClass58_4, 20, !Static233.aBoolean227);
				Static158.method2564(local960);
				if (Static10.anInt185 == 1) {
					Static158.method2552(0.9F);
				}
				if (Static10.anInt185 == 2) {
					Static158.method2552(0.8F);
				}
				if (Static10.anInt185 == 3) {
					Static158.method2552(0.7F);
				}
				if (Static10.anInt185 == 4) {
					Static158.method2552(0.6F);
				}
				Static243.anInt4622 = 70;
				Static212.aString243 = Static224.aString263;
				Static222.anInt4286 = 100;
			} else {
				Static212.aString243 = Static251.aString297 + Static153.aClass58_68.method1345() + "%";
				Static243.anInt4622 = 70;
			}
		} else if (Static222.anInt4286 == 100) {
			if (Static28.method398(Static7.aClass58_4)) {
				Static222.anInt4286 = 110;
			}
		} else if (Static222.anInt4286 == 110) {
			Static170.aClass100_1 = new Class100();
			Static276.aClass139_4.method3494(10, Static170.aClass100_1);
			Static243.anInt4622 = 75;
			Static212.aString243 = Static169.aString200;
			Static222.anInt4286 = 120;
		} else if (Static222.anInt4286 == 120) {
			if (Static233.aClass58_71.method1340("huffman", "")) {
				@Pc(1066) Class131 local1066 = new Class131(Static233.aClass58_71.method1358("", "huffman"));
				Static130.method1979(local1066);
				Static212.aString243 = Static105.aString121;
				Static243.anInt4622 = 80;
				Static222.anInt4286 = 130;
			} else {
				Static212.aString243 = Static70.aString82 + "0%";
				Static243.anInt4622 = 80;
			}
		} else if (Static222.anInt4286 == 130) {
			if (!Static51.aClass58_27.method1360()) {
				Static212.aString243 = Static291.aString336 + Static51.aClass58_27.method1345() * 3 / 4 + "%";
				Static243.anInt4622 = 85;
			} else if (!Static165.aClass58_73.method1360()) {
				Static212.aString243 = Static291.aString336 + (Static165.aClass58_73.method1345() / 10 + 75) + "%";
				Static243.anInt4622 = 85;
			} else if (!Static152.aClass58_67.method1360()) {
				Static212.aString243 = Static291.aString336 + (Static152.aClass58_67.method1345() / 20 + 85) + "%";
				Static243.anInt4622 = 85;
			} else if (Static219.aClass58_82.method1365("details")) {
				Static121.method2400(Static219.aClass58_82);
				Static184.method2963(Static305.aClass58_102);
				Static64.method1028(Static161.aClass58_69);
				Static222.anInt4286 = 135;
				Static243.anInt4622 = 95;
				Static212.aString243 = Static130.aString150;
			} else {
				Static212.aString243 = Static291.aString336 + (Static219.aClass58_82.method1342("details") / 10 + 90) + "%";
				Static243.anInt4622 = 85;
			}
		} else if (Static222.anInt4286 == 135) {
			local93 = Static145.method2292();
			if (local93 == -1) {
				Static212.aString243 = Static174.aString206;
				Static243.anInt4622 = 95;
			} else if (local93 == 7 || local93 == 9) {
				this.method670("worldlistfull");
				Static15.method233(1000);
			} else if (Static258.aBoolean339) {
				Static243.anInt4622 = 96;
				Static222.anInt4286 = 140;
				Static212.aString243 = Static66.aString80;
			} else {
				this.method670("worldlistio_" + local93);
				Static15.method233(1000);
			}
		} else if (Static222.anInt4286 == 140) {
			Static280.anInt742 = Static51.aClass58_27.method1362("loginscreen");
			Static102.aClass58_47.method1356(false);
			Static278.aClass58_98.method1356(true);
			Static7.aClass58_4.method1356(true);
			Static152.aClass58_67.method1356(true);
			Static233.aClass58_71.method1356(true);
			Static51.aClass58_27.method1356(true);
			Static314.aBoolean423 = true;
			Static222.anInt4286 = 150;
			Static212.aString243 = Static70.aString83;
			Static243.anInt4622 = 97;
		} else if (Static222.anInt4286 == 150) {
			Static119.method1860();
			if (Static205.aBoolean278) {
				Static192.anInt3637 = 0;
				Static21.anInt1051 = 0;
				Static55.anInt1125 = 0;
				Static222.anInt4292 = 0;
			}
			Static205.aBoolean278 = true;
			Static66.method1055(Static276.aClass139_4);
			Static285.method4549(false, Static192.anInt3637, -1, -1);
			Static243.anInt4622 = 100;
			Static212.aString243 = Static88.aString112;
			Static222.anInt4286 = 160;
		} else if (Static222.anInt4286 == 160) {
			Static39.method605(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method672() {
		if (Static94.aBoolean138) {
			Static94.method1605();
		}
		if (Static122.aFrame1 != null) {
			Static237.method3695(Static276.aClass139_4, Static122.aFrame1);
			Static122.aFrame1 = null;
		}
		if (Static170.aClass100_1 != null) {
			Static170.aClass100_1.aBoolean185 = false;
		}
		Static170.aClass100_1 = null;
		if (Static134.aClass52_7 != null) {
			Static134.aClass52_7.method1103();
			Static134.aClass52_7 = null;
		}
		Static38.method588(Static188.aCanvas115);
		Static54.method891(Static188.aCanvas115);
		if (Static253.aClass19_1 != null) {
			Static253.aClass19_1.method894(Static188.aCanvas115);
		}
		Static38.method589();
		Static314.method4831();
		Static253.aClass19_1 = null;
		if (Static30.aClass103_1 != null) {
			Static30.aClass103_1.method3014();
		}
		if (Static249.aClass103_2 != null) {
			Static249.aClass103_2.method3014();
		}
		Static288.aClass51_2.method1090();
		Static61.aClass93_1.method1972();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method681() {
		Static127.method1950();
		Static61.aClass93_1 = new Class93();
		Static288.aClass51_2 = new Class51();
		if (Static298.anInt5544 != 0) {
			Static227.aByteArrayArray35 = new byte[50][];
		}
		Static266.method4186(Static276.aClass139_4);
		if (Static166.anInt3406 == 0) {
			Static251.aString298 = this.getCodeBase().getHost();
			Static117.anInt2337 = 43594;
			Static297.anInt5499 = 443;
		} else if (Static166.anInt3406 == 1) {
			Static251.aString298 = this.getCodeBase().getHost();
			Static297.anInt5499 = Static216.anInt4214 + 50000;
			Static117.anInt2337 = Static216.anInt4214 + 40000;
		} else if (Static166.anInt3406 == 2) {
			Static297.anInt5499 = Static216.anInt4214 + 50000;
			Static117.anInt2337 = Static216.anInt4214 + 40000;
			Static251.aString298 = "127.0.0.1";
		}
		Static309.aShortArray124 = Static204.aShortArray74 = Static289.aShortArray111 = Static159.aShortArray126 = new short[256];
		if (Static215.anInt4212 == 3 && Static166.anInt3406 != 2) {
			Static254.anInt4847 = Static216.anInt4214;
		}
		if (Static76.anInt5724 == 1) {
			Static27.aShortArrayArray1 = Static207.aShortArrayArray5;
			Static293.aShortArray113 = Static128.aShortArray35;
			Static160.aShortArray46 = Static108.aShortArray32;
			Static178.anInt3364 = 16777215;
			Static178.anInt3365 = 0;
			Static60.aBoolean68 = true;
			Static258.aShortArrayArray6 = Static182.aShortArrayArray2;
		} else {
			Static258.aShortArrayArray6 = Static268.aShortArrayArray7;
			Static293.aShortArray113 = Static297.aShortArray115;
			Static27.aShortArrayArray1 = Static284.aShortArrayArray8;
			Static160.aShortArray46 = Static5.aShortArray11;
		}
		Static109.anInt2194 = Static117.anInt2337;
		Static220.anInt4045 = Static297.anInt5499;
		Static251.aString299 = Static251.aString298;
		Static177.anInt3358 = Static117.anInt2337;
		Static256.anInt4867 = Static177.anInt3358;
		Static80.method1402();
		Static125.method1927(Static188.aCanvas115);
		Static54.method883(Static188.aCanvas115);
		Static253.aClass19_1 = Static25.method345();
		if (Static253.aClass19_1 != null) {
			Static253.aClass19_1.method900(Static188.aCanvas115);
		}
		Static197.anInt3815 = Static215.anInt4212;
		try {
			if (Static276.aClass139_4.aClass105_2 != null) {
				Static113.aClass193_4 = new Class193(Static276.aClass139_4.aClass105_2, 5200, 0);
				for (@Pc(174) int local174 = 0; local174 < 29; local174++) {
					Static152.aClass193Array1[local174] = new Class193(Static276.aClass139_4.aClass105Array1[local174], 6000, 0);
				}
				Static133.aClass193_5 = new Class193(Static276.aClass139_4.aClass105_1, 6000, 0);
				Static40.aClass60_2 = new Class60(255, Static113.aClass193_4, Static133.aClass193_5, 500000);
				Static12.aClass193_1 = new Class193(Static276.aClass139_4.aClass105_3, 24, 0);
				Static276.aClass139_4.aClass105_1 = null;
				Static276.aClass139_4.aClass105Array1 = null;
				Static276.aClass139_4.aClass105_2 = null;
				Static276.aClass139_4.aClass105_3 = null;
			}
		} catch (@Pc(230) IOException local230) {
			Static12.aClass193_1 = null;
			Static133.aClass193_5 = null;
			Static40.aClass60_2 = null;
			Static113.aClass193_4 = null;
		}
		if (Static166.anInt3406 != 0) {
			Static132.aBoolean176 = true;
		}
		if (Static76.anInt5724 == 0) {
			Static221.aString262 = Static179.aString210;
		} else if (Static76.anInt5724 == 1) {
			Static221.aString262 = Static233.aString193;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method688(@OriginalArg(0) byte[] arg0) {
		@Pc(11) Class4_Sub10 local11 = new Class4_Sub10(arg0);
		while (true) {
			@Pc(15) int local15 = local11.method4666();
			if (local15 == 0) {
				return;
			}
			if (local15 == 1) {
				@Pc(31) int[] local31 = Static88.anIntArray163 = new int[6];
				local31[0] = local11.method4653();
				local31[1] = local11.method4653();
				local31[2] = local11.method4653();
				local31[3] = local11.method4653();
				local31[4] = local11.method4653();
				local31[5] = local11.method4653();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method689() {
		@Pc(3) boolean local3 = Static288.aClass51_2.method1097();
		if (!local3) {
			this.method690();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method690() {
		if (Static288.aClass51_2.anInt1358 > Static177.anInt3357) {
			Static76.anInt5725 = (Static288.aClass51_2.anInt1358 * 50 - 50) * 5;
			if (Static76.anInt5725 > 3000) {
				Static76.anInt5725 = 3000;
			}
			if (Static256.anInt4867 == Static109.anInt2194) {
				Static256.anInt4867 = Static220.anInt4045;
			} else {
				Static256.anInt4867 = Static109.anInt2194;
			}
			if (Static288.aClass51_2.anInt1358 >= 2 && Static288.aClass51_2.anInt1359 == 6) {
				this.method670("js5connect_outofdate");
				Static169.anInt3304 = 1000;
				return;
			}
			if (Static288.aClass51_2.anInt1358 >= 4 && Static288.aClass51_2.anInt1359 == -1) {
				this.method670("js5crc");
				Static169.anInt3304 = 1000;
				return;
			}
			if (Static288.aClass51_2.anInt1358 >= 4 && (Static169.anInt3304 == 0 || Static169.anInt3304 == 5)) {
				if (Static288.aClass51_2.anInt1359 == 7 || Static288.aClass51_2.anInt1359 == 9) {
					this.method670("js5connect_full");
				} else if (Static288.aClass51_2.anInt1359 <= 0) {
					this.method670("js5io");
				} else {
					this.method670("js5connect");
				}
				Static169.anInt3304 = 1000;
				return;
			}
		}
		Static177.anInt3357 = Static288.aClass51_2.anInt1358;
		if (Static76.anInt5725 > 0) {
			Static76.anInt5725--;
			return;
		}
		try {
			if (Static259.anInt4953 == 0) {
				Static187.aClass185_4 = Static276.aClass139_4.method3505(Static251.aString299, Static256.anInt4867);
				Static259.anInt4953++;
			}
			if (Static259.anInt4953 == 1) {
				if (Static187.aClass185_4.anInt5623 == 2) {
					this.method684(1000);
					return;
				}
				if (Static187.aClass185_4.anInt5623 == 1) {
					Static259.anInt4953++;
				}
			}
			if (Static259.anInt4953 == 2) {
				Static110.aClass52_5 = new Class52((Socket) Static187.aClass185_4.anObject7, Static276.aClass139_4);
				@Pc(198) Class4_Sub10 local198 = new Class4_Sub10(5);
				local198.method4618(15);
				local198.method4654(550);
				Static110.aClass52_5.method1107(local198.aByteArray71, 5);
				Static259.anInt4953++;
				Static35.aLong29 = Static101.method1677();
			}
			if (Static259.anInt4953 == 3) {
				if (Static169.anInt3304 == 0 || Static169.anInt3304 == 5 || Static110.aClass52_5.method1101() > 0) {
					@Pc(259) int local259 = Static110.aClass52_5.method1105();
					if (local259 != 0) {
						this.method684(local259);
						return;
					}
					Static259.anInt4953++;
				} else if (Static101.method1677() - Static35.aLong29 > 30000L) {
					this.method684(1001);
					return;
				}
			}
			if (Static259.anInt4953 == 4) {
				@Pc(288) boolean local288 = Static169.anInt3304 == 5 || Static169.anInt3304 == 10 || Static169.anInt3304 == 28;
				Static288.aClass51_2.method1087(Static110.aClass52_5, !local288);
				Static187.aClass185_4 = null;
				Static259.anInt4953 = 0;
				Static110.aClass52_5 = null;
			}
		} catch (@Pc(305) IOException local305) {
			this.method684(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method673() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method671()) {
			return;
		}
		Static216.anInt4214 = Integer.parseInt(this.getParameter("worldid"));
		Static166.anInt3406 = Integer.parseInt(this.getParameter("modewhere"));
		if (Static166.anInt3406 < 0 || Static166.anInt3406 > 1) {
			Static166.anInt3406 = 0;
		}
		Static298.anInt5544 = Integer.parseInt(this.getParameter("modewhat"));
		if (Static298.anInt5544 < 0 || Static298.anInt5544 > 2) {
			Static298.anInt5544 = 0;
		}
		@Pc(48) String local48 = this.getParameter("advertsuppressed");
		if (local48 != null && local48.equals("1")) {
			Static47.aBoolean52 = true;
		} else {
			Static47.aBoolean52 = false;
		}
		try {
			Static9.anInt124 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(67) Exception local67) {
			Static9.anInt124 = 0;
		}
		Static110.method1777(Static9.anInt124);
		@Pc(76) String local76 = this.getParameter("objecttag");
		if (local76 != null && local76.equals("1")) {
			Static170.aBoolean231 = true;
		} else {
			Static170.aBoolean231 = false;
		}
		@Pc(92) String local92 = this.getParameter("js");
		if (local92 != null && local92.equals("1")) {
			Static75.aBoolean102 = true;
		} else {
			Static75.aBoolean102 = false;
		}
		@Pc(108) String local108 = this.getParameter("game");
		if (local108 != null && local108.equals("1")) {
			Static76.anInt5724 = 1;
		} else {
			Static76.anInt5724 = 0;
		}
		try {
			Static259.anInt4939 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(128) Exception local128) {
			Static259.anInt4939 = 0;
		}
		Static227.aString268 = this.getParameter("settings");
		if (Static227.aString268 == null) {
			Static227.aString268 = "";
		}
		@Pc(143) String local143 = this.getParameter("country");
		if (local143 != null) {
			try {
				Static188.anInt6080 = Integer.parseInt(local143);
			} catch (@Pc(152) Exception local152) {
				Static188.anInt6080 = 0;
			}
		}
		@Pc(158) String local158 = this.getParameter("haveie6");
		if (local158 != null && local158.equals("1")) {
			Static83.aBoolean118 = true;
		} else {
			Static83.aBoolean118 = false;
		}
		Static292.aClient1 = this;
		this.method677(Static298.anInt5544 + 32);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method678() {
		if (Static169.anInt3304 == 1000) {
			return;
		}
		@Pc(26) long local26 = Static45.method727() / 1000000L - Static28.aLong24;
		Static28.aLong24 = Static45.method727() / 1000000L;
		@Pc(34) boolean local34 = Static40.method639();
		if (local34 && Static153.aBoolean210 && Static30.aClass103_1 != null) {
			Static30.aClass103_1.method3022();
		}
		if ((Static169.anInt3304 == 30 || Static169.anInt3304 == 10) && (Static20.aBoolean18 || Static18.aLong15 != 0L && Static18.aLong15 < Static101.method1677())) {
			Static285.method4549(Static20.aBoolean18, Static35.method557(), Static179.anInt3403, Static137.anInt2627);
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (Static122.aFrame1 == null) {
			@Pc(79) Container local79;
			if (Static122.aFrame1 != null) {
				local79 = Static122.aFrame1;
			} else if (Static172.aFrame2 == null) {
				local79 = Static276.aClass139_4.anApplet1;
			} else {
				local79 = Static172.aFrame2;
			}
			local95 = local79.getSize().width;
			local99 = local79.getSize().height;
			if (Static172.aFrame2 == local79) {
				@Pc(106) Insets local106 = Static172.aFrame2.getInsets();
				local95 -= local106.left + local106.right;
				local99 -= local106.bottom + local106.top;
			}
			if (Static73.anInt1635 != local95 || Static228.anInt4381 != local99) {
				if (Static215.aString254.startsWith("mac")) {
					Static73.anInt1635 = local95;
					Static228.anInt4381 = local99;
				} else {
					Static127.method1950();
				}
				Static18.aLong15 = Static101.method1677() + 500L;
			}
		}
		if (Static122.aFrame1 != null && !Static115.aBoolean158 && (Static169.anInt3304 == 30 || Static169.anInt3304 == 10)) {
			Static285.method4549(false, Static192.anInt3637, -1, -1);
		}
		@Pc(173) boolean local173 = false;
		if (Static239.aBoolean315) {
			local173 = true;
			Static239.aBoolean315 = false;
		}
		if (local173) {
			Static211.method3443();
		}
		if (Static94.aBoolean138) {
			for (local95 = 0; local95 < 100; local95++) {
				Static85.aBooleanArray8[local95] = true;
			}
		}
		if (Static169.anInt3304 == 0) {
			Static13.method202(null, local173, Static243.anInt4622, Static212.aString243);
		} else if (Static169.anInt3304 == 5) {
			Static207.method3344(false, Static211.aClass4_Sub3_Sub5_3);
		} else if (Static169.anInt3304 == 10) {
			Static105.method1715();
		} else if (Static169.anInt3304 == 25 || Static169.anInt3304 == 28) {
			if (Static244.anInt4660 == 1) {
				if (Static103.anInt2886 > Static230.anInt4399) {
					Static230.anInt4399 = Static103.anInt2886;
				}
				local95 = (Static230.anInt4399 - Static103.anInt2886) * 50 / Static230.anInt4399;
				Static306.method4753(Static156.aString187 + "<br>(" + local95 + "%)", false);
			} else if (Static244.anInt4660 == 2) {
				if (Static295.anInt5487 > Static293.anInt5474) {
					Static293.anInt5474 = Static295.anInt5487;
				}
				local95 = (Static293.anInt5474 - Static295.anInt5487) * 50 / Static293.anInt5474 + 50;
				Static306.method4753(Static156.aString187 + "<br>(" + local95 + "%)", false);
			} else {
				Static306.method4753(Static156.aString187, false);
			}
		} else if (Static169.anInt3304 == 30) {
			Static279.method4341(local26);
		} else if (Static169.anInt3304 == 40) {
			Static306.method4753(Static177.aString207 + "<br>" + Static36.aString46, false);
		}
		if (Static94.aBoolean138 && Static169.anInt3304 != 0) {
			Static94.method1622();
			for (local95 = 0; local95 < Static6.anInt113; local95++) {
				Static259.aBooleanArray24[local95] = false;
			}
		} else {
			@Pc(364) Graphics local364;
			if ((Static169.anInt3304 == 30 || Static169.anInt3304 == 10) && Static18.anInt268 == 0 && !local173) {
				try {
					local364 = Static188.aCanvas115.getGraphics();
					for (local99 = 0; local99 < Static6.anInt113; local99++) {
						if (Static259.aBooleanArray24[local99]) {
							Static152.aClass59_1.method4277(Static181.anIntArray383[local99], Static299.anIntArray638[local99], Static289.anIntArray616[local99], local364, Static261.anIntArray540[local99]);
							Static259.aBooleanArray24[local99] = false;
						}
					}
				} catch (@Pc(429) Exception local429) {
					Static188.aCanvas115.repaint();
				}
			} else if (Static169.anInt3304 != 0) {
				try {
					local364 = Static188.aCanvas115.getGraphics();
					Static152.aClass59_1.method4275(local364);
					for (local99 = 0; local99 < Static6.anInt113; local99++) {
						Static259.aBooleanArray24[local99] = false;
					}
				} catch (@Pc(384) Exception local384) {
					Static188.aCanvas115.repaint();
				}
			}
		}
		if (Static314.aBoolean423) {
			Static246.method3835();
		}
		if (Static205.aBoolean278 && Static169.anInt3304 == 10 && Static107.anInt5399 != -1) {
			Static205.aBoolean278 = false;
			Static66.method1055(Static276.aClass139_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method663() {
		if (Static169.anInt3304 == 1000) {
			return;
		}
		Static50.anInt954++;
		if (Static50.anInt954 % 1000 == 1) {
			@Pc(25) GregorianCalendar local25 = new GregorianCalendar();
			Static85.anInt1976 = local25.get(11) * 600 + local25.get(12) * 10 + local25.get(13) / 6;
			Static216.aRandom1.setSeed((long) Static85.anInt1976);
		}
		this.method689();
		if (Static39.aClass119_1 != null) {
			Static39.aClass119_1.method2719();
		}
		Static224.method3588();
		Static16.method763();
		Static223.method3584();
		Static38.method587();
		if (Static94.aBoolean138) {
			Static173.method2732();
		}
		if (Static253.aClass19_1 != null) {
			@Pc(73) int local73 = Static253.aClass19_1.method899();
			Static103.anInt2885 = local73;
		}
		if (Static169.anInt3304 == 0) {
			this.method686();
			Static107.method4408();
		} else if (Static169.anInt3304 == 5) {
			this.method686();
			Static107.method4408();
		} else if (Static169.anInt3304 == 25 || Static169.anInt3304 == 28) {
			Static269.method3013();
		}
		if (Static169.anInt3304 == 10) {
			this.method683();
			Static289.method4419();
			Static71.method1100();
			Static227.method3637();
		} else if (Static169.anInt3304 == 30) {
			Static214.method3489();
		} else if (Static169.anInt3304 == 40) {
			Static227.method3637();
			if (Static75.anInt1641 != -3) {
				if (Static75.anInt1641 == 15) {
					Static181.method2943();
				} else if (Static75.anInt1641 != 2) {
					Static115.method1819();
				}
			}
		}
	}
}
