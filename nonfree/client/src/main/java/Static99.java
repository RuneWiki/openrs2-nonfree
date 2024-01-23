import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!he", name = "U", descriptor = "I")
	public static int anInt2122;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "[I")
	public static int[] anIntArray148 = new int[2500];

	@OriginalMember(owner = "client!he", name = "T", descriptor = "I")
	public static int anInt2121 = 0;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)I")
	public static int method1923() {
		return 2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZII)I")
	public static int method1924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static217.method3524(arg1 - 1, arg0 + -1) + Static217.method3524(arg1 + 1, arg0 - 1) + Static217.method3524(arg1 + -1, arg0 - -1) + Static217.method3524(arg1 + 1, arg0 + 1);
		@Pc(77) int local77 = Static217.method3524(arg1 - 1, arg0) + Static217.method3524(arg1 + 1, arg0) + Static217.method3524(arg1, arg0 - 1) + Static217.method3524(arg1, arg0 + 1);
		@Pc(82) int local82 = Static217.method3524(arg1, arg0);
		return local77 / 8 + local36 / 16 + local82 / 4;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)I")
	public static int method1926(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!si;I)Z")
	public static boolean method1927(@OriginalArg(0) Class157 arg0) {
		if (arg0.anInt4686 == 205) {
			Static213.anInt5512 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!rm;IB)V")
	public static void method1928(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object[] local4 = arg0.anObjectArray2;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class1_Sub5_Sub13 local18 = Static140.method2470(local14);
		if (local18 == null) {
			return;
		}
		Static212.anIntArray452 = new int[local18.anInt3162];
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		Static254.aStringArray31 = new String[local18.anInt3155];
		for (@Pc(36) int local36 = 1; local36 < local4.length; local36++) {
			if (local4[local36] instanceof Integer) {
				@Pc(85) int local85 = (Integer) local4[local36];
				if (local85 == -2147483647) {
					local85 = arg0.anInt4523;
				}
				if (local85 == -2147483646) {
					local85 = arg0.anInt4522;
				}
				if (local85 == -2147483645) {
					local85 = arg0.aClass157_13 == null ? -1 : arg0.aClass157_13.anInt4672;
				}
				if (local85 == -2147483644) {
					local85 = arg0.anInt4526;
				}
				if (local85 == -2147483643) {
					local85 = arg0.aClass157_13 == null ? -1 : arg0.aClass157_13.anInt4692;
				}
				if (local85 == -2147483642) {
					local85 = arg0.aClass157_14 == null ? -1 : arg0.aClass157_14.anInt4672;
				}
				if (local85 == -2147483641) {
					local85 = arg0.aClass157_14 == null ? -1 : arg0.aClass157_14.anInt4692;
				}
				if (local85 == -2147483640) {
					local85 = arg0.anInt4518;
				}
				if (local85 == -2147483639) {
					local85 = arg0.anInt4525;
				}
				Static212.anIntArray452[local30++] = local85;
			} else if (local4[local36] instanceof String) {
				@Pc(64) String local64 = (String) local4[local36];
				if (local64.equals("event_opbase")) {
					local64 = arg0.aString161;
				}
				Static254.aStringArray31[local28++] = local64;
			}
		}
		Static314.method4674(arg1, local18);
	}
}
