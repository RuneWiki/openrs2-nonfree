import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_66 = new Class107(40, 15);

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	public static int anInt1833 = 0;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "Z")
	public static boolean aBoolean109 = true;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!jt;BILclient!wq;IILclient!cl;)V")
	public static void method1594(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31_Sub2_Sub1_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class31_Sub2_Sub1_Sub1 arg6) {
		@Pc(12) Class1_Sub35 local12 = new Class1_Sub35();
		local12.anInt5284 = arg2;
		local12.anInt5279 = arg0 << 7;
		local12.anInt5290 = arg5 << 7;
		if (arg1 != null) {
			local12.aClass129_1 = arg1;
			@Pc(33) int local33 = arg1.anInt3517;
			@Pc(36) int local36 = arg1.anInt3507;
			if (arg4 == 1 || arg4 == 3) {
				local33 = arg1.anInt3507;
				local36 = arg1.anInt3517;
			}
			local12.anInt5281 = arg1.anInt3489;
			local12.anInt5285 = arg1.anInt3486;
			local12.anInt5287 = arg1.anInt3488;
			local12.anIntArray459 = arg1.anIntArray309;
			local12.anInt5286 = local33 + arg5 << 7;
			local12.anInt5293 = arg1.anInt3515;
			local12.anInt5283 = arg1.anInt3495 << 7;
			local12.anInt5289 = arg0 + local36 << 7;
			if (arg1.anIntArray310 != null) {
				local12.aBoolean381 = true;
				local12.method4370();
			}
			if (local12.anIntArray459 != null) {
				local12.anInt5291 = (int) ((double) (local12.anInt5287 - local12.anInt5293) * Math.random()) + local12.anInt5293;
			}
			Static298.aClass181_57.method4102(local12);
		} else if (arg3 != null) {
			local12.aClass31_Sub2_Sub1_Sub2_1 = arg3;
			@Pc(130) Class53 local130 = arg3.aClass53_1;
			if (local130.anIntArray131 != null) {
				local12.aBoolean381 = true;
				local130 = local130.method1508(Static394.aClass23_1);
			}
			if (local130 != null) {
				local12.anInt5289 = local130.anInt1728 + arg0 << 7;
				local12.anInt5286 = local130.anInt1728 + arg5 << 7;
				local12.anInt5281 = Static43.method810(arg3);
				local12.anInt5285 = local130.anInt1710;
				local12.anInt5283 = local130.anInt1705 << 7;
			}
			Static77.aClass181_15.method4102(local12);
		} else if (arg6 != null) {
			local12.aClass31_Sub2_Sub1_Sub1_1 = arg6;
			local12.anInt5286 = arg6.method5989() + arg5 << 7;
			local12.anInt5289 = arg6.method5989() + arg0 << 7;
			local12.anInt5281 = Static269.method3957(arg6);
			local12.anInt5283 = arg6.anInt1291 << 7;
			local12.anInt5285 = arg6.anInt1318;
			Static348.aClass96_36.method2341((long) arg6.anInt7301, local12);
		}
	}
}
