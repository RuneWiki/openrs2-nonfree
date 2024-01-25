import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_20 = new Class163(12, 19);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[I")
	public static final int[] anIntArray638 = new int[13];

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_109 = new Class208(52, 4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method6294(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg0, 3);
		local8.method2574();
		local8.aString30 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method6295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class195 local13 = local7.aClass195_1; local13 != null; local13 = local13.aClass195_2) {
			@Pc(17) Class11_Sub5 local17 = local13.aClass11_Sub5_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort108 == arg1 && local17.aShort109 == arg2) {
				Static444.method6031(local17);
				return;
			}
		}
	}
}
