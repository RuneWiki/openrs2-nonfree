import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
	public static int anInt2280;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1032 = Static56.method972(" million");

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1033 = Static56.method972("Please remove ");

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1034 = Static56.method972("Loaded config");

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1035 = aClass5_1033;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1036 = Static56.method972("invback");

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	public static int anInt2277 = 0;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array15 = new Class5[100];

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1037 = Static56.method972("Welt");

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1042 = Static56.method972("World");

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1038 = aClass5_1042;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1039 = aClass5_1033;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1040 = aClass5_1032;

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1041 = aClass5_1034;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	public static int anInt2288 = -1;

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1043 = Static56.method972("hitmarks");

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1044 = Static56.method972("headicons_pk");

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1045 = Static56.method972("logo");

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method1508() {
		aClass5_1039 = null;
		aClass5Array15 = null;
		aClass5_1035 = null;
		aClass5_1040 = null;
		aClass5_1036 = null;
		aClass5_1041 = null;
		aClass5_1033 = null;
		aClass5_1044 = null;
		anIntArray256 = null;
		anImage4 = null;
		aClass5_1032 = null;
		aClass5_1043 = null;
		aClass5_1037 = null;
		aClass5_1038 = null;
		aClass5_1034 = null;
		aClass5_1045 = null;
		aClass5_1042 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public static int method1509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) Static15.aClass21_4.method459((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray379.length > arg0) {
			return local10.anIntArray379[arg0];
		} else {
			return -1;
		}
	}
}
