import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[S")
	public static short[] aShortArray35;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!qb;")
	public static Class142 aClass142_7 = new Class142(16);

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString103 = "Loading interfaces - ";

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	public static int anInt1698 = 1;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(III)J")
	public static long method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt5733; local13++) {
			@Pc(22) Class161 local22 = local7.aClass161Array3[local13];
			if ((local22.aLong171 >> 29 & 0x3L) == 2L && local22.anInt4641 == arg1 && local22.anInt4636 == arg2) {
				return local22.aLong171;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
	public static boolean method1604(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZII)V")
	public static void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) int local18 = 0; local18 < Static293.anInt5272; local18++) {
			if (Static294.anIntArray467[local18] + Static233.anIntArray365[local18] > arg1 && Static294.anIntArray467[local18] < arg2 + arg1 && arg0 < Static217.anIntArray342[local18] + Static46.anIntArray57[local18] && Static217.anIntArray342[local18] < arg3 + arg0) {
				Static304.aBooleanArray23[local18] = true;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg6 < 1 || arg3 > 102 || arg6 > 102) {
			return;
		}
		@Pc(43) int local43;
		if (!Static278.method4290() && (Static104.aByteArrayArrayArray3[0][arg3][arg6] & 0x2) == 0) {
			local43 = arg4;
			if ((Static104.aByteArrayArrayArray3[arg4][arg3][arg6] & 0x8) != 0) {
				local43 = 0;
			}
			if (local43 != Static43.anInt905) {
				return;
			}
		}
		local43 = arg4;
		if (arg4 < 3 && (Static104.aByteArrayArrayArray3[1][arg3][arg6] & 0x2) == 2) {
			local43 = arg4 + 1;
		}
		Static15.method199(Static240.aClass118Array1[arg4], arg3, arg6, arg4, local43, arg0);
		if (arg1 >= 0) {
			@Pc(102) boolean local102 = Static239.aBoolean299;
			Static239.aBoolean299 = true;
			Static137.method2376(local43, false, arg2, arg4, Static240.aClass118Array1[arg4], arg1, arg6, false, arg5, arg3);
			Static239.aBoolean299 = local102;
		}
	}
}
