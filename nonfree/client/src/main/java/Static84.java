import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "[I")
	public static int[] anIntArray209 = new int[4096];

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
	public static int anInt2160 = -1;

	@OriginalMember(owner = "client!ij", name = "I", descriptor = "Lclient!i;")
	public static Class41 aClass41_638 = Static184.method2923("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
	public static int[] anIntArray210 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ij", name = "P", descriptor = "Lclient!i;")
	public static Class41 aClass41_639 = Static184.method2923("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	public static void method1524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static179.anInt4150 < 2 && Static26.anInt665 == 0 && !Static9.aBoolean16) {
			return;
		}
		@Pc(46) Class41 local46;
		if (Static26.anInt665 == 1 && Static179.anInt4150 < 2) {
			local46 = Static149.method2324(new Class41[] { Static33.aClass41_232, Static209.aClass41_1245, Static68.aClass41_561, Static145.aClass41_919 });
		} else if (Static9.aBoolean16 && Static179.anInt4150 < 2) {
			local46 = Static149.method2324(new Class41[] { Static177.aClass41_1092, Static209.aClass41_1245, Static26.aClass41_174, Static145.aClass41_919 });
		} else {
			local46 = Static68.method1244(Static179.anInt4150 - 1);
		}
		if (Static179.anInt4150 > 2) {
			local46 = Static149.method2324(new Class41[] { local46, Static43.aClass41_374, Static152.method2471(Static179.anInt4150 - 2), Static90.aClass41_659 });
		}
		@Pc(134) int local134 = Static49.aClass2_Sub2_Sub4_3.method795(local46, arg1 + 4, arg0 + 15, Static62.aRandom1, Static25.anInt4763);
		Static111.method1901(15, local134 + Static49.aClass2_Sub2_Sub4_3.method788(local46), arg0, arg1 + 4);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIBII)V")
	public static void method1526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg2 < 128 || arg4 < 128 || arg2 > 13056 || arg4 > 13056) {
			Static23.anInt595 = -1;
			Static30.anInt726 = -1;
			return;
		}
		@Pc(42) int local42 = Static212.method3261(arg2, arg4, Static134.anInt3147) - arg1;
		@Pc(46) int local46 = arg4 - Static163.anInt3822;
		@Pc(50) int local50 = arg2 - Static69.anInt1817;
		@Pc(54) int local54 = local42 - Static94.anInt2320;
		@Pc(58) int local58 = Class79.anIntArray377[Static183.anInt1325];
		@Pc(62) int local62 = Class79.anIntArray375[Static183.anInt1325];
		@Pc(66) int local66 = Class79.anIntArray375[Static152.anInt3512];
		@Pc(70) int local70 = Class79.anIntArray377[Static152.anInt3512];
		@Pc(80) int local80 = local66 * local50 + local46 * local70 >> 16;
		@Pc(91) int local91 = local66 * local46 - local70 * local50 >> 16;
		@Pc(93) int local93 = local80;
		@Pc(104) int local104 = local62 * local54 - local58 * local91 >> 16;
		@Pc(115) int local115 = local54 * local58 + local62 * local91 >> 16;
		if (local115 < 50) {
			Static23.anInt595 = -1;
			Static30.anInt726 = -1;
		} else {
			Static30.anInt726 = (local104 << 9) / local115 + arg0;
			Static23.anInt595 = arg3 + (local93 << 9) / local115;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!i;I)V")
	public static void method1527(@OriginalArg(0) Class41 arg0) {
		if (Static60.anInt4780 >= 2) {
			@Pc(15) int local15;
			@Pc(34) int local34;
			if (arg0.method1413(Static68.aClass41_562)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(24) Runtime local24 = Runtime.getRuntime();
				local34 = (int) ((local24.totalMemory() - local24.freeMemory()) / 1024L);
				Static198.method3075(Static149.method2324(new Class41[] { Static137.aClass41_875, Static152.method2471(local34), Static96.aClass41_702 }), 0, null);
			}
			if (arg0.method1413(Static10.aClass41_77)) {
				Static177.method2842();
			}
			if (arg0.method1413(Static220.aClass41_1290)) {
				Static133.aBoolean166 = true;
			}
			if (arg0.method1413(Static32.aClass41_223)) {
				Static133.aBoolean166 = false;
			}
			arg0.method1413(Static40.aClass41_361);
			arg0.method1413(Static1.aClass41_1013);
			if (arg0.method1413(Static154.aClass41_977)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(98) int local98 = 1; local98 < 103; local98++) {
						for (local34 = 1; local34 < 103; local34++) {
							Static149.aClass42Array1[local15].anIntArrayArray19[local98][local34] = 0;
						}
					}
				}
			}
			if (arg0.method1408(Static200.aClass41_1197) && Static101.anInt2449 != 0) {
				Static144.method2244(arg0.method1424(6).method1392());
			}
			if (arg0.method1413(Static20.aClass41_129) && Static101.anInt2449 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1408(Static53.aClass41_444)) {
				Static119.anInt2867 = arg0.method1424(12).method1391().method1392();
				Static198.method3075(Static149.method2324(new Class41[] { Static81.aClass41_622, Static152.method2471(Static119.anInt2867) }), 0, null);
			}
			if (arg0.method1413(Static93.aClass41_675)) {
				Static102.aBoolean133 = true;
			}
		}
		Static131.aClass2_Sub3_Sub1_2.method221(175);
		Static131.aClass2_Sub3_Sub1_2.method208(arg0.method1393() - 1);
		Static131.aClass2_Sub3_Sub1_2.method198(arg0.method1424(2));
	}
}
