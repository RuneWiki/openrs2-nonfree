import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cka", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "I")
	public static int anInt1285;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)I")
	public static int method1075() {
		if (Static555.aBoolean678) {
			return 6;
		} else if (Static693.aClass3_Sub4_Sub5_4 == null) {
			return 0;
		} else {
			@Pc(16) int local16 = Static693.aClass3_Sub4_Sub5_4.anInt2775;
			if (Static105.method1374(local16)) {
				return 1;
			} else if (Static292.method4412(local16)) {
				return 2;
			} else if (Static664.method8850(local16)) {
				return 3;
			} else if (Static290.method4406(local16)) {
				return 4;
			} else if (Static193.method2928(local16)) {
				return 7;
			} else if (local16 == 17) {
				return 8;
			} else {
				return 5;
			}
		}
	}
}
