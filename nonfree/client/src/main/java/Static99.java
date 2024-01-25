import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!d;BLjava/awt/Canvas;I)Lclient!ha;")
	public static Class82 method7007(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class82_Sub1(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIII)V")
	public static void method7008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static214.method3768(local35, true, false);
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)V")
	public static void method7010() {
		Static605.method8323(Static429.aClass344_9);
		Static206.anInt3779++;
		if (Static377.aBoolean497 && Static28.aBoolean21) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static80.aBoolean118) {
				local26 = Static211.method3297();
				local28 = Static551.method7856();
			}
			@Pc(42) int local42 = local26 + Static281.aClass49_1.method2426();
			@Pc(49) int local49 = Static281.aClass49_1.method2429() + local28;
			local42 -= Static73.anInt1444;
			local49 -= Static114.anInt2516;
			if (Static355.anInt10009 > local42) {
				local42 = Static355.anInt10009;
			}
			if (local42 + Static429.aClass344_9.anInt9546 > Static495.aClass344_11.anInt9546 + Static355.anInt10009) {
				local42 = Static495.aClass344_11.anInt9546 + Static355.anInt10009 - Static429.aClass344_9.anInt9546;
			}
			if (local49 < Static322.anInt6165) {
				local49 = Static322.anInt6165;
			}
			if (Static495.aClass344_11.anInt9602 + Static322.anInt6165 < local49 - -Static429.aClass344_9.anInt9602) {
				local49 = Static495.aClass344_11.anInt9602 + Static322.anInt6165 - Static429.aClass344_9.anInt9602;
			}
			@Pc(120) int local120 = local42 + Static495.aClass344_11.anInt9621 - Static355.anInt10009;
			@Pc(127) int local127 = Static495.aClass344_11.anInt9618 + local49 - Static322.anInt6165;
			@Pc(142) Class3_Sub36 local142;
			if (Static281.aClass49_1.method2430()) {
				if (Static206.anInt3779 > Static429.aClass344_9.anInt9560) {
					@Pc(216) int local216 = local42 - Static275.anInt5304;
					@Pc(220) int local220 = local49 - Static6.anInt79;
					if (Static429.aClass344_9.anInt9623 < local216 || local216 < -Static429.aClass344_9.anInt9623 || local220 > Static429.aClass344_9.anInt9623 || -Static429.aClass344_9.anInt9623 > local220) {
						Static597.aBoolean736 = true;
					}
				}
				if (Static429.aClass344_9.anObjectArray6 != null && Static597.aBoolean736) {
					local142 = new Class3_Sub36();
					local142.anInt6956 = local127;
					local142.aClass344_6 = Static429.aClass344_9;
					local142.anInt6951 = local120;
					local142.anObjectArray1 = Static429.aClass344_9.anObjectArray6;
					Static400.method6288(local142);
				}
			} else {
				if (Static597.aBoolean736) {
					Static409.method6364();
					if (Static429.aClass344_9.anObjectArray10 != null) {
						local142 = new Class3_Sub36();
						local142.aClass344_5 = Static554.aClass344_13;
						local142.anInt6956 = local127;
						local142.anInt6951 = local120;
						local142.anObjectArray1 = Static429.aClass344_9.anObjectArray10;
						local142.aClass344_6 = Static429.aClass344_9;
						Static400.method6288(local142);
					}
					if (Static554.aClass344_13 != null && Static76.method1321(Static429.aClass344_9) != null) {
						Static613.method8375(Static554.aClass344_13, Static429.aClass344_9);
					}
				} else if ((Static646.anInt4678 == 1 || Static40.method735()) && Static285.anInt7798 > 2) {
					Static49.method918(Static73.anInt1444 + Static275.anInt5304, Static114.anInt2516 + Static6.anInt79);
				} else if (Static506.method7359()) {
					Static49.method918(Static275.anInt5304 + Static73.anInt1444, Static6.anInt79 + Static114.anInt2516);
				}
				Static429.aClass344_9 = null;
			}
		} else if (Static206.anInt3779 > 1) {
			Static429.aClass344_9 = null;
		}
	}
}
