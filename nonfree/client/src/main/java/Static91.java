import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method4792(@OriginalArg(0) Class121 arg0) {
		if (Static378.aBoolean549) {
			Static136.method2091(arg0);
		} else {
			Static300.method4099(arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public static void method4796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass47_Sub4_1 != null) {
			local7.aClass47_Sub4_1 = null;
		}
		if (local7.aClass47_Sub4_2 != null) {
			local7.aClass47_Sub4_2 = null;
		}
	}
}
