import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "[Lclient!vm;")
	public static Class34_Sub3_Sub2_Sub1[] aClass34_Sub3_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public static final int anInt1959 = -1;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public static final int anInt1960 = 1400;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	public static boolean method1618(@OriginalArg(0) int arg0) {
		return arg0 == 19 || arg0 == 57 || arg0 == 1002 || arg0 == 17 || arg0 == 16;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method1619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static213.method3147(arg0, arg1) & Static1.method8751(arg0, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!aa;Lclient!ofa;IIZLclient!eb;ILjava/lang/String;Lclient!da;III)V")
	public static void method1620(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class91 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) Class67 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static451.anInt7263 == 4) {
			local13 = (int) Static318.aFloat81 & 0x3FFF;
		} else {
			local13 = Static234.anInt4142 + (int) Static318.aFloat81 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg1.anInt7024 / 2, arg1.anInt6997 / 2) + 10;
		@Pc(40) int local40 = arg9 * arg9 + arg8 * arg8;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(54) int local54 = Class94.anIntArray561[local13];
		@Pc(58) int local58 = Class94.anIntArray560[local13];
		if (Static451.anInt7263 != 4) {
			local54 = local54 * 256 / (Static30.anInt1549 + 256);
			local58 = local58 * 256 / (Static30.anInt1549 + 256);
		}
		@Pc(87) int local87 = arg8 * local54 + arg9 * local58 >> 14;
		@Pc(97) int local97 = local58 * arg8 - local54 * arg9 >> 14;
		@Pc(104) int local104 = arg4.method1856((Class6[]) null, arg6, 100);
		@Pc(112) int local112 = arg4.method1846((Class6[]) null, 0, 100, arg6);
		@Pc(118) int local118 = local87 - local104 / 2;
		if (local118 >= -arg1.anInt7024 && local118 <= arg1.anInt7024 && -arg1.anInt6997 <= local97 && local97 <= arg1.anInt6997) {
			arg7.method7672(arg1.anInt6997 / 2 + arg3 - local97 - arg5 - local112, arg1.anInt7024 / 2 + (local118 - -arg10), (Class6[]) null, (int[]) null, 1, arg6, local104, 0, 0, arg0, arg3, arg10, arg2, 0, 50);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method1621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static671.anInt9360 / (float) Static671.anInt9356;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(44) int local44 = arg3 - (arg0 - local13) / 2;
		@Pc(52) int local52 = arg1 - (arg2 - local11) / 2;
		Static146.anInt2698 = -1;
		Static81.anInt10273 = Static671.anInt9356 * local52 / local11;
		Static426.anInt6954 = -1;
		Static594.anInt9606 = Static671.anInt9360 - local44 * Static671.anInt9360 / local13;
		Static2.method25();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IC)Z")
	public static boolean method1625(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
