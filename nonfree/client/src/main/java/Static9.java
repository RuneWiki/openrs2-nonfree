import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "y", descriptor = "Lclient!ds;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!aea", name = "G", descriptor = "Lclient!tt;")
	public static Class313 aClass313_1;

	@OriginalMember(owner = "client!aea", name = "H", descriptor = "Lclient!aca;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "Lclient!cc;")
	public static final Class45 aClass45_1 = new Class45("LOCAL", 4);

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_3 = new Class316(27, 16);

	@OriginalMember(owner = "client!aea", name = "B", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aea", name = "F", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!aea", name = "I", descriptor = "[I")
	public static final int[] anIntArray6 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZLclient!kw;Z)V")
	public static void method125(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class15_Sub2_Sub4_Sub1 arg1) {
		if (Static384.anInt7048 >= 400) {
			return;
		}
		@Pc(14) Class88 local14 = arg1.aClass88_1;
		if (local14.anIntArray182 != null) {
			local14 = local14.method1940(Static65.aClass51_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean142) {
			return;
		}
		@Pc(32) String local32 = local14.aString15;
		if (local14.anInt2173 != 0) {
			@Pc(48) String local48 = Static172.aClass68_4 == Static14.aClass68_6 ? Static146.aClass103_77.method2355(Static188.anInt28) : Static146.aClass103_75.method2355(Static188.anInt28);
			local32 = local32 + Static464.method6494(local14.anInt2173, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001) + " (" + local48 + local14.anInt2173 + ")";
		}
		if (Static540.aBoolean580 && !arg0) {
			@Pc(85) Class348 local85 = Static544.anInt7475 == -1 ? null : Static111.aClass259_1.method5915(Static544.anInt7475);
			if ((Static243.anInt4471 & 0x2) != 0 && (local85 == null || local14.method1949(Static544.anInt7475, local85.anInt9885) != local85.anInt9885)) {
				Static133.method2173(Static185.aString34 + " -> <col=ffff00>" + local32, 0, 44, -1, 0, (long) arg1.anInt8924, Static291.anInt5333, true, Static195.aString36, false);
			}
		}
		if (!arg0) {
			@Pc(135) String[] local135 = local14.aStringArray10;
			if (Static352.aBoolean456) {
				local135 = Static279.method4194(local135);
			}
			@Pc(145) int local145;
			if (local135 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local135[local145] != null && (local14.aByte17 == 0 || !local135[local145].equalsIgnoreCase(Static146.aClass103_70.method2355(Static188.anInt28)))) {
						@Pc(168) byte local168 = 0;
						@Pc(170) int local170 = Static536.anInt9207;
						if (local145 == 0) {
							local168 = 11;
						}
						if (local145 == 1) {
							local168 = 19;
						}
						if (local145 == 2) {
							local168 = 2;
						}
						if (local145 == 3) {
							local168 = 25;
						}
						if (local145 == 4) {
							local168 = 59;
						}
						if (local14.anInt2166 == local145) {
							local170 = local14.anInt2141;
						}
						if (local14.anInt2170 == local145) {
							local170 = local14.anInt2148;
						}
						Static133.method2173("<col=ffff00>" + local32, 0, local168, -1, 0, (long) arg1.anInt8924, local135[local145].equalsIgnoreCase(Static146.aClass103_70.method2355(Static188.anInt28)) ? local14.anInt2143 : local170, true, local135[local145], false);
					}
				}
			}
			if (local14.aByte17 == 1 && local135 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local135[local145] != null && local135[local145].equalsIgnoreCase(Static146.aClass103_70.method2355(Static188.anInt28))) {
						@Pc(279) short local279 = 0;
						if (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001 < local14.anInt2173) {
							local279 = 2000;
						}
						@Pc(292) short local292 = 0;
						if (local145 == 0) {
							local292 = 11;
						}
						if (local145 == 1) {
							local292 = 19;
						}
						if (local145 == 2) {
							local292 = 2;
						}
						if (local145 == 3) {
							local292 = 25;
						}
						if (local145 == 4) {
							local292 = 59;
						}
						if (local292 != 0) {
							local292 += local279;
						}
						Static133.method2173("<col=ffff00>" + local32, 0, local292, -1, 0, (long) arg1.anInt8924, local14.anInt2143, true, local135[local145], false);
					}
				}
			}
		}
		Static133.method2173("<col=ffff00>" + local32, 0, 1004, -1, 0, (long) arg1.anInt8924, Static563.anInt9783, true, Static146.aClass103_69.method2355(Static188.anInt28), arg0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZBLjava/lang/String;)V")
	public static void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		Static529.method7821(arg2, arg0, arg3, arg1, null, false);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	public static void method130() {
		Static534.method7063(Static465.aClass316_107);
		Static340.aClass6_Sub12_Sub2_1.method6032(Static132.anInt2509);
	}
}
