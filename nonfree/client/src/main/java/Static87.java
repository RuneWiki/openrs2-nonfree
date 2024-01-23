import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public static int anInt5782;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "[I")
	public static int[] anIntArray651 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ra;B)V")
	public static void method4691(@OriginalArg(0) Class4_Sub25 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		@Pc(9) long local9 = 0L;
		if (arg0.anInt4438 == 0) {
			local9 = Static174.method2739(arg0.anInt4439, arg0.anInt4446, arg0.anInt4442);
		}
		if (arg0.anInt4438 == 1) {
			local9 = Static308.method4776(arg0.anInt4439, arg0.anInt4446, arg0.anInt4442);
		}
		@Pc(45) int local45 = 0;
		if (arg0.anInt4438 == 2) {
			local9 = Static128.method1961(arg0.anInt4439, arg0.anInt4446, arg0.anInt4442);
		}
		if (arg0.anInt4438 == 3) {
			local9 = Static150.method2421(arg0.anInt4439, arg0.anInt4446, arg0.anInt4442);
		}
		if (local9 != 0L) {
			local7 = (int) local9 >> 14 & 0x1F;
			local45 = (int) local9 >> 20 & 0x3;
			local5 = Integer.MAX_VALUE & (int) (local9 >>> 32);
		}
		arg0.anInt4445 = local45;
		arg0.anInt4444 = local7;
		arg0.anInt4440 = local5;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)Lclient!ke;")
	public static Class4_Sub3_Sub5_Sub2 method4695(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class4_Sub3_Sub5_Sub2 local24 = new Class4_Sub3_Sub5_Sub2(arg0, Static195.anIntArray402, Static187.anIntArray391, Static110.anIntArray185, Static301.anIntArray643, Static230.aByteArrayArray36);
			Static304.method4707();
			return local24;
		}
	}
}
