import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!la", name = "U", descriptor = "I")
	public static int anInt2835 = 0;

	@OriginalMember(owner = "client!la", name = "eb", descriptor = "Lclient!f;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_2 = new Class1_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "[I")
	public static int[] anIntArray269 = new int[128];

	@OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
	public static int anInt2845 = 0;

	@OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
	public static int anInt2846 = 0;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(B)V")
	public static void method2112() {
		@Pc(7) Class62 local7 = Static156.aClass62_1;
		synchronized (Static156.aClass62_1) {
			Static31.anInt1007 = Static104.anInt2959;
			@Pc(25) int local25;
			if (Static2.anInt128 < 0) {
				for (local25 = 0; local25 < 112; local25++) {
					Static111.aBooleanArray14[local25] = false;
				}
				Static2.anInt128 = Static75.anInt2275;
			} else {
				while (Static2.anInt128 != Static75.anInt2275) {
					local25 = Static178.anIntArray424[Static75.anInt2275];
					Static75.anInt2275 = Static75.anInt2275 + 1 & 0x7F;
					if (local25 < 0) {
						Static111.aBooleanArray14[~local25] = false;
					} else {
						Static111.aBooleanArray14[local25] = true;
					}
				}
			}
			Static104.anInt2959 = Static119.anInt3255;
		}
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(B)V")
	public static void method2113() {
		anIntArray269 = null;
		aClass1_Sub9_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!ig;IB)V")
	public static void method2114(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(27) Class39 local27 = arg0[local7];
			if (local27 != null && local27.anInt2325 == arg1 && (!local27.aBoolean89 || !Static169.method3347(local27))) {
				if (local27.anInt2342 == 0) {
					if (!local27.aBoolean89 && Static169.method3347(local27) && Static144.aClass39_42 != local27) {
						continue;
					}
					method2114(arg0, local27.anInt2355);
					if (local27.aClass39Array1 != null) {
						method2114(local27.aClass39Array1, local27.anInt2355);
					}
					@Pc(79) Class1_Sub14 local79 = (Class1_Sub14) Static128.aClass30_14.method1467((long) local27.anInt2355);
					if (local79 != null) {
						Static104.method2189(local79.anInt2467);
					}
				}
				if (local27.anInt2342 == 6) {
					@Pc(108) int local108;
					if (local27.anInt2378 != -1 || local27.anInt2331 != -1) {
						@Pc(103) boolean local103 = Static90.method1961(local27);
						if (local103) {
							local108 = local27.anInt2331;
						} else {
							local108 = local27.anInt2378;
						}
						if (local108 != -1) {
							@Pc(120) Class1_Sub1_Sub17 local120 = Static90.method1962(local108);
							local27.anInt2319 += Static72.anInt2243;
							while (local27.anInt2319 > local120.anIntArray370[local27.anInt2357]) {
								local27.anInt2319 -= local120.anIntArray370[local27.anInt2357];
								local27.anInt2357++;
								if (local27.anInt2357 >= local120.anIntArray365.length) {
									local27.anInt2357 -= local120.anInt3869;
									if (local27.anInt2357 < 0 || local27.anInt2357 >= local120.anIntArray365.length) {
										local27.anInt2357 = 0;
									}
								}
								Static171.method3407(local27);
							}
						}
					}
					if (local27.anInt2377 != 0 && !local27.aBoolean89) {
						@Pc(197) int local197 = local27.anInt2377 >> 16;
						local108 = local27.anInt2377 << 16 >> 16;
						@Pc(208) int local208 = local197 * Static72.anInt2243;
						local27.anInt2336 = local208 + local27.anInt2336 & 0x7FF;
						local108 *= Static72.anInt2243;
						local27.anInt2334 = local27.anInt2334 + local108 & 0x7FF;
						Static171.method3407(local27);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[Lclient!oa;III[BI)V")
	public static void method2115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class59[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class1_Sub9 local10 = new Class1_Sub9(arg7);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1244();
			if (local16 == 0) {
				return;
			}
			@Pc(20) int local20 = 0;
			local12 += local16;
			while (true) {
				@Pc(28) int local28 = local10.method1244();
				if (local28 == 0) {
					break;
				}
				local20 += local28 - 1;
				@Pc(45) int local45 = local20 >> 6 & 0x3F;
				@Pc(49) int local49 = local20 >> 12;
				@Pc(53) int local53 = local10.method1234();
				@Pc(57) int local57 = local20 & 0x3F;
				@Pc(61) int local61 = local53 >> 2;
				@Pc(65) int local65 = local53 & 0x3;
				if (local49 == arg6 && local45 >= arg5 && arg5 + 8 > local45 && local57 >= arg0 && local57 < arg0 + 8) {
					@Pc(96) Class1_Sub1_Sub7 local96 = Static176.method3433(local12);
					@Pc(113) int local113 = arg4 + Static14.method366(local96.anInt1818, local57 & 0x7, arg8, local65, local96.anInt1813, local45 & 0x7);
					@Pc(130) int local130 = Static79.method1804(local96.anInt1818, local96.anInt1813, local65, arg8, local45 & 0x7, local57 & 0x7) + arg1;
					if (local113 > 0 && local130 > 0 && local113 < 103 && local130 < 103) {
						@Pc(149) Class59 local149 = null;
						@Pc(151) int local151 = arg2;
						if ((Static20.aByteArrayArrayArray1[1][local113][local130] & 0x2) == 2) {
							local151 = arg2 - 1;
						}
						if (local151 >= 0) {
							local149 = arg3[local151];
						}
						Static75.method1677(local61, local12, arg2, arg8 + local65 & 0x3, local130, local113, local149);
					}
				}
			}
		}
	}
}
