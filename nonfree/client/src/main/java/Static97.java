import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "Lclient!du;")
	public static final Class79 aClass79_2 = new Class79("LIVE", 0);

	@OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
	public static int anInt1562 = 0;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!kda;I)I")
	public static int method1427(@OriginalArg(0) Class168 arg0) {
		if (arg0 == Static146.aClass168_1) {
			return 9216;
		} else if (arg0 == Static464.aClass168_4) {
			return 34065;
		} else if (Static240.aClass168_2 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBLclient!tfa;FIFFIFFI)[B")
	public static byte[] method1428(@OriginalArg(2) Class306 arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static308.method4621(arg3, arg5, arg0, local15, arg4, 0, arg2, arg1);
		return local15;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method1429(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static195.method3297(arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static263.method4002(arg1, arg0) | (arg1 & 0x70000) != 0 || Static404.method5832(arg1, arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLclient!uea;)V")
	public static void method1431(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15_Sub2_Sub4_Sub2 arg1) {
		if (Static384.anInt7048 >= 400) {
			return;
		}
		if (Static461.aClass15_Sub2_Sub4_Sub2_2 != arg1) {
			@Pc(88) String local88;
			@Pc(143) int local143;
			if (arg1.anInt9009 == 0) {
				@Pc(99) boolean local99 = true;
				if (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9028 != -1 && arg1.anInt9028 != -1) {
					@Pc(118) int local118 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001 > arg1.anInt9001 ? Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001 : arg1.anInt9001;
					@Pc(133) int local133 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9028 < arg1.anInt9028 ? Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9028 : arg1.anInt9028;
					local143 = local133 + local118 * 10 / 100 + 5;
					@Pc(150) int local150 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001 - arg1.anInt9001;
					if (local150 < 0) {
						local150 = -local150;
					}
					if (local143 < local150) {
						local99 = false;
					}
				}
				@Pc(173) String local173 = Static14.aClass68_6 == Static172.aClass68_4 ? Static146.aClass103_77.method2355(Static188.anInt28) : Static146.aClass103_75.method2355(Static188.anInt28);
				if (arg1.anInt9021 > arg1.anInt9001) {
					local88 = arg1.method7145() + (local99 ? Static464.method6494(arg1.anInt9001, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001) : "<col=ffffff>") + " (" + local173 + arg1.anInt9001 + "+" + (arg1.anInt9021 - arg1.anInt9001) + ")";
				} else {
					local88 = arg1.method7145() + (local99 ? Static464.method6494(arg1.anInt9001, Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001) : "<col=ffffff>") + " (" + local173 + arg1.anInt9001 + ")";
				}
			} else if (arg1.anInt9009 == -1) {
				local88 = arg1.method7145();
			} else {
				local88 = arg1.method7145() + " (" + Static146.aClass103_76.method2355(Static188.anInt28) + arg1.anInt9009 + ")";
			}
			if (Static540.aBoolean580 && !arg0 && (Static243.anInt4471 & 0x8) != 0) {
				Static133.method2173(Static185.aString34 + " -> <col=ffffff>" + local88, 0, 10, -1, 0, (long) arg1.anInt8924, Static291.anInt5333, true, Static195.aString36, false);
			}
			if (arg0) {
				Static133.method2173("", 0, -1, 0, 0, 0L, -1, false, "<col=cccccc>" + local88, true);
			} else {
				for (@Pc(295) int local295 = 7; local295 >= 0; local295--) {
					if (Static423.aStringArray34[local295] != null) {
						@Pc(303) short local303 = 0;
						if (Static126.aClass68_3 == Static172.aClass68_4 && Static423.aStringArray34[local295].equalsIgnoreCase(Static146.aClass103_70.method2355(Static188.anInt28))) {
							if (arg1.anInt9001 > Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9001) {
								local303 = 2000;
							}
							if (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9031 != 0 && arg1.anInt9031 != 0) {
								if (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt9031 == arg1.anInt9031) {
									local303 = 2000;
								} else {
									local303 = 0;
								}
							}
						} else if (Static353.aBooleanArray21[local295]) {
							local303 = 2000;
						}
						@Pc(362) short local362 = (short) (Static188.aShortArray2[local295] + local303);
						local143 = Static76.anIntArray114[local295] == -1 ? Static536.anInt9207 : Static76.anIntArray114[local295];
						Static133.method2173("<col=ffffff>" + local88, 0, local362, -1, 0, (long) arg1.anInt8924, local143, true, Static423.aStringArray34[local295], false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(433) Class6_Sub26 local433 = (Class6_Sub26) Static408.aClass298_154.method6809(); local433 != null; local433 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
					if (local433.anInt5472 == 21) {
						local433.aString43 = "<col=ffffff>" + local88;
						return;
					}
				}
			}
		} else if (Static540.aBoolean580 && (Static243.anInt4471 & 0x10) != 0) {
			Static133.method2173(Static185.aString34 + " -> <col=ffffff>" + Static146.aClass103_84.method2355(Static188.anInt28), 0, 51, -1, 0, 0L, Static291.anInt5333, true, Static195.aString36, false);
		}
	}
}
