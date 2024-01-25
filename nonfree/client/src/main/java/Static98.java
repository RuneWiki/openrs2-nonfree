import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()V")
	public static void method1302() {
		if (Static173.anInt3140 == 0 || Static67.aClass44_6 == null) {
			return;
		}
		Static626.aClass67_16.K(Static464.anIntArray438);
		for (@Pc(14) int local14 = 0; local14 < Static41.anIntArray46.length; local14++) {
			Static626.aClass67_16.method7690(Static464.anIntArray438[3] - Static464.anIntArray438[1], -256, Static41.anIntArray46[local14] + Static532.anIntArray489[local14], Static464.anIntArray438[1]);
		}
		for (@Pc(43) int local43 = 0; local43 < Static505.anInt8623; local43++) {
			@Pc(48) Class79 local48 = Static406.aClass79Array2[local43];
			Static626.aClass67_16.H(local48.anIntArray116[0], local48.anIntArray118[0], local48.anIntArray117[0], Static398.anIntArray388);
			Static626.aClass67_16.H(local48.anIntArray116[1], local48.anIntArray118[1], local48.anIntArray117[1], Static547.anIntArray505);
			Static626.aClass67_16.H(local48.anIntArray116[2], local48.anIntArray118[2], local48.anIntArray117[2], Static583.anIntArray527);
			Static626.aClass67_16.H(local48.anIntArray116[3], local48.anIntArray118[3], local48.anIntArray117[3], Static610.anIntArray547);
			if (Static398.anIntArray388[2] != -1 && Static547.anIntArray505[2] != -1 && Static583.anIntArray527[2] != -1 && Static610.anIntArray547[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte35 == 4) {
					local136 = -16776961;
				}
				Static626.aClass67_16.method7640(Static398.anIntArray388[0], Static398.anIntArray388[1], local136, Static547.anIntArray505[1], Static547.anIntArray505[0]);
				Static626.aClass67_16.method7640(Static547.anIntArray505[0], Static547.anIntArray505[1], local136, Static583.anIntArray527[1], Static583.anIntArray527[0]);
				Static626.aClass67_16.method7640(Static583.anIntArray527[0], Static583.anIntArray527[1], local136, Static610.anIntArray547[1], Static610.anIntArray547[0]);
				Static626.aClass67_16.method7640(Static610.anIntArray547[0], Static610.anIntArray547[1], local136, Static398.anIntArray388[1], Static398.anIntArray388[0]);
				Static626.aClass67_16.method7640(Static398.anIntArray388[0], Static398.anIntArray388[1], local136, Static583.anIntArray527[1], Static583.anIntArray527[0]);
			}
		}
		Static67.aClass44_6.method8129(-256, "Dynamic: " + Static612.anInt9915 + "/" + 5000, -16777216, 10, 75);
		Static67.aClass44_6.method8129(-256, "Total Opaque Onscreen: " + Static407.anInt7263 + "/" + 10000, -16777216, 10, 90);
		Static67.aClass44_6.method8129(-256, "Total Trans Onscreen: " + Static81.anInt1265 + "/" + 5000, -16777216, 10, 105);
		Static67.aClass44_6.method8129(-256, "Occluders: " + (Static629.anInt10181 + Static458.anInt8069) + " Active: " + Static505.anInt8623, -16777216, 10, 120);
		Static67.aClass44_6.method8129(-256, "Occluded: Ground:" + Static714.anInt11150 + " Walls: " + Static709.anInt11219 + " CPs: " + Static149.anInt2804 + " Pixels: " + Static195.anInt7170, -16777216, 10, 135);
		Static67.aClass44_6.method8129(-256, "Occlude Calc Took: " + Static398.aLong240 / 1000L + "us", -16777216, 10, 150);
		if (Static173.anInt3140 != 2 || Static261.anIntArray274 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static261.anIntArray274.length; local389++) {
			@Pc(395) float local395 = (float) Static261.anIntArray274[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static261.anIntArray274[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class9 local444 = Static626.aClass67_16.method7688(Static261.anIntArray274, Static95.anInt1572, Static95.anInt1572, Static581.anInt9510);
		local444.method8621(10, 170, 1, 0, 0);
	}
}
