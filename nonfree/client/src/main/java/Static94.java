import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "[I")
	public static int[] anIntArray369 = new int[2000];

	@OriginalMember(owner = "client!ih", name = "T", descriptor = "Lclient!qe;")
	public static Class78 aClass78_459 = Static199.method3560("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lclient!qe;)Lclient!qe;")
	public static Class78 method1640(@OriginalArg(1) Class78[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static97.method1689(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class104 local13 = local7.aClass104_1;
		if (local13 != null) {
			local13.anInt4644 = local13.anInt4644 * arg3 / 16;
			local13.anInt4645 = local13.anInt4645 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIILclient!qf;Lclient!qf;IIJ)V")
	public static void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class27 local8 = new Class27();
		local8.aLong30 = arg8;
		local8.anInt808 = arg1 * 128 + 64;
		local8.anInt810 = arg2 * 128 + 64;
		local8.anInt809 = arg3;
		local8.aClass5_2 = arg4;
		local8.aClass5_3 = arg5;
		local8.anInt811 = arg6;
		local8.anInt812 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static226.aClass2_Sub12ArrayArrayArray3[local42][arg1][arg2] == null) {
				Static226.aClass2_Sub12ArrayArrayArray3[local42][arg1][arg2] = new Class2_Sub12(local42, arg1, arg2);
			}
		}
		Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].aClass27_1 = local8;
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
	public static void method1645() {
		@Pc(21) int local21;
		for (@Pc(7) int local7 = -1; local7 < Static180.anInt4193; local7++) {
			if (local7 == -1) {
				local21 = 2047;
			} else {
				local21 = Static16.anIntArray792[local7];
			}
			@Pc(29) Class5_Sub2_Sub2 local29 = Static213.aClass5_Sub2_Sub2Array3[local21];
			if (local29 != null && local29.anInt1845 > 0) {
				local29.anInt1845--;
				if (local29.anInt1845 == 0) {
					local29.aClass78_422 = null;
				}
			}
		}
		for (local21 = 0; local21 < Static50.anInt908; local21++) {
			@Pc(61) int local61 = Static79.anIntArray286[local21];
			@Pc(65) Class5_Sub2_Sub1 local65 = Static95.aClass5_Sub2_Sub1Array1[local61];
			if (local65 != null && local65.anInt1845 > 0) {
				local65.anInt1845--;
				if (local65.anInt1845 == 0) {
					local65.aClass78_422 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
	public static void method1646() {
		Static43.aClass53_3.method1797();
	}
}
