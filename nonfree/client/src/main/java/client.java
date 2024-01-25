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
				Static13.method260("Argument count");
			}
			Static211.aClass261_2 = new Class261();
			Static211.aClass261_2.anInt6921 = Integer.parseInt(arg0[0]);
			Static467.aClass261_6 = new Class261();
			Static467.aClass261_6.anInt6921 = Integer.parseInt(arg0[1]);
			Static293.aClass261_4 = new Class261();
			Static293.aClass261_4.anInt6921 = Integer.parseInt(arg0[2]);
			Static405.aClass93_6 = Static385.aClass93_4;
			if (arg0[3].equals("live")) {
				Static33.aClass139_1 = Static494.aClass139_5;
			} else if (arg0[3].equals("rc")) {
				Static33.aClass139_1 = Static236.aClass139_6;
			} else if (arg0[3].equals("wip")) {
				Static33.aClass139_1 = Static85.aClass139_2;
			} else {
				Static13.method260("modewhat");
			}
			Static161.anInt3095 = Static364.method6707(arg0[4]);
			if (Static161.anInt3095 == -1) {
				if (arg0[4].equals("english")) {
					Static161.anInt3095 = 0;
				} else if (arg0[4].equals("german")) {
					Static161.anInt3095 = 1;
				} else {
					Static13.method260("language");
				}
			}
			Static170.aBoolean234 = false;
			Static144.aBoolean206 = false;
			if (arg0[5].equals("game0")) {
				Static101.aClass42_1 = Static354.aClass42_4;
			} else if (arg0[5].equals("game1")) {
				Static101.aClass42_1 = Static110.aClass42_2;
			} else {
				Static13.method260("game");
			}
			Static547.anInt9149 = 0;
			Static318.aBoolean454 = true;
			Static111.aBoolean123 = true;
			Static450.aBoolean599 = false;
			Static7.anInt227 = 0;
			Static213.aString42 = null;
			Static170.aBoolean235 = false;
			Static150.anInt2840 = Static101.aClass42_1.anInt1150;
			Static388.aString82 = null;
			Static405.anInt7235 = 0;
			Static495.aLong230 = 0L;
			Static9.aString2 = "";
			@Pc(166) client local166 = new client();
			Static475.aClient1 = local166;
			local166.method1085(Static33.aClass139_1.method3087() + 32, Static101.aClass42_1.aString8);
			Static73.aFrame1.setLocation(40, 40);
		} catch (@Pc(189) Exception local189) {
			Static419.method5957(null, local189);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method1092() {
		@Pc(7) boolean local7 = Static571.aClass205_3.method4358();
		if (!local7) {
			this.method1105();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	@Override
	protected void method1090() {
		if (Static450.aBoolean599) {
			Static221.anInt4095 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static307.method6060();
		Static175.aClass228_2 = new Class228(Static361.aClass198_3);
		Static571.aClass205_3 = new Class205();
		Static138.method2401(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static76.aClass93_3 != Static405.aClass93_6) {
			Static277.aByteArrayArray12 = new byte[50][];
		}
		Static86.aClass1_Sub30_Sub1_1 = new Class1_Sub30_Sub1(Static361.aClass198_3);
		if (Static76.aClass93_3 == Static405.aClass93_6) {
			Static211.aClass261_2.aString81 = this.getCodeBase().getHost();
		} else if (Static162.method2689(Static405.aClass93_6)) {
			Static211.aClass261_2.aString81 = this.getCodeBase().getHost();
			Static211.aClass261_2.anInt6913 = Static211.aClass261_2.anInt6921 + 40000;
			Static467.aClass261_6.anInt6913 = Static467.aClass261_6.anInt6921 + 40000;
			Static211.aClass261_2.anInt6923 = Static211.aClass261_2.anInt6921 + 50000;
			Static293.aClass261_4.anInt6913 = Static293.aClass261_4.anInt6921 + 40000;
			Static467.aClass261_6.anInt6923 = Static467.aClass261_6.anInt6921 + 50000;
			Static293.aClass261_4.anInt6923 = Static293.aClass261_4.anInt6921 + 50000;
		} else if (Static405.aClass93_6 == Static385.aClass93_4) {
			Static211.aClass261_2.aString81 = "127.0.0.1";
			Static467.aClass261_6.aString81 = "127.0.0.1";
			Static293.aClass261_4.aString81 = "127.0.0.1";
			Static211.aClass261_2.anInt6913 = Static211.aClass261_2.anInt6921 + 40000;
			Static467.aClass261_6.anInt6913 = Static467.aClass261_6.anInt6921 + 40000;
			Static293.aClass261_4.anInt6913 = Static293.aClass261_4.anInt6921 + 40000;
			Static211.aClass261_2.anInt6923 = Static211.aClass261_2.anInt6921 + 50000;
			Static467.aClass261_6.anInt6923 = Static467.aClass261_6.anInt6921 + 50000;
			Static293.aClass261_4.anInt6923 = Static293.aClass261_4.anInt6921 + 50000;
		}
		if (Static101.aClass42_1 == Static110.aClass42_2) {
			Static240.aBoolean315 = true;
			Static327.aShortArrayArray8 = Static522.aShortArrayArray18;
			Static413.anInt7318 = 16777215;
			Static103.aShortArrayArrayArray1 = Static444.aShortArrayArrayArray4;
			Static172.anInt3236 = 0;
		} else {
			Static103.aShortArrayArrayArray1 = Static239.aShortArrayArrayArray2;
			Static327.aShortArrayArray8 = Static195.aShortArrayArray9;
		}
		Static221.aClass261_3 = Static211.aClass261_2;
		if (Static354.aClass42_4 == Static101.aClass42_1) {
			Static393.aBoolean536 = false;
		}
		Static337.aShortArray50 = Static252.aShortArray37 = Static340.aShortArray60 = Static246.aShortArray36 = new short[256];
		try {
			Static375.aClipboard1 = Static475.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(214) Exception local214) {
		}
		Static326.aClass97_3 = Static78.method1321(Static103.aCanvas2);
		Static216.aClass238_1 = Static550.method7496(Static103.aCanvas2);
		try {
			if (Static361.aClass198_3.aClass268_3 != null) {
				Static535.aClass302_7 = new Class302(Static361.aClass198_3.aClass268_3, 5200, 0);
				for (@Pc(236) int local236 = 0; local236 < 35; local236++) {
					Static588.aClass302Array1[local236] = new Class302(Static361.aClass198_3.aClass268Array1[local236], 6000, 0);
				}
				Static302.aClass302_9 = new Class302(Static361.aClass198_3.aClass268_2, 6000, 0);
				Static111.aClass313_2 = new Class313(255, Static535.aClass302_7, Static302.aClass302_9, 500000);
				Static411.aClass302_8 = new Class302(Static361.aClass198_3.aClass268_1, 24, 0);
				Static361.aClass198_3.aClass268_1 = null;
				Static361.aClass198_3.aClass268_3 = null;
				Static361.aClass198_3.aClass268_2 = null;
				Static361.aClass198_3.aClass268Array1 = null;
			}
		} catch (@Pc(294) IOException local294) {
			Static535.aClass302_7 = null;
			Static411.aClass302_8 = null;
			Static302.aClass302_9 = null;
			Static111.aClass313_2 = null;
		}
		if (Static405.aClass93_6 != Static76.aClass93_3) {
			Static541.aBoolean677 = true;
		}
		if (Static101.aClass42_1 == Static354.aClass42_4) {
			Static231.aString50 = Static375.aClass253_3.method5453(Static161.anInt3095);
		} else if (Static110.aClass42_2 == Static101.aClass42_1) {
			Static231.aString50 = Static375.aClass253_4.method5453(Static161.anInt3095);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1078() {
		if (Static286.anInt5239 != 2) {
			this.method1107();
			return;
		}
		try {
			this.method1107();
		} catch (@Pc(11) ThreadDeath local11) {
			throw local11;
		} catch (@Pc(14) Throwable local14) {
			Static419.method5957(local14.getMessage() + " (Recovered) " + this.method1084(), local14);
			Static358.method7632(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1079() {
		if (Static136.aBoolean203) {
			Static132.method2304();
		}
		Static323.method4806();
		if (Static31.aClass78_18 != null) {
			Static31.aClass78_18.method6786();
		}
		if (Static180.aFrame5 != null) {
			Static66.method1054(Static180.aFrame5, Static361.aClass198_3);
			Static180.aFrame5 = null;
		}
		if (Static485.aClass43_1 != null) {
			Static485.aClass43_1.method1044();
			Static485.aClass43_1 = null;
		}
		Static516.method7173();
		Static571.aClass205_3.method4361();
		Static175.aClass228_2.method4909();
		if (Static225.aClass72_1 != null) {
			Static225.aClass72_1.method1496();
			Static225.aClass72_1 = null;
		}
		try {
			Static535.aClass302_7.method6458();
			for (@Pc(53) int local53 = 0; local53 < 35; local53++) {
				Static588.aClass302Array1[local53].method6458();
			}
			Static302.aClass302_9.method6458();
			Static411.aClass302_8.method6458();
			Static92.method1409();
		} catch (@Pc(76) Exception local76) {
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	@Override
	protected void method1088() {
		if (Static286.anInt5239 != 2) {
			this.method1101();
			return;
		}
		try {
			this.method1101();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static419.method5957(local25.getMessage() + " (Recovered) " + this.method1084(), local25);
			Static358.method7632(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1099() {
		@Pc(27) int local27;
		if (Static55.anInt1068 == 7 && Static517.anInt8881 == 0) {
			if (Static208.anInt8063 > 1) {
				Static208.anInt8063--;
				Static303.anInt5647 = Static259.anInt4739;
			}
			if (!Static406.aBoolean553) {
				Static217.method3239();
			}
			for (local27 = 0; local27 < 100 && Static259.method3767(); local27++) {
			}
		}
		Static175.anInt3258++;
		Static273.method1045(null, -1, -1);
		Static443.method6237(-1, null, -1);
		Static276.method4017();
		Static259.anInt4739++;
		for (local27 = 0; local27 < Static547.anInt9151; local27++) {
			@Pc(72) Class11_Sub1_Sub1_Sub3_Sub2 local72 = Static501.aClass1_Sub33Array1[local27].aClass11_Sub1_Sub1_Sub3_Sub2_2;
			if (local72 != null) {
				@Pc(78) byte local78 = local72.aClass354_1.aByte123;
				if ((local78 & 0x1) != 0) {
					@Pc(89) int local89 = local72.method6058();
					@Pc(113) int local113;
					if ((local78 & 0x2) != 0 && local72.anInt7604 == 0 && Math.random() * 1000.0D < 10.0D) {
						local113 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(121) int local121 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local113 != 0 || local121 != 0) {
							@Pc(135) int local135 = local113 + local72.anIntArray455[0];
							@Pc(143) int local143 = local72.anIntArray454[0] + local121;
							if (local135 < 0) {
								local135 = 0;
							} else if (Static458.anInt9736 - local89 - 1 < local135) {
								local135 = Static458.anInt9736 - local89 - 1;
							}
							if (local143 < 0) {
								local143 = 0;
							} else if (Static378.anInt6747 - local89 - 1 < local143) {
								local143 = Static378.anInt6747 - local89 - 1;
							}
							@Pc(218) int local218 = Static317.method7566(local89, -1, local72.anIntArray454[0], Static375.anIntArray392, local89, local72.anIntArray455[0], 0, 0, Static590.aClass240Array1[local72.aByte113], local143, true, Static184.anIntArray181, local89, local135);
							if (local218 > 0) {
								if (local218 > 9) {
									local218 = 9;
								}
								for (@Pc(227) int local227 = 0; local227 < local218; local227++) {
									local72.anIntArray455[local227] = Static184.anIntArray181[local218 - local227 - 1];
									local72.anIntArray454[local227] = Static375.anIntArray392[local218 - local227 - 1];
									local72.aByteArray75[local227] = 1;
								}
								local72.anInt7604 = local218;
							}
						}
					}
					Static475.method6627(local72, true);
					local113 = Static351.method5243(local72);
					Static542.method7383(local72);
					Static335.method4995(Static359.anInt6547, local72, Static68.anInt1305, local113);
					Static296.method4399(Static68.anInt1305, local72);
					Static547.method7474(local72);
				}
			}
		}
		if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
			if (Static358.anInt9363 == 2) {
				Static391.method5621();
			} else {
				Static527.method7267();
			}
			if (Static393.anInt6978 >> 9 < 14 || Static393.anInt6978 >> 9 >= Static458.anInt9736 - 14 || Static78.anInt1534 >> 9 < 14 || Static78.anInt1534 >> 9 >= Static378.anInt6747 - 14) {
				Static286.method4310();
			}
		}
		while (true) {
			@Pc(350) Class1_Sub22 local350;
			@Pc(355) Class160 local355;
			@Pc(366) Class160 local366;
			do {
				local350 = (Class1_Sub22) Static464.aClass111_64.method2553();
				if (local350 == null) {
					while (true) {
						do {
							local350 = (Class1_Sub22) Static25.aClass111_2.method2553();
							if (local350 == null) {
								while (true) {
									do {
										local350 = (Class1_Sub22) Static438.aClass111_48.method2553();
										if (local350 == null) {
											if (Static488.aClass160_36 != null) {
												Static5.method83();
											}
											if (Static518.anInt9331 % 1500 == 0) {
												Static557.method7545();
											}
											if (Static55.anInt1068 == 7 && Static517.anInt8881 == 0) {
												Static390.method7710();
											}
											Static544.method7435();
											if (Static136.aBoolean203 && Static190.aLong163 < Static480.method6650() - 60000L) {
												Static132.method2304();
											}
											for (@Pc(529) Class11_Sub5_Sub2 local529 = (Class11_Sub5_Sub2) Static386.aClass196_7.method4024(); local529 != null; local529 = (Class11_Sub5_Sub2) Static386.aClass196_7.method4028()) {
												if ((long) local529.anInt4913 < Static480.method6650() / 1000L - 5L) {
													if (local529.aShort57 > 0) {
														Static308.method4624("", 0, 5, "", local529.aString55 + Static375.aClass253_23.method5453(Static161.anInt3095), "");
													}
													if (local529.aShort57 == 0) {
														Static308.method4624("", 0, 5, "", local529.aString55 + Static375.aClass253_24.method5453(Static161.anInt3095), "");
													}
													local529.method7200();
												}
											}
											if (Static55.anInt1068 == 7 && Static517.anInt8881 == 0) {
												if (Static485.aClass43_1 == null) {
													Static136.method2372(false);
													return;
												}
												Static337.anInt6171++;
												if (Static337.anInt6171 > 50) {
													@Pc(640) Class1_Sub9 local640 = Static123.method2194(Static469.aClass235_2, Static508.aClass208_101);
													Static42.method746(local640);
												}
												try {
													Static54.method938();
													return;
												} catch (@Pc(647) IOException local647) {
													Static136.method2372(false);
													return;
												}
											}
											return;
										}
										local355 = local350.aClass160_10;
										if (local355.anInt4146 < 0) {
											break;
										}
										local366 = Static512.method7155(local355.anInt4224);
									} while (local366 == null || local366.aClass160Array1 == null || local355.anInt4146 >= local366.aClass160Array1.length || local366.aClass160Array1[local355.anInt4146] != local355);
									Static451.method6311(local350);
								}
							}
							local355 = local350.aClass160_10;
							if (local355.anInt4146 < 0) {
								break;
							}
							local366 = Static512.method7155(local355.anInt4224);
						} while (local366 == null || local366.aClass160Array1 == null || local366.aClass160Array1.length <= local355.anInt4146 || local355 != local366.aClass160Array1[local355.anInt4146]);
						Static451.method6311(local350);
					}
				}
				local355 = local350.aClass160_10;
				if (local355.anInt4146 < 0) {
					break;
				}
				local366 = Static512.method7155(local355.anInt4224);
			} while (local366 == null || local366.aClass160Array1 == null || local366.aClass160Array1.length <= local355.anInt4146 || local366.aClass160Array1[local355.anInt4146] != local355);
			Static451.method6311(local350);
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	@Override
	protected void method1089() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1101() {
		if (Static55.anInt1068 == 14) {
			return;
		}
		Static518.anInt9331++;
		if (Static518.anInt9331 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static316.anInt5790 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static129.aRandom1.setSeed((long) Static316.anInt5790);
		}
		if (Static518.anInt9331 % 50 == 0) {
			Static216.anInt3942 = Static400.anInt7179;
			Static276.anInt5041 = Static122.anInt2507;
			Static400.anInt7179 = 0;
			Static122.anInt2507 = 0;
		}
		this.method1092();
		if (Static10.aClass65_1 != null) {
			Static10.aClass65_1.method1455();
		}
		Static526.method7237();
		Static326.aClass97_3.method2366();
		Static216.aClass238_1.method5656();
		if (Static31.aClass78_18 != null) {
			Static31.aClass78_18.method6799((int) Static480.method6650());
		}
		Static479.method6646();
		Static582.anInt9584 = 0;
		Static149.anInt2839 = 0;
		for (@Pc(96) Interface14 local96 = Static326.aClass97_3.method2370(); local96 != null; local96 = Static326.aClass97_3.method2370()) {
			@Pc(102) int local102 = local96.method6443();
			if (local102 == 2 || local102 == 3) {
				@Pc(129) char local129 = local96.method6441();
				if (Static444.method6994() && (local129 == '`' || local129 == '§' || local129 == '²')) {
					if (Static130.method2281()) {
						Static122.method2189();
					} else {
						Static221.method3324();
					}
				} else if (Static149.anInt2839 < 128) {
					Static294.anInterface14Array2[Static149.anInt2839] = local96;
					Static149.anInt2839++;
				}
			} else if (local102 == 0 && Static582.anInt9584 < 75) {
				Static182.anInterface14Array1[Static582.anInt9584] = local96;
				Static582.anInt9584++;
			}
		}
		Static415.anInt7330 = 0;
		for (@Pc(179) Class1_Sub12 local179 = Static216.aClass238_1.method5654(); local179 != null; local179 = Static216.aClass238_1.method5654()) {
			@Pc(185) int local185 = local179.method6688();
			if (local185 == -1) {
				Static152.aClass111_13.method2552(local179);
			} else if (local185 == 6) {
				Static415.anInt7330 += local179.method6687();
			} else if (Static494.method6772(local185)) {
				Static121.aClass111_9.method2552(local179);
				if (Static121.aClass111_9.method2545() > 10) {
					Static121.aClass111_9.method2553();
				}
			}
		}
		if (Static130.method2281()) {
			Static369.method7309();
		}
		if (Static581.method7787(Static55.anInt1068)) {
			Static99.method1470();
			Static583.method7812();
		} else if (Static203.method3102(Static55.anInt1068)) {
			Static27.method555();
		}
		if (Static548.method7475(Static55.anInt1068) && !Static203.method3102(Static55.anInt1068)) {
			this.method1099();
			Static386.method5578();
			Static400.method5773();
		} else if (Static45.method761(Static55.anInt1068) && !Static203.method3102(Static55.anInt1068)) {
			this.method1099();
			Static400.method5773();
		} else if (Static55.anInt1068 == 12) {
			Static400.method5773();
		} else if (Static186.method3008(Static55.anInt1068) && !Static203.method3102(Static55.anInt1068)) {
			Static267.method3895();
		} else if (Static55.anInt1068 == 13) {
			Static400.method5773();
			if (Static591.anInt9713 != -3 && Static591.anInt9713 != 2 && Static591.anInt9713 != 15) {
				Static136.method2372(false);
			}
		}
		Static573.method7724(Static31.aClass78_18);
		Static121.aClass111_9.method2553();
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1080() {
		if (Static433.anApplet2 != null && Static103.aCanvas2 == null && !Static361.aClass198_3.aBoolean402) {
			try {
				@Pc(13) Class local13 = Static433.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static103.aCanvas2 = (Canvas) local17.get(Static433.anApplet2);
				local17.set(Static433.anApplet2, null);
				if (Static103.aCanvas2 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1080();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method1103(@OriginalArg(0) int arg0) {
		Static246.aClass364_1 = null;
		Static571.aClass205_3.anInt5307++;
		Static47.aClass191_1 = null;
		Static537.anInt9012 = 0;
		Static571.aClass205_3.anInt5306 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1084() {
		@Pc(12) String local12 = null;
		try {
			local12 = "[1)" + Static539.anInt9045 + "," + Static311.anInt5708 + "," + Static458.anInt9736 + "," + Static378.anInt6747 + "|";
			if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 != null) {
				local12 = local12 + "2)" + Static240.anInt4414 + "," + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0] + Static539.anInt9045) + "," + (Static311.anInt5708 + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0]) + "|";
			}
			local12 = local12 + "3)" + Static286.anInt5239 + "|4)" + Static86.aClass1_Sub30_Sub1_1.anInt6186 + "|5)" + Static470.method2475() + "|6)" + Static349.anInt6422 + "," + Static594.anInt9806 + "|";
			local12 = local12 + "7)" + Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239) + "|";
			local12 = local12 + "8)" + Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239) + "|";
			local12 = local12 + "9)" + Static86.aClass1_Sub30_Sub1_1.aBoolean478 + "|";
			local12 = local12 + "10)" + Static86.aClass1_Sub30_Sub1_1.aBoolean475 + "|";
			local12 = local12 + "11)" + Static86.aClass1_Sub30_Sub1_1.aBoolean474 + "|";
			local12 = local12 + "12)" + Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239) + "|";
			local12 = local12 + "13)" + Static221.anInt4095 + "|";
			local12 = local12 + "14)" + Static55.anInt1068;
			try {
				local12 = local12 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			try {
				if (Static286.anInt5239 == 2) {
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
									@Pc(312) Field local312 = local280.getClass().getDeclaredField("handle");
									local249.invoke(local312, Boolean.TRUE);
									local12 = local12 + "|16)" + Long.toHexString(local312.getLong(local280));
									local249.invoke(local312, Boolean.FALSE);
								}
							} catch (@Pc(348) Throwable local348) {
							}
							local249.invoke(local285, Boolean.FALSE);
						} catch (@Pc(360) Throwable local360) {
						}
					}
				}
			} catch (@Pc(368) Throwable local368) {
			}
			local12 = local12 + "]";
		} catch (@Pc(379) Throwable local379) {
		}
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method1105() {
		if (Static456.anInt7983 < Static571.aClass205_3.anInt5307) {
			Static221.aClass261_3.method5585();
			Static175.anInt3261 = (Static571.aClass205_3.anInt5307 * 50 - 50) * 5;
			if (Static175.anInt3261 > 3000) {
				Static175.anInt3261 = 3000;
			}
			if (Static571.aClass205_3.anInt5307 >= 2 && Static571.aClass205_3.anInt5306 == 6) {
				this.method1086("js5connect_outofdate");
				Static55.anInt1068 = 14;
				return;
			}
			if (Static571.aClass205_3.anInt5307 >= 4 && Static571.aClass205_3.anInt5306 == -1) {
				this.method1086("js5crc");
				Static55.anInt1068 = 14;
				return;
			}
			if (Static571.aClass205_3.anInt5307 >= 4 && Static581.method7787(Static55.anInt1068)) {
				if (Static571.aClass205_3.anInt5306 == 7 || Static571.aClass205_3.anInt5306 == 9) {
					this.method1086("js5connect_full");
				} else if (Static571.aClass205_3.anInt5306 <= 0) {
					this.method1086("js5io");
				} else if (Static356.aString73 == null) {
					this.method1086("js5connect");
				} else {
					this.method1086("js5proxy_" + Static356.aString73.trim());
				}
				Static55.anInt1068 = 14;
				return;
			}
		}
		Static456.anInt7983 = Static571.aClass205_3.anInt5307;
		if (Static175.anInt3261 > 0) {
			Static175.anInt3261--;
			return;
		}
		try {
			if (Static537.anInt9012 == 0) {
				Static47.aClass191_1 = Static221.aClass261_3.method5582(Static361.aClass198_3);
				Static537.anInt9012++;
			}
			if (Static537.anInt9012 == 1) {
				if (Static47.aClass191_1.anInt5014 == 2) {
					if (Static47.aClass191_1.anObject11 != null) {
						Static356.aString73 = (String) Static47.aClass191_1.anObject11;
					}
					this.method1103(1000);
					return;
				}
				if (Static47.aClass191_1.anInt5014 == 1) {
					Static537.anInt9012++;
				}
			}
			if (Static537.anInt9012 == 2) {
				Static246.aClass364_1 = new Class364((Socket) Static47.aClass191_1.anObject11, Static361.aClass198_3, 25000);
				@Pc(200) Class1_Sub3 local200 = new Class1_Sub3(5);
				local200.method7917(Static122.aClass325_2.anInt8863);
				local200.method7936(626);
				Static246.aClass364_1.method7849(local200.aByteArray104, 5);
				Static537.anInt9012++;
				Static368.aLong165 = Static480.method6650();
			}
			if (Static537.anInt9012 == 3) {
				if (Static581.method7787(Static55.anInt1068) || Static246.aClass364_1.method7852() > 0) {
					@Pc(253) int local253 = Static246.aClass364_1.method7845();
					if (local253 != 0) {
						this.method1103(local253);
						return;
					}
					Static537.anInt9012++;
				} else if (Static480.method6650() - Static368.aLong165 > 30000L) {
					this.method1103(1001);
					return;
				}
			}
			if (Static537.anInt9012 == 4) {
				@Pc(283) boolean local283 = Static581.method7787(Static55.anInt1068) || Static548.method7475(Static55.anInt1068) || Static45.method761(Static55.anInt1068);
				@Pc(286) Class127[] local286 = Static179.method2826();
				@Pc(294) Class1_Sub3 local294 = new Class1_Sub3(local286.length * 4);
				Static246.aClass364_1.method7850(local294.aByteArray104, local294.aByteArray104.length, 0);
				for (@Pc(305) int local305 = 0; local305 < local286.length; local305++) {
					local286[local305].method2827(local294.method7940());
				}
				Static571.aClass205_3.method4371(!local283, Static246.aClass364_1);
				Static47.aClass191_1 = null;
				Static537.anInt9012 = 0;
				Static246.aClass364_1 = null;
			}
		} catch (@Pc(337) IOException local337) {
			this.method1103(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method1107() {
		if (Static55.anInt1068 == 14) {
			return;
		}
		@Pc(16) long local16 = Static94.method5765() / 1000000L - Static77.aLong250;
		Static77.aLong250 = Static94.method5765() / 1000000L;
		@Pc(29) boolean local29 = Static17.method395();
		if (local29 && Static11.aBoolean8 && Static78.aClass76_4 != null) {
			Static78.aClass76_4.method2507();
		}
		if (Static574.method7731(Static55.anInt1068)) {
			if (Static154.aLong76 != 0L && Static480.method6650() > Static154.aLong76) {
				Static447.method6284(Static86.aClass1_Sub30_Sub1_1.anInt6201, false, Static470.method2475(), Static86.aClass1_Sub30_Sub1_1.anInt6190);
			} else if (!Static31.aClass78_18.method6787() && Static194.aBoolean273) {
				Static473.method6514();
			}
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (Static180.aFrame5 == null) {
			@Pc(83) Container local83;
			if (Static73.aFrame1 != null) {
				local83 = Static73.aFrame1;
			} else if (Static433.anApplet2 == null) {
				local83 = Static149.anApplet_Sub1_1;
			} else {
				local83 = Static433.anApplet2;
			}
			local95 = local83.getSize().width;
			local99 = local83.getSize().height;
			if (local83 == Static73.aFrame1) {
				@Pc(105) Insets local105 = Static73.aFrame1.getInsets();
				local95 -= local105.right + local105.left;
				local99 -= local105.bottom + local105.top;
			}
			if (Static8.anInt5988 != local95 || local99 != Static65.anInt1195 || Static174.aBoolean239) {
				if (Static31.aClass78_18 == null || Static31.aClass78_18.method6828()) {
					Static307.method6060();
				} else {
					Static65.anInt1195 = local99;
					Static8.anInt5988 = local95;
				}
				Static154.aLong76 = Static480.method6650() + 500L;
				Static174.aBoolean239 = false;
			}
		}
		if (Static180.aFrame5 != null && !Static13.aBoolean9 && Static574.method7731(Static55.anInt1068)) {
			Static447.method6284(-1, false, Static86.aClass1_Sub30_Sub1_1.anInt6199, -1);
		}
		@Pc(174) boolean local174 = false;
		if (Static47.aBoolean50) {
			local174 = true;
			Static47.aBoolean50 = false;
		}
		if (local174) {
			Static8.method4849();
		}
		if (Static31.aClass78_18 != null && Static31.aClass78_18.method6787() || Static470.method2475() != 1) {
			Static506.method7088();
		}
		if (Static581.method7787(Static55.anInt1068)) {
			Static541.method7357(local174);
		} else if (Static519.method7182(Static55.anInt1068)) {
			Static500.method7049();
		} else if (Static533.method7292(Static55.anInt1068)) {
			Static500.method7049();
		} else if (Static203.method3102(Static55.anInt1068)) {
			if (Static421.anInt7406 == 1) {
				if (Static382.anInt9706 < Static128.anInt2572) {
					Static382.anInt9706 = Static128.anInt2572;
				}
				local95 = (Static382.anInt9706 - Static128.anInt2572) * 50 / Static382.anInt9706;
				Static307.method6069(Static375.aClass253_16.method5453(Static161.anInt3095) + "<br>(" + local95 + "%)", Static339.aClass96_9, true, Static31.aClass78_18, Static552.aClass352_20);
			} else if (Static421.anInt7406 == 2) {
				if (Static104.anInt1782 > Static177.anInt8812) {
					Static177.anInt8812 = Static104.anInt1782;
				}
				local95 = (Static177.anInt8812 - Static104.anInt1782) * 50 / Static177.anInt8812 + 50;
				Static307.method6069(Static375.aClass253_16.method5453(Static161.anInt3095) + "<br>(" + local95 + "%)", Static339.aClass96_9, true, Static31.aClass78_18, Static552.aClass352_20);
			} else {
				Static307.method6069(Static375.aClass253_16.method5453(Static161.anInt3095), Static339.aClass96_9, true, Static31.aClass78_18, Static552.aClass352_20);
			}
		} else if (Static55.anInt1068 == 10) {
			Static333.method4914(local16);
		} else if (Static55.anInt1068 == 13) {
			Static307.method6069(Static375.aClass253_18.method5453(Static161.anInt3095) + "<br>" + Static375.aClass253_19.method5453(Static161.anInt3095), Static339.aClass96_9, false, Static31.aClass78_18, Static552.aClass352_20);
		}
		if (Static235.anInt4324 == 3) {
			for (local95 = 0; local95 < Static231.anInt4302; local95++) {
				@Pc(374) Rectangle local374 = Class295.aRectangleArray2[local95];
				if (Static529.aBooleanArray31[local95]) {
					Static31.aClass78_18.method6800(-1996553985, local374.height, local374.x, local374.width, local374.y);
				} else if (Static102.aBooleanArray7[local95]) {
					Static31.aClass78_18.method6800(-1996554240, local374.height, local374.x, local374.width, local374.y);
				}
			}
		}
		if (Static130.method2281()) {
			Static284.method7242(Static31.aClass78_18);
		}
		if (Static361.aClass198_3.aBoolean402 && Static574.method7731(Static55.anInt1068) && Static235.anInt4324 == 0 && Static470.method2475() == 1 && !local174) {
			local95 = 0;
			for (local99 = 0; local99 < Static231.anInt4302; local99++) {
				if (Static102.aBooleanArray7[local99]) {
					Static102.aBooleanArray7[local99] = false;
					Static2.aRectangleArray1[local95++] = Class295.aRectangleArray2[local99];
				}
			}
			try {
				Static31.aClass78_18.method6821(Static2.aRectangleArray1, local95);
			} catch (@Pc(518) Exception_Sub1 local518) {
			}
		} else if (!Static581.method7787(Static55.anInt1068)) {
			for (local95 = 0; local95 < Static231.anInt4302; local95++) {
				Static102.aBooleanArray7[local95] = false;
			}
			try {
				Static31.aClass78_18.method6820();
			} catch (@Pc(466) Exception_Sub1 local466) {
				Static419.method5957(local466.getMessage() + " (Recovered) " + this.method1084(), local466);
				Static358.method7632(0);
			}
		}
		if (Static86.aClass1_Sub30_Sub1_1.anInt6204 == 0) {
			Static408.method5841(15L);
		} else if (Static86.aClass1_Sub30_Sub1_1.anInt6204 == 1) {
			Static408.method5841(10L);
		} else if (Static86.aClass1_Sub30_Sub1_1.anInt6204 == 2) {
			Static408.method5841(5L);
		} else if (Static86.aClass1_Sub30_Sub1_1.anInt6204 == 3) {
			Static408.method5841(2L);
		}
		if (Static169.aBoolean232) {
			Static253.method3714();
		}
		if (Static86.aClass1_Sub30_Sub1_1.aBoolean482 && Static55.anInt1068 == 3 && Static165.anInt3165 != -1) {
			Static86.aClass1_Sub30_Sub1_1.aBoolean482 = false;
			Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1082()) {
			return;
		}
		Static211.aClass261_2 = new Class261();
		Static211.aClass261_2.anInt6921 = Integer.parseInt(this.getParameter("worldid"));
		Static467.aClass261_6 = new Class261();
		Static467.aClass261_6.anInt6921 = Integer.parseInt(this.getParameter("lobbyid"));
		Static467.aClass261_6.aString81 = this.getParameter("lobbyaddress");
		Static293.aClass261_4 = new Class261();
		Static293.aClass261_4.anInt6921 = Integer.parseInt(this.getParameter("demoid"));
		Static293.aClass261_4.aString81 = this.getParameter("demoaddress");
		Static405.aClass93_6 = Static265.method3883(Integer.parseInt(this.getParameter("modewhere")));
		if (Static405.aClass93_6 == Static385.aClass93_4) {
			Static405.aClass93_6 = Static403.aClass93_5;
		} else if (!Static162.method2689(Static405.aClass93_6) && Static405.aClass93_6 != Static76.aClass93_3) {
			Static405.aClass93_6 = Static76.aClass93_3;
		}
		Static33.aClass139_1 = Static220.method4684(Integer.parseInt(this.getParameter("modewhat")));
		if (Static33.aClass139_1 != Static85.aClass139_2 && Static33.aClass139_1 != Static236.aClass139_6 && Static494.aClass139_5 != Static33.aClass139_1) {
			Static33.aClass139_1 = Static494.aClass139_5;
		}
		try {
			Static161.anInt3095 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static161.anInt3095 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static170.aBoolean234 = true;
		} else {
			Static170.aBoolean234 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static144.aBoolean206 = true;
		} else {
			Static144.aBoolean206 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static578.aBoolean710 = true;
		} else {
			Static578.aBoolean710 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static101.aClass42_1 = Static354.aClass42_4;
			} else if (local152.equals("1")) {
				Static101.aClass42_1 = Static110.aClass42_2;
			}
		}
		try {
			Static547.anInt9149 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static547.anInt9149 = 0;
		}
		Static392.aString83 = this.getParameter("quiturl");
		Static9.aString2 = this.getParameter("settings");
		if (Static9.aString2 == null) {
			Static9.aString2 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static7.anInt227 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static7.anInt227 = 0;
			}
		}
		Static150.anInt2840 = Integer.parseInt(this.getParameter("colourid"));
		if (Static150.anInt2840 < 0 || Static416.aColorArray1.length <= Static150.anInt2840) {
			Static150.anInt2840 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static318.aBoolean454 = true;
			Static111.aBoolean123 = true;
		}
		@Pc(232) String local232 = this.getParameter("frombilling");
		if (local232 != null && local232.equals("true")) {
			Static170.aBoolean235 = true;
		}
		Static213.aString42 = this.getParameter("sskey");
		if (Static213.aString42 != null && Static213.aString42.length() < 2) {
			Static213.aString42 = null;
		}
		@Pc(256) String local256 = this.getParameter("force64mb");
		if (local256 != null && local256.equals("true")) {
			Static450.aBoolean599 = true;
		}
		@Pc(268) String local268 = this.getParameter("worldflags");
		if (local268 != null) {
			try {
				Static405.anInt7235 = Integer.parseInt(local268);
			} catch (@Pc(275) Exception local275) {
			}
		}
		@Pc(280) String local280 = this.getParameter("userFlow");
		if (local280 != null) {
			try {
				Static495.aLong230 = Long.parseLong(local280);
			} catch (@Pc(287) NumberFormatException local287) {
			}
		}
		Static388.aString82 = this.getParameter("additionalInfo");
		if (Static388.aString82 != null && Static388.aString82.length() > 50) {
			Static388.aString82 = null;
		}
		if (Static354.aClass42_4 == Static101.aClass42_1) {
			Static318.anInt5819 = 765;
			Static192.anInt3766 = 503;
		} else if (Static110.aClass42_2 == Static101.aClass42_1) {
			Static318.anInt5819 = 640;
			Static192.anInt3766 = 480;
		}
		Static475.aClient1 = this;
		this.method1076(Static192.anInt3766, Static318.anInt5819, Static33.aClass139_1.method3087() + 32, Static101.aClass42_1.aString8);
	}
}
