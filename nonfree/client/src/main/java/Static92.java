import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[[[Lclient!qo;")
	public static Class3_Sub25[][][] aClass3_Sub25ArrayArrayArray3;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt1674 = 0;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
	public static int anInt1683 = 0;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[S")
	public static short[] aShortArray30 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIBII)V")
	public static void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class3_Sub20 local6;
		for (local6 = (Class3_Sub20) Static150.aClass56_9.method1281(); local6 != null; local6 = (Class3_Sub20) Static150.aClass56_9.method1278()) {
			Static170.method2816(arg1, arg3, arg2, arg0, local6);
		}
		@Pc(42) byte local42;
		@Pc(47) Class31 local47;
		@Pc(130) int local130;
		for (local6 = (Class3_Sub20) Static39.aClass56_4.method1281(); local6 != null; local6 = (Class3_Sub20) Static39.aClass56_4.method1278()) {
			local42 = 1;
			local47 = local6.aClass10_Sub5_Sub2_1.method4191();
			if (local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt912) {
				local42 = 0;
			} else if (local47.anInt919 == local6.aClass10_Sub5_Sub2_1.anInt5066 || local47.anInt910 == local6.aClass10_Sub5_Sub2_1.anInt5066 || local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt885 || local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt902) {
				local42 = 2;
			} else if (local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt915 || local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt884 || local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt906 || local6.aClass10_Sub5_Sub2_1.anInt5066 == local47.anInt899) {
				local42 = 3;
			}
			if (local42 != local6.anInt2994) {
				local130 = Static221.method3631(local6.aClass10_Sub5_Sub2_1);
				if (local6.anInt2988 != local130) {
					if (local6.aClass3_Sub15_Sub1_3 != null) {
						Static86.aClass3_Sub15_Sub2_1.method2432(local6.aClass3_Sub15_Sub1_3);
						local6.aClass3_Sub15_Sub1_3 = null;
					}
					local6.anInt2988 = local130;
				}
				local6.anInt2994 = local42;
			}
			local6.anInt2993 = local6.aClass10_Sub5_Sub2_1.anInt5073;
			local6.anInt2992 = local6.aClass10_Sub5_Sub2_1.anInt5073 + local6.aClass10_Sub5_Sub2_1.method4186() * 64;
			local6.anInt2998 = local6.aClass10_Sub5_Sub2_1.anInt5016;
			local6.anInt2996 = local6.aClass10_Sub5_Sub2_1.anInt5016 + local6.aClass10_Sub5_Sub2_1.method4186() * 64;
			Static170.method2816(arg1, arg3, arg2, arg0, local6);
		}
		for (local6 = (Class3_Sub20) Static245.aClass30_32.method664(); local6 != null; local6 = (Class3_Sub20) Static245.aClass30_32.method671()) {
			local42 = 1;
			local47 = local6.aClass10_Sub5_Sub1_2.method4191();
			if (local6.aClass10_Sub5_Sub1_2.anInt5066 == local47.anInt912) {
				local42 = 0;
			} else if (local47.anInt919 == local6.aClass10_Sub5_Sub1_2.anInt5066 || local6.aClass10_Sub5_Sub1_2.anInt5066 == local47.anInt910 || local47.anInt885 == local6.aClass10_Sub5_Sub1_2.anInt5066 || local6.aClass10_Sub5_Sub1_2.anInt5066 == local47.anInt902) {
				local42 = 2;
			} else if (local47.anInt915 == local6.aClass10_Sub5_Sub1_2.anInt5066 || local6.aClass10_Sub5_Sub1_2.anInt5066 == local47.anInt884 || local6.aClass10_Sub5_Sub1_2.anInt5066 == local47.anInt906 || local6.aClass10_Sub5_Sub1_2.anInt5066 == local47.anInt899) {
				local42 = 3;
			}
			if (local42 != local6.anInt2994) {
				local130 = Static130.method2209(local6.aClass10_Sub5_Sub1_2);
				if (local130 != local6.anInt2988) {
					if (local6.aClass3_Sub15_Sub1_3 != null) {
						Static86.aClass3_Sub15_Sub2_1.method2432(local6.aClass3_Sub15_Sub1_3);
						local6.aClass3_Sub15_Sub1_3 = null;
					}
					local6.anInt2988 = local130;
				}
				local6.anInt2994 = local42;
			}
			local6.anInt2993 = local6.aClass10_Sub5_Sub1_2.anInt5073;
			local6.anInt2992 = local6.aClass10_Sub5_Sub1_2.anInt5073 + local6.aClass10_Sub5_Sub1_2.method4186() * 64;
			local6.anInt2998 = local6.aClass10_Sub5_Sub1_2.anInt5016;
			local6.anInt2996 = local6.aClass10_Sub5_Sub1_2.anInt5016 + local6.aClass10_Sub5_Sub1_2.method4186() * 64;
			Static170.method2816(arg1, arg3, arg2, arg0, local6);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1365(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static130.aStringArray21.length; local7++) {
			if (Static130.aStringArray21[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static232.anIntArrayArrayArray12[arg0][local16][local20] == -Static23.anInt428) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static256.anIntArrayArrayArray14[arg0][arg1][arg3] + arg5;
			if (!Static217.method3570(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static217.method3570(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static217.method3570(local16, local156, local182)) {
				return false;
			} else if (Static217.method3570(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static306.method4923(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static217.method3570(local16 + 1, Static256.anIntArrayArrayArray14[arg0][arg1][arg3] + arg5, local20 + 1) && Static217.method3570(local16 + 128 - 1, Static256.anIntArrayArrayArray14[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static217.method3570(local16 + 128 - 1, Static256.anIntArrayArrayArray14[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static217.method3570(local16 + 1, Static256.anIntArrayArrayArray14[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1367(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				local55.append(Static86.aCharArray11[(int) (local63 - arg0 * 37L)]);
			}
			return local55.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ug;ILjava/lang/String;)I")
	public static int method1370(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) int local2 = arg0.anInt4615;
		@Pc(10) byte[] local10 = Static111.method1792(arg1);
		arg0.method3911(local10.length);
		arg0.anInt4615 += Static105.aClass192_1.method4927(local10.length, arg0.aByteArray64, local10, 0, arg0.anInt4615);
		return arg0.anInt4615 - local2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method1371(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static51.method818(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1372(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static125.aClass41_1);
		arg0.addMouseMotionListener(Static125.aClass41_1);
		arg0.addFocusListener(Static125.aClass41_1);
	}
}
