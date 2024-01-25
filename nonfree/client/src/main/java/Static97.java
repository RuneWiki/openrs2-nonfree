import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Lclient!dn;")
	public static Class56 aClass56_24;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "[S")
	public static short[] aShortArray38;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "Lclient!as;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	public static int anInt2135 = -1;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public static void method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static314.method4580(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg0;
		@Pc(26) int local26 = -arg0;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(39) int[] local39 = Static376.anIntArrayArray64[arg5];
		@Pc(44) int local44 = arg3 - local14;
		Static15.method463(arg4, local39, arg3 - arg0, local44);
		@Pc(57) int local57 = local14 + arg3;
		Static15.method463(arg1, local39, local44, local57);
		Static15.method463(arg4, local39, local57, arg3 + arg0);
		while (local10 < local23) {
			local35 += 2;
			local33 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				Static246.anIntArray202[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(122) int[] local122;
			@Pc(129) int[] local129;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(178) int local178;
			@Pc(183) int local183;
			@Pc(188) int local188;
			if (local26 >= 0) {
				local23--;
				if (local14 <= local23) {
					local122 = Static376.anIntArrayArray64[arg5 + local23];
					local129 = Static376.anIntArrayArray64[arg5 - local23];
					local133 = local10 + arg3;
					local138 = arg3 - local10;
					Static15.method463(arg4, local122, local138, local133);
					Static15.method463(arg4, local129, local138, local133);
				} else {
					local122 = Static376.anIntArrayArray64[local23 + arg5];
					local129 = Static376.anIntArrayArray64[arg5 - local23];
					local133 = Static246.anIntArray202[local23];
					local138 = arg3 + local10;
					local178 = arg3 - local10;
					local183 = arg3 + local133;
					local188 = arg3 - local133;
					Static15.method463(arg4, local122, local178, local188);
					Static15.method463(arg1, local122, local188, local183);
					Static15.method463(arg4, local122, local183, local138);
					Static15.method463(arg4, local129, local178, local188);
					Static15.method463(arg1, local129, local188, local183);
					Static15.method463(arg4, local129, local183, local138);
				}
				local26 -= local23 << 1;
			}
			local122 = Static376.anIntArrayArray64[arg5 + local10];
			local129 = Static376.anIntArrayArray64[arg5 - local10];
			local133 = arg3 + local23;
			local138 = arg3 - local23;
			if (local14 > local10) {
				local178 = local10 > local28 ? Static246.anIntArray202[local10] : local28;
				local183 = local178 + arg3;
				local188 = arg3 - local178;
				Static15.method463(arg4, local122, local138, local188);
				Static15.method463(arg1, local122, local188, local183);
				Static15.method463(arg4, local122, local183, local133);
				Static15.method463(arg4, local129, local138, local188);
				Static15.method463(arg1, local129, local188, local183);
				Static15.method463(arg4, local129, local183, local133);
			} else {
				Static15.method463(arg4, local122, local138, local133);
				Static15.method463(arg4, local129, local138, local133);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
	public static int method1718(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
