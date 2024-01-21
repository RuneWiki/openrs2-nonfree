import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1213 = Static33.method650("Please try again)3");

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1210 = aClass56_1213;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1211 = Static33.method650(" weitere Optionen");

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1212 = Static33.method650(" )2> @yel@");

	@OriginalMember(owner = "client!od", name = "h", descriptor = "[I")
	public static int[] anIntArray191 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZZIZ)Lclient!kd;")
	public static Class44_Sub1 method1507(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class80 local6 = null;
		if (Static66.aClass65_2 != null) {
			local6 = new Class80(arg2, Static66.aClass65_2, Static11.aClass65Array1[arg2], 1000000);
		}
		return new Class44_Sub1(local6, Static15.aClass80_1, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!qd;")
	public static Class3_Sub1_Sub13 method1508(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub1_Sub13 local18 = (Class3_Sub1_Sub13) Static31.aClass52_20.method1342((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static17.aClass44_9.method1146(14, arg0);
		local18 = new Class3_Sub1_Sub13();
		if (local28 != null) {
			local18.method1661(new Class3_Sub2(local28));
		}
		Static31.aClass52_20.method1344(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1509() {
		while (true) {
			if (Static31.aClass3_Sub2_Sub1_3.method326(Static73.anInt2013) >= 27) {
				@Pc(18) int local18 = Static31.aClass3_Sub2_Sub1_3.method323(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local18] == null) {
						Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local18] = new Class3_Sub1_Sub2_Sub4_Sub2();
						local23 = true;
					}
					@Pc(39) Class3_Sub1_Sub2_Sub4_Sub2 local39 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local18];
					Static75.anIntArray176[Static109.anInt1678++] = local18;
					local39.anInt3147 = Static98.anInt2566;
					@Pc(55) int local55 = Static31.aClass3_Sub2_Sub1_3.method323(1);
					local39.aClass3_Sub1_Sub17_1 = Static9.method177(Static31.aClass3_Sub2_Sub1_3.method323(13));
					@Pc(70) int local70 = Static8.anIntArray8[Static31.aClass3_Sub2_Sub1_3.method323(3)];
					if (local23) {
						local39.anInt3156 = local70;
					}
					@Pc(80) int local80 = Static31.aClass3_Sub2_Sub1_3.method323(5);
					if (local80 > 15) {
						local80 -= 32;
					}
					@Pc(89) int local89 = Static31.aClass3_Sub2_Sub1_3.method323(5);
					@Pc(94) int local94 = Static31.aClass3_Sub2_Sub1_3.method323(1);
					if (local89 > 15) {
						local89 -= 32;
					}
					if (local94 == 1) {
						Static79.anIntArray186[Static60.anInt1776++] = local18;
					}
					local39.anInt3190 = local39.aClass3_Sub1_Sub17_1.anInt2927;
					local39.anInt3153 = local39.aClass3_Sub1_Sub17_1.anInt2920;
					local39.anInt3174 = local39.aClass3_Sub1_Sub17_1.anInt2931;
					local39.anInt3154 = local39.aClass3_Sub1_Sub17_1.anInt2937;
					local39.anInt3160 = local39.aClass3_Sub1_Sub17_1.anInt2919;
					local39.anInt3162 = local39.aClass3_Sub1_Sub17_1.anInt2915;
					local39.anInt3188 = local39.aClass3_Sub1_Sub17_1.anInt2944;
					if (local39.anInt3188 == 0) {
						local39.anInt3156 = 0;
					}
					local39.anInt3164 = local39.aClass3_Sub1_Sub17_1.anInt2921;
					local39.anInt3176 = local39.aClass3_Sub1_Sub17_1.anInt2938;
					local39.method2031(local55 == 1, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0] + local80, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0] + local89);
					continue;
				}
			}
			Static31.aClass3_Sub2_Sub1_3.method318();
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1510() {
		for (@Pc(7) int local7 = -1; local7 < Static110.anInt2767; local7++) {
			@Pc(15) int local15;
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static54.anIntArray108[local7];
			}
			@Pc(25) Class3_Sub1_Sub2_Sub4_Sub1 local25 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local15];
			if (local25 != null) {
				Static8.method171(local25, 1);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1511() {
		anIntArray191 = null;
		aClass56_1210 = null;
		aClass56_1212 = null;
		aClass56_1211 = null;
		aClass56_1213 = null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public static void method1512() {
		for (@Pc(10) Class3_Sub6 local10 = (Class3_Sub6) Static67.aClass37_11.method989(); local10 != null; local10 = (Class3_Sub6) Static67.aClass37_11.method990()) {
			if (local10.anInt947 > 0) {
				local10.anInt947--;
			}
			if (local10.anInt947 != 0) {
				if (local10.anInt949 > 0) {
					local10.anInt949--;
				}
				if (local10.anInt949 == 0 && local10.anInt943 >= 1 && local10.anInt954 >= 1 && local10.anInt943 <= 102 && local10.anInt954 <= 102 && (local10.anInt950 < 0 || Static57.method1081(local10.anInt945, local10.anInt950))) {
					Static57.method1074(local10.anInt943, local10.anInt942, local10.anInt954, local10.anInt955, local10.anInt945, local10.anInt958, local10.anInt950);
					local10.anInt949 = -1;
					if (local10.anInt959 == local10.anInt950 && local10.anInt959 == -1) {
						local10.method2055();
					} else if (local10.anInt950 == local10.anInt959 && local10.anInt957 == local10.anInt955 && local10.anInt946 == local10.anInt945) {
						local10.method2055();
					}
				}
			} else if (local10.anInt959 < 0 || Static57.method1081(local10.anInt946, local10.anInt959)) {
				Static57.method1074(local10.anInt943, local10.anInt942, local10.anInt954, local10.anInt957, local10.anInt946, local10.anInt958, local10.anInt959);
				local10.method2055();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method1513() {
		Static102.aFontMetrics56 = null;
		Static31.aFont1 = null;
		Static75.anImage4 = null;
	}
}
