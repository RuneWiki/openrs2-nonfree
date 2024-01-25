import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static final int anInt1646 = 50;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
	public static final int[] anIntArray129 = new int[anInt1646];

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
	public static final int[] anIntArray130 = new int[anInt1646];

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[anInt1646];

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
	public static final int[] anIntArray131 = new int[anInt1646];

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "[I")
	public static final int[] anIntArray132 = new int[anInt1646];

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
	public static final int[] anIntArray133 = new int[anInt1646];

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
	public static final int[] anIntArray134 = new int[anInt1646];

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
	public static int anInt1656 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public static void method1389() {
		Static112.aClipboard1 = null;
		Static184.anIntArray361 = null;
		Static263.aBooleanArray24 = null;
		Static238.anIntArray454 = null;
		Static221.anIntArray435 = null;
		Static89.aBoolean120 = false;
		Static74.method1295();
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Lclient!rl;")
	public static Class1_Sub2_Sub15 method1390() {
		@Pc(13) Class1_Sub2_Sub15 local13 = (Class1_Sub2_Sub15) Static100.aClass169_4.method4480();
		if (local13 != null) {
			local13.method5796();
			local13.method5784();
			return local13;
		}
		do {
			local13 = (Class1_Sub2_Sub15) Static51.aClass169_2.method4480();
			if (local13 == null) {
				return null;
			}
			if (local13.method4786() > Static292.method5114()) {
				return null;
			}
			local13.method5796();
			local13.method5784();
		} while ((Long.MIN_VALUE & local13.aLong213) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
	public static void method1392() {
		@Pc(14) int local14 = Static42.anInt1138 * 128 + 64;
		@Pc(20) int local20 = Static231.anInt4824 * 128 + 64;
		@Pc(29) int local29 = Static352.method5834(local20, local14, Static127.anInt2487) - Static333.anInt6473;
		if (Static103.anInt1976 < 100) {
			if (Static4.anInt41 < local14) {
				Static4.anInt41 += Static136.anInt2695 + Static103.anInt1976 * (local14 - Static4.anInt41) / 1000;
				if (Static4.anInt41 > local14) {
					Static4.anInt41 = local14;
				}
			}
			if (local14 < Static4.anInt41) {
				Static4.anInt41 -= Static136.anInt2695 + Static103.anInt1976 * (Static4.anInt41 - local14) / 1000;
				if (local14 > Static4.anInt41) {
					Static4.anInt41 = local14;
				}
			}
			if (Static117.anInt2244 < local29) {
				Static117.anInt2244 += Static136.anInt2695 + Static103.anInt1976 * (local29 - Static117.anInt2244) / 1000;
				if (local29 < Static117.anInt2244) {
					Static117.anInt2244 = local29;
				}
			}
			if (local29 < Static117.anInt2244) {
				Static117.anInt2244 -= Static103.anInt1976 * (Static117.anInt2244 - local29) / 1000 + Static136.anInt2695;
				if (local29 > Static117.anInt2244) {
					Static117.anInt2244 = local29;
				}
			}
			if (Static177.anInt3734 < local20) {
				Static177.anInt3734 += Static136.anInt2695 + Static103.anInt1976 * (local20 - Static177.anInt3734) / 1000;
				if (local20 < Static177.anInt3734) {
					Static177.anInt3734 = local20;
				}
			}
			if (Static177.anInt3734 > local20) {
				Static177.anInt3734 -= Static103.anInt1976 * (Static177.anInt3734 - local20) / 1000 + Static136.anInt2695;
				if (Static177.anInt3734 < local20) {
					Static177.anInt3734 = local20;
				}
			}
		} else {
			Static4.anInt41 = Static42.anInt1138 * 128 + 64;
			Static177.anInt3734 = Static231.anInt4824 * 128 + 64;
			Static117.anInt2244 = Static352.method5834(Static177.anInt3734, Static4.anInt41, Static127.anInt2487) - Static333.anInt6473;
		}
		local14 = Static63.anInt2655 * 128 + 64;
		local20 = Static266.anInt5482 * 128 + 64;
		local29 = Static352.method5834(local20, local14, Static127.anInt2487) - Static174.anInt5776;
		@Pc(230) int local230 = local14 - Static4.anInt41;
		@Pc(235) int local235 = local29 - Static117.anInt2244;
		@Pc(240) int local240 = local20 - Static177.anInt3734;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local230 * local230 + local240 * local240));
		@Pc(263) int local263 = (int) (Math.atan2((double) local235, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		@Pc(274) int local274 = (int) (-2607.5945876176133D * Math.atan2((double) local230, (double) local240)) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static338.anInt6530) {
			Static338.anInt6530 += (local263 - Static338.anInt6530 >> 3) * Static324.anInt6407 / 1000 + Static275.anInt5626 << 3;
			if (Static338.anInt6530 > local263) {
				Static338.anInt6530 = local263;
			}
		}
		if (local263 < Static338.anInt6530) {
			Static338.anInt6530 -= Static275.anInt5626 + Static324.anInt6407 * (Static338.anInt6530 - local263 >> 3) / 1000 << 3;
			if (local263 > Static338.anInt6530) {
				Static338.anInt6530 = local263;
			}
		}
		@Pc(354) int local354 = local274 - Static296.anInt5982;
		if (local354 > 8192) {
			local354 -= 16384;
		}
		if (local354 < -8192) {
			local354 += 16384;
		}
		local354 >>= 0x3;
		if (local354 > 0) {
			Static296.anInt5982 += Static324.anInt6407 * local354 / 1000 + Static275.anInt5626 << 3;
			Static296.anInt5982 &= 0x3FFF;
		}
		if (local354 < 0) {
			Static296.anInt5982 -= -local354 * Static324.anInt6407 / 1000 + Static275.anInt5626 << 3;
			Static296.anInt5982 &= 0x3FFF;
		}
		@Pc(414) int local414 = local274 - Static296.anInt5982;
		if (local414 > 8192) {
			local414 -= 16384;
		}
		if (local414 < -8192) {
			local414 += 16384;
		}
		if (local414 < 0 && local354 > 0 || local414 > 0 && local354 < 0) {
			Static296.anInt5982 = local274;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	public static void method1394() {
		@Pc(5) Class37 local5 = Static246.aClass37_80;
		synchronized (Static246.aClass37_80) {
			Static246.aClass37_80.method914();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIII)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg0; local3 <= arg4; local3++) {
			Static244.method5351(arg1, arg2, Static319.anIntArrayArray31[local3], arg3);
		}
	}
}
