import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIZILclient!r;)V", line = 94)
	public static void method2044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class197 arg2) {
		Static318.anInt6364 = 0;
		Static98.anInt2180 = arg1;
		Static27.anInt672 = 10000;
		Static358.aBoolean485 = false;
		Static109.aClass197_26 = arg2;
		Class123.anInt3361 = 1;
		Static331.anInt6628 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILclient!cj;Lclient!cj;)V", line = 224)
	public static void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class67 local4 = Static245.method4501(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_2 = arg3;
			local4.aClass11_Sub3_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V", line = 238)
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static85.method1962(Class49_Sub2.aClass145_229);
		Class14.aClass2_Sub4_Sub2_4.method4814(arg0);
		Class14.aClass2_Sub4_Sub2_4.method4839(arg1);
	}
}
