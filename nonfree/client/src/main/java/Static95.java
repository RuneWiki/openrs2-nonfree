import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ta", name = "gd", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1168 = Static34.method846("*6n");

	@OriginalMember(owner = "client!ta", name = "id", descriptor = "[I")
	public static int[] anIntArray259 = new int[50];

	@OriginalMember(owner = "client!ta", name = "kd", descriptor = "I")
	public static int anInt2763 = 0;

	@OriginalMember(owner = "client!ta", name = "od", descriptor = "I")
	public static volatile int anInt2767 = 0;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(I)Lclient!ic;")
	public static Class19 method1835() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class19_Sub2();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method1836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class6_Sub13 local12 = (Class6_Sub13) Static12.aClass38_8.method1183((long) arg2);
		if (local12 == null) {
			local12 = new Class6_Sub13();
			Static12.aClass38_8.method1184(local12, (long) arg2);
		}
		if (local12.anIntArray275.length <= arg1) {
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(43) int[] local43 = new int[arg1 + 1];
			for (@Pc(45) int local45 = 0; local45 < local12.anIntArray275.length; local45++) {
				local38[local45] = local12.anIntArray275[local45];
				local43[local45] = local12.anIntArray274[local45];
			}
			for (@Pc(71) int local71 = local12.anIntArray275.length; local71 < arg1; local71++) {
				local38[local71] = -1;
				local43[local71] = 0;
			}
			local12.anIntArray275 = local38;
			local12.anIntArray274 = local43;
		}
		local12.anIntArray275[arg1] = arg3;
		local12.anIntArray274[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(I)V")
	public static void method1837() {
		aClass55_1168 = null;
		anIntArray259 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!cb;II)V")
	public static void method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub3_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		if (arg2 == Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1 || Static94.anInt2645 >= 400) {
			return;
		}
		@Pc(49) Class55 local49;
		if (arg2.anInt685 == 0) {
			local49 = Static89.method1698(new Class55[] { arg2.aClass55_245, Static67.method1363(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt679, arg2.anInt679), Static110.aClass55_1320, Static70.aClass55_825, Static58.method1196(arg2.anInt679), Static10.aClass55_248 });
		} else {
			local49 = Static89.method1698(new Class55[] { arg2.aClass55_245, Static110.aClass55_1320, Static35.aClass55_522, Static58.method1196(arg2.anInt685), Static10.aClass55_248 });
		}
		@Pc(162) int local162;
		if (Static43.anInt1463 == 1) {
			Static86.method1643(43, arg0, arg3, Static89.method1698(new Class55[] { Static22.aClass55_370, Static56.aClass55_670, local49 }), Static34.aClass55_513, arg1);
		} else if (Static102.anInt3029 != 1) {
			for (local162 = 4; local162 >= 0; local162--) {
				if (Static74.aClass55Array15[local162] != null) {
					@Pc(170) short local170 = 0;
					@Pc(172) int local172 = 0;
					if (Static74.aClass55Array15[local162].method1642(Static33.aClass55_482)) {
						if (arg2.anInt679 > Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt679) {
							local170 = 2000;
						}
						if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt677 != 0 && arg2.anInt677 != 0) {
							if (arg2.anInt677 == Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt677) {
								local170 = 2000;
							} else {
								local170 = 0;
							}
						}
					} else if (Static71.aBooleanArray9[local162]) {
						local170 = 2000;
					}
					if (local162 == 0) {
						local172 = local170 + 20;
					}
					if (local162 == 1) {
						local172 = local170 + 21;
					}
					if (local162 == 2) {
						local172 = local170 + 6;
					}
					if (local162 == 3) {
						local172 = local170 + 33;
					}
					if (local162 == 4) {
						local172 = local170 + 31;
					}
					Static86.method1643(local172, arg0, arg3, Static89.method1698(new Class55[] { Static72.aClass55_862, local49 }), Static74.aClass55Array15[local162], arg1);
				}
			}
		} else if ((Static66.anInt1971 & 0x8) == 8) {
			Static86.method1643(39, arg0, arg3, Static89.method1698(new Class55[] { Static86.aClass55_1000, Static56.aClass55_670, local49 }), Static66.aClass55_780, arg1);
		}
		for (local162 = 0; local162 < Static94.anInt2645; local162++) {
			if (Static10.anIntArray43[local162] == 4) {
				Static76.aClass55Array20[local162] = Static89.method1698(new Class55[] { Static72.aClass55_864, Static52.aClass55_637, Static72.aClass55_862, local49 });
				return;
			}
		}
	}
}
