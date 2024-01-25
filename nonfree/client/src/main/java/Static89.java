import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "S")
	public static short aShort11 = 32767;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_19 = new Class186(98, 6);

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)Z")
	public static boolean method1262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface10 local9 = (Interface10) Static428.method5836(arg0, arg1, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static95.method1646(local9) & true;
		}
		local9 = (Interface10) Static49.method903(arg0, arg1, arg2, tf.class);
		if (local9 != null) {
			local11 &= Static95.method1646(local9);
		}
		local9 = (Interface10) Static91.method1566(arg0, arg1, arg2);
		if (local9 != null) {
			local11 &= Static95.method1646(local9);
		}
		return local11;
	}
}
