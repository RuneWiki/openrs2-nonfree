import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Lclient!id;")
	private static Class34 aClass34_1117 = Static9.method266("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_1118 = Static9.method266("::fpsoff");

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!id;")
	public static Class34 aClass34_1119 = aClass34_1117;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "Lclient!id;")
	public static Class34 aClass34_1120 = Static9.method266(" weitere Optionen");

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "Lclient!id;")
	private static Class34 aClass34_1123 = Static9.method266("wishes to trade with you)3");

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!id;")
	public static Class34 aClass34_1121 = aClass34_1123;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "Lclient!id;")
	public static Class34 aClass34_1122 = Static9.method266("(Z");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ee;)V")
	public static void method1453(@OriginalArg(1) Class21 arg0) {
		Static95.aClass21_1 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!id;BZILclient!id;Lclient!ie;)V")
	public static void method1454(@OriginalArg(0) Class34 arg0, @OriginalArg(4) Class34 arg1, @OriginalArg(5) Class35 arg2) {
		@Pc(12) int local12 = arg2.method1582(arg0);
		@Pc(18) int local18 = arg2.method1564(arg1, local12);
		Static87.method1485(local12, local18, arg2, 255);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static void method1455() {
		Static21.aClass1_Sub19_Sub1_1.method2105(85);
		Static21.aClass1_Sub19_Sub1_1.method2073(0L);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)Lclient!id;")
	public static Class34 method1456(@OriginalArg(1) int arg0) {
		return Static28.method2007(false, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public static void method1457() {
		if (Static106.anInt2602 > 0) {
			Static129.method2011();
		} else {
			Static41.method695(40);
			Static128.aClass51_4 = Static3.aClass51_1;
			Static3.aClass51_1 = null;
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public static void method1458() {
		for (@Pc(11) Class1_Sub3 local11 = (Class1_Sub3) Static48.aClass38_10.method1034(); local11 != null; local11 = (Class1_Sub3) Static48.aClass38_10.method1038()) {
			if (local11.anInt481 > 0) {
				local11.anInt481--;
			}
			if (local11.anInt481 != 0) {
				if (local11.anInt471 > 0) {
					local11.anInt471--;
				}
				if (local11.anInt471 == 0 && local11.anInt469 >= 1 && local11.anInt484 >= 1 && local11.anInt469 <= 102 && local11.anInt484 <= 102 && (local11.anInt468 < 0 || Static105.method1723(local11.anInt482, local11.anInt468))) {
					Static130.method925(local11.anInt484, local11.anInt468, local11.anInt474, local11.anInt483, local11.anInt482, local11.anInt469, local11.anInt480);
					local11.anInt471 = -1;
					if (local11.anInt468 == local11.anInt473 && local11.anInt473 == -1) {
						local11.method2039();
					} else if (local11.anInt468 == local11.anInt473 && local11.anInt480 == local11.anInt478 && local11.anInt476 == local11.anInt482) {
						local11.method2039();
					}
				}
			} else if (local11.anInt473 < 0 || Static105.method1723(local11.anInt476, local11.anInt473)) {
				Static130.method925(local11.anInt484, local11.anInt473, local11.anInt474, local11.anInt483, local11.anInt476, local11.anInt469, local11.anInt478);
				local11.method2039();
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method1459(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static9.aBoolean24) {
			try {
				@Pc(23) Class65 local23 = (Class65) Class.forName("Class65_Sub1").getDeclaredConstructor().newInstance();
				local23.method1676(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static9.aBoolean24 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	public static void method1460() {
		Static51.aClass11_1.method1913();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static31.aLongArray2[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static50.aLongArray5[local24] = 0L;
		}
		Static30.anInt911 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public static void method1461() {
		aClass34_1119 = null;
		aClass34_1117 = null;
		aClass34_1123 = null;
		aClass34_1120 = null;
		aClass34_1122 = null;
		aClass34_1118 = null;
		aClass34_1121 = null;
	}
}
