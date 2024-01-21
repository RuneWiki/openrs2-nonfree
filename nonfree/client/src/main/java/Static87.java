import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ih", name = "U", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_7 = new Class53(64);

	@OriginalMember(owner = "client!ih", name = "V", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_606 = Static151.method2243("Please reload this page)3");

	@OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
	public static int anInt1821 = 0;

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
	public static int anInt1822 = 0;

	@OriginalMember(owner = "client!ih", name = "jb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_607 = aClass62_606;

	@OriginalMember(owner = "client!ih", name = "nb", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array53 = new Class62[500];

	@OriginalMember(owner = "client!ih", name = "ob", descriptor = "Lclient!lc;")
	public static final Class58 aClass58_9 = new Class58(4096);

	@OriginalMember(owner = "client!ih", name = "pb", descriptor = "I")
	public static int anInt1830 = 0;

	@OriginalMember(owner = "client!ih", name = "rb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_608 = Static151.method2243("New User");

	@OriginalMember(owner = "client!ih", name = "sb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_609 = aClass62_608;

	@OriginalMember(owner = "client!ih", name = "tb", descriptor = "Lclient!q;")
	public static final Class79 aClass79_9 = new Class79(50);

	@OriginalMember(owner = "client!ih", name = "ub", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_610 = Static151.method2243("Stufe)2");

	@OriginalMember(owner = "client!ih", name = "vb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_611 = Static151.method2243("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Lclient!md;")
	public static Class2_Sub1_Sub16 method1233(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub16 local8 = (Class2_Sub1_Sub16) Static21.aClass53_2.method1648((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(24) byte[] local24 = Static179.aClass71_Sub1_23.method2130(arg0, 0);
		if (local24 == null) {
			return null;
		}
		local8 = new Class2_Sub1_Sub16();
		@Pc(37) Class2_Sub11 local37 = new Class2_Sub11(local24);
		local37.anInt2235 = local37.aByteArray26.length - 2;
		@Pc(50) int local50 = local37.method1557();
		@Pc(61) int local61 = local37.aByteArray26.length - local50 - 2 - 12;
		local37.anInt2235 = local61;
		@Pc(68) int local68 = local37.method1577();
		local8.anInt2682 = local37.method1557();
		local8.anInt2681 = local37.method1557();
		local8.anInt2685 = local37.method1557();
		local8.anInt2683 = local37.method1557();
		@Pc(94) int local94 = local37.method1534();
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (local94 > 0) {
			local8.aClass58Array1 = new Class58[local94];
			for (local105 = 0; local105 < local94; local105++) {
				local111 = local37.method1557();
				@Pc(118) Class58 local118 = new Class58(Static131.method1032(local111));
				local8.aClass58Array1[local105] = local118;
				while (local111-- > 0) {
					@Pc(131) int local131 = local37.method1577();
					@Pc(135) int local135 = local37.method1577();
					local118.method1708(new Class2_Sub19(local135), (long) local131);
				}
			}
		}
		local37.anInt2235 = 0;
		local8.aClass62_943 = local37.method1573();
		local105 = 0;
		local8.anIntArray241 = new int[local68];
		local8.aClass62Array84 = new Class62[local68];
		local8.anIntArray242 = new int[local68];
		while (local37.anInt2235 < local61) {
			local111 = local37.method1557();
			if (local111 == 3) {
				local8.aClass62Array84[local105] = local37.method1538();
			} else if (local111 >= 100 || local111 == 21 || local111 == 38 || local111 == 39) {
				local8.anIntArray242[local105] = local37.method1534();
			} else {
				local8.anIntArray242[local105] = local37.method1577();
			}
			local8.anIntArray241[local105++] = local111;
		}
		Static21.aClass53_2.method1645((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!dh;)V")
	public static void method1235(@OriginalArg(1) Class7_Sub2 arg0) {
		arg0.anInt3084 = 0;
		@Pc(7) int local7 = arg0.anInt3069 - Static25.anInt581;
		if (arg0.anInt3061 == 0) {
			arg0.anInt3098 = 1024;
		}
		@Pc(35) int local35 = arg0.anInt3048 * 64 + arg0.anInt3047 * 128;
		@Pc(45) int local45 = arg0.anInt3048 * 64 + arg0.anInt3076 * 128;
		arg0.anInt3085 += (local35 - arg0.anInt3085) / local7;
		arg0.anInt3046 += (local45 - arg0.anInt3046) / local7;
		if (arg0.anInt3061 == 1) {
			arg0.anInt3098 = 1536;
		}
		if (arg0.anInt3061 == 2) {
			arg0.anInt3098 = 0;
		}
		if (arg0.anInt3061 == 3) {
			arg0.anInt3098 = 512;
		}
	}

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
	public static void method1236() {
		aClass53_7.method1649();
	}
}
