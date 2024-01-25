import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_79 = new Class316(28, 4);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method5251() {
		for (@Pc(15) Class6_Sub26 local15 = (Class6_Sub26) Static408.aClass298_154.method6809(); local15 != null; local15 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			if (Static180.method2997(local15.anInt5472)) {
				Static116.method1820(local15);
			}
		}
		if (Static384.anInt7048 == 1) {
			Static286.method4360();
			return;
		}
		Static368.method5431(Static415.anInt7406, Static420.anInt8173, Static237.anInt4304, Static308.anInt5670);
		@Pc(53) int local53 = Static479.aClass202_13.method4970(Static146.aClass103_71.method2355(Static188.anInt28));
		for (@Pc(58) Class6_Sub26 local58 = (Class6_Sub26) Static408.aClass298_154.method6809(); local58 != null; local58 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			@Pc(64) int local64 = Static574.method4156(local58);
			if (local53 < local64) {
				local53 = local64;
			}
		}
		Static415.anInt7406 = (Static544.aBoolean506 ? 26 : 22) + Static384.anInt7048 * 16;
		Static237.anInt4304 = local53 + 8;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;ILclient!mj;ILclient!ta;ILclient!fa;IIILclient!faa;I)V")
	public static void method5252(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class202 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class97 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static60.anInt1008 == 4) {
			local11 = (int) Static562.aFloat14 & 0x3FFF;
		} else {
			local11 = Static63.anInt1086 + (int) Static562.aFloat14 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg9.anInt2690 / 2, arg9.anInt2670 / 2) + 10;
		@Pc(45) int local45 = arg6 * arg6 + arg1 * arg1;
		if (local45 > local32 * local32) {
			return;
		}
		@Pc(59) int local59 = Class22.anIntArray20[local11];
		@Pc(63) int local63 = Class22.anIntArray19[local11];
		if (Static60.anInt1008 != 4) {
			local63 = local63 * 256 / (Static213.anInt4015 + 256);
			local59 = local59 * 256 / (Static213.anInt4015 + 256);
		}
		@Pc(92) int local92 = arg6 * local59 + local63 * arg1 >> 14;
		@Pc(103) int local103 = arg6 * local63 - arg1 * local59 >> 14;
		@Pc(110) int local110 = arg2.method4974(arg0, 100, null);
		@Pc(116) int local116 = local92 - local110 / 2;
		@Pc(124) int local124 = arg2.method4971(arg0, null);
		if (-arg9.anInt2690 <= local116 && arg9.anInt2690 >= local116 && local103 >= -arg9.anInt2670 && arg9.anInt2670 >= local103) {
			arg4.method7878(1, arg5, arg0, 50, null, arg10, 0, local110, 0, null, arg8, arg10 + arg9.anInt2670 / 2 - local124 - arg3 - local103, arg9.anInt2690 / 2 + arg7 + local116, arg7);
		}
	}
}
