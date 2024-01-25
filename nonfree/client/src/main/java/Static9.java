import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "D", descriptor = "Lclient!ha;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "[Lclient!bia;")
	public static Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	public static int anInt207 = -1;

	@OriginalMember(owner = "client!af", name = "N", descriptor = "Lclient!lw;")
	public static final Class223 aClass223_2 = new Class223(2);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method198(@OriginalArg(0) String arg0) {
		if (!Static285.aBoolean378 || (Static427.anInt7391 & 0x18) == 0) {
			return;
		}
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = Static320.anInt5442;
		@Pc(26) int[] local26 = Static278.anIntArray264;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(36) Class4_Sub2_Sub1_Sub1_Sub1 local36 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local26[local28]];
			if (local36.aString17 != null && local36.aString17.equalsIgnoreCase(arg0) && (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == local36 && (Static427.anInt7391 & 0x10) != 0 || local36 != null && (Static427.anInt7391 & 0x8) != 0)) {
				@Pc(66) Class5_Sub48 local66 = Static16.method232(Static42.aClass46_11, Static276.aClass251_2);
				local66.aClass5_Sub22_Sub1_2.method5904(Static570.anInt9615);
				local66.aClass5_Sub22_Sub1_2.method5918(local26[local28]);
				local66.aClass5_Sub22_Sub1_2.method5949(Static375.anInt6224);
				local66.aClass5_Sub22_Sub1_2.method5904(Static289.anInt5055);
				local66.aClass5_Sub22_Sub1_2.method5938(0);
				Static277.method4436(local66);
				local22 = true;
				Static552.method8051(local36.anIntArray94[0], local36.method1018(), true, local36.method1018(), 0, -2, local36.anIntArray95[0], 0);
				break;
			}
		}
		if (!local22) {
			Static141.method2041(Static174.aClass120_21.method2690(Static266.anInt4796) + arg0);
		}
		if (Static285.aBoolean378) {
			Static420.method6387();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method200(@OriginalArg(0) Class133 arg0) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		if (Static428.aBoolean526) {
			local12 = Static584.method8436();
			local14 = Static88.method1487();
		}
		arg0.KA(local12, local14, local12 + Static345.anInt5827, 350 - -local14);
		arg0.aa(local12, local14, Static345.anInt5827, 350, Static384.anInt6356 << 24 | 0x332277, 1);
		Static562.method5062(local14, local14 + 350, local12 - -Static345.anInt5827, local12);
		@Pc(60) int local60 = 350 / Static86.anInt1721;
		@Pc(72) int local72;
		if (Static260.anInt4710 > 0) {
			local72 = 346 - Static86.anInt1721 - 4;
			@Pc(82) int local82 = local60 * local72 / (local60 + Static260.anInt4710 - 1);
			@Pc(84) int local84 = 4;
			if (Static260.anInt4710 > 1) {
				local84 = (local72 - local82) * (-Static189.anInt10183 + -1 + Static260.anInt4710) / (Static260.anInt4710 - 1) + 4;
			}
			arg0.aa(Static345.anInt5827 + local12 - 16, local14 - -local84, 12, local82, Static384.anInt6356 << 24 | 0x332277, 2);
			for (@Pc(125) int local125 = Static189.anInt10183; local125 < Static189.anInt10183 + local60 && local125 < Static260.anInt4710; local125++) {
				@Pc(134) String[] local134 = Static481.method7093(Static590.aStringArray77[local125], '\b');
				@Pc(143) int local143 = (Static345.anInt5827 - 16 - 8) / local134.length;
				for (@Pc(145) int local145 = 0; local145 < local134.length; local145++) {
					@Pc(154) int local154 = local145 * local143 + 8;
					arg0.KA(local154 + local12, local14, local143 + local154 + local12 - 8, local14 + 350);
					Static281.aClass55_8.method6023(-1, local154 + local12, Static375.method5525(local134[local145]), local14 + 350 - (local125 - Static189.anInt10183) * Static86.anInt1721 - Static199.aClass272_7.anInt7417 - Static437.anInt7509 - 2, -16777216);
				}
			}
		}
		Static602.aClass55_16.method6022("Build: 635", -16777216, Static345.anInt5827 + local12 - 25, -1, -20 + local14 + 350);
		arg0.KA(local12, local14, Static345.anInt5827 + local12, local14 + 350);
		arg0.method7287(Static345.anInt5827, -1, local14 + 350 - Static437.anInt7509, local12);
		Static16.aClass55_1.method6023(-1, local12 + 10, "--> " + Static375.method5525(Static440.aString83), local14 + 350 - Static485.aClass272_16.anInt7417 - 1, -16777216);
		if (!Static311.aBoolean389) {
			return;
		}
		local72 = -1;
		if (Static631.anInt10493 % 30 > 15) {
			local72 = 16777215;
		}
		arg0.method7320(local14 + 350 - Static485.aClass272_16.anInt7417 - 11, local12 + 10 + Static485.aClass272_16.method6570("--> " + Static375.method5525(Static440.aString83).substring(0, Static387.anInt6408)), local72, 12);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!raa;BILclient!aa;IIJI)V")
	public static void method201(@OriginalArg(0) int arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg2 * arg2 + arg4 * arg4;
		if ((long) local14 > arg6) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg1.anInt7957 / 2, arg1.anInt7985 / 2);
		if (local30 * local30 >= local14) {
			Static517.method7655(arg3, arg1, arg0, arg2, Static114.aClass28Array2[arg5], arg7, arg4);
			return;
		}
		local30 -= 10;
		@Pc(52) int local52;
		if (Static254.anInt4612 == 4) {
			local52 = (int) Static311.aFloat95 & 0x3FFF;
		} else {
			local52 = Static2.anInt7 + (int) Static311.aFloat95 & 0x3FFF;
		}
		@Pc(63) int local63 = Class377.anIntArray600[local52];
		@Pc(67) int local67 = Class377.anIntArray601[local52];
		if (Static254.anInt4612 != 4) {
			local63 = local63 * 256 / (Static372.anInt6183 + 256);
			local67 = local67 * 256 / (Static372.anInt6183 + 256);
		}
		@Pc(97) int local97 = local63 * arg4 + local67 * arg2 >> 14;
		@Pc(108) int local108 = arg4 * local67 - local63 * arg2 >> 14;
		@Pc(114) double local114 = Math.atan2((double) local97, (double) local108);
		@Pc(121) int local121 = (int) ((double) local30 * Math.sin(local114));
		@Pc(128) int local128 = (int) ((double) local30 * Math.cos(local114));
		Static351.aClass28Array16[arg5].method4033((float) local121 + (float) arg1.anInt7957 / 2.0F + (float) arg0, (float) arg1.anInt7985 / 2.0F + (float) arg7 - (float) local128, 4096, (int) (-local114 / 6.283185307179586D * 65535.0D));
	}
}
