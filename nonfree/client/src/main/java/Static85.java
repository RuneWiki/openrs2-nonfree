import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!dh;")
	public static Class33 aClass33_12 = new Class33(50);

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt1720 = 0;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "[I")
	public static int[] anIntArray179 = new int[2048];

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public static int anInt1723 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!qb;IIBI)V")
	public static void method1336(@OriginalArg(0) Class12_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static239.aClass12_Sub3_Sub2_2 || Static60.anInt1152 >= 400) {
			return;
		}
		@Pc(139) String local139;
		@Pc(48) int local48;
		if (arg0.anInt4225 == 0) {
			@Pc(25) boolean local25 = true;
			if (Static239.aClass12_Sub3_Sub2_2.anInt4223 != -1 && arg0.anInt4223 != -1) {
				local48 = Static239.aClass12_Sub3_Sub2_2.anInt4201 <= arg0.anInt4201 ? arg0.anInt4201 : Static239.aClass12_Sub3_Sub2_2.anInt4201;
				@Pc(63) int local63 = Static239.aClass12_Sub3_Sub2_2.anInt4223 >= arg0.anInt4223 ? arg0.anInt4223 : Static239.aClass12_Sub3_Sub2_2.anInt4223;
				@Pc(73) int local73 = local63 + local48 * 10 / 100 + 5;
				@Pc(80) int local80 = Static239.aClass12_Sub3_Sub2_2.anInt4201 - arg0.anInt4201;
				if (local80 < 0) {
					local80 = -local80;
				}
				if (local73 < local80) {
					local25 = false;
				}
			}
			@Pc(105) String local105 = Static132.anInt2784 == 1 ? Static219.aString139 : Static129.aString85;
			if (arg0.anInt4206 <= arg0.anInt4201) {
				local139 = arg0.method3378() + (local25 ? Static167.method2630(Static239.aClass12_Sub3_Sub2_2.anInt4201, arg0.anInt4201) : "<col=ffffff>") + " (" + local105 + arg0.anInt4201 + ")";
			} else {
				local139 = arg0.method3378() + (local25 ? Static167.method2630(Static239.aClass12_Sub3_Sub2_2.anInt4201, arg0.anInt4201) : "<col=ffffff>") + " (" + local105 + arg0.anInt4201 + "+" + (arg0.anInt4206 - arg0.anInt4201) + ")";
			}
		} else {
			local139 = arg0.method3378() + " (" + Static182.aString120 + arg0.anInt4225 + ")";
		}
		if (Static216.anInt4288 == 1) {
			Static66.method1015(arg1, (short) 31, (long) arg2, Static222.aString143 + " -> <col=ffffff>" + local139, arg3, Static70.anInt4107, Static212.aString133);
		} else if (!Static26.aBoolean30) {
			for (@Pc(230) int local230 = 7; local230 >= 0; local230--) {
				if (Static161.aStringArray25[local230] != null) {
					@Pc(243) short local243 = 0;
					if (Static132.anInt2784 == 0 && Static161.aStringArray25[local230].equalsIgnoreCase(Static145.aString97)) {
						if (Static239.aClass12_Sub3_Sub2_2.anInt4201 < arg0.anInt4201) {
							local243 = 2000;
						}
						if (Static239.aClass12_Sub3_Sub2_2.anInt4208 != 0 && arg0.anInt4208 != 0) {
							if (Static239.aClass12_Sub3_Sub2_2.anInt4208 == arg0.anInt4208) {
								local243 = 2000;
							} else {
								local243 = 0;
							}
						}
					} else if (Static205.aBooleanArray18[local230]) {
						local243 = 2000;
					}
					@Pc(303) short local303 = Static256.aShortArray79[local230];
					@Pc(308) short local308 = (short) (local303 + local243);
					Static66.method1015(arg1, local308, (long) arg2, "<col=ffffff>" + local139, arg3, Static61.anIntArray131[local230], Static161.aStringArray25[local230]);
				}
			}
		} else if ((Static112.anInt2457 & 0x8) != 0) {
			Static66.method1015(arg1, (short) 45, (long) arg2, Static254.aString165 + " -> <col=ffffff>" + local139, arg3, Static105.anInt2258, Static235.aString155);
		}
		for (local48 = 0; local48 < Static60.anInt1152; local48++) {
			if (Static299.aShortArray93[local48] == 5) {
				Static35.aStringArray7[local48] = "<col=ffffff>" + local139;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)Lclient!bf;")
	public static Class14 method1337(@OriginalArg(0) int arg0) {
		@Pc(10) Class14 local10 = (Class14) Static264.aClass33_38.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static295.aClass98_172.method2396(arg0, 29);
		local10 = new Class14();
		if (local26 != null) {
			local10.method324(arg0, new Class4_Sub17(local26));
		}
		Static264.aClass33_38.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method1338() {
		Static65.aClass33_10.method839();
		Static269.aClass33_39.method839();
		Static102.aClass33_16.method839();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method1339() {
		anIntArray179 = null;
		aClass33_12 = null;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public static void method1340() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static222.aBooleanArray20[local7] = true;
		}
	}
}
