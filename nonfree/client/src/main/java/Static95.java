import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray84 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!la;II)Lclient!qt;")
	public static Class282 method2093(@OriginalArg(0) Class196 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5113(arg1);
		return local13 == null ? null : new Class282(local13);
	}
}
