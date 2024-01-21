import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "Lclient!c;")
	public static Class11 aClass11_10 = new Class11();

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
	public static int anInt2245 = 0;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	public static final int anInt2248 = 50;

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1083 = Static109.method1737("Loaded gamescreen");

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1085 = Static109.method1737("Use");

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1084 = aClass53_1085;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array16 = new Class53[100];

	@OriginalMember(owner = "client!qc", name = "lb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1086 = Static109.method1737(": ");

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "Lclient!na;")
	public static Class53 aClass53_1087 = Static109.method1737("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1088 = aClass53_1083;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)Z")
	public static boolean method1556() {
		return Static40.anInt1183 == 0 ? Static120.aClass3_Sub10_Sub4_2.method1899() : true;
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
	public static void method1557() {
		if (Static6.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static22.anIntArray72[219] = 42;
			Static22.anIntArray72[223] = 28;
			Static22.anIntArray72[191] = 73;
			Static22.anIntArray72[192] = 58;
			Static22.anIntArray72[222] = 59;
			Static22.anIntArray72[188] = 71;
			Static22.anIntArray72[187] = 27;
			Static22.anIntArray72[186] = 57;
			Static22.anIntArray72[220] = 74;
			Static22.anIntArray72[221] = 43;
			Static22.anIntArray72[189] = 26;
			Static22.anIntArray72[190] = 72;
			return;
		}
		Static22.anIntArray72[44] = 71;
		Static22.anIntArray72[47] = 73;
		Static22.anIntArray72[46] = 72;
		Static22.anIntArray72[93] = 43;
		Static22.anIntArray72[45] = 26;
		Static22.anIntArray72[61] = 27;
		Static22.anIntArray72[59] = 57;
		Static22.anIntArray72[92] = 74;
		Static22.anIntArray72[91] = 42;
		if (Static6.aMethod2 == null) {
			Static22.anIntArray72[222] = 59;
			Static22.anIntArray72[192] = 58;
		} else {
			Static22.anIntArray72[520] = 59;
			Static22.anIntArray72[192] = 28;
			Static22.anIntArray72[222] = 58;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
	public static int method1561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	public static void method1565() {
		aClass53Array16 = null;
		aClass11_10 = null;
		aClass53_1086 = null;
		aClass53_1085 = null;
		aClass53_1087 = null;
		aClass53_1088 = null;
		aClass53_1084 = null;
		aClass53_1083 = null;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 method1566() {
		@Pc(5) Class3_Sub1_Sub5_Sub4 local5 = new Class3_Sub1_Sub5_Sub4();
		local5.anInt1939 = Static95.anInt2272;
		local5.anInt1941 = Static103.anIntArray321[0];
		local5.anInt1938 = Static39.anInt1179;
		local5.anInt1942 = Static53.anIntArray273[0];
		local5.anInt1943 = Static32.anIntArray116[0];
		local5.anInt1940 = Static32.anIntArray117[0];
		@Pc(39) byte[] local39 = Static7.aByteArrayArray1[0];
		@Pc(45) int local45 = local5.anInt1941 * local5.anInt1942;
		local5.anIntArray257 = new int[local45];
		for (@Pc(57) int local57 = 0; local57 < local45; local57++) {
			local5.anIntArray257[local57] = Static97.anIntArray312[local39[local57] & 0xFF];
		}
		Static68.method1179();
		return local5;
	}
}
