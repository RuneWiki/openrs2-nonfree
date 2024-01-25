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
				Static26.method717("Argument count");
			}
			Static534.aClass174_5 = new Class174();
			Static534.aClass174_5.anInt4666 = Integer.parseInt(arg0[0]);
			Static293.aClass174_3 = new Class174();
			Static293.aClass174_3.anInt4666 = Integer.parseInt(arg0[1]);
			Static404.aClass174_4 = new Class174();
			Static404.aClass174_4.anInt4666 = Integer.parseInt(arg0[2]);
			Static253.aClass218_6 = Static489.aClass218_10;
			if (arg0[3].equals("live")) {
				Static417.aClass276_2 = Static567.aClass276_4;
			} else if (arg0[3].equals("rc")) {
				Static417.aClass276_2 = Static254.aClass276_1;
			} else if (arg0[3].equals("wip")) {
				Static417.aClass276_2 = Static550.aClass276_3;
			} else {
				Static26.method717("modewhat");
			}
			Static562.anInt9127 = Static29.method753(arg0[4]);
			if (Static562.anInt9127 == -1) {
				if (arg0[4].equals("english")) {
					Static562.anInt9127 = 0;
				} else if (arg0[4].equals("german")) {
					Static562.anInt9127 = 1;
				} else {
					Static26.method717("language");
				}
			}
			Static527.aBoolean640 = false;
			Static253.aBoolean365 = false;
			if (arg0[5].equals("game0")) {
				Static275.aClass230_2 = Static433.aClass230_4;
			} else if (arg0[5].equals("game1")) {
				Static275.aClass230_2 = Static353.aClass230_3;
			} else {
				Static26.method717("game");
			}
			Static476.aBoolean577 = true;
			Static40.aBoolean452 = true;
			Static249.aBoolean362 = false;
			Static481.anInt8127 = 0;
			Static292.aString59 = null;
			Static490.anInt8273 = Static275.aClass230_2.anInt6313;
			Static74.aString17 = "";
			Static360.aBoolean447 = false;
			Static368.aLong283 = 0L;
			Static526.anInt8706 = 0;
			Static208.anInt8805 = 0;
			Static210.aString41 = null;
			@Pc(164) client local164 = new client();
			Static550.aClient1 = local164;
			local164.method1553(Static275.aClass230_2.aString65, Static417.aClass276_2.method6368() + 32);
			Static208.aFrame4.setLocation(40, 40);
		} catch (@Pc(188) Exception local188) {
			Static259.method4059(null, local188);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method1536() {
		if (Static249.aBoolean362) {
			Static72.anInt1778 = 64;
		}
		@Pc(14) Frame local14 = new Frame("Jagex");
		local14.pack();
		local14.dispose();
		Static399.method5657();
		Static79.aClass274_1 = new Class274(Static246.aClass114_10);
		Static543.aClass113_2 = new Class113();
		Static94.method1794(new int[] { 1000, 100 }, new int[] { 20, 260 });
		if (Static122.aClass218_4 != Static253.aClass218_6) {
			Static542.aByteArrayArray28 = new byte[50][];
		}
		Static479.aClass1_Sub7_Sub1_1 = new Class1_Sub7_Sub1(Static246.aClass114_10);
		if (Static122.aClass218_4 == Static253.aClass218_6) {
			Static534.aClass174_5.aString46 = this.getCodeBase().getHost();
		} else if (Static552.method7058(Static253.aClass218_6)) {
			Static534.aClass174_5.aString46 = this.getCodeBase().getHost();
			Static534.aClass174_5.anInt4668 = Static534.aClass174_5.anInt4666 + 40000;
			Static293.aClass174_3.anInt4668 = Static293.aClass174_3.anInt4666 + 40000;
			Static534.aClass174_5.anInt4662 = Static534.aClass174_5.anInt4666 + 50000;
			Static404.aClass174_4.anInt4668 = Static404.aClass174_4.anInt4666 + 40000;
			Static293.aClass174_3.anInt4662 = Static293.aClass174_3.anInt4666 + 50000;
			Static404.aClass174_4.anInt4662 = Static404.aClass174_4.anInt4666 + 50000;
		} else if (Static253.aClass218_6 == Static489.aClass218_10) {
			Static534.aClass174_5.aString46 = "127.0.0.1";
			Static293.aClass174_3.aString46 = "127.0.0.1";
			Static404.aClass174_4.aString46 = "127.0.0.1";
			Static534.aClass174_5.anInt4668 = Static534.aClass174_5.anInt4666 + 40000;
			Static293.aClass174_3.anInt4668 = Static293.aClass174_3.anInt4666 + 40000;
			Static534.aClass174_5.anInt4662 = Static534.aClass174_5.anInt4666 + 50000;
			Static404.aClass174_4.anInt4668 = Static404.aClass174_4.anInt4666 + 40000;
			Static293.aClass174_3.anInt4662 = Static293.aClass174_3.anInt4666 + 50000;
			Static404.aClass174_4.anInt4662 = Static404.aClass174_4.anInt4666 + 50000;
		}
		if (Static275.aClass230_2 == Static353.aClass230_3) {
			Static235.aShortArrayArrayArray1 = Static514.aShortArrayArrayArray3;
			Static490.aBoolean598 = true;
			Static173.anInt3157 = 0;
			Static152.aShortArrayArray2 = Static483.aShortArrayArray9;
			Static108.anInt7210 = 16777215;
		} else {
			Static152.aShortArrayArray2 = Static321.aShortArrayArray7;
			Static235.aShortArrayArrayArray1 = Static270.aShortArrayArrayArray2;
		}
		Static137.aClass174_1 = Static534.aClass174_5;
		Static528.aShortArray112 = Static163.aShortArray38 = Static11.aShortArray5 = Static28.aShortArray43 = new short[256];
		if (Static275.aClass230_2 == Static433.aClass230_4) {
			Static11.aBoolean10 = false;
		}
		try {
			Static226.aClipboard3 = Static550.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(209) Exception local209) {
		}
		Static595.aClass31_1 = Static49.method1139(Static26.aCanvas3);
		Static287.aClass256_8 = Static108.method5951(Static26.aCanvas3);
		try {
			if (Static246.aClass114_10.aClass283_3 != null) {
				Static211.aClass259_3 = new Class259(Static246.aClass114_10.aClass283_3, 5200, 0);
				for (@Pc(231) int local231 = 0; local231 < 35; local231++) {
					Static460.aClass259Array1[local231] = new Class259(Static246.aClass114_10.aClass283Array1[local231], 6000, 0);
				}
				Static215.aClass259_4 = new Class259(Static246.aClass114_10.aClass283_2, 6000, 0);
				Static177.aClass57_2 = new Class57(255, Static211.aClass259_3, Static215.aClass259_4, 500000);
				Static355.aClass259_5 = new Class259(Static246.aClass114_10.aClass283_1, 24, 0);
				Static246.aClass114_10.aClass283_1 = null;
				Static246.aClass114_10.aClass283_3 = null;
				Static246.aClass114_10.aClass283_2 = null;
				Static246.aClass114_10.aClass283Array1 = null;
			}
		} catch (@Pc(297) IOException local297) {
			Static211.aClass259_3 = null;
			Static355.aClass259_5 = null;
			Static177.aClass57_2 = null;
			Static215.aClass259_4 = null;
		}
		if (Static253.aClass218_6 != Static122.aClass218_4) {
			Static115.aBoolean175 = true;
		}
		if (Static275.aClass230_2 == Static433.aClass230_4) {
			Static532.aString90 = Static103.aClass77_1.method1864(Static562.anInt9127);
		} else if (Static275.aClass230_2 == Static353.aClass230_3) {
			Static532.aString90 = Static103.aClass77_2.method1864(Static562.anInt9127);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1539() {
		@Pc(7) String local7 = null;
		try {
			local7 = "[1)" + Static376.anInt6631 + "," + Static24.anInt674 + "," + Static500.anInt6888 + "," + Static573.anInt9325 + "|";
			if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 != null) {
				local7 = local7 + "2)" + Static240.anInt4595 + "," + (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] + Static376.anInt6631) + "," + (Static24.anInt674 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0]) + "|";
			}
			local7 = local7 + "3)" + Static375.anInt6609 + "|4)" + Static479.aClass1_Sub7_Sub1_1.anInt3105 + "|5)" + Static19.method541() + "|6)" + Static443.anInt7718 + "," + Static300.anInt5516 + "|";
			local7 = local7 + "7)" + Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609) + "|";
			local7 = local7 + "8)" + Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) + "|";
			local7 = local7 + "9)" + Static479.aClass1_Sub7_Sub1_1.aBoolean228 + "|";
			local7 = local7 + "10)" + Static479.aClass1_Sub7_Sub1_1.aBoolean223 + "|";
			local7 = local7 + "11)" + Static479.aClass1_Sub7_Sub1_1.aBoolean232 + "|";
			local7 = local7 + "12)" + Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609) + "|";
			local7 = local7 + "13)" + Static72.anInt1778 + "|";
			local7 = local7 + "14)" + Static177.anInt2101;
			try {
				local7 = local7 + "|15)" + jagmisc.getTotalPhysicalMemory();
			} catch (@Pc(226) Throwable local226) {
			}
			try {
				if (Static375.anInt6609 == 2) {
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
									@Pc(315) Field local315 = local282.getClass().getDeclaredField("handle");
									local251.invoke(local315, Boolean.TRUE);
									local7 = local7 + "|16)" + Long.toHexString(local315.getLong(local282));
									local251.invoke(local315, Boolean.FALSE);
								}
							} catch (@Pc(351) Throwable local351) {
							}
							local251.invoke(local287, Boolean.FALSE);
						} catch (@Pc(363) Throwable local363) {
						}
					}
				}
			} catch (@Pc(375) Throwable local375) {
			}
			local7 = local7 + "]";
		} catch (@Pc(386) Throwable local386) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method1554(@OriginalArg(1) int arg0) {
		Static107.aClass312_1 = null;
		Static412.anInt7031 = 0;
		Static48.aClass23_3 = null;
		Static543.aClass113_2.anInt2963++;
		Static543.aClass113_2.anInt2962 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1555() {
		if (Static562.anInt9125 < Static543.aClass113_2.anInt2963) {
			Static137.aClass174_1.method4003();
			Static487.anInt8209 = (Static543.aClass113_2.anInt2963 * 50 - 50) * 5;
			if (Static487.anInt8209 > 3000) {
				Static487.anInt8209 = 3000;
			}
			if (Static543.aClass113_2.anInt2963 >= 2 && Static543.aClass113_2.anInt2962 == 6) {
				this.method1547("js5connect_outofdate");
				Static177.anInt2101 = 14;
				return;
			}
			if (Static543.aClass113_2.anInt2963 >= 4 && Static543.aClass113_2.anInt2962 == -1) {
				this.method1547("js5crc");
				Static177.anInt2101 = 14;
				return;
			}
			if (Static543.aClass113_2.anInt2963 >= 4 && Static412.method5784(Static177.anInt2101)) {
				if (Static543.aClass113_2.anInt2962 == 7 || Static543.aClass113_2.anInt2962 == 9) {
					this.method1547("js5connect_full");
				} else if (Static543.aClass113_2.anInt2962 <= 0) {
					this.method1547("js5io");
				} else if (Static179.aString38 == null) {
					this.method1547("js5connect");
				} else {
					this.method1547("js5proxy_" + Static179.aString38.trim());
				}
				Static177.anInt2101 = 14;
				return;
			}
		}
		Static562.anInt9125 = Static543.aClass113_2.anInt2963;
		if (Static487.anInt8209 > 0) {
			Static487.anInt8209--;
			return;
		}
		try {
			if (Static412.anInt7031 == 0) {
				Static48.aClass23_3 = Static137.aClass174_1.method3998(Static246.aClass114_10);
				Static412.anInt7031++;
			}
			if (Static412.anInt7031 == 1) {
				if (Static48.aClass23_3.anInt875 == 2) {
					if (Static48.aClass23_3.anObject1 != null) {
						Static179.aString38 = (String) Static48.aClass23_3.anObject1;
					}
					this.method1554(1000);
					return;
				}
				if (Static48.aClass23_3.anInt875 == 1) {
					Static412.anInt7031++;
				}
			}
			if (Static412.anInt7031 == 2) {
				Static107.aClass312_1 = new Class312((Socket) Static48.aClass23_3.anObject1, Static246.aClass114_10);
				@Pc(196) Class1_Sub20 local196 = new Class1_Sub20(5);
				local196.method4378(Static189.aClass232_2.anInt6494);
				local196.method4421(619);
				Static107.aClass312_1.method7021(5, local196.aByteArray52);
				Static412.anInt7031++;
				Static76.aLong87 = Static255.method4035();
			}
			if (Static412.anInt7031 == 3) {
				if (Static412.method5784(Static177.anInt2101) || Static107.aClass312_1.method7017() > 0) {
					@Pc(252) int local252 = Static107.aClass312_1.method7020();
					if (local252 != 0) {
						this.method1554(local252);
						return;
					}
					Static412.anInt7031++;
				} else if (Static255.method4035() - Static76.aLong87 > 30000L) {
					this.method1554(1001);
					return;
				}
			}
			if (Static412.anInt7031 == 4) {
				@Pc(282) boolean local282 = Static412.method5784(Static177.anInt2101) || Static391.method5585(Static177.anInt2101) || Static463.method6576(Static177.anInt2101);
				@Pc(285) Class118[] local285 = Static167.method2565();
				@Pc(293) Class1_Sub20 local293 = new Class1_Sub20(local285.length * 4);
				Static107.aClass312_1.method7022(0, local293.aByteArray52, local293.aByteArray52.length);
				for (@Pc(304) int local304 = 0; local304 < local285.length; local304++) {
					local285[local304].method2563(local293.method4371());
				}
				Static543.aClass113_2.method2490(!local282, Static107.aClass312_1);
				Static412.anInt7031 = 0;
				Static107.aClass312_1 = null;
				Static48.aClass23_3 = null;
			}
		} catch (@Pc(336) IOException local336) {
			this.method1554(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method1556() {
		if (Static177.anInt2101 == 14) {
			return;
		}
		@Pc(21) long local21 = Static526.method7175() / 1000000L - Static46.aLong69;
		Static46.aLong69 = Static526.method7175() / 1000000L;
		@Pc(29) boolean local29 = Static265.method4179();
		if (local29 && Static571.aBoolean680 && Static583.aClass141_2 != null) {
			Static583.aClass141_2.method5539();
		}
		if (Static570.method7702(Static177.anInt2101)) {
			if (Static138.aLong131 != 0L && Static138.aLong131 < Static255.method4035()) {
				Static68.method1443(Static19.method541(), false, Static479.aClass1_Sub7_Sub1_1.anInt3089, Static479.aClass1_Sub7_Sub1_1.anInt3117);
			} else if (!Static136.aClass12_8.method6431() && Static270.aBoolean384) {
				Static25.method617();
			}
		}
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (Static255.aFrame3 == null) {
			@Pc(85) Container local85;
			if (Static208.aFrame4 != null) {
				local85 = Static208.aFrame4;
			} else if (Static412.anApplet1 == null) {
				local85 = Static229.anApplet_Sub1_20;
			} else {
				local85 = Static412.anApplet1;
			}
			local99 = local85.getSize().width;
			local103 = local85.getSize().height;
			if (local85 == Static208.aFrame4) {
				@Pc(109) Insets local109 = Static208.aFrame4.getInsets();
				local99 -= local109.left + local109.right;
				local103 -= local109.bottom + local109.top;
			}
			if (Static309.anInt5589 != local99 || local103 != Static20.anInt611 || Static344.aBoolean436) {
				if (Static136.aClass12_8 == null || Static136.aClass12_8.method6442()) {
					Static399.method5657();
				} else {
					Static309.anInt5589 = local99;
					Static20.anInt611 = local103;
				}
				Static138.aLong131 = Static255.method4035() + 500L;
				Static344.aBoolean436 = false;
			}
		}
		if (Static255.aFrame3 != null && !Static81.aBoolean154 && Static570.method7702(Static177.anInt2101)) {
			Static68.method1443(Static479.aClass1_Sub7_Sub1_1.anInt3097, false, -1, -1);
		}
		@Pc(178) boolean local178 = false;
		if (Static327.aBoolean420) {
			Static327.aBoolean420 = false;
			local178 = true;
		}
		if (local178) {
			Static548.method7475();
		}
		if (Static136.aClass12_8 != null && Static136.aClass12_8.method6431() || Static19.method541() != 1) {
			Static388.method5569();
		}
		if (Static412.method5784(Static177.anInt2101)) {
			Static219.method3647(local178);
		} else if (Static270.method4227(Static177.anInt2101)) {
			Static218.method3616();
		} else if (Static373.method5435(Static177.anInt2101)) {
			Static218.method3616();
		} else if (Static460.method6537(Static177.anInt2101)) {
			if (Static180.anInt3231 == 1) {
				if (Static377.anInt6653 < Static580.anInt9408) {
					Static377.anInt6653 = Static580.anInt9408;
				}
				local99 = (Static377.anInt6653 - Static580.anInt9408) * 50 / Static377.anInt6653;
				Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, true, Static103.aClass77_14.method1864(Static562.anInt9127) + "<br>(" + local99 + "%)", Static21.aClass35_1);
			} else if (Static180.anInt3231 == 2) {
				if (Static336.anInt5967 < Static30.anInt868) {
					Static336.anInt5967 = Static30.anInt868;
				}
				local99 = (Static336.anInt5967 - Static30.anInt868) * 50 / Static336.anInt5967 + 50;
				Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, true, Static103.aClass77_14.method1864(Static562.anInt9127) + "<br>(" + local99 + "%)", Static21.aClass35_1);
			} else {
				Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, true, Static103.aClass77_14.method1864(Static562.anInt9127), Static21.aClass35_1);
			}
		} else if (Static177.anInt2101 == 10) {
			Static136.method2285(local21);
		} else if (Static177.anInt2101 == 13) {
			Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, false, Static103.aClass77_16.method1864(Static562.anInt9127) + "<br>" + Static103.aClass77_17.method1864(Static562.anInt9127), Static21.aClass35_1);
		}
		if (Static401.anInt6896 == 3) {
			for (local99 = 0; local99 < Static288.anInt5333; local99++) {
				@Pc(372) Rectangle local372 = Class220.aRectangleArray1[local99];
				if (Static210.aBooleanArray10[local99]) {
					Static136.aClass12_8.method6418(local372.height, local372.x, local372.y, local372.width, -1996553985);
				} else if (Static551.aBooleanArray28[local99]) {
					Static136.aClass12_8.method6418(local372.height, local372.x, local372.y, local372.width, -1996554240);
				}
			}
		}
		if (Static112.method1973()) {
			Static454.method6385(Static136.aClass12_8);
		}
		if (Static246.aClass114_10.aBoolean213 && Static570.method7702(Static177.anInt2101) && Static401.anInt6896 == 0 && Static19.method541() == 1 && !local178) {
			local99 = 0;
			for (local103 = 0; local103 < Static288.anInt5333; local103++) {
				if (Static551.aBooleanArray28[local103]) {
					Static551.aBooleanArray28[local103] = false;
					Static456.aRectangleArray2[local99++] = Class220.aRectangleArray1[local103];
				}
			}
			try {
				Static136.aClass12_8.method6400(Static456.aRectangleArray2, local99);
			} catch (@Pc(470) Exception_Sub1 local470) {
			}
		} else if (!Static412.method5784(Static177.anInt2101)) {
			for (local99 = 0; local99 < Static288.anInt5333; local99++) {
				Static551.aBooleanArray28[local99] = false;
			}
			try {
				Static136.aClass12_8.method6416();
			} catch (@Pc(496) Exception_Sub1 local496) {
				Static259.method4059(local496.getMessage() + " (Recovered) " + this.method1539(), local496);
				Static69.method1449(0);
			}
		}
		if (Static479.aClass1_Sub7_Sub1_1.anInt3113 == 0) {
			Static423.method5918(15L);
		} else if (Static479.aClass1_Sub7_Sub1_1.anInt3113 == 1) {
			Static423.method5918(10L);
		} else if (Static479.aClass1_Sub7_Sub1_1.anInt3113 == 2) {
			Static423.method5918(5L);
		} else if (Static479.aClass1_Sub7_Sub1_1.anInt3113 == 3) {
			Static423.method5918(2L);
		}
		if (Static574.aBoolean682) {
			Static90.method1761();
		}
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean222 && Static177.anInt2101 == 3 && Static219.anInt4263 != -1) {
			Static479.aClass1_Sub7_Sub1_1.aBoolean222 = false;
			Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method1546() {
		if (Static375.anInt6609 != 2) {
			this.method1556();
			return;
		}
		try {
			this.method1556();
		} catch (@Pc(22) ThreadDeath local22) {
			throw local22;
		} catch (@Pc(25) Throwable local25) {
			Static259.method4059(local25.getMessage() + " (Recovered) " + this.method1539(), local25);
			Static69.method1449(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method1561() {
		if (Static177.anInt2101 == 14) {
			return;
		}
		Static81.anInt1910++;
		if (Static81.anInt1910 % 1000 == 1) {
			@Pc(24) GregorianCalendar local24 = new GregorianCalendar();
			Static526.anInt8693 = local24.get(11) * 600 + local24.get(12) * 10 + local24.get(13) / 6;
			Static535.aRandom1.setSeed((long) Static526.anInt8693);
		}
		if (Static81.anInt1910 % 50 == 0) {
			Static386.anInt6764 = Static552.anInt8530;
			Static552.anInt8530 = 0;
			Static379.anInt6706 = Static322.anInt6018;
			Static322.anInt6018 = 0;
		}
		this.method1566();
		if (Static226.aClass168_3 != null) {
			Static226.aClass168_3.method3975();
		}
		Static503.method6989();
		Static595.aClass31_1.method989();
		Static287.aClass256_8.method7556();
		if (Static136.aClass12_8 != null) {
			Static136.aClass12_8.method6424((int) Static255.method4035());
		}
		Static32.method784();
		Static207.anInt7989 = 0;
		Static592.anInt9557 = 0;
		for (@Pc(99) Interface21 local99 = Static595.aClass31_1.method990(); local99 != null; local99 = Static595.aClass31_1.method990()) {
			@Pc(105) int local105 = local99.method6533();
			if (local105 == 2 || local105 == 3) {
				@Pc(133) char local133 = local99.method6536();
				if (Static561.method5043() && (local133 == '`' || local133 == '§' || local133 == '²')) {
					if (Static112.method1973()) {
						Static268.method4200();
					} else {
						Static584.method7821();
					}
				} else if (Static207.anInt7989 < 128) {
					Static304.anInterface21Array2[Static207.anInt7989] = local99;
					Static207.anInt7989++;
				}
			} else if (local105 == 0 && Static592.anInt9557 < 75) {
				Static195.anInterface21Array1[Static592.anInt9557] = local99;
				Static592.anInt9557++;
			}
		}
		Static184.anInt5415 = 0;
		for (@Pc(183) Class1_Sub13 local183 = Static287.aClass256_8.method7554(); local183 != null; local183 = Static287.aClass256_8.method7554()) {
			@Pc(189) int local189 = local183.method2533();
			if (local189 == -1) {
				Static13.aClass361_4.method7855(local183);
			} else if (local189 == 6) {
				Static184.anInt5415 += local183.method2535();
			} else if (Static214.method3555(local189)) {
				Static270.aClass361_55.method7855(local183);
				if (Static270.aClass361_55.method7851() > 10) {
					Static270.aClass361_55.method7850();
				}
			}
		}
		if (Static112.method1973()) {
			Static109.method1954();
		}
		if (Static412.method5784(Static177.anInt2101)) {
			Static40.method5275();
			Static164.method2524();
		} else if (Static460.method6537(Static177.anInt2101)) {
			Static558.method7524();
		}
		if (Static391.method5585(Static177.anInt2101) && !Static460.method6537(Static177.anInt2101)) {
			this.method1569();
			Static573.method7713();
			Static560.method7542();
		} else if (Static463.method6576(Static177.anInt2101) && !Static460.method6537(Static177.anInt2101)) {
			this.method1569();
			Static560.method7542();
		} else if (Static177.anInt2101 == 12) {
			Static560.method7542();
		} else if (Static304.method4711(Static177.anInt2101) && !Static460.method6537(Static177.anInt2101)) {
			Static592.method7893();
		} else if (Static177.anInt2101 == 13) {
			Static560.method7542();
			if (Static543.anInt8924 != -3 && Static543.anInt8924 != 2 && Static543.anInt8924 != 15) {
				Static340.method5070(false);
			}
		}
		Static59.method6631(Static136.aClass12_8);
		Static270.aClass361_55.method7850();
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1535()) {
			return;
		}
		Static534.aClass174_5 = new Class174();
		Static534.aClass174_5.anInt4666 = Integer.parseInt(this.getParameter("worldid"));
		Static293.aClass174_3 = new Class174();
		Static293.aClass174_3.anInt4666 = Integer.parseInt(this.getParameter("lobbyid"));
		Static293.aClass174_3.aString46 = this.getParameter("lobbyaddress");
		Static404.aClass174_4 = new Class174();
		Static404.aClass174_4.anInt4666 = Integer.parseInt(this.getParameter("demoid"));
		Static404.aClass174_4.aString46 = this.getParameter("demoaddress");
		Static253.aClass218_6 = Static584.method7822(Integer.parseInt(this.getParameter("modewhere")));
		if (Static489.aClass218_10 == Static253.aClass218_6) {
			Static253.aClass218_6 = Static363.aClass218_9;
		} else if (!Static552.method7058(Static253.aClass218_6) && Static253.aClass218_6 != Static122.aClass218_4) {
			Static253.aClass218_6 = Static122.aClass218_4;
		}
		Static417.aClass276_2 = Static11.method206(Integer.parseInt(this.getParameter("modewhat")));
		if (Static550.aClass276_3 != Static417.aClass276_2 && Static417.aClass276_2 != Static254.aClass276_1 && Static567.aClass276_4 != Static417.aClass276_2) {
			Static417.aClass276_2 = Static567.aClass276_4;
		}
		try {
			Static562.anInt9127 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(98) Exception local98) {
			Static562.anInt9127 = 0;
		}
		@Pc(104) String local104 = this.getParameter("objecttag");
		if (local104 != null && local104.equals("1")) {
			Static527.aBoolean640 = true;
		} else {
			Static527.aBoolean640 = false;
		}
		@Pc(120) String local120 = this.getParameter("js");
		if (local120 != null && local120.equals("1")) {
			Static253.aBoolean365 = true;
		} else {
			Static253.aBoolean365 = false;
		}
		@Pc(136) String local136 = this.getParameter("advert");
		if (local136 != null && local136.equals("1")) {
			Static267.aBoolean381 = true;
		} else {
			Static267.aBoolean381 = false;
		}
		@Pc(152) String local152 = this.getParameter("game");
		if (local152 != null) {
			if (local152.equals("0")) {
				Static275.aClass230_2 = Static433.aClass230_4;
			} else if (local152.equals("1")) {
				Static275.aClass230_2 = Static353.aClass230_3;
			}
		}
		try {
			Static208.anInt8805 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(175) Exception local175) {
			Static208.anInt8805 = 0;
		}
		Static412.aString75 = this.getParameter("quiturl");
		Static74.aString17 = this.getParameter("settings");
		if (Static74.aString17 == null) {
			Static74.aString17 = "";
		}
		@Pc(193) String local193 = this.getParameter("country");
		if (local193 != null) {
			try {
				Static481.anInt8127 = Integer.parseInt(local193);
			} catch (@Pc(200) Exception local200) {
				Static481.anInt8127 = 0;
			}
		}
		Static490.anInt8273 = Integer.parseInt(this.getParameter("colourid"));
		if (Static490.anInt8273 < 0 || Static490.anInt8273 >= Static141.aColorArray2.length) {
			Static490.anInt8273 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static476.aBoolean577 = true;
			Static40.aBoolean452 = true;
		}
		@Pc(233) String local233 = this.getParameter("frombilling");
		if (local233 != null && local233.equals("true")) {
			Static360.aBoolean447 = true;
		}
		Static210.aString41 = this.getParameter("sskey");
		if (Static210.aString41 != null && Static210.aString41.length() < 2) {
			Static210.aString41 = null;
		}
		@Pc(259) String local259 = this.getParameter("force64mb");
		if (local259 != null && local259.equals("true")) {
			Static249.aBoolean362 = true;
		}
		@Pc(271) String local271 = this.getParameter("worldflags");
		if (local271 != null) {
			try {
				Static526.anInt8706 = Integer.parseInt(local271);
			} catch (@Pc(278) Exception local278) {
			}
		}
		@Pc(283) String local283 = this.getParameter("userFlow");
		if (local283 != null) {
			try {
				Static368.aLong283 = Long.parseLong(local283);
			} catch (@Pc(290) NumberFormatException local290) {
			}
		}
		Static292.aString59 = this.getParameter("additionalInfo");
		if (Static292.aString59 != null && Static292.aString59.length() > 50) {
			Static292.aString59 = null;
		}
		Static550.aClient1 = this;
		if (Static275.aClass230_2 == Static433.aClass230_4) {
			Static483.anInt8133 = 765;
			Static443.anInt7712 = 503;
		} else if (Static353.aClass230_3 == Static275.aClass230_2) {
			Static483.anInt8133 = 640;
			Static443.anInt7712 = 480;
		}
		this.method1541(Static417.aClass276_2.method6368() + 32, Static443.anInt7712, Static275.aClass230_2.aString65, Static483.anInt8133);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1543() {
		if (Static412.anApplet1 != null && Static26.aCanvas3 == null && !Static246.aClass114_10.aBoolean213) {
			try {
				@Pc(13) Class local13 = Static412.anApplet1.getClass();
				@Pc(17) Field local17 = local13.getDeclaredField("canvas");
				Static26.aCanvas3 = (Canvas) local17.get(Static412.anApplet1);
				local17.set(Static412.anApplet1, null);
				if (Static26.aCanvas3 != null) {
					return;
				}
			} catch (@Pc(30) Exception local30) {
			}
		}
		super.method1543();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	@Override
	protected void method1549() {
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method1537() {
		if (Static375.anInt6609 != 2) {
			this.method1561();
			return;
		}
		try {
			this.method1561();
		} catch (@Pc(16) ThreadDeath local16) {
			throw local16;
		} catch (@Pc(19) Throwable local19) {
			Static259.method4059(local19.getMessage() + " (Recovered) " + this.method1539(), local19);
			Static69.method1449(0);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method1566() {
		@Pc(10) boolean local10 = Static543.aClass113_2.method2482();
		if (!local10) {
			this.method1555();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method1550() {
		if (Static43.aBoolean89) {
			Static561.method5044();
		}
		Static429.method6007();
		if (Static136.aClass12_8 != null) {
			Static136.aClass12_8.method6465();
		}
		if (Static255.aFrame3 != null) {
			Static67.method1437(Static246.aClass114_10, Static255.aFrame3);
			Static255.aFrame3 = null;
		}
		if (Static400.aClass75_3 != null) {
			Static400.aClass75_3.method1850();
			Static400.aClass75_3 = null;
		}
		Static73.method1593();
		Static543.aClass113_2.method2488();
		Static79.aClass274_1.method6340();
		if (Static103.aClass308_1 != null) {
			Static103.aClass308_1.method6988();
			Static103.aClass308_1 = null;
		}
		try {
			Static211.aClass259_3.method5766();
			for (@Pc(60) int local60 = 0; local60 < 35; local60++) {
				Static460.aClass259Array1[local60].method5766();
			}
			Static215.aClass259_4.method5766();
			Static355.aClass259_5.method5766();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method1569() {
		@Pc(29) int local29;
		if (Static177.anInt2101 == 7 && Static316.anInt5682 == 0) {
			if (Static562.anInt9131 > 1) {
				Static562.anInt9131--;
				Static384.anInt7194 = Static274.anInt5077;
			}
			if (!Static294.aBoolean407) {
				Static593.method7895();
			}
			for (local29 = 0; local29 < 100 && Static568.method7663(); local29++) {
			}
		}
		Static236.anInt4451++;
		Static356.method5847(-1, null, -1);
		Static456.method6393(null, -1, -1);
		Static239.method3926();
		Static274.anInt5077++;
		for (local29 = 0; local29 < Static491.anInt1754; local29++) {
			@Pc(73) Class20_Sub2_Sub4_Sub1_Sub2 local73 = Static471.aClass1_Sub39Array1[local29].aClass20_Sub2_Sub4_Sub1_Sub2_2;
			if (local73 != null) {
				@Pc(79) byte local79 = local73.aClass162_1.aByte59;
				if ((local79 & 0x1) != 0) {
					@Pc(90) int local90 = local73.method5349();
					@Pc(111) int local111;
					if ((local79 & 0x2) != 0 && local73.anInt6469 == 0 && Math.random() * 1000.0D < 10.0D) {
						local111 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(119) int local119 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local111 != 0 || local119 != 0) {
							@Pc(134) int local134 = local73.anIntArray437[0] + local111;
							@Pc(141) int local141 = local119 + local73.anIntArray436[0];
							if (local134 < 0) {
								local134 = 0;
							} else if (Static500.anInt6888 - local90 - 1 < local134) {
								local134 = Static500.anInt6888 - local90 - 1;
							}
							if (local141 < 0) {
								local141 = 0;
							} else if (Static573.anInt9325 - local90 - 1 < local141) {
								local141 = Static573.anInt9325 - local90 - 1;
							}
							@Pc(217) int local217 = Static264.method4168(local73.anIntArray437[0], -1, Static28.aClass94Array2[local73.aByte116], local90, local134, local90, 0, Static328.anIntArray379, local73.anIntArray436[0], local141, true, 0, local90, Static519.anIntArray588);
							if (local217 > 0) {
								if (local217 > 9) {
									local217 = 9;
								}
								for (@Pc(228) int local228 = 0; local228 < local217; local228++) {
									local73.anIntArray437[local228] = Static519.anIntArray588[local217 - local228 - 1];
									local73.anIntArray436[local228] = Static328.anIntArray379[local217 - local228 - 1];
									local73.aByteArray70[local228] = 1;
								}
								local73.anInt6469 = local217;
							}
						}
					}
					Static412.method5787(local73, true);
					local111 = Static518.method7098(local73);
					Static167.method2561(Static312.anInt5628, local111, local73, Static569.anInt9286);
					Static50.method1157(local73, Static569.anInt9286);
					Static279.method4313(local73);
				}
			}
		}
		if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
			if (Static585.anInt9461 == 2) {
				Static207.method6647();
			} else {
				Static337.method5031();
			}
			if (Static333.anInt5940 >> 9 < 14 || Static500.anInt6888 - 14 <= Static333.anInt5940 >> 9 || Static216.anInt4203 >> 9 < 14 || Static216.anInt4203 >> 9 >= Static573.anInt9325 - 14) {
				Static565.method7627();
			}
		}
		while (true) {
			@Pc(351) Class1_Sub2 local351;
			@Pc(356) Class365 local356;
			@Pc(367) Class365 local367;
			do {
				local351 = (Class1_Sub2) Static92.aClass361_28.method7850();
				if (local351 == null) {
					while (true) {
						do {
							local351 = (Class1_Sub2) Static292.aClass361_59.method7850();
							if (local351 == null) {
								while (true) {
									do {
										local351 = (Class1_Sub2) Static215.aClass361_44.method7850();
										if (local351 == null) {
											if (Static363.aClass365_14 != null) {
												Static123.method2121();
											}
											if (Static81.anInt1910 % 1500 == 0) {
												Static184.method4622();
											}
											if (Static177.anInt2101 == 7 && Static316.anInt5682 == 0) {
												Static69.method1446();
											}
											Static338.method5050();
											if (Static43.aBoolean89 && Static566.aLong406 < Static255.method4035() - 60000L) {
												Static561.method5044();
											}
											for (@Pc(538) Class20_Sub1_Sub2 local538 = (Class20_Sub1_Sub2) Static447.aClass349_14.method7653(); local538 != null; local538 = (Class20_Sub1_Sub2) Static447.aClass349_14.method7660()) {
												if (Static255.method4035() / 1000L - 5L > (long) local538.anInt2275) {
													if (local538.aShort26 > 0) {
														Static114.method1983("", "", "", 0, local538.aString24 + Static103.aClass77_21.method1864(Static562.anInt9127), 5);
													}
													if (local538.aShort26 == 0) {
														Static114.method1983("", "", "", 0, local538.aString24 + Static103.aClass77_22.method1864(Static562.anInt9127), 5);
													}
													local538.method7704();
												}
											}
											if (Static177.anInt2101 == 7 && Static316.anInt5682 == 0) {
												if (Static400.aClass75_3 == null) {
													Static340.method5070(false);
													return;
												}
												Static314.anInt5650++;
												if (Static314.anInt5650 > 50) {
													@Pc(648) Class1_Sub48 local648 = Static320.method4867(Static442.aClass170_2, Static143.aClass319_57);
													Static34.method813(local648);
												}
												try {
													Static364.method5312();
													return;
												} catch (@Pc(657) IOException local657) {
													Static340.method5070(false);
													return;
												}
											}
											return;
										}
										local356 = local351.aClass365_1;
										if (local356.anInt9603 < 0) {
											break;
										}
										local367 = Static374.method5437(local356.anInt9590);
									} while (local367 == null || local367.aClass365Array2 == null || local356.anInt9603 >= local367.aClass365Array2.length || local356 != local367.aClass365Array2[local356.anInt9603]);
									Static145.method2353(local351);
								}
							}
							local356 = local351.aClass365_1;
							if (local356.anInt9603 < 0) {
								break;
							}
							local367 = Static374.method5437(local356.anInt9590);
						} while (local367 == null || local367.aClass365Array2 == null || local356.anInt9603 >= local367.aClass365Array2.length || local356 != local367.aClass365Array2[local356.anInt9603]);
						Static145.method2353(local351);
					}
				}
				local356 = local351.aClass365_1;
				if (local356.anInt9603 < 0) {
					break;
				}
				local367 = Static374.method5437(local356.anInt9590);
			} while (local367 == null || local367.aClass365Array2 == null || local367.aClass365Array2.length <= local356.anInt9603 || local356 != local367.aClass365Array2[local356.anInt9603]);
			Static145.method2353(local351);
		}
	}
}
