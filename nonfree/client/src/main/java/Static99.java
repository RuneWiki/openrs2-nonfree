import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_17;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!jd;")
	public static Class37 aClass37_31;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Z")
	public static boolean aBoolean134;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1408 = Static69.method1153("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1403 = aClass64_1408;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1411 = Static69.method1153("Create a free account");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1404 = aClass64_1411;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1405 = Static69.method1153("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1409 = Static69.method1153("Continue");

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1406 = aClass64_1409;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1407 = Static69.method1153("An");

	@OriginalMember(owner = "client!se", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1410 = Static69.method1153("Einloggen");

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt2208 = -1;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[I")
	public static int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1414 = Static69.method1153("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1412 = aClass64_1414;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1413 = Static69.method1153("lila:");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
	public static int method1598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
	public static int method1599(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z")
	public static boolean method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && Static11.anInt425 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static87.anInt1997) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static106.anInt2495 == arg1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1601(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static121.method2103(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static60.aClass28_5.anApplet1 != null) {
				@Pc(109) Class48 local109 = Static60.aClass28_5.method578(new URL(Static60.aClass28_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static94.anInt2135 + "&u=" + Static6.aLong10 + "&v1=" + Static35.aString1 + "&v2=" + Static35.aString2 + "&e=" + local7));
				while (local109.anInt1534 == 0) {
					Static117.method2058(1L);
				}
				if (local109.anInt1534 == 1) {
					@Pc(130) DataInputStream local130 = (DataInputStream) local109.anObject5;
					local130.read();
					local130.close();
				}
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IJ)V")
	public static void method1602(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static106.anInt2498 >= 100 && Static108.anInt2551 != 1 || Static106.anInt2498 >= 200) {
			Static71.method1178(Static60.aClass64_862, Static51.aClass64_762, 0);
			return;
		}
		@Pc(37) Class64 local37 = Static34.method565(arg0).method1478();
		for (@Pc(39) int local39 = 0; local39 < Static106.anInt2498; local39++) {
			if (arg0 == Static14.aLongArray1[local39]) {
				Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { local37, Static7.aClass64_245 }), 0);
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static73.anInt1656; local74++) {
			if (arg0 == Static69.aLongArray5[local74]) {
				Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { Static40.aClass64_608, local37, Static21.aClass64_388 }), 0);
				return;
			}
		}
		if (local37.method1496(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass64_1543)) {
			return;
		}
		Static3.aClass64Array1[Static106.anInt2498] = local37;
		Static14.aLongArray1[Static106.anInt2498] = arg0;
		Static27.anIntArray139[Static106.anInt2498] = 0;
		Static55.anIntArray447[Static106.anInt2498] = 0;
		Static26.anInt762 = Static15.anInt471 + 1;
		Static106.anInt2498++;
		Static19.aBoolean41 = true;
		Static49.aClass1_Sub6_Sub1_1.method1877(238);
		Static49.aClass1_Sub6_Sub1_1.method1830(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1603() {
		aClass64_1409 = null;
		aClass64_1405 = null;
		aClass64_1414 = null;
		aClass64_1412 = null;
		aClass64_1410 = null;
		aClass64_1408 = null;
		aClass37_31 = null;
		aClass64_1413 = null;
		aClass64_1407 = null;
		aClass1_Sub1_Sub5_Sub3_17 = null;
		aClass64_1406 = null;
		aClass64_1411 = null;
		aClass64_1404 = null;
		aClass64_1403 = null;
		anIntArray328 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([BI)[B")
	public static byte[] method1604(@OriginalArg(0) byte[] arg0) {
		@Pc(2) int local2 = arg0.length;
		@Pc(10) byte[] local10 = new byte[local2];
		Static124.method523(arg0, 0, local10, 0, local2);
		return local10;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!nd;Z)Z")
	public static boolean method1605(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		if (Static1.aBoolean3) {
			if (Static31.method548(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1697 == 0) {
				return false;
			}
		}
		return arg0.aBoolean104;
	}
}
