import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
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
				Static271.method4373("Argument count");
			}
			Static478.aClass322_4 = new Class322();
			Static478.aClass322_4.anInt9045 = Integer.parseInt(arg0[0]);
			Static139.aClass322_2 = new Class322();
			Static139.aClass322_2.anInt9045 = Integer.parseInt(arg0[1]);
			Static589.aClass322_6 = new Class322();
			Static589.aClass322_6.anInt9045 = Integer.parseInt(arg0[2]);
			Static267.aClass86_7 = Static538.aClass86_8;
			if (arg0[3].equals("live")) {
				Static338.aClass21_2 = Static602.aClass21_4;
			} else if (arg0[3].equals("rc")) {
				Static338.aClass21_2 = Static242.aClass21_1;
			} else if (arg0[3].equals("wip")) {
				Static338.aClass21_2 = Static467.aClass21_3;
			} else {
				Static271.method4373("modewhat");
			}
			Static377.anInt6756 = Static48.method946(arg0[4]);
			if (Static377.anInt6756 == -1) {
				if (arg0[4].equals("english")) {
					Static377.anInt6756 = 0;
				} else if (arg0[4].equals("german")) {
					Static377.anInt6756 = 1;
				} else {
					Static271.method4373("language");
				}
			}
			Static511.aBoolean580 = false;
			Static633.aBoolean753 = false;
			if (arg0[5].equals("game0")) {
				Static499.aClass63_15 = Static239.aClass63_14;
			} else if (arg0[5].equals("game1")) {
				Static499.aClass63_15 = Static230.aClass63_16;
			} else if (arg0[5].equals("game2")) {
				Static499.aClass63_15 = Static234.aClass63_8;
			} else if (arg0[5].equals("game3")) {
				Static499.aClass63_15 = Static21.aClass63_1;
			} else {
				Static271.method4373("game");
			}
			Static340.anInt6247 = 0;
			Static427.aBoolean578 = false;
			Static549.aBoolean667 = true;
			Static632.aBoolean751 = true;
			Static321.aBoolean756 = false;
			Static541.aLong249 = 0L;
			Static473.aString74 = null;
			Static484.aString76 = null;
			Static619.anInt10076 = 0;
			Static538.aString82 = "";
			Static331.anInt5912 = 0;
			Static352.anInt6476 = Static499.aClass63_15.anInt1690;
			@Pc(187) client local187 = new client();
			Static181.aClient1 = local187;
			local187.method1315(Static338.aClass21_2.method558() + 32, Static499.aClass63_15.aString19);
			Static503.aFrame3.setLocation(40, 40);
		} catch (@Pc(210) Exception local210) {
			Static420.method6396(null, local210);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	@Override
	protected void method1316() {
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() != 2) {
			this.method1340();
			return;
		}
		try {
			this.method1340();
		} catch (@Pc(23) ThreadDeath local23) {
			throw local23;
		} catch (@Pc(26) Throwable local26) {
			Static420.method6396(local26.getMessage() + " (Recovered) " + this.method1320(), local26);
			Static352.method5455(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1313() {
		if (Static179.aBoolean335) {
			Static76.method1454();
		}
		Static329.method8196();
		if (Static600.aClass87_15 != null) {
			Static600.aClass87_15.method7959();
		}
		if (Static275.aFrame2 != null) {
			Static360.method5509(Static375.aClass359_4, Static275.aFrame2);
			Static275.aFrame2 = null;
		}
		if (Static439.aClass210_1 != null) {
			Static439.aClass210_1.method8030();
			Static439.aClass210_1 = null;
		}
		Static553.method7684();
		Static252.aClass190_1.method4609();
		Static397.aClass325_2.method7653();
		if (Static164.aClass99_1 != null) {
			Static164.aClass99_1.method2604();
			Static164.aClass99_1 = null;
		}
		try {
			Static624.aClass31_7.method753();
			for (@Pc(57) int local57 = 0; local57 < 37; local57++) {
				Static572.aClass31Array1[local57].method753();
			}
			Static330.aClass31_3.method753();
			Static215.aClass31_4.method753();
			Static355.method5465();
		} catch (@Pc(78) Exception local78) {
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1326() {
		if (Static214.anInt4434 < Static252.aClass190_1.anInt5525) {
			Static460.aClass322_3.method7606();
			Static313.anInt5694 = (Static252.aClass190_1.anInt5525 * 50 - 50) * 5;
			if (Static313.anInt5694 > 3000) {
				Static313.anInt5694 = 3000;
			}
			if (Static252.aClass190_1.anInt5525 >= 2 && Static252.aClass190_1.anInt5524 == 6) {
				this.method1308("js5connect_outofdate");
				Static538.anInt8985 = 14;
				return;
			}
			if (Static252.aClass190_1.anInt5525 >= 4 && Static252.aClass190_1.anInt5524 == -1) {
				this.method1308("js5crc");
				Static538.anInt8985 = 14;
				return;
			}
			if (Static252.aClass190_1.anInt5525 >= 4 && Static173.method3217(Static538.anInt8985)) {
				if (Static252.aClass190_1.anInt5524 == 7 || Static252.aClass190_1.anInt5524 == 9) {
					this.method1308("js5connect_full");
				} else if (Static252.aClass190_1.anInt5524 <= 0) {
					this.method1308("js5io");
				} else if (Static111.aString54 == null) {
					this.method1308("js5connect");
				} else {
					this.method1308("js5proxy_" + Static111.aString54.trim());
				}
				Static538.anInt8985 = 14;
				return;
			}
		}
		Static214.anInt4434 = Static252.aClass190_1.anInt5525;
		if (Static313.anInt5694 > 0) {
			Static313.anInt5694--;
			return;
		}
		try {
			if (Static60.anInt1257 == 0) {
				Static201.aClass26_14 = Static460.aClass322_3.method7607(Static375.aClass359_4);
				Static60.anInt1257++;
			}
			if (Static60.anInt1257 == 1) {
				if (Static201.aClass26_14.anInt762 == 2) {
					if (Static201.aClass26_14.anObject3 != null) {
						Static111.aString54 = (String) Static201.aClass26_14.anObject3;
					}
					this.method1341(1000);
					return;
				}
				if (Static201.aClass26_14.anInt762 == 1) {
					Static60.anInt1257++;
				}
			}
			if (Static60.anInt1257 == 2) {
				Static137.aClass286_1 = new Class286((Socket) Static201.aClass26_14.anObject3, Static375.aClass359_4, 25000);
				@Pc(193) Class2_Sub34 local193 = new Class2_Sub34(5);
				local193.method6894(Static10.aClass295_2.anInt8334);
				local193.method6864(629);
				Static137.aClass286_1.method6803(5, local193.aByteArray77);
				Static60.anInt1257++;
				Static142.aLong89 = Static438.method6517();
			}
			if (Static60.anInt1257 == 3) {
				if (Static173.method3217(Static538.anInt8985) || Static137.aClass286_1.method6806() > 0) {
					@Pc(238) int local238 = Static137.aClass286_1.method6805();
					if (local238 != 0) {
						this.method1341(local238);
						return;
					}
					Static60.anInt1257++;
				} else if (Static438.method6517() - Static142.aLong89 > 30000L) {
					this.method1341(1001);
					return;
				}
			}
			if (Static60.anInt1257 == 4) {
				@Pc(285) boolean local285 = Static173.method3217(Static538.anInt8985) || Static630.method8481(Static538.anInt8985) || Static562.method7785(Static538.anInt8985);
				@Pc(288) Class341[] local288 = Static575.method8000();
				@Pc(296) Class2_Sub34 local296 = new Class2_Sub34(local288.length * 4);
				Static137.aClass286_1.method6799(local296.aByteArray77.length, 0, local296.aByteArray77);
				for (@Pc(309) int local309 = 0; local309 < local288.length; local309++) {
					local288[local309].method8002(local296.method6865());
				}
				Static252.aClass190_1.method4605(Static137.aClass286_1, !local285);
				Static137.aClass286_1 = null;
				Static60.anInt1257 = 0;
				Static201.aClass26_14 = null;
			}
		} catch (@Pc(343) IOException local343) {
			this.method1341(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1327() {
		@Pc(12) boolean local12 = Static252.aClass190_1.method4612();
		if (!local12) {
			this.method1326();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1311() {
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1320() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static451.anInt7933 + "," + Static470.anInt8063 + "," + Static3.anInt46 + "," + Static270.anInt5194 + "|";
			if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 != null) {
				local5 = local5 + "2)" + Static16.anInt308 + "," + (Static451.anInt7933 + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0]) + "," + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] + Static470.anInt8063) + "|";
			}
			local5 = local5 + "3)" + Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() + "|4)" + Static404.aClass2_Sub13_2.aClass33_Sub9_1.method3852() + "|5)" + Static501.method7132() + "|6)" + Static571.anInt9399 + "," + Static585.anInt9606 + "|";
			local5 = local5 + "7)" + Static404.aClass2_Sub13_2.aClass33_Sub28_1.method8390() + "|";
			local5 = local5 + "8)" + Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495() + "|";
			local5 = local5 + "9)" + Static404.aClass2_Sub13_2.aClass33_Sub20_1.method6515() + "|";
			local5 = local5 + "10)" + Static404.aClass2_Sub13_2.aClass33_Sub4_1.method1808() + "|";
			local5 = local5 + "11)" + Static404.aClass2_Sub13_2.aClass33_Sub25_1.method7592() + "|";
			local5 = local5 + "12)" + Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() + "|";
			local5 = local5 + "13)" + Static545.anInt9053 + "|";
			local5 = local5 + "14)" + Static538.anInt8985;
			try {
				local5 = local5 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(235) Throwable local235) {
			}
			try {
				if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 2) {
					@Pc(246) Class local246 = Class.forName("java.lang.ClassLoader");
					@Pc(250) Field local250 = local246.getDeclaredField("nativeLibraries");
					@Pc(253) Class local253 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(263) Method local263 = local253.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local263.invoke(local250, Boolean.TRUE);
					@Pc(286) Vector local286 = (Vector) local250.get(client.class.getClassLoader());
					for (@Pc(288) int local288 = 0; local288 < local286.size(); local288++) {
						try {
							@Pc(293) Object local293 = local286.elementAt(local288);
							@Pc(298) Field local298 = local293.getClass().getDeclaredField("name");
							local263.invoke(local298, Boolean.TRUE);
							try {
								@Pc(313) String local313 = (String) local298.get(local293);
								if (local313 != null && local313.indexOf("sw3d.dll") != -1) {
									@Pc(325) Field local325 = local293.getClass().getDeclaredField("handle");
									local263.invoke(local325, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local325.getLong(local293));
									local263.invoke(local325, Boolean.FALSE);
								}
							} catch (@Pc(361) Throwable local361) {
							}
							local263.invoke(local298, Boolean.FALSE);
						} catch (@Pc(373) Throwable local373) {
						}
					}
				}
			} catch (@Pc(381) Throwable local381) {
			}
			local5 = local5 + "]";
		} catch (@Pc(392) Throwable local392) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1312() {
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() != 2) {
			this.method1338();
			return;
		}
		try {
			this.method1338();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static420.method6396(local19.getMessage() + " (Recovered) " + this.method1320(), local19);
			Static352.method5455(false, 0);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	public synchronized void method1309() {
		if (Static234.anApplet2 != null && Static147.aCanvas5 == null && !Static375.aClass359_4.aBoolean728) {
			try {
				@Pc(13) Class local13 = Static234.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static147.aCanvas5 = (Canvas) local17.get(Static234.anApplet2);
				local17.set(Static234.anApplet2, null);
				if (Static147.aCanvas5 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1309();
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1338() {
		if (Static538.anInt8985 == 14) {
			return;
		}
		Static325.anInt5888++;
		if (Static325.anInt5888 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static437.anInt7778 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static623.aRandom5.setSeed((long) Static437.anInt7778);
		}
		if (Static325.anInt5888 % 50 == 0) {
			Static290.anInt5465 = Static67.anInt1404;
			Static67.anInt1404 = 0;
			Static417.anInt7626 = Static371.anInt6619;
			Static371.anInt6619 = 0;
		}
		this.method1327();
		if (Static622.aClass224_1 != null) {
			Static622.aClass224_1.method5482();
		}
		Static277.method4443();
		Static289.method4523();
		Static63.aClass32_1.method785();
		Static6.aClass40_1.method4495();
		if (Static600.aClass87_15 != null) {
			Static600.aClass87_15.method7918((int) Static438.method6517());
		}
		Static59.method1091();
		Static542.anInt9036 = 0;
		Static470.anInt8064 = 0;
		for (@Pc(101) Interface16 local101 = Static63.aClass32_1.method786(); local101 != null; local101 = Static63.aClass32_1.method786()) {
			@Pc(107) int local107 = local101.method4736();
			if (local107 == 2 || local107 == 3) {
				@Pc(121) char local121 = local101.method4737();
				if (Static4.method56() && (local121 == '`' || local121 == '§' || local121 == '²')) {
					if (Static491.method7024()) {
						Static457.method6672();
					} else {
						Static258.method8460();
					}
				} else if (Static470.anInt8064 < 128) {
					Static15.anInterface16Array1[Static470.anInt8064] = local101;
					Static470.anInt8064++;
				}
			} else if (local107 == 0 && Static542.anInt9036 < 75) {
				Static293.anInterface16Array2[Static542.anInt9036] = local101;
				Static542.anInt9036++;
			}
		}
		Static597.anInt9839 = 0;
		for (@Pc(193) Class2_Sub32 local193 = Static6.aClass40_1.method4497(); local193 != null; local193 = Static6.aClass40_1.method4497()) {
			@Pc(199) int local199 = local193.method8561();
			if (local199 == -1) {
				Static113.aClass238_12.method5837(local193);
			} else if (local199 == 6) {
				Static597.anInt9839 += local193.method8557();
			} else if (Static457.method6674(local199)) {
				Static72.aClass238_9.method5837(local193);
				if (Static72.aClass238_9.method5842() > 10) {
					Static72.aClass238_9.method5832();
				}
			}
		}
		if (Static491.method7024()) {
			Static610.method8342();
		}
		if (Static173.method3217(Static538.anInt8985)) {
			Static628.method8472();
			Static352.method5456();
		} else if (Static201.method3526(Static538.anInt8985)) {
			Static24.method589();
		}
		if (Static630.method8481(Static538.anInt8985) && !Static201.method3526(Static538.anInt8985)) {
			this.method1339();
			Static336.method5208();
			Static555.method7690();
		} else if (Static562.method7785(Static538.anInt8985) && !Static201.method3526(Static538.anInt8985)) {
			this.method1339();
			Static555.method7690();
		} else if (Static538.anInt8985 == 12) {
			Static555.method7690();
		} else if (Static86.method1553(Static538.anInt8985) && !Static201.method3526(Static538.anInt8985)) {
			Static275.method4418();
		} else if (Static538.anInt8985 == 13) {
			Static555.method7690();
			if (Static451.anInt7928 != -3 && Static451.anInt7928 != 2 && Static451.anInt7928 != 15) {
				Static75.method1450(false);
			}
		}
		Static91.method1615(Static600.aClass87_15);
		Static72.aClass238_9.method5832();
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1339() {
		@Pc(21) int local21;
		if (Static538.anInt8985 == 7 && Static585.anInt9601 == 0) {
			if (Static226.anInt4630 > 1) {
				Static366.anInt6576 = Static44.anInt975;
				Static226.anInt4630--;
			}
			if (!Static642.aBoolean757) {
				Static248.method4051();
			}
			for (local21 = 0; local21 < 100 && Static320.method4828(); local21++) {
			}
		}
		Static362.anInt6541++;
		Static98.method1679(-1, -1, null);
		Static475.method7387(-1, null, -1);
		Static498.method7093();
		Static44.anInt975++;
		for (local21 = 0; local21 < Static225.anInt4616; local21++) {
			@Pc(75) Class11_Sub1_Sub1_Sub2_Sub2 local75 = Static86.aClass2_Sub51Array1[local21].aClass11_Sub1_Sub1_Sub2_Sub2_2;
			if (local75 != null) {
				@Pc(81) byte local81 = local75.aClass236_1.aByte98;
				if ((local81 & 0x1) != 0) {
					@Pc(92) int local92 = local75.method2778();
					@Pc(116) int local116;
					if ((local81 & 0x2) != 0 && local75.anInt3296 == 0 && Math.random() * 1000.0D < 10.0D) {
						local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(124) int local124 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local116 != 0 || local124 != 0) {
							@Pc(138) int local138 = local116 + local75.anIntArray232[0];
							if (local138 < 0) {
								local138 = 0;
							} else if (Static3.anInt46 - local92 - 1 < local138) {
								local138 = Static3.anInt46 - local92 - 1;
							}
							@Pc(165) int local165 = local124 + local75.anIntArray233[0];
							if (local165 < 0) {
								local165 = 0;
							} else if (Static270.anInt5194 - local92 - 1 < local165) {
								local165 = Static270.anInt5194 - local92 - 1;
							}
							@Pc(214) int local214 = Static32.method748(0, -1, local92, local75.anIntArray233[0], Static288.anIntArray366, true, local92, local138, local92, local165, Static19.aClass179Array2[local75.aByte124], Static466.anIntArray304, 0, local75.anIntArray232[0]);
							if (local214 > 0) {
								if (local214 > 9) {
									local214 = 9;
								}
								for (@Pc(226) int local226 = 0; local226 < local214; local226++) {
									local75.anIntArray232[local226] = Static466.anIntArray304[local214 - local226 - 1];
									local75.anIntArray233[local226] = Static288.anIntArray366[local214 - local226 - 1];
									local75.aByteArray31[local226] = 1;
								}
								local75.anInt3296 = local214;
							}
						}
					}
					Static91.method1616(true, local75);
					local116 = Static444.method6592(local75);
					Static421.method6398(local75);
					Static80.method1496(local116, Static597.anInt9849, Static463.anInt8020, local75);
					Static7.method129(local75, Static597.anInt9849);
					Static105.method1775(local75);
				}
			}
		}
		if (Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
			if (Static2.anInt31 == 2) {
				Static37.method822();
			} else {
				Static257.method4230();
			}
			if (Static53.anInt1153 >> 9 < 14 || Static53.anInt1153 >> 9 >= Static3.anInt46 - 14 || Static395.anInt3530 >> 9 < 14 || Static270.anInt5194 - 14 <= Static395.anInt3530 >> 9) {
				Static644.method8604();
			}
		}
		while (true) {
			@Pc(352) Class2_Sub42 local352;
			@Pc(357) Class78 local357;
			@Pc(367) Class78 local367;
			do {
				local352 = (Class2_Sub42) Static378.aClass238_41.method5832();
				if (local352 == null) {
					while (true) {
						do {
							local352 = (Class2_Sub42) Static98.aClass238_11.method5832();
							if (local352 == null) {
								while (true) {
									do {
										local352 = (Class2_Sub42) Static564.aClass238_54.method5832();
										if (local352 == null) {
											if (Static112.aClass78_4 != null) {
												Static401.method6209();
											}
											if (Static325.anInt5888 % 1500 == 0) {
												Static423.method8399();
											}
											if (Static538.anInt8985 == 7 && Static585.anInt9601 == 0) {
												Static505.method7156();
											}
											Static34.method769();
											if (Static179.aBoolean335 && Static585.aLong256 < Static438.method6517() - 60000L) {
												Static76.method1454();
											}
											for (@Pc(516) Class11_Sub5_Sub2 local516 = (Class11_Sub5_Sub2) Static263.aClass143_6.method3536(); local516 != null; local516 = (Class11_Sub5_Sub2) Static263.aClass143_6.method3528()) {
												if ((long) local516.anInt5858 < Static438.method6517() / 1000L - 5L) {
													if (local516.aShort84 > 0) {
														Static369.method5571("", "", local516.aString57 + Static628.aClass369_19.method8475(Static377.anInt6756), 0, 5, "");
													}
													if (local516.aShort84 == 0) {
														Static369.method5571("", "", local516.aString57 + Static628.aClass369_20.method8475(Static377.anInt6756), 0, 5, "");
													}
													local516.method8372();
												}
											}
											if (Static538.anInt8985 == 7 && Static585.anInt9601 == 0) {
												if (Static439.aClass210_1 == null) {
													Static75.method1450(false);
													return;
												}
												Static362.anInt6546++;
												if (Static362.anInt6546 > 50) {
													@Pc(615) Class2_Sub50 local615 = Static595.method8194(Static610.aClass310_2, Static631.aClass269_96);
													Static311.method4754(local615);
												}
												try {
													Static73.method1380();
													return;
												} catch (@Pc(624) IOException local624) {
													Static75.method1450(false);
													return;
												}
											}
											return;
										}
										local357 = local352.aClass78_9;
										if (local357.anInt1978 < 0) {
											break;
										}
										local367 = Static180.method3291(local357.anInt1967);
									} while (local367 == null || local367.aClass78Array9 == null || local357.anInt1978 >= local367.aClass78Array9.length || local367.aClass78Array9[local357.anInt1978] != local357);
									Static639.method8539(local352);
								}
							}
							local357 = local352.aClass78_9;
							if (local357.anInt1978 < 0) {
								break;
							}
							local367 = Static180.method3291(local357.anInt1967);
						} while (local367 == null || local367.aClass78Array9 == null || local367.aClass78Array9.length <= local357.anInt1978 || local357 != local367.aClass78Array9[local357.anInt1978]);
						Static639.method8539(local352);
					}
				}
				local357 = local352.aClass78_9;
				if (local357.anInt1978 < 0) {
					break;
				}
				local367 = Static180.method3291(local357.anInt1967);
			} while (local367 == null || local367.aClass78Array9 == null || local367.aClass78Array9.length <= local357.anInt1978 || local367.aClass78Array9[local357.anInt1978] != local357);
			Static639.method8539(local352);
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method1340() {
		if (Static538.anInt8985 == 14) {
			return;
		}
		@Pc(24) long local24 = Static341.method5236() / 1000000L - Static275.aLong149;
		Static275.aLong149 = Static341.method5236() / 1000000L;
		@Pc(32) boolean local32 = Static113.method1839();
		if (local32 && Static243.aBoolean394 && Static473.aClass39_4 != null) {
			Static473.aClass39_4.method2887();
		}
		if (Static8.method153(Static538.anInt8985)) {
			if (Static622.aLong281 != 0L && Static622.aLong281 < Static438.method6517()) {
				Static227.method3850(Static501.method7132(), false, Static174.anInt3881, Static253.anInt5003);
			} else if (!Static600.aClass87_15.method7968() && Static571.aBoolean684) {
				Static24.method590();
			}
		}
		@Pc(98) int local98;
		@Pc(102) int local102;
		if (Static275.aFrame2 == null) {
			@Pc(84) Container local84;
			if (Static503.aFrame3 != null) {
				local84 = Static503.aFrame3;
			} else if (Static234.anApplet2 == null) {
				local84 = Static493.anApplet_Sub1_1;
			} else {
				local84 = Static234.anApplet2;
			}
			local98 = local84.getSize().width;
			local102 = local84.getSize().height;
			if (Static503.aFrame3 == local84) {
				@Pc(108) Insets local108 = Static503.aFrame3.getInsets();
				local102 -= local108.bottom + local108.top;
				local98 -= local108.left + local108.right;
			}
			if (local98 != Static519.anInt8672 || local102 != Static547.anInt9285 || Static179.aBoolean336) {
				if (Static600.aClass87_15 == null || Static600.aClass87_15.method7944()) {
					Static633.method8494();
				} else {
					Static547.anInt9285 = local102;
					Static519.anInt8672 = local98;
				}
				Static622.aLong281 = Static438.method6517() + 500L;
				Static179.aBoolean336 = false;
			}
		}
		if (Static275.aFrame2 != null && !Static540.aBoolean661 && Static8.method153(Static538.anInt8985)) {
			Static227.method3850(Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), false, -1, -1);
		}
		@Pc(177) boolean local177 = false;
		if (Static85.aBoolean151) {
			Static85.aBoolean151 = false;
			local177 = true;
		}
		if (local177) {
			Static230.method7141();
		}
		if (Static600.aClass87_15 != null && Static600.aClass87_15.method7968() || Static501.method7132() != 1) {
			Static539.method7534();
		}
		if (Static173.method3217(Static538.anInt8985)) {
			Static531.method7444(local177);
		} else if (Static224.method3810(Static538.anInt8985)) {
			Static556.method7712();
		} else if (Static462.method6718(Static538.anInt8985)) {
			Static556.method7712();
		} else if (Static201.method3526(Static538.anInt8985)) {
			if (Static219.anInt4548 == 1) {
				if (Static512.anInt8593 > Static45.anInt6807) {
					Static45.anInt6807 = Static512.anInt8593;
				}
				local98 = (Static45.anInt6807 - Static512.anInt8593) * 50 / Static45.anInt6807;
				Static86.method1555(Static600.aClass87_15, true, Static628.aClass369_12.method8475(Static377.anInt6756) + "<br>(" + local98 + "%)", Static428.aClass64_11, Static305.aClass114_29);
			} else if (Static219.anInt4548 == 2) {
				if (Static291.anInt5468 < Static491.anInt8369) {
					Static291.anInt5468 = Static491.anInt8369;
				}
				local98 = (Static291.anInt5468 - Static491.anInt8369) * 50 / Static291.anInt5468 + 50;
				Static86.method1555(Static600.aClass87_15, true, Static628.aClass369_12.method8475(Static377.anInt6756) + "<br>(" + local98 + "%)", Static428.aClass64_11, Static305.aClass114_29);
			} else {
				Static86.method1555(Static600.aClass87_15, true, Static628.aClass369_12.method8475(Static377.anInt6756), Static428.aClass64_11, Static305.aClass114_29);
			}
		} else if (Static538.anInt8985 == 10) {
			Static77.method1462(local24);
		} else if (Static538.anInt8985 == 13) {
			Static86.method1555(Static600.aClass87_15, false, Static628.aClass369_14.method8475(Static377.anInt6756) + "<br>" + Static628.aClass369_15.method8475(Static377.anInt6756), Static428.aClass64_11, Static305.aClass114_29);
		}
		if (Static41.anInt941 == 3) {
			for (local98 = 0; local98 < Static320.anInt5804; local98++) {
				@Pc(365) Rectangle local365 = Class2_Sub5_Sub21.aRectangleArray2[local98];
				if (Static286.aBooleanArray42[local98]) {
					Static600.aClass87_15.method7933(-65281, local365.y, local365.height, local365.width, local365.x);
				} else if (Static473.aBooleanArray43[local98]) {
					Static600.aClass87_15.method7933(-65536, local365.y, local365.height, local365.width, local365.x);
				} else {
					Static600.aClass87_15.method7933(-16711936, local365.y, local365.height, local365.width, local365.x);
				}
			}
		}
		if (Static491.method7024()) {
			Static577.method8015(Static600.aClass87_15);
		}
		if (Static375.aClass359_4.aBoolean728 && Static8.method153(Static538.anInt8985) && Static41.anInt941 == 0 && Static501.method7132() == 1 && !local177) {
			local98 = 0;
			for (local102 = 0; local102 < Static320.anInt5804; local102++) {
				if (Static473.aBooleanArray43[local102]) {
					Static473.aBooleanArray43[local102] = false;
					Static422.aRectangleArray1[local98++] = Class2_Sub5_Sub21.aRectangleArray2[local102];
				}
			}
			try {
				if (Static558.aBoolean680) {
					Static25.method595(Static422.aRectangleArray1, local98);
				} else {
					Static600.aClass87_15.method7897(Static422.aRectangleArray1, local98);
				}
			} catch (@Pc(490) Exception_Sub1 local490) {
			}
		} else if (!Static173.method3217(Static538.anInt8985)) {
			for (local98 = 0; local98 < Static320.anInt5804; local98++) {
				Static473.aBooleanArray43[local98] = false;
			}
			try {
				if (Static558.aBoolean680) {
					Static256.method4212();
				} else {
					Static600.aClass87_15.method7932();
				}
			} catch (@Pc(523) Exception_Sub1 local523) {
				Static420.method6396(local523.getMessage() + " (Recovered) " + this.method1320(), local523);
				Static352.method5455(false, 0);
			}
		}
		Static285.method4491();
		local98 = Static404.aClass2_Sub13_2.lb.method7198();
		if (local98 == 0) {
			Static57.method1062(15L);
		} else if (local98 == 1) {
			Static57.method1062(10L);
		} else if (local98 == 2) {
			Static57.method1062(5L);
		} else if (local98 == 3) {
			Static57.method1062(2L);
		}
		if (Static421.aBoolean575) {
			Static599.method8218();
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub29_1.method8447() == 1 && Static538.anInt8985 == 3 && Static387.anInt6978 != -1) {
			Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub29_1);
			Static209.method3628();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1318()) {
			return;
		}
		Static478.aClass322_4 = new Class322();
		Static478.aClass322_4.anInt9045 = Integer.parseInt(this.getParameter("worldid"));
		Static139.aClass322_2 = new Class322();
		Static139.aClass322_2.anInt9045 = Integer.parseInt(this.getParameter("lobbyid"));
		Static139.aClass322_2.aString83 = this.getParameter("lobbyaddress");
		Static589.aClass322_6 = new Class322();
		Static589.aClass322_6.anInt9045 = Integer.parseInt(this.getParameter("demoid"));
		Static589.aClass322_6.aString83 = this.getParameter("demoaddress");
		Static267.aClass86_7 = Static19.method3501(Integer.parseInt(this.getParameter("modewhere")));
		if (Static538.aClass86_8 == Static267.aClass86_7) {
			Static267.aClass86_7 = Static567.aClass86_9;
		} else if (!Static23.method586(Static267.aClass86_7) && Static267.aClass86_7 != Static95.aClass86_5) {
			Static267.aClass86_7 = Static95.aClass86_5;
		}
		Static338.aClass21_2 = Static8.method183(Integer.parseInt(this.getParameter("modewhat")));
		if (Static467.aClass21_3 != Static338.aClass21_2 && Static242.aClass21_1 != Static338.aClass21_2 && Static338.aClass21_2 != Static602.aClass21_4) {
			Static338.aClass21_2 = Static602.aClass21_4;
		}
		try {
			Static377.anInt6756 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static377.anInt6756 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static633.aBoolean753 = true;
		} else {
			Static633.aBoolean753 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static511.aBoolean580 = true;
		} else {
			Static511.aBoolean580 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static2.aBoolean3 = true;
		} else {
			Static2.aBoolean3 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static499.aClass63_15 = Static239.aClass63_14;
			} else if (local152.equals("1")) {
				Static499.aClass63_15 = Static230.aClass63_16;
			} else if (local152.equals("2")) {
				Static499.aClass63_15 = Static234.aClass63_8;
			} else if (local152.equals("3")) {
				Static499.aClass63_15 = Static21.aClass63_1;
			}
		}
		try {
			Static619.anInt10076 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static619.anInt10076 = 0;
		}
		Static115.aString28 = this.getParameter("quiturl");
		Static538.aString82 = this.getParameter("settings");
		if (Static538.aString82 == null) {
			Static538.aString82 = "";
		}
		Static447.aBoolean596 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static340.anInt6247 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static340.anInt6247 = 0;
			}
		}
		Static352.anInt6476 = Integer.parseInt(this.getParameter("colourid"));
		if (Static352.anInt6476 < 0 || Static352.anInt6476 >= Static597.aColorArray2.length) {
			Static352.anInt6476 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static549.aBoolean667 = true;
			Static632.aBoolean751 = true;
		}
		@Pc(252) String local252 = this.getParameter("frombilling");
		if (local252 != null && local252.equals("true")) {
			Static427.aBoolean578 = true;
		}
		Static473.aString74 = this.getParameter("sskey");
		if (Static473.aString74 != null && Static473.aString74.length() < 2) {
			Static473.aString74 = null;
		}
		@Pc(278) String local278 = this.getParameter("force64mb");
		if (local278 != null && local278.equals("true")) {
			Static321.aBoolean756 = true;
		}
		@Pc(290) String local290 = this.getParameter("worldflags");
		if (local290 != null) {
			try {
				Static331.anInt5912 = Integer.parseInt(local290);
			} catch (@Pc(297) Exception local297) {
			}
		}
		@Pc(302) String local302 = this.getParameter("userFlow");
		if (local302 != null) {
			try {
				Static541.aLong249 = Long.parseLong(local302);
			} catch (@Pc(309) NumberFormatException local309) {
			}
		}
		Static484.aString76 = this.getParameter("additionalInfo");
		if (Static484.aString76 != null && Static484.aString76.length() > 50) {
			Static484.aString76 = null;
		}
		if (Static499.aClass63_15 == Static239.aClass63_14) {
			Static135.anInt3053 = 503;
			Static386.anInt6961 = 765;
		} else if (Static499.aClass63_15 == Static230.aClass63_16) {
			Static386.anInt6961 = 640;
			Static135.anInt3053 = 480;
		}
		Static181.aClient1 = this;
		this.method1322(Static135.anInt3053, Static499.aClass63_15.aString19, Static338.aClass21_2.method558() + 32, Static386.anInt6961);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method1341(@OriginalArg(1) int arg0) {
		Static252.aClass190_1.anInt5525++;
		Static137.aClass286_1 = null;
		Static201.aClass26_14 = null;
		Static252.aClass190_1.anInt5524 = arg0;
		Static60.anInt1257 = 0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1314() {
		if (Static321.aBoolean756) {
			Static545.anInt9053 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static633.method8494();
		Static397.aClass325_2 = new Class325(Static375.aClass359_4);
		Static252.aClass190_1 = new Class190();
		Static209.method3627(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static267.aClass86_7 != Static95.aClass86_5) {
			Static226.aByteArrayArray11 = new byte[50][];
		}
		Static404.aClass2_Sub13_2 = Static471.method6781();
		if (Static95.aClass86_5 == Static267.aClass86_7) {
			Static478.aClass322_4.aString83 = this.getCodeBase().getHost();
		} else if (Static23.method586(Static267.aClass86_7)) {
			Static478.aClass322_4.aString83 = this.getCodeBase().getHost();
			Static478.aClass322_4.anInt9041 = Static478.aClass322_4.anInt9045 + 40000;
			Static139.aClass322_2.anInt9041 = Static139.aClass322_2.anInt9045 + 40000;
			Static589.aClass322_6.anInt9041 = Static589.aClass322_6.anInt9045 + 40000;
			Static478.aClass322_4.anInt9044 = Static478.aClass322_4.anInt9045 + 50000;
			Static139.aClass322_2.anInt9044 = Static139.aClass322_2.anInt9045 + 50000;
			Static589.aClass322_6.anInt9044 = Static589.aClass322_6.anInt9045 + 50000;
		} else if (Static267.aClass86_7 == Static538.aClass86_8) {
			Static478.aClass322_4.aString83 = "127.0.0.1";
			Static139.aClass322_2.aString83 = "127.0.0.1";
			Static589.aClass322_6.aString83 = "127.0.0.1";
			Static478.aClass322_4.anInt9041 = Static478.aClass322_4.anInt9045 + 40000;
			Static139.aClass322_2.anInt9041 = Static139.aClass322_2.anInt9045 + 40000;
			Static589.aClass322_6.anInt9041 = Static589.aClass322_6.anInt9045 + 40000;
			Static478.aClass322_4.anInt9044 = Static478.aClass322_4.anInt9045 + 50000;
			Static139.aClass322_2.anInt9044 = Static139.aClass322_2.anInt9045 + 50000;
			Static589.aClass322_6.anInt9044 = Static589.aClass322_6.anInt9045 + 50000;
		}
		Static460.aClass322_3 = Static478.aClass322_4;
		if (Static239.aClass63_14 == Static499.aClass63_15) {
			Static230.aBoolean633 = false;
		}
		Static239.aShortArray108 = Static591.aShortArray146 = Static268.aShortArray59 = Static397.aShortArray93 = new short[256];
		if (Static499.aClass63_15 == Static230.aClass63_16) {
			Static445.anInt7863 = 16777215;
			Static19.aBoolean355 = true;
			Static256.aShortArrayArray15 = Static452.aShortArrayArray26;
			Static200.aShortArrayArrayArray5 = Static534.aShortArrayArrayArray7;
			Static273.anInt5256 = 0;
		} else if (Static499.aClass63_15 == Static21.aClass63_1) {
			Static200.aShortArrayArrayArray5 = Static514.aShortArrayArrayArray9;
			Static256.aShortArrayArray15 = Static621.aShortArrayArray32;
		} else {
			Static200.aShortArrayArrayArray5 = Static310.aShortArrayArrayArray6;
			Static256.aShortArrayArray15 = Static157.aShortArrayArray7;
		}
		try {
			Static199.aClipboard1 = Static181.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(220) Exception local220) {
		}
		Static63.aClass32_1 = Static384.method5791(Static147.aCanvas5);
		Static6.aClass40_1 = Static384.method5786(Static147.aCanvas5);
		try {
			if (Static375.aClass359_4.aClass44_2 != null) {
				Static624.aClass31_7 = new Class31(Static375.aClass359_4.aClass44_2, 5200, 0);
				for (@Pc(242) int local242 = 0; local242 < 37; local242++) {
					Static572.aClass31Array1[local242] = new Class31(Static375.aClass359_4.aClass44Array1[local242], 6000, 0);
				}
				Static330.aClass31_3 = new Class31(Static375.aClass359_4.aClass44_4, 6000, 0);
				Static548.aClass262_4 = new Class262(255, Static624.aClass31_7, Static330.aClass31_3, 500000);
				Static215.aClass31_4 = new Class31(Static375.aClass359_4.aClass44_3, 24, 0);
				Static375.aClass359_4.aClass44_4 = null;
				Static375.aClass359_4.aClass44Array1 = null;
				Static375.aClass359_4.aClass44_3 = null;
				Static375.aClass359_4.aClass44_2 = null;
			}
		} catch (@Pc(298) IOException local298) {
			Static330.aClass31_3 = null;
			Static215.aClass31_4 = null;
			Static624.aClass31_7 = null;
			Static548.aClass262_4 = null;
		}
		if (Static95.aClass86_5 != Static267.aClass86_7) {
			Static465.aBoolean604 = true;
		}
		Static226.aString50 = Static628.aClass369_12.method8475(Static377.anInt6756);
	}
}
