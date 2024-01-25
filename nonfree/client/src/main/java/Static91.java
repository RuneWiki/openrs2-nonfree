import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!di", name = "e", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt8332;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg4 - 334;
		if (local12 < 0) {
			local12 = 0;
		} else if (local12 > 100) {
			local12 = 100;
		}
		@Pc(38) int local38 = (Static57.aShort20 - Static339.aShort66) * local12 / 100 + Static339.aShort66;
		@Pc(44) int local44 = local38 * arg0 >> 8;
		@Pc(51) int local51 = 16384 - arg5 & 0x3FFF;
		@Pc(58) int local58 = 16384 - arg1 & 0x3FFF;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = local44;
		if (local51 != 0) {
			local62 = -local44 * Class85_Sub8.anIntArray426[local51] >> 14;
			local64 = local44 * Class85_Sub8.anIntArray427[local51] >> 14;
		}
		if (local58 != 0) {
			local60 = local64 * Class85_Sub8.anIntArray426[local58] >> 14;
			local64 = Class85_Sub8.anIntArray427[local58] * local64 >> 14;
		}
		Static175.anInt3256 = arg1;
		Static78.anInt1534 = arg6 - local64;
		Static76.anInt6369 = 0;
		Static428.anInt7673 = arg5;
		Static393.anInt6978 = arg3 - local60;
		Static20.anInt542 = arg2 - local62;
	}
}
