import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!hk;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
	public static int[] anIntArray182 = new int[128];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)I")
	public static int method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
	public static int method1897() {
		return Static148.anInt413;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!hc;II)[Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1[] method1898(@OriginalArg(1) Class51 arg0, @OriginalArg(2) int arg1) {
		return Static96.method2050(arg0, 0, arg1) ? Static68.method977() : null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!se;)Lclient!se;")
	public static Class122 method1899(@OriginalArg(1) Class122 arg0) {
		if (arg0.anInt4703 != -1) {
			return Static206.method3444(arg0.anInt4703);
		}
		@Pc(19) int local19 = arg0.anInt4686 >>> 16;
		@Pc(29) Class43 local29 = new Class43(Static204.aClass140_13);
		for (@Pc(34) Class1_Sub5 local34 = (Class1_Sub5) local29.method1365(); local34 != null; local34 = (Class1_Sub5) local29.method1368()) {
			if (local34.anInt1358 == local19) {
				return Static206.method3444((int) local34.aLong184);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method1901() {
		Static4.aClass68_1.method2540();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static233.aLongArray35[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static13.aLongArray3[local24] = 0L;
		}
		Static260.anInt2794 = 0;
	}
}
