import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!qd;")
	public static Class54 aClass54_25;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_18;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1047 = Static2.method66("Trade)4compete");

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1048 = Static2.method66("");

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1049 = aClass39_1048;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt2305 = 0;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1050 = aClass39_1048;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1051 = aClass39_1047;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1052 = aClass39_1048;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1053 = aClass39_1048;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1054 = aClass39_1048;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1055 = Static2.method66("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1056 = aClass39_1048;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1057 = Static2.method66("backhmid1");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1632() {
		@Pc(10) Object local10 = Static39.anObject4;
		synchronized (Static39.anObject4) {
			if (Static31.anInt1813 == 0) {
				Static61.aClass12_3.method324(new Class52(), 5);
			}
			Static31.anInt1813 = 600;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method1636(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		if (arg0.anInt2889 == 0) {
			return;
		}
		@Pc(42) int local42;
		@Pc(49) int local49;
		if (arg0.anInt2930 != -1 && arg0.anInt2930 < 32768) {
			@Pc(33) Class2_Sub1_Sub2_Sub3_Sub2 local33 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[arg0.anInt2930];
			if (local33 != null) {
				local42 = arg0.anInt2896 - local33.anInt2896;
				local49 = arg0.anInt2899 - local33.anInt2899;
				if (local42 != 0 || local49 != 0) {
					arg0.anInt2887 = (int) (Math.atan2((double) local42, (double) local49) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(82) int local82;
		if (arg0.anInt2930 >= 32768) {
			local82 = arg0.anInt2930 - 32768;
			if (Static82.anInt2217 == local82) {
				local82 = 2047;
			}
			@Pc(95) Class2_Sub1_Sub2_Sub3_Sub1 local95 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local82];
			if (local95 != null) {
				local49 = arg0.anInt2896 - local95.anInt2896;
				@Pc(111) int local111 = arg0.anInt2899 - local95.anInt2899;
				if (local49 != 0 || local111 != 0) {
					arg0.anInt2887 = (int) (Math.atan2((double) local49, (double) local111) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2892 != 0 || arg0.anInt2902 != 0) && (arg0.anInt2938 == 0 || arg0.anInt2908 > 0)) {
			local82 = arg0.anInt2896 - (arg0.anInt2892 - Static19.anInt575 - Static19.anInt575) * 64;
			local42 = arg0.anInt2899 - (arg0.anInt2902 - Static75.anInt454 - Static75.anInt454) * 64;
			if (local82 != 0 || local42 != 0) {
				arg0.anInt2887 = (int) (Math.atan2((double) local82, (double) local42) * 325.949D) & 0x7FF;
			}
			arg0.anInt2902 = 0;
			arg0.anInt2892 = 0;
		}
		local82 = arg0.anInt2887 - arg0.anInt2909 & 0x7FF;
		if (local82 == 0) {
			return;
		}
		if (local82 <= 1024) {
			arg0.anInt2909 += arg0.anInt2889;
			if (arg0.anInt2895 == arg0.anInt2894) {
				if (arg0.anInt2906 == -1) {
					arg0.anInt2894 = arg0.anInt2891;
				} else {
					arg0.anInt2894 = arg0.anInt2906;
				}
			}
		} else {
			arg0.anInt2909 -= arg0.anInt2889;
			if (arg0.anInt2894 == arg0.anInt2895) {
				if (arg0.anInt2883 == -1) {
					arg0.anInt2894 = arg0.anInt2891;
				} else {
					arg0.anInt2894 = arg0.anInt2883;
				}
			}
		}
		if (arg0.anInt2889 > local82 || local82 > 2048 - arg0.anInt2889) {
			arg0.anInt2909 = arg0.anInt2887;
		}
		arg0.anInt2909 &= 0x7FF;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method1638() {
		if (Static38.anInt1157 == 0) {
			return;
		}
		@Pc(17) int local17 = 0;
		if (Static104.anInt2782 != 0) {
			local17 = 1;
		}
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			if (Static67.aClass39Array12[local26] != null) {
				@Pc(36) int local36 = Static40.anIntArray169[local26];
				@Pc(40) Class39 local40 = Static42.aClass39Array8[local26];
				if (local40 != null && local40.method1093(Static46.aClass39_575)) {
					local40 = local40.method1099(5);
				}
				if (local40 != null && local40.method1093(Static18.aClass39_279)) {
					local40 = local40.method1099(5);
				}
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Static96.anInt2634 == 0 || Static96.anInt2634 == 1 && Static35.method2069(local40))) {
					@Pc(99) int local99 = 329 - local17 * 13;
					if (Static80.anInt2188 > 4 && local99 - 10 < Static45.anInt1237 + -4 && local99 + 3 >= Static45.anInt1237 - 4) {
						@Pc(151) int local151 = Static49.aClass2_Sub1_Sub4_Sub1_2.method241(Static20.method431(new Class39[] { Static109.aClass39_1322, Static90.aClass39_1093, local40, Static67.aClass39Array12[local26] })) + 25;
						if (local151 > 450) {
							local151 = 450;
						}
						if (Static80.anInt2188 < local151 + 4) {
							if (Static77.anInt2111 >= 1) {
								Static84.method2048(0, Static69.aClass39_895, Static20.method431(new Class39[] { Static79.aClass39_1261, local40 }), 2031, 0, 0);
							}
							Static84.method2048(0, Static85.aClass39_1045, Static20.method431(new Class39[] { Static79.aClass39_1261, local40 }), 2004, 0, 0);
							Static84.method2048(0, Static47.aClass39_594, Static20.method431(new Class39[] { Static79.aClass39_1261, local40 }), 2002, 0, 0);
						}
					}
					local17++;
					if (local17 >= 5) {
						return;
					}
				}
				if ((local36 == 5 || local36 == 6) && Static96.anInt2634 < 2) {
					local17++;
					if (local17 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method1639() {
		aClass39_1054 = null;
		aClass39_1056 = null;
		aClass39_1052 = null;
		aClass54_25 = null;
		aClass39_1048 = null;
		aClass39_1049 = null;
		aClass36_Sub1_18 = null;
		aClass39_1053 = null;
		aClass39_1057 = null;
		aByteArrayArray9 = null;
		aClass39_1047 = null;
		aClass39_1055 = null;
		aClass39_1051 = null;
		aClass39_1050 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!jd;III)[Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3[] method1640(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static84.method2047(arg2, arg0, arg1) ? Static68.method1432() : null;
	}
}
