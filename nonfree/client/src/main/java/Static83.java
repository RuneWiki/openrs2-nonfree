import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!ja;")
	public static Class33 aClass33_24;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_16;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
	public static int anInt2218;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1180 = Static23.method501(" million");

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Lclient!mb;")
	public static Class41 aClass41_5 = new Class41(4096);

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1181 = aClass42_1180;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
	public static int anInt2216 = 0;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1182 = Static23.method501("wishes to trade with you)3");

	@OriginalMember(owner = "client!qd", name = "T", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1183 = Static23.method501("Neuer Benutzer");

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1184 = Static23.method501("::clientdrop");

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1185 = Static23.method501("titlebox");

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1186 = Static23.method501("gelb:");

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1187 = null;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1188 = aClass42_1182;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method1515() {
		Static93.anInt2456 = 0;
		Static63.anInt1520 = 0;
		Static101.method1765();
		Static31.method1561();
		Static75.method991();
		Static7.method153();
		@Pc(24) int local24;
		for (@Pc(19) int local19 = 0; local19 < Static93.anInt2456; local19++) {
			local24 = Static64.anIntArray224[local19];
			if (Static27.anInt768 != Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24].anInt2559) {
				Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24] = null;
			}
		}
		if (Static20.anInt644 != Static80.aClass1_Sub8_Sub1_2.anInt1692) {
			throw new RuntimeException("gpp1 pos:" + Static80.aClass1_Sub8_Sub1_2.anInt1692 + " psize:" + Static20.anInt644);
		}
		for (local24 = 0; local24 < Static27.anInt770; local24++) {
			if (Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[Static68.anIntArray240[local24]] == null) {
				throw new RuntimeException("gpp2 pos:" + local24 + " size:" + Static27.anInt770);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZ)I")
	public static int method1516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public static void method1517() {
		aClass42_1185 = null;
		anIntArray339 = null;
		aClass41_5 = null;
		aClass33_Sub1_16 = null;
		aClass42_1184 = null;
		aClass42_1182 = null;
		aClass42_1180 = null;
		anIntArray340 = null;
		aClass42_1183 = null;
		aClass42_1188 = null;
		aClass42_1181 = null;
		aClass33_24 = null;
		aClass42_1187 = null;
		aClass42_1186 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ja;ILclient!ja;Lclient!ja;)V")
	public static void method1519(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) Class33 arg2) {
		Static97.aClass33_27 = arg2;
		Static54.aClass33_15 = arg1;
		Static89.aClass33_26 = arg0;
	}
}
