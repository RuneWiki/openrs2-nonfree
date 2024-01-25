import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt2275 = 0;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public static int anInt2280 = -1;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt2282 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method2047() {
		Static151.anInt3123 = 0;
		Static187.aClass130_15.method3541();
		Static255.aBoolean352 = false;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method2048(@OriginalArg(1) int arg0) {
		if (!Static87.method1968(arg0)) {
			return;
		}
		@Pc(14) Class203[] local14 = Static59.aClass203ArrayArray3[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(30) Class203 local30 = local14[local16];
			if (local30 != null) {
				local30.anInt5511 = 0;
				local30.anInt5458 = 0;
				local30.anInt5481 = 1;
			}
		}
	}
}
