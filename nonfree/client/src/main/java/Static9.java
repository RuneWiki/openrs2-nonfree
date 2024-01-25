import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Z")
	public static boolean method494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!il;I)I")
	public static int method496(@OriginalArg(0) Class144 arg0) {
		if (arg0 == Static503.aClass144_4) {
			return 7681;
		} else if (Static438.aClass144_3 == arg0) {
			return 8448;
		} else if (Static558.aClass144_5 == arg0) {
			return 34165;
		} else if (arg0 == Static3.aClass144_1) {
			return 260;
		} else if (Static58.aClass144_2 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
