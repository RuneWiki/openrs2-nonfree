import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_10;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt1939;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public static int anInt1942;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1045 = Static122.method531("<col=00ff00>");

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1046 = Static122.method531(" seconds)3");

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1047 = Static122.method531(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1048 = Static122.method531("<)4col>");

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1049 = aClass73_1046;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	public static int anInt1943 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)I")
	public static int method1510(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local10 += 4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return local10 + arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method1511() {
		aClass73_1048 = null;
		aClass73_1047 = null;
		aClass13_Sub1_10 = null;
		aClass73_1045 = null;
		aClass73_1046 = null;
		aClass73_1049 = null;
	}
}
