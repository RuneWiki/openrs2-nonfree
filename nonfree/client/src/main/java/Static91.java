import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BILclient!jn;I)Lclient!kk;")
	public static Class191 method5485(@OriginalArg(2) Class176 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3994(0, arg1);
		return local9 == null ? null : new Class191(local9);
	}
}
