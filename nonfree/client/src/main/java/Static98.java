import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!hb;")
	public static Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!oa;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_3 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1335 = Static23.method501("Die Verbindung konnte");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static volatile int anInt2490 = -1;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1336 = Static23.method501("blinken1:");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	public static int anInt2491 = 0;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "[I")
	public static int[] anIntArray375 = new int[32768];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZII)Lclient!mc;")
	public static Class42 method1710(@OriginalArg(3) int arg0) {
		@Pc(8) int local8 = 1;
		for (@Pc(26) int local26 = arg0 / 10; local26 != 0; local26 /= 10) {
			local8++;
		}
		@Pc(37) int local37 = local8;
		if (arg0 < 0) {
			local37 = local8 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local37];
		if (arg0 < 0) {
			local48[0] = 45;
		}
		for (@Pc(64) int local64 = 0; local64 < local8; local64++) {
			@Pc(70) int local70 = arg0 % 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			local48[local37 - local64 - 1] = (byte) (local70 + 48);
			arg0 /= 10;
		}
		@Pc(110) Class42 local110 = new Class42();
		local110.anInt1468 = local37;
		local110.aByteArray17 = local48;
		return local110;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ja;ILclient!ja;Z)V")
	public static void method1711(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) boolean arg2) {
		Static1.aClass33_1 = arg0;
		Static106.aClass33_33 = arg1;
		Static37.aBoolean45 = arg2;
		Static24.anInt716 = Static1.aClass33_1.method1299(10);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1712(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static95.anInt2465 > 0) {
			local16 = Static17.aByteArrayArray2[--Static95.anInt2465];
			Static17.aByteArrayArray2[Static95.anInt2465] = null;
			return local16;
		} else if (arg0 == 5000 && Static89.anInt2373 > 0) {
			local16 = Static35.aByteArrayArray4[--Static89.anInt2373];
			Static35.aByteArrayArray4[Static89.anInt2373] = null;
			return local16;
		} else if (arg0 == 30000 && Static89.anInt2379 > 0) {
			local16 = Static61.aByteArrayArray7[--Static89.anInt2379];
			Static61.aByteArrayArray7[Static89.anInt2379] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!nc;)V")
	public static void method1714(@OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static90.anIntArray369.length; local7++) {
			Static90.anIntArray369[local7] = 0;
		}
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 5000; local19++) {
			local28 = (int) (Math.random() * 128.0D * (double) 256);
			Static90.anIntArray369[local28] = (int) (Math.random() * 256.0D);
		}
		@Pc(46) int local46;
		@Pc(49) int local49;
		@Pc(56) int local56;
		for (local28 = 0; local28 < 20; local28++) {
			for (local46 = 1; local46 < 255; local46++) {
				for (local49 = 1; local49 < 127; local49++) {
					local56 = (local46 << 7) + local49;
					Static65.anIntArray226[local56] = (Static90.anIntArray369[local56 - 128] + Static90.anIntArray369[local56 + 1] + Static90.anIntArray369[local56 - 1] + Static90.anIntArray369[local56 + 128]) / 4;
				}
			}
			@Pc(97) int[] local97 = Static90.anIntArray369;
			Static90.anIntArray369 = Static65.anIntArray226;
			Static65.anIntArray226 = local97;
		}
		if (arg0 == null) {
			return;
		}
		local46 = 0;
		for (local49 = 0; local49 < arg0.anInt1628; local49++) {
			for (local56 = 0; local56 < arg0.anInt1627; local56++) {
				if (arg0.aByteArray23[local46++] != 0) {
					@Pc(130) int local130 = arg0.anInt1625 + local56 + 16;
					@Pc(138) int local138 = local49 + arg0.anInt1624 + 16;
					@Pc(144) int local144 = (local138 << 7) + local130;
					Static90.anIntArray369[local144] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1715() {
		aByteArrayArray10 = null;
		aClass29_1 = null;
		aClass42_1336 = null;
		aClass1_Sub8_Sub1_3 = null;
		anIntArray375 = null;
		aClass42_1335 = null;
	}
}
