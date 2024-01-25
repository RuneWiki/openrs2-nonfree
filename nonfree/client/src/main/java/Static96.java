import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!em", name = "R", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array5;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_79 = new Class184(21, 7);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!sc;III)V")
	public static void method1704(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static341.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5916 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass3_Sub23Array3[arg0.anInt5916++] = Static303.aClass54Array1[local21 - 1].aClass3_Sub23_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt5916; local21 < 4; local21++) {
			arg0.aClass3_Sub23Array3[local21] = null;
		}
	}
}
