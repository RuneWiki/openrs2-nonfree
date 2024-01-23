import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!kc;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "[I")
	public static int[] anIntArray133 = new int[1000];

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Lclient!aj;I)Lclient!ud;")
	public static Class8_Sub3 method1517(@OriginalArg(0) Class8_Sub2 arg0) {
		arg0.method2334();
		@Pc(19) int local19 = arg0.method2334();
		@Pc(23) Class8_Sub3 local23 = Static294.method4291(local19);
		local23.anInt5575 = arg0.method2334();
		@Pc(32) int local32 = arg0.method2334();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(45) int local45 = arg0.method2334();
			local23.method4223(local45, arg0);
		}
		local23.method4220();
		return local23;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
	public static int method1518(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 - 1;
		@Pc(11) int local11 = local5 | local5 >>> 1;
		@Pc(21) int local21 = local11 | local11 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
