import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!j;")
	public static Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1317 = Static23.method501("flash2:");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1318 = Static23.method501("Click to continue");

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	public static int anInt2465 = 0;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1319 = aClass42_1318;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1323 = Static23.method501("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1320 = aClass42_1323;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1321 = Static23.method501("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1322 = aClass42_1317;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1328 = Static23.method501("Add friend");

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1324 = aClass42_1328;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1325 = Static23.method501("Prepared visibility map");

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1329 = Static23.method501("Loading textures )2 ");

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1326 = aClass42_1329;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1327 = aClass42_1325;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public static volatile int anInt2468 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public static void method1685() {
		aClass42_1322 = null;
		aClass42_1320 = null;
		aClass42_1325 = null;
		aClass42_1326 = null;
		aClass42_1318 = null;
		aClass42_1317 = null;
		aClass42_1321 = null;
		aClass1_Sub1_Sub1_Sub3_3 = null;
		aClass42_1324 = null;
		aClass42_1328 = null;
		aClass42_1329 = null;
		aClass42_1327 = null;
		aClass42_1319 = null;
		aClass42_1323 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)I")
	public static int method1686() {
		return Static5.anInt128++;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1687(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static72.method1437(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			@Pc(102) Class59 local102 = Static29.aClass60_1.method1802(new URL(Static29.aClass60_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static38.anInt950 + "&u=" + Static99.aLong80 + "&v1=" + Static102.aString3 + "&v2=" + Static102.aString6 + "&e=" + local7));
			while (local102.anInt2522 == 0) {
				Static9.method179(1L);
			}
			if (local102.anInt2522 == 1) {
				@Pc(123) DataInputStream local123 = (DataInputStream) local102.anObject3;
				local123.read();
				local123.close();
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[B[Lclient!ba;BLclient!ed;)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class6[] arg3, @OriginalArg(5) Class20 arg4) {
		@Pc(15) Class1_Sub8 local15 = new Class1_Sub8(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(23) int local23 = local15.method1190();
			if (local23 == 0) {
				return;
			}
			local17 += local23;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local15.method1190();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(52) int local52 = local34 >> 6 & 0x3F;
				@Pc(56) int local56 = local34 >> 12;
				@Pc(60) int local60 = local34 & 0x3F;
				@Pc(64) int local64 = local15.method1186();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(73) int local73 = local60 + arg0;
				@Pc(77) int local77 = arg1 + local52;
				@Pc(81) int local81 = local64 & 0x3;
				if (local77 > 0 && local73 > 0 && local77 < 103 && local73 < 103) {
					@Pc(98) int local98 = local56;
					if ((Static61.aByteArrayArrayArray7[1][local77][local73] & 0x2) == 2) {
						local98 = local56 - 1;
					}
					@Pc(112) Class6 local112 = null;
					if (local98 >= 0) {
						local112 = arg3[local98];
					}
					Static3.method99(local68, local112, local73, local77, local81, local56, local17, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	public static int method1689() {
		@Pc(15) int local15 = Static104.method1821(Static37.anInt917, Static82.anInt2165, Static68.anInt1671);
		return local15 - Static8.anInt243 >= 800 || (Static61.aByteArrayArrayArray7[Static82.anInt2165][Static68.anInt1671 >> 7][Static37.anInt917 >> 7] & 0x4) == 0 ? 3 : Static82.anInt2165;
	}
}
