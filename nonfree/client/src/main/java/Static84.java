import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 aClass3_Sub1_Sub3_Sub3_6;

	@OriginalMember(owner = "client!ke", name = "W", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_9;

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "Lclient!vd;")
	public static Class83 aClass83_9;

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	public static int anInt1889 = 128;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1013 = Static122.method531(":tradereq:");

	@OriginalMember(owner = "client!ke", name = "db", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1014 = Static122.method531("Loading sprites )2 ");

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
	public static int anInt1893 = 1;

	@OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1015 = aClass73_1014;

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1016 = Static122.method531("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[BIILclient!i;[Lclient!pf;II)V")
	public static void method1459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class35 arg6, @OriginalArg(8) Class60[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) Class3_Sub12 local11 = new Class3_Sub12(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(23) int local23 = local11.method1379();
			if (local23 == 0) {
				return;
			}
			local17 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(37) int local37 = local11.method1379();
				if (local37 == 0) {
					break;
				}
				local31 += local37 - 1;
				@Pc(49) int local49 = local31 & 0x3F;
				@Pc(55) int local55 = local31 >> 6 & 0x3F;
				@Pc(59) int local59 = local31 >> 12;
				@Pc(63) int local63 = local11.method1354();
				@Pc(67) int local67 = local63 & 0x3;
				@Pc(71) int local71 = local63 >> 2;
				if (arg4 == local59 && local55 >= arg5 && arg5 + 8 > local55 && arg1 <= local49 && local49 < arg1 + 8) {
					@Pc(106) Class3_Sub1_Sub15 local106 = Static151.method2466(local17);
					@Pc(123) int local123 = Static20.method396(local106.anInt3012, local55 & 0x7, local106.anInt3014, local49 & 0x7, arg9, local67) + arg2;
					@Pc(141) int local141 = arg8 + Static133.method2206(local55 & 0x7, local106.anInt3012, local67, local49 & 0x7, local106.anInt3014, arg9);
					if (local123 > 0 && local141 > 0 && local123 < 103 && local141 < 103) {
						@Pc(153) int local153 = arg0;
						if ((Static110.aByteArrayArrayArray5[1][local123][local141] & 0x2) == 2) {
							local153 = arg0 - 1;
						}
						@Pc(167) Class60 local167 = null;
						if (local153 >= 0) {
							local167 = arg7[local153];
						}
						Static127.method483(local67 + arg9 & 0x3, arg0, local17, local141, local71, arg6, local123, local167);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
	public static void method1460() {
		aClass73_1016 = null;
		anIntArray192 = null;
		aClass73_1013 = null;
		aClass73_1014 = null;
		aClass83_9 = null;
		aClass13_Sub1_9 = null;
		aClass3_Sub1_Sub3_Sub3_6 = null;
		aBooleanArray7 = null;
		aClass73_1015 = null;
	}
}
