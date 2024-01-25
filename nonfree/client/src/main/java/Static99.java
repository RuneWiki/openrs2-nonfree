import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_24 = new Class194(37, 4);

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "[Lclient!hr;")
	public static final Class105[] aClass105Array1 = new Class105[2048];

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "Lclient!eg;")
	public static final Class60 aClass60_4 = new Class60("", 16);

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "F")
	public static float aFloat33 = 0.0F;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "[I")
	public static final int[] anIntArray80 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIZI)V")
	public static void method1395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(19) long local19 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg1);
		@Pc(25) Class5_Sub26 local25 = (Class5_Sub26) Static255.aClass252_27.method5659(local19);
		if (local25 == null) {
			local25 = new Class5_Sub26();
			Static255.aClass252_27.method5658(local25, local19);
		}
		if (arg0 >= local25.anIntArray247.length) {
			@Pc(46) int[] local46 = new int[arg0 + 1];
			@Pc(51) int[] local51 = new int[arg0 + 1];
			for (@Pc(53) int local53 = 0; local53 < local25.anIntArray247.length; local53++) {
				local46[local53] = local25.anIntArray247[local53];
				local51[local53] = local25.anIntArray249[local53];
			}
			for (@Pc(79) int local79 = local25.anIntArray247.length; local79 < arg0; local79++) {
				local46[local79] = -1;
				local51[local79] = 0;
			}
			local25.anIntArray247 = local46;
			local25.anIntArray249 = local51;
		}
		local25.anIntArray247[arg0] = arg4;
		local25.anIntArray249[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)Z")
	public static boolean method1399(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
