import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public static int anInt1930;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_15;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!pb;")
	public static Class41 aClass41_45;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1223 = Static69.method1153("mapfunction");

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1224 = Static69.method1153("backright2");

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1225 = Static69.method1153("Wordpack geladen)3");

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!md;")
	public static Class50 aClass50_9 = new Class50();

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1226 = Static69.method1153(":  ");

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1227 = Static69.method1153("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1228 = Static69.method1153("rot:");

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[I")
	public static int[] anIntArray287 = new int[500];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
	public static void method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub1_Sub13 local7 = Static81.method1071(arg1);
		@Pc(10) int local10 = local7.anInt2136;
		@Pc(13) int local13 = local7.anInt2140;
		@Pc(16) int local16 = local7.anInt2137;
		@Pc(23) int local23 = Class1_Sub1_Sub2_Sub2.anIntArray186[local16 - local10];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local10;
		Static101.anIntArray333[local13] = local23 & arg0 << local10 | ~local23 & Static101.anIntArray333[local13];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method1391() {
		aClass50_9 = null;
		aClass64_1224 = null;
		aClass64_1226 = null;
		anIntArray287 = null;
		aClass64_1225 = null;
		aClass64_1228 = null;
		aClass64_1223 = null;
		aClass41_45 = null;
		aClass64_1227 = null;
		aClass1_Sub1_Sub5_Sub3_15 = null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIB)I")
	public static int method1392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method1393(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static70.anInt1576 > 0) {
			local18 = Static79.aByteArrayArray6[--Static70.anInt1576];
			Static79.aByteArrayArray6[Static70.anInt1576] = null;
			return local18;
		} else if (arg0 == 5000 && Static54.anInt2061 > 0) {
			local18 = Static105.aByteArrayArray7[--Static54.anInt2061];
			Static105.aByteArrayArray7[Static54.anInt2061] = null;
			return local18;
		} else if (arg0 == 30000 && Static48.anInt2579 > 0) {
			local18 = Static46.aByteArrayArray4[--Static48.anInt2579];
			Static46.aByteArrayArray4[Static48.anInt2579] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)I")
	public static int method1394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg5;
			arg5 = local6;
		}
		@Pc(18) int local18 = arg4 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 1 + 7 - arg1 - arg2;
		} else {
			return 1 + 7 - arg5 - arg0;
		}
	}
}
