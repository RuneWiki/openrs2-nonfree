import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public static int anInt2069 = 0;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
	public static int[] anIntArray122 = new int[1];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method1829() {
		Static41.anInt1086 = Static566.aClass13_15.anInt510 + Static566.aClass13_15.anInt517 + 2;
		Static66.anInt1575 = Static510.aClass13_14.anInt517 + Static510.aClass13_14.anInt510 + 2;
		Static35.aStringArray3 = new String[500];
		for (@Pc(27) int local27 = 0; local27 < Static35.aStringArray3.length; local27++) {
			Static35.aStringArray3[local27] = "";
		}
		Static374.method5444(Static103.aClass77_3.method1864(Static562.anInt9127));
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public static void method1830() {
		for (@Pc(10) Class1_Sub23 local10 = (Class1_Sub23) Static3.aClass361_1.method7854(); local10 != null; local10 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			if (Static565.method7632(local10.anInt5147)) {
				Static524.method7130(local10);
			}
		}
		if (Static135.anInt2684 == 1) {
			Static38.method901();
			return;
		}
		Static177.method1858(Static2.anInt57, Static86.anInt1957, Static215.anInt4176, Static100.anInt2087);
		@Pc(54) int local54 = Static566.aClass13_15.method463(Static103.aClass77_26.method1864(Static562.anInt9127));
		for (@Pc(59) Class1_Sub23 local59 = (Class1_Sub23) Static3.aClass361_1.method7854(); local59 != null; local59 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			@Pc(65) int local65 = Static198.method3412(local59);
			if (local65 > local54) {
				local54 = local65;
			}
		}
		Static86.anInt1957 = local54 + 8;
		Static100.anInt2087 = Static135.anInt2684 * 16 + (Static268.aBoolean383 ? 26 : 22);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	public static void method1831(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub3_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class17 local8 = Static158.aClass17Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static218.anInt4229; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static446.anInt7725; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static378.anInt6665;
							@Pc(32) int local32 = local12 << Static378.anInt6665;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class17 local41 = Static158.aClass17Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method6642(local15, local12) - local41.method6642(local15, local12);
									@Pc(71) int local71 = local8.method6642(local15 + 1, local12) - local41.method6642(local15 + 1, local12);
									@Pc(91) int local91 = local8.method6642(local15 + 1, local12 + 1) - local41.method6642(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method6642(local15, local12 + 1) - local41.method6642(local15, local12 + 1);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
