import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "[I")
	public static int[] anIntArray126 = new int[32];

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public static int anInt2019 = 0;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public static void method1508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class65 local13 = local7.aClass65_1;
		if (local13 != null) {
			local13.anInt2426 = local13.anInt2426 * arg3 / 16;
			local13.anInt2428 = local13.anInt2428 * arg3 / 16;
		}
	}
}
