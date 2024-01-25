import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_1 = new Class70(0, 3, Static435.aClass274_17);

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_2 = new Class70(1, 3, Static435.aClass274_17);

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_3 = new Class70(2, 4, Static435.aClass274_13);

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_4 = new Class70(3, 1, Static435.aClass274_17);

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_5 = new Class70(4, 2, Static435.aClass274_17);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_6 = new Class70(5, 3, Static435.aClass274_17);

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!dd;")
	public static final Class70 aClass70_7 = new Class70(6, 4, Static435.aClass274_17);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public static final int anInt1378 = Static23.method257(16);

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_25 = new Class241(65, -1);

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public static int anInt1379 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method1341(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub2_Sub4 local16 = Static602.method8315((long) arg1, 2);
		local16.method2040();
		local16.aString17 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Lclient!dd;")
	public static Class70 method1342(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass70_1;
		} else if (arg0 == 1) {
			return aClass70_2;
		} else if (arg0 == 2) {
			return aClass70_3;
		} else if (arg0 == 3) {
			return aClass70_4;
		} else if (arg0 == 4) {
			return aClass70_5;
		} else if (arg0 == 5) {
			return aClass70_6;
		} else if (arg0 == 6) {
			return aClass70_7;
		} else {
			return null;
		}
	}
}
