import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ha;BZIZ)Lclient!da;")
	public static Class57 method1979(@OriginalArg(0) Class22 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(18) Class196 local18 = Static706.method9431(arg2, arg1, arg0, arg3);
		return local18 == null ? null : local18.aClass57_7;
	}
}
