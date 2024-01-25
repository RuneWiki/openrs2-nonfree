import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "Lclient!oo;")
	public static final Class274 aClass274_1 = new Class274();

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!lda;")
	public static final Class225 aClass225_5 = new Class225(14, 0, 4, 1);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IFIIZIII)[I")
	public static int[] method1068(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub2_Sub11 local10 = new Class3_Sub2_Sub11();
		local10.aBoolean331 = true;
		local10.anInt3949 = 35;
		local10.anInt3943 = 8;
		local10.anInt3951 = 4;
		local10.anInt3952 = 8;
		local10.anInt3950 = (int) (arg0 * 4096.0F);
		local10.method9205();
		Static702.method9177(2048, 1);
		local10.method3321(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!ej;)Ljava/lang/String;")
	public static String method1070(@OriginalArg(1) Class3_Sub4_Sub5 arg0) {
		if (arg0.aString49 == null || arg0.aString49.length() == 0) {
			return arg0.aString50 == null || arg0.aString50.length() <= 0 ? arg0.aString48 : arg0.aString48 + Static476.aClass279_32.method6992(Static141.anInt2658) + arg0.aString50;
		} else if (arg0.aString50 == null || arg0.aString50.length() <= 0) {
			return arg0.aString48 + Static476.aClass279_32.method6992(Static141.anInt2658) + arg0.aString49;
		} else {
			return arg0.aString48 + Static476.aClass279_32.method6992(Static141.anInt2658) + arg0.aString50 + Static476.aClass279_32.method6992(Static141.anInt2658) + arg0.aString49;
		}
	}
}
