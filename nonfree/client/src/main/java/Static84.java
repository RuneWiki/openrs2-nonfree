import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!daa", name = "D", descriptor = "Lclient!ga;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!daa", name = "H", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!daa", name = "O", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_41 = new Class151(72, 6);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method1755(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(18) int local18 = arg2.indexOf(arg0); local18 != -1; local18 = arg2.indexOf(arg0, arg1.length() + local18)) {
			arg2 = arg2.substring(0, local18) + arg1 + arg2.substring(arg0.length() + local18);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(III)I")
	public static int method1756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(25) double local25 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(34) double local34 = Math.random() * (local10 - local25) + local25;
		return (int) (Math.pow(2.0D, local34) + 0.5D);
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(III)Z")
	public static boolean method1758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
