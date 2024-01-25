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
				Static216.method3228("Argument count");
			}
			Static375.aClass382_3 = new Class382();
			Static375.aClass382_3.anInt10282 = Integer.parseInt(arg0[0]);
			Static121.aClass382_1 = new Class382();
			Static121.aClass382_1.anInt10282 = Integer.parseInt(arg0[1]);
			Static484.aClass382_4 = new Class382();
			Static484.aClass382_4.anInt10282 = Integer.parseInt(arg0[2]);
			Static181.aClass60_3 = Static238.aClass60_5;
			if (arg0[3].equals("live")) {
				Static88.aClass288_1 = Static603.aClass288_4;
			} else if (arg0[3].equals("rc")) {
				Static88.aClass288_1 = Static277.aClass288_2;
			} else if (arg0[3].equals("wip")) {
				Static88.aClass288_1 = Static331.aClass288_3;
			} else {
				Static216.method3228("modewhat");
			}
			Static164.anInt2984 = Static223.method3269(arg0[4]);
			if (Static164.anInt2984 == -1) {
				if (arg0[4].equals("english")) {
					Static164.anInt2984 = 0;
				} else if (arg0[4].equals("german")) {
					Static164.anInt2984 = 1;
				} else {
					Static216.method3228("language");
				}
			}
			Static196.aBoolean248 = false;
			Static278.aBoolean340 = false;
			if (arg0[5].equals("game0")) {
				Static333.aClass234_5 = Static179.aClass234_2;
			} else if (arg0[5].equals("game1")) {
				Static333.aClass234_5 = Static92.aClass234_1;
			} else if (arg0[5].equals("game2")) {
				Static333.aClass234_5 = Static471.aClass234_6;
			} else if (arg0[5].equals("game3")) {
				Static333.aClass234_5 = Static204.aClass234_3;
			} else {
				Static216.method3228("game");
			}
			Static555.aBoolean668 = false;
			Static207.aBoolean732 = false;
			Static414.aBoolean448 = true;
			Static54.aBoolean83 = true;
			Static461.anInt7416 = 0;
			Static278.aLong133 = 0L;
			Static567.aString106 = null;
			Static420.aString78 = null;
			Static255.anInt4152 = 0;
			Static264.aString40 = "";
			Static16.anInt306 = Static333.aClass234_5.anInt5621;
			Static138.anInt2568 = 0;
			@Pc(186) client local186 = new client();
			Static205.aClient1 = local186;
			local186.method1584(Static88.aClass288_1.method6479() + 32, Static333.aClass234_5.aString72);
			Static280.aFrame10.setLocation(40, 40);
		} catch (@Pc(209) Exception local209) {
			Static357.method4765(local209, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1594() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static445.anInt6949 + "," + Static321.anInt5000 + "," + Static224.anInt3557 + "," + Static267.anInt4309 + "|";
			if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 != null) {
				local7 = local7 + "2)" + Static296.anInt4684 + "," + (Static445.anInt6949 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0]) + "," + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0] + Static321.anInt5000) + "|";
			}
			local7 = local7 + "3)" + Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() + "|4)" + Static124.aClass4_Sub20_4.aClass8_Sub27_1.method7983() + "|5)" + Static324.method4462() + "|6)" + Static632.anInt9867 + "," + Static357.anInt5421 + "|";
			local7 = local7 + "7)" + Static124.aClass4_Sub20_4.aClass8_Sub1_1.method177() + "|";
			local7 = local7 + "8)" + Static124.aClass4_Sub20_4.aClass8_Sub8_1.method3571() + "|";
			local7 = local7 + "9)" + Static124.aClass4_Sub20_4.aClass8_Sub12_1.method4650() + "|";
			local7 = local7 + "10)" + Static124.aClass4_Sub20_4.aClass8_Sub2_1.method1355() + "|";
			local7 = local7 + "11)" + Static124.aClass4_Sub20_4.aClass8_Sub29_1.method8390() + "|";
			local7 = local7 + "12)" + Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() + "|";
			local7 = local7 + "13)" + Static197.anInt5439 + "|";
			local7 = local7 + "14)" + Static656.anInt10356;
			if (Static566.aClass4_Sub41_1 != null) {
				local7 = local7 + "|15)" + Static566.aClass4_Sub41_1.anInt7533;
			}
			try {
				if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 2) {
					@Pc(244) Class local244 = Class.forName("java.lang.ClassLoader");
					@Pc(248) Field local248 = local244.getDeclaredField("nativeLibraries");
					@Pc(251) Class local251 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(261) Method local261 = local251.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local261.invoke(local248, Boolean.TRUE);
					@Pc(284) Vector local284 = (Vector) local248.get(client.class.getClassLoader());
					for (@Pc(286) int local286 = 0; local284.size() > local286; local286++) {
						try {
							@Pc(292) Object local292 = local284.elementAt(local286);
							@Pc(297) Field local297 = local292.getClass().getDeclaredField("name");
							local261.invoke(local297, Boolean.TRUE);
							try {
								@Pc(312) String local312 = (String) local297.get(local292);
								if (local312 != null && local312.indexOf("sw3d.dll") != -1) {
									@Pc(324) Field local324 = local292.getClass().getDeclaredField("handle");
									local261.invoke(local324, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local324.getLong(local292));
									local261.invoke(local324, Boolean.FALSE);
								}
							} catch (@Pc(360) Throwable local360) {
							}
							local261.invoke(local297, Boolean.FALSE);
						} catch (@Pc(372) Throwable local372) {
						}
					}
				}
			} catch (@Pc(380) Throwable local380) {
			}
			local7 = local7 + "]";
		} catch (@Pc(391) Throwable local391) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1599(@OriginalArg(1) int arg0) {
		Static14.aClass390_1 = null;
		Static334.aClass260_4.anInt6704 = arg0;
		Static197.anInt5441 = 0;
		Static474.aClass281_6 = null;
		Static334.aClass260_4.anInt6703++;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1600() {
		if (Static334.aClass260_4.anInt6703 > Static115.anInt2234) {
			Static653.aClass382_5.method8696();
			Static91.anInt1810 = (Static334.aClass260_4.anInt6703 * 50 - 50) * 5;
			if (Static91.anInt1810 > 3000) {
				Static91.anInt1810 = 3000;
			}
			if (Static334.aClass260_4.anInt6703 >= 2 && Static334.aClass260_4.anInt6704 == 6) {
				this.method1586("js5connect_outofdate");
				Static656.anInt10356 = 14;
				return;
			}
			if (Static334.aClass260_4.anInt6703 >= 4 && Static334.aClass260_4.anInt6704 == -1) {
				this.method1586("js5crc");
				Static656.anInt10356 = 14;
				return;
			}
			if (Static334.aClass260_4.anInt6703 >= 4 && Static206.method3095(Static656.anInt10356)) {
				if (Static334.aClass260_4.anInt6704 == 7 || Static334.aClass260_4.anInt6704 == 9) {
					this.method1586("js5connect_full");
				} else if (Static334.aClass260_4.anInt6704 <= 0) {
					this.method1586("js5io");
				} else if (Static275.aString43 == null) {
					this.method1586("js5connect");
				} else {
					this.method1586("js5proxy_" + Static275.aString43.trim());
				}
				Static656.anInt10356 = 14;
				return;
			}
		}
		Static115.anInt2234 = Static334.aClass260_4.anInt6703;
		if (Static91.anInt1810 > 0) {
			Static91.anInt1810--;
			return;
		}
		try {
			if (Static197.anInt5441 == 0) {
				Static474.aClass281_6 = Static653.aClass382_5.method8694(Static239.aClass207_2);
				Static197.anInt5441++;
			}
			if (Static197.anInt5441 == 1) {
				if (Static474.aClass281_6.anInt7338 == 2) {
					if (Static474.aClass281_6.anObject17 != null) {
						Static275.aString43 = (String) Static474.aClass281_6.anObject17;
					}
					this.method1599(1000);
					return;
				}
				if (Static474.aClass281_6.anInt7338 == 1) {
					Static197.anInt5441++;
				}
			}
			if (Static197.anInt5441 == 2) {
				Static14.aClass390_1 = new Class390((Socket) Static474.aClass281_6.anObject17, Static239.aClass207_2, 25000);
				@Pc(207) Class4_Sub11 local207 = new Class4_Sub11(5);
				local207.method8822(Static51.aClass164_2.anInt4099);
				local207.method8860(648);
				Static14.aClass390_1.method8929(local207.aByteArray107, 5);
				Static197.anInt5441++;
				Static160.aLong90 = Static429.method5935();
			}
			if (Static197.anInt5441 == 3) {
				if (Static206.method3095(Static656.anInt10356) || Static14.aClass390_1.method8927() > 0) {
					@Pc(245) int local245 = Static14.aClass390_1.method8924();
					if (local245 != 0) {
						this.method1599(local245);
						return;
					}
					Static197.anInt5441++;
				} else if (Static429.method5935() - Static160.aLong90 > 30000L) {
					this.method1599(1001);
					return;
				}
			}
			if (Static197.anInt5441 == 4) {
				@Pc(297) boolean local297 = Static206.method3095(Static656.anInt10356) || Static162.method2597(Static656.anInt10356) || Static477.method6557(Static656.anInt10356);
				@Pc(300) Class393[] local300 = Static675.method8959();
				@Pc(308) Class4_Sub11 local308 = new Class4_Sub11(local300.length * 4);
				Static14.aClass390_1.method8930(local308.aByteArray107.length, 0, local308.aByteArray107);
				for (@Pc(319) int local319 = 0; local319 < local300.length; local319++) {
					local300[local319].method8955(local308.method8850());
				}
				Static334.aClass260_4.method5876(Static14.aClass390_1, !local297);
				Static14.aClass390_1 = null;
				Static197.anInt5441 = 0;
				Static474.aClass281_6 = null;
			}
		} catch (@Pc(355) IOException local355) {
			this.method1599(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method1592() {
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 2) {
			this.method1609();
			return;
		}
		try {
			this.method1609();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static357.method4765(local25, local25.getMessage() + " (Recovered) " + this.method1594());
			Static436.aBoolean593 = true;
			Static46.method825(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method1601() {
		@Pc(12) boolean local12 = Static334.aClass260_4.method5885();
		if (!local12) {
			this.method1600();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1580() {
		if (Static207.aBoolean732) {
			Static197.anInt5439 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static381.method3017();
		Static319.aClass309_3 = new Class309(Static239.aClass207_2);
		Static334.aClass260_4 = new Class260();
		Static446.method6128(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static181.aClass60_3 != Static215.aClass60_4) {
			Static124.aByteArrayArray9 = new byte[50][];
		}
		Static124.aClass4_Sub20_4 = Static370.method4906();
		if (Static215.aClass60_4 == Static181.aClass60_3) {
			Static375.aClass382_3.aString122 = this.getCodeBase().getHost();
		} else if (Static244.method3604(Static181.aClass60_3)) {
			Static375.aClass382_3.aString122 = this.getCodeBase().getHost();
			Static375.aClass382_3.anInt10280 = Static375.aClass382_3.anInt10282 + 40000;
			Static121.aClass382_1.anInt10280 = Static121.aClass382_1.anInt10282 + 40000;
			Static375.aClass382_3.anInt10279 = Static375.aClass382_3.anInt10282 + 50000;
			Static484.aClass382_4.anInt10280 = Static484.aClass382_4.anInt10282 + 40000;
			Static121.aClass382_1.anInt10279 = Static121.aClass382_1.anInt10282 + 50000;
			Static484.aClass382_4.anInt10279 = Static484.aClass382_4.anInt10282 + 50000;
		} else if (Static181.aClass60_3 == Static238.aClass60_5) {
			Static375.aClass382_3.aString122 = "127.0.0.1";
			Static121.aClass382_1.aString122 = "127.0.0.1";
			Static484.aClass382_4.aString122 = "127.0.0.1";
			Static375.aClass382_3.anInt10280 = Static375.aClass382_3.anInt10282 + 40000;
			Static121.aClass382_1.anInt10280 = Static121.aClass382_1.anInt10282 + 40000;
			Static375.aClass382_3.anInt10279 = Static375.aClass382_3.anInt10282 + 50000;
			Static484.aClass382_4.anInt10280 = Static484.aClass382_4.anInt10282 + 40000;
			Static121.aClass382_1.anInt10279 = Static121.aClass382_1.anInt10282 + 50000;
			Static484.aClass382_4.anInt10279 = Static484.aClass382_4.anInt10282 + 50000;
		}
		if (Static92.aClass234_1 == Static333.aClass234_5) {
			Static46.aShortArrayArray4 = Static296.aShortArrayArray10;
			Static574.anInt8897 = 16777215;
			Static538.anInt8334 = 0;
			Static158.aShortArrayArrayArray8 = Static645.aShortArrayArrayArray9;
			Static625.aBoolean764 = true;
		} else if (Static333.aClass234_5 == Static204.aClass234_3) {
			Static46.aShortArrayArray4 = Static91.aShortArrayArray6;
			Static158.aShortArrayArrayArray8 = Static242.aShortArrayArrayArray4;
		} else {
			Static46.aShortArrayArray4 = Static379.aShortArrayArray13;
			Static158.aShortArrayArrayArray8 = Static37.aShortArrayArrayArray1;
		}
		Static75.aShortArray16 = Static310.aShortArray69 = Static272.aShortArray43 = Static530.aShortArray98 = new short[256];
		if (Static333.aClass234_5 == Static179.aClass234_2) {
			Static162.aBoolean198 = false;
		}
		Static653.aClass382_5 = Static375.aClass382_3;
		try {
			Static169.aClipboard1 = Static205.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(225) Exception local225) {
		}
		Static231.aClass102_6 = Static177.method2872(Static17.aCanvas1);
		Static373.aClass161_1 = Static158.method8341(Static17.aCanvas1);
		try {
			if (Static239.aClass207_2.aClass80_3 != null) {
				Static15.aClass252_2 = new Class252(Static239.aClass207_2.aClass80_3, 5200, 0);
				for (@Pc(247) int local247 = 0; local247 < 37; local247++) {
					Static73.aClass252Array1[local247] = new Class252(Static239.aClass207_2.aClass80Array1[local247], 6000, 0);
				}
				Static155.aClass252_3 = new Class252(Static239.aClass207_2.aClass80_2, 6000, 0);
				Static403.aClass343_7 = new Class343(255, Static15.aClass252_2, Static155.aClass252_3, 500000);
				Static165.aClass252_4 = new Class252(Static239.aClass207_2.aClass80_1, 24, 0);
				Static239.aClass207_2.aClass80_3 = null;
				Static239.aClass207_2.aClass80_2 = null;
				Static239.aClass207_2.aClass80_1 = null;
				Static239.aClass207_2.aClass80Array1 = null;
			}
		} catch (@Pc(303) IOException local303) {
			Static403.aClass343_7 = null;
			Static165.aClass252_4 = null;
			Static155.aClass252_3 = null;
			Static15.aClass252_2 = null;
		}
		if (Static215.aClass60_4 != Static181.aClass60_3) {
			Static492.aBoolean603 = true;
		}
		Static18.aString84 = Static279.aClass179_12.method4066(Static164.anInt2984);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1596() {
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1609() {
		if (Static656.anInt10356 == 14) {
			return;
		}
		Static177.anInt3088++;
		if (Static177.anInt3088 % 1000 == 1) {
			@Pc(28) GregorianCalendar local28 = new GregorianCalendar();
			Static397.anInt5797 = local28.get(11) * 600 + local28.get(12) * 10 + local28.get(13) / 6;
			Static20.aRandom1.setSeed((long) Static397.anInt5797);
		}
		if (Static177.anInt3088 % 50 == 0) {
			Static125.anInt2341 = Static200.anInt3300;
			Static200.anInt3300 = 0;
			Static192.anInt3229 = Static658.anInt10395;
			Static658.anInt10395 = 0;
		}
		this.method1601();
		if (Static560.aClass183_1 != null) {
			Static560.aClass183_1.method4101();
		}
		Static413.method5203();
		Static259.method3756();
		Static231.aClass102_6.method4310();
		Static373.aClass161_1.method5902();
		if (Static582.aClass33_13 != null) {
			Static582.aClass33_13.method8131((int) Static429.method5935());
		}
		Static128.method2300();
		Static411.anInt5921 = 0;
		Static384.anInt5665 = 0;
		for (@Pc(100) Interface26 local100 = Static231.aClass102_6.method4307(); local100 != null; local100 = Static231.aClass102_6.method4307()) {
			@Pc(106) int local106 = local100.method7136();
			if (local106 == 2 || local106 == 3) {
				@Pc(136) char local136 = local100.method7134();
				if (Static141.method2475() && (local136 == '`' || local136 == '§' || local136 == '²')) {
					if (Static247.method3636()) {
						Static550.method7314();
					} else {
						Static34.method8330();
					}
				} else if (Static411.anInt5921 < 128) {
					Static76.anInterface26Array1[Static411.anInt5921] = local100;
					Static411.anInt5921++;
				}
			} else if (local106 == 0 && Static384.anInt5665 < 75) {
				Static385.anInterface26Array2[Static384.anInt5665] = local100;
				Static384.anInt5665++;
			}
		}
		Static191.anInt3219 = 0;
		for (@Pc(190) Class4_Sub15 local190 = Static373.aClass161_1.method5906(); local190 != null; local190 = Static373.aClass161_1.method5906()) {
			@Pc(198) int local198 = local190.method4791();
			if (local198 == -1) {
				Static269.aClass163_24.method3646(local190);
			} else if (local198 == 6) {
				Static191.anInt3219 += local190.method4793();
			} else if (Static353.method4729(local198)) {
				Static385.aClass163_35.method3646(local190);
				if (Static385.aClass163_35.method3650() > 10) {
					Static385.aClass163_35.method3644();
				}
			}
		}
		if (Static247.method3636()) {
			Static18.method6085();
		}
		if (Static206.method3095(Static656.anInt10356)) {
			Static214.method3191();
			Static107.method2077();
		} else if (Static560.method7433(Static656.anInt10356)) {
			Static383.method8454();
		}
		if (Static162.method2597(Static656.anInt10356) && !Static560.method7433(Static656.anInt10356)) {
			this.method1614();
			Static492.method6682();
			Static129.method2318();
		} else if (Static477.method6557(Static656.anInt10356) && !Static560.method7433(Static656.anInt10356)) {
			this.method1614();
			Static129.method2318();
		} else if (Static656.anInt10356 == 12) {
			Static129.method2318();
		} else if (Static310.method4317(Static656.anInt10356) && !Static560.method7433(Static656.anInt10356)) {
			Static433.method5973();
		} else if (Static656.anInt10356 == 13) {
			Static129.method2318();
			if (Static54.anInt1255 != -3 && Static54.anInt1255 != 2 && Static54.anInt1255 != 15) {
				Static306.method4298(false);
			}
		}
		Static395.method2767(Static582.aClass33_13);
		Static385.aClass163_35.method3644();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	protected void method1598() {
		if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 2) {
			this.method1612();
			return;
		}
		try {
			this.method1612();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static357.method4765(local19, local19.getMessage() + " (Recovered) " + this.method1594());
			Static436.aBoolean593 = true;
			Static46.method825(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1612() {
		if (Static656.anInt10356 == 14) {
			return;
		}
		@Pc(16) long local16 = Static346.method4668() / 1000000L - Static517.aLong243;
		Static517.aLong243 = Static346.method4668() / 1000000L;
		@Pc(24) boolean local24 = Static418.method5750();
		if (local24 && Static299.aBoolean350 && Static638.aClass64_4 != null) {
			Static638.aClass64_4.method2212();
		}
		if (Static6.method110(Static656.anInt10356)) {
			if (Static426.aLong194 != 0L && Static426.aLong194 < Static429.method5935()) {
				Static532.method7162(Static324.method4462(), Static605.anInt9301, Static514.anInt8012, false);
			} else if (!Static582.aClass33_13.method8135() && Static121.aBoolean154) {
				Static294.method4171();
			}
		}
		@Pc(92) int local92;
		@Pc(96) int local96;
		if (Static407.aFrame5 == null) {
			@Pc(80) Container local80;
			if (Static280.aFrame10 != null) {
				local80 = Static280.aFrame10;
			} else if (Static649.anApplet2 == null) {
				local80 = Static333.anApplet_Sub1_1;
			} else {
				local80 = Static649.anApplet2;
			}
			local92 = local80.getSize().width;
			local96 = local80.getSize().height;
			if (Static280.aFrame10 == local80) {
				@Pc(102) Insets local102 = Static280.aFrame10.getInsets();
				local92 -= local102.right + local102.left;
				local96 -= local102.top + local102.bottom;
			}
			if (local92 != Static553.anInt8551 || Static599.anInt9215 != local96 || Static70.aBoolean93) {
				if (Static582.aClass33_13 == null || Static582.aClass33_13.method8130()) {
					Static381.method3017();
				} else {
					Static553.anInt8551 = local92;
					Static599.anInt9215 = local96;
				}
				Static426.aLong194 = Static429.method5935() + 500L;
				Static70.aBoolean93 = false;
			}
		}
		if (Static407.aFrame5 != null && !Static175.aBoolean230 && Static6.method110(Static656.anInt10356)) {
			Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
		}
		@Pc(169) boolean local169 = false;
		if (Static172.aBoolean223) {
			Static172.aBoolean223 = false;
			local169 = true;
		}
		if (local169) {
			Static271.method3929();
		}
		if (Static582.aClass33_13 != null && Static582.aClass33_13.method8135() || Static324.method4462() != 1) {
			Static34.method8332();
		}
		if (Static206.method3095(Static656.anInt10356)) {
			Static412.method5196(local169);
		} else if (Static490.method8900(Static656.anInt10356)) {
			Static89.method1791();
		} else if (Static15.method1595(Static656.anInt10356)) {
			Static89.method1791();
		} else if (Static560.method7433(Static656.anInt10356)) {
			if (Static162.anInt2719 == 1) {
				if (Static653.anInt10297 < Static668.anInt10539) {
					Static653.anInt10297 = Static668.anInt10539;
				}
				local92 = (Static653.anInt10297 - Static668.anInt10539) * 50 / Static653.anInt10297;
				Static460.method6416(Static279.aClass179_12.method4066(Static164.anInt2984) + "<br>(" + local92 + "%)", Static636.aClass31_14, Static582.aClass33_13, true, Static189.aClass56_5);
			} else if (Static162.anInt2719 == 2) {
				if (Static645.anInt10145 < Static225.anInt3564) {
					Static645.anInt10145 = Static225.anInt3564;
				}
				local92 = (Static645.anInt10145 - Static225.anInt3564) * 50 / Static645.anInt10145 + 50;
				Static460.method6416(Static279.aClass179_12.method4066(Static164.anInt2984) + "<br>(" + local92 + "%)", Static636.aClass31_14, Static582.aClass33_13, true, Static189.aClass56_5);
			} else {
				Static460.method6416(Static279.aClass179_12.method4066(Static164.anInt2984), Static636.aClass31_14, Static582.aClass33_13, true, Static189.aClass56_5);
			}
		} else if (Static656.anInt10356 == 10) {
			Static366.method4840(local16);
		} else if (Static656.anInt10356 == 13) {
			Static460.method6416(Static279.aClass179_14.method4066(Static164.anInt2984) + "<br>" + Static279.aClass179_15.method4066(Static164.anInt2984), Static636.aClass31_14, Static582.aClass33_13, false, Static189.aClass56_5);
		}
		if (Static602.anInt9261 == 3) {
			for (local92 = 0; local92 < Static463.anInt7418; local92++) {
				@Pc(375) Rectangle local375 = Class4_Sub5_Sub21.aRectangleArray2[local92];
				if (Static146.aBooleanArray6[local92]) {
					Static582.aClass33_13.method8100(local375.width, local375.y, local375.x, local375.height, -65281);
				} else if (Static387.aBooleanArray12[local92]) {
					Static582.aClass33_13.method8100(local375.width, local375.y, local375.x, local375.height, -65536);
				} else {
					Static582.aClass33_13.method8100(local375.width, local375.y, local375.x, local375.height, -16711936);
				}
			}
		}
		if (Static247.method3636()) {
			Static151.method2607(Static582.aClass33_13);
		}
		if (Static239.aClass207_2.aBoolean398 && Static6.method110(Static656.anInt10356) && Static602.anInt9261 == 0 && Static324.method4462() == 1 && !local169) {
			local92 = 0;
			for (local96 = 0; local96 < Static463.anInt7418; local96++) {
				if (Static387.aBooleanArray12[local96]) {
					Static387.aBooleanArray12[local96] = false;
					Static386.aRectangleArray1[local92++] = Class4_Sub5_Sub21.aRectangleArray2[local96];
				}
			}
			try {
				if (Static423.aBoolean517) {
					Static59.method1322(Static386.aRectangleArray1, local92);
				} else {
					Static582.aClass33_13.method8137(Static386.aRectangleArray1, local92);
				}
			} catch (@Pc(494) Exception_Sub1 local494) {
			}
		} else if (!Static206.method3095(Static656.anInt10356)) {
			for (local92 = 0; local92 < Static463.anInt7418; local92++) {
				Static387.aBooleanArray12[local92] = false;
			}
			try {
				if (Static423.aBoolean517) {
					Static247.method3633();
				} else {
					Static582.aClass33_13.method8095();
				}
			} catch (@Pc(523) Exception_Sub1 local523) {
				Static357.method4765(local523, local523.getMessage() + " (Recovered) " + this.method1594());
				Static46.method825(0, false);
			}
		}
		Static101.method2028();
		local92 = Static124.aClass4_Sub20_4.aClass8_Sub20_1.method6737();
		if (local92 == 0) {
			Static491.method6679(15L);
		} else if (local92 == 1) {
			Static491.method6679(10L);
		} else if (local92 == 2) {
			Static491.method6679(5L);
		} else if (local92 == 3) {
			Static491.method6679(2L);
		}
		if (Static33.aBoolean727) {
			Static478.method6570();
		}
		if (Static124.aClass4_Sub20_4.aClass8_Sub10_1.method4051() == 1 && Static656.anInt10356 == 3 && Static77.anInt1630 != -1) {
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub10_1, 0);
			Static361.method4808();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method1614() {
		@Pc(28) int local28;
		if (Static656.anInt10356 == 7 && !Static71.method1514()) {
			if (Static179.anInt3120 > 1) {
				Static465.anInt7431 = Static317.anInt4914;
				Static179.anInt3120--;
			}
			if (!Static333.aBoolean400) {
				Static217.method3246();
			}
			for (local28 = 0; local28 < 100 && Static554.method7187(); local28++) {
			}
		}
		Static88.anInt1794++;
		Static369.method4868(-1, -1, (Class199) null);
		Static492.method6685(-1, -1, (Class199) null);
		Static128.method2305();
		Static317.anInt4914++;
		for (local28 = 0; local28 < Static15.anInt1571; local28++) {
			@Pc(79) Class3_Sub1_Sub2_Sub2_Sub2 local79 = Static238.aClass4_Sub45Array1[local28].aClass3_Sub1_Sub2_Sub2_Sub2_2;
			if (local79 != null) {
				@Pc(85) byte local85 = local79.aClass345_1.aByte132;
				if ((local85 & 0x1) != 0) {
					@Pc(93) int local93 = local79.method8514();
					@Pc(117) int local117;
					if ((local85 & 0x2) != 0 && local79.anInt10003 == 0 && Math.random() * 1000.0D < 10.0D) {
						local117 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(125) int local125 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local117 != 0 || local125 != 0) {
							@Pc(139) int local139 = local117 + local79.anIntArray693[0];
							if (local139 < 0) {
								local139 = 0;
							} else if (local139 > Static224.anInt3557 - local93 - 1) {
								local139 = Static224.anInt3557 - local93 - 1;
							}
							@Pc(171) int local171 = local79.anIntArray694[0] + local125;
							if (local171 < 0) {
								local171 = 0;
							} else if (local171 > Static267.anInt4309 - local93 - 1) {
								local171 = Static267.anInt4309 - local93 - 1;
							}
							@Pc(221) int local221 = Static250.method3668(local171, Static263.aClass389Array1[local79.aByte141], 0, true, local79.anIntArray694[0], local79.anIntArray693[0], 0, -1, Static640.anIntArray699, local139, local93, local93, local93, Static155.anIntArray206);
							if (local221 > 0) {
								if (local221 > 9) {
									local221 = 9;
								}
								for (@Pc(230) int local230 = 0; local230 < local221; local230++) {
									local79.anIntArray693[local230] = Static155.anIntArray206[local221 - local230 - 1];
									local79.anIntArray694[local230] = Static640.anIntArray699[local221 - local230 - 1];
									local79.aByteArray102[local230] = 1;
								}
								local79.anInt10003 = local221;
							}
						}
					}
					Static507.method6916(true, local79);
					local117 = Static381.method3015(local79);
					Static487.method1698(local79);
					Static16.method296(local79, Static451.anInt7048, local117, Static470.anInt7477);
					Static384.method4983(Static451.anInt7048, local79);
					Static220.method3257(local79);
				}
			}
		}
		if (!Static71.method1514() && Static87.anInt1778 == 0) {
			if (Static259.anInt4200 == 2) {
				Static82.method7284();
			} else {
				Static366.method4841();
			}
			if (Static611.anInt9382 >> 9 < 14 || Static611.anInt9382 >> 9 >= Static224.anInt3557 - 14 || Static652.anInt10283 >> 9 < 14 || Static267.anInt4309 - 14 <= Static652.anInt10283 >> 9) {
				Static251.method1891();
			}
		}
		while (true) {
			@Pc(349) Class4_Sub25 local349;
			@Pc(354) Class199 local354;
			@Pc(365) Class199 local365;
			do {
				local349 = (Class4_Sub25) Static363.aClass163_33.method3644();
				if (local349 == null) {
					while (true) {
						do {
							local349 = (Class4_Sub25) Static152.aClass163_18.method3644();
							if (local349 == null) {
								while (true) {
									do {
										local349 = (Class4_Sub25) Static209.aClass163_20.method3644();
										if (local349 == null) {
											if (Static507.aClass199_12 != null) {
												Static229.method3333();
											}
											if (Static177.anInt3088 % 1500 == 0) {
												Static72.method1545();
											}
											if (Static656.anInt10356 == 7 && !Static71.method1514()) {
												Static644.method8591();
											}
											Static233.method3355();
											if (Static550.aBoolean656 && Static16.aLong11 < Static429.method5935() - 60000L) {
												Static352.method4721();
											}
											for (@Pc(522) Class3_Sub3_Sub2 local522 = (Class3_Sub3_Sub2) Static629.aClass236_9.method4958(); local522 != null; local522 = (Class3_Sub3_Sub2) Static629.aClass236_9.method4950()) {
												if ((long) local522.anInt5461 < Static429.method5935() / 1000L - 5L) {
													if (local522.aShort85 > 0) {
														Static388.method5002("", local522.aString71 + Static279.aClass179_19.method4066(Static164.anInt2984), "", "", 5, 0);
													}
													if (local522.aShort85 == 0) {
														Static388.method5002("", local522.aString71 + Static279.aClass179_20.method4066(Static164.anInt2984), "", "", 5, 0);
													}
													local522.method8898();
												}
											}
											if (Static656.anInt10356 == 7 && !Static71.method1514()) {
												if (Static375.aClass192_2 == null) {
													Static306.method4298(false);
													return;
												}
												Static635.anInt9890++;
												if (Static635.anInt9890 > 50) {
													@Pc(628) Class4_Sub48 local628 = Static335.method4615(Static7.aClass216_4, Static669.aClass196_2);
													Static410.method5170(local628);
												}
												try {
													Static460.method6417();
													return;
												} catch (@Pc(635) IOException local635) {
													Static306.method4298(false);
													return;
												}
											}
											return;
										}
										local354 = local349.aClass199_6;
										if (local354.anInt5005 < 0) {
											break;
										}
										local365 = Static569.method7534(local354.anInt4982);
									} while (local365 == null || local365.aClass199Array1 == null || local365.aClass199Array1.length <= local354.anInt5005 || local354 != local365.aClass199Array1[local354.anInt5005]);
									Static237.method3393(local349);
								}
							}
							local354 = local349.aClass199_6;
							if (local354.anInt5005 < 0) {
								break;
							}
							local365 = Static569.method7534(local354.anInt4982);
						} while (local365 == null || local365.aClass199Array1 == null || local354.anInt5005 >= local365.aClass199Array1.length || local354 != local365.aClass199Array1[local354.anInt5005]);
						Static237.method3393(local349);
					}
				}
				local354 = local349.aClass199_6;
				if (local354.anInt5005 < 0) {
					break;
				}
				local365 = Static569.method7534(local354.anInt4982);
			} while (local365 == null || local365.aClass199Array1 == null || local354.anInt5005 >= local365.aClass199Array1.length || local354 != local365.aClass199Array1[local354.anInt5005]);
			Static237.method3393(local349);
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1588()) {
			return;
		}
		Static375.aClass382_3 = new Class382();
		Static375.aClass382_3.anInt10282 = Integer.parseInt(this.getParameter("worldid"));
		Static121.aClass382_1 = new Class382();
		Static121.aClass382_1.anInt10282 = Integer.parseInt(this.getParameter("lobbyid"));
		Static121.aClass382_1.aString122 = this.getParameter("lobbyaddress");
		Static484.aClass382_4 = new Class382();
		Static484.aClass382_4.anInt10282 = Integer.parseInt(this.getParameter("demoid"));
		Static484.aClass382_4.aString122 = this.getParameter("demoaddress");
		Static181.aClass60_3 = Static291.method4149(Integer.parseInt(this.getParameter("modewhere")));
		if (Static238.aClass60_5 == Static181.aClass60_3) {
			Static181.aClass60_3 = Static495.aClass60_8;
		} else if (!Static244.method3604(Static181.aClass60_3) && Static181.aClass60_3 != Static215.aClass60_4) {
			Static181.aClass60_3 = Static215.aClass60_4;
		}
		Static88.aClass288_1 = Static655.method8735(Integer.parseInt(this.getParameter("modewhat")));
		if (Static88.aClass288_1 != Static331.aClass288_3 && Static88.aClass288_1 != Static277.aClass288_2 && Static88.aClass288_1 != Static603.aClass288_4) {
			Static88.aClass288_1 = Static603.aClass288_4;
		}
		try {
			Static164.anInt2984 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static164.anInt2984 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static196.aBoolean248 = true;
		} else {
			Static196.aBoolean248 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static278.aBoolean340 = true;
		} else {
			Static278.aBoolean340 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static640.aBoolean781 = true;
		} else {
			Static640.aBoolean781 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static333.aClass234_5 = Static179.aClass234_2;
			} else if (local152.equals("1")) {
				Static333.aClass234_5 = Static92.aClass234_1;
			} else if (local152.equals("2")) {
				Static333.aClass234_5 = Static471.aClass234_6;
			} else if (local152.equals("3")) {
				Static333.aClass234_5 = Static204.aClass234_3;
			}
		}
		try {
			Static461.anInt7416 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(191) Exception local191) {
			Static461.anInt7416 = 0;
		}
		Static488.aString95 = this.getParameter("quiturl");
		Static264.aString40 = this.getParameter("settings");
		if (Static264.aString40 == null) {
			Static264.aString40 = "";
		}
		Static552.aBoolean666 = "1".equals(this.getParameter("under"));
		@Pc(215) String local215 = this.getParameter("country");
		if (local215 != null) {
			try {
				Static138.anInt2568 = Integer.parseInt(local215);
			} catch (@Pc(222) Exception local222) {
				Static138.anInt2568 = 0;
			}
		}
		Static16.anInt306 = Integer.parseInt(this.getParameter("colourid"));
		if (Static16.anInt306 < 0 || Static16.anInt306 >= Static582.aColorArray4.length) {
			Static16.anInt306 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static414.aBoolean448 = true;
			Static54.aBoolean83 = true;
		}
		@Pc(258) String local258 = this.getParameter("frombilling");
		if (local258 != null && local258.equals("true")) {
			Static555.aBoolean668 = true;
		}
		Static420.aString78 = this.getParameter("sskey");
		if (Static420.aString78 != null && Static420.aString78.length() < 2) {
			Static420.aString78 = null;
		}
		@Pc(284) String local284 = this.getParameter("force64mb");
		if (local284 != null && local284.equals("true")) {
			Static207.aBoolean732 = true;
		}
		@Pc(296) String local296 = this.getParameter("worldflags");
		if (local296 != null) {
			try {
				Static255.anInt4152 = Integer.parseInt(local296);
			} catch (@Pc(303) Exception local303) {
			}
		}
		@Pc(308) String local308 = this.getParameter("userFlow");
		if (local308 != null) {
			try {
				Static278.aLong133 = Long.parseLong(local308);
			} catch (@Pc(315) NumberFormatException local315) {
			}
		}
		Static567.aString106 = this.getParameter("additionalInfo");
		if (Static567.aString106 != null && Static567.aString106.length() > 50) {
			Static567.aString106 = null;
		}
		if (Static333.aClass234_5 == Static179.aClass234_2) {
			Static606.anInt9314 = 765;
			Static353.anInt5368 = 503;
		} else if (Static333.aClass234_5 == Static92.aClass234_1) {
			Static353.anInt5368 = 480;
			Static606.anInt9314 = 640;
		}
		Static205.aClient1 = this;
		this.method1591(Static606.anInt9314, Static333.aClass234_5.aString72, Static353.anInt5368, Static88.aClass288_1.method6479() + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1589() {
		if (Static550.aBoolean656) {
			Static352.method4721();
		}
		Static597.method7829();
		if (Static582.aClass33_13 != null) {
			Static582.aClass33_13.method8070();
		}
		if (Static407.aFrame5 != null) {
			Static494.method6885(Static239.aClass207_2, Static407.aFrame5);
			Static407.aFrame5 = null;
		}
		if (Static375.aClass192_2 != null) {
			Static375.aClass192_2.method7791();
			Static375.aClass192_2 = null;
		}
		Static11.method222();
		Static334.aClass260_4.method5875();
		Static319.aClass309_3.method6946();
		if (Static408.aClass19_1 != null) {
			Static408.aClass19_1.method474();
			Static408.aClass19_1 = null;
		}
		try {
			Static15.aClass252_2.method5161();
			for (@Pc(62) int local62 = 0; local62 < 37; local62++) {
				Static73.aClass252Array1[local62].method5161();
			}
			Static155.aClass252_3.method5161();
			Static165.aClass252_4.method5161();
			Static80.method1709();
		} catch (@Pc(85) Exception local85) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	public synchronized void method1597() {
		if (Static649.anApplet2 != null && Static17.aCanvas1 == null && !Static239.aClass207_2.aBoolean398) {
			try {
				@Pc(13) Class local13 = Static649.anApplet2.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static17.aCanvas1 = (Canvas) local17.get(Static649.anApplet2);
				local17.set(Static649.anApplet2, (Object) null);
				if (Static17.aCanvas1 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1597();
	}
}
