import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Z")
	public static boolean aBoolean137;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public static int anInt1878 = 0;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!db;")
	public static Class31 aClass31_15 = new Class31(20);

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
	public static int[] anIntArray251 = new int[2];

	@OriginalMember(owner = "client!he", name = "u", descriptor = "I")
	public static int anInt1879 = -1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method1608() {
		Static26.aClass31_7.method856(5);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Lclient!jn;")
	public static Class88 method1609(@OriginalArg(0) int arg0) {
		@Pc(6) Class88 local6 = (Class88) Static277.aClass31_41.method852((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static29.aClass7_33.method253(arg0, 29);
		local6 = new Class88();
		if (local21 != null) {
			local6.method2131(arg0, new Class1_Sub18(local21));
		}
		Static277.aClass31_41.method851(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILclient!j;Lclient!j;IIIIJ)V")
	public static void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class63 local6 = new Class63();
		local6.aLong55 = arg10;
		local6.anInt1653 = arg1 * 128 + 64;
		local6.anInt1648 = arg2 * 128 + 64;
		local6.anInt1650 = arg3;
		local6.aClass6_4 = arg4;
		local6.aClass6_5 = arg5;
		local6.anInt1654 = arg6;
		local6.anInt1652 = arg7;
		local6.anInt1651 = arg8;
		local6.anInt1655 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static130.aClass1_Sub19ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static130.aClass1_Sub19ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub19(local46, arg1, arg2);
			}
		}
		Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local6;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method1611() {
		Static64.aClass31_12.method850();
	}
}
