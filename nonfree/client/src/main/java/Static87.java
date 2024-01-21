import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!pc;")
	public static Class12 aClass12_67;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "[Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4[] aClass3_Sub3_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_39;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1102 = method1648("_");

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1103 = method1648("Select");

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1104 = method1648("backleft2");

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public static int anInt2332 = 0;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt2334 = 0;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1105 = method1648("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1106 = method1648("scroll:");

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1113 = method1648("K");

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1107 = aClass27_1113;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public static int anInt2341 = -1;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1108 = method1648("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public static int anInt2343 = 0;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1109 = aClass27_1103;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1110 = aClass27_1106;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1111 = method1648("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!r", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1112 = aClass27_1113;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[B)I")
	public static int method1642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local7 = Class3_Sub3_Sub13.anIntArray377[(arg2[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!mc;)V")
	public static void method1643(@OriginalArg(1) Class41 arg0) {
		Static31.aClass41_1 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1644() {
		aClass3_Sub3_Sub2_Sub4Array7 = null;
		aClass12_67 = null;
		aClass27_1113 = null;
		aClass27_1111 = null;
		aClass27_1108 = null;
		aClass27_1102 = null;
		aClass27_1107 = null;
		aClass27_1106 = null;
		aClass27_1110 = null;
		aClass54_Sub1_39 = null;
		aClass27_1109 = null;
		aClass27_1104 = null;
		aClass27_1112 = null;
		aClass27_1105 = null;
		aClass27_1103 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[Lclient!hb;I)Lclient!hb;")
	public static Class27 method1645(@OriginalArg(0) int arg0, @OriginalArg(2) Class27[] arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg1[local9] == null) {
				arg1[local9] = Static91.aClass27_1185;
			}
			local7 += arg1[local9].anInt963;
		}
		@Pc(43) int local43 = 0;
		@Pc(46) byte[] local46 = new byte[local7];
		@Pc(56) Class27 local56;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			local56 = arg1[local48];
			Static117.method1761(local56.aByteArray9, 0, local46, local43, local56.anInt963);
			local43 += local56.anInt963;
		}
		local56 = new Class27();
		local56.anInt963 = local7;
		local56.aByteArray9 = local46;
		return local56;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!hb;")
	public static Class27 method1648(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class27 local13 = new Class27();
		local13.aByteArray9 = new byte[local9];
		@Pc(24) int local24 = 0;
		while (local24 < local9) {
			@Pc(32) int local32 = local6[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local9 <= local24) {
					break;
				}
				@Pc(70) int local70 = local6[local24++] & 0xFF;
				local13.aByteArray9[local13.anInt963++] = (byte) ((local32 - 40) * 43 + local70 - 48);
			} else if (local32 != 0) {
				local13.aByteArray9[local13.anInt963++] = (byte) local32;
			}
		}
		local13.method730();
		return local13.method745();
	}
}
