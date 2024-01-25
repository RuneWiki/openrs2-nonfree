import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	public static int anInt9479;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "[I")
	public static final int[] anIntArray614 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BII)I")
	public static int method8267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte local17;
		if (arg1 > 20000) {
			local17 = 4;
			Static550.method7784();
		} else if (arg1 > 10000) {
			local17 = 3;
			Static610.method8412();
		} else if (arg1 <= 5000) {
			local17 = 1;
			Static419.method6415();
		} else {
			local17 = 2;
			Static680.method8955();
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() != arg0) {
			Static687.aClass6_Sub44_33.method7080(arg0, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
			Static536.method7652(false, arg0);
		}
		Static392.method6007();
		return local17;
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V")
	public static void method8269() {
		Static404.method6212();
		Static484.aBoolean623 = false;
		Static15.method206(Static49.anInt592, Static406.anInt7073, Static25.anInt354, Static243.anInt4678);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZI)Z")
	public static boolean method8274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
