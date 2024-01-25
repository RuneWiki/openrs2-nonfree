import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "Lclient!tq;")
	public static Class191 aClass191_61;

	@OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method2131(@OriginalArg(0) Class191 arg0) {
		Static274.aClass191_180 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!qk;)V")
	public static void method2136(@OriginalArg(0) Class2_Sub36_Sub1 arg0) {
		if (Static350.anInt6740 >= 255) {
			return;
		}
		Static288.aClass2_Sub36_Sub1Array7[Static350.anInt6740] = arg0;
		Static99.aBooleanArray10[Static350.anInt6740] = false;
		Static350.anInt6740++;
		@Pc(18) int local18 = arg0.anInt5129;
		if (arg0.aBoolean468) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt5129;
		if (arg0.aBoolean467) {
			local26 = Static37.anInt696 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt5115 + 64 - arg0.anInt5108 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt5115 + arg0.anInt5108 - 64 >> 7;
			if (local66 >= Static160.anInt3244) {
				local66 = Static160.anInt3244 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray77[local38++];
				@Pc(96) int local96 = (arg0.anInt5111 + 64 - arg0.anInt5108 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static223.anInt4280) {
					local104 = Static223.anInt4280 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static99.anIntArrayArrayArray2[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static99.anIntArrayArrayArray2[local35][local117][local75] = local126 | Static350.anInt6740;
					} else if ((local126 & 0xFF00) == 0) {
						Static99.anIntArrayArrayArray2[local35][local117][local75] = local126 | Static350.anInt6740 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static99.anIntArrayArrayArray2[local35][local117][local75] = local126 | Static350.anInt6740 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static99.anIntArrayArrayArray2[local35][local117][local75] = local126 | Static350.anInt6740 << 24;
					}
				}
			}
		}
	}
}
