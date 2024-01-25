import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public static int anInt2028;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public static int anInt2029;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_67 = new Class92(34, -1);

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_68 = new Class92(48, 6);

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "[I")
	public static final int[] anIntArray174 = new int[32];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!eo;)Lclient!eo;")
	public static Class68 method1636(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt2225 != -1) {
			return Static321.method4661(arg0.anInt2225);
		}
		@Pc(18) int local18 = arg0.anInt2177 >>> 16;
		@Pc(23) Class100 local23 = new Class100(Static30.aClass127_3);
		for (@Pc(28) Class3_Sub40 local28 = (Class3_Sub40) local23.method2733(); local28 != null; local28 = (Class3_Sub40) local23.method2731()) {
			if (local28.anInt6668 == local18) {
				return Static321.method4661((int) local28.aLong227);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1639() {
		if (Static337.anInt6221 == -1) {
			return;
		}
		@Pc(11) int local11 = Static155.aClass74_1.method1870();
		@Pc(15) int local15 = Static155.aClass74_1.method1865();
		@Pc(20) Class3_Sub1 local20 = (Class3_Sub1) Static274.aClass229_31.method5328();
		if (local20 != null) {
			local11 = local20.method4777();
			local15 = local20.method4775();
		}
		Static85.method5967(0, 0, 0, local11, Static337.anInt6221, local15, Static385.anInt6686, Static120.anInt2616, 0);
		if (Static118.aClass68_3 != null) {
			Static11.method398(local15, local11);
		}
	}
}
