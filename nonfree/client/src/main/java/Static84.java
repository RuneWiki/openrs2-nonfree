import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	public static int[] anIntArray431;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public static int anInt1971 = -1;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt1973 = 0;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int anInt1974 = 0;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	public static int anInt1977 = -1;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_569 = Static13.method257("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public static int anInt1978 = 0;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public static int anInt1979 = -1;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_570 = Static13.method257("Please use a different world)3");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1358() {
		aClass40_569 = null;
		aClass40_570 = null;
		anIntArray431 = null;
		aLongArray4 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1359(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub3 local8 = new Class2_Sub3(arg0);
		@Pc(12) int local12 = local8.method1708();
		@Pc(16) int local16 = local8.method1728();
		if (local16 < 0 || Static31.anInt2528 != 0 && Static31.anInt2528 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(40) byte[] local40 = new byte[local16];
			local8.method1709(local16, local40);
			return local40;
		} else {
			@Pc(52) int local52 = local8.method1728();
			if (local52 < 0 || Static31.anInt2528 != 0 && local52 > Static31.anInt2528) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local52];
			if (local12 == 1) {
				Static78.method1265(local69, local52, arg0, local16);
			} else {
				try {
					@Pc(85) DataInputStream local85 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local16)));
					local85.readFully(local69);
					local85.close();
				} catch (@Pc(92) IOException local92) {
				}
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!vc;")
	public static Class2_Sub2_Sub16 method1360(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub16 local6 = (Class2_Sub2_Sub16) Static19.aClass47_4.method1325((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static43.aClass5_25.method68(arg0, 1);
		local6 = new Class2_Sub2_Sub16();
		if (local25 != null) {
			local6.method1640(new Class2_Sub3(local25), arg0);
		}
		local6.method1641();
		Static19.aClass47_4.method1332((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 method1361() {
		@Pc(9) Class2_Sub2_Sub2_Sub4 local9 = new Class2_Sub2_Sub2_Sub4();
		local9.anInt2445 = Static44.anInt1079;
		local9.anInt2443 = Static104.anInt2513;
		local9.anInt2444 = Static83.anIntArray430[0];
		local9.anInt2441 = Static97.anIntArray503[0];
		local9.anInt2446 = Static66.anIntArray338[0];
		local9.anInt2442 = Static19.anIntArray86[0];
		@Pc(50) int local50 = local9.anInt2442 * local9.anInt2446;
		@Pc(54) byte[] local54 = Static91.aByteArrayArray10[0];
		local9.anIntArray534 = new int[local50];
		for (@Pc(60) int local60 = 0; local60 < local50; local60++) {
			local9.anIntArray534[local60] = Static20.anIntArray92[local54[local60] & 0xFF];
		}
		Static93.method1485();
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
	public static int method1362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}
