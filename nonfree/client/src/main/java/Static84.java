import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	public static int anInt1707;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "Lclient!ue;")
	public static Class331 aClass331_4;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lclient!dda;")
	public static final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Lclient!dda;")
	public static final Class64 aClass64_2 = new Class64();

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "Lclient!dda;")
	public static final Class64 aClass64_3 = new Class64();

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "Lclient!dda;")
	public static final Class64 aClass64_4 = new Class64();

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIZ)Lclient!vd;")
	public static Class6_Sub49 method1640(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class6_Sub49) Static420.aClass128_35.method3263(local17);
	}
}
