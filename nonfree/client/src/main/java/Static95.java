import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V")
	public static void method2220(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub4_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class60 local8 = Static304.aClass60Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static15.anInt1162; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static198.anInt4128; local15++) {
						local1 = local8.method2274(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class60 local41 = Static304.aClass60Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method2264(local15, local12) - local41.method2264(local15, local12);
									@Pc(67) int local67 = local8.method2264(local15 + 1, local12) - local41.method2264(local15 + 1, local12);
									@Pc(85) int local85 = local8.method2264(local15 + 1, local12 + 1) - local41.method2264(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method2264(local15, local12 + 1) - local41.method2264(local15, local12 + 1);
									local41.method2259(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method2221() {
		Static101.aClass198_251.method5213();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLclient!hl;)I")
	public static int method2222(@OriginalArg(1) Class8_Sub1_Sub2 arg0) {
		if (arg0.anInt4963 == 0) {
			return 0;
		}
		@Pc(38) int local38;
		@Pc(45) int local45;
		if (arg0.anInt4964 != -1 && arg0.anInt4964 < 32768) {
			@Pc(29) Class8_Sub1_Sub2_Sub2 local29 = Static169.aClass8_Sub1_Sub2_Sub2Array1[arg0.anInt4964];
			if (local29 != null) {
				local38 = arg0.anInt6701 - local29.anInt6701;
				local45 = arg0.anInt6702 - local29.anInt6702;
				if (local38 != 0 || local45 != 0) {
					arg0.method4331((int) (Math.atan2((double) local38, (double) local45) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt4964 >= 32768) {
			local73 = arg0.anInt4964 - 32768;
			if (local73 == Static64.anInt1674) {
				local73 = 2047;
			}
			@Pc(82) Class8_Sub1_Sub2_Sub1 local82 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local73];
			if (local82 != null) {
				local45 = arg0.anInt6701 - local82.anInt6701;
				@Pc(97) int local97 = arg0.anInt6702 - local82.anInt6702;
				if (local45 != 0 || local97 != 0) {
					arg0.method4331((int) (Math.atan2((double) local45, (double) local97) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt4942 != 0 || arg0.anInt4915 != 0) && (arg0.anInt4987 == 0 || arg0.anInt4990 > 0)) {
			local73 = arg0.anInt6701 - (arg0.anInt4942 - Static286.anInt6699 - Static286.anInt6699) * 64;
			local38 = arg0.anInt6702 - (arg0.anInt4915 - Static136.anInt3193 - Static136.anInt3193) * 64;
			if (local73 != 0 || local38 != 0) {
				arg0.method4331((int) (Math.atan2((double) local73, (double) local38) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt4915 = 0;
			arg0.anInt4942 = 0;
		}
		return arg0.method4335();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public static void method2223() {
		if (Static8.anInt200 < 0) {
			Static8.anInt200 = 0;
			Static116.anInt2756 = -1;
			Static285.anInt5603 = -1;
		}
		if (Static54.anInt4749 < Static8.anInt200) {
			Static285.anInt5603 = -1;
			Static116.anInt2756 = -1;
			Static8.anInt200 = Static54.anInt4749;
		}
		if (Static60.anInt1574 < 0) {
			Static285.anInt5603 = -1;
			Static116.anInt2756 = -1;
			Static60.anInt1574 = 0;
		}
		if (Static54.anInt4747 < Static60.anInt1574) {
			Static60.anInt1574 = Static54.anInt4747;
			Static116.anInt2756 = -1;
			Static285.anInt5603 = -1;
		}
	}
}
