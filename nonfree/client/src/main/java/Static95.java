import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
	public static int anInt2518;

	@OriginalMember(owner = "client!sc", name = "ub", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!sc", name = "wb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1207 = Static14.method2017("Choose Option");

	@OriginalMember(owner = "client!sc", name = "zb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1208 = Static14.method2017("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!sc", name = "Eb", descriptor = "[Lclient!je;")
	public static Class3_Sub1[] aClass3_Sub1Array1 = new Class3_Sub1[256];

	@OriginalMember(owner = "client!sc", name = "Fb", descriptor = "I")
	public static int anInt2530 = -1;

	@OriginalMember(owner = "client!sc", name = "Gb", descriptor = "I")
	public static volatile int anInt2531 = 0;

	@OriginalMember(owner = "client!sc", name = "Hb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1209 = Static14.method2017("@cr1@");

	@OriginalMember(owner = "client!sc", name = "Lb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1210 = aClass36_1207;

	@OriginalMember(owner = "client!sc", name = "Mb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1211 = aClass36_1208;

	@OriginalMember(owner = "client!sc", name = "Nb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1212 = Static14.method2017("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!hd;I)V")
	public static void method1787(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub2 arg1) {
		if (arg1.anInt2204 < 128 || arg1.anInt2149 < 128 || arg1.anInt2204 >= 13184 || arg1.anInt2149 >= 13184) {
			arg1.anInt2165 = 0;
			arg1.anInt2168 = -1;
			arg1.anInt2188 = 0;
			arg1.anInt2204 = arg1.anIntArray252[0] * 128 + arg1.anInt2163 * 64;
			arg1.anInt2152 = -1;
			arg1.anInt2149 = arg1.anIntArray258[0] * 128 + arg1.anInt2163 * 64;
			arg1.method1553();
		}
		if (arg1 == Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3 && (arg1.anInt2204 < 1536 || arg1.anInt2149 < 1536 || arg1.anInt2204 >= 11776 || arg1.anInt2149 >= 11776)) {
			arg1.anInt2149 = arg1.anIntArray258[0] * 128 + arg1.anInt2163 * 64;
			arg1.anInt2152 = -1;
			arg1.anInt2188 = 0;
			arg1.anInt2204 = arg1.anIntArray252[0] * 128 + arg1.anInt2163 * 64;
			arg1.anInt2168 = -1;
			arg1.anInt2165 = 0;
			arg1.method1553();
		}
		if (arg1.anInt2165 > Static113.anInt2952) {
			Static92.method1674(arg1);
		} else if (Static113.anInt2952 > arg1.anInt2188) {
			Static59.method1105(arg1);
		} else {
			Static27.method568(arg1);
		}
		Static16.method291(arg1);
		Static66.method1159(arg1);
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
	public static void method1788() {
		aClass36_1208 = null;
		aClass3_Sub1Array1 = null;
		aClass36_1207 = null;
		aClass36_1210 = null;
		aClass36_1209 = null;
		aClass36_1212 = null;
		aClass36_1211 = null;
	}

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)V")
	public static void method1789() {
		@Pc(7) int local7 = Static77.anInt2023;
		@Pc(9) int local9 = Static94.anInt2475;
		@Pc(11) int local11 = Static61.anInt1612;
		@Pc(13) int local13 = anInt2518;
		Static54.method1591(local11, local7, local9, local13, 6116423);
		Static54.method1591(local11 + 1, local7 + 1, local9 - 2, 16, 0);
		Static54.method1583(local11 + 1, local7 - -18, local9 - 2, local13 + -19, 0);
		Static97.aClass2_Sub1_Sub1_Sub2_4.method456(aClass36_1210, local11 + 3, local7 - -14, 6116423);
		@Pc(59) int local59 = Static64.anInt1640;
		@Pc(61) int local61 = Static115.anInt1789;
		if (Static24.anInt620 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static24.anInt620 == 1) {
			local59 -= 205;
			local61 -= 553;
		}
		if (Static24.anInt620 == 2) {
			local59 -= 357;
			local61 -= 17;
		}
		for (@Pc(80) int local80 = 0; local80 < Static43.anInt1141; local80++) {
			@Pc(95) int local95 = local7 + (Static43.anInt1141 - local80 - 1) * 15 + 31;
			@Pc(97) int local97 = 16777215;
			if (local61 > local11 && local9 + local11 > local61 && local59 > local95 - 13 && local95 + 3 > local59) {
				local97 = 16776960;
			}
			Static97.aClass2_Sub1_Sub1_Sub2_4.method475(Static90.aClass36Array40[local80], local11 + 3, local95, local97, true);
		}
	}
}
