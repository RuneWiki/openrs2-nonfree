import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "Lclient!pc;")
	public static Class12 aClass12_71;

	@OriginalMember(owner = "client!rc", name = "mb", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_43;

	@OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_44;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "Lclient!fc;")
	public static Class21 aClass21_29 = new Class21(64);

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1171 = Static87.method1648("cyan:");

	@OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
	public static int anInt2496 = 0;

	@OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
	public static int anInt2497 = 0;

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "[Lclient!wd;")
	public static Class3_Sub11[] aClass3_Sub11Array1 = new Class3_Sub11[2048];

	@OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1172 = aClass27_1171;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	public static void method1708() {
		aClass21_29 = null;
		aClass27_1172 = null;
		aClass3_Sub11Array1 = null;
		aClass27_1171 = null;
		aClass54_Sub1_44 = null;
		aClass54_Sub1_43 = null;
		aClass12_71 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!td;)Z")
	public static boolean method1709(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1) {
		@Pc(4) byte[] local4 = arg1.method1617(arg0);
		if (local4 == null) {
			return false;
		} else {
			Static43.method899(local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public static void method1712() {
		Static97.aClass21_28.method663();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZ)V")
	public static void method1713(@OriginalArg(1) boolean arg0) {
		if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 >> 7 == Static77.anInt2150 && Static97.anInt2290 == Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 >> 7) {
			Static77.anInt2150 = 0;
		}
		@Pc(29) int local29 = Static104.anInt2718;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(43) int local43 = 0; local43 < local29; local43++) {
			@Pc(59) Class3_Sub3_Sub1_Sub4_Sub2 local59;
			@Pc(53) int local53;
			if (arg0) {
				local59 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1;
				local53 = 33538048;
			} else {
				local53 = Static99.anIntArray387[local43] << 14;
				local59 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local43]];
			}
			if (local59 != null && local59.method1679()) {
				@Pc(76) int local76 = local59.anInt2408 >> 7;
				local59.aBoolean119 = false;
				if ((Static70.aBoolean94 && Static104.anInt2718 > 50 || Static104.anInt2718 > 200) && !arg0 && local59.anInt2390 == local59.anInt2410) {
					local59.aBoolean119 = true;
				}
				@Pc(104) int local104 = local59.anInt2399 >> 7;
				if (local76 >= 0 && local76 < 104 && local104 >= 0 && local104 < 104) {
					if (local59.aClass3_Sub3_Sub1_Sub1_3 == null || Static2.anInt38 < local59.anInt2444 || local59.anInt2457 <= Static2.anInt38) {
						if ((local59.anInt2408 & 0x7F) == 64 && (local59.anInt2399 & 0x7F) == 64) {
							if (Static62.anIntArrayArray45[local76][local104] == Static31.anInt803) {
								continue;
							}
							Static62.anIntArrayArray45[local76][local104] = Static31.anInt803;
						}
						local59.anInt2454 = Static48.method1675(local59.anInt2399, Static68.anInt1747, local59.anInt2408);
						Static76.aClass18_1.method516(Static68.anInt1747, local59.anInt2408, local59.anInt2399, local59.anInt2454, 60, local59, local59.anInt2432, local53, local59.aBoolean118);
					} else {
						local59.aBoolean119 = false;
						local59.anInt2454 = Static48.method1675(local59.anInt2399, Static68.anInt1747, local59.anInt2408);
						Static76.aClass18_1.method512(Static68.anInt1747, local59.anInt2408, local59.anInt2399, local59.anInt2454, local59, local59.anInt2432, local53, local59.anInt2440, local59.anInt2450, local59.anInt2449, local59.anInt2453);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
	public static void method1714() {
		if (Static49.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static59.anIntArray256[186] = 57;
			Static59.anIntArray256[187] = 27;
			Static59.anIntArray256[188] = 71;
			Static59.anIntArray256[189] = 26;
			Static59.anIntArray256[190] = 72;
			Static59.anIntArray256[191] = 73;
			Static59.anIntArray256[192] = 58;
			Static59.anIntArray256[219] = 42;
			Static59.anIntArray256[220] = 74;
			Static59.anIntArray256[221] = 43;
			Static59.anIntArray256[222] = 59;
			Static59.anIntArray256[223] = 28;
			return;
		}
		Static59.anIntArray256[44] = 71;
		Static59.anIntArray256[45] = 26;
		Static59.anIntArray256[46] = 72;
		Static59.anIntArray256[47] = 73;
		Static59.anIntArray256[59] = 57;
		Static59.anIntArray256[61] = 27;
		Static59.anIntArray256[91] = 42;
		Static59.anIntArray256[92] = 74;
		Static59.anIntArray256[93] = 43;
		if (Static49.aMethod1 == null) {
			Static59.anIntArray256[192] = 58;
			Static59.anIntArray256[222] = 59;
		} else {
			Static59.anIntArray256[192] = 28;
			Static59.anIntArray256[222] = 58;
			Static59.anIntArray256[520] = 59;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BB)I")
	public static int method1715(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static87.method1642(0, arg0, arg1);
	}
}
