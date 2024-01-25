import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "Z")
	public static boolean aBoolean145 = false;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([II[III)V")
	public static void method1528(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(20) int local20 = (arg3 + arg1) / 2;
		@Pc(22) int local22 = arg3;
		@Pc(26) int local26 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local26;
		@Pc(40) int local40 = arg0[local20];
		arg0[local20] = arg0[arg1];
		arg0[arg1] = local40;
		for (@Pc(52) int local52 = arg3; local52 < arg1; local52++) {
			if (arg2[local52] < (local52 & 0x1) + local26) {
				@Pc(67) int local67 = arg2[local52];
				arg2[local52] = arg2[local22];
				arg2[local22] = local67;
				@Pc(81) int local81 = arg0[local52];
				arg0[local52] = arg0[local22];
				arg0[local22++] = local81;
			}
		}
		arg2[arg1] = arg2[local22];
		arg2[local22] = local26;
		arg0[arg1] = arg0[local22];
		arg0[local22] = local40;
		method1528(arg0, local22 - 1, arg2, arg3);
		method1528(arg0, arg1, arg2, local22 + 1);
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Lclient!cd;")
	public static Class30 method1529() {
		try {
			return (Class30) Class.forName("Class30_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
