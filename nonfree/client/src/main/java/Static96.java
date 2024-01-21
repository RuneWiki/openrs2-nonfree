import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_21;

	@OriginalMember(owner = "client!tb", name = "Mb", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!tb", name = "Ob", descriptor = "I")
	public static int anInt2823;

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1180 = Static34.method846("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
	public static int anInt2811 = 255;

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
	public static int anInt2812 = -1;

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "Lclient!le;")
	public static Class36 aClass36_32 = new Class36(10);

	@OriginalMember(owner = "client!tb", name = "Db", descriptor = "[I")
	public static int[] anIntArray263 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1181 = Static34.method846("mapscene");

	@OriginalMember(owner = "client!tb", name = "Ib", descriptor = "[Lclient!sb;")
	public static Class57[] aClass57Array1 = new Class57[4];

	@OriginalMember(owner = "client!tb", name = "Jb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1182 = Static34.method846("Fallen lassen");

	@OriginalMember(owner = "client!tb", name = "Kb", descriptor = "[I")
	public static int[] anIntArray265 = new int[25];

	@OriginalMember(owner = "client!tb", name = "Lb", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!tb", name = "Nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1183 = Static34.method846("Hierhin gehen");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	public static void method1855() {
		@Pc(24) int local24 = Static13.aClass6_Sub1_Sub1_2.method1519(8);
		@Pc(29) int local29;
		if (Static78.anInt2246 > local24) {
			for (local29 = local24; local29 < Static78.anInt2246; local29++) {
				Static56.anIntArray163[Static44.anInt2716++] = Static101.anIntArray283[local29];
			}
		}
		if (Static78.anInt2246 < local24) {
			throw new RuntimeException("gppov1");
		}
		Static78.anInt2246 = 0;
		for (local29 = 0; local29 < local24; local29++) {
			@Pc(67) int local67 = Static101.anIntArray283[local29];
			@Pc(71) Class6_Sub2_Sub3_Sub1_Sub1 local71 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local67];
			@Pc(76) int local76 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
			if (local76 == 0) {
				Static101.anIntArray283[Static78.anInt2246++] = local67;
				local71.anInt2739 = Static85.anInt2389;
			} else {
				@Pc(96) int local96 = Static13.aClass6_Sub1_Sub1_2.method1519(2);
				if (local96 == 0) {
					Static101.anIntArray283[Static78.anInt2246++] = local67;
					local71.anInt2739 = Static85.anInt2389;
					Static102.anIntArray288[Static59.anInt1826++] = local67;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local96 == 1) {
						Static101.anIntArray283[Static78.anInt2246++] = local67;
						local71.anInt2739 = Static85.anInt2389;
						local143 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
						local71.method1831(local143, false);
						local153 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
						if (local153 == 1) {
							Static102.anIntArray288[Static59.anInt1826++] = local67;
						}
					} else if (local96 == 2) {
						Static101.anIntArray283[Static78.anInt2246++] = local67;
						local71.anInt2739 = Static85.anInt2389;
						local143 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
						local71.method1831(local143, true);
						local153 = Static13.aClass6_Sub1_Sub1_2.method1519(3);
						local71.method1831(local153, true);
						@Pc(209) int local209 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
						if (local209 == 1) {
							Static102.anIntArray288[Static59.anInt1826++] = local67;
						}
					} else if (local96 == 3) {
						Static56.anIntArray163[Static44.anInt2716++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Z")
	public static boolean method1856(@OriginalArg(0) int arg0) {
		if (!Static22.method654(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class6_Sub2_Sub14[] local22 = Static9.aClass6_Sub2_Sub14ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class6_Sub2_Sub14 local30 = local22[local24];
			if (local30 != null && local30.anInt2890 == 6) {
				@Pc(57) int local57;
				if (local30.anInt2908 != -1 || local30.anInt2917 != -1) {
					@Pc(52) boolean local52 = Static97.method1869(local30);
					if (local52) {
						local57 = local30.anInt2917;
					} else {
						local57 = local30.anInt2908;
					}
					if (local57 != -1) {
						@Pc(71) Class6_Sub2_Sub13 local71 = Static4.method1608(local57);
						local30.anInt2928 += Static45.anInt1477;
						label52: while (true) {
							do {
								do {
									if (local71.anIntArray261[local30.anInt2927] >= local30.anInt2928) {
										break label52;
									}
									local30.anInt2928 -= local71.anIntArray261[local30.anInt2927];
									local18 = true;
									local30.anInt2927++;
								} while (local71.anIntArray264.length > local30.anInt2927);
								local30.anInt2927 -= local71.anInt2804;
							} while (local30.anInt2927 >= 0 && local71.anIntArray264.length > local30.anInt2927);
							local30.anInt2927 = 0;
						}
					}
				}
				if (local30.anInt2883 != 0 && !local30.aBoolean138) {
					local18 = true;
					local57 = local30.anInt2883 << 16 >> 16;
					local57 *= Static45.anInt1477;
					@Pc(165) int local165 = local30.anInt2883 >> 16;
					local30.anInt2888 = local30.anInt2888 + local57 & 0x7FF;
					@Pc(178) int local178 = local165 * Static45.anInt1477;
					local30.anInt2896 = local30.anInt2896 + local178 & 0x7FF;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!te;)V")
	public static void method1859(@OriginalArg(1) Class6_Sub2_Sub14 arg0) {
		@Pc(16) int local16;
		if (arg0.anInt2920 < 0) {
			local16 = arg0.anInt2880 >> 16;
		} else {
			local16 = arg0.anInt2920 >> 16;
		}
		if (Static1.anInt3 == local16 || Static39.anInt1691 == local16) {
			Static72.aBoolean99 = true;
		}
		if (local16 == Static14.anInt804 || local16 == Static100.anIntArray277[Static112.anInt3228]) {
			Static63.aBoolean89 = true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)I")
	public static int method1865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg1;
			arg1 = arg2;
			arg2 = local10;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg0;
		} else if (local18 == 1) {
			return 7 + 1 - arg3 - arg1;
		} else if (local18 == 2) {
			return 7 + 1 - arg0 - arg2;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1866() {
		aClass55_1180 = null;
		anIntArray263 = null;
		aByteArrayArray8 = null;
		aClass36_32 = null;
		aClass55_1183 = null;
		aClass55_1182 = null;
		anIntArrayArray21 = null;
		aClass57Array1 = null;
		aClass6_Sub2_Sub2_Sub1_21 = null;
		aClass55_1181 = null;
		anIntArray265 = null;
	}
}
