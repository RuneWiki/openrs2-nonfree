import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!aa;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
	public static int anInt1541;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
	public static int anInt1542;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "Lclient!no;")
	public static final Class142 aClass142_7 = new Class142(64);

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Lclient!kc;")
	public static Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!fk;")
	public static final Class74 aClass74_5 = new Class74();

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
	public static void method1242() {
		Static210.aClass26_39.method328();
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z")
	public static boolean method1243() {
		return Static238.aBoolean319;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg6 && arg7 == arg0 && arg5 == arg4 && arg8 == arg3) {
			Static315.method5281(arg0, arg5, arg3, arg2, arg1);
			return;
		}
		@Pc(32) int local32 = arg2;
		@Pc(34) int local34 = arg0;
		@Pc(38) int local38 = arg2 * 3;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(67) int local67 = local46 + arg5 - local54 - arg2;
		@Pc(77) int local77 = local50 + arg3 - local58 - arg0;
		@Pc(87) int local87 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local46 - local38;
		@Pc(107) int local107 = local50 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local109 * local117 >> 12;
			@Pc(127) int local127 = local67 * local123;
			@Pc(131) int local131 = local123 * local77;
			@Pc(135) int local135 = local87 * local117;
			@Pc(139) int local139 = local117 * local97;
			@Pc(143) int local143 = local102 * local109;
			@Pc(147) int local147 = local109 * local107;
			@Pc(158) int local158 = arg2 + (local143 + local135 + local127 >> 12);
			@Pc(168) int local168 = (local147 + local131 + local139 >> 12) + arg0;
			Static315.method5281(local34, local158, local168, local32, arg1);
			local34 = local168;
			local32 = local158;
		}
	}
}
