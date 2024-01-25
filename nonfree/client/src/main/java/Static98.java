import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "[[[Lclient!we;")
	public static Class213[][][] aClass213ArrayArrayArray2;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!lc;")
	public static final Class126 aClass126_3 = new Class126();

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
	public static final int[] anIntArray205 = new int[1024];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!mo;I)I")
	public static int method2215(@OriginalArg(0) Class143 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3736(Static22.anInt452)) {
			local10++;
		}
		if (arg0.method3736(Static164.anInt3460)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method2216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(8, arg0);
		local8.method3540();
		local8.anInt3805 = arg1;
		local8.anInt3802 = arg2;
		local8.anInt3808 = arg3;
	}
}
