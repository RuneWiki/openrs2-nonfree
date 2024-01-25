import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "[Lclient!se;")
	public static final Class20_Sub3_Sub3_Sub2[] aClass20_Sub3_Sub3_Sub2Array1 = new Class20_Sub3_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_85 = new Class137(12, 8);

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public static int anInt1721 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
	public static void method1400() {
		for (@Pc(10) Class1_Sub3_Sub9 local10 = (Class1_Sub3_Sub9) Static245.aClass254_23.method5437(); local10 != null; local10 = (Class1_Sub3_Sub9) Static245.aClass254_23.method5433()) {
			@Pc(15) Class20_Sub3_Sub4 local15 = local10.aClass20_Sub3_Sub4_1;
			if (local15.aBoolean347) {
				local10.method5617();
				local15.method3511();
			} else if (local15.anInt4373 <= Static368.anInt6250) {
				local15.method3516(Static239.anInt3853);
				if (local15.aBoolean347) {
					local10.method5617();
				} else {
					Static222.method2947(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[S)[S")
	public static short[] method1403(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static459.method2116(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
