import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!wc;")
	public static Class4 aClass4_54;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!a;")
	public static Class1 aClass1_2439 = Static94.method1596("Benutzername: ");

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!pb;")
	public static Class46 aClass46_9 = new Class46();

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2440 = Static94.method1596("@yel@");

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2441 = Static94.method1596("compass");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method1565() {
		aClass1_2439 = null;
		aClass1_2440 = null;
		aClass4_54 = null;
		aClass46_9 = null;
		Class55.anIntArray289 = null;
		aClass1_2441 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1566() {
		Static15.method453();
		if (Static76.anInt2064 == 1) {
			Static65.aClass2_Sub1_Sub2_Sub4Array11[Static29.anInt1086 / 100].method1140(Static100.anInt2546 - 4 - 8, Static14.anInt680 - 4 + -8);
		}
		if (Static76.anInt2064 == 2) {
			Static65.aClass2_Sub1_Sub2_Sub4Array11[Static29.anInt1086 / 100 + 4].method1140(Static100.anInt2546 - 8 - 4, Static14.anInt680 + -4 - 8);
		}
		if (Static94.anInt2377 != -1) {
			Static107.method1776(Static94.anInt2377);
			Static41.method960(Static94.anInt2377, 334, 4, 512);
		}
		if (Static111.anInt2784 != -1) {
			Static107.method1776(Static111.anInt2784);
			Static41.method960(Static111.anInt2784, 334, 0, 512);
		}
		Static1.method22();
		if (!Static6.aBoolean11) {
			Static72.method1371();
			Static28.method741();
		} else if (Static18.anInt835 == 0) {
			Static41.method965();
		}
		if (Static50.anInt1642 == 1) {
			Static76.aClass2_Sub1_Sub2_Sub4_5.method1140(472, 296);
		}
		@Pc(153) int local153;
		if (Static32.aBoolean55) {
			@Pc(111) byte local111 = 20;
			@Pc(115) int local115 = 16776960;
			if (Static87.anInt2290 < 30 && Static77.aBoolean113) {
				local115 = 16711680;
			}
			if (Static87.anInt2290 < 20 && !Static77.aBoolean113) {
				local115 = 16711680;
			}
			Static88.aClass2_Sub1_Sub2_Sub1_1.method372(Static97.method1655(new Class1[] { Static102.aClass1_2698, Static43.method994(Static87.anInt2290) }), 20, local115);
			local115 = 16776960;
			local153 = local111 + 15;
			@Pc(155) Runtime local155 = Runtime.getRuntime();
			@Pc(165) int local165 = (int) ((local155.totalMemory() - local155.freeMemory()) / 1024L);
			if (local165 > 32768 && Static77.aBoolean113) {
				local115 = 16711680;
			}
			if (local165 > 65536 && !Static77.aBoolean113) {
				local115 = 16711680;
			}
			Static88.aClass2_Sub1_Sub2_Sub1_1.method372(Static97.method1655(new Class1[] { Static61.aClass1_1903, Static43.method994(local165), Static53.aClass1_1824 }), 35, local115);
			local153 += 15;
			if (Static66.aBoolean139) {
				Static88.aClass2_Sub1_Sub2_Sub1_1.method372(Static111.aClass1_2887, 50, 16711680);
				local153 += 15;
				Static66.aBoolean139 = false;
			}
			if (Static10.aBoolean150) {
				Static88.aClass2_Sub1_Sub2_Sub1_1.method372(Static94.aClass1_2472, local153, 16711680);
				local153 += 15;
				Static10.aBoolean150 = false;
			}
			if (Static20.aBoolean38) {
				Static88.aClass2_Sub1_Sub2_Sub1_1.method372(Static111.aClass1_2888, local153, 16711680);
				Static20.aBoolean38 = false;
				local153 += 15;
			}
		}
		if (Static95.anInt2397 == 0) {
			return;
		}
		@Pc(249) int local249 = Static95.anInt2397 / 50;
		local153 = local249 / 60;
		@Pc(257) int local257 = local249 % 60;
		if (local257 < 10) {
			Static88.aClass2_Sub1_Sub2_Sub1_1.method375(Static97.method1655(new Class1[] { Static102.aClass1_2693, Static43.method994(local153), Static27.aClass1_1010, Static43.method994(local257) }), 4, 329, 16776960);
		} else {
			Static88.aClass2_Sub1_Sub2_Sub1_1.method375(Static97.method1655(new Class1[] { Static102.aClass1_2693, Static43.method994(local153), Static72.aClass1_2045, Static43.method994(local257) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!bd;B)I")
	public static int method1567(@OriginalArg(0) Class8 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1706(Static54.aClass1_1828, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static1.aClass1_7, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static77.aClass1_2162, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static98.aClass1_2626, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static10.aClass1_2677, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static15.aClass1_653, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static102.aClass1_2697, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static72.aClass1_2043, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static12.aClass1_2746, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static88.aClass1_2437, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static17.aClass1_681, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static94.aClass1_2471, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static79.aClass1_2213, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static8.aClass1_422, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static12.aClass1_2754, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static39.aClass1_2857, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static97.aClass1_2623, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static108.aClass1_2810, Static12.aClass1_2755)) {
			local5++;
		}
		if (arg0.method1706(Static95.aClass1_2522, Static12.aClass1_2755)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ba;)Lclient!a;")
	public static Class1 method1568(@OriginalArg(1) Class2_Sub3 arg0) {
		return Static40.method1083(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZZBZ)Lclient!u;")
	public static Class8_Sub1 method1569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class57 local5 = null;
		if (Static25.aClass68_1 != null) {
			local5 = new Class57(arg0, Static25.aClass68_1, Static41.aClass68Array1[arg0], 1000000);
		}
		return new Class8_Sub1(local5, Static30.aClass57_1, arg0, arg2, arg3, arg1);
	}
}
