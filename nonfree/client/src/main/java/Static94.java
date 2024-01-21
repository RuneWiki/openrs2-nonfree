import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!ah;")
	public static Class7 aClass7_44;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "J")
	public static long aLong87;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_818 = Static170.method3101("jolt");

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public static int anInt2609 = -1;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!eh;")
	private static Class28 aClass28_819 = Static170.method3101("Unable to connect)3");

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_820 = Static170.method3101("<col=ffb000>");

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_821 = Static170.method3101("sl_flags");

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_822 = aClass28_819;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_823 = aClass28_819;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_824 = Static170.method3101("Fertigkeit)2");

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_825 = Static170.method3101("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method2072() {
		Static57.anIntArray281 = null;
		Static28.anIntArray176 = null;
		Static91.aByteArrayArrayArray44 = null;
		Static172.aByteArrayArrayArray45 = null;
		Static113.anIntArray508 = null;
		Static57.aByteArrayArrayArray11 = null;
		Static48.aByteArrayArrayArray10 = null;
		Static115.anIntArray514 = null;
		Static128.anIntArrayArrayArray36 = null;
		Static107.aByteArrayArrayArray23 = null;
		Static1.anIntArray4 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method2073() {
		aClass28_823 = null;
		aClass28_824 = null;
		aClass28_819 = null;
		aClass28_818 = null;
		aClass28_821 = null;
		aClass28_820 = null;
		aClass28_822 = null;
		aClass28_825 = null;
		aClass7_44 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
	public static void method2074(@OriginalArg(0) int arg0) {
		if (Static48.method1149(arg0)) {
			Static136.method2669(-1, Static42.aClass33ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
	public static void method2075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == Static119.anInt3081 && arg4 == Static19.anInt551 && (arg3 == Static93.anInt2605 || !Static179.aBoolean202)) {
			return;
		}
		Static93.anInt2605 = arg3;
		if (!Static179.aBoolean202) {
			Static93.anInt2605 = 0;
		}
		Static19.anInt551 = arg4;
		Static119.anInt3081 = arg1;
		Static173.method3141(25);
		Static128.method2519(true, Static171.aClass28_1433);
		@Pc(42) int local42 = Static111.anInt2843;
		@Pc(44) int local44 = Static29.anInt907;
		Static29.anInt907 = (arg4 - 6) * 8;
		Static111.anInt2843 = arg1 * 8 - 48;
		@Pc(61) int local61 = Static29.anInt907 - local44;
		@Pc(67) int local67 = Static111.anInt2843 - local42;
		for (@Pc(71) int local71 = 0; local71 < 32768; local71++) {
			@Pc(76) Class3_Sub2_Sub1_Sub2_Sub2 local76 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local71];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray311[local80] -= local67;
					local76.anIntArray314[local80] -= local61;
				}
				local76.anInt1800 -= local67 * 128;
				local76.anInt1792 -= local61 * 128;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < 2048; local123++) {
			@Pc(128) Class3_Sub2_Sub1_Sub2_Sub1 local128 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local123];
			if (local128 != null) {
				for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
					local128.anIntArray311[local132] -= local67;
					local128.anIntArray314[local132] -= local61;
				}
				local128.anInt1800 -= local67 * 128;
				local128.anInt1792 -= local61 * 128;
			}
		}
		@Pc(177) byte local177 = 0;
		Static171.anInt4109 = arg3;
		@Pc(181) byte local181 = 104;
		Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.method1431(arg2, false, arg0);
		@Pc(189) byte local189 = 1;
		if (local67 < 0) {
			local189 = -1;
			local177 = 103;
			local181 = -1;
		}
		@Pc(199) byte local199 = 0;
		@Pc(201) byte local201 = 1;
		@Pc(203) byte local203 = 104;
		if (local61 < 0) {
			local199 = 103;
			local203 = -1;
			local201 = -1;
		}
		for (@Pc(213) int local213 = local177; local213 != local181; local213 += local189) {
			for (@Pc(216) int local216 = local199; local216 != local203; local216 += local201) {
				@Pc(222) int local222 = local213 + local67;
				@Pc(226) int local226 = local61 + local216;
				for (@Pc(228) int local228 = 0; local228 < 4; local228++) {
					if (local222 >= 0 && local226 >= 0 && local222 < 104 && local226 < 104) {
						Static26.aClass23ArrayArrayArray1[local228][local213][local216] = Static26.aClass23ArrayArrayArray1[local228][local222][local226];
					} else {
						Static26.aClass23ArrayArrayArray1[local228][local213][local216] = null;
					}
				}
			}
		}
		for (@Pc(301) Class3_Sub25 local301 = (Class3_Sub25) Static24.aClass23_3.method858(); local301 != null; local301 = (Class3_Sub25) Static24.aClass23_3.method861()) {
			local301.anInt4177 -= local67;
			local301.anInt4168 -= local61;
			if (local301.anInt4177 < 0 || local301.anInt4168 < 0 || local301.anInt4177 >= 104 || local301.anInt4168 >= 104) {
				local301.method3167();
			}
		}
		if (Static21.anInt574 != 0) {
			Static41.anInt1106 -= local61;
			Static21.anInt574 -= local67;
		}
		Static30.anInt957 = 0;
		Static86.anInt2526 = -1;
		Static132.aBoolean160 = false;
		Static33.aClass23_6.method863();
		Static166.aClass23_16.method863();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
	public static boolean method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static92.anIntArrayArrayArray41[arg0][arg1][arg2];
		if (local7 == -Static38.anInt1098) {
			return false;
		} else if (local7 == Static38.anInt1098) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static34.method851(local22 + 1, Static35.anIntArrayArrayArray17[arg0][arg1][arg2], local26 + 1) && Static34.method851(local22 + 128 - 1, Static35.anIntArrayArrayArray17[arg0][arg1 + 1][arg2], local26 + 1) && Static34.method851(local22 + 128 - 1, Static35.anIntArrayArrayArray17[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static34.method851(local22 + 1, Static35.anIntArrayArrayArray17[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static92.anIntArrayArrayArray41[arg0][arg1][arg2] = Static38.anInt1098;
				return true;
			} else {
				Static92.anIntArrayArrayArray41[arg0][arg1][arg2] = -Static38.anInt1098;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ah;III)[Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4[] method2077(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static162.method3012(arg1, arg2, arg0) ? Static133.method2590() : null;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public static void method2078() {
		Static118.aClass9_1.method3007();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Static136.aLongArray5[local12] = 0L;
		}
		for (@Pc(25) int local25 = 0; local25 < 32; local25++) {
			Static150.aLongArray7[local25] = 0L;
		}
		Static167.anInt4074 = 0;
	}
}
