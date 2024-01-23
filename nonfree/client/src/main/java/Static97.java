import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!fa;")
	public static Class49 aClass49_2;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt2086;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!ui;")
	public static Class175 aClass175_15 = new Class175(100);

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt2087 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZJ)V")
	public static void method1895(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (Static282.anInt5138 >= 100) {
			Static305.method4555(Static59.aString45, "", 0);
			return;
		}
		@Pc(32) String local32 = Static69.method1333(arg1);
		@Pc(34) int local34;
		for (local34 = 0; local34 < Static282.anInt5138; local34++) {
			if (Static86.aLongArray6[local34] == arg1) {
				Static305.method4555(local32 + Static2.aString1, "", 0);
				return;
			}
		}
		for (local34 = 0; local34 < Static144.anInt2798; local34++) {
			if (Static133.aLongArray7[local34] == arg1) {
				Static305.method4555(Static226.aString145 + local32 + Static47.aString35, "", 0);
				return;
			}
		}
		if (local32.equals(Static138.aClass11_Sub4_Sub1_3.aString99)) {
			Static305.method4555(Static194.aString131, "", 0);
			return;
		}
		Static86.aLongArray6[Static282.anInt5138] = arg1;
		Static18.aStringArray3[Static282.anInt5138] = Static138.method3839(arg1);
		Static114.aBooleanArray6[Static282.anInt5138++] = arg0;
		Static105.anInt2227 = Static149.anInt950;
		Static116.aClass1_Sub13_Sub1_48.method1887(65);
		Static116.aClass1_Sub13_Sub1_48.method1857(arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method1896() {
		for (@Pc(13) Class1_Sub20 local13 = (Class1_Sub20) Static224.aClass86_27.method2134(); local13 != null; local13 = (Class1_Sub20) Static224.aClass86_27.method2141()) {
			@Pc(18) int local18 = local13.anInt3422;
			if (Static19.method322(local18)) {
				@Pc(27) Class157[] local27 = Static176.aClass157ArrayArray1[local18];
				@Pc(29) boolean local29 = true;
				@Pc(31) int local31;
				for (local31 = 0; local31 < local27.length; local31++) {
					if (local27[local31] != null) {
						local29 = local27[local31].aBoolean445;
						break;
					}
				}
				if (!local29) {
					local31 = (int) local13.aLong210;
					@Pc(65) Class157 local65 = Static206.method3444(local31);
					if (local65 != null) {
						Static224.method3621(local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg6 && arg2 == arg4 && arg5 == arg8 && arg1 == arg0) {
			Static302.method4527(arg7, arg1, arg2, arg8, arg6);
			return;
		}
		@Pc(27) int local27 = arg6;
		@Pc(29) int local29 = arg2;
		@Pc(33) int local33 = arg6 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(63) int local63 = arg1 + local49 - local53 - arg2;
		@Pc(73) int local73 = local33 + local45 - local41 - local41;
		@Pc(81) int local81 = local37 + local53 - local49 - local49;
		@Pc(91) int local91 = local41 + arg8 - arg6 - local45;
		@Pc(96) int local96 = local49 - local37;
		@Pc(101) int local101 = local41 - local33;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(112) int local112 = local103 * local103 >> 12;
			@Pc(118) int local118 = local103 * local112 >> 12;
			@Pc(122) int local122 = local91 * local118;
			@Pc(126) int local126 = local73 * local112;
			@Pc(130) int local130 = local118 * local63;
			@Pc(134) int local134 = local112 * local81;
			@Pc(138) int local138 = local96 * local103;
			@Pc(142) int local142 = local101 * local103;
			@Pc(153) int local153 = arg2 + (local130 + local134 + local138 >> 12);
			@Pc(165) int local165 = arg6 + (local122 + local126 + local142 >> 12);
			Static302.method4527(arg7, local153, local29, local165, local27);
			local29 = local153;
			local27 = local165;
		}
	}
}
