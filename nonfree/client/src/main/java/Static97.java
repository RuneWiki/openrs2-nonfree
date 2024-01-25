import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "Lclient!af;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "Lclient!lf;")
	public static Class90 aClass90_9;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
	public static int anInt1919 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[IIII)V")
	public static void method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(16) int local16 = arg3 - 1;
		@Pc(19) int local19 = local16 - 7;
		while (arg0 < local19) {
			@Pc(23) int local23 = arg0 + 1;
			arg1[local23] = arg2;
			@Pc(28) int local28 = local23 + 1;
			arg1[local28] = arg2;
			@Pc(33) int local33 = local28 + 1;
			arg1[local33] = arg2;
			@Pc(38) int local38 = local33 + 1;
			arg1[local38] = arg2;
			@Pc(43) int local43 = local38 + 1;
			arg1[local43] = arg2;
			@Pc(48) int local48 = local43 + 1;
			arg1[local48] = arg2;
			@Pc(53) int local53 = local48 + 1;
			arg1[local53] = arg2;
			arg0 = local53 + 1;
			arg1[arg0] = arg2;
		}
		while (arg0 < local16) {
			arg0++;
			arg1[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!rj;Lclient!aa;ZIIII)V")
	public static void method1785(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2) {
			Static322.aClass90_18.method5454((Static11.anInt5389 - Static322.aClass90_18.method5464()) / 2, (Static320.anInt6140 - Static322.aClass90_18.method5467()) / 2);
			Static287.aClass90_16.method5454((Static11.anInt5389 - Static287.aClass90_16.method5464()) / 2, 18);
		}
		arg0.method4455(Static320.anInt6140 / 2 - 26, Static341.anInt2259 == 1 ? Static107.aString85 : Static313.aString242, Static11.anInt5389 / 2, -1, arg5);
		@Pc(56) int local56 = Static320.anInt6140 / 2 - 18;
		arg1.method3263(Static11.anInt5389 / 2 - 152, local56, 304, 34, arg4, 0);
		arg1.method3263(Static11.anInt5389 / 2 - 151, local56 - -1, 302, 32, 0, 0);
		arg1.method3300(Static11.anInt5389 / 2 - 150, local56 - -2, Static220.anInt4304 * 3, 30, arg3, 0);
		arg1.method3300(Static11.anInt5389 / 2 + Static220.anInt4304 * 3 - 150, local56 + 2, 300 - Static220.anInt4304 * 3, 30, 0, 0);
		arg0.method4455(Static320.anInt6140 / 2 + 4, Static211.aString172, Static11.anInt5389 / 2, -1, arg5);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static void method1786() {
		for (@Pc(12) int local12 = 0; local12 < Static338.anInt6419; local12++) {
			@Pc(18) int local18 = Static25.anIntArray83[local12];
			@Pc(22) Class5_Sub3_Sub3_Sub2 local22 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local18];
			if (local22 != null) {
				Static172.method5112(local22, local22.aClass122_1.anInt3819);
			}
		}
	}
}
