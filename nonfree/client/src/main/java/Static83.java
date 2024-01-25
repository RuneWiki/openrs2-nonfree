import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!al;")
	public static Class1_Sub4_Sub1 aClass1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "S")
	public static short aShort27 = 1;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!wo;)I")
	public static int method1817(@OriginalArg(1) Class216 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5651(Class17_Sub1_Sub2.lb)) {
			local5++;
		}
		if (arg0.method5651(Static126.anInt2821)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	public static void method1819() {
		Static18.aBooleanArray2 = null;
		Static344.anIntArray525 = null;
		Static31.anIntArray95 = null;
		Static158.anIntArray314 = null;
		Static72.aBoolean182 = false;
		Static154.aClipboard1 = null;
		Static45.method1050();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
	public static void method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1_Sub4_Sub9 local10 = Static139.method4227(arg2, 10);
		local10.method1869();
		local10.anInt2145 = arg1;
		local10.anInt2148 = arg0;
		local10.anInt2142 = arg3;
	}
}
