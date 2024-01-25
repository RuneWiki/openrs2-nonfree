import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public static int anInt1816 = 0;

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_41 = new Class85("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "[I")
	public static final int[] anIntArray160 = new int[1024];

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "I")
	public static int anInt1828 = 2;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V")
	public static void method1729(@OriginalArg(0) int arg0) {
		Static170.anInt3415 = arg0;
		@Pc(11) Class109 local11 = Static142.aClass109_32;
		synchronized (Static142.aClass109_32) {
			Static142.aClass109_32.method2858();
		}
		local11 = Static41.aClass109_14;
		synchronized (Static41.aClass109_14) {
			Static41.aClass109_14.method2858();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ij;Z)V")
	public static void method1730(@OriginalArg(0) Class93 arg0) {
		Static297.aClass93_115 = arg0;
		Static160.anInt3179 = Static297.aClass93_115.method2418(16);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)Z")
	public static boolean method1732(@OriginalArg(1) int arg0) {
		@Pc(7) Class6_Sub1 local7 = Static14.method286(arg0);
		if (local7 == null) {
			return false;
		} else if (Static210.anInt4168 == 3) {
			@Pc(41) String local41 = "";
			if (Static351.anInt6735 != 0) {
				local41 = ":" + (local7.anInt85 + 7000);
			}
			@Pc(59) String local59 = "";
			if (Static96.aString10 != null) {
				local59 = "/p=" + Static96.aString10;
			}
			@Pc(113) String local113 = "http://" + local7.aString1 + local41 + "/l=" + Static41.anInt726 + "/a=" + Static16.anInt331 + local59 + "/j" + (Static259.aBoolean424 ? "1" : "0") + ",o" + (Static319.aBoolean514 ? "1" : "0") + ",a2";
			try {
				Static138.aClient1.getAppletContext().showDocument(new URL(local113), "_self");
				return true;
			} catch (@Pc(123) Exception local123) {
				return false;
			}
		} else {
			Static48.anInt918 = local7.anInt85;
			Static152.aString56 = local7.aString1;
			if (Static351.anInt6735 != 0) {
				Static312.anInt6076 = Static48.anInt918 + 50000;
				Static195.anInt3881 = Static48.anInt918 + 40000;
				Static101.anInt1909 = Static195.anInt3881;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)V")
	public static void method1733(@OriginalArg(1) int arg0) {
		Static102.anInt1950 = 1000 / arg0;
	}
}
