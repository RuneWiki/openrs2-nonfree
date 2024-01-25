import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_16 = new Class171(125, 5);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)Z")
	public static boolean method1615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILclient!ofa;)Ljava/lang/String;")
	public static String method1617(@OriginalArg(1) int arg0, @OriginalArg(2) Class265 arg1) {
		if (!Static86.method1383(arg1).method6486(arg0) && arg1.anObjectArray13 == null) {
			return null;
		} else if (arg1.aStringArray50 == null || arg1.aStringArray50.length <= arg0 || arg1.aStringArray50[arg0] == null || arg1.aStringArray50[arg0].trim().length() == 0) {
			return Static97.aBoolean153 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray50[arg0];
		}
	}
}
