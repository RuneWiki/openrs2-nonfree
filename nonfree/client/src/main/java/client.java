import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
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
				Static309.method4159("argument count");
			}
			Static107.anInt2335 = Integer.parseInt(arg0[0]);
			Static104.aClass219_2 = Static286.aClass219_5;
			if (arg0[1].equals("live")) {
				Static451.aClass117_9 = Static183.aClass117_4;
			} else if (arg0[1].equals("rc")) {
				Static451.aClass117_9 = Static346.aClass117_6;
			} else if (arg0[1].equals("wip")) {
				Static451.aClass117_9 = Static65.aClass117_1;
			} else {
				Static309.method4159("modewhat");
			}
			Static178.anInt3423 = Static73.method1357(arg0[2]);
			if (Static178.anInt3423 == -1) {
				if (arg0[2].equals("english")) {
					Static178.anInt3423 = 0;
				} else if (arg0[2].equals("german")) {
					Static178.anInt3423 = 1;
				} else {
					Static309.method4159("language");
				}
			}
			Static385.aBoolean591 = false;
			Static162.aBoolean607 = false;
			if (arg0[3].equals("game0")) {
				Static393.aClass121_3 = Static196.aClass121_1;
			} else if (arg0[3].equals("game1")) {
				Static393.aClass121_3 = Static317.aClass121_2;
			} else {
				Static309.method4159("game");
			}
			Static376.aBoolean573 = true;
			Static246.aBoolean423 = true;
			Static34.aString13 = "";
			Static226.anInt4373 = 0;
			Static168.anInt3259 = 0;
			Static345.anInt5940 = Static393.aClass121_3.anInt3570;
			@Pc(130) client local130 = new client();
			Static6.aClient1 = local130;
			local130.method885(Static393.aClass121_3.aString36, Static451.aClass117_9.method2865() + 32);
			Static226.aFrame1.setLocation(40, 40);
		} catch (@Pc(153) Exception local153) {
			Static94.method1654(local153, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method893() {
		if (Static261.aClass255_2.anInt7062 > Static316.anInt5505) {
			Static392.anInt6543 = (Static261.aClass255_2.anInt7062 * 50 - 50) * 5;
			if (Static407.anInt6723 == Static313.anInt5436) {
				Static407.anInt6723 = Static97.anInt1949;
			} else {
				Static407.anInt6723 = Static313.anInt5436;
			}
			if (Static392.anInt6543 > 3000) {
				Static392.anInt6543 = 3000;
			}
			if (Static261.aClass255_2.anInt7062 >= 2 && Static261.aClass255_2.anInt7063 == 6) {
				this.method871("js5connect_outofdate");
				Static403.anInt6667 = 1000;
				return;
			}
			if (Static261.aClass255_2.anInt7062 >= 4 && Static261.aClass255_2.anInt7063 == -1) {
				this.method871("js5crc");
				Static403.anInt6667 = 1000;
				return;
			}
			if (Static261.aClass255_2.anInt7062 >= 4 && (Static403.anInt6667 == 0 || Static403.anInt6667 == 5)) {
				if (Static261.aClass255_2.anInt7063 == 7 || Static261.aClass255_2.anInt7063 == 9) {
					this.method871("js5connect_full");
				} else if (Static261.aClass255_2.anInt7063 <= 0) {
					this.method871("js5io");
				} else {
					this.method871("js5connect");
				}
				Static403.anInt6667 = 1000;
				return;
			}
		}
		Static316.anInt5505 = Static261.aClass255_2.anInt7062;
		if (Static392.anInt6543 > 0) {
			Static392.anInt6543--;
			return;
		}
		try {
			if (Static78.anInt1567 == 0) {
				Static30.aClass199_2 = Static206.aClass66_4.method1728(Static321.aString54, Static407.anInt6723);
				Static78.anInt1567++;
			}
			if (Static78.anInt1567 == 1) {
				if (Static30.aClass199_2.anInt5760 == 2) {
					this.method903(1000);
					return;
				}
				if (Static30.aClass199_2.anInt5760 == 1) {
					Static78.anInt1567++;
				}
			}
			if (Static78.anInt1567 == 2) {
				Static240.aClass11_14 = new Class11((Socket) Static30.aClass199_2.anObject29, Static206.aClass66_4);
				@Pc(194) Class4_Sub12 local194 = new Class4_Sub12(5);
				local194.method2551(Static153.aClass60_2.anInt1812);
				local194.method2531(592);
				Static240.aClass11_14.method142(5, local194.aByteArray36);
				Static78.anInt1567++;
				Static327.aLong189 = Static282.method3962();
			}
			if (Static78.anInt1567 == 3) {
				if (Static403.anInt6667 == 0 || Static403.anInt6667 == 5 || Static240.aClass11_14.method133() > 0) {
					@Pc(259) int local259 = Static240.aClass11_14.method139();
					if (local259 != 0) {
						this.method903(local259);
						return;
					}
					Static78.anInt1567++;
				} else if (Static282.method3962() - Static327.aLong189 > 30000L) {
					this.method903(1001);
					return;
				}
			}
			if (Static78.anInt1567 == 4) {
				@Pc(293) boolean local293 = Static403.anInt6667 == 5 || Static403.anInt6667 == 10 || Static403.anInt6667 == 28;
				Static261.aClass255_2.method5461(Static240.aClass11_14, !local293);
				Static30.aClass199_2 = null;
				Static78.anInt1567 = 0;
				Static240.aClass11_14 = null;
			}
		} catch (@Pc(312) IOException local312) {
			this.method903(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method886() {
		if (Static135.aBoolean256) {
			Static316.method4216();
		}
		if (Static122.aClass19_16 != null) {
			Static122.aClass19_16.method4267();
		}
		if (Static320.aFrame3 != null) {
			Static446.method5620(Static206.aClass66_4, Static320.aFrame3);
			Static320.aFrame3 = null;
		}
		if (Static125.aClass11_5 != null) {
			Static125.aClass11_5.method138();
			Static125.aClass11_5 = null;
		}
		if (Static223.aClass14_1 != null) {
			Static223.aClass14_1.method213(Static273.aCanvas5);
		}
		Static223.aClass14_1 = null;
		Static64.method1241();
		Static261.aClass255_2.method5474();
		Static385.aClass254_3.method5433();
		if (Static402.aClass256_1 != null) {
			Static402.aClass256_1.method5475();
			Static402.aClass256_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method894() {
		if (Static403.anInt6667 == 1000) {
			return;
		}
		@Pc(19) long local19 = Static153.method2607() / 1000000L - Static153.aLong107;
		Static153.aLong107 = Static153.method2607() / 1000000L;
		@Pc(27) boolean local27 = Static303.method4111();
		if (local27 && Static436.aBoolean666 && Static424.aClass49_2 != null) {
			Static424.aClass49_2.method2064();
		}
		if (Static403.anInt6667 == 30 || Static403.anInt6667 == 10) {
			if (Static453.aLong223 != 0L && Static282.method3962() > Static453.aLong223) {
				Static188.method4107(Static450.method5664(), Static323.aClass50_Sub1_1.anInt3450, Static323.aClass50_Sub1_1.anInt3431, false);
			} else if (!Static122.aClass19_16.method4258() && Static84.aBoolean383) {
				Static349.method4711();
			}
		}
		@Pc(98) int local98;
		@Pc(102) int local102;
		if (Static320.aFrame3 == null) {
			@Pc(89) Container local89;
			if (Static226.aFrame1 == null) {
				local89 = Static206.aClass66_4.anApplet1;
			} else {
				local89 = Static226.aFrame1;
			}
			local98 = local89.getSize().width;
			local102 = local89.getSize().height;
			if (local89 == Static226.aFrame1) {
				@Pc(108) Insets local108 = Static226.aFrame1.getInsets();
				local102 -= local108.bottom + local108.top;
				local98 -= local108.left + local108.right;
			}
			if (local98 != Static425.anInt7000 || Static17.anInt222 != local102) {
				if (Static122.aClass19_16 == null || Static122.aClass19_16.method4245()) {
					Static46.method3938();
				} else {
					Static17.anInt222 = local102;
					Static425.anInt7000 = local98;
				}
				Static453.aLong223 = Static282.method3962() + 500L;
			}
		}
		if (Static320.aFrame3 != null && !Static265.aBoolean457 && (Static403.anInt6667 == 30 || Static403.anInt6667 == 10)) {
			Static188.method4107(Static323.aClass50_Sub1_1.anInt3447, -1, -1, false);
		}
		@Pc(176) boolean local176 = false;
		if (Static100.aBoolean189) {
			Static100.aBoolean189 = false;
			local176 = true;
		}
		if (local176) {
			Static348.method4697();
		}
		if (Static122.aClass19_16 != null && Static122.aClass19_16.method4258() || Static450.method5664() != 1) {
			Static369.method4940();
		}
		if (Static403.anInt6667 == 0) {
			Static201.method4604(Static171.aColorArray5[Static345.anInt5940], Static164.aColorArray6[Static345.anInt5940], Static64.aColorArray3[Static345.anInt5940], Static247.anInt4590, local176, Static24.aString53);
		} else if (Static403.anInt6667 == 5) {
			Static260.method3773(Static164.aColorArray6[Static345.anInt5940].getRGB(), local176 | Static122.aClass19_16.method4258(), Static64.aColorArray3[Static345.anInt5940].getRGB(), Static171.aColorArray5[Static345.anInt5940].getRGB(), Static331.aClass46_10, Static122.aClass19_16);
		} else if (Static403.anInt6667 == 10) {
			Static298.method4085();
		} else if (Static403.anInt6667 == 25 || Static403.anInt6667 == 28) {
			if (Static51.anInt883 == 1) {
				if (Static100.anInt2020 > Static26.anInt448) {
					Static26.anInt448 = Static100.anInt2020;
				}
				local98 = (Static26.anInt448 - Static100.anInt2020) * 50 / Static26.anInt448;
				Static436.method5519(true, Static439.aClass83_148.method2267(Static178.anInt3423) + "<br>(" + local98 + "%)", Static207.aClass46_9);
			} else if (Static51.anInt883 == 2) {
				if (Static444.anInt7298 < Static275.anInt5144) {
					Static444.anInt7298 = Static275.anInt5144;
				}
				local98 = (Static444.anInt7298 - Static275.anInt5144) * 50 / Static444.anInt7298 + 50;
				Static436.method5519(true, Static439.aClass83_148.method2267(Static178.anInt3423) + "<br>(" + local98 + "%)", Static207.aClass46_9);
			} else {
				Static436.method5519(true, Static439.aClass83_148.method2267(Static178.anInt3423), Static207.aClass46_9);
			}
		} else if (Static403.anInt6667 == 30) {
			Static45.method764(local19);
		} else if (Static403.anInt6667 == 40) {
			Static436.method5519(true, Static444.aClass83_150.method2267(Static178.anInt3423) + "<br>" + Static168.aClass83_69.method2267(Static178.anInt3423), Static207.aClass46_9);
		}
		if (Static293.anInt5286 == 3) {
			for (local98 = 0; local98 < Static229.anInt4407; local98++) {
				@Pc(394) Rectangle local394 = Class4_Sub6_Sub23.aRectangleArray1[local98];
				if (Static65.aBooleanArray9[local98]) {
					Static122.aClass19_16.method4293(local394.x, local394.width, local394.y, -1996553985, local394.height);
				} else if (Static263.aBooleanArray15[local98]) {
					Static122.aClass19_16.method4293(local394.x, local394.width, local394.y, -1996554240, local394.height);
				}
			}
		}
		if (Static426.method5440()) {
			Static433.method5498(Static122.aClass19_16);
		}
		if ((Static403.anInt6667 == 30 || Static403.anInt6667 == 10) && Static293.anInt5286 == 0 && Static450.method5664() == 1 && !local176 && Static98.aString24.equals("1.1")) {
			local98 = 0;
			for (local102 = 0; local102 < Static229.anInt4407; local102++) {
				if (Static263.aBooleanArray15[local102]) {
					Static263.aBooleanArray15[local102] = false;
					Static367.aRectangleArray2[local98++] = Class4_Sub6_Sub23.aRectangleArray1[local102];
				}
			}
			Static122.aClass19_16.method4290(Static367.aRectangleArray2, local98);
		} else if (Static403.anInt6667 != 0) {
			Static122.aClass19_16.method4247();
			for (local98 = 0; local98 < Static229.anInt4407; local98++) {
				Static263.aBooleanArray15[local98] = false;
			}
		}
		if (Static323.aClass50_Sub1_1.anInt3437 == 0) {
			Static435.method5503(15L);
		} else if (Static323.aClass50_Sub1_1.anInt3437 == 1) {
			Static435.method5503(10L);
		} else if (Static323.aClass50_Sub1_1.anInt3437 == 2) {
			Static435.method5503(5L);
		} else if (Static323.aClass50_Sub1_1.anInt3437 == 3) {
			Static435.method5503(2L);
		}
		if (Static9.aBoolean10) {
			Static198.method3117();
		}
		if (Static323.aClass50_Sub1_1.aBoolean297 && Static403.anInt6667 == 10 && Static334.anInt5766 != -1) {
			Static323.aClass50_Sub1_1.aBoolean297 = false;
			Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method872() {
		try {
			this.method899();
		} catch (@Pc(14) OutOfMemoryError local14) {
			if (local14.getMessage() == null || !local14.getMessage().startsWith("native")) {
				throw local14;
			}
			Static239.method3551(0);
			Static94.method1654(local14, local14.getMessage() + " (Recovered) " + this.method887());
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Ljava/lang/String;")
	@Override
	protected String method887() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static180.anInt3453 + "," + Static86.anInt1771 + "," + Static326.anInt5666 + "," + Static283.anInt5187 + "|";
			if (Static1.aClass16_Sub1_Sub5_Sub1_1 != null) {
				local5 = local5 + "2)" + Static263.anInt4963 + "," + (Static180.anInt3453 + Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0]) + "," + (Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0] + Static86.anInt1771) + "|";
			}
			local5 = local5 + "3)" + Static177.anInt2973 + "|4)" + Static323.aClass50_Sub1_1.anInt3440 + "|5)" + Static450.method5664() + "|6)" + Static141.anInt2881 + "," + Static302.anInt5346 + "|";
			local5 = local5 + "7)" + Static323.aClass50_Sub1_1.method2854(Static177.anInt2973) + "|";
			local5 = local5 + "8)" + Static323.aClass50_Sub1_1.method2850(Static177.anInt2973) + "|";
			local5 = local5 + "9)" + Static323.aClass50_Sub1_1.aBoolean294 + "|";
			local5 = local5 + "10)" + Static323.aClass50_Sub1_1.aBoolean307 + "|";
			local5 = local5 + "11)" + Static323.aClass50_Sub1_1.aBoolean300 + "|";
			local5 = local5 + "12)" + Static323.aClass50_Sub1_1.method2861(Static177.anInt2973) + "|";
			local5 = local5 + "13)" + Static70.anInt1503 + "|";
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(212) Throwable local212) {
			}
			local5 = local5 + "]";
		} catch (@Pc(223) Throwable local223) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method897() {
		Static176.anInt3414++;
		Static361.method4870(-1, null, -1);
		Static40.method697(null, -1, -1);
		Static164.method3582();
		Static325.anInt5640++;
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			@Pc(37) Class16_Sub1_Sub5_Sub2 local37 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local31];
			if (local37 != null) {
				@Pc(43) byte local43 = local37.aClass264_1.aByte99;
				if ((local43 & 0x1) != 0) {
					@Pc(51) int local51 = local37.method4751();
					@Pc(78) int local78;
					if ((local43 & 0x2) != 0 && local37.anInt6086 == 0 && Math.random() * 1000.0D < 10.0D) {
						local78 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(86) int local86 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local78 != 0 || local86 != 0) {
							@Pc(101) int local101 = local37.anIntArray426[0] + local78;
							if (local101 < 0) {
								local101 = 0;
							} else if (Static326.anInt5666 - local51 - 1 < local101) {
								local101 = Static326.anInt5666 - local51 - 1;
							}
							@Pc(136) int local136 = local37.anIntArray427[0] + local86;
							if (local136 < 0) {
								local136 = 0;
							} else if (local136 > Static283.anInt5187 - local51 - 1) {
								local136 = Static283.anInt5187 - local51 - 1;
							}
							@Pc(183) int local183 = Static6.method49(Static175.aClass213Array1[local37.aByte82], local37.anIntArray426[0], local101, local51, local136, local51, 0, Static33.anIntArray36, 0, true, Static392.anIntArray498, local37.anIntArray427[0], local51, -1);
							if (local183 > 0) {
								if (local183 > 9) {
									local183 = 9;
								}
								for (@Pc(195) int local195 = 0; local195 < local183; local195++) {
									local37.anIntArray426[local195] = Static392.anIntArray498[local183 - local195 - 1];
									local37.anIntArray427[local195] = Static33.anIntArray36[local183 - local195 - 1];
									local37.aByteArray84[local195] = 1;
								}
								local37.anInt6086 = local183;
							}
						}
					}
					Static395.method5163(true, local37);
					local78 = Static141.method2424(local37);
					Static447.method5628(local37, Static249.anInt4620, Static82.anInt1655, local78);
					Static371.method4959(local37);
				}
			}
		}
		if (Static238.anInt4506 == 0 && Static354.anInt6183 == 0) {
			if (Static111.anInt2386 == 2) {
				Static329.method4430();
			} else {
				Static294.method514();
			}
			if (Static163.anInt3197 >> 7 < 14 || Static326.anInt5666 - 14 <= Static163.anInt3197 >> 7 || Static145.anInt2906 >> 7 < 14 || Static145.anInt2906 >> 7 >= Static283.anInt5187 - 14) {
				Static63.method1134();
			}
		}
		while (true) {
			@Pc(311) Class4_Sub34 local311;
			@Pc(316) Class247 local316;
			@Pc(327) Class247 local327;
			do {
				local311 = (Class4_Sub34) Static237.aClass183_52.method4136();
				if (local311 == null) {
					while (true) {
						do {
							local311 = (Class4_Sub34) Static39.aClass183_3.method4136();
							if (local311 == null) {
								while (true) {
									do {
										local311 = (Class4_Sub34) Static291.aClass183_35.method4136();
										if (local311 == null) {
											if (Static281.aClass247_12 != null) {
												Static1.method3();
											}
											if (Static24.anInt5323 % 1500 == 0) {
												Static343.method744();
											}
											Static375.method4999();
											if (Static135.aBoolean256 && Static282.method3962() - 60000L > Static174.aLong119) {
												Static316.method4216();
												return;
											}
											return;
										}
										local316 = local311.aClass247_15;
										if (local316.anInt6865 < 0) {
											break;
										}
										local327 = Static392.method5121(local316.anInt6850);
									} while (local327 == null || local327.aClass247Array2 == null || local316.anInt6865 >= local327.aClass247Array2.length || local316 != local327.aClass247Array2[local316.anInt6865]);
									Static271.method3894(local311);
								}
							}
							local316 = local311.aClass247_15;
							if (local316.anInt6865 < 0) {
								break;
							}
							local327 = Static392.method5121(local316.anInt6850);
						} while (local327 == null || local327.aClass247Array2 == null || local327.aClass247Array2.length <= local316.anInt6865 || local316 != local327.aClass247Array2[local316.anInt6865]);
						Static271.method3894(local311);
					}
				}
				local316 = local311.aClass247_15;
				if (local316.anInt6865 < 0) {
					break;
				}
				local327 = Static392.method5121(local316.anInt6850);
			} while (local327 == null || local327.aClass247Array2 == null || local327.aClass247Array2.length <= local316.anInt6865 || local327.aClass247Array2[local316.anInt6865] != local316);
			Static271.method3894(local311);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method899() {
		if (Static403.anInt6667 == 1000) {
			return;
		}
		Static24.anInt5323++;
		if (Static24.anInt5323 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static239.anInt4519 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static325.aRandom1.setSeed((long) Static239.anInt4519);
		}
		if (Static24.anInt5323 % 50 == 0) {
			Static449.anInt7316 = Static60.anInt1097;
			Static55.anInt1020 = Static138.anInt2826;
			Static60.anInt1097 = 0;
			Static138.anInt2826 = 0;
		}
		this.method912();
		if (Static94.aClass159_1 != null) {
			Static94.aClass159_1.method3819();
		}
		Static225.method3438();
		Static384.aClass244_1.method5487();
		Static420.aClass80_1.method2236();
		if (Static223.aClass14_1 != null) {
			@Pc(85) int local85 = Static223.aClass14_1.method212();
			Static430.anInt3862 = local85;
		}
		if (Static122.aClass19_16 != null) {
			Static122.aClass19_16.method4246((int) Static282.method3962());
		}
		Static201.method4605();
		Static190.anInt3602 = 0;
		for (@Pc(106) Class30 local106 = Static384.aClass244_1.method5483(); local106 != null && Static190.anInt3602 < 128; local106 = Static384.aClass244_1.method5483()) {
			if (local106.method745() != 1) {
				@Pc(119) char local119 = local106.method749();
				if (!Static423.method5406() || local119 != '`' && local119 != '§') {
					Static164.aClass30Array4[Static190.anInt3602] = local106;
					Static190.anInt3602++;
				} else if (Static426.method5440()) {
					Static433.method5500();
				} else {
					Static263.method3806();
				}
			}
		}
		for (@Pc(168) Class4_Sub5 local168 = Static420.aClass80_1.method2232(); local168 != null; local168 = Static420.aClass80_1.method2232()) {
			@Pc(174) int local174 = local168.method515();
			if (local174 == -1) {
				Static348.aClass183_42.method4137(local168);
			} else if (Static105.method1981(local174)) {
				Static413.aClass183_47.method4137(local168);
			}
			if (Static413.aClass183_47.method4148() > 10) {
				Static413.aClass183_47.method4136();
			}
		}
		if (Static426.method5440()) {
			Static213.method3223();
		}
		if (Static403.anInt6667 == 0) {
			this.method910();
			Static252.method3660();
		} else if (Static403.anInt6667 == 5) {
			this.method910();
			Static252.method3660();
		} else if (Static403.anInt6667 == 25 || Static403.anInt6667 == 28) {
			Static218.method3275();
		}
		if (Static403.anInt6667 == 10) {
			this.method897();
			Static387.method5090();
			Static285.method3510();
			Static425.method5430();
		} else if (Static403.anInt6667 == 30) {
			Static437.method4042();
		} else if (Static403.anInt6667 == 40) {
			Static425.method5430();
			if (Static296.anInt5302 != -3 && Static296.anInt5302 != 2 && Static296.anInt5302 != 15) {
				Static251.method3639();
			}
		}
		Static79.method1400(Static122.aClass19_16);
		Static413.aClass183_47.method4136();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method869()) {
			return;
		}
		Static107.anInt2335 = Integer.parseInt(this.getParameter("worldid"));
		Static104.aClass219_2 = Static316.method4222(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static193.method3034(Static104.aClass219_2) && Static373.aClass219_6 != Static104.aClass219_2) {
			Static104.aClass219_2 = Static373.aClass219_6;
		}
		Static451.aClass117_9 = Static288.method3983(Integer.parseInt(this.getParameter("modewhat")));
		if (Static451.aClass117_9 != Static65.aClass117_1 && Static451.aClass117_9 != Static346.aClass117_6 && Static451.aClass117_9 != Static183.aClass117_4) {
			Static451.aClass117_9 = Static183.aClass117_4;
		}
		try {
			Static178.anInt3423 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(56) Exception local56) {
			Static178.anInt3423 = 0;
		}
		@Pc(62) String local62 = this.getParameter("objecttag");
		if (local62 != null && local62.equals("1")) {
			Static162.aBoolean607 = true;
		} else {
			Static162.aBoolean607 = false;
		}
		@Pc(78) String local78 = this.getParameter("js");
		if (local78 != null && local78.equals("1")) {
			Static385.aBoolean591 = true;
		} else {
			Static385.aBoolean591 = false;
		}
		@Pc(94) String local94 = this.getParameter("advert");
		if (local94 != null && local94.equals("1")) {
			Static306.aBoolean484 = true;
		} else {
			Static306.aBoolean484 = false;
		}
		@Pc(110) String local110 = this.getParameter("game");
		if (local110 != null && local110.equals("1")) {
			Static393.aClass121_3 = Static317.aClass121_2;
		} else {
			Static393.aClass121_3 = Static196.aClass121_1;
		}
		try {
			Static168.anInt3259 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(129) Exception local129) {
			Static168.anInt3259 = 0;
		}
		Static164.aString45 = this.getParameter("quiturl");
		Static34.aString13 = this.getParameter("settings");
		if (Static34.aString13 == null) {
			Static34.aString13 = "";
		}
		@Pc(147) String local147 = this.getParameter("country");
		if (local147 != null) {
			try {
				Static226.anInt4373 = Integer.parseInt(local147);
			} catch (@Pc(154) Exception local154) {
				Static226.anInt4373 = 0;
			}
		}
		Static345.anInt5940 = Integer.parseInt(this.getParameter("colourid"));
		if (Static345.anInt5940 < 0 || Static64.aColorArray3.length <= Static345.anInt5940) {
			Static345.anInt5940 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static376.aBoolean573 = true;
			Static246.aBoolean423 = true;
		}
		Static6.aClient1 = this;
		if (Static196.aClass121_1 == Static393.aClass121_3) {
			Static353.anInt6121 = 765;
			Static157.anInt3148 = 503;
		} else if (Static317.aClass121_2 == Static393.aClass121_3) {
			Static157.anInt3148 = 480;
			Static353.anInt6121 = 640;
		}
		this.method881(Static451.aClass117_9.method2865() + 32, Static157.anInt3148, Static353.anInt6121);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method891() {
		try {
			this.method894();
		} catch (@Pc(13) OutOfMemoryError local13) {
			if (local13.getMessage() == null || !local13.getMessage().startsWith("native")) {
				throw local13;
			}
			Static239.method3551(0);
			Static94.method1654(local13, local13.getMessage() + " (Recovered) " + this.method887());
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method880() {
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method903(@OriginalArg(1) int arg0) {
		Static240.aClass11_14 = null;
		Static30.aClass199_2 = null;
		Static261.aClass255_2.anInt7062++;
		Static261.aClass255_2.anInt7063 = arg0;
		Static78.anInt1567 = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method883() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static46.method3938();
		Static385.aClass254_3 = new Class254(Static206.aClass66_4);
		Static261.aClass255_2 = new Class255();
		if (Static373.aClass219_6 != Static104.aClass219_2) {
			Static392.aByteArrayArray28 = new byte[50][];
		}
		Static323.aClass50_Sub1_1 = new Class50_Sub1(Static206.aClass66_4);
		if (Static104.aClass219_2 == Static373.aClass219_6) {
			Static13.aString4 = this.getCodeBase().getHost();
			Static133.anInt2755 = 43594;
			Static11.anInt154 = 443;
		} else if (Static193.method3034(Static104.aClass219_2)) {
			Static13.aString4 = this.getCodeBase().getHost();
			Static133.anInt2755 = Static107.anInt2335 + 40000;
			Static11.anInt154 = Static107.anInt2335 + 50000;
		} else if (Static104.aClass219_2 == Static286.aClass219_5) {
			Static133.anInt2755 = Static107.anInt2335 + 40000;
			Static13.aString4 = "127.0.0.1";
			Static11.anInt154 = Static107.anInt2335 + 50000;
		}
		Static313.anInt5435 = Static133.anInt2755;
		Static321.aString54 = Static13.aString4;
		Static97.anInt1949 = Static11.anInt154;
		Static313.anInt5436 = Static133.anInt2755;
		if (Static98.anInt1987 == 3) {
			Static56.anInt1028 = Static107.anInt2335;
		}
		Static252.aShortArray151 = Static330.aShortArray196 = Static78.aShortArray46 = Static166.aShortArray97 = new short[256];
		if (Static317.aClass121_2 == Static393.aClass121_3) {
			Static15.aShortArrayArray1 = Static78.aShortArrayArray4;
			Static299.aShortArray179 = Static240.aShortArray251;
			Static65.anInt1369 = 16777215;
			Static317.anInt5521 = 0;
			Static434.aBoolean692 = true;
			Static434.aShortArray252 = Static70.aShortArray43;
			Static26.aShortArrayArray2 = Static84.aShortArrayArray8;
		} else {
			Static26.aShortArrayArray2 = Static70.aShortArrayArray3;
			Static15.aShortArrayArray1 = Static108.aShortArrayArray6;
			Static434.aShortArray252 = Static293.aShortArray175;
			Static299.aShortArray179 = Static354.aShortArray210;
		}
		Static407.anInt6723 = Static313.anInt5435;
		Static384.aClass244_1 = Static140.method2398(Static273.aCanvas5);
		Static420.aClass80_1 = Static376.method4882(Static273.aCanvas5);
		Static223.aClass14_1 = Static328.method4424();
		if (Static223.aClass14_1 != null) {
			Static223.aClass14_1.method209(Static273.aCanvas5);
		}
		Static96.anInt1932 = Static98.anInt1987;
		try {
			if (Static206.aClass66_4.aClass207_3 != null) {
				Static88.aClass139_1 = new Class139(Static206.aClass66_4.aClass207_3, 5200, 0);
				for (@Pc(169) int local169 = 0; local169 < 30; local169++) {
					Static86.aClass139Array1[local169] = new Class139(Static206.aClass66_4.aClass207Array1[local169], 6000, 0);
				}
				Static425.aClass139_5 = new Class139(Static206.aClass66_4.aClass207_1, 6000, 0);
				Static225.aClass222_2 = new Class222(255, Static88.aClass139_1, Static425.aClass139_5, 500000);
				Static394.aClass139_4 = new Class139(Static206.aClass66_4.aClass207_2, 24, 0);
				Static206.aClass66_4.aClass207_1 = null;
				Static206.aClass66_4.aClass207_2 = null;
				Static206.aClass66_4.aClass207_3 = null;
				Static206.aClass66_4.aClass207Array1 = null;
			}
		} catch (@Pc(227) IOException local227) {
			Static394.aClass139_4 = null;
			Static88.aClass139_1 = null;
			Static225.aClass222_2 = null;
			Static425.aClass139_5 = null;
		}
		if (Static373.aClass219_6 != Static104.aClass219_2) {
			Static325.aBoolean507 = true;
		}
		Static129.aString30 = (Static196.aClass121_1 == Static393.aClass121_3 ? Static268.aClass83_104 : Static374.aClass83_129).method2267(Static178.anInt3423);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method908(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub12 local10 = new Class4_Sub12(arg0);
		while (true) {
			@Pc(18) int local18;
			@Pc(42) int local42;
			@Pc(37) int local37;
			label45: do {
				while (true) {
					while (true) {
						local18 = local10.method2490();
						if (local18 == 0) {
							return;
						}
						if (local18 == 1) {
							@Pc(106) int[] local106 = Static382.anIntArray491 = new int[6];
							local106[0] = local10.method2536();
							local106[1] = local10.method2536();
							local106[2] = local10.method2536();
							local106[3] = local10.method2536();
							local106[4] = local10.method2536();
							local106[5] = local10.method2536();
						} else {
							if (local18 != 4) {
								continue label45;
							}
							local37 = local10.method2490();
							Static290.anIntArray490 = new int[local37];
							for (local42 = 0; local42 < local37; local42++) {
								Static290.anIntArray490[local42] = local10.method2536();
								if (Static290.anIntArray490[local42] == 65535) {
									Static290.anIntArray490[local42] = -1;
								}
							}
						}
					}
				}
			} while (local18 != 5);
			local37 = local10.method2490();
			Static171.anIntArray217 = new int[local37];
			for (local42 = 0; local42 < local37; local42++) {
				Static171.anIntArray217[local42] = local10.method2536();
				if (Static171.anIntArray217[local42] == 65535) {
					Static171.anIntArray217[local42] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method910() {
		@Pc(10) int local10;
		if (!Static323.aClass50_Sub1_1.aBoolean297) {
			for (local10 = 0; local10 < Static190.anInt3602; local10++) {
				if (Static164.aClass30Array4[local10].method749() == 's' || Static164.aClass30Array4[local10].method749() == 'S') {
					Static323.aClass50_Sub1_1.aBoolean297 = true;
					break;
				}
			}
		}
		@Pc(57) int local57;
		if (Static1.anInt5 == 0) {
			@Pc(47) Runtime local47 = Runtime.getRuntime();
			local57 = (int) ((local47.totalMemory() - local47.freeMemory()) / 1024L);
			@Pc(60) long local60 = Static282.method3962();
			if (Static22.aLong17 == 0L) {
				Static22.aLong17 = local60;
			}
			if (local57 > 16384 && local60 - Static22.aLong17 < 5000L) {
				if (local60 - Static328.aLong190 > 1000L) {
					System.gc();
					Static328.aLong190 = local60;
				}
				Static24.aString53 = Static107.aClass83_40.method2267(Static178.anInt3423);
				Static247.anInt4590 = 5;
			} else {
				Static24.aString53 = Static24.aClass83_111.method2267(Static178.anInt3423);
				Static1.anInt5 = 10;
				Static247.anInt4590 = 5;
			}
		} else if (Static1.anInt5 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static175.aClass213Array1[local10] = Static446.method5622(Static283.anInt5187, Static326.anInt5666);
			}
			Static24.aString53 = Static153.aClass83_61.method2267(Static178.anInt3423);
			Static247.anInt4590 = 10;
			Static1.anInt5 = 20;
		} else if (Static1.anInt5 == 20) {
			if (Static94.aClass159_1 == null) {
				Static94.aClass159_1 = new Class159(Static261.aClass255_2, Static385.aClass254_3);
			}
			if (Static94.aClass159_1.method3814()) {
				Static395.aClass76_92 = Static265.method3820(false, 0, true);
				Static324.aClass76_69 = Static265.method3820(false, 1, true);
				Static74.aClass76_20 = Static265.method3820(false, 2, true);
				Static256.aClass76_50 = Static265.method3820(false, 3, true);
				Static67.aClass76_19 = Static265.method3820(false, 4, true);
				Static49.aClass76_27 = Static265.method3820(true, 5, true);
				Static46.aClass76_54 = Static265.method3820(true, 6, false);
				Static357.aClass76_82 = Static265.method3820(false, 7, true);
				Static293.aClass76_60 = Static265.method3820(false, 8, true);
				Static196.aClass76_44 = Static265.method3820(false, 9, true);
				Static88.aClass76_23 = Static265.method3820(false, 10, true);
				Static284.aClass76_55 = Static265.method3820(false, 11, true);
				Static197.aClass76_45 = Static265.method3820(false, 12, true);
				Static209.aClass76_48 = Static265.method3820(false, 13, true);
				Static312.aClass76_66 = Static265.method3820(false, 14, false);
				Static350.aClass76_79 = Static265.method3820(false, 15, true);
				Static424.aClass76_99 = Static265.method3820(false, 16, true);
				Static208.aClass76_29 = Static265.method3820(false, 17, true);
				Static381.aClass76_87 = Static265.method3820(false, 18, true);
				Static391.aClass76_91 = Static265.method3820(false, 19, true);
				Static388.aClass76_90 = Static265.method3820(false, 20, true);
				Static55.aClass76_16 = Static265.method3820(false, 21, true);
				Static64.aClass76_17 = Static265.method3820(false, 22, true);
				Static163.aClass76_39 = Static265.method3820(true, 23, true);
				Static66.aClass76_70 = Static265.method3820(false, 24, true);
				Static154.aClass76_11 = Static265.method3820(false, 25, true);
				Static24.aClass76_61 = Static265.method3820(true, 26, true);
				Static417.aClass76_98 = Static265.method3820(false, 27, true);
				Static19.aClass76_2 = Static265.method3820(true, 28, true);
				Static366.aClass76_83 = Static265.method3820(false, 29, true);
				Static24.aString53 = Static321.aClass83_117.method2267(Static178.anInt3423);
				Static247.anInt4590 = 15;
				Static1.anInt5 = 30;
			} else {
				Static24.aString53 = Static33.aClass83_18.method2267(Static178.anInt3423);
				Static247.anInt4590 = 12;
			}
		} else if (Static1.anInt5 == 30) {
			local10 = 0;
			for (local57 = 0; local57 < 30; local57++) {
				local10 += Static119.aClass143_Sub1Array1[local57].method3525() * Static251.anIntArray307[local57] / 100;
			}
			if (local10 == 100) {
				Static24.aString53 = Static336.aClass83_135.method2267(Static178.anInt3423);
				Static247.anInt4590 = 20;
				Static138.method2373(Static293.aClass76_60);
				Static221.method3346(Static293.aClass76_60);
				Static1.anInt5 = 40;
			} else {
				if (local10 != 0) {
					Static24.aString53 = Static96.aClass83_37.method2267(Static178.anInt3423) + local10 + "%";
				}
				Static247.anInt4590 = 20;
			}
		} else if (Static1.anInt5 == 40) {
			if (Static19.aClass76_2.method2116()) {
				this.method908(Static19.aClass76_2.method2122(1));
				Static24.aString53 = Static409.aClass83_145.method2267(Static178.anInt3423);
				Static247.anInt4590 = 25;
				Static1.anInt5 = 50;
			} else {
				Static24.aString53 = Static50.aClass83_27.method2267(Static178.anInt3423) + Static19.aClass76_2.method2112() + "%";
				Static247.anInt4590 = 25;
			}
		} else if (Static1.anInt5 == 50) {
			Static72.method1354();
			Static24.aString53 = Static309.aClass83_114.method2267(Static178.anInt3423);
			Static247.anInt4590 = 30;
			Static1.anInt5 = 60;
		} else if (Static1.anInt5 == 60) {
			local10 = Static444.method5632(Static209.aClass76_48, Static293.aClass76_60);
			local57 = Static454.method3302();
			if (local10 < local57) {
				Static24.aString53 = Static159.aClass83_67.method2267(Static178.anInt3423) + local10 * 100 / local57 + "%";
				Static247.anInt4590 = 35;
			} else {
				Static24.aString53 = Static43.aClass83_151.method2267(Static178.anInt3423);
				Static1.anInt5 = 70;
				Static247.anInt4590 = 35;
			}
		} else if (Static1.anInt5 == 70) {
			local10 = Static97.method1701(Static293.aClass76_60);
			local57 = Static395.method5165();
			if (local57 > local10) {
				Static24.aString53 = Static363.aClass83_123.method2267(Static178.anInt3423) + local10 * 100 / local57 + "%";
				Static247.anInt4590 = 40;
			} else {
				Static24.aString53 = Static363.aClass83_122.method2267(Static178.anInt3423);
				Static1.anInt5 = 80;
				Static247.anInt4590 = 40;
			}
		} else if (Static1.anInt5 == 80) {
			if (Static24.aClass76_61.method2116()) {
				Static80.anInterface7_3 = new Class91(Static24.aClass76_61, Static196.aClass76_44, Static293.aClass76_60);
				Static24.aString53 = Static42.aClass83_22.method2267(Static178.anInt3423);
				Static247.anInt4590 = 45;
				Static1.anInt5 = 90;
			} else {
				Static24.aString53 = Static171.aClass83_71.method2267(Static178.anInt3423) + Static24.aClass76_61.method2112() + "%";
				Static247.anInt4590 = 45;
			}
		} else if (Static1.anInt5 == 90) {
			Static24.aString53 = Static243.aClass83_95.method2267(Static178.anInt3423);
			Static247.anInt4590 = 50;
			Static1.anInt5 = 95;
		} else if (Static1.anInt5 == 95) {
			if (Static323.aClass50_Sub1_1.aBoolean297) {
				Static323.aClass50_Sub1_1.anInt3442 = 0;
				Static323.aClass50_Sub1_1.anInt3447 = 1;
				Static323.aClass50_Sub1_1.anInt3440 = 0;
				Static323.aClass50_Sub1_1.anInt3445 = 0;
				Static323.aClass50_Sub1_1.anInt3434 = 0;
			}
			Static323.aClass50_Sub1_1.aBoolean297 = true;
			Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
			Static440.method5561(false, Static323.aClass50_Sub1_1.anInt3445);
			Static24.aString53 = Static372.aClass83_126.method2267(Static178.anInt3423);
			Static247.anInt4590 = 55;
			Static1.anInt5 = 100;
		} else if (Static1.anInt5 == 100) {
			Static40.method696(Static122.aClass19_16, Static293.aClass76_60, Static209.aClass76_48);
			Static24.aString53 = Static296.aClass83_109.method2267(Static178.anInt3423);
			Static247.anInt4590 = 60;
			Static187.method2932(5);
			Static1.anInt5 = 110;
		} else if (Static1.anInt5 == 110) {
			Static74.aClass76_20.method2116();
			local10 = Static74.aClass76_20.method2112();
			Static424.aClass76_99.method2116();
			local10 += Static424.aClass76_99.method2112();
			Static208.aClass76_29.method2116();
			local10 += Static208.aClass76_29.method2112();
			Static381.aClass76_87.method2116();
			local10 += Static381.aClass76_87.method2112();
			Static391.aClass76_91.method2116();
			local10 += Static391.aClass76_91.method2112();
			Static388.aClass76_90.method2116();
			local10 += Static388.aClass76_90.method2112();
			Static55.aClass76_16.method2116();
			local10 += Static55.aClass76_16.method2112();
			Static64.aClass76_17.method2116();
			local10 += Static64.aClass76_17.method2112();
			Static66.aClass76_70.method2116();
			local10 += Static66.aClass76_70.method2112();
			Static154.aClass76_11.method2116();
			local10 += Static154.aClass76_11.method2112();
			Static417.aClass76_98.method2116();
			local10 += Static417.aClass76_98.method2112();
			Static366.aClass76_83.method2116();
			local10 += Static366.aClass76_83.method2112();
			if (local10 < 1200) {
				Static24.aString53 = Static22.aClass83_13.method2267(Static178.anInt3423) + local10 / 12 + "%";
				Static247.anInt4590 = 65;
			} else {
				Static153.aClass180_1 = new Class180(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static222.aClass249_1 = new Class249(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static118.aClass172_2 = new Class172(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20, Static293.aClass76_60);
				Static416.aClass158_1 = new Class158(Static393.aClass121_3, Static178.anInt3423, Static208.aClass76_29);
				Static154.aClass124_2 = new Class124(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static234.aClass192_2 = new Class192(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static420.aClass109_2 = new Class109(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20, Static357.aClass76_82);
				Static101.aClass75_1 = new Class75(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static405.aClass204_1 = new Class204(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static267.aClass262_2 = new Class262(Static393.aClass121_3, Static178.anInt3423, true, Static424.aClass76_99, Static357.aClass76_82);
				Static348.aClass182_4 = new Class182(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20, Static293.aClass76_60);
				Static76.aClass265_2 = new Class265(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20, Static293.aClass76_60);
				Static329.aClass240_1 = new Class240(Static393.aClass121_3, Static178.anInt3423, true, Static381.aClass76_87, Static357.aClass76_82);
				Static444.aClass206_3 = new Class206(Static393.aClass121_3, Static178.anInt3423, true, Static153.aClass180_1, Static391.aClass76_91, Static357.aClass76_82);
				Static426.aClass208_1 = new Class208(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static182.aClass55_1 = new Class55(Static393.aClass121_3, Static178.anInt3423, Static388.aClass76_90, Static395.aClass76_92, Static324.aClass76_69);
				Static296.aClass217_1 = new Class217(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static238.aClass226_1 = new Class226(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static352.aClass194_2 = new Class194(Static393.aClass121_3, Static178.anInt3423, Static55.aClass76_16, Static357.aClass76_82);
				Static280.aClass72_1 = new Class72(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static186.aClass197_1 = new Class197(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static43.aClass93_4 = new Class93(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static26.aClass26_1 = new Class26(Static393.aClass121_3, Static178.anInt3423, Static64.aClass76_17);
				Static183.aClass223_1 = new Class223(Static393.aClass121_3, Static178.anInt3423, Static74.aClass76_20);
				Static442.method5586(Static256.aClass76_50, Static209.aClass76_48, Static357.aClass76_82, Static293.aClass76_60);
				Static165.method2730(Static366.aClass76_83);
				Static401.aClass62_1 = new Class62(Static178.anInt3423, Static66.aClass76_70, Static154.aClass76_11);
				Static445.aClass81_2 = new Class81(Static178.anInt3423, Static66.aClass76_70, Static154.aClass76_11, new Class130());
				Static24.aString53 = Static130.aClass83_52.method2267(Static178.anInt3423);
				Static247.anInt4590 = 65;
				Static38.method673();
				Static267.aClass262_2.method5562(!Static323.aClass50_Sub1_1.method2861(Static177.anInt2973));
				Static257.aClass114_1 = new Class114();
				Static119.method2149();
				Static378.method3227(Static417.aClass76_98);
				Static273.method3916(Static357.aClass76_82, Static80.anInterface7_3);
				Static1.anInt5 = 120;
			}
		} else if (Static1.anInt5 == 120) {
			local10 = Static290.method5014(Static293.aClass76_60);
			local57 = Static203.method3176();
			if (local10 < local57) {
				Static24.aString53 = Static240.aClass83_153.method2267(Static178.anInt3423) + local10 * 100 / local57 + "%";
				Static247.anInt4590 = 70;
			} else {
				Static97.method1700(Static293.aClass76_60, Static122.aClass19_16);
				Static324.method4387(Static429.aClass57Array18);
				Static24.aString53 = Static391.aClass83_132.method2267(Static178.anInt3423);
				Static1.anInt5 = 130;
				Static247.anInt4590 = 70;
			}
		} else if (Static1.anInt5 == 130) {
			if (Static88.aClass76_23.method2123("", "huffman")) {
				@Pc(1252) Class119 local1252 = new Class119(Static88.aClass76_23.method2109("huffman", ""));
				Static195.method3074(local1252);
				Static24.aString53 = Static3.aClass83_88.method2267(Static178.anInt3423);
				Static247.anInt4590 = 75;
				Static1.anInt5 = 140;
			} else {
				Static24.aString53 = Static60.aClass83_29.method2267(Static178.anInt3423) + "0%";
				Static247.anInt4590 = 75;
			}
		} else if (Static1.anInt5 == 140) {
			if (Static256.aClass76_50.method2116()) {
				Static24.aString53 = Static379.aClass83_130.method2267(Static178.anInt3423);
				Static1.anInt5 = 150;
				Static247.anInt4590 = 80;
			} else {
				Static24.aString53 = Static373.aClass83_127.method2267(Static178.anInt3423) + Static256.aClass76_50.method2112() + "%";
				Static247.anInt4590 = 80;
			}
		} else if (Static1.anInt5 == 150) {
			if (Static197.aClass76_45.method2116()) {
				Static24.aString53 = Static399.aClass83_138.method2267(Static178.anInt3423);
				Static1.anInt5 = 160;
				Static247.anInt4590 = 82;
			} else {
				Static24.aString53 = Static94.aClass83_35.method2267(Static178.anInt3423) + Static197.aClass76_45.method2112() + "%";
				Static247.anInt4590 = 82;
			}
		} else if (Static1.anInt5 == 160) {
			if (Static209.aClass76_48.method2116()) {
				Static24.aString53 = Static392.aClass83_134.method2267(Static178.anInt3423);
				Static1.anInt5 = 170;
				Static247.anInt4590 = 85;
			} else {
				Static24.aString53 = Static392.aClass83_134.method2267(Static178.anInt3423) + Static209.aClass76_48.method2112() + "%";
				Static247.anInt4590 = 85;
			}
		} else if (Static1.anInt5 == 170) {
			if (Static163.aClass76_39.method2103("details")) {
				Static148.method4514(Static163.aClass76_39, Static154.aClass124_2, Static234.aClass192_2, Static267.aClass262_2, Static348.aClass182_4, Static76.aClass265_2, Static257.aClass114_1);
				Static24.aString53 = Static261.aClass83_103.method2267(Static178.anInt3423);
				Static1.anInt5 = 180;
				Static247.anInt4590 = 89;
			} else {
				Static24.aString53 = Static270.aClass83_106.method2267(Static178.anInt3423) + Static163.aClass76_39.method2113("details") + "%";
				Static247.anInt4590 = 87;
			}
		} else if (Static1.anInt5 == 180) {
			local10 = Static112.method2035();
			if (local10 == -1) {
				Static24.aString53 = Static280.aClass83_108.method2267(Static178.anInt3423);
				Static247.anInt4590 = 90;
			} else if (local10 == 7 || local10 == 9) {
				this.method871("worldlistfull");
				Static187.method2932(1000);
			} else if (Static94.aBoolean176) {
				Static24.aString53 = Static119.aClass83_44.method2267(Static178.anInt3423);
				Static1.anInt5 = 190;
				Static247.anInt4590 = 90;
			} else {
				this.method871("worldlistio_" + local10);
				Static187.method2932(1000);
			}
		} else if (Static1.anInt5 == 190) {
			Static265.aStringArray20 = new String[Static186.aClass197_1.anInt5738];
			Static22.aBooleanArray3 = new boolean[Static43.aClass93_4.anInt2890];
			Static165.anIntArray210 = new int[Static43.aClass93_4.anInt2890];
			for (local10 = 0; local10 < Static43.aClass93_4.anInt2890; local10++) {
				if (Static43.aClass93_4.method2430(local10).anInt6668 == 0) {
					Static22.aBooleanArray3[local10] = true;
					Static268.anInt4998++;
				}
				Static165.anIntArray210[local10] = -1;
			}
			Static228.method2068();
			Static254.anInt4755 = Static256.aClass76_50.method2099("loginscreen");
			Static49.aClass76_27.method2128(false);
			Static46.aClass76_54.method2128(true);
			Static293.aClass76_60.method2128(true);
			Static209.aClass76_48.method2128(true);
			Static88.aClass76_23.method2128(true);
			Static256.aClass76_50.method2128(true);
			Static74.aClass76_20.anInt2476 = 2;
			Static9.aBoolean10 = true;
			Static208.aClass76_29.anInt2476 = 2;
			Static424.aClass76_99.anInt2476 = 2;
			Static381.aClass76_87.anInt2476 = 2;
			Static391.aClass76_91.anInt2476 = 2;
			Static388.aClass76_90.anInt2476 = 2;
			Static55.aClass76_16.anInt2476 = 2;
			Static188.method4107(Static323.aClass50_Sub1_1.anInt3447, -1, -1, false);
			Static24.aString53 = Static61.aClass83_30.method2267(Static178.anInt3423);
			Static247.anInt4590 = 95;
			Static1.anInt5 = 200;
		} else if (Static1.anInt5 == 200) {
			Static374.method4994(true);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method912() {
		@Pc(7) boolean local7 = Static261.aClass255_2.method5468();
		if (!local7) {
			this.method893();
		}
	}
}
