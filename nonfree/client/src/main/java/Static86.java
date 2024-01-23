import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!qc;")
	public static Class135 aClass135_8 = new Class135(4);

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean136 = true;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1491(@OriginalArg(0) String arg0) {
		if (Static31.anInt745 >= 2) {
			@Pc(20) int local20;
			@Pc(41) int local41;
			@Pc(31) Runtime local31;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static241.method3699();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local31 = Runtime.getRuntime();
				local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static196.method1924(0, "mem=" + local41 + "k", null);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static241.method3699();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local31 = Runtime.getRuntime();
				local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static196.method1924(0, "Memory before cleanup=" + local41 + "k", null);
				Static190.method3154();
				Static241.method3699();
				for (@Pc(104) int local104 = 0; local104 < 10; local104++) {
					System.gc();
				}
				local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static196.method1924(0, "Memory after cleanup=" + local41 + "k", null);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static196.method1924(0, "Number of player models in cache:" + Static209.method3318(), null);
			}
			if (Static277.aBoolean412 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static94.anInt2205);
				System.out.println("oncard_2d:" + Static94.anInt2208);
				System.out.println("oncard_texture:" + Static94.anInt2206);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static136.method3363();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static177.aClass162_3.method4042();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static177.aClass162_3.method4031();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static253.aClass175_4.method4321();
				Static87.aClass113_1.method3020();
				Static177.aClass162_3.method4040();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static26.aBoolean49 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static163.method2823(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static85.aBoolean135 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static85.aBoolean135 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static102.method1909(0, -1, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static102.method1909(1, -1, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static102.method1909(2, -1, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static102.method1909(3, 1024, false, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static214.anInt4259 = Static126.method1526(arg0.substring(8));
				Static239.method3687(Static253.aClass175_4);
				Static21.aBoolean32 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static235.method3619(Static126.method1526(arg0.substring(15)));
				Static239.method3687(Static253.aClass175_4);
				Static21.aBoolean32 = false;
			}
			if (arg0.startsWith("::fps ") && Static111.anInt2557 != 0) {
				Static192.method3172(Static126.method1526(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static267.anInt5202 = Static126.method1526(arg0.substring(12).trim());
				Static196.method1924(0, "rect_debug=" + Static267.anInt5202, null);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static178.aBoolean303 = true;
			}
			if (arg0.startsWith("::hdr") && Static277.aBoolean412 && !Static58.method818(!Static167.method2899())) {
				Static196.method1924(0, "Failed to enable hdr", null);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static297.aBoolean453) {
					Static297.aBoolean453 = false;
					Static196.method1924(0, "Forced tweening disabled.", null);
				} else {
					Static297.aBoolean453 = true;
					Static196.method1924(0, "Forced tweening ENABLED!", null);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static45.aBoolean79) {
					System.out.println("Shift-click disabled.");
					Static45.aBoolean79 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static45.aBoolean79 = true;
				}
			}
		}
		Static283.aClass1_Sub11_Sub1_3.method2697(99);
		Static283.aClass1_Sub11_Sub1_3.method2655(arg0.length() - 1);
		Static283.aClass1_Sub11_Sub1_3.method2628(arg0.substring(2));
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method1492(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static130.method2227(arg0, 5);
		local16.method3911();
	}
}
