import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "Lclient!dda;")
	public static Class53 aClass53_25;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIII)V")
	public static void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class1_Sub3 local13 = local7.aClass1_Sub3_2;
		@Pc(16) Class1_Sub3 local16 = local7.aClass1_Sub3_3;
		if (local13 != null) {
			local13.anInt2744 = local13.anInt2744 * arg3 / (0x10 << Static175.anInt3259 - 7);
			local13.anInt2733 = local13.anInt2733 * arg3 / (0x10 << Static175.anInt3259 - 7);
		}
		if (local16 != null) {
			local16.anInt2744 = local16.anInt2744 * arg3 / (0x10 << Static175.anInt3259 - 7);
			local16.anInt2733 = local16.anInt2733 * arg3 / (0x10 << Static175.anInt3259 - 7);
		}
	}
}
