import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	public static int anInt1741;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method1416(@OriginalArg(0) Class164 arg0) {
		@Pc(7) int local7 = Static90.anInt1655;
		@Pc(9) int local9 = Static38.anInt737;
		@Pc(11) int local11 = Static56.anInt1146;
		@Pc(13) int local13 = Static265.anInt4594;
		arg0.method5343(local13, -10660793, local9, local7, local11);
		arg0.method5343(16, -16777216, local9 + 1, local7 + 1, local11 - 2);
		arg0.method5397(local11 - 2, local13 - 19, local7 + 1, -16777216, local9 - -18);
		Static101.aClass137_2.method5101(-1, Static39.aClass169_32.method3680(Static48.anInt952), local7 + 3, -10660793, local9 + 14);
		@Pc(72) int local72 = Static300.aClass182_1.method4112();
		@Pc(76) int local76 = Static300.aClass182_1.method4121();
		@Pc(78) int local78 = 0;
		for (@Pc(90) Class1_Sub40 local90 = (Class1_Sub40) Static358.aClass17_66.method202(); local90 != null; local90 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			@Pc(105) int local105 = (Static215.anInt3678 - local78 - 1) * 16 + local9 + 31;
			@Pc(107) short local107 = -1;
			if (local72 > local7 && local11 + local7 > local72 && local105 - 13 < local76 && local105 + 3 > local76 && local90.aBoolean509) {
				local107 = -256;
			}
			@Pc(132) int[] local132 = null;
			if (Static5.method56(local90.anInt5411)) {
				local132 = Static263.aClass102_2.method2172((int) local90.aLong172).anIntArray261;
			} else if (local90.anInt5412 != -1) {
				local132 = Static263.aClass102_2.method2172(local90.anInt5412).anIntArray261;
			} else if (Static70.method1142(local90.anInt5411)) {
				@Pc(153) Class25_Sub1_Sub1_Sub2 local153 = Static171.aClass25_Sub1_Sub1_Sub2Array1[(int) local90.aLong172];
				if (local153 != null) {
					@Pc(158) Class59 local158 = local153.aClass59_1;
					if (local158.anIntArray186 != null) {
						local158 = local158.method1150(Static230.aClass72_3);
					}
					if (local158 != null) {
						local132 = local158.anIntArray188;
					}
				}
			} else if (Static265.method4069(local90.anInt5411)) {
				@Pc(194) Class236 local194;
				if (local90.anInt5411 == 1008) {
					local194 = Static54.aClass153_1.method3081((int) local90.aLong172);
				} else {
					local194 = Static54.aClass153_1.method3081((int) (local90.aLong172 >>> 32 & 0x7FFFFFFFL));
				}
				if (local194.anIntArray706 != null) {
					local194 = local194.method5074(Static230.aClass72_3);
				}
				if (local194 != null) {
					local132 = local194.anIntArray707;
				}
			}
			@Pc(236) String local236 = Static180.method2597(local90);
			if (local132 != null) {
				local236 = local236 + Static139.method2130(local132);
			}
			Static101.aClass137_2.method5109(local236, local7 + 3, local105, local107, Static87.anIntArray210, Static134.aClass51Array10);
			local78++;
			if (local90.aBoolean510) {
				Static294.aClass51_16.method4669(local7 + Static102.aClass110_3.method2413(local236) + 5, local105 + -12);
			}
		}
		Static232.method619(Static90.anInt1655, Static265.anInt4594, Static56.anInt1146, Static38.anInt737);
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I")
	public static int method1417(@OriginalArg(1) int arg0) {
		if (Static6.aClass130_1 != null) {
			Static6.aClass130_1.method2668();
			Static6.aClass130_1 = null;
		}
		Static232.anInt804++;
		if (Static232.anInt804 > 4) {
			Static232.anInt804 = 0;
			Static24.anInt387 = 0;
			return arg0;
		}
		if (Static108.anInt1883 == Static78.anInt1493) {
			Static108.anInt1883 = Static151.anInt2793;
		} else {
			Static108.anInt1883 = Static78.anInt1493;
		}
		Static24.anInt387 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!je;I)V")
	public static void method1418(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		Static220.anInt3773 = arg0;
		Static114.anInt2044 = arg2;
		Static248.aClass117_12 = arg1;
	}
}
