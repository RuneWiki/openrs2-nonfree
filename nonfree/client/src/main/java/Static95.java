import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public static int anInt5251 = 0;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "J")
	public static long aLong195 = 0L;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)I")
	public static int method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(37) int local37 = Static157.method2681(arg0 - 1, arg1 - 1) + Static157.method2681(arg0 - 1, arg1 + 1) + Static157.method2681(arg0 + 1, arg1 + -1) + Static157.method2681(arg0 - -1, arg1 + 1);
		@Pc(78) int local78 = Static157.method2681(arg0, arg1 - 1) + Static157.method2681(arg0, arg1 + 1) + Static157.method2681(arg0 - 1, arg1) + Static157.method2681(arg0 + 1, arg1);
		@Pc(83) int local83 = Static157.method2681(arg0, arg1);
		return local37 / 16 + local78 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!uo;ZLclient!uo;)I")
	public static int method4070(@OriginalArg(0) int arg0, @OriginalArg(2) Class182_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class182_Sub1 arg3) {
		if (arg0 == 1) {
			@Pc(21) int local21 = arg1.anInt5529;
			@Pc(24) int local24 = arg3.anInt5529;
			if (!arg2) {
				if (local21 == -1) {
					local21 = 2001;
				}
				if (local24 == -1) {
					local24 = 2001;
				}
			}
			return local24 - local21;
		} else if (arg0 == 2) {
			return Static90.method3649(Static117.anInt2307, arg3.method4346().aString162, arg1.method4346().aString162);
		} else if (arg0 == 3) {
			if (arg3.aString188.equals("-")) {
				if (arg1.aString188.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString188.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static90.method3649(Static117.anInt2307, arg3.aString188, arg1.aString188);
			}
		} else if (arg0 == 4) {
			return arg3.method4340() ? (arg1.method4340() ? 0 : 1) : arg1.method4340() ? -1 : 0;
		} else if (arg0 == 5) {
			return arg3.method4341() ? (arg1.method4341() ? 0 : 1) : arg1.method4341() ? -1 : 0;
		} else if (arg0 == 6) {
			return arg3.method4342() ? (arg1.method4342() ? 0 : 1) : (arg1.method4342() ? -1 : 0);
		} else if (arg0 == 7) {
			return arg3.method4344() ? (arg1.method4344() ? 0 : 1) : (arg1.method4344() ? -1 : 0);
		} else {
			return arg3.anInt5535 - arg1.anInt5535;
		}
	}
}
