import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "[Lclient!ob;")
	public static Class93[] aClass93Array5;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public static int anInt3025;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString106 = " is already on your friend list.";

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public static volatile int anInt3021 = -1;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "[I")
	public static int[] anIntArray301 = new int[2];

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public static int anInt3023 = -1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIB)Z")
	public static boolean method2431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 < arg0; local7++) {
			for (@Pc(16) int local16 = arg3; local16 < arg1; local16++) {
				if (Static130.anIntArrayArray16[local7][local16] == arg4 && Static182.anIntArrayArray46[local7][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = local7 * (Static188.aShort86 - Static61.aShort14) / 100 + Static61.aShort14;
		@Pc(36) int local36 = arg0 * local30 >> 8;
		@Pc(43) int local43 = 2048 - arg3 & 0x7FF;
		@Pc(50) int local50 = 2048 - arg6 & 0x7FF;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(61) int local61 = local36;
		@Pc(71) int local71;
		@Pc(82) int local82;
		if (local43 != 0) {
			local71 = Class1.anIntArray4[local43];
			local54 = local71 * -local36 >> 16;
			local82 = Class1.anIntArray3[local43];
			local61 = local36 * local82 >> 16;
		}
		if (local50 != 0) {
			local82 = Class1.anIntArray3[local50];
			local71 = Class1.anIntArray4[local50];
			local52 = local71 * local61 >> 16;
			local61 = local61 * local82 >> 16;
		}
		Static162.anInt3612 = arg5 - local54;
		Static295.anInt5738 = arg3;
		Static192.anInt4017 = arg2 - local61;
		Static151.anInt3328 = arg6;
		Static80.anInt1911 = arg1 - local52;
	}
}
