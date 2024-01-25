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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!cw;")
	public static Class58 lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static297.method5711("Argument count");
			}
			Static532.aClass43_5 = new Class43();
			Static532.aClass43_5.anInt1149 = Integer.parseInt(arg0[0]);
			Static453.aClass43_4 = new Class43();
			Static453.aClass43_4.anInt1149 = Integer.parseInt(arg0[1]);
			Static68.aClass43_1 = new Class43();
			Static68.aClass43_1.anInt1149 = Integer.parseInt(arg0[2]);
			Static134.aClass199_4 = Static357.aClass199_7;
			if (arg0[3].equals("live")) {
				Static449.aClass125_4 = Static117.aClass125_2;
			} else if (arg0[3].equals("rc")) {
				Static449.aClass125_4 = Static393.aClass125_3;
			} else if (arg0[3].equals("wip")) {
				Static449.aClass125_4 = Static108.aClass125_1;
			} else {
				Static297.method5711("modewhat");
			}
			Static194.anInt3737 = Static465.method6480(arg0[4]);
			if (Static194.anInt3737 == -1) {
				if (arg0[4].equals("english")) {
					Static194.anInt3737 = 0;
				} else if (arg0[4].equals("german")) {
					Static194.anInt3737 = 1;
				} else {
					Static297.method5711("language");
				}
			}
			Static270.aBoolean368 = false;
			Static343.aBoolean436 = false;
			if (arg0[5].equals("game0")) {
				Static525.aClass155_4 = Static300.aClass155_2;
			} else if (arg0[5].equals("game1")) {
				Static525.aClass155_4 = Static53.aClass155_1;
			} else {
				Static297.method5711("game");
			}
			Static125.aBoolean171 = true;
			Static153.aBoolean206 = true;
			Static433.anInt7630 = 0;
			Static499.aBoolean618 = false;
			Static420.aBoolean656 = false;
			Static291.aString59 = null;
			Static165.anInt3315 = Static525.aClass155_4.anInt4200;
			Static466.aString72 = "";
			Static252.anInt5081 = 0;
			Static353.anInt6597 = 0;
			@Pc(157) client local157 = new client();
			Static263.aClient1 = local157;
			local157.method1275(Static525.aClass155_4.aString44, Static449.aClass125_4.method3065() + 32);
			Static265.aFrame25.setLocation(40, 40);
		} catch (@Pc(180) Exception local180) {
			Static370.method6434(null, local180);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method1276() {
		if (Static17.anInt459 != 2) {
			this.method1293();
			return;
		}
		try {
			this.method1293();
		} catch (@Pc(12) Throwable local12) {
			Static370.method6434(local12.getMessage() + " (Recovered) " + this.method1265(), local12);
			Static77.method4915(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1265() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static515.anInt3214 + "," + Static338.anInt6353 + "," + Static460.anInt7894 + "," + Static235.anInt4493 + "|";
			if (Static35.aClass15_Sub2_Sub1_Sub1_1 != null) {
				local7 = local7 + "2)" + Static367.anInt6860 + "," + (Static515.anInt3214 + Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0]) + "," + (Static338.anInt6353 + Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0]) + "|";
			}
			local7 = local7 + "3)" + Static17.anInt459 + "|4)" + Static300.aClass5_Sub28_Sub1_1.anInt4872 + "|5)" + Static503.method6935() + "|6)" + Static383.anInt6994 + "," + Static456.anInt7874 + "|";
			local7 = local7 + "7)" + Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459) + "|";
			local7 = local7 + "8)" + Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) + "|";
			local7 = local7 + "9)" + Static300.aClass5_Sub28_Sub1_1.aBoolean330 + "|";
			local7 = local7 + "10)" + Static300.aClass5_Sub28_Sub1_1.aBoolean327 + "|";
			local7 = local7 + "11)" + Static300.aClass5_Sub28_Sub1_1.aBoolean335 + "|";
			local7 = local7 + "12)" + Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459) + "|";
			local7 = local7 + "13)" + Static193.anInt3735 + "|";
			local7 = local7 + "14)" + Static389.anInt7024;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(225) Throwable local225) {
			}
			try {
				if (Static17.anInt459 == 2) {
					@Pc(233) Class local233 = Class.forName("java.lang.ClassLoader");
					@Pc(237) Field local237 = local233.getDeclaredField("nativeLibraries");
					@Pc(240) Class local240 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(250) Method local250 = local240.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local250.invoke(local237, Boolean.TRUE);
					@Pc(273) Vector local273 = (Vector) local237.get(client.class.getClassLoader());
					for (@Pc(275) int local275 = 0; local275 < local273.size(); local275++) {
						try {
							@Pc(281) Object local281 = local273.elementAt(local275);
							@Pc(286) Field local286 = local281.getClass().getDeclaredField("name");
							local250.invoke(local286, Boolean.TRUE);
							try {
								@Pc(301) String local301 = (String) local286.get(local281);
								if (local301 != null && local301.indexOf("sw3d.dll") != -1) {
									@Pc(314) Field local314 = local281.getClass().getDeclaredField("handle");
									local250.invoke(local314, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local314.getLong(local281));
									local250.invoke(local314, Boolean.FALSE);
								}
							} catch (@Pc(350) Throwable local350) {
							}
							local250.invoke(local286, Boolean.FALSE);
						} catch (@Pc(362) Throwable local362) {
						}
					}
				}
			} catch (@Pc(374) Throwable local374) {
			}
			local7 = local7 + "]";
		} catch (@Pc(385) Throwable local385) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1287(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class5_Sub3 local16 = new Class5_Sub3(arg0);
		while (true) {
			@Pc(20) int local20 = local16.method4220();
			if (local20 == 0) {
				return;
			}
			if (local20 == 2) {
				Static465.anInt7976 = local16.method4227();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method1289(@OriginalArg(1) int arg0) {
		Static301.aClass55_3.anInt1461++;
		Static301.aClass55_3.anInt1462 = arg0;
		Static71.aClass301_4 = null;
		Static402.anInt7207 = 0;
		Static256.aClass83_6 = null;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1270()) {
			return;
		}
		Static532.aClass43_5 = new Class43();
		Static532.aClass43_5.anInt1149 = Integer.parseInt(this.getParameter("worldid"));
		Static453.aClass43_4 = new Class43();
		Static453.aClass43_4.anInt1149 = Integer.parseInt(this.getParameter("lobbyid"));
		Static453.aClass43_4.aString27 = this.getParameter("lobbyaddress");
		Static68.aClass43_1 = new Class43();
		Static68.aClass43_1.anInt1149 = Integer.parseInt(this.getParameter("demoid"));
		Static68.aClass43_1.aString27 = this.getParameter("demoaddress");
		Static134.aClass199_4 = Static209.method3379(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static344.method5363(Static134.aClass199_4) && Static134.aClass199_4 != Static124.aClass199_3) {
			Static134.aClass199_4 = Static124.aClass199_3;
		}
		Static449.aClass125_4 = Static332.method5225(Integer.parseInt(this.getParameter("modewhat")));
		if (Static449.aClass125_4 != Static108.aClass125_1 && Static393.aClass125_3 != Static449.aClass125_4 && Static449.aClass125_4 != Static117.aClass125_2) {
			Static449.aClass125_4 = Static117.aClass125_2;
		}
		try {
			Static194.anInt3737 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static194.anInt3737 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static270.aBoolean368 = true;
		} else {
			Static270.aBoolean368 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static343.aBoolean436 = true;
		} else {
			Static343.aBoolean436 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static424.aBoolean533 = true;
		} else {
			Static424.aBoolean533 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static525.aClass155_4 = Static300.aClass155_2;
			} else if (local145.equals("1")) {
				Static525.aClass155_4 = Static53.aClass155_1;
			}
		}
		try {
			Static433.anInt7630 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static433.anInt7630 = 0;
		}
		Static103.aString24 = this.getParameter("quiturl");
		Static466.aString72 = this.getParameter("settings");
		if (Static466.aString72 == null) {
			Static466.aString72 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static353.anInt6597 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static353.anInt6597 = 0;
			}
		}
		Static165.anInt3315 = Integer.parseInt(this.getParameter("colourid"));
		if (Static165.anInt3315 < 0 || Static165.anInt3315 >= Static373.aColorArray2.length) {
			Static165.anInt3315 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static125.aBoolean171 = true;
			Static153.aBoolean206 = true;
		}
		@Pc(232) String local232 = this.getParameter("frombilling");
		if (local232 != null && local232.equals("true")) {
			Static420.aBoolean656 = true;
		}
		Static291.aString59 = this.getParameter("sskey");
		if (Static291.aString59 != null && Static291.aString59.length() < 2) {
			Static291.aString59 = null;
		}
		@Pc(256) String local256 = this.getParameter("force64mb");
		if (local256 != null && local256.equals("true")) {
			Static499.aBoolean618 = true;
		}
		@Pc(268) String local268 = this.getParameter("worldflags");
		if (local268 != null) {
			try {
				Static252.anInt5081 = Integer.parseInt(local268);
			} catch (@Pc(275) Exception local275) {
			}
		}
		Static263.aClient1 = this;
		if (Static525.aClass155_4 == Static300.aClass155_2) {
			Static495.anInt8489 = 503;
			Static508.anInt8634 = 765;
		} else if (Static53.aClass155_1 == Static525.aClass155_4) {
			Static508.anInt8634 = 640;
			Static495.anInt8489 = 480;
		}
		this.method1280(Static508.anInt8634, Static495.anInt8489, Static449.aClass125_4.method3065() + 32);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method1293() {
		if (Static389.anInt7024 == 13) {
			return;
		}
		@Pc(24) long local24 = Static431.method6137() / 1000000L - Static424.aLong208;
		Static424.aLong208 = Static431.method6137() / 1000000L;
		@Pc(32) boolean local32 = Static145.method2747();
		if (local32 && Static359.aBoolean477 && Static164.aClass146_1 != null) {
			Static164.aClass146_1.method5760();
		}
		if (Static148.method2763(Static389.anInt7024)) {
			if (Static334.aLong191 != 0L && Static105.method2132() > Static334.aLong191) {
				Static302.method4984(Static300.aClass5_Sub28_Sub1_1.anInt4888, Static300.aClass5_Sub28_Sub1_1.anInt4890, false, Static503.method6935());
			} else if (!Static110.aClass62_15.method7005() && Static398.aBoolean504) {
				Static423.method6080();
			}
		}
		@Pc(93) int local93;
		@Pc(97) int local97;
		if (Static254.aFrame32 == null) {
			@Pc(84) Container local84;
			if (Static265.aFrame25 == null) {
				local84 = Static159.aClass9_10.anApplet1;
			} else {
				local84 = Static265.aFrame25;
			}
			local93 = local84.getSize().width;
			local97 = local84.getSize().height;
			if (local84 == Static265.aFrame25) {
				@Pc(103) Insets local103 = Static265.aFrame25.getInsets();
				local97 -= local103.bottom + local103.top;
				local93 -= local103.right + local103.left;
			}
			if (local93 != Static149.anInt3095 || Static295.anInt5920 != local97) {
				if (Static110.aClass62_15 == null || Static110.aClass62_15.method7049()) {
					Static349.method5429();
				} else {
					Static295.anInt5920 = local97;
					Static149.anInt3095 = local93;
				}
				Static334.aLong191 = Static105.method2132() + 500L;
			}
		}
		if (Static254.aFrame32 != null && !Static538.aBoolean658 && Static148.method2763(Static389.anInt7024)) {
			Static302.method4984(-1, -1, false, Static300.aClass5_Sub28_Sub1_1.anInt4891);
		}
		@Pc(170) boolean local170 = false;
		if (Static304.aBoolean414) {
			Static304.aBoolean414 = false;
			local170 = true;
		}
		if (local170) {
			Static275.method4502();
		}
		if (Static110.aClass62_15 != null && Static110.aClass62_15.method7005() || Static503.method6935() != 1) {
			Static544.method2108();
		}
		if (Static389.anInt7024 == 0) {
			Static68.method1288(Static276.anInt5393, Static23.aColorArray1[Static165.anInt3315], Static531.aString84, Static373.aColorArray2[Static165.anInt3315], local170, Static470.aColorArray3[Static165.anInt3315]);
		} else if (Static389.anInt7024 == 1) {
			Static397.method5785(Static130.aClass13_2, Static110.aClass62_15, Static23.aColorArray1[Static165.anInt3315].getRGB(), Static470.aColorArray3[Static165.anInt3315].getRGB(), Static373.aColorArray2[Static165.anInt3315].getRGB(), local170 | Static110.aClass62_15.method7005());
		} else if (Static323.method5119(Static389.anInt7024)) {
			Static374.method5618();
		} else if (Static432.method6167(Static389.anInt7024)) {
			Static374.method5618();
		} else if (Static143.method2702(Static389.anInt7024)) {
			if (Static23.anInt489 == 1) {
				if (Static224.anInt4180 < Static178.anInt3484) {
					Static224.anInt4180 = Static178.anInt3484;
				}
				local93 = (Static224.anInt4180 - Static178.anInt3484) * 50 / Static224.anInt4180;
				Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737) + "<br>(" + local93 + "%)", Static492.aClass13_3, true);
			} else if (Static23.anInt489 == 2) {
				if (Static246.anInt5007 > Static307.anInt6046) {
					Static307.anInt6046 = Static246.anInt5007;
				}
				local93 = (Static307.anInt6046 - Static246.anInt5007) * 50 / Static307.anInt6046 + 50;
				Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737) + "<br>(" + local93 + "%)", Static492.aClass13_3, true);
			} else {
				Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737), Static492.aClass13_3, true);
			}
		} else if (Static389.anInt7024 == 9) {
			Static492.method6833(local24);
		} else if (Static389.anInt7024 == 12) {
			Static513.method7097(Static181.aClass40_58.method1063(Static194.anInt3737) + "<br>" + Static208.aClass40_62.method1063(Static194.anInt3737), Static492.aClass13_3, true);
		}
		if (Static405.anInt7237 == 3) {
			for (local93 = 0; local93 < Static423.anInt7490; local93++) {
				@Pc(400) Rectangle local400 = Class192.aRectangleArray3[local93];
				if (Static106.aBooleanArray13[local93]) {
					Static110.aClass62_15.method7040(-1996553985, local400.height, local400.y, local400.x, local400.width);
				} else if (Static386.aBooleanArray15[local93]) {
					Static110.aClass62_15.method7040(-1996554240, local400.height, local400.y, local400.x, local400.width);
				}
			}
		}
		if (Static481.method6699()) {
			Static460.method6392(Static110.aClass62_15);
		}
		if (Static148.method2763(Static389.anInt7024) && Static405.anInt7237 == 0 && Static503.method6935() == 1 && !local170 && Static9.aString7.equals("1.1")) {
			local93 = 0;
			for (local97 = 0; local97 < Static423.anInt7490; local97++) {
				if (Static386.aBooleanArray15[local97]) {
					Static386.aBooleanArray15[local97] = false;
					Static335.aRectangleArray2[local93++] = Class192.aRectangleArray3[local97];
				}
			}
			try {
				Static110.aClass62_15.method7055(Static335.aRectangleArray2, local93);
			} catch (@Pc(500) Exception_Sub1 local500) {
			}
		} else if (Static389.anInt7024 != 0) {
			for (local93 = 0; local93 < Static423.anInt7490; local93++) {
				Static386.aBooleanArray15[local93] = false;
			}
			try {
				Static110.aClass62_15.method7030();
			} catch (@Pc(527) Exception_Sub1 local527) {
				Static370.method6434(local527.getMessage() + " (Recovered) " + this.method1265(), local527);
				Static77.method4915(0);
			}
		}
		if (Static300.aClass5_Sub28_Sub1_1.anInt4868 == 0) {
			Static213.method3465(15L);
		} else if (Static300.aClass5_Sub28_Sub1_1.anInt4868 == 1) {
			Static213.method3465(10L);
		} else if (Static300.aClass5_Sub28_Sub1_1.anInt4868 == 2) {
			Static213.method3465(5L);
		} else if (Static300.aClass5_Sub28_Sub1_1.anInt4868 == 3) {
			Static213.method3465(2L);
		}
		if (Static404.aBoolean510) {
			Static140.method2600();
		}
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean341 && Static389.anInt7024 == 2 && Static395.anInt7085 != -1) {
			Static300.aClass5_Sub28_Sub1_1.aBoolean341 = false;
			Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1296() {
		if (Static301.aClass55_3.anInt1461 > Static422.anInt7462) {
			Static292.anInt5881 = (Static301.aClass55_3.anInt1461 * 50 - 50) * 5;
			Static212.aClass43_2.aBoolean60 = !Static212.aClass43_2.aBoolean60;
			if (Static292.anInt5881 > 3000) {
				Static292.anInt5881 = 3000;
			}
			if (Static301.aClass55_3.anInt1461 >= 2 && Static301.aClass55_3.anInt1462 == 6) {
				this.method1262("js5connect_outofdate");
				Static389.anInt7024 = 13;
				return;
			}
			if (Static301.aClass55_3.anInt1461 >= 4 && Static301.aClass55_3.anInt1462 == -1) {
				this.method1262("js5crc");
				Static389.anInt7024 = 13;
				return;
			}
			if (Static301.aClass55_3.anInt1461 >= 4 && Static263.method4380(Static389.anInt7024)) {
				if (Static301.aClass55_3.anInt1462 == 7 || Static301.aClass55_3.anInt1462 == 9) {
					this.method1262("js5connect_full");
				} else if (Static301.aClass55_3.anInt1462 <= 0) {
					this.method1262("js5io");
				} else {
					this.method1262("js5connect");
				}
				Static389.anInt7024 = 13;
				return;
			}
		}
		Static422.anInt7462 = Static301.aClass55_3.anInt1461;
		if (Static292.anInt5881 > 0) {
			Static292.anInt5881--;
			return;
		}
		try {
			if (Static402.anInt7207 == 0) {
				Static256.aClass83_6 = Static159.aClass9_10.method276(Static212.aClass43_2.aString27, Static212.aClass43_2.method1116());
				Static402.anInt7207++;
			}
			if (Static402.anInt7207 == 1) {
				if (Static256.aClass83_6.anInt2495 == 2) {
					this.method1289(1000);
					return;
				}
				if (Static256.aClass83_6.anInt2495 == 1) {
					Static402.anInt7207++;
				}
			}
			if (Static402.anInt7207 == 2) {
				Static71.aClass301_4 = new Class301((Socket) Static256.aClass83_6.anObject8, Static159.aClass9_10);
				@Pc(176) Class5_Sub3 local176 = new Class5_Sub3(5);
				local176.method4192(Static357.aClass243_2.anInt7052);
				local176.method4184(608);
				Static71.aClass301_4.method7099(5, local176.aByteArray66);
				Static402.anInt7207++;
				Static529.aLong247 = Static105.method2132();
			}
			if (Static402.anInt7207 == 3) {
				if (Static263.method4380(Static389.anInt7024) || Static71.aClass301_4.method7103() > 0) {
					@Pc(228) int local228 = Static71.aClass301_4.method7102();
					if (local228 != 0) {
						this.method1289(local228);
						return;
					}
					Static402.anInt7207++;
				} else if (Static105.method2132() - Static529.aLong247 > 30000L) {
					this.method1289(1001);
					return;
				}
			}
			if (Static402.anInt7207 == 4) {
				@Pc(259) boolean local259 = Static389.anInt7024 == 1 || Static443.method6281(Static389.anInt7024) || Static545.method7421(Static389.anInt7024);
				Static301.aClass55_3.method1342(Static71.aClass301_4, !local259);
				Static402.anInt7207 = 0;
				Static71.aClass301_4 = null;
				Static256.aClass83_6 = null;
			}
		} catch (@Pc(281) IOException local281) {
			this.method1289(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method1266() {
		if (Static499.aBoolean618) {
			Static193.anInt3735 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static349.method5429();
		Static201.aClass237_3 = new Class237(Static159.aClass9_10);
		Static301.aClass55_3 = new Class55();
		if (Static124.aClass199_3 != Static134.aClass199_4) {
			Static246.aByteArrayArray28 = new byte[50][];
		}
		Static300.aClass5_Sub28_Sub1_1 = new Class5_Sub28_Sub1(Static159.aClass9_10);
		if (Static134.aClass199_4 == Static124.aClass199_3) {
			Static532.aClass43_5.aString27 = this.getCodeBase().getHost();
		} else if (Static344.method5363(Static134.aClass199_4)) {
			Static532.aClass43_5.aString27 = this.getCodeBase().getHost();
			Static532.aClass43_5.anInt1154 = Static532.aClass43_5.anInt1149 + 40000;
			Static453.aClass43_4.anInt1154 = Static453.aClass43_4.anInt1149 + 40000;
			Static68.aClass43_1.anInt1154 = Static68.aClass43_1.anInt1149 + 40000;
			Static532.aClass43_5.anInt1152 = Static532.aClass43_5.anInt1149 + 50000;
			Static453.aClass43_4.anInt1152 = Static453.aClass43_4.anInt1149 + 50000;
			Static68.aClass43_1.anInt1152 = Static68.aClass43_1.anInt1149 + 50000;
		} else if (Static134.aClass199_4 == Static357.aClass199_7) {
			Static532.aClass43_5.aString27 = "127.0.0.1";
			Static453.aClass43_4.aString27 = "127.0.0.1";
			Static532.aClass43_5.anInt1154 = Static532.aClass43_5.anInt1149 + 40000;
			Static68.aClass43_1.aString27 = "127.0.0.1";
			Static453.aClass43_4.anInt1154 = Static453.aClass43_4.anInt1149 + 40000;
			Static68.aClass43_1.anInt1154 = Static68.aClass43_1.anInt1149 + 40000;
			Static532.aClass43_5.anInt1152 = Static532.aClass43_5.anInt1149 + 50000;
			Static453.aClass43_4.anInt1152 = Static453.aClass43_4.anInt1149 + 50000;
			Static68.aClass43_1.anInt1152 = Static68.aClass43_1.anInt1149 + 50000;
		}
		if (Static53.aClass155_1 == Static525.aClass155_4) {
			Static141.aShortArrayArray4 = Static131.aShortArrayArray3;
			Static399.aShortArray112 = Static357.aShortArray108;
			Static449.anInt7818 = 16777215;
			Static2.aBoolean3 = true;
			Static247.aShortArray50 = Static196.aShortArray35;
			Static130.aShortArrayArray2 = Static385.aShortArrayArray7;
			Static435.anInt7660 = 0;
		} else {
			Static247.aShortArray50 = Static379.aShortArray109;
			Static130.aShortArrayArray2 = Static65.aShortArrayArray1;
			Static399.aShortArray112 = Static394.aShortArray111;
			Static141.aShortArrayArray4 = Static155.aShortArrayArray5;
		}
		Static212.aClass43_2 = Static532.aClass43_5;
		Static382.aShortArray110 = Static421.aShortArray117 = Static342.aShortArray129 = Static449.aShortArray120 = new short[256];
		if (Static300.aClass155_2 == Static525.aClass155_4) {
			Static409.aBoolean518 = false;
		}
		Static59.aClass18_1 = Static366.method5587(Static209.aCanvas6);
		Static280.aClass214_1 = Static4.method5498(Static209.aCanvas6);
		Static179.anInt3490 = Static9.anInt148;
		try {
			if (Static159.aClass9_10.aClass97_1 != null) {
				Static513.aClass149_5 = new Class149(Static159.aClass9_10.aClass97_1, 5200, 0);
				for (@Pc(218) int local218 = 0; local218 < 32; local218++) {
					Static69.aClass149Array1[local218] = new Class149(Static159.aClass9_10.aClass97Array1[local218], 6000, 0);
				}
				Static91.aClass149_1 = new Class149(Static159.aClass9_10.aClass97_3, 6000, 0);
				Static167.aClass112_4 = new Class112(255, Static513.aClass149_5, Static91.aClass149_1, 500000);
				Static271.aClass149_4 = new Class149(Static159.aClass9_10.aClass97_2, 24, 0);
				Static159.aClass9_10.aClass97_3 = null;
				Static159.aClass9_10.aClass97_1 = null;
				Static159.aClass9_10.aClass97Array1 = null;
				Static159.aClass9_10.aClass97_2 = null;
			}
		} catch (@Pc(276) IOException local276) {
			Static91.aClass149_1 = null;
			Static167.aClass112_4 = null;
			Static271.aClass149_4 = null;
			Static513.aClass149_5 = null;
		}
		if (Static134.aClass199_4 != Static124.aClass199_3) {
			Static399.aBoolean506 = true;
		}
		if (Static300.aClass155_2 == Static525.aClass155_4) {
			Static499.aString78 = Static430.aClass40_125.method1063(Static194.anInt3737);
		} else if (Static525.aClass155_4 == Static53.aClass155_1) {
			Static499.aString78 = Static104.aClass40_34.method1063(Static194.anInt3737);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1298() {
		@Pc(9) boolean local9 = Static301.aClass55_3.method1340();
		if (!local9) {
			this.method1296();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	private void method1299(@OriginalArg(1) byte[] arg0) {
		@Pc(17) Class5_Sub3 local17 = new Class5_Sub3(arg0);
		while (true) {
			while (true) {
				@Pc(21) int local21 = local17.method4220();
				if (local21 == 0) {
					return;
				}
				if (local21 == 1) {
					@Pc(33) int[] local33 = Static194.anIntArray273 = new int[6];
					local33[0] = local17.method4227();
					local33[1] = local17.method4227();
					local33[2] = local17.method4227();
					local33[3] = local17.method4227();
					local33[4] = local17.method4227();
					local33[5] = local17.method4227();
				} else {
					@Pc(78) int local78;
					@Pc(83) int local83;
					if (local21 == 4) {
						local78 = local17.method4220();
						Static101.anIntArray198 = new int[local78];
						for (local83 = 0; local83 < local78; local83++) {
							Static101.anIntArray198[local83] = local17.method4227();
							if (Static101.anIntArray198[local83] == 65535) {
								Static101.anIntArray198[local83] = -1;
							}
						}
					} else if (local21 == 5) {
						local78 = local17.method4220();
						Static324.anIntArray467 = new int[local78];
						for (local83 = 0; local83 < local78; local83++) {
							Static324.anIntArray467[local83] = local17.method4227();
							if (Static324.anIntArray467[local83] == 65535) {
								Static324.anIntArray467[local83] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method1300() {
		@Pc(6) int local6;
		if (!Static300.aClass5_Sub28_Sub1_1.aBoolean341) {
			for (local6 = 0; local6 < Static214.anInt4064; local6++) {
				if (Static39.anInterface1Array1[local6].method5008() == 's' || Static39.anInterface1Array1[local6].method5008() == 'S') {
					Static300.aClass5_Sub28_Sub1_1.aBoolean341 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static337.anInt6332 == 0) {
			@Pc(41) Runtime local41 = Runtime.getRuntime();
			local50 = (int) ((local41.totalMemory() - local41.freeMemory()) / 1024L);
			@Pc(53) long local53 = Static105.method2132();
			if (Static321.aLong174 == 0L) {
				Static321.aLong174 = local53;
			}
			if (local50 > 16384 && local53 - Static321.aLong174 < 5000L) {
				if (local53 - Static78.aLong50 > 1000L) {
					System.gc();
					Static78.aLong50 = local53;
				}
				Static531.aString84 = Static294.aClass40_119.method1063(Static194.anInt3737);
				Static276.anInt5393 = 5;
			} else {
				Static531.aString84 = Static314.aClass40_70.method1063(Static194.anInt3737);
				Static337.anInt6332 = 10;
				Static276.anInt5393 = 5;
			}
		} else if (Static337.anInt6332 == 10) {
			for (local6 = 0; local6 < 4; local6++) {
				Static71.aClass10Array3[local6] = Static121.method2296(Static460.anInt7894, Static235.anInt4493);
			}
			Static531.aString84 = Static164.aClass40_52.method1063(Static194.anInt3737);
			Static337.anInt6332 = 20;
			Static276.anInt5393 = 10;
		} else if (Static337.anInt6332 == 20) {
			if (Static227.aClass91_1 == null) {
				Static227.aClass91_1 = new Class91(Static301.aClass55_3, Static201.aClass237_3, Static77.aBigInteger6, Static391.aBigInteger7);
			}
			if (Static227.aClass91_1.method2319()) {
				Static46.aClass117_21 = Static229.method3776(false, 0, true);
				Static454.aClass117_190 = Static229.method3776(false, 1, true);
				Static212.aClass117_110 = Static229.method3776(false, 2, true);
				Static52.aClass117_28 = Static229.method3776(false, 3, true);
				Static371.aClass117_157 = Static229.method3776(false, 4, true);
				Static338.aClass117_151 = Static229.method3776(true, 5, true);
				Static108.aClass117_61 = Static229.method3776(true, 6, false);
				Static290.aClass117_131 = Static229.method3776(false, 7, true);
				Static533.aClass117_228 = Static229.method3776(false, 8, true);
				Static533.aClass117_229 = Static229.method3776(false, 9, true);
				Static193.aClass117_104 = Static229.method3776(false, 10, true);
				Static56.aClass117_29 = Static229.method3776(false, 11, true);
				Static497.aClass117_234 = Static229.method3776(false, 12, true);
				Static145.aClass117_76 = Static229.method3776(false, 13, true);
				Static476.aClass117_204 = Static229.method3776(false, 14, false);
				Static393.aClass117_164 = Static229.method3776(false, 15, true);
				Static382.aClass117_162 = Static229.method3776(false, 16, true);
				Static437.aClass117_181 = Static229.method3776(false, 17, true);
				Static315.aClass117_141 = Static229.method3776(false, 18, true);
				Static178.aClass117_97 = Static229.method3776(false, 19, true);
				Static444.aClass117_183 = Static229.method3776(false, 20, true);
				Static162.aClass117_88 = Static229.method3776(false, 21, true);
				Static435.aClass117_180 = Static229.method3776(false, 22, true);
				Static317.aClass117_142 = Static229.method3776(true, 23, true);
				Static539.aClass117_232 = Static229.method3776(false, 24, true);
				Static72.aClass117_35 = Static229.method3776(false, 25, true);
				Static419.aClass117_175 = Static229.method3776(true, 26, true);
				Static79.aClass117_38 = Static229.method3776(false, 27, true);
				Static541.aClass117_233 = Static229.method3776(true, 28, true);
				Static466.aClass117_199 = Static229.method3776(false, 29, true);
				Static530.aClass117_226 = Static229.method3776(true, 30, true);
				Static337.aClass117_149 = Static229.method3776(true, 31, true);
				Static531.aString84 = Static459.aClass40_131.method1063(Static194.anInt3737);
				Static337.anInt6332 = 30;
				Static276.anInt5393 = 15;
			} else {
				Static531.aString84 = Static395.aClass40_110.method1063(Static194.anInt3737);
				Static276.anInt5393 = 12;
			}
		} else if (Static337.anInt6332 == 30) {
			local6 = 0;
			for (local50 = 0; local50 < 32; local50++) {
				local6 += Static345.aClass79_Sub1Array2[local50].method2223() * Static415.anIntArray569[local50] / 100;
			}
			if (local6 == 100) {
				Static531.aString84 = Static66.aClass40_20.method1063(Static194.anInt3737);
				Static276.anInt5393 = 20;
				Static38.method836(Static533.aClass117_228);
				Static400.method5818(Static533.aClass117_228);
				Static337.anInt6332 = 35;
			} else {
				if (local6 != 0) {
					Static531.aString84 = Static145.aClass40_46.method1063(Static194.anInt3737) + local6 + "%";
				}
				Static276.anInt5393 = 20;
			}
		} else if (Static337.anInt6332 == 35) {
			Static135.method2551(Static159.aClass9_10, Static530.aClass117_226);
			Static531.aString84 = Static463.aClass40_133.method1063(Static194.anInt3737);
			Static337.anInt6332 = 40;
			Static276.anInt5393 = 20;
		} else if (Static337.anInt6332 == 40) {
			if (Static541.aClass117_233.method2968()) {
				this.method1299(Static541.aClass117_233.method2964(1));
				this.method1287(Static541.aClass117_233.method2964(3));
				if (Static465.anInt7976 == -1 || Static290.aClass117_131.method2974(0, Static465.anInt7976)) {
					Static531.aString84 = Static535.aClass40_152.method1063(Static194.anInt3737);
					Static276.anInt5393 = 25;
					Static337.anInt6332 = 41;
				}
			} else {
				Static531.aString84 = Static168.aClass40_113.method1063(Static194.anInt3737) + Static541.aClass117_233.method2958() + "%";
				Static276.anInt5393 = 25;
			}
		} else if (Static337.anInt6332 == 41) {
			local6 = Static224.method3562("jaggl");
			if (local6 >= 0 && local6 < 100) {
				Static531.aString84 = Static230.aClass40_71.method1063(Static194.anInt3737) + local6 + "%";
				Static276.anInt5393 = 25;
			} else {
				Static531.aString84 = Static541.aClass40_156.method1063(Static194.anInt3737);
				Static276.anInt5393 = 25;
				Static337.anInt6332 = 42;
			}
		} else if (Static337.anInt6332 == 42) {
			local6 = Static224.method3562("jagdx");
			if (local6 >= 0 && local6 < 100) {
				Static531.aString84 = Static200.aClass40_60.method1063(Static194.anInt3737) + local6 + "%";
				Static276.anInt5393 = 25;
			} else {
				Static531.aString84 = Static147.aClass40_47.method1063(Static194.anInt3737);
				Static337.anInt6332 = 43;
				Static276.anInt5393 = 25;
			}
		} else if (Static337.anInt6332 == 43) {
			local6 = Static224.method3562("jagmisc");
			if (local6 >= 0 && local6 < 100) {
				Static531.aString84 = Static496.aClass40_144.method1063(Static194.anInt3737) + local6 + "%";
				Static276.anInt5393 = 25;
			} else {
				if (local6 == 100) {
					this.method1278();
				}
				Static531.aString84 = Static356.aClass40_102.method1063(Static194.anInt3737);
				Static337.anInt6332 = 44;
				Static276.anInt5393 = 25;
			}
		} else if (Static337.anInt6332 == 44) {
			local6 = Static224.method3562("sw3d");
			if (local6 >= 0 && local6 < 100) {
				Static531.aString84 = Static479.aClass40_138.method1063(Static194.anInt3737) + local6 + "%";
				Static276.anInt5393 = 25;
			} else {
				Static531.aString84 = Static43.aClass40_13.method1063(Static194.anInt3737);
				Static337.anInt6332 = 45;
				Static276.anInt5393 = 25;
			}
		} else if (Static337.anInt6332 == 45) {
			local6 = Static224.method3562("jaclib");
			if (local6 >= 0 && local6 < 100) {
				Static531.aString84 = Static141.aClass40_42.method1063(Static194.anInt3737) + local6 + "%";
				Static276.anInt5393 = 25;
			} else {
				if (local6 == 100) {
					this.method1272();
				}
				Static531.aString84 = Static80.aClass40_22.method1063(Static194.anInt3737);
				Static337.anInt6332 = 46;
				Static276.anInt5393 = 25;
			}
		} else if (Static337.anInt6332 == 46) {
			local6 = Static224.method3562("hw3d");
			if (local6 >= 0 && local6 < 100) {
				Static531.aString84 = Static363.aClass40_103.method1063(Static194.anInt3737) + local6 + "%";
				Static276.anInt5393 = 25;
			} else {
				Static531.aString84 = Static369.aClass40_91.method1063(Static194.anInt3737);
				Static276.anInt5393 = 25;
				Static337.anInt6332 = 47;
			}
		} else if (Static337.anInt6332 == 47) {
			if (Static337.aClass117_149.method2968()) {
				Static531.aString84 = Static487.aClass40_139.method1063(Static194.anInt3737);
				Static337.anInt6332 = 50;
				Static276.anInt5393 = 25;
			} else {
				Static531.aString84 = Static64.aClass40_19.method1063(Static194.anInt3737);
				Static276.anInt5393 = 25;
			}
		} else if (Static337.anInt6332 == 50) {
			Static515.method2861();
			Static531.aString84 = Static525.aClass40_149.method1063(Static194.anInt3737);
			Static276.anInt5393 = 30;
			Static337.anInt6332 = 60;
		} else if (Static337.anInt6332 == 60) {
			local6 = Static519.method7159(Static145.aClass117_76, Static533.aClass117_228);
			local50 = Static220.method3536();
			if (local50 > local6) {
				Static531.aString84 = Static525.aClass40_148.method1063(Static194.anInt3737) + local6 * 100 / local50 + "%";
				Static276.anInt5393 = 35;
			} else {
				Static531.aString84 = Static128.aClass40_38.method1063(Static194.anInt3737);
				Static337.anInt6332 = 70;
				Static276.anInt5393 = 35;
			}
		} else if (Static337.anInt6332 == 70) {
			local6 = Static418.method6026(Static533.aClass117_228);
			local50 = Static314.method3573();
			if (local6 < local50) {
				Static531.aString84 = Static388.aClass40_108.method1063(Static194.anInt3737) + local6 * 100 / local50 + "%";
				Static276.anInt5393 = 40;
			} else {
				Static531.aString84 = Static295.aClass40_88.method1063(Static194.anInt3737);
				Static276.anInt5393 = 40;
				Static337.anInt6332 = 80;
			}
		} else if (Static337.anInt6332 == 80) {
			if (Static419.aClass117_175.method2968()) {
				Static36.anInterface8_21 = new Class310(Static419.aClass117_175, Static533.aClass117_229, Static533.aClass117_228);
				Static531.aString84 = Static291.aClass40_85.method1063(Static194.anInt3737);
				Static276.anInt5393 = 45;
				Static337.anInt6332 = 90;
			} else {
				Static531.aString84 = Static12.aClass40_3.method1063(Static194.anInt3737) + Static419.aClass117_175.method2958() + "%";
				Static276.anInt5393 = 45;
			}
		} else if (Static337.anInt6332 == 90) {
			Static531.aString84 = Static465.aClass40_135.method1063(Static194.anInt3737);
			Static276.anInt5393 = 50;
			Static337.anInt6332 = 95;
		} else if (Static337.anInt6332 == 95) {
			if (Static300.aClass5_Sub28_Sub1_1.aBoolean341) {
				Static300.aClass5_Sub28_Sub1_1.anInt4869 = 0;
				Static300.aClass5_Sub28_Sub1_1.anInt4873 = 0;
				Static300.aClass5_Sub28_Sub1_1.anInt4887 = 0;
				Static300.aClass5_Sub28_Sub1_1.anInt4891 = 1;
				Static300.aClass5_Sub28_Sub1_1.anInt4872 = 0;
			}
			Static300.aClass5_Sub28_Sub1_1.aBoolean341 = true;
			Static300.aClass5_Sub28_Sub1_1.method4132(Static159.aClass9_10);
			Static436.method6218(false, Static300.aClass5_Sub28_Sub1_1.anInt4887);
			Static531.aString84 = Static417.aClass40_118.method1063(Static194.anInt3737);
			Static337.anInt6332 = 100;
			Static276.anInt5393 = 55;
		} else if (Static337.anInt6332 == 100) {
			Static349.method5430(Static145.aClass117_76, Static110.aClass62_15, Static533.aClass117_228);
			Static531.aString84 = Static435.aClass40_126.method1063(Static194.anInt3737);
			Static276.anInt5393 = 60;
			Static287.method4831(1);
			Static337.anInt6332 = 110;
		} else if (Static337.anInt6332 == 110) {
			Static212.aClass117_110.method2968();
			local6 = Static212.aClass117_110.method2958();
			Static382.aClass117_162.method2968();
			local6 += Static382.aClass117_162.method2958();
			Static437.aClass117_181.method2968();
			local6 += Static437.aClass117_181.method2958();
			Static315.aClass117_141.method2968();
			local6 += Static315.aClass117_141.method2958();
			Static178.aClass117_97.method2968();
			local6 += Static178.aClass117_97.method2958();
			Static444.aClass117_183.method2968();
			local6 += Static444.aClass117_183.method2958();
			Static162.aClass117_88.method2968();
			local6 += Static162.aClass117_88.method2958();
			Static435.aClass117_180.method2968();
			local6 += Static435.aClass117_180.method2958();
			Static539.aClass117_232.method2968();
			local6 += Static539.aClass117_232.method2958();
			Static72.aClass117_35.method2968();
			local6 += Static72.aClass117_35.method2958();
			Static79.aClass117_38.method2968();
			local6 += Static79.aClass117_38.method2958();
			Static466.aClass117_199.method2968();
			local6 += Static466.aClass117_199.method2958();
			if (local6 < 1200) {
				Static531.aString84 = Static68.aClass40_21.method1063(Static194.anInt3737) + local6 / 12 + "%";
				Static276.anInt5393 = 65;
			} else {
				Static216.aClass298_11 = new Class298(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static201.aClass85_1 = new Class85(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static454.aClass231_2 = new Class231(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110, Static533.aClass117_228);
				Static518.aClass241_1 = new Class241(Static525.aClass155_4, Static194.anInt3737, Static437.aClass117_181);
				Static230.aClass307_2 = new Class307(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static27.aClass38_1 = new Class38(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static261.aClass211_2 = new Class211(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110, Static290.aClass117_131);
				Static403.aClass134_1 = new Class134(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static307.aClass139_1 = new Class139(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static453.aClass88_3 = new Class88(Static525.aClass155_4, Static194.anInt3737, true, Static382.aClass117_162, Static290.aClass117_131);
				Static358.aClass246_3 = new Class246(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110, Static533.aClass117_228);
				Static196.aClass274_1 = new Class274(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110, Static533.aClass117_228);
				Static204.aClass282_1 = new Class282(Static525.aClass155_4, Static194.anInt3737, true, Static315.aClass117_141, Static290.aClass117_131);
				Static451.aClass67_2 = new Class67(Static525.aClass155_4, Static194.anInt3737, true, Static216.aClass298_11, Static178.aClass117_97, Static290.aClass117_131);
				Static530.aClass122_1 = new Class122(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static155.aClass76_2 = new Class76(Static525.aClass155_4, Static194.anInt3737, Static444.aClass117_183, Static46.aClass117_21, Static454.aClass117_190);
				Static175.aClass49_1 = new Class49(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static420.aClass118_10 = new Class118(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static501.aClass41_2 = new Class41(Static525.aClass155_4, Static194.anInt3737, Static162.aClass117_88, Static290.aClass117_131);
				Static326.aClass115_3 = new Class115(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static62.aClass266_2 = new Class266(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static169.aClass116_1 = new Class116(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static304.aClass162_1 = new Class162(Static525.aClass155_4, Static194.anInt3737, Static435.aClass117_180);
				Static117.aClass287_1 = new Class287(Static525.aClass155_4, Static194.anInt3737, Static212.aClass117_110);
				Static512.method6835(Static145.aClass117_76, Static290.aClass117_131, Static52.aClass117_28, Static533.aClass117_228);
				Static135.method2555(Static466.aClass117_199);
				Static110.aClass180_2 = new Class180(Static194.anInt3737, Static539.aClass117_232, Static72.aClass117_35);
				Static166.aClass278_2 = new Class278(Static194.anInt3737, Static539.aClass117_232, Static72.aClass117_35, new Class312());
				Static531.aString84 = Static97.aClass40_28.method1063(Static194.anInt3737);
				Static276.anInt5393 = 65;
				Static271.method4483();
				Static453.aClass88_3.method2291(!Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459));
				Static540.aClass242_1 = new Class242();
				Static507.method6976();
				Static160.method2899(Static79.aClass117_38);
				Static7.method268(Static36.anInterface8_21, Static290.aClass117_131);
				Static337.anInt6332 = 120;
			}
		} else if (Static337.anInt6332 == 120) {
			local6 = Static5.method259(Static533.aClass117_228);
			local50 = Static494.method6849();
			if (local50 > local6) {
				Static531.aString84 = Static54.aClass40_16.method1063(Static194.anInt3737) + local6 * 100 / local50 + "%";
				Static276.anInt5393 = 70;
			} else {
				Static439.method7188(Static533.aClass117_228, Static110.aClass62_15);
				Static441.method6255(Static22.aClass25Array1);
				Static531.aString84 = Static322.aClass40_94.method1063(Static194.anInt3737);
				Static276.anInt5393 = 70;
				Static337.anInt6332 = 130;
			}
		} else if (Static337.anInt6332 == 130) {
			if (Static193.aClass117_104.method2960("huffman", "")) {
				@Pc(1582) Class302 local1582 = new Class302(Static193.aClass117_104.method2980("huffman", ""));
				Static284.method4804(local1582);
				Static531.aString84 = Static428.aClass40_124.method1063(Static194.anInt3737);
				Static337.anInt6332 = 140;
				Static276.anInt5393 = 75;
			} else {
				Static531.aString84 = Static14.aClass40_6.method1063(Static194.anInt3737) + "0%";
				Static276.anInt5393 = 75;
			}
		} else if (Static337.anInt6332 == 140) {
			if (Static52.aClass117_28.method2968()) {
				Static531.aString84 = Static44.aClass40_14.method1063(Static194.anInt3737);
				Static276.anInt5393 = 80;
				Static337.anInt6332 = 150;
			} else {
				Static531.aString84 = Static491.aClass40_141.method1063(Static194.anInt3737) + Static52.aClass117_28.method2958() + "%";
				Static276.anInt5393 = 80;
			}
		} else if (Static337.anInt6332 == 150) {
			if (Static497.aClass117_234.method2968()) {
				Static531.aString84 = Static249.aClass40_76.method1063(Static194.anInt3737);
				Static276.anInt5393 = 82;
				Static337.anInt6332 = 160;
			} else {
				Static531.aString84 = Static389.aClass40_109.method1063(Static194.anInt3737) + Static497.aClass117_234.method2958() + "%";
				Static276.anInt5393 = 82;
			}
		} else if (Static337.anInt6332 == 160) {
			if (Static145.aClass117_76.method2968()) {
				Static531.aString84 = Static469.aClass40_137.method1063(Static194.anInt3737);
				Static337.anInt6332 = 170;
				Static276.anInt5393 = 85;
			} else {
				Static531.aString84 = Static469.aClass40_137.method1063(Static194.anInt3737) + Static145.aClass117_76.method2958() + "%";
				Static276.anInt5393 = 85;
			}
		} else if (Static337.anInt6332 == 170) {
			if (Static317.aClass117_142.method2955("details")) {
				Static245.method5961(Static317.aClass117_142, Static230.aClass307_2, Static27.aClass38_1, Static453.aClass88_3, Static358.aClass246_3, Static196.aClass274_1, Static540.aClass242_1);
				Static531.aString84 = Static464.aClass40_134.method1063(Static194.anInt3737);
				Static337.anInt6332 = 190;
				Static276.anInt5393 = 89;
			} else {
				Static531.aString84 = Static366.aClass40_104.method1063(Static194.anInt3737) + Static317.aClass117_142.method2969("details") + "%";
				Static276.anInt5393 = 87;
			}
		} else if (Static337.anInt6332 == 190) {
			Static37.aStringArray11 = new String[Static62.aClass266_2.anInt7781];
			Static481.anIntArray650 = new int[Static169.aClass116_1.anInt3312];
			Static466.aBooleanArray34 = new boolean[Static169.aClass116_1.anInt3312];
			for (local6 = 0; local6 < Static169.aClass116_1.anInt3312; local6++) {
				if (Static169.aClass116_1.method2926(local6).anInt140 == 0) {
					Static466.aBooleanArray34[local6] = true;
					Static304.anInt6006++;
				}
				Static481.anIntArray650[local6] = -1;
			}
			Static441.method6256();
			Static82.anInt1573 = Static52.aClass117_28.method2982("loginscreen");
			Static314.anInt4187 = Static52.aClass117_28.method2982("lobbyscreen");
			Static338.aClass117_151.method2961(false);
			Static108.aClass117_61.method2961(true);
			Static533.aClass117_228.method2961(true);
			Static145.aClass117_76.method2961(true);
			Static193.aClass117_104.method2961(true);
			Static52.aClass117_28.method2961(true);
			Static404.aBoolean510 = true;
			Static212.aClass117_110.anInt3362 = 2;
			Static437.aClass117_181.anInt3362 = 2;
			Static382.aClass117_162.anInt3362 = 2;
			Static315.aClass117_141.anInt3362 = 2;
			Static178.aClass117_97.anInt3362 = 2;
			Static444.aClass117_183.anInt3362 = 2;
			Static162.aClass117_88.anInt3362 = 2;
			Static302.method4984(-1, -1, false, Static300.aClass5_Sub28_Sub1_1.anInt4891);
			Static531.aString84 = Static397.aClass40_111.method1063(Static194.anInt3737);
			Static337.anInt6332 = 200;
			Static276.anInt5393 = 95;
		} else if (Static337.anInt6332 == 200) {
			Static287.method4831(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method1271() {
		if (Static218.aBoolean249) {
			Static520.method7265();
		}
		if (Static110.aClass62_15 != null) {
			Static110.aClass62_15.method7061();
		}
		if (Static254.aFrame32 != null) {
			Static133.method2511(Static159.aClass9_10, Static254.aFrame32);
			Static254.aFrame32 = null;
		}
		if (lb != null) {
			lb.method4920();
			lb = null;
		}
		Static412.method5990();
		Static301.aClass55_3.method1336();
		Static201.aClass237_3.method5699();
		if (Static187.aClass201_1 != null) {
			Static187.aClass201_1.method5075();
			Static187.aClass201_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method1263() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	@Override
	protected void method1277() {
		if (Static17.anInt459 != 2) {
			this.method1301();
			return;
		}
		try {
			this.method1301();
		} catch (@Pc(7) Throwable local7) {
			Static370.method6434(local7.getMessage() + " (Recovered) " + this.method1265(), local7);
			Static77.method4915(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1301() {
		if (Static389.anInt7024 == 13) {
			return;
		}
		Static481.anInt8318++;
		if (Static481.anInt8318 % 1000 == 1) {
			@Pc(22) GregorianCalendar local22 = new GregorianCalendar();
			Static323.anInt6144 = local22.get(11) * 600 + local22.get(12) * 10 + local22.get(13) / 6;
			Static44.aRandom1.setSeed((long) Static323.anInt6144);
		}
		if (Static481.anInt8318 % 50 == 0) {
			Static134.anInt2778 = Static432.anInt7587;
			Static123.anInt2590 = Static10.anInt168;
			Static432.anInt7587 = 0;
			Static10.anInt168 = 0;
		}
		this.method1298();
		if (Static227.aClass91_1 != null) {
			Static227.aClass91_1.method2316();
		}
		Static232.method3828();
		Static59.aClass18_1.method5975();
		Static280.aClass214_1.method6767();
		if (Static110.aClass62_15 != null) {
			Static110.aClass62_15.method7048((int) Static105.method2132());
		}
		Static35.method824();
		Static170.anInt3419 = 0;
		Static214.anInt4064 = 0;
		for (@Pc(98) Interface1 local98 = Static59.aClass18_1.method5974(); local98 != null; local98 = Static59.aClass18_1.method5974()) {
			@Pc(104) int local104 = local98.method5006();
			if (local104 == 2 || local104 == 3) {
				@Pc(116) char local116 = local98.method5008();
				if (Static162.method2907() && (local116 == '`' || local116 == '§')) {
					if (Static481.method6699()) {
						Static214.method3470();
					} else {
						Static193.method3238();
					}
				} else if (Static214.anInt4064 < 128) {
					Static39.anInterface1Array1[Static214.anInt4064] = local98;
					Static214.anInt4064++;
				}
			} else if (local104 == 0 && Static170.anInt3419 < 75) {
				Static456.anInterface1Array2[Static170.anInt3419] = local98;
				Static170.anInt3419++;
			}
		}
		Static189.anInt4752 = 0;
		for (@Pc(179) Class5_Sub42 local179 = Static280.aClass214_1.method6773(); local179 != null; local179 = Static280.aClass214_1.method6773()) {
			@Pc(185) int local185 = local179.method7431();
			if (local185 == -1) {
				Static7.aClass99_2.method2513(local179);
			} else if (local185 == 6) {
				Static189.anInt4752 += local179.method7429();
			} else if (Static148.method2765(local185)) {
				Static483.aClass99_76.method2513(local179);
				if (Static483.aClass99_76.method2518() > 10) {
					Static483.aClass99_76.method2516();
				}
			}
		}
		if (Static481.method6699()) {
			Static95.method2014();
		}
		if (Static389.anInt7024 == 0) {
			this.method1300();
			Static487.method6757();
		} else if (Static389.anInt7024 == 1) {
			this.method1300();
			Static487.method6757();
		} else if (Static143.method2702(Static389.anInt7024)) {
			Static479.method6665();
		}
		if (Static443.method6281(Static389.anInt7024) && !Static143.method2702(Static389.anInt7024)) {
			this.method1304();
			Static496.method6876();
			Static400.method5815();
		} else if (Static545.method7421(Static389.anInt7024) && !Static143.method2702(Static389.anInt7024)) {
			this.method1304();
			Static400.method5815();
		} else if (Static389.anInt7024 == 11) {
			Static400.method5815();
		} else if (Static319.method5139(Static389.anInt7024) && !Static143.method2702(Static389.anInt7024)) {
			Static305.method5010();
		} else if (Static389.anInt7024 == 12) {
			Static400.method5815();
			if (Static126.anInt8434 != -3 && Static126.anInt8434 != 2 && Static126.anInt8434 != 15) {
				Static286.method4827(false);
			}
		}
		Static209.method3380(Static110.aClass62_15);
		Static483.aClass99_76.method2516();
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1304() {
		@Pc(28) int local28;
		if (Static389.anInt7024 == 6 && Static118.anInt2542 == 0) {
			if (Static34.anInt869 > 1) {
				Static34.anInt869--;
				Static51.anInt1105 = Static356.anInt6716;
			}
			if (!Static218.aBoolean250) {
				Static390.method7043();
			}
			for (local28 = 0; local28 < 100 && Static487.method6758(); local28++) {
			}
		}
		Static168.anInt7198++;
		Static90.method1963(-1, -1, null);
		Static282.method4791(-1, -1, null);
		Static47.method1049();
		Static356.anInt6716++;
		for (local28 = 0; local28 < Static310.anInt6066; local28++) {
			@Pc(70) Class15_Sub2_Sub1_Sub2 local70 = Static275.aClass5_Sub51Array1[local28].aClass15_Sub2_Sub1_Sub2_2;
			if (local70 != null) {
				@Pc(76) byte local76 = local70.aClass305_1.aByte97;
				if ((local76 & 0x1) != 0) {
					@Pc(87) int local87 = local70.method4035();
					@Pc(108) int local108;
					if ((local76 & 0x2) != 0 && local70.anInt4753 == 0 && Math.random() * 1000.0D < 10.0D) {
						local108 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(116) int local116 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local108 != 0 || local116 != 0) {
							@Pc(130) int local130 = local70.anIntArray306[0] + local108;
							if (local130 < 0) {
								local130 = 0;
							} else if (local130 > Static460.anInt7894 - local87 - 1) {
								local130 = Static460.anInt7894 - local87 - 1;
							}
							@Pc(158) int local158 = local116 + local70.anIntArray307[0];
							if (local158 < 0) {
								local158 = 0;
							} else if (Static235.anInt4493 - local87 - 1 < local158) {
								local158 = Static235.anInt4493 - local87 - 1;
							}
							@Pc(204) int local204 = Static402.method5842(local130, local158, Static71.aClass10Array3[local70.aByte91], Static218.anIntArray285, local87, 0, Static226.anIntArray321, local70.anIntArray306[0], local70.anIntArray307[0], 0, local87, local87, -1, true);
							if (local204 > 0) {
								if (local204 > 9) {
									local204 = 9;
								}
								for (@Pc(215) int local215 = 0; local215 < local204; local215++) {
									local70.anIntArray306[local215] = Static226.anIntArray321[local204 - local215 - 1];
									local70.anIntArray307[local215] = Static218.anIntArray285[local204 - local215 - 1];
									local70.aByteArray59[local215] = 1;
								}
								local70.anInt4753 = local204;
							}
						}
					}
					Static477.method6652(local70, true);
					local108 = Static28.method680(local70);
					Static240.method4083(local70, local108, Static448.anInt7815, Static514.anInt8747);
					Static305.method5013(local70);
				}
			}
		}
		if (Static118.anInt2542 == 0 && Static83.anInt1578 == 0) {
			if (Static166.anInt3343 == 2) {
				Static322.method5171();
			} else {
				Static317.method5104();
			}
			if (Static367.anInt6861 >> 7 < 14 || Static460.anInt7894 - 14 <= Static367.anInt6861 >> 7 || Static364.anInt6817 >> 7 < 14 || Static364.anInt6817 >> 7 >= Static235.anInt4493 - 14) {
				Static301.method4980();
			}
		}
		while (true) {
			@Pc(342) Class5_Sub17 local342;
			@Pc(347) Class220 local347;
			@Pc(358) Class220 local358;
			do {
				local342 = (Class5_Sub17) Static443.aClass99_67.method2516();
				if (local342 == null) {
					while (true) {
						do {
							local342 = (Class5_Sub17) Static24.aClass99_25.method2516();
							if (local342 == null) {
								while (true) {
									do {
										local342 = (Class5_Sub17) Static287.aClass99_49.method2516();
										if (local342 == null) {
											if (Static499.aClass220_17 != null) {
												Static108.method2155();
											}
											if (Static481.anInt8318 % 1500 == 0) {
												Static303.method4990();
											}
											if (Static389.anInt7024 == 6 && Static118.anInt2542 == 0) {
												Static138.method2580();
											}
											Static269.method5646();
											if (Static218.aBoolean249 && Static115.aLong83 < Static105.method2132() - 60000L) {
												Static520.method7265();
											}
											for (@Pc(528) Class30_Sub2_Sub2 local528 = (Class30_Sub2_Sub2) Static66.aClass77_4.method2157(); local528 != null; local528 = (Class30_Sub2_Sub2) Static66.aClass77_4.method2160()) {
												if (Static105.method2132() / 1000L - 5L > (long) local528.anInt5243) {
													if (local528.aShort69 > 0) {
														Static328.method5200("", 0, 5, local528.aString54 + Static371.aClass40_106.method1063(Static194.anInt3737), "");
													}
													if (local528.aShort69 == 0) {
														Static328.method5200("", 0, 5, local528.aString54 + Static54.aClass40_17.method1063(Static194.anInt3737), "");
													}
													local528.method6004();
												}
											}
											if (Static389.anInt7024 == 6 && Static118.anInt2542 == 0) {
												if (lb == null) {
													Static286.method4827(false);
													return;
												}
												Static414.anInt8913++;
												if (Static414.anInt8913 > 50) {
													Static415.method5995(Static524.aClass236_94);
												}
												try {
													if (lb != null && Static164.aClass5_Sub3_Sub1_2.anInt4960 > 0) {
														Static432.anInt7587 += Static164.aClass5_Sub3_Sub1_2.anInt4960;
														lb.method4910(Static164.aClass5_Sub3_Sub1_2.anInt4960, Static164.aClass5_Sub3_Sub1_2.aByteArray66);
														Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
														Static414.anInt8913 = 0;
														return;
													}
												} catch (@Pc(657) IOException local657) {
													Static286.method4827(false);
													return;
												}
											}
											return;
										}
										local347 = local342.aClass220_5;
										if (local347.anInt6674 < 0) {
											break;
										}
										local358 = Static352.method5447(local347.anInt6605);
									} while (local358 == null || local358.aClass220Array6 == null || local347.anInt6674 >= local358.aClass220Array6.length || local358.aClass220Array6[local347.anInt6674] != local347);
									Static266.method4403(local342);
								}
							}
							local347 = local342.aClass220_5;
							if (local347.anInt6674 < 0) {
								break;
							}
							local358 = Static352.method5447(local347.anInt6605);
						} while (local358 == null || local358.aClass220Array6 == null || local358.aClass220Array6.length <= local347.anInt6674 || local347 != local358.aClass220Array6[local347.anInt6674]);
						Static266.method4403(local342);
					}
				}
				local347 = local342.aClass220_5;
				if (local347.anInt6674 < 0) {
					break;
				}
				local358 = Static352.method5447(local347.anInt6605);
			} while (local358 == null || local358.aClass220Array6 == null || local358.aClass220Array6.length <= local347.anInt6674 || local358.aClass220Array6[local347.anInt6674] != local347);
			Static266.method4403(local342);
		}
	}
}
