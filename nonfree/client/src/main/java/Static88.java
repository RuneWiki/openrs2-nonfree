import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_11;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!md;")
	public static Class51 aClass51_7 = new Class51(32);

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array16 = new Class60[100];

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_705 = Static158.method3034("Examine");

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_704 = aClass60_705;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public static int anInt2591 = 0;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_706 = Static158.method3034("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public static int anInt2600 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
	public static void method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static32.anIntArrayArrayArray4[arg0][arg1 + local3][arg2 + local7] = 0;
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static32.anIntArrayArrayArray4[arg0][arg1][local7 + arg2] = Static32.anIntArrayArrayArray4[arg0][arg1 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static32.anIntArrayArrayArray4[arg0][arg1 + local7][arg2] = Static32.anIntArrayArrayArray4[arg0][arg1 + local7][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static32.anIntArrayArrayArray4[arg0][arg1 - 1][arg2] != 0) {
			Static32.anIntArrayArrayArray4[arg0][arg1][arg2] = Static32.anIntArrayArrayArray4[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static32.anIntArrayArrayArray4[arg0][arg1][arg2 - 1] != 0) {
			Static32.anIntArrayArrayArray4[arg0][arg1][arg2] = Static32.anIntArrayArrayArray4[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static32.anIntArrayArrayArray4[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static32.anIntArrayArrayArray4[arg0][arg1][arg2] = Static32.anIntArrayArrayArray4[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lclient!ei;")
	public static Class2_Sub1_Sub8 method2046(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub8 local6 = (Class2_Sub1_Sub8) Static38.aClass89_11.method3437((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static63.aClass13_13.method521(Static130.method2742(arg0), Static164.method3099(arg0));
		local6 = new Class2_Sub1_Sub8();
		local6.anInt1545 = arg0;
		if (local24 != null) {
			local6.method1155(new Class2_Sub3(local24));
		}
		local6.method1157();
		if (local6.anInt1538 != -1) {
			local6.method1151(method2046(local6.anInt1538), method2046(local6.anInt1533));
		}
		if (!Static48.aBoolean55 && local6.aBoolean58) {
			local6.aClass60_363 = Static36.aClass60_251;
			local6.aClass60Array8 = null;
			local6.anInt1565 = 0;
			local6.aClass60Array9 = null;
			local6.aBoolean57 = false;
		}
		Static38.aClass89_11.method3432(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method2047() {
		if (Static159.aClass66_41 != null) {
			Static159.aClass66_41.method2834();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static62.method1443(arg6)) {
			Static33.method821(arg5, arg2, arg1, -1, arg0, arg4, Static197.aClass72ArrayArray1[arg6], arg3);
		}
	}
}
