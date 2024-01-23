import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!jh;")
	public static Class53 aClass53_6 = new Class53(260);

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt1998 = 0;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
	public static int anInt1999 = 255;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!jh;")
	public static Class53 aClass53_7 = new Class53(30);

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt2000 = -1;

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_433 = Static199.method3560("sl_back");

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!qe;")
	private static Class78 aClass78_438 = Static199.method3560("flash1:");

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!qe;")
	public static Class78 aClass78_434 = aClass78_438;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!qe;")
	private static Class78 aClass78_435 = Static199.method3560("K");

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_436 = Static199.method3560("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_437 = aClass78_438;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!qe;")
	public static Class78 aClass78_439 = aClass78_435;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_440 = aClass78_435;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZILclient!qe;)V")
	public static void method1575(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class78 arg1) {
		if (arg0) {
			try {
				Static148.anApplet_Sub1_1.getAppletContext().showDocument(arg1.method3024(Static148.anApplet_Sub1_1.getCodeBase()), "_blank");
			} catch (@Pc(16) Exception local16) {
			}
		} else {
			try {
				Static148.anApplet_Sub1_1.getAppletContext().showDocument(arg1.method3024(Static148.anApplet_Sub1_1.getCodeBase()), "_top");
			} catch (@Pc(28) Exception local28) {
			}
		}
	}
}
