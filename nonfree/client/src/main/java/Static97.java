import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "Lclient!kc;")
	public static Class22 aClass22_17;

	@OriginalMember(owner = "client!rb", name = "tb", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!rb", name = "Ob", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_981 = Static2.method59("Members object");

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Lclient!wd;")
	public static Class80 aClass80_977 = aClass80_981;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!rb", name = "sb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_982 = Static2.method59("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_978 = aClass80_982;

	@OriginalMember(owner = "client!rb", name = "ub", descriptor = "Lclient!wd;")
	private static Class80 aClass80_983 = Static2.method59("Loaded fonts");

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_980 = aClass80_983;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
	public static int anInt2557 = 0;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	public static int anInt2559 = -1;

	@OriginalMember(owner = "client!rb", name = "xb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_984 = Static2.method59("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!rb", name = "Eb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_985 = Static2.method59("Select a world");

	@OriginalMember(owner = "client!rb", name = "Kb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_986 = aClass80_985;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
	public static void method1578() {
		anIntArray332 = null;
		aClass80_982 = null;
		aClass80_985 = null;
		aClass80_981 = null;
		aByteArrayArrayArray6 = null;
		aClass80_980 = null;
		aClass80_983 = null;
		aClass80_977 = null;
		aClass22_17 = null;
		aClass80_978 = null;
		aClass80_986 = null;
		aClass80_984 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BIILclient!sa;I[Lclient!me;IZII)V")
	public static void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class64 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class49[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(11) Class2_Sub17 local11 = new Class2_Sub17(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local11.method1787();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local11.method1787();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(49) int local49 = local11.method1780();
				@Pc(53) int local53 = local29 >> 12;
				@Pc(59) int local59 = local29 >> 6 & 0x3F;
				@Pc(63) int local63 = local49 >> 2;
				@Pc(67) int local67 = local49 & 0x3;
				if (local53 == arg0 && local59 >= arg5 && arg5 + 8 > local59 && arg2 <= local45 && local45 < arg2 + 8) {
					@Pc(106) Class2_Sub1_Sub10 local106 = Static18.method404(local17);
					@Pc(123) int local123 = Static71.method1135(local59 & 0x7, local106.anInt1634, local106.anInt1630, local45 & 0x7, local67, arg7) + arg8;
					@Pc(140) int local140 = Static17.method326(local106.anInt1630, local106.anInt1634, local59 & 0x7, local45 & 0x7, local67, arg7) + arg3;
					if (local123 > 0 && local140 > 0 && local123 < 103 && local140 < 103) {
						@Pc(159) int local159 = arg9;
						@Pc(161) Class49 local161 = null;
						if ((Static108.aByteArrayArrayArray7[1][local123][local140] & 0x2) == 2) {
							local159 = arg9 - 1;
						}
						if (local159 >= 0) {
							local161 = arg6[local159];
						}
						Static1.method6(local123, arg9, local161, local63, arg4, local67 + arg7 & 0x3, local140, local17);
					}
				}
			}
		}
	}
}
