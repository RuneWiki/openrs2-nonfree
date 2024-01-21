import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt3015;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1102 = Static177.method3050("Untersuchen");

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1103 = Static177.method3050("The server is being updated)3");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1104 = Static177.method3050("Lade Sprites )2 ");

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1105 = aClass46_1103;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1106 = Static177.method3050("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1107 = Static177.method3050("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
	public static int method2231(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(32) int local32 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method2233() {
		Static3.method21(Static6.aClass1_2);
		Static174.anInt3906++;
		if (Static166.aBoolean143 && Static13.aBoolean24) {
			@Pc(28) int local28 = Static169.anInt3778;
			@Pc(30) int local30 = Static25.anInt620;
			local30 -= Static141.anInt3281;
			local28 -= Static128.anInt3049;
			if (local28 < Static88.anInt2260) {
				local28 = Static88.anInt2260;
			}
			if (Static27.aClass1_10.anInt20 + Static88.anInt2260 < Static6.aClass1_2.anInt20 + local28) {
				local28 = Static27.aClass1_10.anInt20 + Static88.anInt2260 - Static6.aClass1_2.anInt20;
			}
			@Pc(69) int local69 = local28 - Static28.anInt750;
			@Pc(77) int local77 = Static27.aClass1_10.anInt32 + local28 - Static88.anInt2260;
			if (Static143.anInt3335 > local30) {
				local30 = Static143.anInt3335;
			}
			@Pc(89) int local89 = Static6.aClass1_2.anInt37;
			if (local30 + Static6.aClass1_2.anInt50 > Static143.anInt3335 - -Static27.aClass1_10.anInt50) {
				local30 = Static27.aClass1_10.anInt50 + Static143.anInt3335 - Static6.aClass1_2.anInt50;
			}
			@Pc(114) int local114 = local30 - Static4.anInt2848;
			if (Static6.aClass1_2.anInt14 < Static174.anInt3906 && (local114 > local89 || -local89 > local114 || local69 > local89 || local69 < -local89)) {
				Static32.aBoolean41 = true;
			}
			@Pc(161) int local161 = Static27.aClass1_10.anInt18 + local30 - Static143.anInt3335;
			@Pc(170) Class4_Sub21 local170;
			if (Static6.aClass1_2.anObjectArray19 != null && Static32.aBoolean41) {
				local170 = new Class4_Sub21();
				local170.aClass1_40 = Static6.aClass1_2;
				local170.anInt3268 = local161;
				local170.anInt3265 = local77;
				local170.anObjectArray28 = Static6.aClass1_2.anObjectArray19;
				Static2.method18(local170);
			}
			if (Static177.anInt3974 == 0) {
				if (Static32.aBoolean41) {
					if (Static6.aClass1_2.anObjectArray16 != null) {
						local170 = new Class4_Sub21();
						local170.aClass1_40 = Static6.aClass1_2;
						local170.anInt3268 = local161;
						local170.anObjectArray28 = Static6.aClass1_2.anObjectArray16;
						local170.aClass1_39 = Static179.aClass1_51;
						local170.anInt3265 = local77;
						Static2.method18(local170);
					}
					if (Static179.aClass1_51 != null && Static183.method1442(Static6.aClass1_2) != null) {
						Static90.aClass4_Sub11_Sub1_1.method1285(84);
						Static90.aClass4_Sub11_Sub1_1.method1248(Static6.aClass1_2.anInt53);
						Static90.aClass4_Sub11_Sub1_1.method1256(Static179.aClass1_51.anInt53);
						Static90.aClass4_Sub11_Sub1_1.method1274(Static6.aClass1_2.anInt48);
						Static90.aClass4_Sub11_Sub1_1.method1274(Static179.aClass1_51.anInt48);
					}
				} else if ((Static89.anInt2296 == 1 || Static156.method2678(Static3.anInt86 - 1)) && Static3.anInt86 > 2) {
					Static41.method711();
				} else if (Static3.anInt86 > 0) {
					Static118.method2140(Static3.anInt86 - 1);
				}
				Static6.aClass1_2 = null;
			}
		} else if (Static174.anInt3906 > 1) {
			Static6.aClass1_2 = null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z")
	public static boolean method2234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static55.anInt1367 + arg0 * Static177.anInt3970 >> 16;
		@Pc(19) int local19 = arg2 * Static177.anInt3970 - arg0 * Static55.anInt1367 >> 16;
		@Pc(29) int local29 = arg1 * Static52.anInt1322 + local19 * Static80.anInt2008 >> 16;
		@Pc(39) int local39 = arg1 * Static80.anInt2008 - local19 * Static52.anInt1322 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static105.anInt2624 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static4.anInt2819 + (local39 << 9) / local29;
			return local55 >= Static177.anInt3973 && local55 <= Static54.anInt1365 && local63 >= Static118.anInt2877 && local63 <= Static178.anInt3989;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method2236(@OriginalArg(0) Class82 arg0) {
		Static55.aClass82_1 = arg0;
	}
}
