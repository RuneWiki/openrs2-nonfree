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
				Static300.method4727("Argument count");
			}
			Static217.aClass163_3 = new Class163();
			Static217.aClass163_3.anInt4593 = Integer.parseInt(arg0[0]);
			Static425.aClass163_4 = new Class163();
			Static425.aClass163_4.anInt4593 = Integer.parseInt(arg0[1]);
			Static530.aClass163_6 = new Class163();
			Static530.aClass163_6.anInt4593 = Integer.parseInt(arg0[2]);
			Static414.aClass320_17 = Static117.aClass320_1;
			if (arg0[3].equals("live")) {
				Static183.aClass306_1 = Static523.aClass306_4;
			} else if (arg0[3].equals("rc")) {
				Static183.aClass306_1 = Static231.aClass306_2;
			} else if (arg0[3].equals("wip")) {
				Static183.aClass306_1 = Static324.aClass306_3;
			} else {
				Static300.method4727("modewhat");
			}
			Static172.anInt6352 = Static96.method1766(arg0[4]);
			if (Static172.anInt6352 == -1) {
				if (arg0[4].equals("english")) {
					Static172.anInt6352 = 0;
				} else if (arg0[4].equals("german")) {
					Static172.anInt6352 = 1;
				} else {
					Static300.method4727("language");
				}
			}
			Static30.aBoolean40 = false;
			Static496.aBoolean630 = false;
			if (arg0[5].equals("game0")) {
				Static185.aClass212_1 = Static230.aClass212_2;
			} else if (arg0[5].equals("game1")) {
				Static185.aClass212_1 = Static533.aClass212_4;
			} else {
				Static300.method4727("game");
			}
			Static362.aBoolean519 = false;
			Static287.aBoolean391 = false;
			Static530.aString206 = "";
			Static520.aBoolean146 = true;
			Static415.aBoolean571 = true;
			Static224.anInt4041 = 0;
			Static517.anInt9000 = 0;
			Static332.anInt6223 = 0;
			Static298.anInt5469 = Static185.aClass212_1.anInt6307;
			Static302.aString124 = null;
			@Pc(164) client local164 = new client();
			Static456.aClient1 = local164;
			local164.method1228(Static183.aClass306_1.method7572() + 32, Static185.aClass212_1.aString136);
			Static132.aFrame2.setLocation(40, 40);
		} catch (@Pc(187) Exception local187) {
			Static459.method6984(null, local187);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1232() {
		if (Static287.aBoolean391) {
			Static78.anInt1651 = 64;
		}
		@Pc(20) Frame local20 = new Frame("Jagex");
		local20.pack();
		local20.dispose();
		Static477.method7123();
		Static231.aClass57_2 = new Class57(Static531.aClass283_6);
		Static100.aClass94_1 = new Class94();
		if (Static414.aClass320_17 != Static455.aClass320_15) {
			Static24.aByteArrayArray1 = new byte[50][];
		}
		Static281.aClass2_Sub19_Sub1_1 = new Class2_Sub19_Sub1(Static531.aClass283_6);
		if (Static455.aClass320_15 == Static414.aClass320_17) {
			Static217.aClass163_3.aString104 = this.getCodeBase().getHost();
		} else if (Static185.method3042(Static414.aClass320_17)) {
			Static217.aClass163_3.aString104 = this.getCodeBase().getHost();
			Static217.aClass163_3.anInt4588 = Static217.aClass163_3.anInt4593 + 40000;
			Static425.aClass163_4.anInt4588 = Static425.aClass163_4.anInt4593 + 40000;
			Static530.aClass163_6.anInt4588 = Static530.aClass163_6.anInt4593 + 40000;
			Static217.aClass163_3.anInt4591 = Static217.aClass163_3.anInt4593 + 50000;
			Static425.aClass163_4.anInt4591 = Static425.aClass163_4.anInt4593 + 50000;
			Static530.aClass163_6.anInt4591 = Static530.aClass163_6.anInt4593 + 50000;
		} else if (Static117.aClass320_1 == Static414.aClass320_17) {
			Static217.aClass163_3.aString104 = "127.0.0.1";
			Static425.aClass163_4.aString104 = "127.0.0.1";
			Static530.aClass163_6.aString104 = "127.0.0.1";
			Static217.aClass163_3.anInt4588 = Static217.aClass163_3.anInt4593 + 40000;
			Static425.aClass163_4.anInt4588 = Static425.aClass163_4.anInt4593 + 40000;
			Static530.aClass163_6.anInt4588 = Static530.aClass163_6.anInt4593 + 40000;
			Static217.aClass163_3.anInt4591 = Static217.aClass163_3.anInt4593 + 50000;
			Static425.aClass163_4.anInt4591 = Static425.aClass163_4.anInt4593 + 50000;
			Static530.aClass163_6.anInt4591 = Static530.aClass163_6.anInt4593 + 50000;
		}
		Static433.aShortArray86 = Static23.aShortArray18 = Static377.aShortArray91 = Static237.aShortArray71 = new short[256];
		if (Static185.aClass212_1 == Static533.aClass212_4) {
			Static16.aShortArray17 = Static63.aShortArray37;
			Static225.aShortArrayArray4 = Static439.aShortArrayArray9;
			Static108.anInt2105 = 16777215;
			Static5.aShortArray2 = Static176.aShortArray64;
			Static243.aShortArrayArray5 = Static197.aShortArrayArray3;
			Static150.aBoolean224 = true;
			Static266.anInt4919 = 0;
		} else {
			Static5.aShortArray2 = Static163.aShortArray62;
			Static225.aShortArrayArray4 = Static314.aShortArrayArray7;
			Static16.aShortArray17 = Static178.aShortArray65;
			Static243.aShortArrayArray5 = Static310.aShortArrayArray6;
		}
		Static471.aClass163_5 = Static217.aClass163_3;
		if (Static185.aClass212_1 == Static230.aClass212_2) {
			Static146.aBoolean222 = false;
		}
		Static311.aClass189_1 = Static284.method7818(Static517.aCanvas14);
		Static61.aClass214_1 = Static225.method3543(Static517.aCanvas14);
		Static540.anInt9344 = Static482.anInt8574;
		try {
			if (Static531.aClass283_6.aClass133_2 != null) {
				Static153.aClass179_36 = new Class179(Static531.aClass283_6.aClass133_2, 5200, 0);
				for (@Pc(220) int local220 = 0; local220 < 32; local220++) {
					Static398.aClass179Array1[local220] = new Class179(Static531.aClass283_6.aClass133Array1[local220], 6000, 0);
				}
				Static248.aClass179_16 = new Class179(Static531.aClass283_6.aClass133_4, 6000, 0);
				Static246.aClass257_2 = new Class257(255, Static153.aClass179_36, Static248.aClass179_16, 500000);
				Static346.aClass179_28 = new Class179(Static531.aClass283_6.aClass133_3, 24, 0);
				Static531.aClass283_6.aClass133_3 = null;
				Static531.aClass283_6.aClass133Array1 = null;
				Static531.aClass283_6.aClass133_4 = null;
				Static531.aClass283_6.aClass133_2 = null;
			}
		} catch (@Pc(278) IOException local278) {
			Static248.aClass179_16 = null;
			Static346.aClass179_28 = null;
			Static246.aClass257_2 = null;
			Static153.aClass179_36 = null;
		}
		if (Static455.aClass320_15 != Static414.aClass320_17) {
			Static382.aBoolean529 = true;
		}
		if (Static185.aClass212_1 == Static230.aClass212_2) {
			Static219.aString214 = Static2.aClass202_3.method5139(Static172.anInt6352);
		} else if (Static185.aClass212_1 == Static533.aClass212_4) {
			Static219.aString214 = Static484.aClass202_245.method5139(Static172.anInt6352);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1226() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1235() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static238.anInt4280 + "," + Static371.anInt6936 + "," + Static363.anInt1158 + "," + Static511.anInt8889 + "|";
			if (Static266.aClass1_Sub1_Sub2_Sub1_1 != null) {
				local7 = local7 + "2)" + Static208.anInt3742 + "," + (Static238.anInt4280 + Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0]) + "," + (Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0] + Static371.anInt6936) + "|";
			}
			local7 = local7 + "3)" + Static266.anInt4923 + "|4)" + Static281.aClass2_Sub19_Sub1_1.anInt2192 + "|5)" + Static181.method3002() + "|6)" + Static461.anInt8348 + "," + Static223.anInt3996 + "|";
			local7 = local7 + "7)" + Static281.aClass2_Sub19_Sub1_1.method2134(Static266.anInt4923) + "|";
			local7 = local7 + "8)" + Static281.aClass2_Sub19_Sub1_1.method2135(Static266.anInt4923) + "|";
			local7 = local7 + "9)" + Static281.aClass2_Sub19_Sub1_1.aBoolean194 + "|";
			local7 = local7 + "10)" + Static281.aClass2_Sub19_Sub1_1.aBoolean179 + "|";
			local7 = local7 + "11)" + Static281.aClass2_Sub19_Sub1_1.aBoolean192 + "|";
			local7 = local7 + "12)" + Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923) + "|";
			local7 = local7 + "13)" + Static78.anInt1651 + "|";
			local7 = local7 + "14)" + Static271.anInt8654;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static266.anInt4923 == 2) {
					@Pc(231) Class local231 = Class.forName("java.lang.ClassLoader");
					@Pc(235) Field local235 = local231.getDeclaredField("nativeLibraries");
					@Pc(238) Class local238 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(248) Method local248 = local238.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local248.invoke(local235, Boolean.TRUE);
					@Pc(271) Vector local271 = (Vector) local235.get(client.class.getClassLoader());
					for (@Pc(273) int local273 = 0; local271.size() > local273; local273++) {
						try {
							@Pc(279) Object local279 = local271.elementAt(local273);
							@Pc(284) Field local284 = local279.getClass().getDeclaredField("name");
							local248.invoke(local284, Boolean.TRUE);
							try {
								@Pc(299) String local299 = (String) local284.get(local279);
								if (local299 != null && local299.indexOf("sw3d.dll") != -1) {
									@Pc(311) Field local311 = local279.getClass().getDeclaredField("handle");
									local248.invoke(local311, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local311.getLong(local279));
									local248.invoke(local311, Boolean.FALSE);
								}
							} catch (@Pc(347) Throwable local347) {
							}
							local248.invoke(local284, Boolean.FALSE);
						} catch (@Pc(359) Throwable local359) {
						}
					}
				}
			} catch (@Pc(367) Throwable local367) {
			}
			local7 = local7 + "]";
		} catch (@Pc(378) Throwable local378) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1242() {
		@Pc(23) int local23;
		if (Static271.anInt8654 == 6 && Static528.anInt9122 == 0) {
			if (Static78.anInt1655 > 1) {
				Static78.anInt1655--;
				Static209.anInt3778 = Static507.anInt2745;
			}
			if (!Static452.aBoolean600) {
				Static95.method1762();
			}
			for (local23 = 0; local23 < 100 && Static187.method3069(); local23++) {
			}
		}
		Static436.anInt7972++;
		Static145.method2533(null, -1, -1);
		Static485.method7209(-1, null, -1);
		Static281.method4446();
		Static507.anInt2745++;
		for (local23 = 0; local23 < Static61.anInt1174; local23++) {
			@Pc(71) Class1_Sub1_Sub2_Sub2 local71 = Static539.aClass2_Sub11Array1[local23].aClass1_Sub1_Sub2_Sub2_1;
			if (local71 != null) {
				@Pc(77) byte local77 = local71.aClass12_1.aByte12;
				if ((local77 & 0x1) != 0) {
					@Pc(85) int local85 = local71.method4394();
					@Pc(106) int local106;
					if ((local77 & 0x2) != 0 && local71.anInt5102 == 0 && Math.random() * 1000.0D < 10.0D) {
						local106 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(114) int local114 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local106 != 0 || local114 != 0) {
							@Pc(128) int local128 = local71.anIntArray450[0] + local106;
							if (local128 < 0) {
								local128 = 0;
							} else if (Static363.anInt1158 - local85 - 1 < local128) {
								local128 = Static363.anInt1158 - local85 - 1;
							}
							@Pc(160) int local160 = local71.anIntArray449[0] + local114;
							if (local160 < 0) {
								local160 = 0;
							} else if (local160 > Static511.anInt8889 - local85 - 1) {
								local160 = Static511.anInt8889 - local85 - 1;
							}
							@Pc(210) int local210 = Static343.method5390(0, local85, Static172.anIntArray506, local71.anIntArray450[0], local85, local160, Static165.anIntArray349, -1, 0, local71.anIntArray449[0], local85, local128, Static207.aClass99Array1[local71.aByte90], true);
							if (local210 > 0) {
								if (local210 > 9) {
									local210 = 9;
								}
								for (@Pc(219) int local219 = 0; local219 < local210; local219++) {
									local71.anIntArray450[local219] = Static165.anIntArray349[local210 - local219 - 1];
									local71.anIntArray449[local219] = Static172.anIntArray506[local210 - local219 - 1];
									local71.aByteArray87[local219] = 1;
								}
								local71.anInt5102 = local210;
							}
						}
					}
					Static397.method6346(local71, true);
					local106 = Static376.method5914(local71);
					Static214.method3911(Static484.anInt8591, local106, Static38.anInt735, local71);
					Static111.method2162(local71);
				}
			}
		}
		if (Static528.anInt9122 == 0 && Static378.anInt7010 == 0) {
			if (Static427.anInt7875 == 2) {
				Static536.method7739();
			} else {
				Static456.method6973();
			}
			if (Static187.anInt3432 >> 7 < 14 || Static363.anInt1158 - 14 <= Static187.anInt3432 >> 7 || Static353.anInt5258 >> 7 < 14 || Static511.anInt8889 - 14 <= Static353.anInt5258 >> 7) {
				Static235.method3656();
			}
		}
		while (true) {
			@Pc(335) Class2_Sub28 local335;
			@Pc(340) Class310 local340;
			@Pc(351) Class310 local351;
			do {
				local335 = (Class2_Sub28) Static313.aClass249_47.method6529();
				if (local335 == null) {
					while (true) {
						do {
							local335 = (Class2_Sub28) Static96.aClass249_9.method6529();
							if (local335 == null) {
								while (true) {
									do {
										local335 = (Class2_Sub28) Static17.aClass249_4.method6529();
										if (local335 == null) {
											if (Static72.aClass310_4 != null) {
												Static189.method3097();
											}
											if (Static115.anInt2326 % 1500 == 0) {
												Static161.method2728();
											}
											if (Static271.anInt8654 == 6 && Static528.anInt9122 == 0) {
												Static373.method5904();
											}
											Static524.method7597();
											if (Static242.aBoolean326 && Static143.method2502() - 60000L > Class75_Sub1.lb) {
												Static538.method7748();
											}
											for (@Pc(514) Class6_Sub1_Sub1 local514 = (Class6_Sub1_Sub1) Static157.aClass107_2.method2832(); local514 != null; local514 = (Class6_Sub1_Sub1) Static157.aClass107_2.method2835()) {
												if (Static143.method2502() / 1000L - 5L > (long) local514.anInt846) {
													if (local514.aShort16 > 0) {
														Static62.method1145(local514.aString25 + Static332.aClass202_180.method5139(Static172.anInt6352), "", 0, "", 5);
													}
													if (local514.aShort16 == 0) {
														Static62.method1145(local514.aString25 + Static477.aClass202_241.method5139(Static172.anInt6352), "", 0, "", 5);
													}
													local514.method7058();
												}
											}
											if (Static271.anInt8654 == 6 && Static528.anInt9122 == 0) {
												if (Static497.aClass173_2 == null) {
													Static346.method6463(false);
													return;
												}
												Static409.anInt7642++;
												if (Static409.anInt7642 > 50) {
													Static93.method1721(Static158.aClass243_38);
												}
												try {
													if (Static497.aClass173_2 != null && Static381.aClass2_Sub29_Sub2_2.anInt6132 > 0) {
														Static51.anInt917 += Static381.aClass2_Sub29_Sub2_2.anInt6132;
														Static497.aClass173_2.method7257(Static381.aClass2_Sub29_Sub2_2.aByteArray96, Static381.aClass2_Sub29_Sub2_2.anInt6132);
														Static409.anInt7642 = 0;
														Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
														return;
													}
												} catch (@Pc(651) IOException local651) {
													Static346.method6463(false);
													return;
												}
											}
											return;
										}
										local340 = local335.aClass310_8;
										if (local340.anInt9170 < 0) {
											break;
										}
										local351 = Static111.method2143(local340.anInt9167);
									} while (local351 == null || local351.aClass310Array2 == null || local340.anInt9170 >= local351.aClass310Array2.length || local351.aClass310Array2[local340.anInt9170] != local340);
									Static258.method4037(local335);
								}
							}
							local340 = local335.aClass310_8;
							if (local340.anInt9170 < 0) {
								break;
							}
							local351 = Static111.method2143(local340.anInt9167);
						} while (local351 == null || local351.aClass310Array2 == null || local351.aClass310Array2.length <= local340.anInt9170 || local351.aClass310Array2[local340.anInt9170] != local340);
						Static258.method4037(local335);
					}
				}
				local340 = local335.aClass310_8;
				if (local340.anInt9170 < 0) {
					break;
				}
				local351 = Static111.method2143(local340.anInt9167);
			} while (local351 == null || local351.aClass310Array2 == null || local340.anInt9170 >= local351.aClass310Array2.length || local351.aClass310Array2[local340.anInt9170] != local340);
			Static258.method4037(local335);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
	private void method1243(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class2_Sub29 local16 = new Class2_Sub29(arg0);
		while (true) {
			@Pc(20) int local20 = local16.method5170();
			if (local20 == 0) {
				return;
			}
			if (local20 == 2) {
				Static135.anInt2543 = local16.method5229();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1223()) {
			return;
		}
		Static217.aClass163_3 = new Class163();
		Static217.aClass163_3.anInt4593 = Integer.parseInt(this.getParameter("worldid"));
		Static425.aClass163_4 = new Class163();
		Static425.aClass163_4.anInt4593 = Integer.parseInt(this.getParameter("lobbyid"));
		Static425.aClass163_4.aString104 = this.getParameter("lobbyaddress");
		Static530.aClass163_6 = new Class163();
		Static530.aClass163_6.anInt4593 = Integer.parseInt(this.getParameter("demoid"));
		Static530.aClass163_6.aString104 = this.getParameter("demoaddress");
		Static414.aClass320_17 = Static111.method2156(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static185.method3042(Static414.aClass320_17) && Static455.aClass320_15 != Static414.aClass320_17) {
			Static414.aClass320_17 = Static455.aClass320_15;
		}
		Static183.aClass306_1 = Static6.method311(Integer.parseInt(this.getParameter("modewhat")));
		if (Static183.aClass306_1 != Static324.aClass306_3 && Static231.aClass306_2 != Static183.aClass306_1 && Static183.aClass306_1 != Static523.aClass306_4) {
			Static183.aClass306_1 = Static523.aClass306_4;
		}
		try {
			Static172.anInt6352 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static172.anInt6352 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static496.aBoolean630 = true;
		} else {
			Static496.aBoolean630 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static30.aBoolean40 = true;
		} else {
			Static30.aBoolean40 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static502.aBoolean638 = true;
		} else {
			Static502.aBoolean638 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static185.aClass212_1 = Static230.aClass212_2;
			} else if (local145.equals("1")) {
				Static185.aClass212_1 = Static533.aClass212_4;
			}
		}
		try {
			Static224.anInt4041 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static224.anInt4041 = 0;
		}
		Static80.aString43 = this.getParameter("quiturl");
		Static530.aString206 = this.getParameter("settings");
		if (Static530.aString206 == null) {
			Static530.aString206 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static517.anInt9000 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static517.anInt9000 = 0;
			}
		}
		Static298.anInt5469 = Integer.parseInt(this.getParameter("colourid"));
		if (Static298.anInt5469 < 0 || Static390.aColorArray1.length <= Static298.anInt5469) {
			Static298.anInt5469 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static520.aBoolean146 = true;
			Static415.aBoolean571 = true;
		}
		@Pc(227) String local227 = this.getParameter("frombilling");
		if (local227 != null && local227.equals("true")) {
			Static362.aBoolean519 = true;
		}
		Static302.aString124 = this.getParameter("sskey");
		if (Static302.aString124 != null && Static302.aString124.length() < 2) {
			Static302.aString124 = null;
		}
		@Pc(253) String local253 = this.getParameter("force64mb");
		if (local253 != null && local253.equals("true")) {
			Static287.aBoolean391 = true;
		}
		@Pc(265) String local265 = this.getParameter("worldflags");
		if (local265 != null) {
			try {
				Static332.anInt6223 = Integer.parseInt(local265);
			} catch (@Pc(272) Exception local272) {
			}
		}
		if (Static230.aClass212_2 == Static185.aClass212_1) {
			Static185.anInt3395 = 503;
			Static318.anInt5962 = 765;
		} else if (Static185.aClass212_1 == Static533.aClass212_4) {
			Static185.anInt3395 = 480;
			Static318.anInt5962 = 640;
		}
		Static456.aClient1 = this;
		this.method1227(Static318.anInt5962, Static183.aClass306_1.method7572() + 32, Static185.anInt3395);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1220() {
		if (Static266.anInt4923 != 2) {
			this.method1250();
			return;
		}
		try {
			this.method1250();
		} catch (@Pc(22) Throwable local22) {
			Static459.method6984(local22.getMessage() + " (Recovered) " + this.method1235(), local22);
			Static233.method6719(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1231() {
		if (Static242.aBoolean326) {
			Static538.method7748();
		}
		if (Static103.aClass39_3 != null) {
			Static103.aClass39_3.method6021();
		}
		if (Static36.aFrame1 != null) {
			Static396.method6325(Static531.aClass283_6, Static36.aFrame1);
			Static36.aFrame1 = null;
		}
		if (Static497.aClass173_2 != null) {
			Static497.aClass173_2.method7261();
			Static497.aClass173_2 = null;
		}
		Static142.method2486();
		Static100.aClass94_1.method2487();
		Static231.aClass57_2.method1691();
		if (Static396.aClass101_1 != null) {
			Static396.aClass101_1.method2726();
			Static396.aClass101_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method1245(@OriginalArg(0) int arg0) {
		Static472.aClass31_5 = null;
		Static188.aClass20_2 = null;
		Static100.aClass94_1.anInt2645 = arg0;
		Static427.anInt7873 = 0;
		Static100.aClass94_1.anInt2646++;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1248() {
		@Pc(10) int local10;
		if (!Static281.aClass2_Sub19_Sub1_1.aBoolean197) {
			for (local10 = 0; local10 < Static33.anInt600; local10++) {
				if (Static394.anInterface13Array2[local10].method5852() == 's' || Static394.anInterface13Array2[local10].method5852() == 'S') {
					Static281.aClass2_Sub19_Sub1_1.aBoolean197 = true;
					break;
				}
			}
		}
		@Pc(60) int local60;
		if (Static503.anInt8838 == 0) {
			@Pc(50) Runtime local50 = Runtime.getRuntime();
			local60 = (int) ((local50.totalMemory() - local50.freeMemory()) / 1024L);
			@Pc(63) long local63 = Static143.method2502();
			if (Static524.aLong234 == 0L) {
				Static524.aLong234 = local63;
			}
			if (local60 > 16384 && local63 - Static524.aLong234 < 5000L) {
				if (local63 - Static95.aLong52 > 1000L) {
					System.gc();
					Static95.aLong52 = local63;
				}
				Static328.aString132 = Static498.aClass202_249.method5139(Static172.anInt6352);
				Static306.anInt5606 = 5;
			} else {
				Static328.aString132 = Static339.aClass202_186.method5139(Static172.anInt6352);
				Static306.anInt5606 = 5;
				Static503.anInt8838 = 10;
			}
		} else if (Static503.anInt8838 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static207.aClass99Array1[local10] = Static207.method3298(Static511.anInt8889, Static363.anInt1158);
			}
			Static328.aString132 = Static150.aClass202_89.method5139(Static172.anInt6352);
			Static306.anInt5606 = 10;
			Static503.anInt8838 = 20;
		} else if (Static503.anInt8838 == 20) {
			if (Static175.aClass143_1 == null) {
				Static175.aClass143_1 = new Class143(Static100.aClass94_1, Static231.aClass57_2, Static128.aBigInteger1, Static241.aBigInteger4);
			}
			if (Static175.aClass143_1.method3490()) {
				Static498.aClass53_140 = Static287.method4534(true, false, 0);
				Static71.aClass53_21 = Static287.method4534(true, false, 1);
				Static163.aClass53_50 = Static287.method4534(true, false, 2);
				Static168.aClass53_52 = Static287.method4534(true, false, 3);
				Static383.aClass53_109 = Static287.method4534(true, false, 4);
				Static360.aClass53_151 = Static287.method4534(true, true, 5);
				Static463.aClass53_134 = Static287.method4534(false, true, 6);
				Static248.aClass53_78 = Static287.method4534(true, false, 7);
				Static460.aClass53_147 = Static287.method4534(true, false, 8);
				Static147.aClass53_47 = Static287.method4534(true, false, 9);
				Static244.aClass53_76 = Static287.method4534(true, false, 10);
				Static447.aClass53_125 = Static287.method4534(true, false, 11);
				Static458.aClass53_131 = Static287.method4534(true, false, 12);
				Static36.aClass53_10 = Static287.method4534(true, false, 13);
				Static442.aClass53_122 = Static287.method4534(false, false, 14);
				Static391.aClass53_113 = Static287.method4534(true, false, 15);
				Static478.aClass53_137 = Static287.method4534(true, false, 16);
				Static36.aClass53_9 = Static287.method4534(true, false, 17);
				Static358.aClass53_101 = Static287.method4534(true, false, 18);
				Static62.aClass53_20 = Static287.method4534(true, false, 19);
				Static501.aClass53_141 = Static287.method4534(true, false, 20);
				Static103.aClass53_32 = Static287.method4534(true, false, 21);
				Static398.aClass53_116 = Static287.method4534(true, false, 22);
				Static420.aClass53_119 = Static287.method4534(true, true, 23);
				Static43.aClass53_15 = Static287.method4534(true, false, 24);
				Static530.aClass53_150 = Static287.method4534(true, false, 25);
				Static425.aClass53_105 = Static287.method4534(true, true, 26);
				Static459.aClass53_132 = Static287.method4534(true, false, 27);
				Static7.aClass53_124 = Static287.method4534(true, true, 28);
				Static505.aClass53_143 = Static287.method4534(true, false, 29);
				Static85.aClass53_25 = Static287.method4534(true, true, 30);
				Static19.aClass53_4 = Static287.method4534(true, true, 31);
				Static328.aString132 = Static301.aClass202_168.method5139(Static172.anInt6352);
				Static503.anInt8838 = 30;
				Static306.anInt5606 = 15;
			} else {
				Static328.aString132 = Static336.aClass202_181.method5139(Static172.anInt6352);
				Static306.anInt5606 = 12;
			}
		} else if (Static503.anInt8838 == 30) {
			local10 = 0;
			for (local60 = 0; local60 < 32; local60++) {
				local10 += Static107.aClass164_Sub1Array1[local60].method4010() * Static71.anIntArray120[local60] / 100;
			}
			if (local10 == 100) {
				Static328.aString132 = Static365.aClass202_198.method5139(Static172.anInt6352);
				Static306.anInt5606 = 20;
				Static513.method7498(Static460.aClass53_147);
				Static509.method7454(Static460.aClass53_147);
				Static503.anInt8838 = 35;
			} else {
				if (local10 != 0) {
					Static328.aString132 = Static168.aClass202_99.method5139(Static172.anInt6352) + local10 + "%";
				}
				Static306.anInt5606 = 20;
			}
		} else if (Static503.anInt8838 == 35) {
			Static296.method4687(Static531.aClass283_6, Static85.aClass53_25);
			Static328.aString132 = Static360.aClass202_267.method5139(Static172.anInt6352);
			Static306.anInt5606 = 20;
			Static503.anInt8838 = 40;
		} else if (Static503.anInt8838 == 40) {
			if (Static7.aClass53_124.method1598()) {
				this.method1258(Static7.aClass53_124.method1599(1));
				this.method1243(Static7.aClass53_124.method1599(3));
				if (Static135.anInt2543 == -1 || Static248.aClass53_78.method1591(Static135.anInt2543, 0)) {
					Static328.aString132 = Static203.aClass202_121.method5139(Static172.anInt6352);
					Static306.anInt5606 = 25;
					Static503.anInt8838 = 41;
				}
			} else {
				Static328.aString132 = Static45.aClass202_29.method5139(Static172.anInt6352) + Static7.aClass53_124.method1609() + "%";
				Static306.anInt5606 = 25;
			}
		} else if (Static503.anInt8838 == 41) {
			local10 = Static175.method2944("jaggl");
			if (local10 >= 0 && local10 < 100) {
				Static328.aString132 = Static245.aClass202_140.method5139(Static172.anInt6352) + local10 + "%";
				Static306.anInt5606 = 25;
			} else {
				Static328.aString132 = Static58.aClass202_41.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
				Static503.anInt8838 = 42;
			}
		} else if (Static503.anInt8838 == 42) {
			local10 = Static175.method2944("jagdx");
			if (local10 >= 0 && local10 < 100) {
				Static328.aString132 = Static116.aClass202_70.method5139(Static172.anInt6352) + local10 + "%";
				Static306.anInt5606 = 25;
			} else {
				Static328.aString132 = Static513.aClass202_256.method5139(Static172.anInt6352);
				Static503.anInt8838 = 43;
				Static306.anInt5606 = 25;
			}
		} else if (Static503.anInt8838 == 43) {
			local10 = Static175.method2944("jagmisc");
			if (local10 >= 0 && local10 < 100) {
				Static328.aString132 = Static160.aClass202_94.method5139(Static172.anInt6352) + local10 + "%";
				Static306.anInt5606 = 25;
			} else {
				if (local10 == 100) {
					this.method1221();
				}
				Static328.aString132 = Static273.aClass202_151.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
				Static503.anInt8838 = 44;
			}
		} else if (Static503.anInt8838 == 44) {
			local10 = Static175.method2944("sw3d");
			if (local10 >= 0 && local10 < 100) {
				Static328.aString132 = Static413.aClass202_213.method5139(Static172.anInt6352) + local10 + "%";
				Static306.anInt5606 = 25;
			} else {
				Static328.aString132 = Static259.aClass202_68.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
				Static503.anInt8838 = 45;
			}
		} else if (Static503.anInt8838 == 45) {
			local10 = Static175.method2944("jaclib");
			if (local10 >= 0 && local10 < 100) {
				Static328.aString132 = Static191.aClass202_232.method5139(Static172.anInt6352) + local10 + "%";
				Static306.anInt5606 = 25;
			} else {
				if (local10 == 100) {
					this.method1236();
				}
				Static328.aString132 = Static257.aClass202_149.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
				Static503.anInt8838 = 46;
			}
		} else if (Static503.anInt8838 == 46) {
			local10 = Static175.method2944("hw3d");
			if (local10 >= 0 && local10 < 100) {
				Static328.aString132 = Static181.aClass202_105.method5139(Static172.anInt6352) + local10 + "%";
				Static306.anInt5606 = 25;
			} else {
				Static328.aString132 = Static41.aClass202_27.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
				Static503.anInt8838 = 47;
			}
		} else if (Static503.anInt8838 == 47) {
			if (Static19.aClass53_4.method1598()) {
				Static328.aString132 = Static267.aClass202_212.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
				Static503.anInt8838 = 50;
			} else {
				Static328.aString132 = Static238.aClass202_135.method5139(Static172.anInt6352);
				Static306.anInt5606 = 25;
			}
		} else if (Static503.anInt8838 == 50) {
			Static268.method4297();
			Static328.aString132 = Static128.aClass202_75.method5139(Static172.anInt6352);
			Static306.anInt5606 = 30;
			Static503.anInt8838 = 60;
		} else if (Static503.anInt8838 == 60) {
			local10 = Static533.method7670(Static460.aClass53_147, Static36.aClass53_10);
			local60 = Static93.method1724();
			if (local60 > local10) {
				Static328.aString132 = Static49.aClass202_31.method5139(Static172.anInt6352) + local10 * 100 / local60 + "%";
				Static306.anInt5606 = 35;
			} else {
				Static328.aString132 = Static250.aClass202_145.method5139(Static172.anInt6352);
				Static503.anInt8838 = 70;
				Static306.anInt5606 = 35;
			}
		} else if (Static503.anInt8838 == 70) {
			local10 = Static154.method2636(Static460.aClass53_147);
			local60 = Static439.method6709();
			if (local10 < local60) {
				Static328.aString132 = Static390.aClass202_203.method5139(Static172.anInt6352) + local10 * 100 / local60 + "%";
				Static306.anInt5606 = 40;
			} else {
				Static328.aString132 = Static241.aClass202_138.method5139(Static172.anInt6352);
				Static306.anInt5606 = 40;
				Static503.anInt8838 = 80;
			}
		} else if (Static503.anInt8838 == 80) {
			if (Static425.aClass53_105.method1598()) {
				Static11.anInterface12_10 = new Class96(Static425.aClass53_105, Static147.aClass53_47, Static460.aClass53_147);
				Static328.aString132 = Static4.aClass202_8.method5139(Static172.anInt6352);
				Static306.anInt5606 = 45;
				Static503.anInt8838 = 90;
			} else {
				Static328.aString132 = Static484.aClass202_244.method5139(Static172.anInt6352) + Static425.aClass53_105.method1609() + "%";
				Static306.anInt5606 = 45;
			}
		} else if (Static503.anInt8838 == 90) {
			Static328.aString132 = Static533.aClass202_266.method5139(Static172.anInt6352);
			Static306.anInt5606 = 50;
			Static503.anInt8838 = 95;
		} else if (Static503.anInt8838 == 95) {
			if (Static281.aClass2_Sub19_Sub1_1.aBoolean197) {
				Static281.aClass2_Sub19_Sub1_1.anInt2180 = 0;
				Static281.aClass2_Sub19_Sub1_1.anInt2181 = 0;
				Static281.aClass2_Sub19_Sub1_1.anInt2189 = 0;
				Static281.aClass2_Sub19_Sub1_1.anInt2192 = 0;
				Static281.aClass2_Sub19_Sub1_1.anInt2198 = 1;
			}
			Static281.aClass2_Sub19_Sub1_1.aBoolean197 = true;
			Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
			Static76.method1563(false, Static281.aClass2_Sub19_Sub1_1.anInt2180);
			Static328.aString132 = Static148.aClass202_88.method5139(Static172.anInt6352);
			Static503.anInt8838 = 100;
			Static306.anInt5606 = 55;
		} else if (Static503.anInt8838 == 100) {
			Static277.method4361(Static103.aClass39_3, Static460.aClass53_147, Static36.aClass53_10);
			Static328.aString132 = Static518.aClass202_259.method5139(Static172.anInt6352);
			Static306.anInt5606 = 60;
			Static301.method4738(1);
			Static503.anInt8838 = 110;
		} else if (Static503.anInt8838 == 110) {
			Static163.aClass53_50.method1598();
			local10 = Static163.aClass53_50.method1609();
			Static478.aClass53_137.method1598();
			local10 += Static478.aClass53_137.method1609();
			Static36.aClass53_9.method1598();
			local10 += Static36.aClass53_9.method1609();
			Static358.aClass53_101.method1598();
			local10 += Static358.aClass53_101.method1609();
			Static62.aClass53_20.method1598();
			local10 += Static62.aClass53_20.method1609();
			Static501.aClass53_141.method1598();
			local10 += Static501.aClass53_141.method1609();
			Static103.aClass53_32.method1598();
			local10 += Static103.aClass53_32.method1609();
			Static398.aClass53_116.method1598();
			local10 += Static398.aClass53_116.method1609();
			Static43.aClass53_15.method1598();
			local10 += Static43.aClass53_15.method1609();
			Static530.aClass53_150.method1598();
			local10 += Static530.aClass53_150.method1609();
			Static459.aClass53_132.method1598();
			local10 += Static459.aClass53_132.method1609();
			Static505.aClass53_143.method1598();
			local10 += Static505.aClass53_143.method1609();
			if (local10 < 1200) {
				Static328.aString132 = Static241.aClass202_139.method5139(Static172.anInt6352) + local10 / 12 + "%";
				Static306.anInt5606 = 65;
			} else {
				Static66.aClass247_1 = new Class247(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static492.aClass218_1 = new Class218(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static70.aClass61_1 = new Class61(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50, Static460.aClass53_147);
				Static171.aClass17_1 = new Class17(Static185.aClass212_1, Static172.anInt6352, Static36.aClass53_9);
				Static117.aClass286_4 = new Class286(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static16.aClass16_3 = new Class16(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static289.aClass125_1 = new Class125(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50, Static248.aClass53_78);
				Static209.aClass270_1 = new Class270(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static129.aClass100_1 = new Class100(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static505.aClass206_4 = new Class206(Static185.aClass212_1, Static172.anInt6352, true, Static478.aClass53_137, Static248.aClass53_78);
				Static387.aClass56_4 = new Class56(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50, Static460.aClass53_147);
				Static537.aClass112_4 = new Class112(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50, Static460.aClass53_147);
				Static21.aClass255_2 = new Class255(Static185.aClass212_1, Static172.anInt6352, true, Static358.aClass53_101, Static248.aClass53_78);
				Static464.aClass115_1 = new Class115(Static185.aClass212_1, Static172.anInt6352, true, Static66.aClass247_1, Static62.aClass53_20, Static248.aClass53_78);
				Static221.aClass225_1 = new Class225(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static396.aClass157_2 = new Class157(Static185.aClass212_1, Static172.anInt6352, Static501.aClass53_141, Static498.aClass53_140, Static71.aClass53_21);
				Static222.aClass299_2 = new Class299(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static171.aClass131_1 = new Class131(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static305.aClass14_1 = new Class14(Static185.aClass212_1, Static172.anInt6352, Static103.aClass53_32, Static248.aClass53_78);
				Static172.aClass211_2 = new Class211(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static121.aClass273_1 = new Class273(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static33.aClass28_1 = new Class28(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static79.aClass80_1 = new Class80(Static185.aClass212_1, Static172.anInt6352, Static398.aClass53_116);
				Static266.aClass230_1 = new Class230(Static185.aClass212_1, Static172.anInt6352, Static163.aClass53_50);
				Static33.method677(Static36.aClass53_10, Static168.aClass53_52, Static248.aClass53_78, Static460.aClass53_147);
				Static111.method2147(Static505.aClass53_143);
				Static70.aClass219_1 = new Class219(Static172.anInt6352, Static43.aClass53_15, Static530.aClass53_150);
				Static389.aClass64_1 = new Class64(Static172.anInt6352, Static43.aClass53_15, Static530.aClass53_150, new Class288());
				Static328.aString132 = Static437.aClass202_220.method5139(Static172.anInt6352);
				Static306.anInt5606 = 65;
				Static509.method7453();
				Static505.aClass206_4.method5329(!Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923));
				Static84.aClass302_1 = new Class302();
				Static436.method6681();
				Static516.method7512(Static459.aClass53_132);
				Static240.method3719(Static11.anInterface12_10, Static248.aClass53_78);
				Static503.anInt8838 = 120;
			}
		} else if (Static503.anInt8838 == 120) {
			local10 = Static170.method2868(Static460.aClass53_147);
			local60 = Static111.method2158();
			if (local60 > local10) {
				Static328.aString132 = Static134.aClass202_79.method5139(Static172.anInt6352) + local10 * 100 / local60 + "%";
				Static306.anInt5606 = 70;
			} else {
				Static494.method7273(Static103.aClass39_3, Static460.aClass53_147);
				Static117.method2254(Static42.aClass35Array3);
				Static328.aString132 = Static348.aClass202_189.method5139(Static172.anInt6352);
				Static306.anInt5606 = 70;
				Static503.anInt8838 = 130;
			}
		} else if (Static503.anInt8838 == 130) {
			if (Static244.aClass53_76.method1602("huffman", "")) {
				@Pc(1569) Class190 local1569 = new Class190(Static244.aClass53_76.method1596("", "huffman"));
				Static211.method6678(local1569);
				Static328.aString132 = Static152.aClass202_225.method5139(Static172.anInt6352);
				Static503.anInt8838 = 140;
				Static306.anInt5606 = 75;
			} else {
				Static328.aString132 = Static338.aClass202_183.method5139(Static172.anInt6352) + "0%";
				Static306.anInt5606 = 75;
			}
		} else if (Static503.anInt8838 == 140) {
			if (Static168.aClass53_52.method1598()) {
				Static328.aString132 = Static98.aClass202_62.method5139(Static172.anInt6352);
				Static306.anInt5606 = 80;
				Static503.anInt8838 = 150;
			} else {
				Static328.aString132 = Static503.aClass202_251.method5139(Static172.anInt6352) + Static168.aClass53_52.method1609() + "%";
				Static306.anInt5606 = 80;
			}
		} else if (Static503.anInt8838 == 150) {
			if (Static458.aClass53_131.method1598()) {
				Static328.aString132 = Static441.aClass202_223.method5139(Static172.anInt6352);
				Static503.anInt8838 = 160;
				Static306.anInt5606 = 82;
			} else {
				Static328.aString132 = Static415.aClass202_214.method5139(Static172.anInt6352) + Static458.aClass53_131.method1609() + "%";
				Static306.anInt5606 = 82;
			}
		} else if (Static503.anInt8838 == 160) {
			if (Static36.aClass53_10.method1598()) {
				Static328.aString132 = Static91.aClass202_54.method5139(Static172.anInt6352);
				Static503.anInt8838 = 170;
				Static306.anInt5606 = 85;
			} else {
				Static328.aString132 = Static91.aClass202_54.method5139(Static172.anInt6352) + Static36.aClass53_10.method1609() + "%";
				Static306.anInt5606 = 85;
			}
		} else if (Static503.anInt8838 == 170) {
			if (Static420.aClass53_119.method1606("details")) {
				Static201.method359(Static420.aClass53_119, Static117.aClass286_4, Static16.aClass16_3, Static505.aClass206_4, Static387.aClass56_4, Static537.aClass112_4, Static84.aClass302_1);
				Static328.aString132 = Static542.aClass202_271.method5139(Static172.anInt6352);
				Static306.anInt5606 = 89;
				Static503.anInt8838 = 190;
			} else {
				Static328.aString132 = Static545.aClass202_272.method5139(Static172.anInt6352) + Static420.aClass53_119.method1601("details") + "%";
				Static306.anInt5606 = 87;
			}
		} else if (Static503.anInt8838 == 190) {
			Static432.aBooleanArray35 = new boolean[Static33.aClass28_1.anInt825];
			Static14.aStringArray2 = new String[Static121.aClass273_1.anInt8357];
			Static399.anIntArray113 = new int[Static33.aClass28_1.anInt825];
			for (local10 = 0; local10 < Static33.aClass28_1.anInt825; local10++) {
				if (Static33.aClass28_1.method834(local10).anInt2510 == 0) {
					Static432.aBooleanArray35[local10] = true;
					Static465.anInt8385++;
				}
				Static399.anIntArray113[local10] = -1;
			}
			Static339.method5351();
			Static110.anInt2138 = Static168.aClass53_52.method1608("loginscreen");
			Static467.anInt8408 = Static168.aClass53_52.method1608("lobbyscreen");
			Static360.aClass53_151.method1612(false);
			Static463.aClass53_134.method1612(true);
			Static460.aClass53_147.method1612(true);
			Static36.aClass53_10.method1612(true);
			Static244.aClass53_76.method1612(true);
			Static168.aClass53_52.method1612(true);
			Static163.aClass53_50.anInt1684 = 2;
			Static361.aBoolean517 = true;
			Static36.aClass53_9.anInt1684 = 2;
			Static478.aClass53_137.anInt1684 = 2;
			Static358.aClass53_101.anInt1684 = 2;
			Static62.aClass53_20.anInt1684 = 2;
			Static501.aClass53_141.anInt1684 = 2;
			Static103.aClass53_32.anInt1684 = 2;
			Static301.method4737(-1, false, -1, Static281.aClass2_Sub19_Sub1_1.anInt2198);
			Static328.aString132 = Static324.aClass202_175.method5139(Static172.anInt6352);
			Static503.anInt8838 = 200;
			Static306.anInt5606 = 95;
		} else if (Static503.anInt8838 == 200) {
			Static301.method4738(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1234() {
		if (Static266.anInt4923 != 2) {
			this.method1252();
			return;
		}
		try {
			this.method1252();
		} catch (@Pc(16) Throwable local16) {
			Static459.method6984(local16.getMessage() + " (Recovered) " + this.method1235(), local16);
			Static233.method6719(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1250() {
		if (Static271.anInt8654 == 13) {
			return;
		}
		@Pc(18) long local18 = Static452.method6904() / 1000000L - Static475.aLong216;
		Static475.aLong216 = Static452.method6904() / 1000000L;
		@Pc(26) boolean local26 = Static161.method2729();
		if (local26 && Static539.aBoolean675 && Static281.aClass104_1 != null) {
			Static281.aClass104_1.method7806();
		}
		if (Static18.method525(Static271.anInt8654)) {
			if (Static485.aLong221 != 0L && Static485.aLong221 < Static143.method2502()) {
				Static301.method4737(Static281.aClass2_Sub19_Sub1_1.anInt2201, false, Static281.aClass2_Sub19_Sub1_1.anInt2182, Static181.method3002());
			} else if (!Static103.aClass39_3.method6013() && Static120.aBoolean208) {
				Static165.method2809();
			}
		}
		@Pc(87) int local87;
		@Pc(91) int local91;
		if (Static36.aFrame1 == null) {
			@Pc(79) Container local79;
			if (Static132.aFrame2 == null) {
				local79 = Static531.aClass283_6.anApplet1;
			} else {
				local79 = Static132.aFrame2;
			}
			local87 = local79.getSize().width;
			local91 = local79.getSize().height;
			if (local79 == Static132.aFrame2) {
				@Pc(97) Insets local97 = Static132.aFrame2.getInsets();
				local87 -= local97.left + local97.right;
				local91 -= local97.bottom + local97.top;
			}
			if (Static400.anInt7591 != local87 || local91 != Static116.anInt2331) {
				if (Static103.aClass39_3 == null || Static103.aClass39_3.method6080()) {
					Static477.method7123();
				} else {
					Static116.anInt2331 = local91;
					Static400.anInt7591 = local87;
				}
				Static485.aLong221 = Static143.method2502() + 500L;
			}
		}
		if (Static36.aFrame1 != null && !Static186.aBoolean264 && Static18.method525(Static271.anInt8654)) {
			Static301.method4737(-1, false, -1, Static281.aClass2_Sub19_Sub1_1.anInt2198);
		}
		@Pc(155) boolean local155 = false;
		if (Static96.aBoolean133) {
			Static96.aBoolean133 = false;
			local155 = true;
		}
		if (local155) {
			Static58.method1077();
		}
		if (Static103.aClass39_3 != null && Static103.aClass39_3.method6013() || Static181.method3002() != 1) {
			Static190.method3102();
		}
		if (Static271.anInt8654 == 0) {
			Static261.method4061(local155, Static328.aString132, Static390.aColorArray1[Static298.anInt5469], Static306.anInt5606, Static423.aColorArray2[Static298.anInt5469], Static450.aColorArray3[Static298.anInt5469]);
		} else if (Static271.anInt8654 == 1) {
			Static120.method2317(Static390.aColorArray1[Static298.anInt5469].getRGB(), Static103.aClass39_3, Static175.aClass47_1, local155 | Static103.aClass39_3.method6013(), Static423.aColorArray2[Static298.anInt5469].getRGB(), Static450.aColorArray3[Static298.anInt5469].getRGB());
		} else if (Static265.method5932(Static271.anInt8654)) {
			Static196.method3177();
		} else if (Static174.method2897(Static271.anInt8654)) {
			Static196.method3177();
		} else if (Static246.method3900(Static271.anInt8654)) {
			if (Static182.anInt3354 == 1) {
				if (Static261.anInt4671 > Static384.anInt7093) {
					Static384.anInt7093 = Static261.anInt4671;
				}
				local87 = (Static384.anInt7093 - Static261.anInt4671) * 50 / Static384.anInt7093;
				Static263.method4275(Static477.aClass47_4, true, Static290.aClass202_161.method5139(Static172.anInt6352) + "<br>(" + local87 + "%)");
			} else if (Static182.anInt3354 == 2) {
				if (Static181.anInt3350 > Static60.anInt1161) {
					Static60.anInt1161 = Static181.anInt3350;
				}
				local87 = (Static60.anInt1161 - Static181.anInt3350) * 50 / Static60.anInt1161 + 50;
				Static263.method4275(Static477.aClass47_4, true, Static290.aClass202_161.method5139(Static172.anInt6352) + "<br>(" + local87 + "%)");
			} else {
				Static263.method4275(Static477.aClass47_4, true, Static290.aClass202_161.method5139(Static172.anInt6352));
			}
		} else if (Static271.anInt8654 == 9) {
			Static542.method7777(local18);
		} else if (Static271.anInt8654 == 12) {
			Static263.method4275(Static477.aClass47_4, true, Static111.aClass202_69.method5139(Static172.anInt6352) + "<br>" + Static190.aClass202_113.method5139(Static172.anInt6352));
		}
		if (Static10.anInt227 == 3) {
			for (local87 = 0; local87 < Static528.anInt9120; local87++) {
				@Pc(387) Rectangle local387 = Class96.aRectangleArray1[local87];
				if (Static503.aBooleanArray37[local87]) {
					Static103.aClass39_3.method6052(local387.y, -1996553985, local387.x, local387.height, local387.width);
				} else if (Static36.aBooleanArray6[local87]) {
					Static103.aClass39_3.method6052(local387.y, -1996554240, local387.x, local387.height, local387.width);
				}
			}
		}
		if (Static387.method6221()) {
			Static408.method7606(Static103.aClass39_3);
		}
		if (Static18.method525(Static271.anInt8654) && Static10.anInt227 == 0 && Static181.method3002() == 1 && !local155 && Static482.aString186.equals("1.1")) {
			local87 = 0;
			for (local91 = 0; local91 < Static528.anInt9120; local91++) {
				if (Static36.aBooleanArray6[local91]) {
					Static36.aBooleanArray6[local91] = false;
					Static479.aRectangleArray2[local87++] = Class96.aRectangleArray1[local91];
				}
			}
			try {
				Static103.aClass39_3.method6064(Static479.aRectangleArray2, local87);
			} catch (@Pc(488) Exception_Sub1 local488) {
			}
		} else if (Static271.anInt8654 != 0) {
			for (local87 = 0; local87 < Static528.anInt9120; local87++) {
				Static36.aBooleanArray6[local87] = false;
			}
			try {
				Static103.aClass39_3.method6034();
			} catch (@Pc(511) Exception_Sub1 local511) {
				Static459.method6984(local511.getMessage() + " (Recovered) " + this.method1235(), local511);
				Static233.method6719(0);
			}
		}
		if (Static281.aClass2_Sub19_Sub1_1.anInt2183 == 0) {
			Static379.method5233(15L);
		} else if (Static281.aClass2_Sub19_Sub1_1.anInt2183 == 1) {
			Static379.method5233(10L);
		} else if (Static281.aClass2_Sub19_Sub1_1.anInt2183 == 2) {
			Static379.method5233(5L);
		} else if (Static281.aClass2_Sub19_Sub1_1.anInt2183 == 3) {
			Static379.method5233(2L);
		}
		if (Static361.aBoolean517) {
			Static465.method7009();
		}
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean197 && Static271.anInt8654 == 2 && Static387.anInt7341 != -1) {
			Static281.aClass2_Sub19_Sub1_1.aBoolean197 = false;
			Static281.aClass2_Sub19_Sub1_1.method2145(Static531.aClass283_6);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1251() {
		@Pc(12) boolean local12 = Static100.aClass94_1.method2499();
		if (!local12) {
			this.method1255();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1252() {
		if (Static271.anInt8654 == 13) {
			return;
		}
		Static115.anInt2326++;
		if (Static115.anInt2326 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static405.anInt7615 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static166.aRandom1.setSeed((long) Static405.anInt7615);
		}
		if (Static115.anInt2326 % 50 == 0) {
			Static431.anInt7911 = Static51.anInt917;
			Static233.anInt8026 = Static392.anInt7447;
			Static51.anInt917 = 0;
			Static392.anInt7447 = 0;
		}
		this.method1251();
		if (Static175.aClass143_1 != null) {
			Static175.aClass143_1.method3492();
		}
		Static28.method619();
		Static311.aClass189_1.method4712();
		Static61.aClass214_1.method7245();
		if (Static103.aClass39_3 != null) {
			Static103.aClass39_3.method6008((int) Static143.method2502());
		}
		Static254.method3981();
		Static33.anInt600 = 0;
		Static389.anInt7417 = 0;
		for (@Pc(99) Interface13 local99 = Static311.aClass189_1.method4713(); local99 != null; local99 = Static311.aClass189_1.method4713()) {
			@Pc(105) int local105 = local99.method5851();
			if (local105 == 2 || local105 == 3) {
				@Pc(134) char local134 = local99.method5852();
				if (Static365.method5858() && (local134 == '`' || local134 == '§')) {
					if (Static387.method6221()) {
						Static166.method2815();
					} else {
						Static52.method953();
					}
				} else if (Static33.anInt600 < 128) {
					Static394.anInterface13Array2[Static33.anInt600] = local99;
					Static33.anInt600++;
				}
			} else if (local105 == 0 && Static389.anInt7417 < 75) {
				Static251.anInterface13Array1[Static389.anInt7417] = local99;
				Static389.anInt7417++;
			}
		}
		Static101.anInt8474 = 0;
		for (@Pc(181) Class2_Sub26 local181 = Static61.aClass214_1.method7242(); local181 != null; local181 = Static61.aClass214_1.method7242()) {
			@Pc(187) int local187 = local181.method6655();
			if (local187 == -1) {
				Static347.aClass249_37.method6523(local181);
			} else if (local187 == 6) {
				Static101.anInt8474 += local181.method6657();
			} else if (Static101.method7094(local187)) {
				Static431.aClass249_61.method6523(local181);
				if (Static431.aClass249_61.method6522() > 10) {
					Static431.aClass249_61.method6529();
				}
			}
		}
		if (Static387.method6221()) {
			Static55.method1025();
		}
		if (Static271.anInt8654 == 0) {
			this.method1248();
			Static378.method5953();
		} else if (Static271.anInt8654 == 1) {
			this.method1248();
			Static378.method5953();
		} else if (Static246.method3900(Static271.anInt8654)) {
			Static348.method5486();
		}
		if (Static490.method6649(Static271.anInt8654) && !Static246.method3900(Static271.anInt8654)) {
			this.method1242();
			Static45.method837();
			Static378.method5947();
		} else if (Static14.method452(Static271.anInt8654) && !Static246.method3900(Static271.anInt8654)) {
			this.method1242();
			Static378.method5947();
		} else if (Static271.anInt8654 == 11) {
			Static378.method5947();
		} else if (Static522.method7564(Static271.anInt8654) && !Static246.method3900(Static271.anInt8654)) {
			Static139.method2469();
		} else if (Static271.anInt8654 == 12) {
			Static378.method5947();
			if (Static420.anInt7814 != -3 && Static420.anInt7814 != 2 && Static420.anInt7814 != 15) {
				Static346.method6463(false);
			}
		}
		Static538.method7753(Static103.aClass39_3);
		Static431.aClass249_61.method6529();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1255() {
		if (Static100.aClass94_1.anInt2646 > Static8.anInt214) {
			Static236.anInt4204 = (Static100.aClass94_1.anInt2646 - 1) * 50 * 5;
			Static471.aClass163_5.aBoolean339 = !Static471.aClass163_5.aBoolean339;
			if (Static236.anInt4204 > 3000) {
				Static236.anInt4204 = 3000;
			}
			if (Static100.aClass94_1.anInt2646 >= 2 && Static100.aClass94_1.anInt2645 == 6) {
				this.method1230("js5connect_outofdate");
				Static271.anInt8654 = 13;
				return;
			}
			if (Static100.aClass94_1.anInt2646 >= 4 && Static100.aClass94_1.anInt2645 == -1) {
				this.method1230("js5crc");
				Static271.anInt8654 = 13;
				return;
			}
			if (Static100.aClass94_1.anInt2646 >= 4 && Static156.method2698(Static271.anInt8654)) {
				if (Static100.aClass94_1.anInt2645 == 7 || Static100.aClass94_1.anInt2645 == 9) {
					this.method1230("js5connect_full");
				} else if (Static100.aClass94_1.anInt2645 > 0) {
					this.method1230("js5connect");
				} else {
					this.method1230("js5io");
				}
				Static271.anInt8654 = 13;
				return;
			}
		}
		Static8.anInt214 = Static100.aClass94_1.anInt2646;
		if (Static236.anInt4204 > 0) {
			Static236.anInt4204--;
			return;
		}
		try {
			if (Static427.anInt7873 == 0) {
				Static188.aClass20_2 = Static531.aClass283_6.method7169(Static471.aClass163_5.aString104, Static471.aClass163_5.method3978());
				Static427.anInt7873++;
			}
			if (Static427.anInt7873 == 1) {
				if (Static188.aClass20_2.anInt593 == 2) {
					this.method1245(1000);
					return;
				}
				if (Static188.aClass20_2.anInt593 == 1) {
					Static427.anInt7873++;
				}
			}
			if (Static427.anInt7873 == 2) {
				Static472.aClass31_5 = new Class31((Socket) Static188.aClass20_2.anObject2, Static531.aClass283_6);
				@Pc(180) Class2_Sub29 local180 = new Class2_Sub29(5);
				local180.method5172(Static319.aClass117_2.anInt3345);
				local180.method5185(607);
				Static472.aClass31_5.method950(5, local180.aByteArray96);
				Static427.anInt7873++;
				Static478.aLong218 = Static143.method2502();
			}
			if (Static427.anInt7873 == 3) {
				if (Static156.method2698(Static271.anInt8654) || Static472.aClass31_5.method952() > 0) {
					@Pc(218) int local218 = Static472.aClass31_5.method960();
					if (local218 != 0) {
						this.method1245(local218);
						return;
					}
					Static427.anInt7873++;
				} else if (Static143.method2502() - Static478.aLong218 > 30000L) {
					this.method1245(1001);
					return;
				}
			}
			if (Static427.anInt7873 == 4) {
				@Pc(270) boolean local270 = Static271.anInt8654 == 1 || Static490.method6649(Static271.anInt8654) || Static14.method452(Static271.anInt8654);
				Static100.aClass94_1.method2491(!local270, Static472.aClass31_5);
				Static427.anInt7873 = 0;
				Static188.aClass20_2 = null;
				Static472.aClass31_5 = null;
			}
		} catch (@Pc(287) IOException local287) {
			this.method1245(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I[B)V")
	private void method1258(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub29 local10 = new Class2_Sub29(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method5170();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(31) int[] local31 = Static253.anIntArray431 = new int[6];
					local31[0] = local10.method5229();
					local31[1] = local10.method5229();
					local31[2] = local10.method5229();
					local31[3] = local10.method5229();
					local31[4] = local10.method5229();
					local31[5] = local10.method5229();
				} else {
					@Pc(84) int local84;
					@Pc(89) int local89;
					if (local14 == 4) {
						local84 = local10.method5170();
						Static490.anIntArray606 = new int[local84];
						for (local89 = 0; local89 < local84; local89++) {
							Static490.anIntArray606[local89] = local10.method5229();
							if (Static490.anIntArray606[local89] == 65535) {
								Static490.anIntArray606[local89] = -1;
							}
						}
					} else if (local14 == 5) {
						local84 = local10.method5170();
						Static8.anIntArray16 = new int[local84];
						for (local89 = 0; local89 < local84; local89++) {
							Static8.anIntArray16[local89] = local10.method5229();
							if (Static8.anIntArray16[local89] == 65535) {
								Static8.anIntArray16[local89] = -1;
							}
						}
					}
				}
			}
		}
	}
}
