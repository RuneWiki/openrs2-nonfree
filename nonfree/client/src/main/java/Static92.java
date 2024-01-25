import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!wc;")
	public static Class316 aClass316_1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!raa;")
	public static final Class253 aClass253_5 = new Class253("WTWIP", 3);

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public static int anInt1968 = 1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIII)I")
	public static int method1826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static511.aClass52Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(14) int local14 = arg4 >> 9;
			@Pc(18) int local18 = arg2 >> 9;
			if (arg1 < 0 || arg3 < 0 || arg1 > Static118.anInt2527 - 1 || Static549.anInt9482 - 1 < arg3) {
				return 0;
			} else if (local14 >= 1 && local18 >= 1 && local14 <= Static118.anInt2527 - 1 && Static549.anInt9482 - 1 >= local18) {
				@Pc(91) boolean local91 = (Static232.aByteArrayArrayArray18[1][arg4 >> 9][arg2 >> 9] & 0x2) != 0;
				@Pc(119) boolean local119;
				@Pc(138) boolean local138;
				if ((arg4 & 0x1FF) == 0) {
					local119 = (Static232.aByteArrayArrayArray18[1][local14 - 1][arg2 >> 9] & 0x2) != 0;
					local138 = (Static232.aByteArrayArrayArray18[1][local14][arg2 >> 9] & 0x2) != 0;
					if (local119 != local138) {
						local91 = (Static232.aByteArrayArrayArray18[1][arg1][arg3] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x1FF) == 0) {
					local119 = (Static232.aByteArrayArrayArray18[1][arg4 >> 9][local18 - 1] & 0x2) != 0;
					local138 = (Static232.aByteArrayArrayArray18[1][arg4 >> 9][local18] & 0x2) != 0;
					if (local138 != local119) {
						local91 = (Static232.aByteArrayArrayArray18[1][arg1][arg3] & 0x2) != 0;
					}
				}
				if (local91) {
					arg0++;
				}
				return Static511.aClass52Array3[arg0].sa(arg4, arg2);
			} else {
				return 0;
			}
		} else {
			return Static511.aClass52Array3[arg0].sa(arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)V")
	public static void method1827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static104.anInt2328 = arg1;
		Static289.anInt5875 = arg2;
		Static166.anInt6799 = arg3;
		Static237.anInt4966 = arg5;
		Static544.anInt9409 = arg0;
		Static174.anInt3992 = arg4;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Lclient!bw;")
	public static Class6_Sub2 method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub2_3;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!oa;Lclient!va;III)V")
	public static void method1830(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class290 local12;
		if (arg3 < Static126.anInt2626) {
			local12 = Static279.aClass290ArrayArrayArray7[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass6_Sub3_2 != null && local12.aClass6_Sub3_2.method7743()) {
				arg1.method7749(Static219.anInt4777, 0, local12.aClass6_Sub3_2, arg0, true, 0);
			}
		}
		if (arg4 < Static126.anInt2626) {
			local12 = Static279.aClass290ArrayArrayArray7[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass6_Sub3_2 != null && local12.aClass6_Sub3_2.method7743()) {
				arg1.method7749(0, Static219.anInt4777, local12.aClass6_Sub3_2, arg0, true, 0);
			}
		}
		if (arg3 < Static126.anInt2626 && arg4 < Static108.anInt2385) {
			local12 = Static279.aClass290ArrayArrayArray7[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass6_Sub3_2 != null && local12.aClass6_Sub3_2.method7743()) {
				arg1.method7749(Static219.anInt4777, Static219.anInt4777, local12.aClass6_Sub3_2, arg0, true, 0);
			}
		}
		if (arg3 < Static126.anInt2626 && arg4 > 0) {
			local12 = Static279.aClass290ArrayArrayArray7[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass6_Sub3_2 != null && local12.aClass6_Sub3_2.method7743()) {
				arg1.method7749(Static219.anInt4777, -Static219.anInt4777, local12.aClass6_Sub3_2, arg0, true, 0);
			}
		}
	}
}
