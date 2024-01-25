import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!ph;")
	public static Class187 aClass187_36;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!bc;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;[BII)I")
	public static int method1635(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				arg1[local10++] = (byte) local18;
			} else if (local18 <= '\u07ff') {
				arg1[local10++] = (byte) (local18 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local18 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local18 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local18 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local18 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZILclient!za;III)V")
	public static void method1637(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.ba(arg4, arg2, arg0 + arg4, arg2 - -arg3);
		arg1.method5853(arg2, arg4, -16777216, arg3, arg0);
		if (Static264.anInt4667 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static143.anInt2861 / (float) Static143.anInt2868;
		@Pc(38) int local38 = arg0;
		@Pc(40) int local40 = arg3;
		if (local36 < 1.0F) {
			local40 = (int) (local36 * (float) arg0);
		} else {
			local38 = (int) ((float) arg3 / local36);
		}
		@Pc(66) int local66 = arg4 + (arg0 - local38) / 2;
		@Pc(74) int local74 = arg2 + (arg3 - local40) / 2;
		if (Static315.aClass80_18 == null || arg0 != Static315.aClass80_18.YA() || arg3 != Static315.aClass80_18.ZA()) {
			Static143.method2386(Static143.anInt2867, Static143.anInt2861 + Static143.anInt2863, Static143.anInt2868 + Static143.anInt2867, Static143.anInt2863, local66, local74, local66 + local38, local74 - -local40);
			Static143.method2379(arg1);
			Static315.aClass80_18 = arg1.method5838(local66, local74, local38, local40, false);
		}
		Static315.aClass80_18.method5558(local66, local74);
		@Pc(126) int local126 = local38 * Static316.anInt5456 / Static143.anInt2868;
		@Pc(132) int local132 = local40 * Static366.anInt6329 / Static143.anInt2861;
		@Pc(144) int local144 = local66 + Static323.anInt5541 * local38 / Static143.anInt2868;
		@Pc(159) int local159 = local74 + local40 - local132 - Static400.anInt6751 * local40 / Static143.anInt2861;
		@Pc(161) int local161 = -1996554240;
		if (Static424.aClass147_4 == Static102.aClass147_3) {
			local161 = -1996488705;
		}
		arg1.P(local144, local159, local126, local132, local161, 1);
		arg1.method5811(local144, local159, local126, local132, local161, 0);
		if (Static301.anInt5208 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static351.anInt6021 <= 50) {
			local191 = Static351.anInt6021 * 5;
		} else {
			local191 = 500 - Static351.anInt6021 * 5;
		}
		for (@Pc(205) Class10_Sub46 local205 = (Class10_Sub46) Static143.aClass163_27.method3620(); local205 != null; local205 = (Class10_Sub46) Static143.aClass163_27.method3621()) {
			@Pc(213) Class208 local213 = Static143.aClass88_2.method2268(local205.anInt7522);
			if (Static347.method4711(local213)) {
				@Pc(241) int local241;
				@Pc(253) int local253;
				if (Static7.anInt120 == local205.anInt7522) {
					local241 = local66 + local38 * local205.anInt7526 / Static143.anInt2868;
					local253 = local40 * (Static143.anInt2861 - local205.anInt7523) / Static143.anInt2861 + local74;
					arg1.method5853(local253 - 2, local241 + -2, local191 << 24 | 0xFFFF00, 4, 4);
				} else if (Static36.anInt599 != -1 && Static36.anInt599 == local213.anInt6003) {
					local241 = local205.anInt7526 * local38 / Static143.anInt2868 + local66;
					local253 = local40 * (Static143.anInt2861 - local205.anInt7523) / Static143.anInt2861 + local74;
					arg1.method5853(local253 - 2, local241 + -2, local191 << 24 | 0xFFFF00, 4, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method1638(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static266.anInt4710;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class238 local22 = Static116.aClass144_1.method3297(arg0[local13]);
			if (local22.anInt6654 != -1) {
				@Pc(34) Class80 local34 = (Class80) Static432.aClass267_82.method6014((long) local22.anInt6654);
				if (local34 == null) {
					@Pc(42) Class66 local42 = Static463.method1657(Static21.aClass187_8, local22.anInt6654, 0);
					if (local42 != null) {
						local34 = Static412.aClass50_8.method5861(local42);
						Static432.aClass267_82.method6008(local34, (long) local22.anInt6654);
					}
				}
				if (local34 != null) {
					Static271.aClass80Array14[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
