import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static98 {

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
	public static int anInt1918;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!ts;")
	public static final Class329 aClass329_1 = new Class329(false);

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Lclient!ts;")
	public static Class329 aClass329_2 = aClass329_1;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_11 = new Class238();

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILclient!dm;)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class78 arg2) {
		Static436.anInt7766 = arg1;
		Static523.anInt8746 = arg0;
		Static619.aClass78_11 = arg2;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method1680() {
		if (Static538.anInt8985 == 7) {
			Static75.method1450(false);
		} else {
			Static536.aClass210_2 = Static439.aClass210_1;
			Static439.aClass210_1 = null;
			Static51.method997(13);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!dm;ZII)V")
	public static void method1685(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static112.aClass78_4 != null || Static642.aBoolean757 || (arg0 == null || Static40.method838(arg0) == null)) {
			return;
		}
		Static112.aClass78_4 = arg0;
		Static217.aClass78_7 = Static40.method838(arg0);
		Static57.aBoolean82 = false;
		Static622.anInt10098 = arg1;
		Static543.anInt9040 = 0;
		Static150.anInt3484 = arg2;
	}
}
