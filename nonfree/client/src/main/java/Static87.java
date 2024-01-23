import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
	public static int anInt1806;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "Lclient!lc;")
	public static Class98 aClass98_55;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "Lclient!tk;")
	public static Class164 aClass164_2;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
	public static volatile int anInt1798 = -1;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)I")
	public static int method1398(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!fc;IIII)Z")
	public static boolean method1399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class108 local10 = Static155.method2472(arg2.anInt1363);
		if (local10.anInt3287 == -1) {
			return true;
		}
		if (arg2.aBoolean99) {
			@Pc(30) int local30 = arg0 + arg2.anInt1350;
			arg0 = local30 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(41) Class59_Sub2 local41 = local10.method2593(arg0, arg2.aBoolean100);
		if (local41 == null) {
			return false;
		}
		@Pc(53) int local53 = arg2.anInt1327;
		@Pc(56) int local56 = arg2.anInt1354;
		@Pc(59) int local59 = local41.anInt4747;
		if ((arg0 & 0x1) == 1) {
			local53 = arg2.anInt1354;
			local56 = arg2.anInt1327;
		}
		@Pc(76) int local76 = local41.anInt4749;
		if (local10.aBoolean206) {
			local76 = local56 * 4;
			local59 = local53 * 4;
		}
		if (local10.anInt3280 == 0) {
			local41.method3793(arg3 * 4 + 48, (-arg1 + 104 + -local56) * 4 + 48, local59, local76);
		} else {
			local41.method3801(arg3 * 4 + 48, (-local56 + 104 + -arg1) * 4 + 48, local59, local76, local10.anInt3280);
		}
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(39) int local39 = Static196.method3056(4, arg0 + 45365, arg1 + 91923) + (Static196.method3056(2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (Static196.method3056(1, arg0, arg1) - 128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(II)Z")
	public static boolean method1401(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(13) int local13 = Static299.aShortArray93[arg0];
		if (local13 >= 2000) {
			local13 -= 2000;
		}
		return local13 == 1002;
	}

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
	public static void method1402() {
		Static169.aFontMetrics1 = null;
		Static118.aFont1 = null;
		Static76.anImage1 = null;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void method1403() {
		Class4_Sub2_Sub4_Sub1.anIntArray194 = null;
		aClass98_55 = null;
		aClass164_2 = null;
	}

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "(I)Lclient!p;")
	public static Class4_Sub17 method1404() {
		@Pc(8) Class4_Sub17 local8 = new Class4_Sub17(34);
		local8.method1861(11);
		local8.method1861(Static165.anInt3301);
		local8.method1861(Static2.aBoolean2 ? 1 : 0);
		local8.method1861(Static73.aBoolean106 ? 1 : 0);
		local8.method1861(Static114.aBoolean166 ? 1 : 0);
		local8.method1861(Static238.aBoolean299 ? 1 : 0);
		local8.method1861(Static182.aBoolean234 ? 1 : 0);
		local8.method1861(Static268.aBoolean333 ? 1 : 0);
		local8.method1861(Static105.aBoolean162 ? 1 : 0);
		local8.method1861(Static171.aBoolean210 ? 1 : 0);
		local8.method1861(Static18.anInt380);
		local8.method1861(Static298.aBoolean357 ? 1 : 0);
		local8.method1861(Static139.aBoolean188 ? 1 : 0);
		local8.method1861(Static14.aBoolean154 ? 1 : 0);
		local8.method1861(Static222.anInt4407);
		local8.method1861(Static159.aBoolean203 ? 1 : 0);
		local8.method1861(Static150.anInt3043);
		local8.method1861(Static52.anInt1043);
		local8.method1861(Static71.anInt1312);
		local8.method1875(Static224.anInt4445);
		local8.method1875(Static176.anInt808);
		local8.method1861(Static109.method1758());
		local8.method1854(Static11.anInt216);
		local8.method1861(Static116.anInt2573);
		local8.method1861(Static169.aBoolean209 ? 1 : 0);
		local8.method1861(Static74.aBoolean115 ? 1 : 0);
		local8.method1861(Static86.anInt1777);
		local8.method1861(Static92.aBoolean144 ? 1 : 0);
		local8.method1861(Static266.aBoolean331 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)V")
	public static void method1405(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub2_Sub21 local12 = Static39.method4121(arg0, 3);
		local12.method4361();
	}
}
