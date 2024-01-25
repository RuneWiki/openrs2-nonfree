import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public static int anInt10862;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "[Lclient!nh;")
	public static Class250[] aClass250Array178;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable19 = new Hashtable();

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method9162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static20.method345(arg2)) {
			return;
		}
		if (Static17.aClass238ArrayArray1[arg2] == null) {
			Static73.method1221(Static397.aClass238ArrayArray2[arg2], -1, arg8, arg1, arg6, arg0, arg4, arg7, arg3, arg10, arg5, arg9);
		} else {
			Static73.method1221(Static17.aClass238ArrayArray1[arg2], -1, arg8, arg1, arg6, arg0, arg4, arg7, arg3, arg10, arg5, arg9);
		}
	}
}
