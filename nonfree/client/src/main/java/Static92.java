import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public static int anInt2034;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	public static int anInt2038;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	public static int anInt2040;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString103 = "wave:";

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!wm;)Lclient!ua;")
	public static Class2_Sub1 method1716(@OriginalArg(1) Class2_Sub26 arg0) {
		arg0.method4261();
		@Pc(9) int local9 = arg0.method4261();
		@Pc(17) Class2_Sub1 local17 = Static73.method1362(local9);
		local17.anInt6204 = arg0.method4261();
		@Pc(26) int local26 = arg0.method4261();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(41) int local41 = arg0.method4261();
			local17.method4938(arg0, local41);
		}
		local17.method4934();
		return local17;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method1717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static63.anInt1429 == 1) {
			Static8.aClass2_Sub3_Sub1Array1[Static118.anInt2536 / 100].method4367(Static268.anInt5547 - 8, Static277.anInt5757 + -8);
		}
		if (Static63.anInt1429 == 2) {
			Static8.aClass2_Sub3_Sub1Array1[Static118.anInt2536 / 100 + 4].method4367(Static268.anInt5547 - 8, Static277.anInt5757 + -8);
		}
		Static18.method409();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!oe;B)V")
	public static void method1718(@OriginalArg(0) Class124 arg0) {
		Static183.aClass124_1 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method1720() {
		Static137.aClass46_22.method1079();
		Static144.aClass46_23.method1079();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method1721() {
		@Pc(9) int local9 = Static216.anInt4483 * 128 + 64;
		@Pc(15) int local15 = Static131.anInt2690 * 128 + 64;
		@Pc(24) int local24 = Static99.method1894(Static208.anInt4335, local15, local9) - Static97.anInt2181;
		if (Static62.anInt1380 >= 100) {
			Static271.anInt5632 = Static216.anInt4483 * 128 + 64;
			Static255.anInt5182 = Static131.anInt2690 * 128 + 64;
			Static133.anInt2729 = Static99.method1894(Static208.anInt4335, Static255.anInt5182, Static271.anInt5632) - Static97.anInt2181;
		} else {
			if (Static133.anInt2729 < local24) {
				Static133.anInt2729 += Static62.anInt1380 * (local24 - Static133.anInt2729) / 1000 + Static295.anInt6138;
				if (Static133.anInt2729 > local24) {
					Static133.anInt2729 = local24;
				}
			}
			if (Static271.anInt5632 < local9) {
				Static271.anInt5632 += Static62.anInt1380 * (local9 - Static271.anInt5632) / 1000 + Static295.anInt6138;
				if (Static271.anInt5632 > local9) {
					Static271.anInt5632 = local9;
				}
			}
			if (local9 < Static271.anInt5632) {
				Static271.anInt5632 -= (Static271.anInt5632 - local9) * Static62.anInt1380 / 1000 + Static295.anInt6138;
				if (local9 > Static271.anInt5632) {
					Static271.anInt5632 = local9;
				}
			}
			if (Static255.anInt5182 < local15) {
				Static255.anInt5182 += Static295.anInt6138 + Static62.anInt1380 * (local15 - Static255.anInt5182) / 1000;
				if (local15 < Static255.anInt5182) {
					Static255.anInt5182 = local15;
				}
			}
			if (local15 < Static255.anInt5182) {
				Static255.anInt5182 -= (Static255.anInt5182 - local15) * Static62.anInt1380 / 1000 + Static295.anInt6138;
				if (Static255.anInt5182 < local15) {
					Static255.anInt5182 = local15;
				}
			}
			if (local24 < Static133.anInt2729) {
				Static133.anInt2729 -= Static62.anInt1380 * (Static133.anInt2729 - local24) / 1000 + Static295.anInt6138;
				if (local24 > Static133.anInt2729) {
					Static133.anInt2729 = local24;
				}
			}
		}
		local15 = Static257.anInt5357 * 128 + 64;
		local9 = Static153.anInt3232 * 128 + 64;
		local24 = Static99.method1894(Static208.anInt4335, local15, local9) - Static72.anInt1561;
		@Pc(220) int local220 = local9 - Static271.anInt5632;
		@Pc(225) int local225 = local24 - Static133.anInt2729;
		@Pc(229) int local229 = local15 - Static255.anInt5182;
		@Pc(240) int local240 = (int) Math.sqrt((double) (local229 * local229 + local220 * local220));
		@Pc(251) int local251 = (int) (Math.atan2((double) local225, (double) local240) * 325.949D) & 0x7FF;
		if (local251 < 128) {
			local251 = 128;
		}
		@Pc(269) int local269 = (int) (Math.atan2((double) local220, (double) local229) * -325.949D) & 0x7FF;
		if (local251 > 383) {
			local251 = 383;
		}
		@Pc(279) int local279 = local269 - Static265.anInt5500;
		if (local251 > Static210.anInt4376) {
			Static210.anInt4376 += (local251 - Static210.anInt4376) * Static229.anInt5459 / 1000 + Static88.anInt4713;
			if (local251 < Static210.anInt4376) {
				Static210.anInt4376 = local251;
			}
		}
		if (local279 > 1024) {
			local279 -= 2048;
		}
		if (local279 < -1024) {
			local279 += 2048;
		}
		if (Static210.anInt4376 > local251) {
			Static210.anInt4376 -= Static88.anInt4713 + Static229.anInt5459 * (Static210.anInt4376 - local251) / 1000;
			if (Static210.anInt4376 < local251) {
				Static210.anInt4376 = local251;
			}
		}
		if (local279 > 0) {
			Static265.anInt5500 += Static88.anInt4713 + Static229.anInt5459 * local279 / 1000;
			Static265.anInt5500 &= 0x7FF;
		}
		if (local279 < 0) {
			Static265.anInt5500 -= Static88.anInt4713 + Static229.anInt5459 * -local279 / 1000;
			Static265.anInt5500 &= 0x7FF;
		}
		@Pc(394) int local394 = local269 - Static265.anInt5500;
		if (local394 > 1024) {
			local394 -= 2048;
		}
		if (local394 < -1024) {
			local394 += 2048;
		}
		if (local394 < 0 && local279 > 0 || local394 > 0 && local279 < 0) {
			Static265.anInt5500 = local269;
		}
	}
}
