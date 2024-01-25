import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!ok;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!vm;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "J")
	public static long aLong65 = 0L;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "S")
	public static short aShort36 = 1;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
	public static final int[] anIntArray177 = new int[13];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!t;IIIII)V")
	public static void method1499(@OriginalArg(0) Class4_Sub37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt6030 == -1 && arg0.anIntArray492 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		if (arg0.anInt6022 < arg3) {
			local16 = arg3 - arg0.anInt6022;
		} else if (arg0.anInt6033 > arg3) {
			local16 = arg0.anInt6033 - arg3;
		}
		@Pc(49) int local49 = Static235.anInt6709 * arg0.anInt6021 >> 8;
		if (arg4 > arg0.anInt6026) {
			local16 += arg4 - arg0.anInt6026;
		} else if (arg0.anInt6024 > arg4) {
			local16 += arg0.anInt6024 - arg4;
		}
		if (arg0.anInt6028 == 0 || arg0.anInt6028 < local16 - 64 || Static235.anInt6709 == 0 || arg2 != arg0.anInt6019) {
			if (arg0.aClass4_Sub13_Sub1_2 != null) {
				Static337.aClass4_Sub13_Sub2_2.method2499(arg0.aClass4_Sub13_Sub1_2);
				arg0.aClass4_Sub13_Sub1_2 = null;
			}
			if (arg0.aClass4_Sub13_Sub1_3 != null) {
				Static337.aClass4_Sub13_Sub2_2.method2499(arg0.aClass4_Sub13_Sub1_3);
				arg0.aClass4_Sub13_Sub1_3 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(138) int local138 = local49 * (arg0.anInt6028 - local16) / arg0.anInt6028;
		if (arg0.aClass4_Sub13_Sub1_2 != null) {
			arg0.aClass4_Sub13_Sub1_2.method1956(local138);
		} else if (arg0.anInt6030 >= 0) {
			@Pc(159) Class112 local159 = Static362.method3033(Static60.aClass11_28, arg0.anInt6030, 0);
			if (local159 != null) {
				@Pc(166) Class4_Sub5_Sub1 local166 = local159.method3031().method5671(Static127.aClass118_1);
				@Pc(171) Class4_Sub13_Sub1 local171 = Static359.method1935(local166, local138);
				local171.method1940(-1);
				Static337.aClass4_Sub13_Sub2_2.method2496(local171);
				arg0.aClass4_Sub13_Sub1_2 = local171;
			}
		}
		if (arg0.aClass4_Sub13_Sub1_3 != null) {
			arg0.aClass4_Sub13_Sub1_3.method1956(local138);
			if (!arg0.aClass4_Sub13_Sub1_3.method5670()) {
				arg0.aClass4_Sub13_Sub1_3 = null;
			}
		} else if (arg0.anIntArray492 != null && (arg0.anInt6025 -= arg1) <= 0) {
			@Pc(223) int local223 = (int) ((double) arg0.anIntArray492.length * Math.random());
			@Pc(231) Class112 local231 = Static362.method3033(Static60.aClass11_28, arg0.anIntArray492[local223], 0);
			if (local231 != null) {
				@Pc(238) Class4_Sub5_Sub1 local238 = local231.method3031().method5671(Static127.aClass118_1);
				@Pc(243) Class4_Sub13_Sub1 local243 = Static359.method1935(local238, local138);
				local243.method1940(0);
				Static337.aClass4_Sub13_Sub2_2.method2496(local243);
				arg0.aClass4_Sub13_Sub1_3 = local243;
				arg0.anInt6025 = (int) (Math.random() * (double) (arg0.anInt6029 - arg0.anInt6023)) + arg0.anInt6023;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!am;ILclient!am;)I")
	public static int method1500(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method274(Static223.anInt4634)) {
			local5++;
		}
		if (arg1.method274(Static202.anInt4261)) {
			local5++;
		}
		if (arg1.method274(Static55.anInt1221)) {
			local5++;
		}
		if (arg0.method274(Static223.anInt4634)) {
			local5++;
		}
		if (arg0.method274(Static202.anInt4261)) {
			local5++;
		}
		if (arg0.method274(Static55.anInt1221)) {
			local5++;
		}
		return local5;
	}
}
