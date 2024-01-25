import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[Lclient!md;")
	public static final Class131[] aClass131Array1 = new Class131[14];

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString57 = "Use";

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!sj;II)V")
	public static void method1383(@OriginalArg(1) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static328.aClass181_50 != null || Static168.aBoolean192 || (arg0 == null || Static219.method3812(arg0) == null)) {
			return;
		}
		Static328.aClass181_50 = arg0;
		Static163.aClass181_28 = Static219.method3812(arg0);
		Static218.anInt4470 = 0;
		Static337.anInt6550 = arg2;
		Static3.aBoolean7 = false;
		Static45.anInt926 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public static int method1387(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!tj;Lclient!wh;B)V")
	public static void method1388(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Interface9 arg1) {
		if (Static193.aClass3_Sub7_Sub13_4 == null) {
			return;
		}
		if (Static134.anInt2769 < 10) {
			if (!Static193.aClass100_47.method2317(Static193.aClass3_Sub7_Sub13_4.aString119)) {
				Static134.anInt2769 = Static124.aClass100_58.method2320(Static193.aClass3_Sub7_Sub13_4.aString119) / 10;
				return;
			}
			Static246.method4182();
			Static134.anInt2769 = 10;
		}
		if (Static134.anInt2769 == 10) {
			Static193.anInt2354 = Static193.aClass3_Sub7_Sub13_4.anInt3138 >> 6 << 6;
			Static193.anInt2349 = Static193.aClass3_Sub7_Sub13_4.anInt3136 >> 6 << 6;
			Static193.anInt2345 = (Static193.aClass3_Sub7_Sub13_4.anInt3146 >> 6 << 6) + 64 - Static193.anInt2354;
			Static193.anInt2347 = (Static193.aClass3_Sub7_Sub13_4.anInt3133 >> 6 << 6) + 64 - Static193.anInt2349;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static193.aClass3_Sub7_Sub13_4.method2565((Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7) + Static186.anInt3094, (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7) + Static296.anInt5889, local74, Static163.anInt3184)) {
				local78 = local74[2] - Static193.anInt2354;
				local76 = local74[1] - Static193.anInt2349;
			}
			if (!Static336.aBoolean438 && local76 >= 0 && local76 < Static193.anInt2347 && local78 >= 0 && local78 < Static193.anInt2345) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static330.anInt6402 = local76;
				Static114.anInt2413 = local78;
			} else if (Static230.anInt6558 == -1 || Static189.anInt3968 == -1) {
				Static193.aClass3_Sub7_Sub13_4.method2568(Static193.aClass3_Sub7_Sub13_4.anInt3135 & 0x3FFF, local74, Static193.aClass3_Sub7_Sub13_4.anInt3135 >> 14 & 0x3FFF);
				Static114.anInt2413 = local74[2] - Static193.anInt2354;
				Static330.anInt6402 = local74[1] - Static193.anInt2349;
			} else {
				Static193.aClass3_Sub7_Sub13_4.method2568(Static189.anInt3968, local74, Static230.anInt6558);
				Static189.anInt3968 = -1;
				Static230.anInt6558 = -1;
				Static336.aBoolean438 = false;
				if (local74 != null) {
					Static330.anInt6402 = local74[1] - Static193.anInt2349;
					Static114.anInt2413 = local74[2] - Static193.anInt2354;
				}
			}
			if (Static193.aClass3_Sub7_Sub13_4.anInt3137 == 37) {
				Static193.aFloat14 = 3.0F;
				Static193.aFloat15 = 3.0F;
			} else if (Static193.aClass3_Sub7_Sub13_4.anInt3137 == 50) {
				Static193.aFloat14 = 4.0F;
				Static193.aFloat15 = 4.0F;
			} else if (Static193.aClass3_Sub7_Sub13_4.anInt3137 == 75) {
				Static193.aFloat14 = 6.0F;
				Static193.aFloat15 = 6.0F;
			} else if (Static193.aClass3_Sub7_Sub13_4.anInt3137 == 100) {
				Static193.aFloat14 = 8.0F;
				Static193.aFloat15 = 8.0F;
			} else if (Static193.aClass3_Sub7_Sub13_4.anInt3137 == 200) {
				Static193.aFloat14 = 16.0F;
				Static193.aFloat15 = 16.0F;
			} else {
				Static193.aFloat14 = 8.0F;
				Static193.aFloat15 = 8.0F;
			}
			Static193.anInt2342 = (int) Static193.aFloat14 >> 1;
			Static193.aByteArrayArrayArray5 = Static349.method5668(Static193.anInt2342);
			Static149.method2422();
			Static193.method1918();
			Static293.aClass127_40 = new Class127();
			Static41.aClass137_1 = new Class137();
			Static193.anInt2343 += (int) (Math.random() * 5.0D) - 2;
			if (Static193.anInt2343 < -8) {
				Static193.anInt2343 = -8;
			}
			Static193.anInt2344 += (int) (Math.random() * 5.0D) - 2;
			if (Static193.anInt2343 > 8) {
				Static193.anInt2343 = 8;
			}
			if (Static193.anInt2344 < -16) {
				Static193.anInt2344 = -16;
			}
			if (Static193.anInt2344 > 16) {
				Static193.anInt2344 = 16;
			}
			Static193.method1916(arg1, Static193.anInt2343 >> 2 << 10, Static193.anInt2344 >> 1);
			Static179.method2993(1024, 256);
			Static335.method5501(256, 256);
			Static181.method799(4096);
			Static122.method2154(256);
			Static134.anInt2769 = 20;
		} else if (Static134.anInt2769 == 20) {
			Static164.method5308(true);
			Static193.method1921(arg0, Static193.anInt2343, Static193.anInt2344);
			Static134.anInt2769 = 60;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 60) {
			if (Static193.aClass100_47.method2308(Static193.aClass3_Sub7_Sub13_4.aString119 + "_staticelements")) {
				if (!Static193.aClass100_47.method2317(Static193.aClass3_Sub7_Sub13_4.aString119 + "_staticelements")) {
					return;
				}
				Static193.aClass146_2 = Static137.method2083(Static193.aClass3_Sub7_Sub13_4.aString119 + "_staticelements", Static193.aClass100_47, Static126.aBoolean251);
			} else {
				Static193.aClass146_2 = new Class146(0);
			}
			Static193.method1928();
			Static134.anInt2769 = 70;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 70) {
			Static307.aClass201_16 = new Class201(arg0, 11, true, Static295.aCanvas4);
			Static134.anInt2769 = 73;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 73) {
			Static98.aClass201_1 = new Class201(arg0, 12, true, Static295.aCanvas4);
			Static134.anInt2769 = 76;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 76) {
			Static163.aClass201_8 = new Class201(arg0, 14, true, Static295.aCanvas4);
			Static134.anInt2769 = 79;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 79) {
			Static235.aClass201_12 = new Class201(arg0, 17, true, Static295.aCanvas4);
			Static134.anInt2769 = 82;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 82) {
			Static162.aClass201_3 = new Class201(arg0, 19, true, Static295.aCanvas4);
			Static134.anInt2769 = 85;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 85) {
			Static251.aClass201_14 = new Class201(arg0, 22, true, Static295.aCanvas4);
			Static134.anInt2769 = 88;
			Static164.method5308(true);
			Static350.method5691();
		} else if (Static134.anInt2769 == 88) {
			Static215.aClass201_11 = new Class201(arg0, 26, true, Static295.aCanvas4);
			Static134.anInt2769 = 91;
			Static164.method5308(true);
			Static350.method5691();
		} else {
			Static274.aClass201_15 = new Class201(arg0, 30, true, Static295.aCanvas4);
			Static134.anInt2769 = 100;
			Static164.method5308(true);
			Static350.method5691();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1389(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
