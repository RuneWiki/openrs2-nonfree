import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "Lclient!cj;")
	public static final Class57 aClass57_9 = new Class57(128);

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!mea;)Lclient!mea;")
	public static Class230 method6852(@OriginalArg(1) Class230 arg0) {
		@Pc(6) Class230 local6 = Static78.method1480(arg0);
		if (local6 == null) {
			local6 = arg0.aClass230_6;
		}
		return local6;
	}
}
