import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString107;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString106 = null;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt1723 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method1623(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg0;
			return arg1 ? Static72.method4590(local17) : local17;
		} else if (arg0 instanceof Class27) {
			@Pc(37) Class27 local37 = (Class27) arg0;
			return local37.method609();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IS)Z")
	public static boolean method1624(@OriginalArg(1) short arg0) {
		if (arg0 == 35 || arg0 == 34 || arg0 == 31 || arg0 == 51 || arg0 == 16 || arg0 == 50 || arg0 == 7 || arg0 == 30) {
			return true;
		} else if (arg0 == 29 || arg0 == 32 || arg0 == 1001 || arg0 == 1006) {
			return true;
		} else if (arg0 == 26 || arg0 == 12 || arg0 == 38 || arg0 == 23 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 19 || arg0 == 11 || arg0 == 43 || arg0 == 2 || arg0 == 37 || arg0 == 45;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILclient!nk;)[Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2[] method1625(@OriginalArg(0) int arg0, @OriginalArg(3) Class121 arg1) {
		return Static313.method2575(arg0, 0, arg1) ? Static254.method4034() : null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!nk;)V")
	public static void method1626(@OriginalArg(1) Class121 arg0) {
		Static209.anInt3974 = arg0.method3108("runes");
	}
}
