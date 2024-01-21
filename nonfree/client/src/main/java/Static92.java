import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt1967;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "Lclient!ab;")
	public static Class3 aClass3_17;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	public static int anInt1970;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!ba;")
	public static Class11 aClass11_7;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_865 = Static187.method3089("Too many connections from your address)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!vd;")
	public static Class92 aClass92_861 = aClass92_865;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_864 = Static187.method3089("scroll:");

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!vd;")
	public static Class92 aClass92_862 = aClass92_864;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_863 = aClass92_864;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public static void method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static181.method2940(arg2, arg3, arg0, arg4);
		} else if (Static102.anInt2207 <= arg3 - arg4 && Static116.anInt2488 >= arg3 + arg4 && arg2 - arg1 >= Static118.anInt2521 && Static204.anInt2389 >= arg2 + arg1) {
			Static154.method2358(arg0, arg2, arg4, arg1, arg3);
		} else {
			Static206.method3379(arg4, arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1360() {
		Static18.aClass1_Sub14_Sub1_2.method3063();
		@Pc(7) int local7 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
		if (local7 == 0) {
			return;
		}
		@Pc(19) int local19 = Static18.aClass1_Sub14_Sub1_2.method3070(2);
		if (local19 == 0) {
			Static111.anIntArray183[Static147.anInt2991++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local19 == 1) {
			local43 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
			Static15.aClass8_Sub3_Sub1_1.method2677(false, local43);
			local53 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
			if (local53 == 1) {
				Static111.anIntArray183[Static147.anInt2991++] = 2047;
			}
			return;
		}
		@Pc(97) int local97;
		if (local19 == 2) {
			local43 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
			Static15.aClass8_Sub3_Sub1_1.method2677(true, local43);
			local53 = Static18.aClass1_Sub14_Sub1_2.method3070(3);
			Static15.aClass8_Sub3_Sub1_1.method2677(true, local53);
			local97 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
			if (local97 == 1) {
				Static111.anIntArray183[Static147.anInt2991++] = 2047;
			}
		} else if (local19 == 3) {
			local43 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
			if (local43 == 1) {
				Static111.anIntArray183[Static147.anInt2991++] = 2047;
			}
			local53 = Static18.aClass1_Sub14_Sub1_2.method3070(7);
			local97 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
			Static192.anInt4180 = Static18.aClass1_Sub14_Sub1_2.method3070(2);
			@Pc(156) int local156 = Static18.aClass1_Sub14_Sub1_2.method3070(7);
			Static15.aClass8_Sub3_Sub1_1.method2678(local156, local53, local97 == 1);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([B[Lclient!ag;IBI)V")
	public static void method1363(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class7[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local14.method3033();
			if (local24 == 0) {
				return;
			}
			@Pc(31) int local31 = 0;
			local20 += local24;
			while (true) {
				@Pc(39) int local39 = local14.method3047();
				if (local39 == 0) {
					break;
				}
				@Pc(48) int local48 = local14.method3010();
				local31 += local39 - 1;
				@Pc(58) int local58 = local48 >> 2;
				@Pc(62) int local62 = local31 >> 12;
				@Pc(68) int local68 = local31 >> 6 & 0x3F;
				@Pc(72) int local72 = local48 & 0x3;
				@Pc(76) int local76 = local31 & 0x3F;
				@Pc(80) int local80 = arg2 + local68;
				@Pc(84) int local84 = local76 + arg3;
				if (local80 > 0 && local84 > 0 && local80 < 103 && local84 < 103) {
					@Pc(101) int local101 = local62;
					if ((Static146.aByteArrayArrayArray33[1][local80][local84] & 0x2) == 2) {
						local101 = local62 - 1;
					}
					@Pc(117) Class7 local117 = null;
					if (local101 >= 0) {
						local117 = arg1[local101];
					}
					Static98.method1435(local84, local58, local72, local80, true, local20, local62, local117, local62, Static111.aBoolean141);
				}
			}
		}
	}
}
