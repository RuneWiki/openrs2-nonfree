import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
	public static int anInt2744 = 0;

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_878 = Static161.method2971("Konfig geladen)3");

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_879 = Static161.method2971("Benutzername: ");

	@OriginalMember(owner = "client!kh", name = "hb", descriptor = "I")
	public static int anInt2756 = 0;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)I")
	public static int method1974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method1976(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static110.method2156(local13) : local13;
		} else if (arg1 instanceof Class10) {
			@Pc(27) Class10 local27 = (Class10) arg1;
			return local27.method847();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class21 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class21(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static170.aClass1_Sub10ArrayArrayArray35[local14][arg1][arg2] == null) {
					Static170.aClass1_Sub10ArrayArrayArray35[local14][arg1][arg2] = new Class1_Sub10(local14, arg1, arg2);
				}
			}
			Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass21_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class21(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static170.aClass1_Sub10ArrayArrayArray35[local14][arg1][arg2] == null) {
					Static170.aClass1_Sub10ArrayArrayArray35[local14][arg1][arg2] = new Class1_Sub10(local14, arg1, arg2);
				}
			}
			Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass21_1 = local12;
		} else {
			@Pc(134) Class51 local134 = new Class51(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static170.aClass1_Sub10ArrayArrayArray35[local14][arg1][arg2] == null) {
					Static170.aClass1_Sub10ArrayArrayArray35[local14][arg1][arg2] = new Class1_Sub10(local14, arg1, arg2);
				}
			}
			Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass51_1 = local134;
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	public static void method1979() {
		aClass13_879 = null;
		aClass13_878 = null;
	}
}
