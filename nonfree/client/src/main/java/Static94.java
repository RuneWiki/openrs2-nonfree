import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!je", name = "T", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_741 = Static151.method2243(":duelstake:");

	@OriginalMember(owner = "client!je", name = "U", descriptor = "[I")
	public static final int[] anIntArray199 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!je", name = "db", descriptor = "I")
	public static int anInt2095 = -1;

	@OriginalMember(owner = "client!je", name = "gb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_742 = Static151.method2243("gleiten:");

	@OriginalMember(owner = "client!je", name = "mb", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BB)Lclient!ji;")
	public static Class2_Sub1_Sub12 method1424(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) Class2_Sub1_Sub12_Sub1_Sub1 local17 = new Class2_Sub1_Sub12_Sub1_Sub1(arg0, Static19.anIntArray38, Static25.anIntArray57, Static86.anIntArray298, Static138.anIntArray256, Static8.aByteArrayArray1);
			Static169.method2456();
			return local17;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1426(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIZ)V")
	public static void method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static29.anInt713; local12++) {
			if (Static11.anIntArray26[local12] + Static181.anIntArray332[local12] > arg0 && Static181.anIntArray332[local12] < arg0 + arg1 && arg3 < Static115.anIntArray237[local12] + Static209.anIntArray391[local12] && arg3 + arg2 > Static209.anIntArray391[local12]) {
				Static32.aBooleanArray3[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method1428(@OriginalArg(0) Class62 arg0) {
		if (Static123.aClass2_Sub22Array11 == null) {
			return;
		}
		@Pc(12) long local12 = arg0.method1843();
		@Pc(14) int local14 = 0;
		if (local12 == 0L) {
			return;
		}
		while (local14 < Static123.aClass2_Sub22Array11.length && Static123.aClass2_Sub22Array11[local14].aLong148 != local12) {
			local14++;
		}
		if (local14 < Static123.aClass2_Sub22Array11.length && Static123.aClass2_Sub22Array11[local14] != null) {
			Static58.aClass2_Sub11_Sub1_2.method1595(215);
			Static58.aClass2_Sub11_Sub1_2.method1527(Static123.aClass2_Sub22Array11[local14].aLong148);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!pb;III)[Lclient!hh;")
	public static Class42[] method1429(@OriginalArg(0) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static157.method2317(arg1, arg0, arg2) ? Static65.method900() : null;
	}
}
