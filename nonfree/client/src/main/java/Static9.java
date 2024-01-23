import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "Lc", descriptor = "I")
	public static int anInt373 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ql;B)V")
	public static void method181(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(9) int local9 = arg0.method1780();
		Static135.aClass12Array1 = new Class12[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static135.aClass12Array1[local14] = new Class12();
			Static135.aClass12Array1[local14].anInt506 = arg0.method1780();
			Static135.aClass12Array1[local14].aString15 = arg0.method1765();
		}
		Static97.anInt3555 = arg0.method1780();
		Static108.anInt2877 = arg0.method1780();
		Static32.anInt932 = arg0.method1780();
		Static62.aClass115_Sub1Array2 = new Class115_Sub1[Static108.anInt2877 + 1 - Static97.anInt3555];
		for (@Pc(65) int local65 = 0; local65 < Static32.anInt932; local65++) {
			@Pc(71) int local71 = arg0.method1780();
			@Pc(79) Class115_Sub1 local79 = Static62.aClass115_Sub1Array2[local71] = new Class115_Sub1();
			local79.anInt4593 = arg0.method1772();
			local79.anInt4580 = arg0.method1802();
			local79.anInt4598 = Static97.anInt3555 + local71;
			local79.aString324 = arg0.method1765();
			local79.aString323 = arg0.method1765();
		}
		Static212.anInt4630 = arg0.method1802();
		Static65.aBoolean101 = true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
	public static void method182(@OriginalArg(0) int arg0) {
		Static19.anInt681 = 20;
		Static168.anInt3925 = 3;
		Static94.anInt4236 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ak;I)V")
	public static void method183(@OriginalArg(0) Class9_Sub1_Sub2 arg0) {
		for (@Pc(14) Class1_Sub28 local14 = (Class1_Sub28) Static87.aClass3_10.method30(); local14 != null; local14 = (Class1_Sub28) Static87.aClass3_10.method33()) {
			if (local14.aClass9_Sub1_Sub2_1 == arg0) {
				if (local14.aClass1_Sub4_Sub3_2 != null) {
					Static24.aClass1_Sub4_Sub4_1.method3081(local14.aClass1_Sub4_Sub3_2);
					local14.aClass1_Sub4_Sub3_2 = null;
				}
				local14.method4186();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V")
	public static void method185(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static96.anIntArray195[local7] = Static96.anIntArray195[local7 - 1];
			Static22.aStringArray20[local7] = Static22.aStringArray20[local7 - 1];
			Static134.aStringArray27[local7] = Static134.aStringArray27[local7 - 1];
			Static121.aStringArray23[local7] = Static121.aStringArray23[local7 - 1];
			Static66.anIntArray140[local7] = Static66.anIntArray140[local7 - 1];
		}
		Static96.anIntArray195[0] = arg2;
		Static66.anIntArray140[0] = arg3;
		Static22.aStringArray20[0] = arg1;
		Static249.anInt5327 = Static243.anInt5249;
		Static134.aStringArray27[0] = arg4;
		Static121.aStringArray23[0] = arg0;
		Static196.anInt1178++;
	}
}
