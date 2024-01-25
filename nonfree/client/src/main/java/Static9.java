import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "Z")
	public static boolean aBoolean522 = true;

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "[S")
	public static short[] aShortArray184 = new short[256];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	public static void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static257.method4540(Static68.anIntArrayArray24[arg1], arg2, arg0 - arg3, arg0 + arg3);
		@Pc(36) int local36 = -1;
		while (local9 > local7) {
			local36 += 2;
			local12 += local36;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(62) int[] local62 = Static68.anIntArrayArray24[arg1 + local9];
				@Pc(69) int[] local69 = Static68.anIntArrayArray24[arg1 - local9];
				@Pc(74) int local74 = arg0 + local7;
				@Pc(78) int local78 = arg0 - local7;
				Static257.method4540(local62, arg2, local78, local74);
				Static257.method4540(local69, arg2, local78, local74);
			}
			@Pc(94) int local94 = arg0 + local9;
			@Pc(99) int local99 = arg0 - local9;
			@Pc(105) int[] local105 = Static68.anIntArrayArray24[arg1 + local7];
			@Pc(112) int[] local112 = Static68.anIntArrayArray24[arg1 - local7];
			Static257.method4540(local105, arg2, local99, local94);
			Static257.method4540(local112, arg2, local99, local94);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!bda;")
	public static Class3_Sub6 method6181(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub6_Sub1");
			@Pc(15) Class3_Sub6 local15 = (Class3_Sub6) local6.getDeclaredConstructor().newInstance();
			local15.method2207(arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub6_Sub2 local28 = new Class3_Sub6_Sub2();
			local28.method2207(arg0);
			return local28;
		}
	}
}
