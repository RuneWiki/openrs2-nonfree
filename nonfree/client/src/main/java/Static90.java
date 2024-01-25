import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public static void method1709() {
		if (Static404.anInt7413 == 0 || Static163.aClass38_3 == null) {
			return;
		}
		Static533.aClass137_41.K(Static167.anIntArray275);
		for (@Pc(12) int local12 = 0; local12 < Static133.anIntArray213.length; local12++) {
			Static533.aClass137_41.method7947(Static133.anIntArray213[local12] + Static230.anIntArray334[local12], Static167.anIntArray275[3] - Static167.anIntArray275[1], Static167.anIntArray275[1], -256);
		}
		for (@Pc(41) int local41 = 0; local41 < Static157.anInt3110; local41++) {
			@Pc(46) Class296 local46 = Static622.aClass296Array3[local41];
			Static533.aClass137_41.H(local46.anIntArray658[0], local46.anIntArray657[0], local46.anIntArray659[0], Static61.anIntArray98);
			Static533.aClass137_41.H(local46.anIntArray658[1], local46.anIntArray657[1], local46.anIntArray659[1], Static384.anIntArray515);
			Static533.aClass137_41.H(local46.anIntArray658[2], local46.anIntArray657[2], local46.anIntArray659[2], Static495.anIntArray653);
			Static533.aClass137_41.H(local46.anIntArray658[3], local46.anIntArray657[3], local46.anIntArray659[3], Static664.anIntArray820);
			if (Static61.anIntArray98[2] != -1 && Static384.anIntArray515[2] != -1 && Static495.anIntArray653[2] != -1 && Static664.anIntArray820[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte130 == 4) {
					local128 = -16776961;
				}
				Static533.aClass137_41.method7877(local128, Static384.anIntArray515[1], Static61.anIntArray98[1], Static384.anIntArray515[0], Static61.anIntArray98[0]);
				Static533.aClass137_41.method7877(local128, Static495.anIntArray653[1], Static384.anIntArray515[1], Static495.anIntArray653[0], Static384.anIntArray515[0]);
				Static533.aClass137_41.method7877(local128, Static664.anIntArray820[1], Static495.anIntArray653[1], Static664.anIntArray820[0], Static495.anIntArray653[0]);
				Static533.aClass137_41.method7877(local128, Static61.anIntArray98[1], Static664.anIntArray820[1], Static61.anIntArray98[0], Static664.anIntArray820[0]);
				Static533.aClass137_41.method7877(local128, Static495.anIntArray653[1], Static61.anIntArray98[1], Static495.anIntArray653[0], Static61.anIntArray98[0]);
			}
		}
		Static163.aClass38_3.method8985("Dynamic: " + Static585.anInt10026 + "/" + 5000, -256, -16777216, 75, 10);
		Static163.aClass38_3.method8985("Total Opaque Onscreen: " + Static288.anInt8152 + "/" + 10000, -256, -16777216, 90, 10);
		Static163.aClass38_3.method8985("Total Trans Onscreen: " + Static415.anInt7536 + "/" + 5000, -256, -16777216, 105, 10);
		Static163.aClass38_3.method8985("Occluders: " + (Static275.anInt4779 + Static54.anInt1357) + " Active: " + Static157.anInt3110, -256, -16777216, 120, 10);
		Static163.aClass38_3.method8985("Occluded: Ground:" + Static333.anInt6303 + " Walls: " + Static338.anInt6354 + " CPs: " + Static508.anInt8976 + " Pixels: " + Static24.anInt440, -256, -16777216, 135, 10);
		Static163.aClass38_3.method8985("Occlude Calc Took: " + Static637.aLong290 / 1000L + "us", -256, -16777216, 150, 10);
		if (Static404.anInt7413 != 2 || Static643.anIntArray801 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static643.anIntArray801.length; local355++) {
			@Pc(361) float local361 = (float) Static643.anIntArray801[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static643.anIntArray801[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class20 local410 = Static533.aClass137_41.method7885(Static415.anInt7538, Static429.anInt4560, Static643.anIntArray801, Static429.anInt4560);
		local410.method7402(10, 170, 1, 0, 0);
	}
}
