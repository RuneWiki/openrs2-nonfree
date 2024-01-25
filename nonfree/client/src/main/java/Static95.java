import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dca", name = "Ab", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_65 = new Class196(3, -1);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZIBI)V")
	public static void method1611(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static298.aClass335_23.method7766((long) arg1) != null) {
			return;
		}
		if (Static629.aBoolean735) {
			@Pc(29) Class5_Sub27 local29 = new Class5_Sub27(arg1, new Class104_Sub1(4096, Static484.aClass50_141, arg1), arg2, arg0);
			local29.aClass104_Sub1_1.method2098(Static668.aStringArray42[Static259.anInt4113]);
			Static298.aClass335_23.method7770((long) arg1, local29);
		} else {
			Static365.method5376(arg0, arg1);
		}
	}
}
