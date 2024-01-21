import java.awt.Graphics;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1269 = Static33.method650("auf der Hautpseite)3");

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public static final int anInt2395 = 20;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1270 = Static33.method650("jolt");

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1271 = Static33.method650("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method1624() {
		Static21.method467(Static63.anInt1818);
		if (Static88.anInt2370 != -1) {
			Static21.method467(Static88.anInt2370);
		}
		Static44.anInt1163 = 0;
		Static51.aClass30_9.method813();
		Static55.method1046();
		Static6.method1486();
		Static30.method628(0, 765, Static63.anInt1818, 503);
		if (Static88.anInt2370 != -1) {
			Static30.method628(0, 765, Static88.anInt2370, 503);
		}
		if (Static122.aBoolean163) {
			Static56.method1062();
		} else {
			Static46.method1519();
			Static45.method815();
		}
		try {
			@Pc(65) Graphics local65 = Static59.aCanvas1.getGraphics();
			Static51.aClass30_9.method811(0, 0, local65);
		} catch (@Pc(73) Exception local73) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public static void method1626() {
		aCRC32_2 = null;
		aClass56_1270 = null;
		aClass56_1271 = null;
		aClass56_1269 = null;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)I")
	public static int method1628() {
		return 19;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public static void method1630() {
		Static31.aClass30_5.method813();
		Static59.aClass3_Sub1_Sub1_Sub4_37.method1504(0, 0);
		Static55.method1046();
	}
}
