import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame106;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
	public static boolean aBoolean323;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt4165;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1450 = Static161.method2971("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public static int anInt4166 = 0;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	public static int anInt4167 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
	public static int method3057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 * (4096 - arg2) + arg1 * arg2 >> 12;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIII)V")
	public static void method3058(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class21 local13 = local7.aClass21_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt1638;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class51 local58 = local7.aClass51_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt2877;
		@Pc(67) int local67 = local58.anInt2878;
		@Pc(70) int local70 = local58.anInt2879;
		@Pc(73) int local73 = local58.anInt2876;
		@Pc(77) int[] local77 = Static147.anIntArrayArray31[local23];
		@Pc(81) int[] local81 = Static90.anIntArrayArray21[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method3060() {
		aFrame106 = null;
		aClass13_1450 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!kd;ZII)V")
	public static void method3061(@OriginalArg(0) Class1_Sub2_Sub2_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2553 == arg2 && arg2 != -1) {
			@Pc(22) Class1_Sub2_Sub8 local22 = Static142.method2538(arg2);
			@Pc(25) int local25 = local22.anInt1509;
			if (local25 == 1) {
				arg0.anInt2585 = arg1;
				arg0.anInt2551 = 0;
				arg0.anInt2590 = 0;
				arg0.anInt2580 = 0;
				Static70.method1461(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 == arg0, arg0.anInt2596, arg0.anInt2590, arg0.anInt2606, local22);
			}
			if (local25 == 2) {
				arg0.anInt2580 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt2553 == -1 || Static142.method2538(arg2).anInt1518 >= Static142.method2538(arg0.anInt2553).anInt1518) {
			arg0.anInt2590 = 0;
			arg0.anInt2553 = arg2;
			arg0.anInt2551 = 0;
			arg0.anInt2585 = arg1;
			arg0.anInt2580 = 0;
			arg0.anInt2572 = arg0.anInt2586;
			if (arg0.anInt2553 == -1) {
				return;
			}
			Static70.method1461(arg0 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1, arg0.anInt2596, arg0.anInt2590, arg0.anInt2606, Static142.method2538(arg0.anInt2553));
		}
	}
}
