import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static int anInt1570;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!iga;")
	public static Class173 aClass173_4;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
	public static int method1415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static220.aByteArrayArrayArray14[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static220.aByteArrayArrayArray14[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
