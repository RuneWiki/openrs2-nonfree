import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!wd;")
	public static Class212 aClass212_3;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean148 = true;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
	public static final int[] anIntArray195 = new int[32];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIIII)V")
	public static void method2136(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static32.anInt750 = 0;
		Static6.anInt136 = 0;
		Static112.anInt2485 = arg0;
		Static275.anInt5244 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2137(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class14_Sub2_Sub13 local12 = Static1.method5711(3, arg0);
		local12.method3540();
		local12.aString132 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Lclient!is;")
	public static Class99 method2138(@OriginalArg(0) int arg0) {
		@Pc(10) Class99 local10 = (Class99) Static243.aClass11_106.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static4.aClass143_3.method3745(33, arg0);
		local10 = new Class99();
		if (local20 != null) {
			local10.method2823(arg0, new Class14_Sub4(local20));
		}
		Static243.aClass11_106.method219((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg1 == arg3 && arg5 == arg8 && arg0 == arg2) {
			Static193.method3662(arg7, arg5, arg2, arg4, arg1);
			return;
		}
		@Pc(27) int local27 = arg4;
		@Pc(29) int local29 = arg1;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(64) int local64 = arg5 + local41 - arg4 - local49;
		@Pc(75) int local75 = arg2 + local45 - local53 - arg1;
		@Pc(86) int local86 = local49 + local33 - local41 - local41;
		@Pc(95) int local95 = local37 + local53 - local45 - local45;
		@Pc(100) int local100 = local41 - local33;
		@Pc(105) int local105 = local45 - local37;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local107 * local115 >> 12;
			@Pc(125) int local125 = local64 * local121;
			@Pc(129) int local129 = local121 * local75;
			@Pc(133) int local133 = local86 * local115;
			@Pc(137) int local137 = local95 * local115;
			@Pc(141) int local141 = local107 * local100;
			@Pc(145) int local145 = local107 * local105;
			@Pc(156) int local156 = arg4 + (local141 + local133 + local125 >> 12);
			@Pc(166) int local166 = arg1 + (local145 + local137 + local129 >> 12);
			Static193.method3662(arg7, local156, local166, local27, local29);
			local29 = local166;
			local27 = local156;
		}
	}
}
