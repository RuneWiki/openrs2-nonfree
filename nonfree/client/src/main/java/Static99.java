import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
	public static int anInt2215;

	@OriginalMember(owner = "client!fu", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)I", line = 41)
	public static int method2237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(28) int local28 = Static129.method2581(local17, local7);
		@Pc(35) int local35 = Static129.method2581(local17, local7 + 1);
		@Pc(42) int local42 = Static129.method2581(local17 + 1, local7);
		@Pc(51) int local51 = Static129.method2581(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static235.method4378(local13, local28, arg0, local35);
		@Pc(65) int local65 = Static235.method4378(local13, local42, arg0, local51);
		return Static235.method4378(local23, local58, arg0, local65);
	}
}
