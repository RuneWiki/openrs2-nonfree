import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BI)V")
	public static void method1877(@OriginalArg(0) byte arg0) {
		if (Static570.aByteArrayArrayArray20 == null) {
			Static570.aByteArrayArrayArray20 = new byte[4][Static460.anInt8640][Static292.anInt7682];
		}
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static460.anInt8640; local15++) {
				for (@Pc(18) int local18 = 0; local18 < Static292.anInt7682; local18++) {
					Static570.aByteArrayArrayArray20[local12][local15][local18] = arg0;
				}
			}
		}
	}
}
