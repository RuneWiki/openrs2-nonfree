import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "Lclient!ic;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_431 = Static199.method3560(")2");

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "[I")
	public static int[] anIntArray346 = new int[64];

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray61 = new boolean[5];

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "Lclient!qe;")
	public static Class78 aClass78_432 = Static199.method3560(")4a=");

	@OriginalMember(owner = "client!hj", name = "cb", descriptor = "[I")
	public static int[] anIntArray347 = new int[200];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ)I")
	public static int method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		return Static90.aClass2_Sub3_Sub16_1 != null && Static90.aClass2_Sub3_Sub16_1.aLong188 == local10 ? Static139.aClass2_Sub23_7.anInt2703 * 99 / (Static139.aClass2_Sub23_7.aByteArray41.length - Static90.aClass2_Sub3_Sub16_1.aByte10) + 1 : 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLclient!lc;)V")
	public static void method1550(@OriginalArg(1) Class2_Sub21 arg0) {
		arg0.aBoolean206 = false;
		if (arg0.aClass2_Sub22_5 != null) {
			arg0.aClass2_Sub22_5.anInt2516 = 0;
		}
		for (@Pc(24) Class2_Sub21 local24 = arg0.method3840(); local24 != null; local24 = arg0.method3842()) {
			method1550(local24);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!oe;)Lclient!dg;")
	public static Class2_Sub13 method1551(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1) {
		@Pc(12) byte[] local12 = arg1.method3184(arg0);
		return local12 == null ? null : new Class2_Sub13(local12);
	}
}
