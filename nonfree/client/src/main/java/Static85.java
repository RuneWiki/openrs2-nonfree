import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!tf;")
	public static Class322 aClass322_29;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public static int anInt1843;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_47 = new Class56(106, 16);

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Z")
	public static boolean aBoolean159 = true;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
	public static void method1680(@OriginalArg(1) int arg0) {
		Static369.anInt6362 = 100;
		Static58.anInt1270 = -1;
		Static555.anInt8826 = 3;
		Static65.anInt1511 = arg0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!gda;II)J")
	public static long method1681(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class280 local19 = Static478.aClass212_3.method4793(arg0.method7561());
		@Pc(40) long local40 = (long) (arg2 | 0x40000000 | arg1 << 7 | arg0.method7556() << 14 | arg0.method7562() << 20);
		if (local19.anInt7380 == 0) {
			local40 |= local12;
		}
		if (local19.anInt7399 == 1) {
			local40 |= local10;
		}
		return local40 | (long) arg0.method7561() << 32;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(III)Lclient!iba;")
	public static Class41_Sub2_Sub4 method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class41_Sub2_Sub4 local14 = local7.aClass41_Sub2_Sub4_1;
			local7.aClass41_Sub2_Sub4_1 = null;
			Static67.method1444(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IFIIIIFIFIII[F)V")
	public static void method1683(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(5) int local5 = arg3 - arg9;
		@Pc(9) int local9 = arg10 - arg4;
		@Pc(17) int local17 = arg8 - arg0;
		@Pc(38) float local38 = arg11[0] * (float) local9 + arg11[1] * (float) local5 + arg11[2] * (float) local17;
		@Pc(59) float local59 = (float) local17 * arg11[5] + (float) local5 * arg11[4] + arg11[3] * (float) local9;
		@Pc(80) float local80 = arg11[8] * (float) local17 + (float) local5 * arg11[7] + arg11[6] * (float) local9;
		@Pc(98) float local98;
		@Pc(105) float local105;
		if (arg2 == 0) {
			local105 = arg7 + 0.5F - local80;
			local98 = arg1 + local38 + 0.5F;
		} else if (arg2 == 1) {
			local98 = local38 + arg1 + 0.5F;
			local105 = arg7 + local80 + 0.5F;
		} else if (arg2 == 2) {
			local98 = arg1 + 0.5F - local38;
			local105 = arg5 + 0.5F - local59;
		} else if (arg2 == 3) {
			local105 = arg5 + 0.5F - local59;
			local98 = local38 + arg1 + 0.5F;
		} else if (arg2 == 4) {
			local98 = arg7 + local80 + 0.5F;
			local105 = arg5 + 0.5F - local59;
		} else {
			local105 = arg5 + 0.5F - local59;
			local98 = arg7 + 0.5F - local80;
		}
		@Pc(199) float local199;
		if (arg6 == 1) {
			local199 = local98;
			local98 = -local105;
			local105 = local199;
		} else if (arg6 == 2) {
			local98 = -local98;
			local105 = -local105;
		} else if (arg6 == 3) {
			local199 = local98;
			local98 = local105;
			local105 = -local199;
		}
		Static559.aFloat201 = local98;
		Static277.aFloat101 = local105;
	}
}
