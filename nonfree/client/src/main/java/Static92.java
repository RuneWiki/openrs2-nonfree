import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "[I")
	public static int[] anIntArray159 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "Lclient!ul;")
	public static Class172 aClass172_16 = new Class172(100);

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "Lclient!jo;")
	public static Class86 aClass86_1 = new Class86();

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
	public static int anInt1844 = 0;

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "Lclient!c;")
	public static Class17 aClass17_13 = new Class17();

	@OriginalMember(owner = "client!gj", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString71 = "Allocated memory";

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)I")
	public static int method1526(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)Z")
	public static boolean method1527() {
		try {
			return Static80.method1367();
		} catch (@Pc(14) IOException local14) {
			Static63.method1164();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static138.anInt2729 + "," + Static11.anInt280 + "," + Static185.anInt3683 + " - " + Static31.anInt653 + "," + (Static269.anInt5357 + Static72.aClass13_Sub5_Sub1_1.anIntArray411[0]) + "," + (Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] + Static105.anInt2105) + " - ";
			for (@Pc(62) int local62 = 0; Static31.anInt653 > local62 && local62 < 50; local62++) {
				local60 = local60 + Static256.aClass4_Sub24_Sub1_3.aByteArray47[local62] + ",";
			}
			Static204.method3269(local19, local60);
			Static39.method721();
			return true;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BI)[B")
	public static byte[] method1528(@OriginalArg(0) byte[] arg0) {
		@Pc(18) int local18 = arg0.length;
		@Pc(21) byte[] local21 = new byte[local18];
		Static317.method3199(arg0, 0, local21, 0, local18);
		return local21;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)Lclient!m;")
	public static Class102 method1529(@OriginalArg(1) int arg0) {
		@Pc(10) Class102 local10 = (Class102) Static282.aClass172_45.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static113.aClass22_37.method665(29, arg0);
		local10 = new Class102();
		if (local22 != null) {
			local10.method2608(new Class4_Sub24(local22), arg0);
		}
		Static282.aClass172_45.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!pi;I)V")
	public static void method1530(@OriginalArg(0) Class4_Sub24 arg0) {
		label122: while (true) {
			if (arg0.anInt3822 < arg0.aByteArray47.length) {
				@Pc(13) boolean local13 = false;
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 0;
				if (arg0.method3110() == 1) {
					local15 = arg0.method3110();
					local17 = arg0.method3110();
					local13 = true;
				}
				@Pc(39) int local39 = arg0.method3110();
				@Pc(43) int local43 = arg0.method3110();
				@Pc(50) int local50 = local39 * 64 - Static175.anInt3552;
				@Pc(61) int local61 = Static133.anInt2663 + Static158.anInt3242 - local43 * 64 - 1;
				@Pc(87) int local87;
				@Pc(98) int local98;
				if (local50 >= 0 && local61 - 63 >= 0 && Static207.anInt2141 > local50 + 63 && local61 < Static158.anInt3242) {
					local87 = local50 >> 6;
					local98 = local61 >> 6;
					@Pc(153) int local153 = 0;
					while (true) {
						if (local153 >= 64) {
							continue label122;
						}
						for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
							if (!local13 || local153 >= local15 * 8 && local153 < local15 * 8 + 8 && local17 * 8 <= local158 && local17 * 8 + 8 > local158) {
								@Pc(209) int local209 = arg0.method3110();
								if (local209 != 0) {
									@Pc(222) int local222;
									if ((local209 & 0x1) == 1) {
										local222 = arg0.method3110();
										if (Static138.aByteArrayArrayArray9[local87][local98] == null) {
											Static138.aByteArrayArrayArray9[local87][local98] = new byte[4096];
										}
										Static138.aByteArrayArrayArray9[local87][local98][(63 - local158 << 6) + local153] = (byte) local222;
									}
									if ((local209 & 0x2) == 2) {
										local222 = arg0.method3063();
										if (Static108.anIntArrayArrayArray2[local87][local98] == null) {
											Static108.anIntArrayArrayArray2[local87][local98] = new int[4096];
										}
										Static108.anIntArrayArrayArray2[local87][local98][(63 - local158 << 6) + local153] = local222;
									}
									if ((local209 & 0x4) == 4) {
										local222 = arg0.method3063();
										if (Static243.anIntArrayArrayArray13[local87][local98] == null) {
											Static243.anIntArrayArrayArray13[local87][local98] = new int[4096];
										}
										local222--;
										@Pc(324) Class73 local324 = Static296.method4591(local222);
										if (local324.anIntArray196 != null) {
											local324 = local324.method1899();
											if (local324 == null || local324.anInt2265 == -1) {
												continue;
											}
										}
										Static243.anIntArrayArrayArray13[local87][local98][local153 + (63 - local158 << 6)] = local324.anInt2237 + 1;
										@Pc(359) Class4_Sub16 local359 = new Class4_Sub16();
										local359.anInt1897 = local324.anInt2265;
										local359.anInt1900 = local50;
										local359.anInt1898 = local61;
										Static64.aClass17_9.method619(local359);
									}
								}
							}
						}
						local153++;
					}
				}
				local87 = 0;
				while (true) {
					if ((local13 ? 64 : 4096) <= local87) {
						continue label122;
					}
					local98 = arg0.method3110();
					if (local98 != 0) {
						if ((local98 & 0x1) == 1) {
							arg0.anInt3822++;
						}
						if ((local98 & 0x2) == 2) {
							arg0.anInt3822 += 2;
						}
						if ((local98 & 0x4) == 4) {
							arg0.anInt3822 += 3;
						}
					}
					local87++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg1) {
			Static199.method2423(arg1, arg2, arg5, arg0, arg6, arg3);
		} else if (arg0 - arg1 >= Static173.anInt3481 && arg0 + arg1 <= Static121.anInt2460 && Static293.anInt5688 <= arg3 - arg4 && arg3 + arg4 <= Static100.anInt1982) {
			Static113.method1904(arg3, arg2, arg0, arg5, arg4, arg1, arg6);
		} else {
			Static67.method1179(arg2, arg6, arg0, arg4, arg5, arg3, arg1);
		}
	}
}
