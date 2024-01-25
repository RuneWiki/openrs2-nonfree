import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!ks;")
	public static Class197 aClass197_1 = new Class197(8);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)Z")
	public static boolean method1391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static334.method5163(arg1, arg0) | Static191.method3042(arg1, arg0) | Static402.method8007(arg1, arg0)) & Static120.method8608(arg0, arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method1392(@OriginalArg(1) Class126 arg0) {
		if (Static405.aBoolean578) {
			Static398.method6168(arg0);
		} else {
			Static384.method5952(arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ee;)Lclient!uc;")
	public static Class96_Sub3 method1393(@OriginalArg(1) Class5_Sub12 arg0) {
		@Pc(7) Class96 local7 = Static607.method8453(arg0);
		@Pc(16) int local16 = arg0.method8623();
		@Pc(20) int local20 = arg0.method8623();
		@Pc(24) int local24 = arg0.method8631();
		return new Class96_Sub3(local7.aClass204_13, local7.aClass288_13, local7.anInt9354, local7.anInt9359, local7.anInt9360, local7.anInt9362, local7.anInt9357, local7.anInt9361, local7.anInt9355, local16, local20, local24);
	}
}
