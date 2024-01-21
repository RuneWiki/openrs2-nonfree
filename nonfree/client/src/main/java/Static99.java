import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public static int anInt2295;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_779 = Static151.method2243("m");

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_780 = Static151.method2243("glow2:");

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_781 = aClass62_780;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!mb;")
	public static Class62 aClass62_782 = aClass62_780;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_783 = Static151.method2243("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
	public static void method1596() {
		for (@Pc(1) int local1 = 0; local1 < Static204.anInt4231; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static198.anInt4147; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static12.anInt319; local7++) {
					@Pc(16) Class2_Sub18 local16 = Static92.aClass2_Sub18ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class85 local21 = local16.aClass85_1;
						if (local21 != null && local21.aClass7_8.method3150()) {
							Static120.method1884(local21.aClass7_8, local1, local4, local7, 1, 1);
							if (local21.aClass7_9 != null && local21.aClass7_9.method3150()) {
								Static120.method1884(local21.aClass7_9, local1, local4, local7, 1, 1);
								local21.aClass7_8.method3144(local21.aClass7_9, 0, 0, 0, false);
								local21.aClass7_9 = local21.aClass7_9.method3142();
							}
							local21.aClass7_8 = local21.aClass7_8.method3142();
						}
						for (@Pc(77) int local77 = 0; local77 < local16.anInt3292; local77++) {
							@Pc(83) Class39 local83 = local16.aClass39Array2[local77];
							if (local83 != null && local83.aClass7_5.method3150()) {
								Static120.method1884(local83.aClass7_5, local1, local4, local7, local83.anInt1481 + 1 - local83.anInt1480, local83.anInt1482 - local83.anInt1484 + 1);
								local83.aClass7_5 = local83.aClass7_5.method3142();
							}
						}
						@Pc(125) Class10 local125 = local16.aClass10_1;
						if (local125 != null && local125.aClass7_1.method3150()) {
							Static93.method1401(local125.aClass7_1, local1, local4, local7);
							local125.aClass7_1 = local125.aClass7_1.method3142();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lclient!uc;")
	public static Class2_Sub1_Sub23 method1597(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub23 local6 = (Class2_Sub1_Sub23) Static109.aClass53_11.method1648((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static142.aClass71_28.method2130(Static143.method2158(arg0), Static2.method59(arg0));
		local6 = new Class2_Sub1_Sub23();
		local6.anInt3999 = arg0;
		if (local24 != null) {
			local6.method2760(new Class2_Sub11(local24));
		}
		Static109.aClass53_11.method1645((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static144.method2183(arg0, Static154.anInt3307, Static15.anInt353);
		@Pc(17) int local17 = Static144.method2183(arg6, Static154.anInt3307, Static15.anInt353);
		@Pc(23) int local23 = Static144.method2183(arg5, Static122.anInt2718, Static153.anInt3279);
		@Pc(29) int local29 = Static144.method2183(arg3, Static122.anInt2718, Static153.anInt3279);
		@Pc(37) int local37 = Static144.method2183(arg2 + arg0, Static154.anInt3307, Static15.anInt353);
		@Pc(45) int local45 = Static144.method2183(arg6 - arg2, Static154.anInt3307, Static15.anInt353);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static19.method345(arg4, Static55.anIntArrayArray8[local47], local23, local29);
		}
		for (@Pc(67) int local67 = local17; local67 > local45; local67--) {
			Static19.method345(arg4, Static55.anIntArrayArray8[local67], local23, local29);
		}
		@Pc(89) int local89 = Static144.method2183(arg2 + arg5, Static122.anInt2718, Static153.anInt3279);
		@Pc(98) int local98 = Static144.method2183(arg3 - arg2, Static122.anInt2718, Static153.anInt3279);
		for (@Pc(100) int local100 = local37; local100 <= local45; local100++) {
			@Pc(106) int[] local106 = Static55.anIntArrayArray8[local100];
			Static19.method345(arg4, local106, local23, local89);
			Static19.method345(arg1, local106, local89, local98);
			Static19.method345(arg4, local106, local98, local29);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ii;)Z")
	public static boolean method1600(@OriginalArg(1) Class47 arg0) {
		if (arg0.anInt1893 == 205) {
			Static184.anInt2028 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!mb;Lclient!mb;IJSII)V")
	public static void method1601(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static180.aBoolean167 || Static51.anInt1111 >= 500) {
			return;
		}
		Static6.aClass62Array5[Static51.anInt1111] = arg1;
		Static87.aClass62Array53[Static51.anInt1111] = arg0;
		Static26.aShortArray134[Static51.anInt1111] = arg3;
		Static150.aLongArray9[Static51.anInt1111] = arg2;
		Static147.anIntArray281[Static51.anInt1111] = arg5;
		Static102.anIntArray215[Static51.anInt1111] = arg4;
		Static51.anInt1111++;
	}
}
