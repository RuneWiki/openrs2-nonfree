import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "Lclient!af;")
	private static Class5 aClass5_1432 = Static45.method1937("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!af;")
	public static Class5 aClass5_1431 = aClass5_1432;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "Lclient!af;")
	public static Class5 aClass5_1433 = Static45.method1937("(Y<)4col>");

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "Lclient!af;")
	private static Class5 aClass5_1435 = Static45.method1937("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "Lclient!af;")
	public static Class5 aClass5_1434 = aClass5_1435;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZII)I")
	public static int method2227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg1;
		return ((arg0 & 0xFF00) * local4 + arg1 * (arg2 & 0xFF00) & 0xFF0000) + ((arg0 & 0xFF00FF) * local4 + (arg1 * (arg2 & 0xFF00FF)) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!rd;)Lclient!af;")
	public static Class5 method2228(@OriginalArg(1) Class1_Sub20 arg0) {
		return Static80.method1411(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method2229() {
		aClass5_1432 = null;
		aClass5_1434 = null;
		aClass5_1435 = null;
		aClass5_1431 = null;
		aClass5_1433 = null;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
	public static void method2230() {
		Static90.aClass28_62.method792();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZBLclient!df;)V")
	public static void method2231(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(2) int local2 = arg1.anInt862;
		@Pc(10) int local10 = (int) arg1.aLong95;
		arg1.method2220();
		if (arg0) {
			Static55.method948(local2);
		}
		Static1.method53(local2);
		@Pc(29) Class1_Sub17 local29 = Static36.method680(local10);
		if (local29 != null) {
			Static119.method2161(local29);
		}
		Static69.aBoolean48 = false;
		Static18.anInt3043 = 0;
		Static98.method1648(Static24.anInt761, Static17.anInt514, Static27.anInt840, Static49.anInt1182);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!of;IIIIIII)V")
	public static void method2232(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static60.aBoolean41) {
			Static39.anInt1030 = 32;
		} else {
			Static39.anInt1030 = 0;
		}
		Static60.aBoolean41 = false;
		@Pc(137) int local137;
		if (Static85.anInt2157 != 0) {
			if (arg6 >= arg1 && arg6 < arg1 + 16 && arg2 >= arg3 && arg3 + 16 > arg2) {
				arg0.anInt2273 -= 4;
				Static119.method2161(arg0);
			} else if (arg6 >= arg1 && arg1 + 16 > arg6 && arg2 >= arg3 + arg5 - 16 && arg3 + arg5 > arg2) {
				arg0.anInt2273 += 4;
				Static119.method2161(arg0);
			} else if (arg1 - Static39.anInt1030 <= arg6 && Static39.anInt1030 + arg1 + 16 > arg6 && arg2 >= arg3 + 16 && arg3 + arg5 - 16 > arg2) {
				local137 = (arg5 - 32) * arg5 / arg4;
				if (local137 < 8) {
					local137 = 8;
				}
				@Pc(151) int local151 = arg5 - local137 - 32;
				@Pc(162) int local162 = arg2 - local137 / 2 - arg3 - 16;
				arg0.anInt2273 = (arg4 - arg5) * local162 / local151;
				Static119.method2161(arg0);
				Static60.aBoolean41 = true;
			}
		}
		if (Static120.anInt1843 == 0) {
			return;
		}
		local137 = arg0.anInt2305;
		if (arg1 - local137 <= arg6 && arg2 >= arg3 && arg1 + 16 > arg6 && arg2 <= arg5 + arg3) {
			arg0.anInt2273 += Static120.anInt1843 * 45;
			Static119.method2161(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ[B)Lclient!af;")
	public static Class5 method2233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) Class5 local5 = new Class5();
		local5.aByteArray2 = new byte[arg0];
		local5.anInt178 = 0;
		for (@Pc(18) int local18 = arg1; local18 < arg0 + arg1; local18++) {
			if (arg2[local18] != 0) {
				local5.aByteArray2[local5.anInt178++] = arg2[local18];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)I")
	public static int method2234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(44) int local44 = Static60.method1089(arg0 - 1, arg1 + -1) + Static60.method1089(arg0 - 1, arg1 + 1) + Static60.method1089(arg0 - -1, arg1 + -1) + Static60.method1089(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static60.method1089(arg0, arg1 - 1) + Static60.method1089(arg0, arg1 + 1) + Static60.method1089(arg0 + -1, arg1) + Static60.method1089(arg0 + 1, arg1);
		@Pc(83) int local83 = Static60.method1089(arg0, arg1);
		return local83 / 4 + local78 / 8 + local44 / 16;
	}
}
