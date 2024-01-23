import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	public static int anInt1781;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString64 = "Allocating memory";

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ph;I)I")
	public static int method1384(@OriginalArg(0) Class138 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3340(Static255.anInt4978)) {
			local5++;
		}
		if (arg0.method3340(Static274.anInt5246)) {
			local5++;
		}
		if (arg0.method3340(Static91.anInt1744)) {
			local5++;
		}
		if (arg0.method3340(Static164.anInt3445)) {
			local5++;
		}
		if (arg0.method3340(Static247.anInt4897)) {
			local5++;
		}
		if (arg0.method3340(Static110.anInt2183)) {
			local5++;
		}
		if (arg0.method3340(Static297.anInt5627)) {
			local5++;
		}
		if (arg0.method3340(Static207.anInt4077)) {
			local5++;
		}
		if (arg0.method3340(Static199.anInt4004)) {
			local5++;
		}
		if (arg0.method3340(Static55.anInt1098)) {
			local5++;
		}
		if (arg0.method3340(Static242.anInt4865)) {
			local5++;
		}
		if (arg0.method3340(Static200.anInt5632)) {
			local5++;
		}
		if (arg0.method3340(Static191.anInt3920)) {
			local5++;
		}
		if (arg0.method3340(Static39.anInt792)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZBLclient!kc;)V")
	public static void method1385(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub1_Sub12 arg1) {
		@Pc(10) int local10;
		if (Static291.aBoolean404 || arg0) {
			local10 = Static136.anInt2696;
			@Pc(16) int local16 = local10 * 956 / 503;
			Static263.aClass1_Sub1_Sub3_9.method4631((Static159.anInt3348 - local16) / 2, 0, local16, local10);
			Static148.aClass103_1.method4594(Static159.anInt3348 / 2 - Static148.aClass103_1.anInt5857 / 2, 18);
		}
		arg1.method4432(Static35.anInt641 == 1 ? Static253.aString155 : Static105.aString77, Static159.anInt3348 / 2, Static136.anInt2696 / 2 - 26, 16777215, -1);
		local10 = Static136.anInt2696 / 2 - 18;
		if (Static291.aBoolean404) {
			Static133.method2164(Static159.anInt3348 / 2 - 152, local10, 304, 34, 9179409);
			Static133.method2164(Static159.anInt3348 / 2 - 151, local10 - -1, 302, 32, 0);
			Static133.method2176(Static159.anInt3348 / 2 - 150, local10 - -2, Static200.anInt5630 * 3, 30, 9179409);
			Static133.method2176(Static159.anInt3348 / 2 + Static200.anInt5630 * 3 - 150, local10 + 2, 300 - Static200.anInt5630 * 3, 30, 0);
		} else {
			Static41.method729(Static159.anInt3348 / 2 - 152, local10, 304, 34, 9179409);
			Static41.method729(Static159.anInt3348 / 2 - 151, local10 + 1, 302, 32, 0);
			Static41.method730(Static159.anInt3348 / 2 - 150, local10 - -2, Static200.anInt5630 * 3, 30, 9179409);
			Static41.method730(Static200.anInt5630 * 3 + Static159.anInt3348 / 2 - 150, local10 - -2, 300 - Static200.anInt5630 * 3, 30, 0);
		}
		arg1.method4432(Static265.aString169, Static159.anInt3348 / 2, Static136.anInt2696 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
	public static void method1387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static156.anInt3310; local3++) {
			if (arg1 < Static219.anIntArray345[local3] + Static220.anIntArray527[local3] && Static220.anIntArray527[local3] < arg2 + arg1 && Static244.anIntArray440[local3] + Static191.anIntArray319[local3] > arg0 && arg3 + arg0 > Static244.anIntArray440[local3]) {
				Static132.aBooleanArray25[local3] = true;
			}
		}
	}
}
