import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!q;")
	public static Class62 aClass62_26;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "J")
	public static long aLong70;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1068 = Static108.method1915("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1069 = Static108.method1915("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!ie;")
	public static Class31 aClass31_49 = new Class31();

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1070 = Static108.method1915("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1071 = Static108.method1915("System)2Update in: ");

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1072 = Static108.method1915("Loaded update list");

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int anInt2124 = 0;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt2125 = 255;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1073 = Static108.method1915("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1074 = Static108.method1915("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1075 = aClass39_1072;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!q;Lclient!q;)V")
	public static void method1480(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static79.aClass62_28 = arg1;
		Static72.aClass62_21 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1481() {
		@Pc(5) Class45 local5 = Static63.aClass45_1;
		synchronized (Static63.aClass45_1) {
			Static85.anInt2030 = Static2.anInt137;
			Static29.anInt971 = Static85.anInt2026;
			Static3.anInt150 = Static102.anInt2580;
			Static91.anInt2130 = Static26.anInt921;
			Static89.anInt2109 = Static123.anInt2992;
			Static38.anInt1157 = Static72.anInt1805;
			Static11.aLong12 = Static63.aLong47;
			Static26.anInt921 = 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	public static void method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			if (Static67.aClass39Array19[local14] != null) {
				@Pc(24) int local24 = Static94.anIntArray338[local14];
				@Pc(33) int local33 = Static56.anInt1514 + 74 - local7 * 14;
				if (local33 < -20) {
					break;
				}
				if (local24 == 0) {
					local7++;
				}
				@Pc(45) Class39 local45 = Static16.aClass39Array25[local14];
				if (local45 != null && local45.method1185(Static112.aClass39_1343)) {
					local45 = local45.method1181(5);
				}
				if (local45 != null && local45.method1185(Static38.aClass39_534)) {
					local45 = local45.method1181(5);
				}
				if ((local24 == 1 || local24 == 2) && (local24 == 1 || Static114.anInt2845 == 0 || Static114.anInt2845 == 1 && Static98.method1718(local45))) {
					local7++;
					if (arg1 > local33 - 14 && local33 >= arg1 && !local45.method1159(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass39_1234)) {
						if (Static58.anInt1566 >= 1) {
							Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 8, Static68.aClass39_867, 0, 0, 0);
						}
						Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 53, Static16.aClass39_1220, 0, 0, 0);
						Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 49, Static105.aClass39_1303, 0, 0, 0);
					}
				}
				if ((local24 == 3 || local24 == 7) && Static71.anInt1792 == 0 && (local24 == 7 || Static24.anInt816 == 0 || Static24.anInt816 == 1 && Static98.method1718(local45))) {
					local7++;
					if (local33 - 14 < arg1 && local33 >= arg1) {
						if (Static58.anInt1566 >= 1) {
							Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 8, Static68.aClass39_867, 0, 0, 0);
						}
						Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 53, Static16.aClass39_1220, 0, 0, 0);
						Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 49, Static105.aClass39_1303, 0, 0, 0);
					}
				}
				if (local24 == 4 && (Static11.anInt495 == 0 || Static11.anInt495 == 1 && Static98.method1718(local45))) {
					local7++;
					if (local33 - 14 < arg1 && local33 >= arg1) {
						Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 26, Static24.aClass39_405, 0, 0, 0);
					}
				}
				if ((local24 == 5 || local24 == 6) && Static71.anInt1792 == 0 && Static24.anInt816 < 2) {
					local7++;
				}
				if (local24 == 8 && (Static11.anInt495 == 0 || Static11.anInt495 == 1 && Static98.method1718(local45))) {
					local7++;
					if (local33 - 14 < arg1 && local33 >= arg1) {
						Static71.method1242(Static30.method601(new Class39[] { Static20.aClass39_352, local45 }), 33, Static56.aClass39_739, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II[Lclient!a;IIIILclient!a;ZIII)Lclient!a;")
	public static Class1_Sub1_Sub1 method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub1_Sub1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 > arg1 || arg3 < arg5 || arg1 >= arg6 || arg3 >= arg4) {
			return null;
		}
		for (@Pc(33) int local33 = 0; local33 < arg2.length; local33++) {
			@Pc(39) Class1_Sub1_Sub1 local39 = arg2[local33];
			if (local39 != null && local39.anInt102 == arg9 && !Static96.method1613(local39) && local39 != arg7) {
				@Pc(66) int local66 = arg0 + local39.anInt81 - arg8;
				@Pc(74) int local74 = arg5 + local39.anInt110 - arg10;
				if (local39.anInt91 == 0) {
					@Pc(100) Class1_Sub1_Sub1 local100 = method1483(local66, arg1, arg2, arg3, local39.anInt82 + local74, local74, local66 + local39.anInt101, arg7, local39.anInt87, local39.anInt72, local39.anInt95);
					if (local100 != null) {
						return local100;
					}
					if (local39.aClass1_Sub1_Sub1Array1 != null) {
						local100 = method1483(local66, arg1, local39.aClass1_Sub1_Sub1Array1, arg3, local74 + local39.anInt82, local74, local39.anInt101 + local66, arg7, local39.anInt87, local39.anInt72, local39.anInt95);
						if (local100 != null) {
							return local100;
						}
					}
				}
				if (Static4.method76(Static129.method2213(local39)) && arg1 >= local66 && local74 <= arg3 && local39.anInt101 + local66 > arg1 && arg3 < local74 + local39.anInt82) {
					return local39;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1484() {
		aClass39_1072 = null;
		aClass62_26 = null;
		aClass39_1073 = null;
		aClass39_1068 = null;
		aClass39_1075 = null;
		aClass39_1070 = null;
		aClass39_1069 = null;
		aClass31_49 = null;
		aClass39_1071 = null;
		aClass39_1074 = null;
	}
}
