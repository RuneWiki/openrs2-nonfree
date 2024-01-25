import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static84 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_102 = new Class253(63, -2);

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_100 = new Class55("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static void method3639(@OriginalArg(0) int arg0) {
		Static259.anInt4363 = arg0;
		Static273.aClass126_39.method2827();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ok;ZLclient!ok;Lclient!ok;Lclient!ok;)V")
	public static void method3644(@OriginalArg(0) Class178 arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(3) Class178 arg2, @OriginalArg(4) Class178 arg3) {
		Static310.aClass178_92 = arg3;
		Static414.aClass178_126 = arg0;
		Static367.aClass178_112 = arg1;
		Static316.aClass178_93 = arg2;
		Static294.aClass95ArrayArray3 = new Class95[Static414.aClass178_126.method3832()][];
		Static106.aBooleanArray7 = new boolean[Static414.aClass178_126.method3832()];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public static void method3645(@OriginalArg(0) int arg0) {
		Static5.anInt16 = -1;
		if (arg0 == 37) {
			Static93.aFloat125 = 3.0F;
		} else if (arg0 == 50) {
			Static93.aFloat125 = 4.0F;
		} else if (arg0 == 75) {
			Static93.aFloat125 = 6.0F;
		} else if (arg0 == 100) {
			Static93.aFloat125 = 8.0F;
		} else if (arg0 == 200) {
			Static93.aFloat125 = 16.0F;
		}
		Static5.anInt16 = -1;
	}
}
