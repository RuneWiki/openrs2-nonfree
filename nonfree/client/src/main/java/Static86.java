import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
	public static int anInt2185;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "[I")
	public static int[] anIntArray152 = new int[1];

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "Lclient!de;")
	public static final Class69 aClass69_10 = new Class69(5);

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static void method1807() {
		if (Static347.anIntArray701 != null) {
			return;
		}
		Static347.anIntArray701 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(23) int local23 = 0; local23 < 65536; local23++) {
			@Pc(35) double local35 = (double) (local23 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(46) double local46 = (double) (local23 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(53) double local53 = (double) (local23 & 0x7F) / 128.0D;
			@Pc(55) double local55 = local53;
			@Pc(57) double local57 = local53;
			@Pc(59) double local59 = local53;
			if (local46 != 0.0D) {
				@Pc(73) double local73;
				if (local53 < 0.5D) {
					local73 = local53 * (local46 + 1.0D);
				} else {
					local73 = local46 + local53 - local53 * local46;
				}
				@Pc(89) double local89 = local53 * 2.0D - local73;
				@Pc(93) double local93 = local35 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local35 - 0.3333333333333333D;
				if (local93 * 6.0D < 1.0D) {
					local55 = local93 * 6.0D * (local73 - local89) + local89;
				} else if (local93 * 2.0D < 1.0D) {
					local55 = local73;
				} else if (local93 * 3.0D < 2.0D) {
					local55 = (local73 - local89) * 6.0D * (0.6666666666666666D - local93) + local89;
				} else {
					local55 = local89;
				}
				if (local35 * 6.0D < 1.0D) {
					local57 = local89 + local35 * (local73 - local89) * 6.0D;
				} else if (local35 * 2.0D < 1.0D) {
					local57 = local73;
				} else if (local35 * 3.0D < 2.0D) {
					local57 = local89 + (0.6666666666666666D - local35) * 6.0D * (local73 - local89);
				} else {
					local57 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local107 * 6.0D < 1.0D) {
					local59 = local107 * (local73 - local89) * 6.0D + local89;
				} else if (local107 * 2.0D < 1.0D) {
					local59 = local73;
				} else if (local107 * 3.0D < 2.0D) {
					local59 = local89 + (local73 - local89) * (-local107 + 0.6666666666666666D) * 6.0D;
				} else {
					local59 = local89;
				}
			}
			local55 = Math.pow(local55, local17);
			local57 = Math.pow(local57, local17);
			local59 = Math.pow(local59, local17);
			@Pc(278) int local278 = (int) (local55 * 256.0D);
			@Pc(283) int local283 = (int) (local57 * 256.0D);
			@Pc(288) int local288 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = local288 + (local278 << 16) + (local283 << 8);
			Static347.anIntArray701[local23] = local298;
		}
	}
}
