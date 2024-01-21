import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_54;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!v;")
	private static Class62 aClass62_1096 = Static45.method753("glow2:");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_1093 = aClass62_1096;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_1098 = Static45.method753("Please contact customer support)3");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!v;")
	public static Class62 aClass62_1094 = aClass62_1098;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_1095 = Static45.method753("(X");

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!v;")
	private static Class62 aClass62_1097 = Static45.method753("Loading friend list");

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public static int anInt2431 = 0;

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	public static int anInt2432 = 256;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
	public static volatile int anInt2433 = -1;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public static int anInt2434 = -1;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public static int anInt2435 = 0;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!v;")
	public static Class62 aClass62_1099 = aClass62_1097;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIII)I")
	public static int method1541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(37) int local37 = arg1 & 0x7F;
		@Pc(39) int local39 = arg2;
		@Pc(43) int local43 = arg0 & 0x7F;
		if (arg2 < 3 && (Static44.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
			local39 = arg2 + 1;
		}
		@Pc(98) int local98 = Static79.anIntArrayArrayArray4[local39][local7][local11 + 1] * (128 - local43) + local43 * Static79.anIntArrayArrayArray4[local39][local7 + 1][local11 + 1] >> 7;
		@Pc(126) int local126 = Static79.anIntArrayArrayArray4[local39][local7][local11] * (128 - local43) + Static79.anIntArrayArrayArray4[local39][local7 + 1][local11] * local43 >> 7;
		return local37 * local98 + local126 * (128 - local37) >> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method1542() {
		aClass62_1099 = null;
		aClass62_1095 = null;
		aClass62_1096 = null;
		aClass62_1098 = null;
		aClass42_Sub1_54 = null;
		aClass62_1097 = null;
		aClass62_1093 = null;
		aClass62_1094 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!v;IIILclient!v;II)V")
	public static void method1543(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class62 arg4, @OriginalArg(5) int arg5) {
		if (Static41.anInt1209 >= 500) {
			return;
		}
		Static18.aClass62Array6[Static41.anInt1209] = Static49.method782(new Class62[] { arg0, Static16.aClass62_269, arg4 });
		Static46.anIntArray108[Static41.anInt1209] = arg2;
		Static27.anIntArray62[Static41.anInt1209] = arg3;
		Static74.anIntArray226[Static41.anInt1209] = arg5;
		Static50.anIntArray311[Static41.anInt1209] = arg1;
		Static41.anInt1209++;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1544(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static72.anInt1952 > 0) {
			local21 = Static6.aByteArrayArray1[--Static72.anInt1952];
			Static6.aByteArrayArray1[Static72.anInt1952] = null;
			return local21;
		} else if (arg0 == 5000 && Static85.anInt2266 > 0) {
			local21 = Static99.aByteArrayArray10[--Static85.anInt2266];
			Static99.aByteArrayArray10[Static85.anInt2266] = null;
			return local21;
		} else if (arg0 == 30000 && Static61.anInt1679 > 0) {
			@Pc(77) byte[] local77 = Static33.aByteArrayArray4[--Static61.anInt1679];
			Static33.aByteArrayArray4[Static61.anInt1679] = null;
			return local77;
		} else {
			return new byte[arg0];
		}
	}
}
