import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!tb", name = "Pb", descriptor = "Lclient!bc;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!tb", name = "Wb", descriptor = "Lclient!wc;")
	public static Class4 aClass4_59;

	@OriginalMember(owner = "client!tb", name = "Zb", descriptor = "Lclient!bc;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!tb", name = "bc", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!tb", name = "dc", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!tb", name = "gc", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!tb", name = "ic", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!tb", name = "Rb", descriptor = "[[I")
	public static int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tb", name = "Yb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2621 = Static94.method1596("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!tb", name = "ac", descriptor = "Lclient!a;")
	public static Class1 aClass1_2622 = Static94.method1596("Die Verbindung konnte");

	@OriginalMember(owner = "client!tb", name = "hc", descriptor = "Lclient!a;")
	public static Class1 aClass1_2623 = Static94.method1596("redstone2");

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIB)I")
	public static int method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Lclient!a;)Lclient!a;")
	public static Class1 method1655(@OriginalArg(1) Class1[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static79.method1463(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public static void method1656(@OriginalArg(1) boolean arg0) {
		if (Static30.anInt1133 == Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 >> 7 && Static90.anInt2337 == Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 >> 7) {
			Static30.anInt1133 = 0;
		}
		@Pc(29) int local29 = Static99.anInt2521;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(43) Class2_Sub1_Sub1_Sub1_Sub1 local43;
			@Pc(41) int local41;
			if (arg0) {
				local41 = 33538048;
				local43 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1;
			} else {
				local41 = Static93.anIntArray292[local35] << 14;
				local43 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local35]];
			}
			if (local43 != null && local43.method1783()) {
				local43.aBoolean8 = false;
				@Pc(71) int local71 = local43.anInt2724 >> 7;
				@Pc(76) int local76 = local43.anInt2717 >> 7;
				if ((Static77.aBoolean113 && Static99.anInt2521 > 50 || Static99.anInt2521 > 200) && !arg0 && local43.anInt2747 == local43.anInt2708) {
					local43.aBoolean8 = true;
				}
				if (local71 >= 0 && local71 < 104 && local76 >= 0 && local76 < 104) {
					if (local43.aClass2_Sub1_Sub1_Sub5_1 == null || local43.anInt298 > Static69.anInt2806 || Static69.anInt2806 >= local43.anInt292) {
						if ((local43.anInt2724 & 0x7F) == 64 && (local43.anInt2717 & 0x7F) == 64) {
							if (Static80.anInt2129 == Static102.anIntArrayArray25[local71][local76]) {
								continue;
							}
							Static102.anIntArrayArray25[local71][local76] = Static80.anInt2129;
						}
						local43.anInt293 = Static65.method1338(Static2.anInt287, local43.anInt2724, local43.anInt2717);
						Static109.aClass3_1.method166(Static2.anInt287, local43.anInt2724, local43.anInt2717, local43.anInt293, 60, local43, local43.anInt2741, local41, local43.aBoolean158);
					} else {
						local43.aBoolean8 = false;
						local43.anInt293 = Static65.method1338(Static2.anInt287, local43.anInt2724, local43.anInt2717);
						Static109.aClass3_1.method144(Static2.anInt287, local43.anInt2724, local43.anInt2717, local43.anInt293, local43, local43.anInt2741, local41, local43.anInt280, local43.anInt297, local43.anInt283, local43.anInt300);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1658() {
		aClass1_2622 = null;
		aClass4_59 = null;
		anIntArray308 = null;
		anIntArrayArray22 = null;
		aClass2_Sub1_Sub2_Sub1_3 = null;
		anIntArray309 = null;
		aClass1_2621 = null;
		aClass1_2623 = null;
		anIntArray307 = null;
		anIntArray310 = null;
		aClass2_Sub1_Sub2_Sub1_2 = null;
	}
}
