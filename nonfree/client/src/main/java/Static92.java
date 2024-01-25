import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_3 = new Class258("", 19);

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I")
	public static int method1253(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt1153 - 1; local3++) {
			if (arg0 < Static41.anIntArray46[local3] + Static532.anIntArray489[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static76.anInt1153 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	public static boolean method1254() {
		return Static9.aBoolean8;
	}
}
