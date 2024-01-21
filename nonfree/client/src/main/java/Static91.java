import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_12;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!wh;")
	public static Class89 aClass89_2;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!sg;")
	private static Class77 aClass77_914 = Static146.method2172("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_912 = aClass77_914;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!sg;")
	private static Class77 aClass77_915 = Static146.method2172("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_913 = aClass77_915;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!sg;")
	public static Class77 aClass77_916 = Static146.method2172("scape main");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!sg;Z)V")
	public static void method1669(@OriginalArg(1) Class77 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3.method1264(arg0, 250);
		@Pc(25) int local25 = Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3.method1278(arg0, 250) * 13;
		Static113.method1243(6, 6, local14 + 4 + 4, local25 + 8, 0);
		Static113.method1250(6, 6, local14 + 4 + 4, local25 + 4 + 4, 16777215);
		Static85.aClass2_Sub2_Sub3_Sub4_Sub1_3.method1272(arg0, 10, 10, local14, local25, 16777215, -1, 1, 1, 0);
		Static5.method100(local25 + 4 + 4, 4 + 4 + local14, 6, 6);
		if (!arg1) {
			Static150.method2566(local14, 10, 10, local25);
			return;
		}
		try {
			@Pc(107) Graphics local107 = Static1.aCanvas1.getGraphics();
			Static152.aClass57_1.method2169(local107);
		} catch (@Pc(115) Exception local115) {
			Static1.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIB)V")
	public static void method1670(@OriginalArg(1) boolean arg0) {
		Static57.anInt4556 = 2;
		Static63.anInt1680 = 22050;
		Static46.aBoolean62 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method1674() {
		aClass77_912 = null;
		aClass89_2 = null;
		aClass77_914 = null;
		aClass77_915 = null;
		aClass77_916 = null;
		aClass77_913 = null;
		aClass43_Sub1_12 = null;
	}
}
