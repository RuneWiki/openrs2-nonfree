import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!dda", name = "Vg", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_11 = new Class244();

	@OriginalMember(owner = "client!dda", name = "Yh", descriptor = "[Lclient!ga;")
	public static final Class111[] aClass111Array1 = new Class111[4];

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(IIII)I")
	public static int method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static262.aByteArrayArrayArray16[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static262.aByteArrayArrayArray16[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
