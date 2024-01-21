import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!md", name = "ob", descriptor = "I")
	public static int anInt2480;

	@OriginalMember(owner = "client!md", name = "rb", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array7;

	@OriginalMember(owner = "client!md", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_956 = null;

	@OriginalMember(owner = "client!md", name = "mb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_961 = Static146.method2172("Attack");

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_957 = aClass77_961;

	@OriginalMember(owner = "client!md", name = "jb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_958 = Static146.method2172(" is already on your ignore list)3");

	@OriginalMember(owner = "client!md", name = "kb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_959 = Static146.method2172("level)2");

	@OriginalMember(owner = "client!md", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_960 = Static146.method2172("<col=ff9040>");

	@OriginalMember(owner = "client!md", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_962 = Static146.method2172("m");

	@OriginalMember(owner = "client!md", name = "pb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_963 = Static146.method2172(" (X");

	@OriginalMember(owner = "client!md", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_964 = Static146.method2172("ams");

	@OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
	public static int anInt2481 = 0;

	@OriginalMember(owner = "client!md", name = "tb", descriptor = "[I")
	public static int[] anIntArray396 = new int[100];

	@OriginalMember(owner = "client!md", name = "ub", descriptor = "Lclient!sg;")
	public static Class77 aClass77_965 = aClass77_959;

	@OriginalMember(owner = "client!md", name = "vb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_966 = aClass77_958;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!sg;ILclient!sg;Lclient!sg;I)V")
	public static void method1783(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) Class77 arg3) {
		for (@Pc(1) int local1 = 99; local1 > 0; local1--) {
			Static44.anIntArray185[local1] = Static44.anIntArray185[local1 - 1];
			Static107.aClass77Array17[local1] = Static107.aClass77Array17[local1 - 1];
			Static9.aClass77Array3[local1] = Static9.aClass77Array3[local1 - 1];
			Static166.aClass77Array25[local1] = Static166.aClass77Array25[local1 - 1];
		}
		Static107.aClass77Array17[0] = arg0;
		Static9.aClass77Array3[0] = arg3;
		Static8.anInt232 = Static52.anInt1417;
		Static44.anIntArray185[0] = arg1;
		Static166.aClass77Array25[0] = arg2;
		Static137.anInt3306++;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILclient!ke;IIZ)V")
	public static void method1784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(5) int arg3) {
		Static42.anInt1180 = arg3;
		Static3.aClass43_1 = arg2;
		Static58.anInt1528 = arg0;
		Static120.aBoolean53 = false;
		Static100.anInt811 = 2;
		Static71.anInt1924 = arg1;
		Static176.anInt4481 = 1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZII)Lclient!sg;")
	public static Class77 method1785(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24 = arg1 / 10;
		@Pc(26) int local26 = 1;
		while (local24 != 0) {
			local26++;
			local24 /= 10;
		}
		@Pc(40) int local40 = local26;
		if (arg1 < 0 || arg0) {
			local40 = local26 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local40];
		if (arg1 < 0) {
			local48[0] = 45;
		} else if (arg0) {
			local48[0] = 43;
		}
		for (@Pc(63) int local63 = 0; local63 < local26; local63++) {
			@Pc(68) int local68 = arg1 % 10;
			arg1 /= 10;
			if (local68 < 0) {
				local68 = -local68;
			}
			if (local68 > 9) {
				local68 += 39;
			}
			local48[local40 - local63 - 1] = (byte) (local68 + 48);
		}
		@Pc(106) Class77 local106 = new Class77();
		local106.anInt3606 = local40;
		local106.aByteArray46 = local48;
		return local106;
	}

	@OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V")
	public static void method1786() {
		Class2_Sub1_Sub20.anIntArray395 = null;
		aClass77_963 = null;
		aClass77_965 = null;
		aClass77_962 = null;
		aClass77_961 = null;
		anIntArray396 = null;
		aClass77_960 = null;
		aClass77_958 = null;
		aClass77_959 = null;
		aClass77_956 = null;
		aClass77_966 = null;
		aClass2_Sub2_Sub3_Sub2Array7 = null;
		aClass77_957 = null;
		anIntArrayArray18 = null;
		aClass77_964 = null;
	}
}
