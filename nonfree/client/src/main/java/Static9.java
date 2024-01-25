import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!vo;")
	public static Class348 aClass348_7;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	public static int anInt757;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	public static int anInt758 = 0;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIII)V")
	public static void method674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static292.anInt5983 && arg0 + arg2 <= Static61.anInt1627 && Static289.anInt5872 <= arg3 - arg0 && Static160.anInt3347 >= arg3 + arg0) {
			Static402.method6121(arg1, arg3, arg0, arg2);
		} else {
			Static361.method5463(arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!fu;IILclient!rca;Lclient!r;Lclient!lq;II)V")
	public static void method675(@OriginalArg(0) Class4_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class288 arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) Class202 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg0.anInt3259 - arg1 / 2 - 5;
		@Pc(19) int local19 = arg6 + 2;
		if (arg3.anInt8606 != 0) {
			arg4.method7825(arg2 * arg5.method4811() + arg6 + 1 - local19, arg1 + 10, local19, arg3.anInt8606, local15);
		}
		if (arg3.anInt8595 != 0) {
			arg4.method7800(local19, arg1 + 10, arg3.anInt8595, arg2 * arg5.method4811() + arg6 + 1 - local19, local15);
		}
		@Pc(69) int local69 = arg3.anInt8589;
		if (arg0.aBoolean239 && arg3.anInt8576 != -1) {
			local69 = arg3.anInt8576;
		}
		for (@Pc(90) int local90 = 0; local90 < arg2; local90++) {
			@Pc(96) String local96 = Static86.aStringArray6[local90];
			if (arg2 - 1 > local90) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg5.method4812(arg4, local96, arg0.anInt3259, arg6, local69);
			arg6 += arg5.method4811();
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)V")
	public static void method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class21_Sub1_Sub3 local13 = local7.aClass21_Sub1_Sub3_2;
		@Pc(16) Class21_Sub1_Sub3 local16 = local7.aClass21_Sub1_Sub3_1;
		if (local13 != null) {
			local13.aShort115 = (short) (local13.aShort115 * arg3 / (0x10 << Static392.anInt3635 - 7));
			local13.aShort114 = (short) (local13.aShort114 * arg3 / (0x10 << Static392.anInt3635 - 7));
		}
		if (local16 != null) {
			local16.aShort115 = (short) (local16.aShort115 * arg3 / (0x10 << Static392.anInt3635 - 7));
			local16.aShort114 = (short) (local16.aShort114 * arg3 / (0x10 << Static392.anInt3635 - 7));
		}
	}
}
