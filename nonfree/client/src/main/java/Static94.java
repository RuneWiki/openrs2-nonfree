import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ep", name = "J", descriptor = "[F")
	public static final float[] aFloatArray10 = new float[16];

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!wn;Ljava/lang/String;B)V")
	public static void method1630(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) String arg2) {
		@Pc(25) int local25 = Static196.aClass201_4.method4449(null, arg2, 250);
		@Pc(34) int local34 = Static196.aClass201_4.method4454(null, 250, arg2) * 13;
		Static44.aClass28_14.method3559(6, 6, local25 + 4 + 4, local34 - -4 + 4, -16777216, 0);
		Static44.aClass28_14.method3506(6, 6, local25 + 4 + 4, local34 + 4 + 4, -1, 0);
		arg1.method5641(-1, 0, null, -1, local25, local34, 10, 1, arg2, 0, null, null, 10);
		Static87.method1534(6, local34 + 8, local25 + 4 - -4, 6);
		if (arg0) {
			Static44.aClass28_14.method3503();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZZ)V")
	public static void method1632(@OriginalArg(0) boolean arg0) {
		Static305.anInt5001--;
		if (Static305.anInt5001 == 0) {
			Static92.anIntArray184 = null;
		}
		if (arg0) {
			Static341.anInt5727--;
			if (Static341.anInt5727 == 0) {
				Static245.anIntArray376 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)I")
	public static int method1635(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
