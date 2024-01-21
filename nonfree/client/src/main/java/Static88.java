import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_4;

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public static int anInt1850 = 0;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_917 = Static32.method683("mapdots");

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "[I")
	public static int[] anIntArray189 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
	public static int anInt1858 = 0;

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_918 = Static32.method683("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
	public static int anInt1863 = 1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!lf;ZLclient!lf;I)V")
	public static void method1475(@OriginalArg(0) Class49 arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		Static102.method1753(arg0, null, arg2, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!bg;I)V")
	public static void method1476(@OriginalArg(0) Class11 arg0) {
		Static127.aClass11_100 = arg0;
		Static73.anInt1523 = Static127.aClass11_100.method2069(16);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	public static void method1477() {
		aClass49_918 = null;
		aClass2_Sub2_Sub2_Sub3_4 = null;
		anIntArray189 = null;
		aClass49_917 = null;
	}
}
