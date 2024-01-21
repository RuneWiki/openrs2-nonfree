import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ii;")
	public static Class47 aClass47_7;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_578 = Static151.method2243(" loggt sich aus)3");

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_579 = Static151.method2243("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public static int anInt1745 = 0;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!mb;")
	public static Class62 aClass62_580 = aClass62_579;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!pb;BI)Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 method1172(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1) {
		return Static39.method3119(arg1, arg0) ? Static144.method2182() : null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!mb;Lclient!mb;ILclient!mb;)V")
	public static void method1173(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(4) Class62 arg2) {
		Static38.method2178(-1, arg2, 9, arg0, arg1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIZ)Lclient!mb;")
	public static Class62 method1174(@OriginalArg(1) int arg0) {
		return Static126.method1980(true, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lclient!vi;")
	public static Class2_Sub1_Sub2 method1175() {
		@Pc(13) int local13 = Static86.anIntArray298[0] * Static138.anIntArray256[0];
		@Pc(17) byte[] local17 = Static8.aByteArrayArray1[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static108.anIntArray222[local17[local22] & 0xFF];
		}
		@Pc(57) Class2_Sub1_Sub2_Sub1 local57 = new Class2_Sub1_Sub2_Sub1(Static138.anInt2900, Static127.anInt2808, Static19.anIntArray38[0], Static25.anIntArray57[0], Static86.anIntArray298[0], Static138.anIntArray256[0], local20);
		Static169.method2456();
		return local57;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBIIIILclient!kd;)V")
	public static void method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub11 arg6) {
		@Pc(27) int local27;
		if (arg1 < 0 || arg1 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local27 = arg6.method1534();
				if (local27 == 0) {
					break;
				}
				if (local27 == 1) {
					arg6.method1534();
					break;
				}
				if (local27 <= 49) {
					arg6.method1534();
				}
			}
			return;
		}
		Static133.aByteArrayArrayArray11[arg5][arg1][arg4] = 0;
		while (true) {
			local27 = arg6.method1534();
			if (local27 == 0) {
				if (arg5 == 0) {
					Static171.anIntArrayArrayArray7[0][arg1][arg4] = -Static103.method1576(arg2 + arg1 + 932731, 556238 - -arg4 + arg3) * 8;
				} else {
					Static171.anIntArrayArrayArray7[arg5][arg1][arg4] = Static171.anIntArrayArrayArray7[arg5 - 1][arg1][arg4] - 240;
				}
				break;
			}
			if (local27 == 1) {
				@Pc(91) int local91 = arg6.method1534();
				if (local91 == 1) {
					local91 = 0;
				}
				if (arg5 == 0) {
					Static171.anIntArrayArrayArray7[0][arg1][arg4] = -local91 * 8;
				} else {
					Static171.anIntArrayArrayArray7[arg5][arg1][arg4] = Static171.anIntArrayArrayArray7[arg5 - 1][arg1][arg4] - local91 * 8;
				}
				break;
			}
			if (local27 <= 49) {
				Static197.aByteArrayArrayArray16[arg5][arg1][arg4] = arg6.method1552();
				Static50.aByteArrayArrayArray7[arg5][arg1][arg4] = (byte) ((local27 - 2) / 4);
				Static10.aByteArrayArrayArray2[arg5][arg1][arg4] = (byte) (local27 + arg0 - 2 & 0x3);
			} else if (local27 <= 81) {
				Static133.aByteArrayArrayArray11[arg5][arg1][arg4] = (byte) (local27 - 49);
			} else {
				Static150.aByteArrayArrayArray14[arg5][arg1][arg4] = (byte) (local27 - 81);
			}
		}
	}
}
