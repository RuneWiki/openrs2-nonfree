import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[128][128];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
	public static int method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method1644() {
		Static25.aClass14_1.X(Static427.anInt7433, Static140.aClass6_Sub48_Sub1_1.aBoolean681 ? Static300.anInt5540 + 256 << 2 : -1, 0);
	}
}
