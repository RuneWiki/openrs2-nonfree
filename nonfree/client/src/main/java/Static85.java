import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ib", name = "jb", descriptor = "I")
	public static int anInt1691;

	@OriginalMember(owner = "client!ib", name = "nb", descriptor = "I")
	public static int anInt1693;

	@OriginalMember(owner = "client!ib", name = "tb", descriptor = "Lclient!b;")
	public static Class6 aClass6_51;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_889 = Static193.method3027("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "[I")
	public static final int[] anIntArray90 = new int[1000];

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_890 = Static193.method3027("VOLL");

	@OriginalMember(owner = "client!ib", name = "fb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_891 = Static193.method3027("Ok");

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_892 = Static193.method3027("blinken3:");

	@OriginalMember(owner = "client!ib", name = "lb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_893 = Static193.method3027("Checking for updates )2 ");

	@OriginalMember(owner = "client!ib", name = "mb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_894 = aClass70_893;

	@OriginalMember(owner = "client!ib", name = "ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_895 = Static193.method3027(":trade:");

	@OriginalMember(owner = "client!ib", name = "qb", descriptor = "I")
	public static int anInt1695 = 2;

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_896 = aClass70_891;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
	public static void method1228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub3_Sub4 local7 = Static35.method617(arg0);
		@Pc(10) int local10 = local7.anInt341;
		@Pc(20) int local20 = local7.anInt340;
		@Pc(23) int local23 = local7.anInt349;
		@Pc(30) int local30 = Class80.anIntArray247[local20 - local23];
		if (arg1 < 0 || local30 < arg1) {
			arg1 = 0;
		}
		local30 <<= local23;
		Static16.anIntArray27[local10] = local30 & arg1 << local23 | ~local30 & Static16.anIntArray27[local10];
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Lclient!dd;")
	public static Class3_Sub3_Sub6 method1229(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub3_Sub6 local17 = (Class3_Sub3_Sub6) Static126.aClass85_26.method2558((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static75.aClass52_16.method1581(16, arg0);
		local17 = new Class3_Sub3_Sub6();
		if (local27 != null) {
			local17.method616(new Class3_Sub4(local27));
		}
		Static126.aClass85_26.method2560(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIII)V")
	public static void method1230(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class45 local13 = local7.aClass45_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt1707;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class60 local58 = local7.aClass60_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt2477;
		@Pc(67) int local67 = local58.anInt2478;
		@Pc(70) int local70 = local58.anInt2480;
		@Pc(73) int local73 = local58.anInt2479;
		@Pc(77) int[] local77 = Static6.anIntArrayArray3[local23];
		@Pc(81) int[] local81 = Static142.anIntArrayArray21[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}
}
