import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1013 = Static56.method816("Hier wechseln");

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[Lclient!md;")
	public static Class14_Sub1[] aClass14_Sub1Array1 = new Class14_Sub1[256];

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	public static int anInt2198 = 0;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1014 = Static56.method816("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1015 = Static56.method816("mn");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1016 = aClass34_1014;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method1323(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static100.method1458(arg0)) {
			return;
		}
		@Pc(24) Class8_Sub24[] local24 = Static44.aClass8_Sub24ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
			@Pc(32) Class8_Sub24 local32 = local24[local26];
			if (local32.anObjectArray27 != null) {
				@Pc(39) Class8_Sub19 local39 = new Class8_Sub19();
				local39.aClass8_Sub24_13 = local32;
				local39.anObjectArray3 = local32.anObjectArray27;
				Static106.method1497(local39);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!rf;I)V")
	public static void method1324(@OriginalArg(0) Class8_Sub11 arg0) {
		if (arg0.aClass8_Sub9_5 != null) {
			arg0.aClass8_Sub9_5.anInt2234 = 0;
		}
		arg0.aBoolean105 = false;
		for (@Pc(18) Class8_Sub11 local18 = arg0.method1920(); local18 != null; local18 = arg0.method1918()) {
			method1324(local18);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method1325() {
		anImage1 = null;
		aClass34_1013 = null;
		aClass34_1016 = null;
		aClass34_1014 = null;
		aClass34_1015 = null;
		aClass2Array1 = null;
		aClass14_Sub1Array1 = null;
	}
}
