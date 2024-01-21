import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!pa", name = "mb", descriptor = "Lclient!fc;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!pa", name = "tb", descriptor = "Lclient!g;")
	public static Class26 aClass26_22;

	@OriginalMember(owner = "client!pa", name = "yb", descriptor = "[[Lclient!ve;")
	public static Class2_Sub2_Sub17[][] aClass2_Sub2_Sub17ArrayArray1;

	@OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
	public static int anInt1883 = 0;

	@OriginalMember(owner = "client!pa", name = "pb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1288 = Static72.method1077("Prepared sound engine");

	@OriginalMember(owner = "client!pa", name = "qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1289 = aClass74_1288;

	@OriginalMember(owner = "client!pa", name = "rb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1290 = Static72.method1077("Enter your username (V password)3");

	@OriginalMember(owner = "client!pa", name = "ub", descriptor = "Lclient!u;")
	public static Class74 aClass74_1291 = aClass74_1290;

	@OriginalMember(owner = "client!pa", name = "xb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1292 = Static72.method1077("mapmarker");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
	public static int method1326(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
	public static void method1327(@OriginalArg(0) boolean arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static29.anInt686; local9++) {
			@Pc(17) Class2_Sub2_Sub2_Sub1_Sub1 local17 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static40.anIntArray110[local9]];
			@Pc(25) int local25 = (Static40.anIntArray110[local9] << 14) + 536870912;
			if (local17 != null && local17.method1861() && arg0 == local17.aClass2_Sub2_Sub9_1.aBoolean44 && local17.aClass2_Sub2_Sub9_1.method774()) {
				@Pc(54) int local54 = local17.anInt2672 >> 7;
				@Pc(59) int local59 = local17.anInt2673 >> 7;
				if (local59 >= 0 && local59 < 104 && local54 >= 0 && local54 < 104) {
					if (local17.anInt2703 == 1 && (local17.anInt2673 & 0x7F) == 64 && (local17.anInt2672 & 0x7F) == 64) {
						if (Static55.anIntArrayArray4[local59][local54] == Static57.anInt1378) {
							continue;
						}
						Static55.anIntArrayArray4[local59][local54] = Static57.anInt1378;
					}
					if (!local17.aClass2_Sub2_Sub9_1.aBoolean47) {
						local25 += Integer.MIN_VALUE;
					}
					Static84.aClass69_1.method1637(Static117.anInt2529, local17.anInt2673, local17.anInt2672, Static15.method348((local17.anInt2703 - 1) * 64 + local17.anInt2673, local17.anInt2672 - -((local17.anInt2703 + -1) * 64), Static117.anInt2529), local17.anInt2703 * 64 + 60 - 64, local17, local17.anInt2720, local25, local17.aBoolean116);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 method1328() {
		@Pc(7) Class2_Sub2_Sub1_Sub1 local7 = new Class2_Sub2_Sub1_Sub1();
		local7.anIntArray17 = Static57.anIntArray156;
		local7.aByteArray1 = Static24.aByteArrayArray3[0];
		local7.anInt116 = Static71.anIntArray194[0];
		local7.anInt120 = Static66.anInt1466;
		local7.anInt117 = Static41.anInt966;
		local7.anInt121 = Static51.anIntArray312[0];
		local7.anInt118 = Static17.anIntArray54[0];
		local7.anInt119 = Static91.anIntArray265[0];
		Static37.method1354();
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	public static void method1329() {
		aClass74_1291 = null;
		aClass74_1288 = null;
		aClass74_1290 = null;
		aClass2_Sub2_Sub17ArrayArray1 = null;
		aClass74_1292 = null;
		aClass26_22 = null;
		aClass74_1289 = null;
		aClass24_2 = null;
	}
}
