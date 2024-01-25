import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static529.method7708("Argument count");
			}
			Static580.aClass275_6 = new Class275();
			Static580.aClass275_6.anInt7968 = Integer.parseInt(arg0[0]);
			Static267.aClass275_1 = new Class275();
			Static267.aClass275_1.anInt7968 = Integer.parseInt(arg0[1]);
			Static516.aClass275_5 = new Class275();
			Static516.aClass275_5.anInt7968 = Integer.parseInt(arg0[2]);
			Static186.aClass123_6 = Static79.aClass123_16;
			if (arg0[3].equals("live")) {
				Static212.aClass192_1 = Static520.aClass192_4;
			} else if (arg0[3].equals("rc")) {
				Static212.aClass192_1 = Static250.aClass192_2;
			} else if (arg0[3].equals("wip")) {
				Static212.aClass192_1 = Static486.aClass192_3;
			} else {
				Static529.method7708("modewhat");
			}
			Static286.anInt5468 = Static366.method5843(arg0[4]);
			if (Static286.anInt5468 == -1) {
				if (arg0[4].equals("english")) {
					Static286.anInt5468 = 0;
				} else if (arg0[4].equals("german")) {
					Static286.anInt5468 = 1;
				} else {
					Static529.method7708("language");
				}
			}
			Static214.aBoolean361 = false;
			Static445.aBoolean599 = false;
			if (arg0[5].equals("game0")) {
				Static38.aClass162_1 = Static476.aClass162_3;
			} else if (arg0[5].equals("game1")) {
				Static38.aClass162_1 = Static303.aClass162_2;
			} else {
				Static529.method7708("game");
			}
			Static12.aBoolean36 = true;
			Static175.aBoolean325 = true;
			Static303.aString67 = null;
			Static52.aBoolean148 = false;
			Static287.anInt5471 = Static38.aClass162_1.anInt4926;
			Static264.anInt6184 = 0;
			Static95.aBoolean204 = false;
			Static294.anInt5607 = 0;
			Static347.aLong149 = 0L;
			Static166.aString38 = "";
			Static167.anInt3844 = 0;
			@Pc(164) client local164 = new client();
			Static363.aClient1 = local164;
			local164.method1440(Static212.aClass192_1.method4776() + 32, Static38.aClass162_1.aString56);
			Static138.aFrame1.setLocation(40, 40);
		} catch (@Pc(188) Exception local188) {
			Static5.method211(local188, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method1452(@OriginalArg(0) int arg0) {
		Static323.anInt6115 = 0;
		Static352.aClass228_3.anInt6789++;
		Static352.aClass228_3.anInt6790 = arg0;
		Static139.aClass310_1 = null;
		Static72.aClass280_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1445()) {
			return;
		}
		Static580.aClass275_6 = new Class275();
		Static580.aClass275_6.anInt7968 = Integer.parseInt(this.getParameter("worldid"));
		Static267.aClass275_1 = new Class275();
		Static267.aClass275_1.anInt7968 = Integer.parseInt(this.getParameter("lobbyid"));
		Static267.aClass275_1.aString100 = this.getParameter("lobbyaddress");
		Static516.aClass275_5 = new Class275();
		Static516.aClass275_5.anInt7968 = Integer.parseInt(this.getParameter("demoid"));
		Static516.aClass275_5.aString100 = this.getParameter("demoaddress");
		Static186.aClass123_6 = Static322.method5203(Integer.parseInt(this.getParameter("modewhere")));
		if (Static79.aClass123_16 == Static186.aClass123_6) {
			Static186.aClass123_6 = Static183.aClass123_5;
		} else if (!Static169.method3451(Static186.aClass123_6) && Static230.aClass123_8 != Static186.aClass123_6) {
			Static186.aClass123_6 = Static230.aClass123_8;
		}
		Static212.aClass192_1 = Static337.method5319(Integer.parseInt(this.getParameter("modewhat")));
		if (Static486.aClass192_3 != Static212.aClass192_1 && Static250.aClass192_2 != Static212.aClass192_1 && Static520.aClass192_4 != Static212.aClass192_1) {
			Static212.aClass192_1 = Static520.aClass192_4;
		}
		try {
			Static286.anInt5468 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static286.anInt5468 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static445.aBoolean599 = true;
		} else {
			Static445.aBoolean599 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static214.aBoolean361 = true;
		} else {
			Static214.aBoolean361 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static343.aBoolean495 = true;
		} else {
			Static343.aBoolean495 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static38.aClass162_1 = Static476.aClass162_3;
			} else if (local152.equals("1")) {
				Static38.aClass162_1 = Static303.aClass162_2;
			}
		}
		try {
			Static294.anInt5607 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static294.anInt5607 = 0;
		}
		Static51.aString12 = this.getParameter("quiturl");
		Static166.aString38 = this.getParameter("settings");
		if (Static166.aString38 == null) {
			Static166.aString38 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static264.anInt6184 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static264.anInt6184 = 0;
			}
		}
		Static287.anInt5471 = Integer.parseInt(this.getParameter("colourid"));
		if (Static287.anInt5471 < 0 || Static459.aColorArray3.length <= Static287.anInt5471) {
			Static287.anInt5471 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static12.aBoolean36 = true;
			Static175.aBoolean325 = true;
		}
		@Pc(233) String local233 = this.getParameter("frombilling");
		if (local233 != null && local233.equals("true")) {
			Static95.aBoolean204 = true;
		}
		Static303.aString67 = this.getParameter("sskey");
		if (Static303.aString67 != null && Static303.aString67.length() < 2) {
			Static303.aString67 = null;
		}
		@Pc(257) String local257 = this.getParameter("force64mb");
		if (local257 != null && local257.equals("true")) {
			Static52.aBoolean148 = true;
		}
		@Pc(269) String local269 = this.getParameter("worldflags");
		if (local269 != null) {
			try {
				Static167.anInt3844 = Integer.parseInt(local269);
			} catch (@Pc(276) Exception local276) {
			}
		}
		@Pc(281) String local281 = this.getParameter("userFlow");
		if (local281 != null) {
			try {
				Static347.aLong149 = Long.parseLong(local281);
			} catch (@Pc(288) NumberFormatException local288) {
			}
		}
		Static363.aClient1 = this;
		if (Static38.aClass162_1 == Static476.aClass162_3) {
			Static419.anInt7811 = 765;
			Static79.anInt9888 = 503;
		} else if (Static303.aClass162_2 == Static38.aClass162_1) {
			Static419.anInt7811 = 640;
			Static79.anInt9888 = 480;
		}
		this.method1441(Static212.aClass192_1.method4776() + 32, Static79.anInt9888, Static419.anInt7811, Static38.aClass162_1.aString56);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method1453() {
		if (Static325.anInt6149 == 14) {
			return;
		}
		Static508.anInt8998++;
		if (Static508.anInt8998 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static21.anInt892 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static240.aRandom3.setSeed((long) Static21.anInt892);
		}
		if (Static508.anInt8998 % 50 == 0) {
			Static218.anInt4636 = Static31.anInt1034;
			Static120.anInt2612 = Static406.anInt9845;
			Static31.anInt1034 = 0;
			Static406.anInt9845 = 0;
		}
		this.method1459();
		if (Static218.aClass204_1 != null) {
			Static218.aClass204_1.method4912();
		}
		Static146.method7204();
		Static387.aClass273_1.method6611();
		Static401.aClass4_1.method1217();
		if (Static323.aClass9_8 != null) {
			Static323.aClass9_8.method5438((int) Static174.method3502());
		}
		Static372.method8111();
		Static244.anInt4935 = 0;
		Static549.anInt9381 = 0;
		for (@Pc(91) Interface13 local91 = Static387.aClass273_1.method6610(); local91 != null; local91 = Static387.aClass273_1.method6610()) {
			@Pc(97) int local97 = local91.method7435();
			if (local97 == 2 || local97 == 3) {
				@Pc(109) char local109 = local91.method7432();
				if (Static471.method7251() && (local109 == '`' || local109 == '§')) {
					if (Static440.method6724()) {
						Static331.method8156();
					} else {
						Static468.method7220();
					}
				} else if (Static244.anInt4935 < 128) {
					Static353.anInterface13Array1[Static244.anInt4935] = local91;
					Static244.anInt4935++;
				}
			} else if (local97 == 0 && Static549.anInt9381 < 75) {
				Static492.anInterface13Array2[Static549.anInt9381] = local91;
				Static549.anInt9381++;
			}
		}
		Static136.anInt2884 = 0;
		for (@Pc(176) Class6_Sub39 local176 = Static401.aClass4_1.method1208(); local176 != null; local176 = Static401.aClass4_1.method1208()) {
			@Pc(182) int local182 = local176.method8017();
			if (local182 == -1) {
				Static377.aClass211_71.method5173(local176);
			} else if (local182 == 6) {
				Static136.anInt2884 += local176.method8014();
			} else if (Static147.method2694(local182)) {
				Static512.aClass211_67.method5173(local176);
				if (Static512.aClass211_67.method5174() > 10) {
					Static512.aClass211_67.method5180();
				}
			}
		}
		if (Static440.method6724()) {
			Static188.method3618();
		}
		if (Static298.method4857(Static325.anInt6149)) {
			Static1.method108();
			Static349.method5693();
		} else if (Static108.method2208(Static325.anInt6149)) {
			Static79.method8200();
		}
		if (Static512.method7258(Static325.anInt6149) && !Static108.method2208(Static325.anInt6149)) {
			this.method1458();
			Static183.method3589();
			Static231.method4107();
		} else if (Static140.method2631(Static325.anInt6149) && !Static108.method2208(Static325.anInt6149)) {
			this.method1458();
			Static231.method4107();
		} else if (Static325.anInt6149 == 12) {
			Static231.method4107();
		} else if (Static343.method5603(Static325.anInt6149) && !Static108.method2208(Static325.anInt6149)) {
			Static338.method5326();
		} else if (Static325.anInt6149 == 13) {
			Static231.method4107();
			if (Static443.anInt8147 != -3 && Static443.anInt8147 != 2 && Static443.anInt8147 != 15) {
				Static366.method5845(false);
			}
		}
		Static239.method4218(Static323.aClass9_8);
		Static512.aClass211_67.method5180();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1432() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static191.anInt4147 + "," + Static247.anInt5049 + "," + Static228.anInt4746 + "," + Static44.anInt1275 + "|";
			if (Static350.aClass11_Sub1_Sub1_Sub2_4 != null) {
				local7 = local7 + "2)" + Static493.anInt8836 + "," + (Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] + Static191.anInt4147) + "," + (Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0] + Static247.anInt5049) + "|";
			}
			local7 = local7 + "3)" + Static5.anInt145 + "|4)" + Static104.aClass6_Sub6_Sub1_4.anInt1166 + "|5)" + Static298.method4852() + "|6)" + Static228.anInt4744 + "," + Static180.anInt4051 + "|";
			local7 = local7 + "7)" + Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145) + "|";
			local7 = local7 + "8)" + Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145) + "|";
			local7 = local7 + "9)" + Static104.aClass6_Sub6_Sub1_4.aBoolean129 + "|";
			local7 = local7 + "10)" + Static104.aClass6_Sub6_Sub1_4.aBoolean135 + "|";
			local7 = local7 + "11)" + Static104.aClass6_Sub6_Sub1_4.aBoolean126 + "|";
			local7 = local7 + "12)" + Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145) + "|";
			local7 = local7 + "13)" + Static205.anInt4372 + "|";
			local7 = local7 + "14)" + Static325.anInt6149;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(228) Throwable local228) {
			}
			try {
				if (Static5.anInt145 == 2) {
					@Pc(236) Class local236 = Class.forName("java.lang.ClassLoader");
					@Pc(240) Field local240 = local236.getDeclaredField("nativeLibraries");
					@Pc(243) Class local243 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(253) Method local253 = local243.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local253.invoke(local240, Boolean.TRUE);
					@Pc(276) Vector local276 = (Vector) local240.get(client.class.getClassLoader());
					for (@Pc(278) int local278 = 0; local278 < local276.size(); local278++) {
						try {
							@Pc(284) Object local284 = local276.elementAt(local278);
							@Pc(289) Field local289 = local284.getClass().getDeclaredField("name");
							local253.invoke(local289, Boolean.TRUE);
							try {
								@Pc(304) String local304 = (String) local289.get(local284);
								if (local304 != null && local304.indexOf("sw3d.dll") != -1) {
									@Pc(316) Field local316 = local284.getClass().getDeclaredField("handle");
									local253.invoke(local316, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local316.getLong(local284));
									local253.invoke(local316, Boolean.FALSE);
								}
							} catch (@Pc(352) Throwable local352) {
							}
							local253.invoke(local289, Boolean.FALSE);
						} catch (@Pc(364) Throwable local364) {
						}
					}
				}
			} catch (@Pc(372) Throwable local372) {
			}
			local7 = local7 + "]";
		} catch (@Pc(383) Throwable local383) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1430() {
		if (Static321.aBoolean451) {
			Static277.method4599();
		}
		if (Static323.aClass9_8 != null) {
			Static323.aClass9_8.method5390();
		}
		if (Static345.aFrame2 != null) {
			Static529.method7714(Static345.aFrame2, Static414.aClass246_5);
			Static345.aFrame2 = null;
		}
		if (Static52.aClass64_1 != null) {
			Static52.aClass64_1.method1812();
			Static52.aClass64_1 = null;
		}
		Static185.method3599();
		Static352.aClass228_3.method5718();
		Static537.aClass281_3.method7111();
		if (Static98.aClass236_1 != null) {
			Static98.aClass236_1.method5847();
			Static98.aClass236_1 = null;
		}
		try {
			Static473.aClass318_5.method7601();
			for (@Pc(53) int local53 = 0; local53 < 34; local53++) {
				Static554.aClass318Array1[local53].method7601();
			}
			Static463.aClass318_4.method7601();
			Static367.aClass318_1.method7601();
		} catch (@Pc(74) IOException local74) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1433() {
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1458() {
		@Pc(29) int local29;
		if (Static325.anInt6149 == 7 && Static558.anInt9502 == 0) {
			if (Static291.anInt5565 > 1) {
				Static291.anInt5565--;
				Static409.anInt7646 = Static32.anInt1035;
			}
			if (!Static218.aBoolean366) {
				Static463.method7155();
			}
			for (local29 = 0; local29 < 100 && Static365.method5841(); local29++) {
			}
		}
		Static388.anInt7269++;
		Static178.method3534(null, -1, -1);
		Static7.method509(-1, null, -1);
		Static252.method4422();
		Static32.anInt1035++;
		for (local29 = 0; local29 < Static452.anInt8286; local29++) {
			@Pc(71) Class11_Sub1_Sub1_Sub1 local71 = Static9.aClass6_Sub33Array1[local29].aClass11_Sub1_Sub1_Sub1_2;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass222_1.aByte62;
				if ((local77 & 0x1) != 0) {
					@Pc(85) int local85 = local71.method6212();
					@Pc(109) int local109;
					if ((local77 & 0x2) != 0 && local71.anInt7432 == 0 && Math.random() * 1000.0D < 10.0D) {
						local109 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(117) int local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local109 != 0 || local117 != 0) {
							@Pc(132) int local132 = local71.anIntArray526[0] + local109;
							if (local132 < 0) {
								local132 = 0;
							} else if (Static228.anInt4746 - local85 - 1 < local132) {
								local132 = Static228.anInt4746 - local85 - 1;
							}
							@Pc(167) int local167 = local117 + local71.anIntArray527[0];
							if (local167 < 0) {
								local167 = 0;
							} else if (local167 > Static44.anInt1275 - local85 - 1) {
								local167 = Static44.anInt1275 - local85 - 1;
							}
							@Pc(216) int local216 = Static150.method6218(local85, Static225.anIntArray303, local167, -1, Static55.aClass194Array1[local71.aByte77], 0, local85, true, local132, Static55.anIntArray97, 0, local85, local71.anIntArray527[0], local71.anIntArray526[0]);
							if (local216 > 0) {
								if (local216 > 9) {
									local216 = 9;
								}
								for (@Pc(225) int local225 = 0; local225 < local216; local225++) {
									local71.anIntArray526[local225] = Static225.anIntArray303[local216 - local225 - 1];
									local71.anIntArray527[local225] = Static55.anIntArray97[local216 - local225 - 1];
									local71.aByteArray84[local225] = 1;
								}
								local71.anInt7432 = local216;
							}
						}
					}
					Static85.method1892(local71, true);
					local109 = Static401.method6296(local71);
					Static247.method4362(local71, Static566.anInt9589, local109, Static415.anInt7773);
					Static128.method2505(local71);
				}
			}
		}
		if (Static558.anInt9502 == 0 && Static159.anInt3401 == 0) {
			if (Static84.anInt1994 == 2) {
				Static294.method4817();
			} else {
				Static369.method5895();
			}
			if (Static86.anInt2132 >> 9 < 14 || Static228.anInt4746 - 14 <= Static86.anInt2132 >> 9 || Static390.anInt7318 >> 9 < 14 || Static44.anInt1275 - 14 <= Static390.anInt7318 >> 9) {
				Static109.method2240();
			}
		}
		while (true) {
			@Pc(342) Class6_Sub38 local342;
			@Pc(347) Class93 local347;
			@Pc(358) Class93 local358;
			do {
				local342 = (Class6_Sub38) Static272.aClass211_36.method5180();
				if (local342 == null) {
					while (true) {
						do {
							local342 = (Class6_Sub38) Static46.aClass211_15.method5180();
							if (local342 == null) {
								while (true) {
									do {
										local342 = (Class6_Sub38) Static226.aClass211_30.method5180();
										if (local342 == null) {
											if (Static122.aClass93_7 != null) {
												Static167.method3390();
											}
											if (Static508.anInt8998 % 1500 == 0) {
												Static152.method2947();
											}
											if (Static325.anInt6149 == 7 && Static558.anInt9502 == 0) {
												Static388.method6099();
											}
											Static547.method7830();
											if (Static321.aBoolean451 && Static174.method3502() - 60000L > Static110.aLong56) {
												Static277.method4599();
											}
											for (@Pc(515) Class5_Sub1_Sub2 local515 = (Class5_Sub1_Sub2) Static188.aClass267_3.method6544(); local515 != null; local515 = (Class5_Sub1_Sub2) Static188.aClass267_3.method6543()) {
												if ((long) local515.anInt4745 < Static174.method3502() / 1000L - 5L) {
													if (local515.aShort43 > 0) {
														Static277.method4595("", 5, "", "", 0, local515.aString53 + Static222.aClass152_64.method4002(Static286.anInt5468));
													}
													if (local515.aShort43 == 0) {
														Static277.method4595("", 5, "", "", 0, local515.aString53 + Static222.aClass152_65.method4002(Static286.anInt5468));
													}
													local515.method7282();
												}
											}
											if (Static325.anInt6149 == 7 && Static558.anInt9502 == 0) {
												if (Static52.aClass64_1 == null) {
													Static366.method5845(false);
													return;
												}
												Static42.anInt1241++;
												if (Static42.anInt1241 > 50) {
													Static298.method4854(Static84.aClass181_21);
												}
												try {
													if (Static52.aClass64_1 != null && Static547.aClass6_Sub26_Sub2_2.anInt5769 > 0) {
														Static31.anInt1034 += Static547.aClass6_Sub26_Sub2_2.anInt5769;
														Static52.aClass64_1.method1819(Static547.aClass6_Sub26_Sub2_2.anInt5769, Static547.aClass6_Sub26_Sub2_2.aByteArray65);
														Static42.anInt1241 = 0;
														Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
														return;
													}
												} catch (@Pc(638) IOException local638) {
													Static366.method5845(false);
													return;
												}
											}
											return;
										}
										local347 = local342.aClass93_14;
										if (local347.anInt2806 < 0) {
											break;
										}
										local358 = Static223.method4011(local347.anInt2820);
									} while (local358 == null || local358.aClass93Array4 == null || local358.aClass93Array4.length <= local347.anInt2806 || local347 != local358.aClass93Array4[local347.anInt2806]);
									Static89.method1979(local342);
								}
							}
							local347 = local342.aClass93_14;
							if (local347.anInt2806 < 0) {
								break;
							}
							local358 = Static223.method4011(local347.anInt2820);
						} while (local358 == null || local358.aClass93Array4 == null || local358.aClass93Array4.length <= local347.anInt2806 || local358.aClass93Array4[local347.anInt2806] != local347);
						Static89.method1979(local342);
					}
				}
				local347 = local342.aClass93_14;
				if (local347.anInt2806 < 0) {
					break;
				}
				local358 = Static223.method4011(local347.anInt2820);
			} while (local358 == null || local358.aClass93Array4 == null || local347.anInt2806 >= local358.aClass93Array4.length || local358.aClass93Array4[local347.anInt2806] != local347);
			Static89.method1979(local342);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1459() {
		@Pc(11) boolean local11 = Static352.aClass228_3.method5716();
		if (!local11) {
			this.method1461();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1461() {
		if (Static544.anInt9332 < Static352.aClass228_3.anInt6789) {
			Static293.aClass275_2.method6665();
			Static12.anInt559 = (Static352.aClass228_3.anInt6789 - 1) * 50 * 5;
			if (Static12.anInt559 > 3000) {
				Static12.anInt559 = 3000;
			}
			if (Static352.aClass228_3.anInt6789 >= 2 && Static352.aClass228_3.anInt6790 == 6) {
				this.method1437("js5connect_outofdate");
				Static325.anInt6149 = 14;
				return;
			}
			if (Static352.aClass228_3.anInt6789 >= 4 && Static352.aClass228_3.anInt6790 == -1) {
				this.method1437("js5crc");
				Static325.anInt6149 = 14;
				return;
			}
			if (Static352.aClass228_3.anInt6789 >= 4 && Static298.method4857(Static325.anInt6149)) {
				if (Static352.aClass228_3.anInt6790 == 7 || Static352.aClass228_3.anInt6790 == 9) {
					this.method1437("js5connect_full");
				} else if (Static352.aClass228_3.anInt6790 <= 0) {
					this.method1437("js5io");
				} else {
					this.method1437("js5connect");
				}
				Static325.anInt6149 = 14;
				return;
			}
		}
		Static544.anInt9332 = Static352.aClass228_3.anInt6789;
		if (Static12.anInt559 > 0) {
			Static12.anInt559--;
			return;
		}
		try {
			if (Static323.anInt6115 == 0) {
				Static72.aClass280_1 = Static293.aClass275_2.method6662(Static414.aClass246_5);
				Static323.anInt6115++;
			}
			if (Static323.anInt6115 == 1) {
				if (Static72.aClass280_1.anInt8467 == 2) {
					this.method1452(1000);
					return;
				}
				if (Static72.aClass280_1.anInt8467 == 1) {
					Static323.anInt6115++;
				}
			}
			if (Static323.anInt6115 == 2) {
				Static139.aClass310_1 = new Class310((Socket) Static72.aClass280_1.anObject16, Static414.aClass246_5);
				@Pc(176) Class6_Sub26 local176 = new Class6_Sub26(5);
				local176.method4950(Static562.aClass219_2.anInt6222, -81849);
				local176.method4979(612);
				Static139.aClass310_1.method7519(local176.aByteArray65, 5);
				Static323.anInt6115++;
				Static452.aLong201 = Static174.method3502();
			}
			if (Static323.anInt6115 == 3) {
				if (Static298.method4857(Static325.anInt6149) || Static139.aClass310_1.method7517() > 0) {
					@Pc(218) int local218 = Static139.aClass310_1.method7516();
					if (local218 != 0) {
						this.method1452(local218);
						return;
					}
					Static323.anInt6115++;
				} else if (Static174.method3502() - Static452.aLong201 > 30000L) {
					this.method1452(1001);
					return;
				}
			}
			if (Static323.anInt6115 == 4) {
				@Pc(267) boolean local267 = Static298.method4857(Static325.anInt6149) || Static512.method7258(Static325.anInt6149) || Static140.method2631(Static325.anInt6149);
				Static352.aClass228_3.method5721(Static139.aClass310_1, !local267);
				Static323.anInt6115 = 0;
				Static72.aClass280_1 = null;
				Static139.aClass310_1 = null;
			}
		} catch (@Pc(284) IOException local284) {
			this.method1452(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1463() {
		if (Static325.anInt6149 == 14) {
			return;
		}
		@Pc(17) long local17 = Static557.method7936() / 1000000L - Static239.aLong103;
		Static239.aLong103 = Static557.method7936() / 1000000L;
		@Pc(31) boolean local31 = Static98.method2096();
		if (local31 && Static439.aBoolean592 && Static581.aClass196_2 != null) {
			Static581.aClass196_2.method6412();
		}
		if (Static297.method4046(Static325.anInt6149)) {
			if (Static265.aLong249 != 0L && Static265.aLong249 < Static174.method3502()) {
				Static98.method2097(Static298.method4852(), Static104.aClass6_Sub6_Sub1_4.anInt1160, false, Static104.aClass6_Sub6_Sub1_4.anInt1169);
			} else if (!Static323.aClass9_8.method5422() && Static416.aBoolean570) {
				Static519.method7595();
			}
		}
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (Static345.aFrame2 == null) {
			@Pc(85) Container local85;
			if (Static138.aFrame1 != null) {
				local85 = Static138.aFrame1;
			} else if (Static87.anApplet1 == null) {
				local85 = Static3.anApplet_Sub1_2;
			} else {
				local85 = Static87.anApplet1;
			}
			local99 = local85.getSize().width;
			local103 = local85.getSize().height;
			if (Static138.aFrame1 == local85) {
				@Pc(109) Insets local109 = Static138.aFrame1.getInsets();
				local103 -= local109.top + local109.bottom;
				local99 -= local109.right + local109.left;
			}
			if (local99 != Static171.anInt3912 || local103 != Static345.anInt6685 || Static452.aBoolean606) {
				if (Static323.aClass9_8 == null || Static323.aClass9_8.method5437()) {
					Static15.method654();
				} else {
					Static345.anInt6685 = local103;
					Static171.anInt3912 = local99;
				}
				Static265.aLong249 = Static174.method3502() + 500L;
				Static452.aBoolean606 = false;
			}
		}
		if (Static345.aFrame2 != null && !Static510.aBoolean503 && Static297.method4046(Static325.anInt6149)) {
			Static98.method2097(Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, false, -1);
		}
		@Pc(177) boolean local177 = false;
		if (Static475.aBoolean646) {
			Static475.aBoolean646 = false;
			local177 = true;
		}
		if (local177) {
			Static195.method3709();
		}
		if (Static323.aClass9_8 != null && Static323.aClass9_8.method5422() || Static298.method4852() != 1) {
			Static101.method2148();
		}
		if (Static298.method4857(Static325.anInt6149)) {
			Static316.method5104(local177);
		} else if (Static140.method2632(Static325.anInt6149)) {
			Static266.method4129();
		} else if (Static159.method3023(Static325.anInt6149)) {
			Static266.method4129();
		} else if (Static108.method2208(Static325.anInt6149)) {
			if (Static553.anInt9422 == 1) {
				if (Static454.anInt8396 > Static186.anInt4082) {
					Static186.anInt4082 = Static454.anInt8396;
				}
				local99 = (Static186.anInt4082 - Static454.anInt8396) * 50 / Static186.anInt4082;
				Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468) + "<br>(" + local99 + "%)", true, Static42.aClass73_1);
			} else if (Static553.anInt9422 == 2) {
				if (Static487.anInt8780 < Static483.anInt8763) {
					Static487.anInt8780 = Static483.anInt8763;
				}
				local99 = (Static487.anInt8780 - Static483.anInt8763) * 50 / Static487.anInt8780 + 50;
				Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468) + "<br>(" + local99 + "%)", true, Static42.aClass73_1);
			} else {
				Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468), true, Static42.aClass73_1);
			}
		} else if (Static325.anInt6149 == 10) {
			Static306.method4926(local17);
		} else if (Static325.anInt6149 == 13) {
			Static526.method7658(Static222.aClass152_13.method4002(Static286.anInt5468) + "<br>" + Static222.aClass152_14.method4002(Static286.anInt5468), true, Static42.aClass73_1);
		}
		if (Static337.anInt6225 == 3) {
			for (local99 = 0; local99 < Static190.anInt4121; local99++) {
				@Pc(372) Rectangle local372 = Class93.aRectangleArray2[local99];
				if (Static14.aBooleanArray2[local99]) {
					Static323.aClass9_8.method5409(local372.height, local372.width, -1996553985, local372.y, local372.x);
				} else if (Static3.aBooleanArray22[local99]) {
					Static323.aClass9_8.method5409(local372.height, local372.width, -1996554240, local372.y, local372.x);
				}
			}
		}
		if (Static440.method6724()) {
			Static59.method1320(Static323.aClass9_8);
		}
		if (Static414.aClass246_5.aBoolean535 && Static297.method4046(Static325.anInt6149) && Static337.anInt6225 == 0 && Static298.method4852() == 1 && !local177) {
			local99 = 0;
			for (local103 = 0; local103 < Static190.anInt4121; local103++) {
				if (Static3.aBooleanArray22[local103]) {
					Static3.aBooleanArray22[local103] = false;
					Static47.aRectangleArray1[local99++] = Class93.aRectangleArray2[local103];
				}
			}
			try {
				Static323.aClass9_8.method5448(Static47.aRectangleArray1, local99);
			} catch (@Pc(510) Exception_Sub1 local510) {
			}
		} else if (Static325.anInt6149 != 0) {
			for (local99 = 0; local99 < Static190.anInt4121; local99++) {
				Static3.aBooleanArray22[local99] = false;
			}
			try {
				Static323.aClass9_8.method5411();
			} catch (@Pc(458) Exception_Sub1 local458) {
				Static5.method211(local458, local458.getMessage() + " (Recovered) " + this.method1432());
				Static419.method6517(0);
			}
		}
		if (Static104.aClass6_Sub6_Sub1_4.anInt1165 == 0) {
			Static566.method8004(15L);
		} else if (Static104.aClass6_Sub6_Sub1_4.anInt1165 == 1) {
			Static566.method8004(10L);
		} else if (Static104.aClass6_Sub6_Sub1_4.anInt1165 == 2) {
			Static566.method8004(5L);
		} else if (Static104.aClass6_Sub6_Sub1_4.anInt1165 == 3) {
			Static566.method8004(2L);
		}
		if (Static32.aBoolean84) {
			Static445.method6832();
		}
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean125 && Static325.anInt6149 == 3 && Static6.anInt302 != -1) {
			Static104.aClass6_Sub6_Sub1_4.aBoolean125 = false;
			Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1434() {
		if (Static52.aBoolean148) {
			Static205.anInt4372 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static15.method654();
		Static537.aClass281_3 = new Class281(Static414.aClass246_5);
		Static352.aClass228_3 = new Class228();
		if (Static230.aClass123_8 != Static186.aClass123_6) {
			Static135.aByteArrayArray10 = new byte[50][];
		}
		Static104.aClass6_Sub6_Sub1_4 = new Class6_Sub6_Sub1(Static414.aClass246_5);
		if (Static186.aClass123_6 == Static230.aClass123_8) {
			Static580.aClass275_6.aString100 = this.getCodeBase().getHost();
		} else if (Static169.method3451(Static186.aClass123_6)) {
			Static580.aClass275_6.aString100 = this.getCodeBase().getHost();
			Static580.aClass275_6.anInt7972 = Static580.aClass275_6.anInt7968 + 40000;
			Static267.aClass275_1.anInt7972 = Static267.aClass275_1.anInt7968 + 40000;
			Static516.aClass275_5.anInt7972 = Static516.aClass275_5.anInt7968 + 40000;
			Static580.aClass275_6.anInt7971 = Static580.aClass275_6.anInt7968 + 50000;
			Static267.aClass275_1.anInt7971 = Static267.aClass275_1.anInt7968 + 50000;
			Static516.aClass275_5.anInt7971 = Static516.aClass275_5.anInt7968 + 50000;
		} else if (Static79.aClass123_16 == Static186.aClass123_6) {
			Static580.aClass275_6.aString100 = "127.0.0.1";
			Static267.aClass275_1.aString100 = "127.0.0.1";
			Static516.aClass275_5.aString100 = "127.0.0.1";
			Static580.aClass275_6.anInt7972 = Static580.aClass275_6.anInt7968 + 40000;
			Static267.aClass275_1.anInt7972 = Static267.aClass275_1.anInt7968 + 40000;
			Static516.aClass275_5.anInt7972 = Static516.aClass275_5.anInt7968 + 40000;
			Static580.aClass275_6.anInt7971 = Static580.aClass275_6.anInt7968 + 50000;
			Static267.aClass275_1.anInt7971 = Static267.aClass275_1.anInt7968 + 50000;
			Static516.aClass275_5.anInt7971 = Static516.aClass275_5.anInt7968 + 50000;
		}
		if (Static476.aClass162_3 == Static38.aClass162_1) {
			Static526.aBoolean687 = false;
		}
		Static388.aShortArray83 = Static286.aShortArray62 = Static397.aShortArray94 = Static44.aShortArray19 = new short[256];
		Static293.aClass275_2 = Static580.aClass275_6;
		if (Static38.aClass162_1 == Static303.aClass162_2) {
			Static307.anInt1465 = 16777215;
			Static223.aShortArray58 = Static5.aShortArray9;
			Static340.aShortArrayArray6 = Static46.aShortArrayArray1;
			Static51.anInt1395 = 0;
			Static478.aBoolean650 = true;
			Static548.aShortArrayArray10 = Static153.aShortArrayArray3;
			Static20.aShortArray65 = Static540.aShortArray162;
		} else {
			Static20.aShortArray65 = Static377.aShortArray158;
			Static223.aShortArray58 = Static140.aShortArray33;
			Static340.aShortArrayArray6 = Static348.aShortArrayArray7;
			Static548.aShortArrayArray10 = Static62.aShortArrayArray8;
		}
		Static387.aClass273_1 = Static314.method6697(Static38.aCanvas4);
		Static401.aClass4_1 = Static398.method6270(Static38.aCanvas4);
		try {
			if (Static414.aClass246_5.aClass155_1 != null) {
				Static473.aClass318_5 = new Class318(Static414.aClass246_5.aClass155_1, 5200, 0);
				for (@Pc(222) int local222 = 0; local222 < 34; local222++) {
					Static554.aClass318Array1[local222] = new Class318(Static414.aClass246_5.aClass155Array1[local222], 6000, 0);
				}
				Static463.aClass318_4 = new Class318(Static414.aClass246_5.aClass155_2, 6000, 0);
				Static311.aClass266_5 = new Class266(255, Static473.aClass318_5, Static463.aClass318_4, 500000);
				Static367.aClass318_1 = new Class318(Static414.aClass246_5.aClass155_3, 24, 0);
				Static414.aClass246_5.aClass155Array1 = null;
				Static414.aClass246_5.aClass155_3 = null;
				Static414.aClass246_5.aClass155_1 = null;
				Static414.aClass246_5.aClass155_2 = null;
			}
		} catch (@Pc(280) IOException local280) {
			Static367.aClass318_1 = null;
			Static473.aClass318_5 = null;
			Static311.aClass266_5 = null;
			Static463.aClass318_4 = null;
		}
		if (Static186.aClass123_6 != Static230.aClass123_8) {
			Static266.aBoolean375 = true;
		}
		if (Static476.aClass162_3 == Static38.aClass162_1) {
			Static212.aString51 = Static222.aClass152_1.method4002(Static286.anInt5468);
		} else if (Static38.aClass162_1 == Static303.aClass162_2) {
			Static212.aString51 = Static222.aClass152_2.method4002(Static286.anInt5468);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	@Override
	protected void method1444() {
		if (Static5.anInt145 != 2) {
			this.method1453();
			return;
		}
		try {
			this.method1453();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static5.method211(local19, local19.getMessage() + " (Recovered) " + this.method1432());
			Static419.method6517(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1446() {
		if (Static5.anInt145 != 2) {
			this.method1463();
			return;
		}
		try {
			this.method1463();
		} catch (@Pc(15) ThreadDeath local15) {
			throw local15;
		} catch (@Pc(18) Throwable local18) {
			Static5.method211(local18, local18.getMessage() + " (Recovered) " + this.method1432());
			Static419.method6517(0);
		}
	}
}
