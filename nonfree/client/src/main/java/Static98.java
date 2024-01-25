import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)J")
	public static long method4122() {
		return Static64.aClass99_1.method5657();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([SI)[S")
	public static short[] method4123(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static472.method5026(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
