import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!pb", name = "ub", descriptor = "I")
	public static int anInt2362;

	@OriginalMember(owner = "client!pb", name = "vb", descriptor = "Lclient!jd;")
	public static Class4_Sub11 aClass4_Sub11_2;

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_670 = Static60.method1113("(Y<)4col>");

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
	public static int anInt2348 = 0;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lclient!ec;")
	private static Class22 aClass22_671 = Static60.method1113("shake:");

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
	public static int anInt2354 = 0;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "[I")
	public static int[] anIntArray271 = new int[128];

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_672 = Static60.method1113("slide:");

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_673 = aClass22_672;

	@OriginalMember(owner = "client!pb", name = "qb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_674 = aClass22_671;

	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_675 = Static60.method1113("null");

	@OriginalMember(owner = "client!pb", name = "tb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_676 = aClass22_672;

	@OriginalMember(owner = "client!pb", name = "wb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_677 = Static60.method1113("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!pb", name = "xb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_678 = aClass22_671;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lclient!f;I)V")
	public static void method1557(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class4_Sub7 local18 = arg1[local12];
			if (local18 != null && local18.anInt802 == arg0 && (!local18.aBoolean79 || !Static98.method1667(local18))) {
				if (local18.anInt743 == 0) {
					if (!local18.aBoolean79 && Static98.method1667(local18) && Static43.aClass4_Sub7_10 != local18) {
						continue;
					}
					method1557(local18.anInt738, arg1);
					if (local18.aClass4_Sub7Array1 != null) {
						method1557(local18.anInt738, local18.aClass4_Sub7Array1);
					}
					@Pc(69) Class4_Sub21 local69 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local18.anInt738);
					if (local69 != null) {
						Static90.method1578(local69.anInt2939);
					}
				}
				if (local18.anInt743 == 6) {
					@Pc(100) int local100;
					if (local18.anInt749 != -1 || local18.anInt760 != -1) {
						@Pc(95) boolean local95 = Static70.method1177(local18);
						if (local95) {
							local100 = local18.anInt760;
						} else {
							local100 = local18.anInt749;
						}
						if (local100 != -1) {
							@Pc(113) Class4_Sub1_Sub17 local113 = Static79.method1437(local100);
							local18.anInt788 += Static46.anInt1293;
							while (local113.anIntArray327[local18.anInt747] < local18.anInt788) {
								local18.anInt788 -= local113.anIntArray327[local18.anInt747];
								local18.anInt747++;
								if (local113.anIntArray330.length <= local18.anInt747) {
									local18.anInt747 -= local113.anInt2998;
									if (local18.anInt747 < 0 || local113.anIntArray330.length <= local18.anInt747) {
										local18.anInt747 = 0;
									}
								}
								Static110.method1772(local18);
							}
						}
					}
					if (local18.anInt740 != 0 && !local18.aBoolean79) {
						@Pc(187) int local187 = local18.anInt740 >> 16;
						local100 = local18.anInt740 << 16 >> 16;
						@Pc(198) int local198 = local187 * Static46.anInt1293;
						local18.anInt775 = local198 + local18.anInt775 & 0x7FF;
						local100 *= Static46.anInt1293;
						local18.anInt808 = local18.anInt808 + local100 & 0x7FF;
						Static110.method1772(local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
	public static void method1558() {
		if (Static33.aClass57_1 != null) {
			@Pc(7) Class57 local7 = Static33.aClass57_1;
			synchronized (Static33.aClass57_1) {
				Static33.aClass57_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
	public static void method1559() {
		aShortArrayArray2 = null;
		anIntArray270 = null;
		aClass22_675 = null;
		aClass22_678 = null;
		aClass4_Sub11_2 = null;
		aClass22_674 = null;
		aClass22_676 = null;
		aClass22_677 = null;
		aClass22_671 = null;
		aClass22_672 = null;
		aClass22_673 = null;
		aClass22_670 = null;
		anIntArray271 = null;
	}
}
