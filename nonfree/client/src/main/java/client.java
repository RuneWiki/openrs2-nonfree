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

	static {
		new Class142("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static345.method4487("Argument count");
			}
			Static208.aClass112_7 = new Class112();
			Static208.aClass112_7.anInt2708 = Integer.parseInt(arg0[0]);
			Static335.aClass112_9 = new Class112();
			Static335.aClass112_9.anInt2708 = Integer.parseInt(arg0[1]);
			Static68.aClass112_3 = new Class112();
			Static68.aClass112_3.anInt2708 = Integer.parseInt(arg0[2]);
			Static254.aClass170_4 = Static293.aClass170_6;
			if (arg0[3].equals("live")) {
				Static110.aClass156_2 = Static405.aClass156_4;
			} else if (arg0[3].equals("rc")) {
				Static110.aClass156_2 = Static144.aClass156_5;
			} else if (arg0[3].equals("wip")) {
				Static110.aClass156_2 = Static50.aClass156_1;
			} else {
				Static345.method4487("modewhat");
			}
			Static63.anInt981 = Static80.method973(arg0[4]);
			if (Static63.anInt981 == -1) {
				if (arg0[4].equals("english")) {
					Static63.anInt981 = 0;
				} else if (arg0[4].equals("german")) {
					Static63.anInt981 = 1;
				} else {
					Static345.method4487("language");
				}
			}
			Static37.aBoolean81 = false;
			Static379.aBoolean16 = false;
			if (arg0[5].equals("game0")) {
				Static94.aClass148_3 = Static59.aClass148_1;
			} else if (arg0[5].equals("game1")) {
				Static94.aClass148_3 = Static93.aClass148_2;
			} else {
				Static345.method4487("game");
			}
			Static175.aBoolean286 = false;
			Static448.aString68 = "";
			Static209.anInt3892 = 0;
			Static381.aBoolean540 = true;
			Static396.aBoolean555 = true;
			Static385.anInt6185 = Static94.aClass148_3.anInt4191;
			Static98.anInt1305 = 0;
			@Pc(152) client local152 = new client();
			Static324.aClient1 = local152;
			local152.method748(Static94.aClass148_3.aString42, Static110.aClass156_2.method3576() + 32);
			Static138.aFrame2.setLocation(40, 40);
		} catch (@Pc(176) Exception local176) {
			Static338.method4409(local176, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method749() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static315.anInt5207 + "," + Static47.anInt676 + "," + Static147.anInt2300 + "," + Static293.anInt4886 + "|";
			if (Static94.aClass11_Sub1_Sub3_Sub2_1 != null) {
				local7 = local7 + "2)" + Static390.anInt6272 + "," + (Static315.anInt5207 + Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0]) + "," + (Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0] + Static47.anInt676) + "|";
			}
			local7 = local7 + "3)" + Static214.anInt3968 + "|4)" + Static126.aClass19_Sub1_1.anInt4218 + "|5)" + Static208.method3017() + "|6)" + Static192.anInt3532 + "," + Static40.anInt597 + "|";
			local7 = local7 + "7)" + Static126.aClass19_Sub1_1.method3339(Static214.anInt3968) + "|";
			local7 = local7 + "8)" + Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) + "|";
			local7 = local7 + "9)" + Static126.aClass19_Sub1_1.aBoolean379 + "|";
			local7 = local7 + "10)" + Static126.aClass19_Sub1_1.aBoolean376 + "|";
			local7 = local7 + "11)" + Static126.aClass19_Sub1_1.aBoolean377 + "|";
			local7 = local7 + "12)" + Static126.aClass19_Sub1_1.method3353(Static214.anInt3968) + "|";
			local7 = local7 + "13)" + Static45.anInt669 + "|";
			local7 = local7 + "14)" + Static135.anInt2114;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			try {
				if (Static214.anInt3968 == 2) {
					@Pc(232) Class local232 = Class.forName("java.lang.ClassLoader");
					@Pc(236) Field local236 = local232.getDeclaredField("nativeLibraries");
					@Pc(239) Class local239 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(249) Method local249 = local239.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local249.invoke(local236, Boolean.TRUE);
					@Pc(272) Vector local272 = (Vector) local236.get(client.class.getClassLoader());
					for (@Pc(274) int local274 = 0; local274 < local272.size(); local274++) {
						try {
							@Pc(280) Object local280 = local272.elementAt(local274);
							@Pc(285) Field local285 = local280.getClass().getDeclaredField("name");
							local249.invoke(local285, Boolean.TRUE);
							try {
								@Pc(300) String local300 = (String) local285.get(local280);
								if (local300 != null && local300.indexOf("sw3d.dll") != -1) {
									@Pc(313) Field local313 = local280.getClass().getDeclaredField("handle");
									local249.invoke(local313, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local313.getLong(local280));
									local249.invoke(local313, Boolean.FALSE);
								}
							} catch (@Pc(349) Throwable local349) {
							}
							local249.invoke(local285, Boolean.FALSE);
						} catch (@Pc(361) Throwable local361) {
						}
					}
				}
			} catch (@Pc(373) Throwable local373) {
			}
			local7 = local7 + "]";
		} catch (@Pc(384) Throwable local384) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
	private void method751(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub19 local14 = new Class1_Sub19(arg0);
		while (true) {
			@Pc(18) int local18;
			@Pc(43) int local43;
			@Pc(38) int local38;
			label45: do {
				while (true) {
					while (true) {
						local18 = local14.method2915();
						if (local18 == 0) {
							return;
						}
						if (local18 == 1) {
							@Pc(107) int[] local107 = Static322.anIntArray390 = new int[6];
							local107[0] = local14.method2896();
							local107[1] = local14.method2896();
							local107[2] = local14.method2896();
							local107[3] = local14.method2896();
							local107[4] = local14.method2896();
							local107[5] = local14.method2896();
						} else {
							if (local18 != 4) {
								continue label45;
							}
							local38 = local14.method2915();
							Static201.anIntArray272 = new int[local38];
							for (local43 = 0; local43 < local38; local43++) {
								Static201.anIntArray272[local43] = local14.method2896();
								if (Static201.anIntArray272[local43] == 65535) {
									Static201.anIntArray272[local43] = -1;
								}
							}
						}
					}
				}
			} while (local18 != 5);
			local38 = local14.method2915();
			Static449.anIntArray523 = new int[local38];
			for (local43 = 0; local43 < local38; local43++) {
				Static449.anIntArray523[local43] = local14.method2896();
				if (Static449.anIntArray523[local43] == 65535) {
					Static449.anIntArray523[local43] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method740() {
		if (Static214.anInt3968 != 2) {
			this.method763();
			return;
		}
		try {
			this.method763();
		} catch (@Pc(21) Throwable local21) {
			Static422.method5393(0);
			Static338.method4409(local21, local21.getMessage() + " (Recovered) " + this.method749());
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method738() {
		@Pc(10) Frame local10 = new Frame("Jagex");
		local10.pack();
		local10.dispose();
		Static211.method4160();
		Static3.aClass145_1 = new Class145(Static259.aClass177_2);
		Static270.aClass269_3 = new Class269();
		if (Static268.aClass170_5 != Static254.aClass170_4) {
			Static98.aByteArrayArray28 = new byte[50][];
		}
		Static126.aClass19_Sub1_1 = new Class19_Sub1(Static259.aClass177_2);
		if (Static254.aClass170_4 == Static268.aClass170_5) {
			Static208.aClass112_7.aString28 = this.getCodeBase().getHost();
		} else if (Static24.method354(Static254.aClass170_4)) {
			Static208.aClass112_7.aString28 = this.getCodeBase().getHost();
			Static208.aClass112_7.anInt2710 = Static208.aClass112_7.anInt2708 + 40000;
			Static335.aClass112_9.anInt2710 = Static335.aClass112_9.anInt2708 + 40000;
			Static208.aClass112_7.anInt2711 = Static208.aClass112_7.anInt2708 + 50000;
			Static68.aClass112_3.anInt2710 = Static68.aClass112_3.anInt2708 + 40000;
			Static335.aClass112_9.anInt2711 = Static335.aClass112_9.anInt2708 + 50000;
			Static68.aClass112_3.anInt2711 = Static68.aClass112_3.anInt2708 + 50000;
		} else if (Static254.aClass170_4 == Static293.aClass170_6) {
			Static208.aClass112_7.aString28 = "127.0.0.1";
			Static335.aClass112_9.aString28 = "127.0.0.1";
			Static208.aClass112_7.anInt2710 = Static208.aClass112_7.anInt2708 + 40000;
			Static68.aClass112_3.aString28 = "127.0.0.1";
			Static335.aClass112_9.anInt2710 = Static335.aClass112_9.anInt2708 + 40000;
			Static208.aClass112_7.anInt2711 = Static208.aClass112_7.anInt2708 + 50000;
			Static68.aClass112_3.anInt2710 = Static68.aClass112_3.anInt2708 + 40000;
			Static335.aClass112_9.anInt2711 = Static335.aClass112_9.anInt2708 + 50000;
			Static68.aClass112_3.anInt2711 = Static68.aClass112_3.anInt2708 + 50000;
		}
		if (Static93.aClass148_2 == Static94.aClass148_3) {
			Static173.aShortArray36 = Static288.aShortArray79;
			Static53.aBoolean106 = true;
			Static11.aShortArray8 = Static199.aShortArray45;
			Static96.aShortArrayArray3 = Static87.aShortArrayArray2;
			Static417.anInt6743 = 16777215;
			Static334.anInt5474 = 0;
			Static440.aShortArrayArray7 = Static147.aShortArrayArray6;
		} else {
			Static96.aShortArrayArray3 = Static13.aShortArrayArray1;
			Static440.aShortArrayArray7 = Static463.aShortArrayArray10;
			Static173.aShortArray36 = Static46.aShortArray82;
			Static11.aShortArray8 = Static15.aShortArray9;
		}
		if (Static94.aClass148_3 == Static59.aClass148_1) {
			Static344.aBoolean511 = false;
		}
		Static440.aClass112_6 = Static208.aClass112_7;
		Static38.aShortArray10 = Static175.aShortArray37 = Static291.aShortArray80 = Static53.aShortArray22 = new short[256];
		Static269.aClass53_1 = Static82.method1003(Static91.aCanvas2);
		Static181.aClass224_1 = Static242.method3486(Static91.aCanvas2);
		Static420.anInt6784 = Static289.anInt4838;
		try {
			if (Static259.aClass177_2.aClass235_2 != null) {
				Static225.aClass115_2 = new Class115(Static259.aClass177_2.aClass235_2, 5200, 0);
				for (@Pc(218) int local218 = 0; local218 < 30; local218++) {
					Static88.aClass115Array1[local218] = new Class115(Static259.aClass177_2.aClass235Array1[local218], 6000, 0);
				}
				Static110.aClass115_1 = new Class115(Static259.aClass177_2.aClass235_4, 6000, 0);
				Static152.aClass271_2 = new Class271(255, Static225.aClass115_2, Static110.aClass115_1, 500000);
				Static256.aClass115_3 = new Class115(Static259.aClass177_2.aClass235_3, 24, 0);
				Static259.aClass177_2.aClass235_2 = null;
				Static259.aClass177_2.aClass235_3 = null;
				Static259.aClass177_2.aClass235_4 = null;
				Static259.aClass177_2.aClass235Array1 = null;
			}
		} catch (@Pc(276) IOException local276) {
			Static256.aClass115_3 = null;
			Static152.aClass271_2 = null;
			Static110.aClass115_1 = null;
			Static225.aClass115_2 = null;
		}
		if (Static268.aClass170_5 != Static254.aClass170_4) {
			Static209.aBoolean360 = true;
		}
		if (Static94.aClass148_3 == Static59.aClass148_1) {
			Static204.aString40 = Static404.aClass142_102.method3118(Static63.anInt981);
		} else if (Static93.aClass148_2 == Static94.aClass148_3) {
			Static204.aString40 = Static374.aClass142_95.method3118(Static63.anInt981);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	@Override
	protected void method741() {
		if (Static57.aBoolean116) {
			Static317.method4196();
		}
		if (Static186.aClass117_3 != null) {
			Static186.aClass117_3.method5701();
		}
		if (Static33.aFrame1 != null) {
			Static98.method1146(Static259.aClass177_2, Static33.aFrame1);
			Static33.aFrame1 = null;
		}
		if (Static337.aClass110_2 != null) {
			Static337.aClass110_2.method3781();
			Static337.aClass110_2 = null;
		}
		Static59.method835();
		Static270.aClass269_3.method5750();
		Static3.aClass145_1.method3218();
		if (Static93.aClass217_1 != null) {
			Static93.aClass217_1.method4580();
			Static93.aClass217_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method755() {
		if (Static270.aClass269_3.anInt7113 > Static237.anInt4277) {
			Static429.anInt6854 = (Static270.aClass269_3.anInt7113 * 50 - 50) * 5;
			Static440.aClass112_6.aBoolean272 = !Static440.aClass112_6.aBoolean272;
			if (Static429.anInt6854 > 3000) {
				Static429.anInt6854 = 3000;
			}
			if (Static270.aClass269_3.anInt7113 >= 2 && Static270.aClass269_3.anInt7112 == 6) {
				this.method744("js5connect_outofdate");
				Static135.anInt2114 = 13;
				return;
			}
			if (Static270.aClass269_3.anInt7113 >= 4 && Static270.aClass269_3.anInt7112 == -1) {
				this.method744("js5crc");
				Static135.anInt2114 = 13;
				return;
			}
			if (Static270.aClass269_3.anInt7113 >= 4 && Static14.method269(Static135.anInt2114)) {
				if (Static270.aClass269_3.anInt7112 == 7 || Static270.aClass269_3.anInt7112 == 9) {
					this.method744("js5connect_full");
				} else if (Static270.aClass269_3.anInt7112 <= 0) {
					this.method744("js5io");
				} else {
					this.method744("js5connect");
				}
				Static135.anInt2114 = 13;
				return;
			}
		}
		Static237.anInt4277 = Static270.aClass269_3.anInt7113;
		if (Static429.anInt6854 > 0) {
			Static429.anInt6854--;
			return;
		}
		try {
			if (Static446.anInt7032 == 0) {
				Static93.aClass253_3 = Static259.aClass177_2.method3841(Static440.aClass112_6.method2164(), Static440.aClass112_6.aString28);
				Static446.anInt7032++;
			}
			if (Static446.anInt7032 == 1) {
				if (Static93.aClass253_3.anInt6669 == 2) {
					this.method756(1000);
					return;
				}
				if (Static93.aClass253_3.anInt6669 == 1) {
					Static446.anInt7032++;
				}
			}
			if (Static446.anInt7032 == 2) {
				Static292.aClass205_1 = new Class205((Socket) Static93.aClass253_3.anObject9, Static259.aClass177_2);
				@Pc(181) Class1_Sub19 local181 = new Class1_Sub19(5);
				local181.method2934(Static67.aClass210_62.anInt5528);
				local181.method2912(601);
				Static292.aClass205_1.method4384(5, local181.aByteArray38);
				Static446.anInt7032++;
				Static188.aLong113 = Static183.method2674();
			}
			if (Static446.anInt7032 == 3) {
				if (Static14.method269(Static135.anInt2114) || Static292.aClass205_1.method4382() > 0) {
					@Pc(237) int local237 = Static292.aClass205_1.method4386();
					if (local237 != 0) {
						this.method756(local237);
						return;
					}
					Static446.anInt7032++;
				} else if (Static183.method2674() - Static188.aLong113 > 30000L) {
					this.method756(1001);
					return;
				}
			}
			if (Static446.anInt7032 == 4) {
				@Pc(268) boolean local268 = Static135.anInt2114 == 1 || Static356.method4681(Static135.anInt2114) || Static309.method4100(Static135.anInt2114);
				Static270.aClass269_3.method5762(Static292.aClass205_1, !local268);
				Static93.aClass253_3 = null;
				Static292.aClass205_1 = null;
				Static446.anInt7032 = 0;
			}
		} catch (@Pc(285) IOException local285) {
			this.method756(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method756(@OriginalArg(0) int arg0) {
		Static93.aClass253_3 = null;
		Static446.anInt7032 = 0;
		Static270.aClass269_3.anInt7112 = arg0;
		Static270.aClass269_3.anInt7113++;
		Static292.aClass205_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method733() {
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method747() {
		if (Static214.anInt3968 != 2) {
			this.method761();
			return;
		}
		try {
			this.method761();
		} catch (@Pc(19) Throwable local19) {
			Static422.method5393(0);
			Static338.method4409(local19, local19.getMessage() + " (Recovered) " + this.method749());
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method758() {
		@Pc(7) boolean local7 = Static270.aClass269_3.method5758();
		if (!local7) {
			this.method755();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method759() {
		@Pc(10) int local10;
		if (!Static126.aClass19_Sub1_1.aBoolean375) {
			for (local10 = 0; local10 < Static141.anInt6097; local10++) {
				if (Static340.anInterface13Array1[local10].method4458() == 's' || Static340.anInterface13Array1[local10].method4458() == 'S') {
					Static126.aClass19_Sub1_1.aBoolean375 = true;
					break;
				}
			}
		}
		@Pc(52) int local52;
		if (Static139.anInt2153 == 0) {
			@Pc(43) Runtime local43 = Runtime.getRuntime();
			local52 = (int) ((local43.totalMemory() - local43.freeMemory()) / 1024L);
			@Pc(55) long local55 = Static183.method2674();
			if (Static147.aLong78 == 0L) {
				Static147.aLong78 = local55;
			}
			if (local52 > 16384 && local55 - Static147.aLong78 < 5000L) {
				if (local55 - Static110.aLong55 > 1000L) {
					System.gc();
					Static110.aLong55 = local55;
				}
				Static148.aString20 = Static68.aClass142_15.method3118(Static63.anInt981);
				Static2.anInt33 = 5;
			} else {
				Static148.aString20 = Static88.aClass142_22.method3118(Static63.anInt981);
				Static139.anInt2153 = 10;
				Static2.anInt33 = 5;
			}
		} else if (Static139.anInt2153 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static385.aClass158Array1[local10] = Static306.method4067(Static147.anInt2300, Static293.anInt4886);
			}
			Static148.aString20 = Static172.aClass142_39.method3118(Static63.anInt981);
			Static2.anInt33 = 10;
			Static139.anInt2153 = 20;
		} else if (Static139.anInt2153 == 20) {
			if (Static76.aClass157_1 == null) {
				Static76.aClass157_1 = new Class157(Static270.aClass269_3, Static3.aClass145_1);
			}
			if (Static76.aClass157_1.method3607()) {
				Static408.aClass185_75 = Static178.method2587(true, 0, false);
				Static367.aClass185_96 = Static178.method2587(true, 1, false);
				Static98.aClass185_30 = Static178.method2587(true, 2, false);
				Static456.aClass185_58 = Static178.method2587(true, 3, false);
				Static84.aClass185_26 = Static178.method2587(true, 4, false);
				Static210.aClass185_119 = Static178.method2587(true, 5, true);
				Static355.aClass185_89 = Static178.method2587(false, 6, true);
				Static412.aClass185_111 = Static178.method2587(true, 7, false);
				Static178.aClass185_49 = Static178.method2587(true, 8, false);
				Static222.aClass185_62 = Static178.method2587(true, 9, false);
				Static434.aClass185_115 = Static178.method2587(true, 10, false);
				Static153.aClass185_42 = Static178.method2587(true, 11, false);
				Static377.aClass185_99 = Static178.method2587(true, 12, false);
				Static386.aClass185_118 = Static178.method2587(true, 13, false);
				Static429.aClass185_114 = Static178.method2587(false, 14, false);
				Static317.aClass185_84 = Static178.method2587(true, 15, false);
				Static92.aClass185_65 = Static178.method2587(true, 16, false);
				Static192.aClass185_57 = Static178.method2587(true, 17, false);
				Static417.aClass185_112 = Static178.method2587(true, 18, false);
				Static350.aClass185_88 = Static178.method2587(true, 19, false);
				Static313.aClass185_81 = Static178.method2587(true, 20, false);
				Static267.aClass185_72 = Static178.method2587(true, 21, false);
				Static44.aClass185_9 = Static178.method2587(true, 22, false);
				Static465.aClass185_117 = Static178.method2587(true, 23, true);
				Static407.aClass185_107 = Static178.method2587(true, 24, false);
				Static208.aClass185_60 = Static178.method2587(true, 25, false);
				Static246.aClass185_68 = Static178.method2587(true, 26, true);
				Static367.aClass185_95 = Static178.method2587(true, 27, false);
				Static98.aClass185_31 = Static178.method2587(true, 28, true);
				Static389.aClass185_102 = Static178.method2587(true, 29, false);
				Static148.aString20 = Static196.aClass142_46.method3118(Static63.anInt981);
				Static2.anInt33 = 15;
				Static139.anInt2153 = 30;
			} else {
				Static148.aString20 = Static66.aClass142_14.method3118(Static63.anInt981);
				Static2.anInt33 = 12;
			}
		} else if (Static139.anInt2153 == 30) {
			local10 = 0;
			for (local52 = 0; local52 < 30; local52++) {
				local10 += Static109.aClass82_Sub1Array1[local52].method2274() * Static354.anIntArray421[local52] / 100;
			}
			if (local10 == 100) {
				Static148.aString20 = Static303.aClass142_77.method3118(Static63.anInt981);
				Static2.anInt33 = 20;
				Static329.method4323(Static178.aClass185_49);
				Static425.method5420(Static178.aClass185_49);
				Static139.anInt2153 = 40;
			} else {
				if (local10 != 0) {
					Static148.aString20 = Static415.aClass142_106.method3118(Static63.anInt981) + local10 + "%";
				}
				Static2.anInt33 = 20;
			}
		} else if (Static139.anInt2153 == 40) {
			if (Static98.aClass185_31.method4016()) {
				this.method751(Static98.aClass185_31.method3997(1));
				Static148.aString20 = Static465.aClass142_116.method3118(Static63.anInt981);
				Static2.anInt33 = 25;
				Static139.anInt2153 = 50;
			} else {
				Static148.aString20 = Static363.aClass142_92.method3118(Static63.anInt981) + Static98.aClass185_31.method4020() + "%";
				Static2.anInt33 = 25;
			}
		} else if (Static139.anInt2153 == 50) {
			Static335.method4397();
			Static148.aString20 = Static379.aClass142_3.method3118(Static63.anInt981);
			Static2.anInt33 = 30;
			Static139.anInt2153 = 60;
		} else if (Static139.anInt2153 == 60) {
			local10 = Static169.method4135(Static386.aClass185_118, Static178.aClass185_49);
			local52 = Static368.method5621();
			if (local10 < local52) {
				Static148.aString20 = Static422.aClass142_109.method3118(Static63.anInt981) + local10 * 100 / local52 + "%";
				Static2.anInt33 = 35;
			} else {
				Static148.aString20 = Static200.aClass142_48.method3118(Static63.anInt981);
				Static139.anInt2153 = 70;
				Static2.anInt33 = 35;
			}
		} else if (Static139.anInt2153 == 70) {
			local10 = Static70.method3914(Static178.aClass185_49);
			local52 = Static126.method1558();
			if (local52 > local10) {
				Static148.aString20 = Static270.aClass142_34.method3118(Static63.anInt981) + local10 * 100 / local52 + "%";
				Static2.anInt33 = 40;
			} else {
				Static148.aString20 = Static436.aClass142_113.method3118(Static63.anInt981);
				Static139.anInt2153 = 80;
				Static2.anInt33 = 40;
			}
		} else if (Static139.anInt2153 == 80) {
			if (Static246.aClass185_68.method4016()) {
				Static302.anInterface4_7 = new Class238(Static246.aClass185_68, Static222.aClass185_62, Static178.aClass185_49);
				Static148.aString20 = Static266.aClass142_66.method3118(Static63.anInt981);
				Static139.anInt2153 = 90;
				Static2.anInt33 = 45;
			} else {
				Static148.aString20 = Static367.aClass142_94.method3118(Static63.anInt981) + Static246.aClass185_68.method4020() + "%";
				Static2.anInt33 = 45;
			}
		} else if (Static139.anInt2153 == 90) {
			Static148.aString20 = Static397.aClass142_99.method3118(Static63.anInt981);
			Static2.anInt33 = 50;
			Static139.anInt2153 = 95;
		} else if (Static139.anInt2153 == 95) {
			if (Static126.aClass19_Sub1_1.aBoolean375) {
				Static126.aClass19_Sub1_1.anInt4233 = 0;
				Static126.aClass19_Sub1_1.anInt4220 = 1;
				Static126.aClass19_Sub1_1.anInt4218 = 0;
				Static126.aClass19_Sub1_1.anInt4229 = 0;
				Static126.aClass19_Sub1_1.anInt4219 = 0;
			}
			Static126.aClass19_Sub1_1.aBoolean375 = true;
			Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
			Static279.method3752(Static126.aClass19_Sub1_1.anInt4219, false);
			Static148.aString20 = Static263.aClass142_65.method3118(Static63.anInt981);
			Static139.anInt2153 = 100;
			Static2.anInt33 = 55;
		} else if (Static139.anInt2153 == 100) {
			Static8.method133(Static178.aClass185_49, Static186.aClass117_3, Static386.aClass185_118);
			Static148.aString20 = Static213.aClass142_51.method3118(Static63.anInt981);
			Static2.anInt33 = 60;
			Static154.method1923(1);
			Static139.anInt2153 = 110;
		} else if (Static139.anInt2153 == 110) {
			Static98.aClass185_30.method4016();
			local10 = Static98.aClass185_30.method4020();
			Static92.aClass185_65.method4016();
			local10 += Static92.aClass185_65.method4020();
			Static192.aClass185_57.method4016();
			local10 += Static192.aClass185_57.method4020();
			Static417.aClass185_112.method4016();
			local10 += Static417.aClass185_112.method4020();
			Static350.aClass185_88.method4016();
			local10 += Static350.aClass185_88.method4020();
			Static313.aClass185_81.method4016();
			local10 += Static313.aClass185_81.method4020();
			Static267.aClass185_72.method4016();
			local10 += Static267.aClass185_72.method4020();
			Static44.aClass185_9.method4016();
			local10 += Static44.aClass185_9.method4020();
			Static407.aClass185_107.method4016();
			local10 += Static407.aClass185_107.method4020();
			Static208.aClass185_60.method4016();
			local10 += Static208.aClass185_60.method4020();
			Static367.aClass185_95.method4016();
			local10 += Static367.aClass185_95.method4020();
			Static389.aClass185_102.method4016();
			local10 += Static389.aClass185_102.method4020();
			if (local10 < 1200) {
				Static148.aString20 = Static353.aClass142_87.method3118(Static63.anInt981) + local10 / 12 + "%";
				Static2.anInt33 = 65;
			} else {
				Static256.aClass136_1 = new Class136(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static106.aClass199_131 = new Class199(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static285.aClass3_2 = new Class3(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30, Static178.aClass185_49);
				Static118.aClass273_1 = new Class273(Static94.aClass148_3, Static63.anInt981, Static192.aClass185_57);
				Static31.aClass204_1 = new Class204(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static425.aClass60_5 = new Class60(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static241.aClass97_1 = new Class97(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30, Static412.aClass185_111);
				Static130.aClass74_1 = new Class74(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static331.aClass42_1 = new Class42(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static86.aClass248_7 = new Class248(Static94.aClass148_3, Static63.anInt981, true, Static92.aClass185_65, Static412.aClass185_111);
				Static205.aClass36_2 = new Class36(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30, Static178.aClass185_49);
				Static60.aClass223_1 = new Class223(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30, Static178.aClass185_49);
				Static428.aClass196_1 = new Class196(Static94.aClass148_3, Static63.anInt981, true, Static417.aClass185_112, Static412.aClass185_111);
				Static285.aClass226_2 = new Class226(Static94.aClass148_3, Static63.anInt981, true, Static256.aClass136_1, Static350.aClass185_88, Static412.aClass185_111);
				Static111.aClass26_1 = new Class26(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static402.aClass37_2 = new Class37(Static94.aClass148_3, Static63.anInt981, Static313.aClass185_81, Static408.aClass185_75, Static367.aClass185_96);
				Static202.aClass237_27 = new Class237(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static429.aClass126_1 = new Class126(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static46.aClass123_5 = new Class123(Static94.aClass148_3, Static63.anInt981, Static267.aClass185_72, Static412.aClass185_111);
				Static257.aClass153_1 = new Class153(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static86.aClass186_4 = new Class186(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static311.aClass125_1 = new Class125(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static197.aClass76_1 = new Class76(Static94.aClass148_3, Static63.anInt981, Static44.aClass185_9);
				Static186.aClass233_1 = new Class233(Static94.aClass148_3, Static63.anInt981, Static98.aClass185_30);
				Static17.method3340(Static456.aClass185_58, Static412.aClass185_111, Static386.aClass185_118, Static178.aClass185_49);
				Static373.method5943(Static389.aClass185_102);
				Static335.aClass89_1 = new Class89(Static63.anInt981, Static407.aClass185_107, Static208.aClass185_60);
				Static187.aClass13_2 = new Class13(Static63.anInt981, Static407.aClass185_107, Static208.aClass185_60, new Class21());
				Static148.aString20 = Static85.aClass142_98.method3118(Static63.anInt981);
				Static2.anInt33 = 65;
				Static253.method3570();
				Static86.aClass248_7.method5244(!Static126.aClass19_Sub1_1.method3353(Static214.anInt3968));
				Static32.aClass4_1 = new Class4();
				Static443.method5528();
				Static192.method2775(Static367.aClass185_95);
				Static369.method4809(Static302.anInterface4_7, Static412.aClass185_111);
				Static139.anInt2153 = 120;
			}
		} else if (Static139.anInt2153 == 120) {
			local10 = Static278.method4438(Static178.aClass185_49);
			local52 = Static222.method3203();
			if (local52 > local10) {
				Static148.aString20 = Static286.aClass142_72.method3118(Static63.anInt981) + local10 * 100 / local52 + "%";
				Static2.anInt33 = 70;
			} else {
				Static27.method392(Static178.aClass185_49, Static186.aClass117_3);
				Static379.method132(Static251.aClass85Array7);
				Static148.aString20 = Static77.aClass142_17.method3118(Static63.anInt981);
				Static2.anInt33 = 70;
				Static139.anInt2153 = 130;
			}
		} else if (Static139.anInt2153 == 130) {
			if (Static434.aClass185_115.method4003("huffman", "")) {
				@Pc(1226) Class189 local1226 = new Class189(Static434.aClass185_115.method3994("huffman", ""));
				Static176.method2564(local1226);
				Static148.aString20 = Static417.aClass142_108.method3118(Static63.anInt981);
				Static139.anInt2153 = 140;
				Static2.anInt33 = 75;
			} else {
				Static148.aString20 = Static428.aClass142_110.method3118(Static63.anInt981) + "0%";
				Static2.anInt33 = 75;
			}
		} else if (Static139.anInt2153 == 140) {
			if (Static456.aClass185_58.method4016()) {
				Static148.aString20 = Static163.aClass142_89.method3118(Static63.anInt981);
				Static139.anInt2153 = 150;
				Static2.anInt33 = 80;
			} else {
				Static148.aString20 = Static298.aClass142_76.method3118(Static63.anInt981) + Static456.aClass185_58.method4020() + "%";
				Static2.anInt33 = 80;
			}
		} else if (Static139.anInt2153 == 150) {
			if (Static377.aClass185_99.method4016()) {
				Static148.aString20 = Static92.aClass142_56.method3118(Static63.anInt981);
				Static139.anInt2153 = 160;
				Static2.anInt33 = 82;
			} else {
				Static148.aString20 = Static342.aClass142_84.method3118(Static63.anInt981) + Static377.aClass185_99.method4020() + "%";
				Static2.anInt33 = 82;
			}
		} else if (Static139.anInt2153 == 160) {
			if (Static386.aClass185_118.method4016()) {
				Static148.aString20 = Static434.aClass142_112.method3118(Static63.anInt981);
				Static2.anInt33 = 85;
				Static139.anInt2153 = 170;
			} else {
				Static148.aString20 = Static434.aClass142_112.method3118(Static63.anInt981) + Static386.aClass185_118.method4020() + "%";
				Static2.anInt33 = 85;
			}
		} else if (Static139.anInt2153 == 170) {
			if (Static465.aClass185_117.method4019("details")) {
				Static430.method3277(Static465.aClass185_117, Static31.aClass204_1, Static425.aClass60_5, Static86.aClass248_7, Static205.aClass36_2, Static60.aClass223_1, Static32.aClass4_1);
				Static148.aString20 = Static350.aClass142_86.method3118(Static63.anInt981);
				Static139.anInt2153 = 190;
				Static2.anInt33 = 89;
			} else {
				Static148.aString20 = Static256.aClass142_64.method3118(Static63.anInt981) + Static465.aClass185_117.method4026("details") + "%";
				Static2.anInt33 = 87;
			}
		} else if (Static139.anInt2153 == 190) {
			Static136.anIntArray184 = new int[Static311.aClass125_1.anInt3423];
			Static173.aBooleanArray67 = new boolean[Static311.aClass125_1.anInt3423];
			Static244.aStringArray3 = new String[Static86.aClass186_4.anInt5063];
			for (local10 = 0; local10 < Static311.aClass125_1.anInt3423; local10++) {
				if (Static311.aClass125_1.method2687(local10).anInt4884 == 0) {
					Static173.aBooleanArray67[local10] = true;
					Static12.anInt199++;
				}
				Static136.anIntArray184[local10] = -1;
			}
			Static303.method4046();
			Static264.anInt4592 = Static456.aClass185_58.method4005("loginscreen");
			Static249.anInt4441 = Static456.aClass185_58.method4005("lobbyscreen");
			Static210.aClass185_119.method3996(false);
			Static355.aClass185_89.method3996(true);
			Static178.aClass185_49.method3996(true);
			Static386.aClass185_118.method3996(true);
			Static434.aClass185_115.method3996(true);
			Static456.aClass185_58.method3996(true);
			Static147.aBoolean240 = true;
			Static98.aClass185_30.anInt5029 = 2;
			Static192.aClass185_57.anInt5029 = 2;
			Static92.aClass185_65.anInt5029 = 2;
			Static417.aClass185_112.anInt5029 = 2;
			Static350.aClass185_88.anInt5029 = 2;
			Static313.aClass185_81.anInt5029 = 2;
			Static267.aClass185_72.anInt5029 = 2;
			Static461.method5951(-1, false, -1, Static126.aClass19_Sub1_1.anInt4220);
			Static148.aString20 = Static92.aClass142_55.method3118(Static63.anInt981);
			Static139.anInt2153 = 200;
			Static2.anInt33 = 95;
		} else if (Static139.anInt2153 == 200) {
			Static154.method1923(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method761() {
		if (Static135.anInt2114 == 13) {
			return;
		}
		Static98.anInt1304++;
		if (Static98.anInt1304 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static42.anInt630 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static21.aRandom1.setSeed((long) Static42.anInt630);
		}
		if (Static98.anInt1304 % 50 == 0) {
			Static316.anInt5219 = Static238.anInt4297;
			Static15.anInt252 = Static201.anInt3757;
			Static238.anInt4297 = 0;
			Static201.anInt3757 = 0;
		}
		this.method758();
		if (Static76.aClass157_1 != null) {
			Static76.aClass157_1.method3601();
		}
		Static113.method1404();
		Static269.aClass53_1.method3909();
		Static181.aClass224_1.method5619();
		if (Static186.aClass117_3 != null) {
			Static186.aClass117_3.method5670((int) Static183.method2674());
		}
		Static232.method3313();
		Static141.anInt6097 = 0;
		Static407.anInt6525 = 0;
		for (@Pc(99) Interface13 local99 = Static269.aClass53_1.method3908(); local99 != null; local99 = Static269.aClass53_1.method3908()) {
			@Pc(105) int local105 = local99.method4457();
			if (local105 == 2 || local105 == 3) {
				@Pc(117) char local117 = local99.method4458();
				if (Static255.method3573() && (local117 == '`' || local117 == '§')) {
					if (Static442.method5521()) {
						Static78.method3886();
					} else {
						Static238.method3397();
					}
				} else if (Static141.anInt6097 < 128) {
					Static340.anInterface13Array1[Static141.anInt6097] = local99;
					Static141.anInt6097++;
				}
			} else if (local105 == 0 && Static407.anInt6525 < 75) {
				Static443.anInterface13Array2[Static407.anInt6525] = local99;
				Static407.anInt6525++;
			}
		}
		Static426.anInt6829 = 0;
		for (@Pc(179) Class1_Sub22 local179 = Static181.aClass224_1.method5617(); local179 != null; local179 = Static181.aClass224_1.method5617()) {
			@Pc(185) int local185 = local179.method4156();
			if (local185 == -1) {
				Static296.aClass14_32.method205(local179);
			} else if (local185 == 6) {
				Static426.anInt6829 += local179.method4158();
			} else if (Static464.method5363(local185)) {
				Static378.aClass14_45.method205(local179);
				if (Static378.aClass14_45.method213() > 10) {
					Static378.aClass14_45.method202();
				}
			}
		}
		if (Static442.method5521()) {
			Static451.method5816();
		}
		if (Static135.anInt2114 == 0) {
			this.method759();
			Static105.method1301();
		} else if (Static135.anInt2114 == 1) {
			this.method759();
			Static105.method1301();
		} else if (Static197.method2828(Static135.anInt2114)) {
			Static196.method2815();
		}
		if (Static356.method4681(Static135.anInt2114) && !Static197.method2828(Static135.anInt2114)) {
			this.method770();
			Static399.method5167();
			Static164.method5259();
		} else if (Static309.method4100(Static135.anInt2114) && !Static197.method2828(Static135.anInt2114)) {
			this.method770();
			Static164.method5259();
		} else if (Static135.anInt2114 == 11) {
			Static164.method5259();
		} else if (Static242.method3484(Static135.anInt2114) && !Static197.method2828(Static135.anInt2114)) {
			Static177.method2573();
		} else if (Static135.anInt2114 == 12) {
			Static164.method5259();
			if (Static300.anInt5046 != -3 && Static300.anInt5046 != 2 && Static300.anInt5046 != 15) {
				Static124.method1519(false);
			}
		}
		Static209.method3028(Static186.aClass117_3);
		Static378.aClass14_45.method202();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method763() {
		if (Static135.anInt2114 == 13) {
			return;
		}
		@Pc(19) long local19 = Static451.method5817() / 1000000L - Static427.aLong219;
		Static427.aLong219 = Static451.method5817() / 1000000L;
		@Pc(27) boolean local27 = Static281.method3761();
		if (local27 && Static461.aBoolean648 && Static114.aClass101_1 != null) {
			Static114.aClass101_1.method4852();
		}
		if (Static63.method856(Static135.anInt2114)) {
			if (Static307.aLong166 != 0L && Static183.method2674() > Static307.aLong166) {
				Static461.method5951(Static126.aClass19_Sub1_1.anInt4230, false, Static126.aClass19_Sub1_1.anInt4240, Static208.method3017());
			} else if (!Static186.aClass117_3.method5692() && Static68.aBoolean126) {
				Static373.method5945();
			}
		}
		@Pc(88) int local88;
		@Pc(92) int local92;
		if (Static33.aFrame1 == null) {
			@Pc(80) Container local80;
			if (Static138.aFrame2 == null) {
				local80 = Static259.aClass177_2.anApplet1;
			} else {
				local80 = Static138.aFrame2;
			}
			local88 = local80.getSize().width;
			local92 = local80.getSize().height;
			if (Static138.aFrame2 == local80) {
				@Pc(98) Insets local98 = Static138.aFrame2.getInsets();
				local92 -= local98.bottom + local98.top;
				local88 -= local98.left + local98.right;
			}
			if (Static342.anInt5549 != local88 || local92 != Static455.anInt7239) {
				if (Static186.aClass117_3 == null || Static186.aClass117_3.method5667()) {
					Static211.method4160();
				} else {
					Static455.anInt7239 = local92;
					Static342.anInt5549 = local88;
				}
				Static307.aLong166 = Static183.method2674() + 500L;
			}
		}
		if (Static33.aFrame1 != null && !Static397.aBoolean556 && Static63.method856(Static135.anInt2114)) {
			Static461.method5951(-1, false, -1, Static126.aClass19_Sub1_1.anInt4220);
		}
		@Pc(160) boolean local160 = false;
		if (Static69.aBoolean128) {
			local160 = true;
			Static69.aBoolean128 = false;
		}
		if (local160) {
			Static463.method5975();
		}
		if (Static186.aClass117_3 != null && Static186.aClass117_3.method5692() || Static208.method3017() != 1) {
			Static186.method2688();
		}
		if (Static135.anInt2114 == 0) {
			Static313.method4138(Static98.aColorArray1[Static385.anInt6185], Static139.aColorArray2[Static385.anInt6185], Static148.aString20, local160, Static160.aColorArray3[Static385.anInt6185], Static2.anInt33);
		} else if (Static135.anInt2114 == 1) {
			Static68.method882(Static186.aClass117_3, local160 | Static186.aClass117_3.method5692(), Static160.aColorArray3[Static385.anInt6185].getRGB(), Static98.aColorArray1[Static385.anInt6185].getRGB(), Static17.aClass137_5, Static139.aColorArray2[Static385.anInt6185].getRGB());
		} else if (Static153.method1921(Static135.anInt2114)) {
			Static35.method491();
		} else if (Static427.method5425(Static135.anInt2114)) {
			Static35.method491();
		} else if (Static197.method2828(Static135.anInt2114)) {
			if (Static95.anInt6483 == 1) {
				if (Static374.anInt6022 > Static36.anInt543) {
					Static36.anInt543 = Static374.anInt6022;
				}
				local88 = (Static36.anInt543 - Static374.anInt6022) * 50 / Static36.anInt543;
				Static63.method859(true, Static464.aClass137_8, Static19.aClass142_4.method3118(Static63.anInt981) + "<br>(" + local88 + "%)");
			} else if (Static95.anInt6483 == 2) {
				if (Static20.anInt302 < Static448.anInt7120) {
					Static20.anInt302 = Static448.anInt7120;
				}
				local88 = (Static20.anInt302 - Static448.anInt7120) * 50 / Static20.anInt302 + 50;
				Static63.method859(true, Static464.aClass137_8, Static19.aClass142_4.method3118(Static63.anInt981) + "<br>(" + local88 + "%)");
			} else {
				Static63.method859(true, Static464.aClass137_8, Static19.aClass142_4.method3118(Static63.anInt981));
			}
		} else if (Static135.anInt2114 == 9) {
			Static51.method681(local19);
		} else if (Static135.anInt2114 == 12) {
			Static63.method859(true, Static464.aClass137_8, Static292.aClass142_74.method3118(Static63.anInt981) + "<br>" + Static7.aClass142_1.method3118(Static63.anInt981));
		}
		if (Static202.anInt7380 == 3) {
			for (local88 = 0; local88 < Static88.anInt1187; local88++) {
				@Pc(390) Rectangle local390 = Class1_Sub29.aRectangleArray4[local88];
				if (Static106.aBooleanArray162[local88]) {
					Static186.aClass117_3.method5664(local390.width, local390.y, -1996553985, local390.height, local390.x);
				} else if (Static150.aBooleanArray107[local88]) {
					Static186.aClass117_3.method5664(local390.width, local390.y, -1996554240, local390.height, local390.x);
				}
			}
		}
		if (Static442.method5521()) {
			Static268.method3692(Static186.aClass117_3);
		}
		if (Static63.method856(Static135.anInt2114) && Static202.anInt7380 == 0 && Static208.method3017() == 1 && !local160 && Static289.aString49.equals("1.1")) {
			local88 = 0;
			for (local92 = 0; local92 < Static88.anInt1187; local92++) {
				if (Static150.aBooleanArray107[local92]) {
					Static150.aBooleanArray107[local92] = false;
					Static221.aRectangleArray1[local88++] = Class1_Sub29.aRectangleArray4[local92];
				}
			}
			Static186.aClass117_3.method5694(Static221.aRectangleArray1, local88);
		} else if (Static135.anInt2114 != 0) {
			Static186.aClass117_3.method5698();
			for (local88 = 0; local88 < Static88.anInt1187; local88++) {
				Static150.aBooleanArray107[local88] = false;
			}
		}
		if (Static126.aClass19_Sub1_1.anInt4227 == 0) {
			Static331.method4343(15L);
		} else if (Static126.aClass19_Sub1_1.anInt4227 == 1) {
			Static331.method4343(10L);
		} else if (Static126.aClass19_Sub1_1.anInt4227 == 2) {
			Static331.method4343(5L);
		} else if (Static126.aClass19_Sub1_1.anInt4227 == 3) {
			Static331.method4343(2L);
		}
		if (Static147.aBoolean240) {
			Static154.method1922();
		}
		if (Static126.aClass19_Sub1_1.aBoolean375 && Static135.anInt2114 == 2 && Static118.anInt1785 != -1) {
			Static126.aClass19_Sub1_1.aBoolean375 = false;
			Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method745()) {
			return;
		}
		Static208.aClass112_7 = new Class112();
		Static208.aClass112_7.anInt2708 = Integer.parseInt(this.getParameter("worldid"));
		Static335.aClass112_9 = new Class112();
		Static335.aClass112_9.anInt2708 = Integer.parseInt(this.getParameter("lobbyid"));
		Static335.aClass112_9.aString28 = this.getParameter("lobbyaddress");
		Static68.aClass112_3 = new Class112();
		Static68.aClass112_3.anInt2708 = Integer.parseInt(this.getParameter("demoid"));
		Static68.aClass112_3.aString28 = this.getParameter("demoaddress");
		Static254.aClass170_4 = Static193.method2641(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static24.method354(Static254.aClass170_4) && Static268.aClass170_5 != Static254.aClass170_4) {
			Static254.aClass170_4 = Static268.aClass170_5;
		}
		Static110.aClass156_2 = Static80.method972(Integer.parseInt(this.getParameter("modewhat")));
		if (Static110.aClass156_2 != Static50.aClass156_1 && Static110.aClass156_2 != Static144.aClass156_5 && Static405.aClass156_4 != Static110.aClass156_2) {
			Static110.aClass156_2 = Static405.aClass156_4;
		}
		try {
			Static63.anInt981 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static63.anInt981 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static37.aBoolean81 = true;
		} else {
			Static37.aBoolean81 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static379.aBoolean16 = true;
		} else {
			Static379.aBoolean16 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static439.aBoolean601 = true;
		} else {
			Static439.aBoolean601 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static94.aClass148_3 = Static59.aClass148_1;
			} else if (local145.equals("1")) {
				Static94.aClass148_3 = Static93.aClass148_2;
			}
		}
		try {
			Static209.anInt3892 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static209.anInt3892 = 0;
		}
		Static70.aString59 = this.getParameter("quiturl");
		Static448.aString68 = this.getParameter("settings");
		if (Static448.aString68 == null) {
			Static448.aString68 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static98.anInt1305 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static98.anInt1305 = 0;
			}
		}
		Static385.anInt6185 = Integer.parseInt(this.getParameter("colourid"));
		if (Static385.anInt6185 < 0 || Static385.anInt6185 >= Static160.aColorArray3.length) {
			Static385.anInt6185 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static381.aBoolean540 = true;
			Static396.aBoolean555 = true;
		}
		@Pc(226) String local226 = this.getParameter("frombilling");
		if (local226 != null && local226.equals("true")) {
			Static175.aBoolean286 = true;
		}
		Static324.aClient1 = this;
		if (Static94.aClass148_3 == Static59.aClass148_1) {
			Static401.anInt6459 = 765;
			Static238.anInt4296 = 503;
		} else if (Static93.aClass148_2 == Static94.aClass148_3) {
			Static401.anInt6459 = 640;
			Static238.anInt4296 = 480;
		}
		this.method742(Static238.anInt4296, Static401.anInt6459, Static110.aClass156_2.method3576() + 32);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method770() {
		@Pc(27) int local27;
		if (Static135.anInt2114 == 6 && Static372.anInt5995 == 0) {
			if (Static175.anInt3046 > 1) {
				Static175.anInt3046--;
				Static356.anInt5794 = Static163.anInt5780;
			}
			if (!Static170.aBoolean282) {
				Static447.method5754();
			}
			for (local27 = 0; local27 < 100 && Static135.method1730(); local27++) {
			}
		}
		Static71.anInt1041++;
		Static357.method4687(null, -1, -1);
		Static255.method3575(-1, null, -1);
		Static5.method50();
		Static163.anInt5780++;
		for (local27 = 0; local27 < Static406.anInt6516; local27++) {
			@Pc(67) Class11_Sub1_Sub3_Sub1 local67 = Static47.aClass1_Sub44Array1[local27].aClass11_Sub1_Sub3_Sub1_2;
			if (local67 != null) {
				@Pc(73) byte local73 = local67.aClass272_1.aByte97;
				if ((local73 & 0x1) != 0) {
					@Pc(84) int local84 = local67.method2635();
					@Pc(111) int local111;
					if ((local73 & 0x2) != 0 && local67.anInt3342 == 0 && Math.random() * 1000.0D < 10.0D) {
						local111 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(119) int local119 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local111 != 0 || local119 != 0) {
							@Pc(133) int local133 = local111 + local67.anIntArray246[0];
							@Pc(140) int local140 = local67.anIntArray247[0] + local119;
							if (local133 < 0) {
								local133 = 0;
							} else if (Static147.anInt2300 - local84 - 1 < local133) {
								local133 = Static147.anInt2300 - local84 - 1;
							}
							if (local140 < 0) {
								local140 = 0;
							} else if (Static293.anInt4886 - local84 - 1 < local140) {
								local140 = Static293.anInt4886 - local84 - 1;
							}
							@Pc(208) int local208 = Static282.method3775(Static385.aClass158Array1[local67.aByte90], -1, local84, local133, local84, Static279.anIntArray356, true, local84, local67.anIntArray247[0], 0, 0, local67.anIntArray246[0], Static392.anIntArray462, local140);
							if (local208 > 0) {
								if (local208 > 9) {
									local208 = 9;
								}
								for (@Pc(217) int local217 = 0; local217 < local208; local217++) {
									local67.anIntArray246[local217] = Static392.anIntArray462[local208 - local217 - 1];
									local67.anIntArray247[local217] = Static279.anIntArray356[local208 - local217 - 1];
									local67.aByteArray35[local217] = 1;
								}
								local67.anInt3342 = local208;
							}
						}
					}
					Static283.method5888(local67, true);
					local111 = Static252.method3562(local67);
					Static308.method4081(Static63.anInt978, local111, local67, Static150.anInt4703);
					Static432.method5479(local67);
				}
			}
		}
		if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
			if (Static139.anInt2147 == 2) {
				Static375.method4863();
			} else {
				Static391.method5084();
			}
			if (Static386.anInt7155 >> 7 < 14 || Static147.anInt2300 - 14 <= Static386.anInt7155 >> 7 || Static80.anInt1106 >> 7 < 14 || Static80.anInt1106 >> 7 >= Static293.anInt4886 - 14) {
				Static387.method4981();
			}
		}
		while (true) {
			@Pc(350) Class1_Sub11 local350;
			@Pc(355) Class107 local355;
			@Pc(366) Class107 local366;
			do {
				local350 = (Class1_Sub11) Static322.aClass14_34.method202();
				if (local350 == null) {
					while (true) {
						do {
							local350 = (Class1_Sub11) Static449.aClass14_51.method202();
							if (local350 == null) {
								while (true) {
									do {
										local350 = (Class1_Sub11) Static328.aClass14_38.method202();
										if (local350 == null) {
											if (Static364.aClass107_13 != null) {
												Static108.method1348();
											}
											if (Static98.anInt1304 % 1500 == 0) {
												Static40.method545();
											}
											if (Static135.anInt2114 == 6 && Static372.anInt5995 == 0) {
												Static139.method1755();
											}
											Static342.method4460();
											if (Static57.aBoolean116 && Static183.method2674() - 60000L > Static46.aLong180) {
												Static317.method4196();
											}
											for (@Pc(527) Class111_Sub1_Sub1 local527 = (Class111_Sub1_Sub1) Static230.aClass63_3.method1019(); local527 != null; local527 = (Class111_Sub1_Sub1) Static230.aClass63_3.method1022()) {
												if (Static183.method2674() / 1000L - 5L > (long) local527.anInt4273) {
													if (local527.aShort60 > 0) {
														Static439.method5510(local527.aString43 + Static431.aClass142_111.method3118(Static63.anInt981), "", "", 5, 0);
													}
													if (local527.aShort60 == 0) {
														Static439.method5510(local527.aString43 + Static307.aClass142_78.method3118(Static63.anInt981), "", "", 5, 0);
													}
													local527.method5886();
												}
											}
											if (Static135.anInt2114 == 6 && Static372.anInt5995 == 0) {
												if (Static337.aClass110_2 == null) {
													Static124.method1519(false);
													return;
												}
												Static133.anInt2068++;
												if (Static133.anInt2068 > 50) {
													Static178.method2589(Static407.aClass242_110);
												}
												try {
													if (Static337.aClass110_2 != null && Static426.aClass1_Sub19_Sub2_2.anInt3698 > 0) {
														Static238.anInt4297 += Static426.aClass1_Sub19_Sub2_2.anInt3698;
														Static337.aClass110_2.method3778(Static426.aClass1_Sub19_Sub2_2.aByteArray38, Static426.aClass1_Sub19_Sub2_2.anInt3698);
														Static133.anInt2068 = 0;
														Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
														return;
													}
												} catch (@Pc(648) IOException local648) {
													Static124.method1519(false);
													return;
												}
											}
											return;
										}
										local355 = local350.aClass107_2;
										if (local355.anInt2643 < 0) {
											break;
										}
										local366 = Static55.method754(local355.anInt2624);
									} while (local366 == null || local366.aClass107Array2 == null || local355.anInt2643 >= local366.aClass107Array2.length || local366.aClass107Array2[local355.anInt2643] != local355);
									Static198.method2834(local350);
								}
							}
							local355 = local350.aClass107_2;
							if (local355.anInt2643 < 0) {
								break;
							}
							local366 = Static55.method754(local355.anInt2624);
						} while (local366 == null || local366.aClass107Array2 == null || local355.anInt2643 >= local366.aClass107Array2.length || local355 != local366.aClass107Array2[local355.anInt2643]);
						Static198.method2834(local350);
					}
				}
				local355 = local350.aClass107_2;
				if (local355.anInt2643 < 0) {
					break;
				}
				local366 = Static55.method754(local355.anInt2624);
			} while (local366 == null || local366.aClass107Array2 == null || local366.aClass107Array2.length <= local355.anInt2643 || local366.aClass107Array2[local355.anInt2643] != local355);
			Static198.method2834(local350);
		}
	}
}
