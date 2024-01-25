import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Lclient!qa;")
	public static Class207 aClass207_3;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "Lclient!rda;")
	public static final Class307 aClass307_5 = new Class307(true);

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	public static final int anInt10172 = 1401;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)Lclient!qp;")
	public static Class14_Sub39 method8699() {
		if (Static224.aClass32_4 == null || Static434.aClass140_1 == null) {
			return null;
		}
		for (@Pc(25) Class14_Sub39 local25 = (Class14_Sub39) Static434.aClass140_1.method3016(); local25 != null; local25 = (Class14_Sub39) Static434.aClass140_1.method3016()) {
			@Pc(32) Class152 local32 = Static224.aClass274_2.method6614(local25.anInt8785);
			if (local32 != null && local32.aBoolean331 && local32.method3796(Static224.anInterface2_2)) {
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(ZIIII)V")
	public static void method8701(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static350.method5351();
		Static335.aLong164 = 0L;
		@Pc(10) int local10 = Static141.method2141();
		if (arg2 == 3 || local10 == 3) {
			arg0 = true;
		}
		if (!Static103.aClass144_3.method6895()) {
			arg0 = true;
		}
		Static220.method3799(arg1, local10, arg3, arg2, arg0);
	}
}
