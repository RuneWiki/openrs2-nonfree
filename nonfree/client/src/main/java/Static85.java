import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "Lclient!hg;")
	public static Class2_Sub2_Sub3_Sub4_Sub1 aClass2_Sub2_Sub3_Sub4_Sub1_3;

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "Lclient!ke;")
	public static Class43 aClass43_24;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	public static int anInt2203 = 0;

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!sg;")
	private static Class77 aClass77_869 = Static146.method2172("Loaded sprites");

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "Lclient!sg;")
	public static Class77 aClass77_870 = aClass77_869;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "Lclient!sg;")
	public static Class77 aClass77_871 = Static146.method2172("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "Lclient!sg;")
	public static Class77 aClass77_872 = Static146.method2172(" ");

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
	public static int anInt2206 = 0;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
	public static void method1557() {
		aClass43_24 = null;
		aClass2_Sub2_Sub3_Sub4_Sub1_3 = null;
		aClass77_872 = null;
		aClass77_869 = null;
		aClass77_870 = null;
		aClass77_871 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII[BILclient!og;[Lclient!vb;)V")
	public static void method1559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(9) Class60 arg8, @OriginalArg(10) Class86[] arg9) {
		@Pc(3) int local3 = -1;
		@Pc(19) Class2_Sub18 local19 = new Class2_Sub18(arg7);
		while (true) {
			@Pc(23) int local23 = local19.method2380();
			if (local23 == 0) {
				return;
			}
			@Pc(30) int local30 = 0;
			local3 += local23;
			while (true) {
				@Pc(38) int local38 = local19.method2380();
				if (local38 == 0) {
					break;
				}
				local30 += local38 - 1;
				@Pc(53) int local53 = local30 & 0x3F;
				@Pc(59) int local59 = local30 >> 6 & 0x3F;
				@Pc(63) int local63 = local30 >> 12;
				@Pc(67) int local67 = local19.method2387();
				@Pc(71) int local71 = local67 & 0x3;
				@Pc(75) int local75 = local67 >> 2;
				if (arg5 == local63 && arg6 <= local59 && arg6 + 8 > local59 && arg4 <= local53 && arg4 + 8 > local53) {
					@Pc(106) Class2_Sub2_Sub5 local106 = Static121.method2129(local3);
					@Pc(123) int local123 = Static143.method2427(local59 & 0x7, local71, local106.anInt520, arg0, local106.anInt538, local53 & 0x7) + arg1;
					@Pc(141) int local141 = arg2 + Static165.method2756(local106.anInt520, local53 & 0x7, local59 & 0x7, arg0, local106.anInt538, local71);
					if (local123 > 0 && local141 > 0 && local123 < 103 && local141 < 103) {
						@Pc(156) int local156 = arg3;
						if ((Static140.aByteArrayArrayArray6[1][local123][local141] & 0x2) == 2) {
							local156 = arg3 - 1;
						}
						@Pc(172) Class86 local172 = null;
						if (local156 >= 0) {
							local172 = arg9[local156];
						}
						Static10.method147(local172, arg8, local71 + arg0 & 0x3, arg3, local75, local3, local141, local123);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!v;BI)V")
	public static void method1560(@OriginalArg(0) Class2_Sub2_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		Static48.method919(arg0.anInt4385, arg1, arg0.anInt4400);
	}
}
