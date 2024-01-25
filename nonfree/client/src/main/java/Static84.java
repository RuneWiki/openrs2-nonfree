import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_45 = new Class169(72, 1);

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "[I")
	public static final int[] anIntArray73 = new int[1024];

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!in;")
	public static final Class169 aClass169_46 = new Class169(99, -1);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!kja;)V")
	public static void method1421(@OriginalArg(1) Class2_Sub8_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method5231();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static383.anInt7249; local12++) {
			local18 = Static404.anIntArray362[local12];
			if ((Static363.aByteArray67[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static363.aByteArray67[local18] = (byte) (Static363.aByteArray67[local18] | 0x2);
				} else {
					local46 = arg0.method5233(1);
					if (local46 == 0) {
						local7 = Static664.method9704(arg0);
						Static363.aByteArray67[local18] = (byte) (Static363.aByteArray67[local18] | 0x2);
					} else {
						Static646.method9527(arg0, local18);
					}
				}
			}
		}
		arg0.method5234();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5231();
		@Pc(128) int local128;
		for (local18 = 0; local18 < Static383.anInt7249; local18++) {
			local46 = Static404.anIntArray362[local18];
			if ((Static363.aByteArray67[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static363.aByteArray67[local46] = (byte) (Static363.aByteArray67[local46] | 0x2);
				} else {
					local128 = arg0.method5233(1);
					if (local128 == 0) {
						local7 = Static664.method9704(arg0);
						Static363.aByteArray67[local46] = (byte) (Static363.aByteArray67[local46] | 0x2);
					} else {
						Static646.method9527(arg0, local46);
					}
				}
			}
		}
		arg0.method5234();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5231();
		@Pc(214) int local214;
		for (local46 = 0; local46 < Static92.anInt11207; local46++) {
			local128 = Static231.anIntArray215[local46];
			if ((Static363.aByteArray67[local128] & 0x1) != 0) {
				if (local7 > 0) {
					Static363.aByteArray67[local128] = (byte) (Static363.aByteArray67[local128] | 0x2);
					local7--;
				} else {
					local214 = arg0.method5233(1);
					if (local214 == 0) {
						local7 = Static664.method9704(arg0);
						Static363.aByteArray67[local128] = (byte) (Static363.aByteArray67[local128] | 0x2);
					} else if (Static238.method4269(arg0, local128)) {
						Static363.aByteArray67[local128] = (byte) (Static363.aByteArray67[local128] | 0x2);
					}
				}
			}
		}
		arg0.method5234();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5231();
		for (local128 = 0; local128 < Static92.anInt11207; local128++) {
			local214 = Static231.anIntArray215[local128];
			if ((Static363.aByteArray67[local214] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static363.aByteArray67[local214] = (byte) (Static363.aByteArray67[local214] | 0x2);
				} else {
					@Pc(304) int local304 = arg0.method5233(1);
					if (local304 == 0) {
						local7 = Static664.method9704(arg0);
						Static363.aByteArray67[local214] = (byte) (Static363.aByteArray67[local214] | 0x2);
					} else if (Static238.method4269(arg0, local214)) {
						Static363.aByteArray67[local214] = (byte) (Static363.aByteArray67[local214] | 0x2);
					}
				}
			}
		}
		arg0.method5234();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static92.anInt11207 = 0;
		Static383.anInt7249 = 0;
		for (local214 = 1; local214 < 2048; local214++) {
			Static363.aByteArray67[local214] = (byte) (Static363.aByteArray67[local214] >> 1);
			@Pc(378) Class15_Sub3_Sub3_Sub1_Sub1 local378 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local214];
			if (local378 == null) {
				Static231.anIntArray215[Static92.anInt11207++] = local214;
			} else {
				Static404.anIntArray362[Static383.anInt7249++] = local214;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BII)Z")
	public static boolean method1423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
