import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!r", name = "Ob", descriptor = "I")
	public static int anInt2316;

	@OriginalMember(owner = "client!r", name = "Yb", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!r", name = "fc", descriptor = "I")
	public static int anInt2324;

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "[I")
	public static int[] anIntArray268 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1072 = Static14.method2017("null");

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1073 = Static14.method2017("Drop");

	@OriginalMember(owner = "client!r", name = "pb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1074 = Static14.method2017(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!r", name = "Xb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1078 = Static14.method2017(" seconds)3");

	@OriginalMember(owner = "client!r", name = "tb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1075 = aClass36_1078;

	@OriginalMember(owner = "client!r", name = "xb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1076 = aClass36_1073;

	@OriginalMember(owner = "client!r", name = "Kb", descriptor = "[I")
	public static int[] anIntArray270 = new int[100];

	@OriginalMember(owner = "client!r", name = "Vb", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public static void method1628() {
		anIntArray270 = null;
		aClass36_1074 = null;
		aClass36_1076 = null;
		aClass36_1078 = null;
		aClass36_1073 = null;
		aClass36_1075 = null;
		anIntArray268 = null;
		aClass36_1072 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B[Lclient!ad;IIIIIIILclient!sa;[B)V")
	public static void method1636(@OriginalArg(1) Class4[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class61 arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(10) Class2_Sub12 local10 = new Class2_Sub12(arg9);
		@Pc(27) int local27 = -1;
		while (true) {
			@Pc(31) int local31 = local10.method1397();
			if (local31 == 0) {
				return;
			}
			local27 += local31;
			@Pc(39) int local39 = 0;
			while (true) {
				@Pc(43) int local43 = local10.method1397();
				if (local43 == 0) {
					break;
				}
				local39 += local43 - 1;
				@Pc(57) int local57 = local39 >> 6 & 0x3F;
				@Pc(61) int local61 = local39 & 0x3F;
				@Pc(65) int local65 = local10.method1399();
				@Pc(69) int local69 = local39 >> 12;
				@Pc(73) int local73 = local65 >> 2;
				@Pc(77) int local77 = local65 & 0x3;
				if (arg6 == local69 && arg7 <= local57 && local57 < arg7 + 8 && arg1 <= local61 && arg1 + 8 > local61) {
					@Pc(112) Class2_Sub1_Sub13 local112 = Static2.method2072(local27);
					@Pc(129) int local129 = Static111.method2009(local57 & 0x7, local112.anInt2288, local112.anInt2326, local61 & 0x7, arg2, local77) + arg5;
					@Pc(146) int local146 = Static39.method756(local112.anInt2326, arg2, local77, local61 & 0x7, local112.anInt2288, local57 & 0x7) + arg3;
					if (local129 > 0 && local146 > 0 && local129 < 103 && local146 < 103) {
						@Pc(163) int local163 = arg4;
						if ((Static16.aByteArrayArrayArray3[1][local129][local146] & 0x2) == 2) {
							local163 = arg4 - 1;
						}
						@Pc(179) Class4 local179 = null;
						if (local163 >= 0) {
							local179 = arg0[local163];
						}
						Static99.method1469(local73, local146, local77 + arg2 & 0x3, local27, local179, arg8, local129, arg4);
					}
				}
			}
		}
	}
}
