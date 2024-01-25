import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	public static int anInt1868;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean133 = true;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Lclient!rk;")
	public static final Class249 aClass249_9 = new Class249();

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1766(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static218.aStringArray23.length; local12++) {
			if (Static218.aStringArray23[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZBI)Ljava/lang/String;")
	public static String method1768(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static272.method4336(arg0);
	}
}
