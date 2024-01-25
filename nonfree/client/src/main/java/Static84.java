import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
	public static int anInt1737;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!vd;IIB)Lclient!dh;")
	public static Class64 method1447(@OriginalArg(0) Class353 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method8404(arg1, 0);
		return local14 == null ? null : new Class64(local14);
	}
}
