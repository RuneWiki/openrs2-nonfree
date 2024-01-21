import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!fd;")
	public static Class24 aClass24_27;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_1238 = Static69.method1231("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static final int anInt2401 = 0;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_1239 = Static69.method1231("Registrierter Benutzer");

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!je;")
	private static Class40 aClass40_1242 = Static69.method1231("Prepared sound engine");

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_1240 = aClass40_1242;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public static int anInt2403 = 0;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!je;")
	private static Class40 aClass40_1244 = Static69.method1231("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1241 = aClass40_1244;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_1243 = Static69.method1231("<)4col>");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!na;)V")
	public static void method1734(@OriginalArg(1) Class2_Sub9 arg0) {
		if (Static104.aClass82_5 != null) {
			try {
				Static104.aClass82_5.method2144(0L);
				Static104.aClass82_5.method2143(24, arg0.anInt976, arg0.aByteArray16);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt976 += 24;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method1735() {
		aClass24_27 = null;
		aClass40_1243 = null;
		aClass40_1239 = null;
		aClass40_1238 = null;
		aClass40_1240 = null;
		aCRC32_2 = null;
		aClass40_1241 = null;
		aClass40_1242 = null;
		aClass40_1244 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
	public static void method1736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static70.anInt1897; local11++) {
			if (arg3 < Static60.anIntArray168[local11] + Static46.anIntArray131[local11] && Static60.anIntArray168[local11] < arg3 + arg0 && arg1 < Static117.anIntArray323[local11] + Static24.anIntArray376[local11] && arg1 + arg2 > Static24.anIntArray376[local11]) {
				Static64.aBooleanArray17[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[B)I")
	public static int method1737(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static119.method2007(arg0, 0, arg1);
	}
}
