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
				Static427.method5897("Argument count");
			}
			Static338.aClass212_8 = new Class212();
			Static338.aClass212_8.anInt6145 = Integer.parseInt(arg0[0]);
			Static234.aClass212_10 = new Class212();
			Static234.aClass212_10.anInt6145 = Integer.parseInt(arg0[1]);
			Static563.aClass212_9 = new Class212();
			Static563.aClass212_9.anInt6145 = Integer.parseInt(arg0[2]);
			Static332.aClass5_3 = Static512.aClass5_9;
			if (arg0[3].equals("live")) {
				Static527.aClass153_147 = Static171.aClass153_52;
			} else if (arg0[3].equals("rc")) {
				Static527.aClass153_147 = Static451.aClass153_116;
			} else if (arg0[3].equals("wip")) {
				Static527.aClass153_147 = Static579.aClass153_145;
			} else {
				Static427.method5897("modewhat");
			}
			Static201.anInt4321 = Static440.method6137(arg0[4]);
			if (Static201.anInt4321 == -1) {
				if (arg0[4].equals("english")) {
					Static201.anInt4321 = 0;
				} else if (arg0[4].equals("german")) {
					Static201.anInt4321 = 1;
				} else {
					Static427.method5897("language");
				}
			}
			Static215.aBoolean292 = false;
			Static458.aBoolean553 = false;
			if (arg0[5].equals("game0")) {
				Static31.aClass89_1 = Static70.aClass89_3;
			} else if (arg0[5].equals("game1")) {
				Static31.aClass89_1 = Static40.aClass89_2;
			} else {
				Static427.method5897("game");
			}
			Static234.anInt10334 = 0;
			Static148.aString76 = null;
			Static574.aBoolean649 = false;
			Static503.anInt8662 = 0;
			Static303.aString152 = null;
			Static6.anInt44 = Static31.aClass89_1.anInt2860;
			Static182.aLong91 = 0L;
			Static91.aBoolean170 = true;
			Static577.aBoolean689 = true;
			Static44.aString268 = "";
			Static437.aBoolean538 = false;
			Static501.anInt8649 = 0;
			@Pc(166) client local166 = new client();
			Static507.aClient1 = local166;
			local166.method1688(Static527.aClass153_147.method3813() + 32, Static31.aClass89_1.aString66);
			Static302.aFrame2.setLocation(40, 40);
		} catch (@Pc(190) Exception local190) {
			Static332.method1390(local190, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1702() {
		@Pc(21) int local21;
		if (Static409.anInt1461 == 7 && Static340.anInt6133 == 0) {
			if (Static507.anInt8783 > 1) {
				Static194.anInt4230 = Static523.anInt9188;
				Static507.anInt8783--;
			}
			if (!Static289.aBoolean370) {
				Static97.method2033();
			}
			for (local21 = 0; local21 < 100 && Static256.method3985(); local21++) {
			}
		}
		Static208.anInt4448++;
		Static313.method4669(-1, null, -1);
		Static183.method3258(null, -1, -1);
		Static567.method4398();
		Static523.anInt9188++;
		for (local21 = 0; local21 < Static238.anInt4737; local21++) {
			@Pc(67) Class25_Sub2_Sub2_Sub5_Sub2 local67 = Static33.aClass3_Sub39Array1[local21].aClass25_Sub2_Sub2_Sub5_Sub2_2;
			if (local67 != null) {
				@Pc(73) byte local73 = local67.aClass213_1.aByte81;
				if ((local73 & 0x1) != 0) {
					@Pc(84) int local84 = local67.method6668();
					@Pc(108) int local108;
					if ((local73 & 0x2) != 0 && local67.anInt8580 == 0 && Math.random() * 1000.0D < 10.0D) {
						local108 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(116) int local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local108 != 0 || local116 != 0) {
							@Pc(130) int local130 = local108 + local67.anIntArray512[0];
							if (local130 < 0) {
								local130 = 0;
							} else if (local130 > Static345.anInt6228 - local84 - 1) {
								local130 = Static345.anInt6228 - local84 - 1;
							}
							@Pc(162) int local162 = local116 + local67.anIntArray513[0];
							if (local162 < 0) {
								local162 = 0;
							} else if (local162 > Static535.anInt9341 - local84 - 1) {
								local162 = Static535.anInt9341 - local84 - 1;
							}
							@Pc(209) int local209 = Static544.method7464(0, -1, local130, 0, Static499.anIntArray272, local84, Static187.aClass220Array1[local67.aByte117], Static59.anIntArray44, local67.anIntArray512[0], local162, true, local67.anIntArray513[0], local84, local84);
							if (local209 > 0) {
								if (local209 > 9) {
									local209 = 9;
								}
								for (@Pc(221) int local221 = 0; local221 < local209; local221++) {
									local67.anIntArray512[local221] = Static59.anIntArray44[local209 - local221 - 1];
									local67.anIntArray513[local221] = Static499.anIntArray272[local209 - local221 - 1];
									local67.aByteArray209[local221] = 1;
								}
								local67.anInt8580 = local209;
							}
						}
					}
					Static172.method3061(true, local67);
					local108 = Static475.method6513(local67);
					Static590.method8118(local67);
					Static477.method6524(Static448.anInt10226, local67, Static516.anInt8891, local108);
					Static129.method2404(Static448.anInt10226, local67);
					Static178.method3177(local67);
				}
			}
		}
		if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
			if (Static188.anInt4080 == 2) {
				Static460.method6317();
			} else {
				Static121.method2334();
			}
			if (Static407.anInt7345 >> 9 < 14 || Static345.anInt6228 - 14 <= Static407.anInt7345 >> 9 || Static418.anInt7466 >> 9 < 14 || Static418.anInt7466 >> 9 >= Static535.anInt9341 - 14) {
				Static432.method5975();
			}
		}
		while (true) {
			@Pc(347) Class3_Sub36 local347;
			@Pc(352) Class251 local352;
			@Pc(360) Class251 local360;
			do {
				local347 = (Class3_Sub36) Static106.aClass244_19.method5578();
				if (local347 == null) {
					while (true) {
						do {
							local347 = (Class3_Sub36) Static461.aClass244_58.method5578();
							if (local347 == null) {
								while (true) {
									do {
										local347 = (Class3_Sub36) Static206.aClass244_38.method5578();
										if (local347 == null) {
											if (Static2.aClass251_1 != null) {
												Static20.method213();
											}
											if (Static397.anInt6998 % 1500 == 0) {
												Static458.method6302();
											}
											if (Static409.anInt1461 == 7 && Static340.anInt6133 == 0) {
												Static575.method7822();
											}
											Static226.method3713();
											if (Static50.aBoolean109 && Static141.aLong67 < Static96.method2000() - 60000L) {
												Static176.method3157();
											}
											for (@Pc(517) Class25_Sub5_Sub2 local517 = (Class25_Sub5_Sub2) Static498.aClass269_7.method5974(); local517 != null; local517 = (Class25_Sub5_Sub2) Static498.aClass269_7.method5979()) {
												if ((long) local517.anInt4079 < Static96.method2000() / 1000L - 5L) {
													if (local517.aShort47 > 0) {
														Static295.method4425("", "", local517.aString103 + Static573.aClass350_23.method7730(Static201.anInt4321), 0, 5, "");
													}
													if (local517.aShort47 == 0) {
														Static295.method4425("", "", local517.aString103 + Static573.aClass350_24.method7730(Static201.anInt4321), 0, 5, "");
													}
													local517.method6959();
												}
											}
											if (Static409.anInt1461 == 7 && Static340.anInt6133 == 0) {
												if (Static451.aClass223_6 == null) {
													Static218.method6807(false);
													return;
												}
												Static171.anInt3775++;
												if (Static171.anInt3775 > 50) {
													@Pc(614) Class3_Sub10 local614 = Static129.method2403(Static452.aClass353_2, Static341.aClass287_100);
													Static193.method3398(local614);
												}
												try {
													Static411.method5773();
													return;
												} catch (@Pc(621) IOException local621) {
													Static218.method6807(false);
													return;
												}
											}
											return;
										}
										local352 = local347.aClass251_8;
										if (local352.anInt7268 < 0) {
											break;
										}
										local360 = Static105.method2180(local352.anInt7280);
									} while (local360 == null || local360.aClass251Array3 == null || local360.aClass251Array3.length <= local352.anInt7268 || local352 != local360.aClass251Array3[local352.anInt7268]);
									Static583.method7919(local347);
								}
							}
							local352 = local347.aClass251_8;
							if (local352.anInt7268 < 0) {
								break;
							}
							local360 = Static105.method2180(local352.anInt7280);
						} while (local360 == null || local360.aClass251Array3 == null || local360.aClass251Array3.length <= local352.anInt7268 || local352 != local360.aClass251Array3[local352.anInt7268]);
						Static583.method7919(local347);
					}
				}
				local352 = local347.aClass251_8;
				if (local352.anInt7268 < 0) {
					break;
				}
				local360 = Static105.method2180(local352.anInt7280);
			} while (local360 == null || local360.aClass251Array3 == null || local360.aClass251Array3.length <= local352.anInt7268 || local352 != local360.aClass251Array3[local352.anInt7268]);
			Static583.method7919(local347);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1690() {
		if (Static37.anInt1122 != 2) {
			this.method1719();
			return;
		}
		try {
			this.method1719();
		} catch (@Pc(18) ThreadDeath local18) {
			throw local18;
		} catch (@Pc(21) Throwable local21) {
			Static332.method1390(local21, local21.getMessage() + " (Recovered) " + this.method1698());
			Static47.method1180(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1684() {
		if (Static437.aBoolean538) {
			Static372.anInt6489 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static100.method7582();
		Static533.aClass291_3 = new Class291(Static467.aClass168_12);
		Static153.aClass117_1 = new Class117();
		Static582.method7916(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static412.aClass5_7 != Static332.aClass5_3) {
			Static44.aByteArrayArray53 = new byte[50][];
		}
		Static348.aClass3_Sub51_Sub1_5 = new Class3_Sub51_Sub1(Static467.aClass168_12);
		if (Static332.aClass5_3 == Static412.aClass5_7) {
			Static338.aClass212_8.aString157 = this.getCodeBase().getHost();
		} else if (Static399.method5605(Static332.aClass5_3)) {
			Static338.aClass212_8.aString157 = this.getCodeBase().getHost();
			Static338.aClass212_8.anInt6137 = Static338.aClass212_8.anInt6145 + 40000;
			Static234.aClass212_10.anInt6137 = Static234.aClass212_10.anInt6145 + 40000;
			Static563.aClass212_9.anInt6137 = Static563.aClass212_9.anInt6145 + 40000;
			Static338.aClass212_8.anInt6142 = Static338.aClass212_8.anInt6145 + 50000;
			Static234.aClass212_10.anInt6142 = Static234.aClass212_10.anInt6145 + 50000;
			Static563.aClass212_9.anInt6142 = Static563.aClass212_9.anInt6145 + 50000;
		} else if (Static332.aClass5_3 == Static512.aClass5_9) {
			Static338.aClass212_8.aString157 = "127.0.0.1";
			Static234.aClass212_10.aString157 = "127.0.0.1";
			Static338.aClass212_8.anInt6137 = Static338.aClass212_8.anInt6145 + 40000;
			Static563.aClass212_9.aString157 = "127.0.0.1";
			Static234.aClass212_10.anInt6137 = Static234.aClass212_10.anInt6145 + 40000;
			Static563.aClass212_9.anInt6137 = Static563.aClass212_9.anInt6145 + 40000;
			Static338.aClass212_8.anInt6142 = Static338.aClass212_8.anInt6145 + 50000;
			Static234.aClass212_10.anInt6142 = Static234.aClass212_10.anInt6145 + 50000;
			Static563.aClass212_9.anInt6142 = Static563.aClass212_9.anInt6145 + 50000;
		}
		if (Static31.aClass89_1 == Static40.aClass89_2) {
			Static83.anInt2240 = 16777215;
			Static171.aBoolean264 = true;
			Static589.aShortArrayArray13 = Static80.aShortArrayArray1;
			Static276.aShortArrayArrayArray1 = Static547.aShortArrayArrayArray3;
			Static19.anInt200 = 0;
		} else {
			Static589.aShortArrayArray13 = Static160.aShortArrayArray3;
			Static276.aShortArrayArrayArray1 = Static477.aShortArrayArrayArray2;
		}
		Static104.aClass212_1 = Static338.aClass212_8;
		Static309.aShortArray77 = Static508.aShortArray130 = Static456.aShortArray114 = Static429.aShortArray115 = new short[256];
		if (Static31.aClass89_1 == Static70.aClass89_3) {
			Static98.aBoolean176 = false;
		}
		try {
			Static454.aClipboard1 = Static507.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(210) Exception local210) {
		}
		Static446.aClass237_1 = Static368.method5217(Static129.aCanvas6);
		Static234.aClass54_4 = Static90.method1970(Static129.aCanvas6);
		try {
			if (Static467.aClass168_12.aClass272_2 != null) {
				Static437.aClass361_5 = new Class361(Static467.aClass168_12.aClass272_2, 5200, 0);
				for (@Pc(232) int local232 = 0; local232 < 35; local232++) {
					Static390.aClass361Array1[local232] = new Class361(Static467.aClass168_12.aClass272Array1[local232], 6000, 0);
				}
				Static35.aClass361_2 = new Class361(Static467.aClass168_12.aClass272_1, 6000, 0);
				Static51.aClass215_7 = new Class215(255, Static437.aClass361_5, Static35.aClass361_2, 500000);
				Static25.aClass361_1 = new Class361(Static467.aClass168_12.aClass272_3, 24, 0);
				Static467.aClass168_12.aClass272_3 = null;
				Static467.aClass168_12.aClass272_2 = null;
				Static467.aClass168_12.aClass272_1 = null;
				Static467.aClass168_12.aClass272Array1 = null;
			}
		} catch (@Pc(290) IOException local290) {
			Static35.aClass361_2 = null;
			Static25.aClass361_1 = null;
			Static437.aClass361_5 = null;
			Static51.aClass215_7 = null;
		}
		if (Static412.aClass5_7 != Static332.aClass5_3) {
			Static306.aBoolean385 = true;
		}
		if (Static31.aClass89_1 == Static70.aClass89_3) {
			Static591.aString266 = Static573.aClass350_3.method7730(Static201.anInt4321);
		} else if (Static31.aClass89_1 == Static40.aClass89_2) {
			Static591.aString266 = Static573.aClass350_4.method7730(Static201.anInt4321);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1698() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static321.anInt5874 + "," + Static137.anInt3293 + "," + Static345.anInt6228 + "," + Static535.anInt9341 + "|";
			if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 != null) {
				local7 = local7 + "2)" + Static594.anInt10310 + "," + (Static321.anInt5874 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0]) + "," + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0] + Static137.anInt3293) + "|";
			}
			local7 = local7 + "3)" + Static37.anInt1122 + "|4)" + Static348.aClass3_Sub51_Sub1_5.anInt9941 + "|5)" + Static534.method7318() + "|6)" + Static34.anInt3201 + "," + Static492.anInt8445 + "|";
			local7 = local7 + "7)" + Static348.aClass3_Sub51_Sub1_5.method7824(Static37.anInt1122) + "|";
			local7 = local7 + "8)" + Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122) + "|";
			local7 = local7 + "9)" + Static348.aClass3_Sub51_Sub1_5.aBoolean674 + "|";
			local7 = local7 + "10)" + Static348.aClass3_Sub51_Sub1_5.aBoolean678 + "|";
			local7 = local7 + "11)" + Static348.aClass3_Sub51_Sub1_5.aBoolean686 + "|";
			local7 = local7 + "12)" + Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122) + "|";
			local7 = local7 + "13)" + Static372.anInt6489 + "|";
			local7 = local7 + "14)" + Static409.anInt1461;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(221) Throwable local221) {
			}
			try {
				if (Static37.anInt1122 == 2) {
					@Pc(227) Class local227 = Class.forName("java.lang.ClassLoader");
					@Pc(231) Field local231 = local227.getDeclaredField("nativeLibraries");
					@Pc(234) Class local234 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(244) Method local244 = local234.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local244.invoke(local231, Boolean.TRUE);
					@Pc(267) Vector local267 = (Vector) local231.get(client.class.getClassLoader());
					for (@Pc(269) int local269 = 0; local269 < local267.size(); local269++) {
						try {
							@Pc(275) Object local275 = local267.elementAt(local269);
							@Pc(280) Field local280 = local275.getClass().getDeclaredField("name");
							local244.invoke(local280, Boolean.TRUE);
							try {
								@Pc(295) String local295 = (String) local280.get(local275);
								if (local295 != null && local295.indexOf("sw3d.dll") != -1) {
									@Pc(307) Field local307 = local275.getClass().getDeclaredField("handle");
									local244.invoke(local307, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local307.getLong(local275));
									local244.invoke(local307, Boolean.FALSE);
								}
							} catch (@Pc(343) Throwable local343) {
							}
							local244.invoke(local280, Boolean.FALSE);
						} catch (@Pc(355) Throwable local355) {
						}
					}
				}
			} catch (@Pc(363) Throwable local363) {
			}
			local7 = local7 + "]";
		} catch (@Pc(382) Throwable local382) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1707() {
		@Pc(11) boolean local11 = Static153.aClass117_1.method3167();
		if (!local11) {
			this.method1720();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1689() {
		if (Static37.anInt1122 != 2) {
			this.method1715();
			return;
		}
		try {
			this.method1715();
		} catch (@Pc(13) ThreadDeath local13) {
			throw local13;
		} catch (@Pc(16) Throwable local16) {
			Static332.method1390(local16, local16.getMessage() + " (Recovered) " + this.method1698());
			Static47.method1180(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	public synchronized void method1687() {
		if (Static304.anApplet1 != null && Static129.aCanvas6 == null && !Static467.aClass168_12.aBoolean335) {
			try {
				@Pc(13) Class local13 = Static304.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static129.aCanvas6 = (Canvas) local17.get(Static304.anApplet1);
				local17.set(Static304.anApplet1, null);
				if (Static129.aCanvas6 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1687();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1715() {
		if (Static409.anInt1461 == 14) {
			return;
		}
		@Pc(16) long local16 = Static378.method5282() / 1000000L - Static295.aLong152;
		Static295.aLong152 = Static378.method5282() / 1000000L;
		@Pc(24) boolean local24 = Static138.method2722();
		if (local24 && Static168.aBoolean262 && Static229.aClass58_5 != null) {
			Static229.aClass58_5.method5326();
		}
		if (Static214.method3591(Static409.anInt1461)) {
			if (Static173.aLong85 != 0L && Static96.method2000() > Static173.aLong85) {
				Static276.method4180(false, Static348.aClass3_Sub51_Sub1_5.anInt9970, Static534.method7318(), Static348.aClass3_Sub51_Sub1_5.anInt9947);
			} else if (!Static319.aClass31_11.method8028() && Static32.aBoolean231) {
				Static109.method2201();
			}
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (Static178.aFrame3 == null) {
			@Pc(78) Container local78;
			if (Static302.aFrame2 != null) {
				local78 = Static302.aFrame2;
			} else if (Static304.anApplet1 == null) {
				local78 = Static350.anApplet_Sub1_1;
			} else {
				local78 = Static304.anApplet1;
			}
			local90 = local78.getSize().width;
			local94 = local78.getSize().height;
			if (Static302.aFrame2 == local78) {
				@Pc(100) Insets local100 = Static302.aFrame2.getInsets();
				local90 -= local100.right + local100.left;
				local94 -= local100.bottom + local100.top;
			}
			if (Static483.anInt8361 != local90 || local94 != Static429.anInt7984 || Static251.aBoolean447) {
				if (Static319.aClass31_11 == null || Static319.aClass31_11.method8089()) {
					Static100.method7582();
				} else {
					Static483.anInt8361 = local90;
					Static429.anInt7984 = local94;
				}
				Static173.aLong85 = Static96.method2000() + 500L;
				Static251.aBoolean447 = false;
			}
		}
		if (Static178.aFrame3 != null && !Static269.aBoolean336 && Static214.method3591(Static409.anInt1461)) {
			Static276.method4180(false, -1, Static348.aClass3_Sub51_Sub1_5.anInt9953, -1);
		}
		@Pc(165) boolean local165 = false;
		if (Static69.aBoolean465) {
			local165 = true;
			Static69.aBoolean465 = false;
		}
		if (local165) {
			Static239.method3812();
		}
		if (Static319.aClass31_11 != null && Static319.aClass31_11.method8028() || Static534.method7318() != 1) {
			Static246.method3899();
		}
		if (Static39.method1075(Static409.anInt1461)) {
			Static344.method5011(local165);
		} else if (Static150.method2828(Static409.anInt1461)) {
			Static79.method1842();
		} else if (Static449.method6203(Static409.anInt1461)) {
			Static79.method1842();
		} else if (Static338.method4924(Static409.anInt1461)) {
			if (Static336.anInt6066 == 1) {
				if (Static467.anInt8132 < Static75.anInt2068) {
					Static467.anInt8132 = Static75.anInt2068;
				}
				local90 = (Static467.anInt8132 - Static75.anInt2068) * 50 / Static467.anInt8132;
				Static452.method6235(Static2.aClass63_1, Static573.aClass350_16.method7730(Static201.anInt4321) + "<br>(" + local90 + "%)", Static319.aClass31_11, Static318.aClass328_8, true);
			} else if (Static336.anInt6066 == 2) {
				if (Static218.anInt8725 > Static96.anInt2368) {
					Static96.anInt2368 = Static218.anInt8725;
				}
				local90 = (Static96.anInt2368 - Static218.anInt8725) * 50 / Static96.anInt2368 + 50;
				Static452.method6235(Static2.aClass63_1, Static573.aClass350_16.method7730(Static201.anInt4321) + "<br>(" + local90 + "%)", Static319.aClass31_11, Static318.aClass328_8, true);
			} else {
				Static452.method6235(Static2.aClass63_1, Static573.aClass350_16.method7730(Static201.anInt4321), Static319.aClass31_11, Static318.aClass328_8, true);
			}
		} else if (Static409.anInt1461 == 10) {
			Static150.method2826(local16);
		} else if (Static409.anInt1461 == 13) {
			Static452.method6235(Static2.aClass63_1, Static573.aClass350_18.method7730(Static201.anInt4321) + "<br>" + Static573.aClass350_19.method7730(Static201.anInt4321), Static319.aClass31_11, Static318.aClass328_8, false);
		}
		if (Static92.anInt2339 == 3) {
			for (local94 = 0; local94 < Static314.anInt5780; local94++) {
				@Pc(368) Rectangle local368 = Class3_Sub16_Sub1.aRectangleArray2[local94];
				if (Static178.aBooleanArray11[local94]) {
					Static319.aClass31_11.method8094(local368.y, local368.x, local368.height, local368.width, -1996553985);
				} else if (Static383.aBooleanArray20[local94]) {
					Static319.aClass31_11.method8094(local368.y, local368.x, local368.height, local368.width, -1996554240);
				}
			}
		}
		if (Static418.method5830()) {
			Static72.method1743(Static319.aClass31_11);
		}
		if (Static467.aClass168_12.aBoolean335 && Static214.method3591(Static409.anInt1461) && Static92.anInt2339 == 0 && Static534.method7318() == 1 && !local165) {
			local94 = 0;
			for (@Pc(437) int local437 = 0; local437 < Static314.anInt5780; local437++) {
				if (Static383.aBooleanArray20[local437]) {
					Static383.aBooleanArray20[local437] = false;
					Static66.aRectangleArray1[local94++] = Class3_Sub16_Sub1.aRectangleArray2[local437];
				}
			}
			try {
				Static319.aClass31_11.method8071(Static66.aRectangleArray1, local94);
			} catch (@Pc(468) Exception_Sub1 local468) {
			}
		} else if (!Static39.method1075(Static409.anInt1461)) {
			for (local94 = 0; local94 < Static314.anInt5780; local94++) {
				Static383.aBooleanArray20[local94] = false;
			}
			try {
				Static319.aClass31_11.method8082();
			} catch (@Pc(494) Exception_Sub1 local494) {
				Static332.method1390(local494, local494.getMessage() + " (Recovered) " + this.method1698());
				Static47.method1180(0);
			}
		}
		if (Static348.aClass3_Sub51_Sub1_5.anInt9944 == 0) {
			Static373.method5240(15L);
		} else if (Static348.aClass3_Sub51_Sub1_5.anInt9944 == 1) {
			Static373.method5240(10L);
		} else if (Static348.aClass3_Sub51_Sub1_5.anInt9944 == 2) {
			Static373.method5240(5L);
		} else if (Static348.aClass3_Sub51_Sub1_5.anInt9944 == 3) {
			Static373.method5240(2L);
		}
		if (Static218.aBoolean584) {
			Static25.method244();
		}
		if (Static348.aClass3_Sub51_Sub1_5.aBoolean687 && Static409.anInt1461 == 3 && Static79.anInt2118 != -1) {
			Static348.aClass3_Sub51_Sub1_5.aBoolean687 = false;
			Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1683() {
		if (Static50.aBoolean109) {
			Static176.method3157();
		}
		Static451.method6315();
		if (Static319.aClass31_11 != null) {
			Static319.aClass31_11.method8053();
		}
		if (Static178.aFrame3 != null) {
			Static244.method3850(Static467.aClass168_12, Static178.aFrame3);
			Static178.aFrame3 = null;
		}
		if (Static451.aClass223_6 != null) {
			Static451.aClass223_6.method5105();
			Static451.aClass223_6 = null;
		}
		Static580.method7902();
		Static153.aClass117_1.method3181();
		Static533.aClass291_3.method6420();
		if (Static306.aClass325_1 != null) {
			Static306.aClass325_1.method7261();
			Static306.aClass325_1 = null;
		}
		try {
			Static437.aClass361_5.method8119();
			for (@Pc(59) int local59 = 0; local59 < 35; local59++) {
				Static390.aClass361Array1[local59].method8119();
			}
			Static35.aClass361_2.method8119();
			Static25.aClass361_1.method8119();
			Static402.method5689();
		} catch (@Pc(88) Exception local88) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1717(@OriginalArg(1) int arg0) {
		Static298.aClass309_6 = null;
		Static456.anInt7975 = 0;
		Static153.aClass117_1.anInt3917 = arg0;
		Static153.aClass117_1.anInt3916++;
		Static61.aClass76_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1685() {
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1695()) {
			return;
		}
		Static338.aClass212_8 = new Class212();
		Static338.aClass212_8.anInt6145 = Integer.parseInt(this.getParameter("worldid"));
		Static234.aClass212_10 = new Class212();
		Static234.aClass212_10.anInt6145 = Integer.parseInt(this.getParameter("lobbyid"));
		Static234.aClass212_10.aString157 = this.getParameter("lobbyaddress");
		Static563.aClass212_9 = new Class212();
		Static563.aClass212_9.anInt6145 = Integer.parseInt(this.getParameter("demoid"));
		Static563.aClass212_9.aString157 = this.getParameter("demoaddress");
		Static332.aClass5_3 = Static547.method7489(Integer.parseInt(this.getParameter("modewhere")));
		if (Static512.aClass5_9 == Static332.aClass5_3) {
			Static332.aClass5_3 = Static587.aClass5_5;
		} else if (!Static399.method5605(Static332.aClass5_3) && Static412.aClass5_7 != Static332.aClass5_3) {
			Static332.aClass5_3 = Static412.aClass5_7;
		}
		Static527.aClass153_147 = Static452.method6234(Integer.parseInt(this.getParameter("modewhat")));
		if (Static579.aClass153_145 != Static527.aClass153_147 && Static527.aClass153_147 != Static451.aClass153_116 && Static527.aClass153_147 != Static171.aClass153_52) {
			Static527.aClass153_147 = Static171.aClass153_52;
		}
		try {
			Static201.anInt4321 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static201.anInt4321 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static215.aBoolean292 = true;
		} else {
			Static215.aBoolean292 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static458.aBoolean553 = true;
		} else {
			Static458.aBoolean553 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static178.aBoolean271 = true;
		} else {
			Static178.aBoolean271 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static31.aClass89_1 = Static70.aClass89_3;
			} else if (local152.equals("1")) {
				Static31.aClass89_1 = Static40.aClass89_2;
			}
		}
		try {
			Static501.anInt8649 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static501.anInt8649 = 0;
		}
		Static371.aString169 = this.getParameter("quiturl");
		Static44.aString268 = this.getParameter("settings");
		if (Static44.aString268 == null) {
			Static44.aString268 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static234.anInt10334 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static234.anInt10334 = 0;
			}
		}
		Static6.anInt44 = Integer.parseInt(this.getParameter("colourid"));
		if (Static6.anInt44 < 0 || Static330.aColorArray3.length <= Static6.anInt44) {
			Static6.anInt44 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static91.aBoolean170 = true;
			Static577.aBoolean689 = true;
		}
		@Pc(236) String local236 = this.getParameter("frombilling");
		if (local236 != null && local236.equals("true")) {
			Static574.aBoolean649 = true;
		}
		Static148.aString76 = this.getParameter("sskey");
		if (Static148.aString76 != null && Static148.aString76.length() < 2) {
			Static148.aString76 = null;
		}
		@Pc(262) String local262 = this.getParameter("force64mb");
		if (local262 != null && local262.equals("true")) {
			Static437.aBoolean538 = true;
		}
		@Pc(274) String local274 = this.getParameter("worldflags");
		if (local274 != null) {
			try {
				Static503.anInt8662 = Integer.parseInt(local274);
			} catch (@Pc(281) Exception local281) {
			}
		}
		@Pc(286) String local286 = this.getParameter("userFlow");
		if (local286 != null) {
			try {
				Static182.aLong91 = Long.parseLong(local286);
			} catch (@Pc(293) NumberFormatException local293) {
			}
		}
		Static303.aString152 = this.getParameter("additionalInfo");
		if (Static303.aString152 != null && Static303.aString152.length() > 50) {
			Static303.aString152 = null;
		}
		if (Static31.aClass89_1 == Static70.aClass89_3) {
			Static473.anInt8221 = 503;
			Static333.anInt6024 = 765;
		} else if (Static40.aClass89_2 == Static31.aClass89_1) {
			Static333.anInt6024 = 640;
			Static473.anInt8221 = 480;
		}
		Static507.aClient1 = this;
		this.method1697(Static333.anInt6024, Static31.aClass89_1.aString66, Static527.aClass153_147.method3813() + 32, Static473.anInt8221);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1719() {
		if (Static409.anInt1461 == 14) {
			return;
		}
		Static397.anInt6998++;
		if (Static397.anInt6998 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static72.anInt1985 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static269.aRandom1.setSeed((long) Static72.anInt1985);
		}
		if (Static397.anInt6998 % 50 == 0) {
			Static529.anInt9243 = Static266.anInt5089;
			Static456.anInt7973 = Static211.anInt8487;
			Static266.anInt5089 = 0;
			Static211.anInt8487 = 0;
		}
		this.method1707();
		if (Static87.aClass308_6 != null) {
			Static87.aClass308_6.method6723();
		}
		Static225.method3706();
		Static446.aClass237_1.method5299();
		Static234.aClass54_4.method7312();
		if (Static319.aClass31_11 != null) {
			Static319.aClass31_11.method8024((int) Static96.method2000());
		}
		Static555.method7611();
		Static522.anInt9178 = 0;
		Static294.anInt5507 = 0;
		for (@Pc(100) Interface21 local100 = Static446.aClass237_1.method5297(); local100 != null; local100 = Static446.aClass237_1.method5297()) {
			@Pc(106) int local106 = local100.method5126();
			if (local106 == 2 || local106 == 3) {
				@Pc(116) char local116 = local100.method5125();
				if (Static432.method5973() && (local116 == '`' || local116 == '§' || local116 == '²')) {
					if (Static418.method5830()) {
						Static97.method2035();
					} else {
						Static119.method2328();
					}
				} else if (Static294.anInt5507 < 128) {
					Static487.anInterface21Array2[Static294.anInt5507] = local100;
					Static294.anInt5507++;
				}
			} else if (local106 == 0 && Static522.anInt9178 < 75) {
				Static260.anInterface21Array1[Static522.anInt9178] = local100;
				Static522.anInt9178++;
			}
		}
		Static492.anInt8441 = 0;
		for (@Pc(183) Class3_Sub27 local183 = Static234.aClass54_4.method7301(); local183 != null; local183 = Static234.aClass54_4.method7301()) {
			@Pc(189) int local189 = local183.method5341();
			if (local189 == -1) {
				Static389.aClass244_61.method5570(local183);
			} else if (local189 == 6) {
				Static492.anInt8441 += local183.method5340();
			} else if (Static459.method6311(local189)) {
				Static114.aClass244_23.method5570(local183);
				if (Static114.aClass244_23.method5575() > 10) {
					Static114.aClass244_23.method5578();
				}
			}
		}
		if (Static418.method5830()) {
			Static577.method7832();
		}
		if (Static39.method1075(Static409.anInt1461)) {
			Static587.method1505();
			Static288.method4330();
		} else if (Static338.method4924(Static409.anInt1461)) {
			Static364.method5176();
		}
		if (Static107.method2198(Static409.anInt1461) && !Static338.method4924(Static409.anInt1461)) {
			this.method1702();
			Static247.method3934();
			Static297.method6883();
		} else if (Static438.method3441(Static409.anInt1461) && !Static338.method4924(Static409.anInt1461)) {
			this.method1702();
			Static297.method6883();
		} else if (Static409.anInt1461 == 12) {
			Static297.method6883();
		} else if (Static223.method3689(Static409.anInt1461) && !Static338.method4924(Static409.anInt1461)) {
			Static410.method5762();
		} else if (Static409.anInt1461 == 13) {
			Static297.method6883();
			if (Static181.anInt3977 != -3 && Static181.anInt3977 != 2 && Static181.anInt3977 != 15) {
				Static218.method6807(false);
			}
		}
		Static263.method4041(Static319.aClass31_11);
		Static114.aClass244_23.method5578();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method1720() {
		if (Static76.anInt4841 < Static153.aClass117_1.anInt3916) {
			Static104.aClass212_1.method4973();
			Static279.anInt5279 = (Static153.aClass117_1.anInt3916 * 50 - 50) * 5;
			if (Static279.anInt5279 > 3000) {
				Static279.anInt5279 = 3000;
			}
			if (Static153.aClass117_1.anInt3916 >= 2 && Static153.aClass117_1.anInt3917 == 6) {
				this.method1691("js5connect_outofdate");
				Static409.anInt1461 = 14;
				return;
			}
			if (Static153.aClass117_1.anInt3916 >= 4 && Static153.aClass117_1.anInt3917 == -1) {
				this.method1691("js5crc");
				Static409.anInt1461 = 14;
				return;
			}
			if (Static153.aClass117_1.anInt3916 >= 4 && Static39.method1075(Static409.anInt1461)) {
				if (Static153.aClass117_1.anInt3917 == 7 || Static153.aClass117_1.anInt3917 == 9) {
					this.method1691("js5connect_full");
				} else if (Static153.aClass117_1.anInt3917 <= 0) {
					this.method1691("js5io");
				} else if (Static154.aString84 == null) {
					this.method1691("js5connect");
				} else {
					this.method1691("js5proxy_" + Static154.aString84.trim());
				}
				Static409.anInt1461 = 14;
				return;
			}
		}
		Static76.anInt4841 = Static153.aClass117_1.anInt3916;
		if (Static279.anInt5279 > 0) {
			Static279.anInt5279--;
			return;
		}
		try {
			if (Static456.anInt7975 == 0) {
				Static298.aClass309_6 = Static104.aClass212_1.method4971(Static467.aClass168_12);
				Static456.anInt7975++;
			}
			if (Static456.anInt7975 == 1) {
				if (Static298.aClass309_6.anInt8650 == 2) {
					if (Static298.aClass309_6.anObject15 != null) {
						Static154.aString84 = (String) Static298.aClass309_6.anObject15;
					}
					this.method1717(1000);
					return;
				}
				if (Static298.aClass309_6.anInt8650 == 1) {
					Static456.anInt7975++;
				}
			}
			if (Static456.anInt7975 == 2) {
				Static61.aClass76_1 = new Class76((Socket) Static298.aClass309_6.anObject15, Static467.aClass168_12);
				@Pc(196) Class3_Sub26 local196 = new Class3_Sub26(5);
				local196.method6809(Static556.aClass126_30.anInt4274);
				local196.method6826(625);
				Static61.aClass76_1.method2191(local196.aByteArray213, 5);
				Static456.anInt7975++;
				Static271.aLong128 = Static96.method2000();
			}
			if (Static456.anInt7975 == 3) {
				if (Static39.method1075(Static409.anInt1461) || Static61.aClass76_1.method2185() > 0) {
					@Pc(236) int local236 = Static61.aClass76_1.method2192();
					if (local236 != 0) {
						this.method1717(local236);
						return;
					}
					Static456.anInt7975++;
				} else if (Static96.method2000() - Static271.aLong128 > 30000L) {
					this.method1717(1001);
					return;
				}
			}
			if (Static456.anInt7975 == 4) {
				@Pc(288) boolean local288 = Static39.method1075(Static409.anInt1461) || Static107.method2198(Static409.anInt1461) || Static438.method3441(Static409.anInt1461);
				@Pc(291) Class164[] local291 = Static263.method4037();
				@Pc(299) Class3_Sub26 local299 = new Class3_Sub26(local291.length * 4);
				Static61.aClass76_1.method2194(local299.aByteArray213, local299.aByteArray213.length, 0);
				for (@Pc(310) int local310 = 0; local310 < local291.length; local310++) {
					local291[local310].method4040(local299.method6816());
				}
				Static153.aClass117_1.method3169(!local288, Static61.aClass76_1);
				Static61.aClass76_1 = null;
				Static456.anInt7975 = 0;
				Static298.aClass309_6 = null;
			}
		} catch (@Pc(346) IOException local346) {
			this.method1717(1002);
		}
	}
}
