import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Lclient!jb;")
	public static Class28 aClass28_36;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "[I")
	public static int[] anIntArray211 = new int[2];

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Lclient!hd;")
	public static Class50 aClass50_14 = new Class50(16);

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	public static int anInt2088 = 0;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	public static int anInt2096 = 0;

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "Lclient!o;")
	public static Class86 aClass86_6 = null;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg2 && arg3 == arg0 && arg7 == arg5 && arg6 == arg1) {
			Static29.method581(arg5, arg8, arg4, arg6, arg0);
			return;
		}
		@Pc(23) int local23 = arg4;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg4 * 3;
		@Pc(37) int local37 = arg3 * 3;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg1 * 3;
		@Pc(55) int local55 = local37 + arg6 - arg0 - local45;
		@Pc(59) int local59 = arg0 * 3;
		@Pc(69) int local69 = local33 + local41 - local29 - local29;
		@Pc(79) int local79 = arg5 + local29 - local41 - arg4;
		@Pc(89) int local89 = local45 + local59 - local37 - local37;
		@Pc(94) int local94 = local29 - local33;
		@Pc(99) int local99 = local37 - local59;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local101 * local109 >> 12;
			@Pc(119) int local119 = local115 * local79;
			@Pc(123) int local123 = local109 * local69;
			@Pc(127) int local127 = local55 * local115;
			@Pc(131) int local131 = local89 * local109;
			@Pc(135) int local135 = local94 * local101;
			@Pc(139) int local139 = local101 * local99;
			@Pc(150) int local150 = (local123 + local119 + local135 >> 12) + arg4;
			@Pc(160) int local160 = (local139 + local131 + local127 >> 12) + arg0;
			Static29.method581(local150, arg8, local23, local160, local25);
			local23 = local150;
			local25 = local160;
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public static void method1624() {
		if (Static10.anIntArray33 != null && Static167.anIntArray320 != null) {
			return;
		}
		Static10.anIntArray33 = new int[256];
		Static167.anIntArray320 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static10.anIntArray33[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static167.anIntArray320[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
