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

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[Lclient!m;")
	public static Class153[] lb;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static392.method5523("Argument count");
			}
			Static80.aClass9_1 = new Class9();
			Static80.aClass9_1.anInt84 = Integer.parseInt(arg0[0]);
			Static256.aClass9_5 = new Class9();
			Static256.aClass9_5.anInt84 = Integer.parseInt(arg0[1]);
			Static108.aClass9_4 = new Class9();
			Static108.aClass9_4.anInt84 = Integer.parseInt(arg0[2]);
			Static42.aClass219_1 = Static337.aClass219_4;
			if (arg0[3].equals("live")) {
				Static123.aClass73_4 = Static341.aClass73_7;
			} else if (arg0[3].equals("rc")) {
				Static123.aClass73_4 = Static215.aClass73_6;
			} else if (arg0[3].equals("wip")) {
				Static123.aClass73_4 = Static173.aClass73_5;
			} else {
				Static392.method5523("modewhat");
			}
			Static168.anInt3290 = Static75.method1639(arg0[4]);
			if (Static168.anInt3290 == -1) {
				if (arg0[4].equals("english")) {
					Static168.anInt3290 = 0;
				} else if (arg0[4].equals("german")) {
					Static168.anInt3290 = 1;
				} else {
					Static392.method5523("language");
				}
			}
			Static409.aBoolean530 = false;
			Static27.aBoolean24 = false;
			if (arg0[5].equals("game0")) {
				Static332.aClass235_6 = Static50.aClass235_4;
			} else if (arg0[5].equals("game1")) {
				Static332.aClass235_6 = Static323.aClass235_5;
			} else {
				Static392.method5523("game");
			}
			Static464.anInt7954 = 0;
			Static230.aString35 = "";
			Static399.anInt7070 = 0;
			Static272.aBoolean352 = true;
			Static445.aBoolean558 = true;
			Static332.aBoolean441 = false;
			Static401.aBoolean525 = false;
			Static35.anInt622 = Static332.aClass235_6.anInt6654;
			@Pc(154) client local154 = new client();
			Static179.aClient1 = local154;
			local154.method1116(Static123.aClass73_4.method2123() + 32, Static332.aClass235_6.aString57);
			Static97.aFrame1.setLocation(40, 40);
		} catch (@Pc(177) Exception local177) {
			Static417.method5814(local177, null);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method1127() {
		if (Static236.aClass184_2.anInt5314 > Static188.anInt3789) {
			Static302.aClass9_6.aBoolean2 = !Static302.aClass9_6.aBoolean2;
			Static52.anInt1249 = (Static236.aClass184_2.anInt5314 * 50 - 50) * 5;
			if (Static52.anInt1249 > 3000) {
				Static52.anInt1249 = 3000;
			}
			if (Static236.aClass184_2.anInt5314 >= 2 && Static236.aClass184_2.anInt5313 == 6) {
				this.method1118("js5connect_outofdate");
				Static70.anInt1726 = 13;
				return;
			}
			if (Static236.aClass184_2.anInt5314 >= 4 && Static236.aClass184_2.anInt5313 == -1) {
				this.method1118("js5crc");
				Static70.anInt1726 = 13;
				return;
			}
			if (Static236.aClass184_2.anInt5314 >= 4 && Static197.method3493(Static70.anInt1726)) {
				if (Static236.aClass184_2.anInt5313 == 7 || Static236.aClass184_2.anInt5313 == 9) {
					this.method1118("js5connect_full");
				} else if (Static236.aClass184_2.anInt5313 <= 0) {
					this.method1118("js5io");
				} else {
					this.method1118("js5connect");
				}
				Static70.anInt1726 = 13;
				return;
			}
		}
		Static188.anInt3789 = Static236.aClass184_2.anInt5314;
		if (Static52.anInt1249 > 0) {
			Static52.anInt1249--;
			return;
		}
		try {
			if (Static159.anInt3241 == 0) {
				Static234.aClass87_6 = Static390.aClass255_5.method5825(Static302.aClass9_6.aString1, Static302.aClass9_6.method74());
				Static159.anInt3241++;
			}
			if (Static159.anInt3241 == 1) {
				if (Static234.aClass87_6.anInt2679 == 2) {
					this.method1128(1000);
					return;
				}
				if (Static234.aClass87_6.anInt2679 == 1) {
					Static159.anInt3241++;
				}
			}
			if (Static159.anInt3241 == 2) {
				Static14.aClass25_1 = new Class25((Socket) Static234.aClass87_6.anObject3, Static390.aClass255_5);
				@Pc(186) Class4_Sub20 local186 = new Class4_Sub20(5);
				local186.method4590(Static34.aClass81_2.anInt2486);
				local186.method4561(604);
				Static14.aClass25_1.method403(local186.aByteArray77, 5);
				Static159.anInt3241++;
				Static305.aLong169 = Static167.method2929();
			}
			if (Static159.anInt3241 == 3) {
				if (Static197.method3493(Static70.anInt1726) || Static14.aClass25_1.method409() > 0) {
					@Pc(227) int local227 = Static14.aClass25_1.method404();
					if (local227 != 0) {
						this.method1128(local227);
						return;
					}
					Static159.anInt3241++;
				} else if (Static167.method2929() - Static305.aLong169 > 30000L) {
					this.method1128(1001);
					return;
				}
			}
			if (Static159.anInt3241 == 4) {
				@Pc(275) boolean local275 = Static70.anInt1726 == 1 || Static252.method4140(Static70.anInt1726) || Static35.method516(Static70.anInt1726);
				Static236.aClass184_2.method4439(Static14.aClass25_1, !local275);
				Static234.aClass87_6 = null;
				Static14.aClass25_1 = null;
				Static159.anInt3241 = 0;
			}
		} catch (@Pc(294) IOException local294) {
			this.method1128(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1128(@OriginalArg(1) int arg0) {
		Static14.aClass25_1 = null;
		Static236.aClass184_2.anInt5313 = arg0;
		Static159.anInt3241 = 0;
		Static234.aClass87_6 = null;
		Static236.aClass184_2.anInt5314++;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;")
	@Override
	public String method1115() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static426.anInt7325 + "," + Static72.anInt1776 + "," + Static193.anInt3853 + "," + Static301.anInt5585 + "|";
			if (Static52.aClass11_Sub5_Sub2_Sub1_2 != null) {
				local7 = local7 + "2)" + Static59.anInt1472 + "," + (Static426.anInt7325 + Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0]) + "," + (Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] + Static72.anInt1776) + "|";
			}
			local7 = local7 + "3)" + Static192.anInt3828 + "|4)" + Static157.aClass185_Sub1_1.anInt5572 + "|5)" + Static331.method4891() + "|6)" + Static374.anInt6595 + "," + Static30.anInt518 + "|";
			local7 = local7 + "7)" + Static157.aClass185_Sub1_1.method4632(Static192.anInt3828) + "|";
			local7 = local7 + "8)" + Static157.aClass185_Sub1_1.method4630(Static192.anInt3828) + "|";
			local7 = local7 + "9)" + Static157.aClass185_Sub1_1.aBoolean397 + "|";
			local7 = local7 + "10)" + Static157.aClass185_Sub1_1.aBoolean405 + "|";
			local7 = local7 + "11)" + Static157.aClass185_Sub1_1.aBoolean401 + "|";
			local7 = local7 + "12)" + Static157.aClass185_Sub1_1.method4639(Static192.anInt3828) + "|";
			local7 = local7 + "13)" + Static263.anInt5007 + "|";
			local7 = local7 + "14)" + Static70.anInt1726;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(228) Throwable local228) {
			}
			try {
				if (Static192.anInt3828 == 2) {
					@Pc(234) Class local234 = Class.forName("java.lang.ClassLoader");
					@Pc(238) Field local238 = local234.getDeclaredField("nativeLibraries");
					@Pc(241) Class local241 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(251) Method local251 = local241.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local251.invoke(local238, Boolean.TRUE);
					@Pc(274) Vector local274 = (Vector) local238.get(client.class.getClassLoader());
					for (@Pc(276) int local276 = 0; local274.size() > local276; local276++) {
						try {
							@Pc(282) Object local282 = local274.elementAt(local276);
							@Pc(287) Field local287 = local282.getClass().getDeclaredField("name");
							local251.invoke(local287, Boolean.TRUE);
							try {
								@Pc(302) String local302 = (String) local287.get(local282);
								if (local302 != null && local302.indexOf("sw3d.dll") != -1) {
									@Pc(314) Field local314 = local282.getClass().getDeclaredField("handle");
									local251.invoke(local314, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local314.getLong(local282));
									local251.invoke(local314, Boolean.FALSE);
								}
							} catch (@Pc(350) Throwable local350) {
							}
							local251.invoke(local287, Boolean.FALSE);
						} catch (@Pc(362) Throwable local362) {
						}
					}
				}
			} catch (@Pc(370) Throwable local370) {
			}
			local7 = local7 + "]";
		} catch (@Pc(381) Throwable local381) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1124() {
		if (Static401.aBoolean525) {
			Static263.anInt5007 = 64;
		}
		@Pc(19) Frame local19 = new Frame("Jagex");
		local19.pack();
		local19.dispose();
		Static111.method2192();
		Static282.aClass256_3 = new Class256(Static390.aClass255_5);
		Static236.aClass184_2 = new Class184();
		if (Static297.aClass219_2 != Static42.aClass219_1) {
			Static1.aByteArrayArray1 = new byte[50][];
		}
		Static157.aClass185_Sub1_1 = new Class185_Sub1(Static390.aClass255_5);
		if (Static42.aClass219_1 == Static297.aClass219_2) {
			Static80.aClass9_1.aString1 = this.getCodeBase().getHost();
		} else if (Static156.method5961(Static42.aClass219_1)) {
			Static80.aClass9_1.aString1 = this.getCodeBase().getHost();
			Static80.aClass9_1.anInt79 = Static80.aClass9_1.anInt84 + 40000;
			Static256.aClass9_5.anInt79 = Static256.aClass9_5.anInt84 + 40000;
			Static80.aClass9_1.anInt80 = Static80.aClass9_1.anInt84 + 50000;
			Static108.aClass9_4.anInt79 = Static108.aClass9_4.anInt84 + 40000;
			Static256.aClass9_5.anInt80 = Static256.aClass9_5.anInt84 + 50000;
			Static108.aClass9_4.anInt80 = Static108.aClass9_4.anInt84 + 50000;
		} else if (Static42.aClass219_1 == Static337.aClass219_4) {
			Static80.aClass9_1.aString1 = "127.0.0.1";
			Static256.aClass9_5.aString1 = "127.0.0.1";
			Static80.aClass9_1.anInt79 = Static80.aClass9_1.anInt84 + 40000;
			Static108.aClass9_4.aString1 = "127.0.0.1";
			Static256.aClass9_5.anInt79 = Static256.aClass9_5.anInt84 + 40000;
			Static80.aClass9_1.anInt80 = Static80.aClass9_1.anInt84 + 50000;
			Static108.aClass9_4.anInt79 = Static108.aClass9_4.anInt84 + 40000;
			Static256.aClass9_5.anInt80 = Static256.aClass9_5.anInt84 + 50000;
			Static108.aClass9_4.anInt80 = Static108.aClass9_4.anInt84 + 50000;
		}
		if (Static332.aClass235_6 == Static50.aClass235_4) {
			Static435.aBoolean545 = false;
		}
		Static268.aShortArray86 = Static226.aShortArray66 = Static215.aShortArray72 = Static261.aShortArray78 = new short[256];
		if (Static332.aClass235_6 == Static323.aClass235_5) {
			Static341.aBoolean452 = true;
			Static219.anInt4437 = 16777215;
			Static182.anInt3700 = 0;
			Static220.aShortArrayArray5 = Static190.aShortArrayArray4;
			Static117.aShortArray77 = Static301.aShortArray88;
			Static411.aShortArray101 = Static230.aShortArray67;
			Static160.aShortArrayArray3 = Static439.aShortArrayArray8;
		} else {
			Static160.aShortArrayArray3 = Static236.aShortArrayArray7;
			Static220.aShortArrayArray5 = Static34.aShortArrayArray1;
			Static117.aShortArray77 = Static91.aShortArray29;
			Static411.aShortArray101 = Static137.aShortArray34;
		}
		Static302.aClass9_6 = Static80.aClass9_1;
		Static115.aClass173_1 = Static247.method4074(Static409.aCanvas7);
		Static329.aClass95_1 = Static386.method6041(Static409.aCanvas7);
		Static156.anInt7414 = Static419.anInt7272;
		try {
			if (Static390.aClass255_5.aClass137_4 != null) {
				Static251.aClass159_2 = new Class159(Static390.aClass255_5.aClass137_4, 5200, 0);
				for (@Pc(218) int local218 = 0; local218 < 30; local218++) {
					Static265.aClass159Array1[local218] = new Class159(Static390.aClass255_5.aClass137Array1[local218], 6000, 0);
				}
				Static348.aClass159_3 = new Class159(Static390.aClass255_5.aClass137_3, 6000, 0);
				Static219.aClass269_3 = new Class269(255, Static251.aClass159_2, Static348.aClass159_3, 500000);
				Static103.aClass159_1 = new Class159(Static390.aClass255_5.aClass137_2, 24, 0);
				Static390.aClass255_5.aClass137_4 = null;
				Static390.aClass255_5.aClass137_3 = null;
				Static390.aClass255_5.aClass137Array1 = null;
				Static390.aClass255_5.aClass137_2 = null;
			}
		} catch (@Pc(276) IOException local276) {
			Static103.aClass159_1 = null;
			Static348.aClass159_3 = null;
			Static251.aClass159_2 = null;
			Static219.aClass269_3 = null;
		}
		if (Static42.aClass219_1 != Static297.aClass219_2) {
			Static244.aBoolean318 = true;
		}
		if (Static332.aClass235_6 == Static50.aClass235_4) {
			Static195.aString50 = Static278.aClass21_79.method362(Static168.anInt3290);
		} else if (Static332.aClass235_6 == Static323.aClass235_5) {
			Static195.aString50 = Static433.aClass21_11.method362(Static168.anInt3290);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1132() {
		if (Static70.anInt1726 == 13) {
			return;
		}
		@Pc(19) long local19 = Static232.method3933() / 1000000L - Static133.aLong82;
		Static133.aLong82 = Static232.method3933() / 1000000L;
		@Pc(27) boolean local27 = Static100.method1890();
		if (local27 && Static351.aBoolean462 && Static178.aClass55_2 != null) {
			Static178.aClass55_2.method5672();
		}
		if (Static132.method2439(Static70.anInt1726)) {
			if (Static454.aLong224 != 0L && Static454.aLong224 < Static167.method2929()) {
				Static77.method1652(Static157.aClass185_Sub1_1.anInt5574, Static157.aClass185_Sub1_1.anInt5575, Static331.method4891(), false);
			} else if (!Static30.aClass30_3.method2034() && Static84.aBoolean583) {
				Static412.method5722();
			}
		}
		@Pc(86) int local86;
		@Pc(90) int local90;
		if (Static124.aFrame2 == null) {
			@Pc(78) Container local78;
			if (Static97.aFrame1 == null) {
				local78 = Static390.aClass255_5.anApplet1;
			} else {
				local78 = Static97.aFrame1;
			}
			local86 = local78.getSize().width;
			local90 = local78.getSize().height;
			if (local78 == Static97.aFrame1) {
				@Pc(96) Insets local96 = Static97.aFrame1.getInsets();
				local90 -= local96.top + local96.bottom;
				local86 -= local96.right + local96.left;
			}
			if (Static448.anInt7687 != local86 || local90 != Static4.anInt50) {
				if (Static30.aClass30_3 == null || Static30.aClass30_3.method2071()) {
					Static111.method2192();
				} else {
					Static4.anInt50 = local90;
					Static448.anInt7687 = local86;
				}
				Static454.aLong224 = Static167.method2929() + 500L;
			}
		}
		if (Static124.aFrame2 != null && !Static155.aBoolean211 && Static132.method2439(Static70.anInt1726)) {
			Static77.method1652(-1, -1, Static157.aClass185_Sub1_1.anInt5573, false);
		}
		@Pc(153) boolean local153 = false;
		if (Static384.aBoolean487) {
			Static384.aBoolean487 = false;
			local153 = true;
		}
		if (local153) {
			Static449.method6143();
		}
		if (Static30.aClass30_3 != null && Static30.aClass30_3.method2034() || Static331.method4891() != 1) {
			Static208.method3674();
		}
		if (Static70.anInt1726 == 0) {
			Static54.method1201(Static457.aColorArray3[Static35.anInt622], Static194.aColorArray2[Static35.anInt622], Static25.aColorArray1[Static35.anInt622], local153, Static240.aString42, Static15.anInt305);
		} else if (Static70.anInt1726 == 1) {
			Static204.method3631(Static247.aClass18_2, Static25.aColorArray1[Static35.anInt622].getRGB(), Static194.aColorArray2[Static35.anInt622].getRGB(), Static457.aColorArray3[Static35.anInt622].getRGB(), Static30.aClass30_3.method2034() | local153, Static30.aClass30_3);
		} else if (Static358.method5157(Static70.anInt1726)) {
			Static186.method3391();
		} else if (Static373.method5316(Static70.anInt1726)) {
			Static186.method3391();
		} else if (Static257.method4208(Static70.anInt1726)) {
			if (Static77.anInt1869 == 1) {
				if (Static330.anInt5880 > Static106.anInt7774) {
					Static106.anInt7774 = Static330.anInt5880;
				}
				local86 = (Static106.anInt7774 - Static330.anInt5880) * 50 / Static106.anInt7774;
				Static122.method2305(true, Static330.aClass18_3, Static299.aClass21_87.method362(Static168.anInt3290) + "<br>(" + local86 + "%)");
			} else if (Static77.anInt1869 == 2) {
				if (Static272.anInt5156 < Static93.anInt2062) {
					Static272.anInt5156 = Static93.anInt2062;
				}
				local86 = (Static272.anInt5156 - Static93.anInt2062) * 50 / Static272.anInt5156 + 50;
				Static122.method2305(true, Static330.aClass18_3, Static299.aClass21_87.method362(Static168.anInt3290) + "<br>(" + local86 + "%)");
			} else {
				Static122.method2305(true, Static330.aClass18_3, Static299.aClass21_87.method362(Static168.anInt3290));
			}
		} else if (Static70.anInt1726 == 9) {
			Static303.method4681(local19);
		} else if (Static70.anInt1726 == 12) {
			Static122.method2305(true, Static330.aClass18_3, Static332.aClass21_99.method362(Static168.anInt3290) + "<br>" + Static293.aClass21_85.method362(Static168.anInt3290));
		}
		if (Static265.anInt5027 == 3) {
			for (local86 = 0; local86 < Static171.anInt3372; local86++) {
				@Pc(386) Rectangle local386 = Class267.aRectangleArray2[local86];
				if (Static122.aBooleanArray51[local86]) {
					Static30.aClass30_3.method2072(local386.y, local386.x, local386.width, local386.height, -1996553985);
				} else if (Static237.aBooleanArray88[local86]) {
					Static30.aClass30_3.method2072(local386.y, local386.x, local386.width, local386.height, -1996554240);
				}
			}
		}
		if (Static364.method5207()) {
			Static23.method361(Static30.aClass30_3);
		}
		if (Static132.method2439(Static70.anInt1726) && Static265.anInt5027 == 0 && Static331.method4891() == 1 && !local153 && Static419.aString72.equals("1.1")) {
			local86 = 0;
			for (local90 = 0; local90 < Static171.anInt3372; local90++) {
				if (Static237.aBooleanArray88[local90]) {
					Static237.aBooleanArray88[local90] = false;
					Static291.aRectangleArray1[local86++] = Class267.aRectangleArray2[local90];
				}
			}
			Static30.aClass30_3.method2075(Static291.aRectangleArray1, local86);
		} else if (Static70.anInt1726 != 0) {
			Static30.aClass30_3.method2042();
			for (local86 = 0; local86 < Static171.anInt3372; local86++) {
				Static237.aBooleanArray88[local86] = false;
			}
		}
		if (Static157.aClass185_Sub1_1.anInt5562 == 0) {
			Static77.method1653(15L);
		} else if (Static157.aClass185_Sub1_1.anInt5562 == 1) {
			Static77.method1653(10L);
		} else if (Static157.aClass185_Sub1_1.anInt5562 == 2) {
			Static77.method1653(5L);
		} else if (Static157.aClass185_Sub1_1.anInt5562 == 3) {
			Static77.method1653(2L);
		}
		if (Static253.aBoolean338) {
			Static115.method2206();
		}
		if (Static157.aClass185_Sub1_1.aBoolean394 && Static70.anInt1726 == 2 && Static248.anInt4793 != -1) {
			Static157.aClass185_Sub1_1.aBoolean394 = false;
			Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1110() {
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method1135() {
		@Pc(10) int local10;
		if (!Static157.aClass185_Sub1_1.aBoolean394) {
			for (local10 = 0; local10 < Static299.anInt5551; local10++) {
				if (Static433.anInterface5Array3[local10].method2833() == 's' || Static433.anInterface5Array3[local10].method2833() == 'S') {
					Static157.aClass185_Sub1_1.aBoolean394 = true;
					break;
				}
			}
		}
		@Pc(58) int local58;
		if (Static354.anInt6243 == 0) {
			@Pc(48) Runtime local48 = Runtime.getRuntime();
			local58 = (int) ((local48.totalMemory() - local48.freeMemory()) / 1024L);
			@Pc(61) long local61 = Static167.method2929();
			if (Static144.aLong91 == 0L) {
				Static144.aLong91 = local61;
			}
			if (local58 > 16384 && local61 - Static144.aLong91 < 5000L) {
				if (local61 - Static423.aLong213 > 1000L) {
					System.gc();
					Static423.aLong213 = local61;
				}
				Static240.aString42 = Static46.aClass21_6.method362(Static168.anInt3290);
				Static15.anInt305 = 5;
			} else {
				Static240.aString42 = Static393.aClass21_108.method362(Static168.anInt3290);
				Static15.anInt305 = 5;
				Static354.anInt6243 = 10;
			}
		} else if (Static354.anInt6243 == 10) {
			for (local10 = 0; local10 < 4; local10++) {
				Static335.aClass253Array1[local10] = Static272.method4369(Static193.anInt3853, Static301.anInt5585);
			}
			Static240.aString42 = Static266.aClass21_72.method362(Static168.anInt3290);
			Static354.anInt6243 = 20;
			Static15.anInt305 = 10;
		} else if (Static354.anInt6243 == 20) {
			if (Static277.aClass171_4 == null) {
				Static277.aClass171_4 = new Class171(Static236.aClass184_2, Static282.aClass256_3);
			}
			if (Static277.aClass171_4.method4285()) {
				Static302.aClass38_63 = Static101.method1901(false, true, 0);
				Static203.aClass38_45 = Static101.method1901(false, true, 1);
				Static29.aClass38_93 = Static101.method1901(false, true, 2);
				Static378.aClass38_77 = Static101.method1901(false, true, 3);
				Static180.aClass38_37 = Static101.method1901(false, true, 4);
				Static30.aClass38_8 = Static101.method1901(true, true, 5);
				Static296.aClass38_80 = Static101.method1901(true, false, 6);
				Static181.aClass38_39 = Static101.method1901(false, true, 7);
				Static143.aClass38_30 = Static101.method1901(false, true, 8);
				Static132.aClass38_29 = Static101.method1901(false, true, 9);
				Static228.aClass38_47 = Static101.method1901(false, true, 10);
				Static57.aClass38_12 = Static101.method1901(false, true, 11);
				Static308.aClass38_64 = Static101.method1901(false, true, 12);
				Static300.aClass38_60 = Static101.method1901(false, true, 13);
				Static30.aClass38_9 = Static101.method1901(false, false, 14);
				Static127.aClass38_26 = Static101.method1901(false, true, 15);
				Static340.aClass38_70 = Static101.method1901(false, true, 16);
				Static444.aClass38_92 = Static101.method1901(false, true, 17);
				Static327.aClass38_66 = Static101.method1901(false, true, 18);
				Static258.aClass38_38 = Static101.method1901(false, true, 19);
				Static220.aClass38_46 = Static101.method1901(false, true, 20);
				Static109.aClass38_22 = Static101.method1901(false, true, 21);
				Static65.aClass38_15 = Static101.method1901(false, true, 22);
				Static438.aClass38_91 = Static101.method1901(true, true, 23);
				Static249.aClass38_52 = Static101.method1901(false, true, 24);
				Static387.aClass38_79 = Static101.method1901(false, true, 25);
				Static34.aClass38_10 = Static101.method1901(true, true, 26);
				Static460.aClass38_94 = Static101.method1901(false, true, 27);
				Static228.aClass38_48 = Static101.method1901(true, true, 28);
				Static241.aClass38_51 = Static101.method1901(false, true, 29);
				Static240.aString42 = Static61.aClass21_16.method362(Static168.anInt3290);
				Static354.anInt6243 = 30;
				Static15.anInt305 = 15;
			} else {
				Static240.aString42 = Static258.aClass21_45.method362(Static168.anInt3290);
				Static15.anInt305 = 12;
			}
		} else if (Static354.anInt6243 == 30) {
			local10 = 0;
			for (local58 = 0; local58 < 30; local58++) {
				local10 += Static296.aClass79_Sub1Array3[local58].method2231() * Static396.anIntArray566[local58] / 100;
			}
			if (local10 == 100) {
				Static240.aString42 = Static198.aClass21_49.method362(Static168.anInt3290);
				Static15.anInt305 = 20;
				Static153.method2835(Static143.aClass38_30);
				Static338.method4973(Static143.aClass38_30);
				Static354.anInt6243 = 40;
			} else {
				if (local10 != 0) {
					Static240.aString42 = Static159.aClass21_41.method362(Static168.anInt3290) + local10 + "%";
				}
				Static15.anInt305 = 20;
			}
		} else if (Static354.anInt6243 == 40) {
			if (Static228.aClass38_48.method1030()) {
				this.method1142(Static228.aClass38_48.method1031(1));
				Static240.aString42 = Static451.aClass21_120.method362(Static168.anInt3290);
				Static354.anInt6243 = 50;
				Static15.anInt305 = 25;
			} else {
				Static240.aString42 = Static235.aClass21_64.method362(Static168.anInt3290) + Static228.aClass38_48.method1022() + "%";
				Static15.anInt305 = 25;
			}
		} else if (Static354.anInt6243 == 50) {
			Static4.method57();
			Static240.aString42 = Static93.aClass21_24.method362(Static168.anInt3290);
			Static15.anInt305 = 30;
			Static354.anInt6243 = 60;
		} else if (Static354.anInt6243 == 60) {
			local10 = Static226.method3855(Static300.aClass38_60, Static143.aClass38_30);
			local58 = Static423.method5878();
			if (local10 < local58) {
				Static240.aString42 = Static302.aClass21_89.method362(Static168.anInt3290) + local10 * 100 / local58 + "%";
				Static15.anInt305 = 35;
			} else {
				Static240.aString42 = Static297.aClass21_86.method362(Static168.anInt3290);
				Static354.anInt6243 = 70;
				Static15.anInt305 = 35;
			}
		} else if (Static354.anInt6243 == 70) {
			local10 = Static303.method4676(Static143.aClass38_30);
			local58 = Static373.method5317();
			if (local10 < local58) {
				Static240.aString42 = Static317.aClass21_96.method362(Static168.anInt3290) + local10 * 100 / local58 + "%";
				Static15.anInt305 = 40;
			} else {
				Static240.aString42 = Static63.aClass21_19.method362(Static168.anInt3290);
				Static354.anInt6243 = 80;
				Static15.anInt305 = 40;
			}
		} else if (Static354.anInt6243 == 80) {
			if (Static34.aClass38_10.method1030()) {
				Static357.anInterface4_8 = new Class250(Static34.aClass38_10, Static132.aClass38_29, Static143.aClass38_30);
				Static240.aString42 = Static411.aClass21_105.method362(Static168.anInt3290);
				Static354.anInt6243 = 90;
				Static15.anInt305 = 45;
			} else {
				Static240.aString42 = Static31.aClass21_4.method362(Static168.anInt3290) + Static34.aClass38_10.method1022() + "%";
				Static15.anInt305 = 45;
			}
		} else if (Static354.anInt6243 == 90) {
			Static240.aString42 = Static257.aClass21_70.method362(Static168.anInt3290);
			Static15.anInt305 = 50;
			Static354.anInt6243 = 95;
		} else if (Static354.anInt6243 == 95) {
			if (Static157.aClass185_Sub1_1.aBoolean394) {
				Static157.aClass185_Sub1_1.anInt5563 = 0;
				Static157.aClass185_Sub1_1.anInt5572 = 0;
				Static157.aClass185_Sub1_1.anInt5564 = 0;
				Static157.aClass185_Sub1_1.anInt5557 = 0;
				Static157.aClass185_Sub1_1.anInt5573 = 1;
			}
			Static157.aClass185_Sub1_1.aBoolean394 = true;
			Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
			Static228.method3894(false, Static157.aClass185_Sub1_1.anInt5557);
			Static240.aString42 = Static251.aClass21_67.method362(Static168.anInt3290);
			Static15.anInt305 = 55;
			Static354.anInt6243 = 100;
		} else if (Static354.anInt6243 == 100) {
			Static97.method1858(Static300.aClass38_60, Static143.aClass38_30, Static30.aClass30_3);
			Static240.aString42 = Static460.aClass21_122.method362(Static168.anInt3290);
			Static15.anInt305 = 60;
			Static382.method3540(1);
			Static354.anInt6243 = 110;
		} else if (Static354.anInt6243 == 110) {
			Static29.aClass38_93.method1030();
			local10 = Static29.aClass38_93.method1022();
			Static340.aClass38_70.method1030();
			local10 += Static340.aClass38_70.method1022();
			Static444.aClass38_92.method1030();
			local10 += Static444.aClass38_92.method1022();
			Static327.aClass38_66.method1030();
			local10 += Static327.aClass38_66.method1022();
			Static258.aClass38_38.method1030();
			local10 += Static258.aClass38_38.method1022();
			Static220.aClass38_46.method1030();
			local10 += Static220.aClass38_46.method1022();
			Static109.aClass38_22.method1030();
			local10 += Static109.aClass38_22.method1022();
			Static65.aClass38_15.method1030();
			local10 += Static65.aClass38_15.method1022();
			Static249.aClass38_52.method1030();
			local10 += Static249.aClass38_52.method1022();
			Static387.aClass38_79.method1030();
			local10 += Static387.aClass38_79.method1022();
			Static460.aClass38_94.method1030();
			local10 += Static460.aClass38_94.method1022();
			Static241.aClass38_51.method1030();
			local10 += Static241.aClass38_51.method1022();
			if (local10 < 1200) {
				Static240.aString42 = Static111.aClass21_33.method362(Static168.anInt3290) + local10 / 12 + "%";
				Static15.anInt305 = 65;
			} else {
				Static203.aClass202_1 = new Class202(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static123.aClass223_1 = new Class223(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static433.aClass275_2 = new Class275(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93, Static143.aClass38_30);
				Static166.aClass246_3 = new Class246(Static332.aClass235_6, Static168.anInt3290, Static444.aClass38_92);
				Static133.aClass59_1 = new Class59(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static240.aClass121_3 = new Class121(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static383.aClass126_2 = new Class126(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93, Static181.aClass38_39);
				Static434.aClass166_1 = new Class166(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static75.aClass207_1 = new Class207(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static146.aClass228_1 = new Class228(Static332.aClass235_6, Static168.anInt3290, true, Static340.aClass38_70, Static181.aClass38_39);
				Static62.aClass116_1 = new Class116(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93, Static143.aClass38_30);
				Static261.aClass8_4 = new Class8(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93, Static143.aClass38_30);
				Static220.aClass247_1 = new Class247(Static332.aClass235_6, Static168.anInt3290, true, Static327.aClass38_66, Static181.aClass38_39);
				Static139.aClass193_1 = new Class193(Static332.aClass235_6, Static168.anInt3290, true, Static203.aClass202_1, Static258.aClass38_38, Static181.aClass38_39);
				Static413.aClass257_1 = new Class257(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static143.aClass85_1 = new Class85(Static332.aClass235_6, Static168.anInt3290, Static220.aClass38_46, Static302.aClass38_63, Static203.aClass38_45);
				Static104.aClass180_1 = new Class180(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static348.aClass237_1 = new Class237(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static193.aClass186_1 = new Class186(Static332.aClass235_6, Static168.anInt3290, Static109.aClass38_22, Static181.aClass38_39);
				Static159.aClass218_1 = new Class218(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static67.aClass205_1 = new Class205(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static377.aClass45_3 = new Class45(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static166.aClass86_3 = new Class86(Static332.aClass235_6, Static168.anInt3290, Static65.aClass38_15);
				Static99.aClass50_1 = new Class50(Static332.aClass235_6, Static168.anInt3290, Static29.aClass38_93);
				Static115.method2209(Static143.aClass38_30, Static181.aClass38_39, Static300.aClass38_60, Static378.aClass38_77);
				Static26.method398(Static241.aClass38_51);
				Static306.aClass19_1 = new Class19(Static168.anInt3290, Static249.aClass38_52, Static387.aClass38_79);
				Static135.aClass75_2 = new Class75(Static168.anInt3290, Static249.aClass38_52, Static387.aClass38_79, new Class263());
				Static240.aString42 = Static143.aClass21_36.method362(Static168.anInt3290);
				Static15.anInt305 = 65;
				Static37.method701();
				Static146.aClass228_1.method5200(!Static157.aClass185_Sub1_1.method4639(Static192.anInt3828));
				Static67.aClass224_1 = new Class224();
				Static136.method2531();
				Static134.method2485(Static460.aClass38_94);
				Static188.method3404(Static181.aClass38_39, Static357.anInterface4_8);
				Static354.anInt6243 = 120;
			}
		} else if (Static354.anInt6243 == 120) {
			local10 = Static335.method4926(Static143.aClass38_30);
			local58 = Static134.method2487();
			if (local10 < local58) {
				Static240.aString42 = Static28.aClass21_3.method362(Static168.anInt3290) + local10 * 100 / local58 + "%";
				Static15.anInt305 = 70;
			} else {
				Static117.method4157(Static30.aClass30_3, Static143.aClass38_30);
				Static388.method4148(Static307.aClass2Array45);
				Static240.aString42 = Static228.aClass21_59.method362(Static168.anInt3290);
				Static15.anInt305 = 70;
				Static354.anInt6243 = 130;
			}
		} else if (Static354.anInt6243 == 130) {
			if (Static228.aClass38_47.method1034("huffman", "")) {
				@Pc(1251) Class147 local1251 = new Class147(Static228.aClass38_47.method1018("", "huffman"));
				Static385.method3421(local1251);
				Static240.aString42 = Static427.aClass21_112.method362(Static168.anInt3290);
				Static15.anInt305 = 75;
				Static354.anInt6243 = 140;
			} else {
				Static240.aString42 = Static144.aClass21_38.method362(Static168.anInt3290) + "0%";
				Static15.anInt305 = 75;
			}
		} else if (Static354.anInt6243 == 140) {
			if (Static378.aClass38_77.method1030()) {
				Static240.aString42 = Static230.aClass21_63.method362(Static168.anInt3290);
				Static354.anInt6243 = 150;
				Static15.anInt305 = 80;
			} else {
				Static240.aString42 = Static303.aClass21_90.method362(Static168.anInt3290) + Static378.aClass38_77.method1022() + "%";
				Static15.anInt305 = 80;
			}
		} else if (Static354.anInt6243 == 150) {
			if (Static308.aClass38_64.method1030()) {
				Static240.aString42 = Static436.aClass21_115.method362(Static168.anInt3290);
				Static354.anInt6243 = 160;
				Static15.anInt305 = 82;
			} else {
				Static240.aString42 = Static165.aClass21_42.method362(Static168.anInt3290) + Static308.aClass38_64.method1022() + "%";
				Static15.anInt305 = 82;
			}
		} else if (Static354.anInt6243 == 160) {
			if (Static300.aClass38_60.method1030()) {
				Static240.aString42 = Static459.aClass21_113.method362(Static168.anInt3290);
				Static15.anInt305 = 85;
				Static354.anInt6243 = 170;
			} else {
				Static240.aString42 = Static459.aClass21_113.method362(Static168.anInt3290) + Static300.aClass38_60.method1022() + "%";
				Static15.anInt305 = 85;
			}
		} else if (Static354.anInt6243 == 170) {
			if (Static438.aClass38_91.method1048("details")) {
				Static425.method3283(Static438.aClass38_91, Static133.aClass59_1, Static240.aClass121_3, Static146.aClass228_1, Static62.aClass116_1, Static261.aClass8_4, Static67.aClass224_1);
				Static240.aString42 = Static62.aClass21_17.method362(Static168.anInt3290);
				Static15.anInt305 = 89;
				Static354.anInt6243 = 190;
			} else {
				Static240.aString42 = Static56.aClass21_13.method362(Static168.anInt3290) + Static438.aClass38_91.method1033("details") + "%";
				Static15.anInt305 = 87;
			}
		} else if (Static354.anInt6243 == 190) {
			Static241.aBooleanArray89 = new boolean[Static377.aClass45_3.anInt1568];
			Static355.anIntArray503 = new int[Static377.aClass45_3.anInt1568];
			Static256.aStringArray25 = new String[Static67.aClass205_1.anInt5868];
			for (local10 = 0; local10 < Static377.aClass45_3.anInt1568; local10++) {
				if (Static377.aClass45_3.method1431(local10).anInt6238 == 0) {
					Static241.aBooleanArray89[local10] = true;
					Static228.anInt4540++;
				}
				Static355.anIntArray503[local10] = -1;
			}
			Static26.method397();
			Static345.anInt6103 = Static378.aClass38_77.method1045("loginscreen");
			Static208.anInt4252 = Static378.aClass38_77.method1045("lobbyscreen");
			Static30.aClass38_8.method1025(false);
			Static296.aClass38_80.method1025(true);
			Static143.aClass38_30.method1025(true);
			Static300.aClass38_60.method1025(true);
			Static228.aClass38_47.method1025(true);
			Static378.aClass38_77.method1025(true);
			Static253.aBoolean338 = true;
			Static29.aClass38_93.anInt1056 = 2;
			Static444.aClass38_92.anInt1056 = 2;
			Static340.aClass38_70.anInt1056 = 2;
			Static327.aClass38_66.anInt1056 = 2;
			Static258.aClass38_38.anInt1056 = 2;
			Static220.aClass38_46.anInt1056 = 2;
			Static109.aClass38_22.anInt1056 = 2;
			Static77.method1652(-1, -1, Static157.aClass185_Sub1_1.anInt5573, false);
			Static240.aString42 = Static225.aClass21_58.method362(Static168.anInt3290);
			Static15.anInt305 = 95;
			Static354.anInt6243 = 200;
		} else if (Static354.anInt6243 == 200) {
			Static382.method3540(2);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method1136() {
		if (Static70.anInt1726 == 13) {
			return;
		}
		Static277.anInt2834++;
		if (Static277.anInt2834 % 1000 == 1) {
			@Pc(26) GregorianCalendar local26 = new GregorianCalendar();
			Static303.anInt5630 = local26.get(11) * 600 + local26.get(12) * 10 + local26.get(13) / 6;
			Static181.aRandom1.setSeed((long) Static303.anInt5630);
		}
		if (Static277.anInt2834 % 50 == 0) {
			Static400.anInt7075 = Static30.anInt525;
			Static270.anInt5901 = Static288.anInt5357;
			Static30.anInt525 = 0;
			Static288.anInt5357 = 0;
		}
		this.method1144();
		if (Static277.aClass171_4 != null) {
			Static277.aClass171_4.method4284();
		}
		Static17.method291();
		Static115.aClass173_1.method4896();
		Static329.aClass95_1.method5177();
		if (Static30.aClass30_3 != null) {
			Static30.aClass30_3.method2062((int) Static167.method2929());
		}
		Static29.method6227();
		Static183.anInt3717 = 0;
		Static299.anInt5551 = 0;
		for (@Pc(100) Interface5 local100 = Static115.aClass173_1.method4894(); local100 != null; local100 = Static115.aClass173_1.method4894()) {
			@Pc(106) int local106 = local100.method2830();
			if (local106 == 2 || local106 == 3) {
				@Pc(120) char local120 = local100.method2833();
				if (Static214.method3759() && (local120 == '`' || local120 == '§')) {
					if (Static364.method5207()) {
						Static399.method5641();
					} else {
						Static136.method2529();
					}
				} else if (Static299.anInt5551 < 128) {
					Static433.anInterface5Array3[Static299.anInt5551] = local100;
					Static299.anInt5551++;
				}
			} else if (local106 == 0 && Static183.anInt3717 < 75) {
				Static18.anInterface5Array1[Static183.anInt3717] = local100;
				Static183.anInt3717++;
			}
		}
		Static278.anInt5205 = 0;
		for (@Pc(189) Class4_Sub15 local189 = Static329.aClass95_1.method5178(); local189 != null; local189 = Static329.aClass95_1.method5178()) {
			@Pc(195) int local195 = local189.method5048();
			if (local195 == -1) {
				Static92.aClass91_12.method2587(local189);
			} else if (local195 == 6) {
				Static278.anInt5205 += local189.method5053();
			} else if (Static159.method2896(local195)) {
				Static296.aClass91_50.method2587(local189);
				if (Static296.aClass91_50.method2573() > 10) {
					Static296.aClass91_50.method2583();
				}
			}
		}
		if (Static364.method5207()) {
			Static214.method3753();
		}
		if (Static70.anInt1726 == 0) {
			this.method1135();
			Static32.method454();
		} else if (Static70.anInt1726 == 1) {
			this.method1135();
			Static32.method454();
		} else if (Static257.method4208(Static70.anInt1726)) {
			Static370.method5246();
		}
		if (Static252.method4140(Static70.anInt1726) && !Static257.method4208(Static70.anInt1726)) {
			this.method1138();
			Static181.method3318();
			Static401.method5647();
		} else if (Static35.method516(Static70.anInt1726) && !Static257.method4208(Static70.anInt1726)) {
			this.method1138();
			Static401.method5647();
		} else if (Static70.anInt1726 == 11) {
			Static401.method5647();
		} else if (Static200.method3531(Static70.anInt1726) && !Static257.method4208(Static70.anInt1726)) {
			Static402.method5651();
		} else if (Static70.anInt1726 == 12) {
			Static401.method5647();
			if (Static22.anInt424 != -3 && Static22.anInt424 != 2 && Static22.anInt424 != 15) {
				Static91.method1815(false);
			}
		}
		Static115.method2210(Static30.aClass30_3);
		Static296.aClass91_50.method2583();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1109() {
		if (Static192.anInt3828 != 2) {
			this.method1132();
			return;
		}
		try {
			this.method1132();
		} catch (@Pc(9) Throwable local9) {
			Static417.method5814(local9, local9.getMessage() + " (Recovered) " + this.method1115());
			Static391.method5496(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method1138() {
		@Pc(26) int local26;
		if (Static70.anInt1726 == 6 && Static427.anInt7334 == 0) {
			if (Static293.anInt5391 > 1) {
				Static293.anInt5391--;
				Static234.anInt4636 = Static446.anInt7635;
			}
			if (!Static87.aBoolean142) {
				Static311.method4738();
			}
			for (local26 = 0; local26 < 100 && Static278.method4399(); local26++) {
			}
		}
		Static75.anInt1854++;
		Static429.method5910(-1, null, -1);
		Static335.method4925(-1, -1, null);
		Static146.method2690();
		Static446.anInt7635++;
		for (local26 = 0; local26 < Static328.anInt5871; local26++) {
			@Pc(78) Class11_Sub5_Sub2_Sub2 local78 = Static154.aClass4_Sub44Array1[local26].aClass11_Sub5_Sub2_Sub2_2;
			if (local78 != null) {
				@Pc(84) byte local84 = local78.aClass241_1.aByte91;
				if ((local84 & 0x1) != 0) {
					@Pc(95) int local95 = local78.method5302();
					@Pc(119) int local119;
					if ((local84 & 0x2) != 0 && local78.anInt6549 == 0 && Math.random() * 1000.0D < 10.0D) {
						local119 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(127) int local127 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local119 != 0 || local127 != 0) {
							@Pc(139) int local139 = local78.anIntArray523[0] + local119;
							@Pc(146) int local146 = local127 + local78.anIntArray524[0];
							if (local139 < 0) {
								local139 = 0;
							} else if (local139 > Static193.anInt3853 - local95 - 1) {
								local139 = Static193.anInt3853 - local95 - 1;
							}
							if (local146 < 0) {
								local146 = 0;
							} else if (Static301.anInt5585 - local95 - 1 < local146) {
								local146 = Static301.anInt5585 - local95 - 1;
							}
							@Pc(221) int local221 = Static381.method5403(local95, 0, local95, -1, Static221.anIntArray353, true, local78.anIntArray524[0], 0, local139, Static174.anIntArray281, local78.anIntArray523[0], local95, Static335.aClass253Array1[local78.aByte100], local146);
							if (local221 > 0) {
								if (local221 > 9) {
									local221 = 9;
								}
								for (@Pc(230) int local230 = 0; local230 < local221; local230++) {
									local78.anIntArray523[local230] = Static221.anIntArray353[local221 - local230 - 1];
									local78.anIntArray524[local230] = Static174.anIntArray281[local221 - local230 - 1];
									local78.aByteArray87[local230] = 1;
								}
								local78.anInt6549 = local221;
							}
						}
					}
					Static56.method1235(local78, true);
					local119 = Static214.method3757(local78);
					Static373.method5314(local119, local78, Static254.anInt4910, Static360.anInt6286);
					Static169.method4396(local78);
				}
			}
		}
		if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
			if (Static275.anInt5173 == 2) {
				Static250.method4109();
			} else {
				Static161.method5247();
			}
			if (Static235.anInt4645 >> 7 < 14 || Static193.anInt3853 - 14 <= Static235.anInt4645 >> 7 || Static108.anInt2350 >> 7 < 14 || Static108.anInt2350 >> 7 >= Static301.anInt5585 - 14) {
				Static70.method1547();
			}
		}
		while (true) {
			@Pc(348) Class4_Sub10 local348;
			@Pc(353) Class240 local353;
			@Pc(364) Class240 local364;
			do {
				local348 = (Class4_Sub10) Static331.aClass91_37.method2583();
				if (local348 == null) {
					while (true) {
						do {
							local348 = (Class4_Sub10) Static274.aClass91_30.method2583();
							if (local348 == null) {
								while (true) {
									do {
										local348 = (Class4_Sub10) Static459.aClass91_53.method2583();
										if (local348 == null) {
											if (Static65.aClass240_4 != null) {
												Static410.method5701();
											}
											if (Static277.anInt2834 % 1500 == 0) {
												Static268.method4312();
											}
											if (Static70.anInt1726 == 6 && Static427.anInt7334 == 0) {
												Static363.method5196();
											}
											Static3.method1231();
											if (Static67.aBoolean117 && Static73.aLong53 < Static167.method2929() - 60000L) {
												Static386.method6045();
											}
											for (@Pc(530) Class71_Sub1_Sub1 local530 = (Class71_Sub1_Sub1) Static436.aClass273_8.method6246(); local530 != null; local530 = (Class71_Sub1_Sub1) Static436.aClass273_8.method6249()) {
												if ((long) local530.anInt2565 < Static167.method2929() / 1000L - 5L) {
													if (local530.aShort22 > 0) {
														Static238.method4006("", 5, local530.aString17 + Static424.aClass21_111.method362(Static168.anInt3290), "", 0);
													}
													if (local530.aShort22 == 0) {
														Static238.method4006("", 5, local530.aString17 + Static229.aClass21_62.method362(Static168.anInt3290), "", 0);
													}
													local530.method6187();
												}
											}
											if (Static70.anInt1726 == 6 && Static427.anInt7334 == 0) {
												if (Static172.aClass13_1 == null) {
													Static91.method1815(false);
													return;
												}
												Static458.anInt7819++;
												if (Static458.anInt7819 > 50) {
													Static448.method6134(Static127.aClass212_34);
												}
												try {
													if (Static172.aClass13_1 != null && Static457.aClass4_Sub20_Sub1_5.anInt5526 > 0) {
														Static30.anInt525 += Static457.aClass4_Sub20_Sub1_5.anInt5526;
														Static172.aClass13_1.method177(Static457.aClass4_Sub20_Sub1_5.anInt5526, Static457.aClass4_Sub20_Sub1_5.aByteArray77);
														Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
														Static458.anInt7819 = 0;
														return;
													}
												} catch (@Pc(659) IOException local659) {
													Static91.method1815(false);
													return;
												}
											}
											return;
										}
										local353 = local348.aClass240_5;
										if (local353.anInt6885 < 0) {
											break;
										}
										local364 = Static92.method1820(local353.anInt6917);
									} while (local364 == null || local364.aClass240Array2 == null || local364.aClass240Array2.length <= local353.anInt6885 || local353 != local364.aClass240Array2[local353.anInt6885]);
									Static64.method1462(local348);
								}
							}
							local353 = local348.aClass240_5;
							if (local353.anInt6885 < 0) {
								break;
							}
							local364 = Static92.method1820(local353.anInt6917);
						} while (local364 == null || local364.aClass240Array2 == null || local353.anInt6885 >= local364.aClass240Array2.length || local353 != local364.aClass240Array2[local353.anInt6885]);
						Static64.method1462(local348);
					}
				}
				local353 = local348.aClass240_5;
				if (local353.anInt6885 < 0) {
					break;
				}
				local364 = Static92.method1820(local353.anInt6917);
			} while (local364 == null || local364.aClass240Array2 == null || local364.aClass240Array2.length <= local353.anInt6885 || local353 != local364.aClass240Array2[local353.anInt6885]);
			Static64.method1462(local348);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1114() {
		if (Static67.aBoolean117) {
			Static386.method6045();
		}
		if (Static30.aClass30_3 != null) {
			Static30.aClass30_3.method2086();
		}
		if (Static124.aFrame2 != null) {
			Static302.method4668(Static124.aFrame2, Static390.aClass255_5);
			Static124.aFrame2 = null;
		}
		if (Static172.aClass13_1 != null) {
			Static172.aClass13_1.method172();
			Static172.aClass13_1 = null;
		}
		Static441.method6048();
		Static236.aClass184_2.method4442();
		Static282.aClass256_3.method5848();
		if (Static372.aClass197_1 != null) {
			Static372.aClass197_1.method4736();
			Static372.aClass197_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
	private void method1142(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub20 local10 = new Class4_Sub20(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(19) int local19 = local10.method4614();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						@Pc(112) int[] local112 = Static130.anIntArray234 = new int[6];
						local112[0] = local10.method4560();
						local112[1] = local10.method4560();
						local112[2] = local10.method4560();
						local112[3] = local10.method4560();
						local112[4] = local10.method4560();
						local112[5] = local10.method4560();
					} else {
						@Pc(41) int local41;
						@Pc(36) int local36;
						if (local19 == 4) {
							local36 = local10.method4614();
							Static295.anIntArray444 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static295.anIntArray444[local41] = local10.method4560();
								if (Static295.anIntArray444[local41] == 65535) {
									Static295.anIntArray444[local41] = -1;
								}
							}
						} else if (local19 == 5) {
							local36 = local10.method4614();
							Static393.anIntArray556 = new int[local36];
							for (local41 = 0; local41 < local36; local41++) {
								Static393.anIntArray556[local41] = local10.method4560();
								if (Static393.anIntArray556[local41] == 65535) {
									Static393.anIntArray556[local41] = -1;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1113()) {
			return;
		}
		Static80.aClass9_1 = new Class9();
		Static80.aClass9_1.anInt84 = Integer.parseInt(this.getParameter("worldid"));
		Static256.aClass9_5 = new Class9();
		Static256.aClass9_5.anInt84 = Integer.parseInt(this.getParameter("lobbyid"));
		Static256.aClass9_5.aString1 = this.getParameter("lobbyaddress");
		Static108.aClass9_4 = new Class9();
		Static108.aClass9_4.anInt84 = Integer.parseInt(this.getParameter("demoid"));
		Static108.aClass9_4.aString1 = this.getParameter("demoaddress");
		Static42.aClass219_1 = Static2.method13(Integer.parseInt(this.getParameter("modewhere")));
		if (!Static156.method5961(Static42.aClass219_1) && Static297.aClass219_2 != Static42.aClass219_1) {
			Static42.aClass219_1 = Static297.aClass219_2;
		}
		Static123.aClass73_4 = Static221.method3820(Integer.parseInt(this.getParameter("modewhat")));
		if (Static173.aClass73_5 != Static123.aClass73_4 && Static123.aClass73_4 != Static215.aClass73_6 && Static123.aClass73_4 != Static341.aClass73_7) {
			Static123.aClass73_4 = Static341.aClass73_7;
		}
		try {
			Static168.anInt3290 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(91) Exception local91) {
			Static168.anInt3290 = 0;
		}
		@Pc(97) String local97 = this.getParameter("objecttag");
		if (local97 != null && local97.equals("1")) {
			Static27.aBoolean24 = true;
		} else {
			Static27.aBoolean24 = false;
		}
		@Pc(113) String local113 = this.getParameter("js");
		if (local113 != null && local113.equals("1")) {
			Static409.aBoolean530 = true;
		} else {
			Static409.aBoolean530 = false;
		}
		@Pc(129) String local129 = this.getParameter("advert");
		if (local129 != null && local129.equals("1")) {
			Static396.aBoolean520 = true;
		} else {
			Static396.aBoolean520 = false;
		}
		@Pc(145) String local145 = this.getParameter("game");
		if (local145 != null) {
			if (local145.equals("0")) {
				Static332.aClass235_6 = Static50.aClass235_4;
			} else if (local145.equals("1")) {
				Static332.aClass235_6 = Static323.aClass235_5;
			}
		}
		try {
			Static399.anInt7070 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(168) Exception local168) {
			Static399.anInt7070 = 0;
		}
		Static57.aString10 = this.getParameter("quiturl");
		Static230.aString35 = this.getParameter("settings");
		if (Static230.aString35 == null) {
			Static230.aString35 = "";
		}
		@Pc(186) String local186 = this.getParameter("country");
		if (local186 != null) {
			try {
				Static464.anInt7954 = Integer.parseInt(local186);
			} catch (@Pc(193) Exception local193) {
				Static464.anInt7954 = 0;
			}
		}
		Static35.anInt622 = Integer.parseInt(this.getParameter("colourid"));
		if (Static35.anInt622 < 0 || Static35.anInt622 >= Static25.aColorArray1.length) {
			Static35.anInt622 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static272.aBoolean352 = true;
			Static445.aBoolean558 = true;
		}
		@Pc(232) String local232 = this.getParameter("frombilling");
		if (local232 != null && local232.equals("true")) {
			Static332.aBoolean441 = true;
		}
		@Pc(244) String local244 = this.getParameter("force64mb");
		if (local244 != null && local244.equals("true")) {
			Static401.aBoolean525 = true;
		}
		if (Static332.aClass235_6 == Static50.aClass235_4) {
			Static146.anInt3029 = 765;
			Static449.anInt7705 = 503;
		} else if (Static323.aClass235_5 == Static332.aClass235_6) {
			Static449.anInt7705 = 480;
			Static146.anInt3029 = 640;
		}
		Static179.aClient1 = this;
		this.method1125(Static449.anInt7705, Static123.aClass73_4.method2123() + 32, Static146.anInt3029);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method1144() {
		@Pc(11) boolean local11 = Static236.aClass184_2.method4437();
		if (!local11) {
			this.method1127();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method1119() {
		if (Static192.anInt3828 != 2) {
			this.method1136();
			return;
		}
		try {
			this.method1136();
		} catch (@Pc(12) Throwable local12) {
			Static417.method5814(local12, local12.getMessage() + " (Recovered) " + this.method1115());
			Static391.method5496(0);
		}
	}
}
