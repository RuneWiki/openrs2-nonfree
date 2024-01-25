import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static96 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	public static int anInt1729;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!nca;")
	public static Class254 aClass254_42;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	public static int anInt1730 = 7000;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public static int anInt1733 = anInt1730;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!vo;Lclient!nca;)V")
	public static void method1493(@OriginalArg(1) Class389 arg0, @OriginalArg(2) Class254 arg1) {
		Static229.aClass389_4 = arg0;
		Static457.aClass254_123 = arg1;
		Static550.aString95 = "";
		if (Class2_Sub10_Sub2.aString15.startsWith("win")) {
			Static550.aString95 = Static550.aString95 + "windows/";
		} else if (Class2_Sub10_Sub2.aString15.startsWith("linux")) {
			Static550.aString95 = Static550.aString95 + "linux/";
		} else if (Class2_Sub10_Sub2.aString15.startsWith("mac")) {
			Static550.aString95 = Static550.aString95 + "macos/";
		}
		if (Static229.aClass389_4.aBoolean912) {
			Static550.aString95 = Static550.aString95 + "msjava/";
		} else if (Class2_Sub10_Sub2.aString14.startsWith("amd64") || Class2_Sub10_Sub2.aString14.startsWith("x86_64")) {
			Static550.aString95 = Static550.aString95 + "x86_64/";
		} else if (Class2_Sub10_Sub2.aString14.startsWith("i386") || Class2_Sub10_Sub2.aString14.startsWith("i486") || Class2_Sub10_Sub2.aString14.startsWith("i586") || Class2_Sub10_Sub2.aString14.startsWith("x86")) {
			Static550.aString95 = Static550.aString95 + "x86/";
		} else if (Class2_Sub10_Sub2.aString14.startsWith("ppc")) {
			Static550.aString95 = Static550.aString95 + "ppc/";
		} else {
			Static550.aString95 = Static550.aString95 + "universal/";
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIBII)V")
	public static void method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > arg2) {
			Static494.method7075(arg2, arg1, arg0, Static449.anIntArrayArray48[arg3], 18601);
		} else {
			Static494.method7075(arg0, arg1, arg2, Static449.anIntArrayArray48[arg3], 18601);
		}
	}
}
