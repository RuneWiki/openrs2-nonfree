import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILclient!mr;I)V", line = 8)
	public static void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub5_Sub2 arg3) {
		@Pc(16) Class222 local16 = arg3.method4333();
		@Pc(26) int local26 = arg3.anInt4607 - arg3.aClass248_7.anInt7184 & 0x3FFF;
		if (arg2 == -1) {
			if (local26 != 0 || arg3.anInt4597 > 25) {
				arg3.aBoolean317 = false;
				if (arg0 < 0 && local16.anInt6274 != -1) {
					arg3.anInt4577 = local16.anInt6274;
				} else if (arg0 <= 0 || local16.anInt6261 == -1) {
					arg3.anInt4577 = local16.anInt6258;
				} else {
					arg3.anInt4577 = local16.anInt6261;
				}
			} else if (!arg3.aBoolean317 || !local16.method5693(arg3.anInt4577)) {
				arg3.anInt4577 = local16.method5697();
				arg3.aBoolean317 = arg3.anInt4577 != -1;
			}
		} else if (arg3.anInt4602 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(225) int local225 = Class2_Sub3_Sub37.anIntArray479[arg1] - arg3.aClass248_7.anInt7184 & 0x3FFF;
			if (arg2 == 2 && local16.anInt6251 != -1) {
				if (local225 > 2048 && local225 <= 6144 && local16.anInt6289 != -1) {
					arg3.anInt4577 = local16.anInt6289;
				} else if (local225 >= 10240 && local225 < 14336 && local16.anInt6259 != -1) {
					arg3.anInt4577 = local16.anInt6259;
				} else if (local225 <= 6144 || local225 >= 10240 || local16.anInt6280 == -1) {
					arg3.anInt4577 = local16.anInt6251;
				} else {
					arg3.anInt4577 = local16.anInt6280;
				}
			} else if (arg2 == 0 && local16.anInt6253 != -1) {
				if (local225 > 2048 && local225 <= 6144 && local16.anInt6255 != -1) {
					arg3.anInt4577 = local16.anInt6255;
				} else if (local225 >= 10240 && local225 < 14336 && local16.anInt6272 != -1) {
					arg3.anInt4577 = local16.anInt6272;
				} else if (local225 <= 6144 || local225 >= 10240 || local16.anInt6287 == -1) {
					arg3.anInt4577 = local16.anInt6253;
				} else {
					arg3.anInt4577 = local16.anInt6287;
				}
			} else if (local225 > 2048 && local225 <= 6144 && local16.anInt6284 != -1) {
				arg3.anInt4577 = local16.anInt6284;
			} else if (local225 >= 10240 && local225 < 14336 && local16.anInt6256 != -1) {
				arg3.anInt4577 = local16.anInt6256;
			} else if (local225 <= 6144 || local225 >= 10240 || local16.anInt6281 == -1) {
				arg3.anInt4577 = local16.anInt6258;
			} else {
				arg3.anInt4577 = local16.anInt6281;
			}
			arg3.aBoolean317 = false;
		} else if (local26 == 0 && arg3.anInt4597 <= 25) {
			if (arg2 == 2 && local16.anInt6251 != -1) {
				arg3.anInt4577 = local16.anInt6251;
			} else if (arg2 == 0 && local16.anInt6253 != -1) {
				arg3.anInt4577 = local16.anInt6253;
			} else {
				arg3.anInt4577 = local16.anInt6258;
			}
			arg3.aBoolean317 = false;
		} else {
			if (arg2 == 2 && local16.anInt6251 != -1) {
				if (arg0 < 0 && local16.anInt6252 != -1) {
					arg3.anInt4577 = local16.anInt6252;
				} else if (arg0 <= 0 || local16.anInt6263 == -1) {
					arg3.anInt4577 = local16.anInt6251;
				} else {
					arg3.anInt4577 = local16.anInt6263;
				}
			} else if (arg2 == 0 && local16.anInt6253 != -1) {
				if (arg0 < 0 && local16.anInt6285 != -1) {
					arg3.anInt4577 = local16.anInt6285;
				} else if (arg0 <= 0 || local16.anInt6283 == -1) {
					arg3.anInt4577 = local16.anInt6253;
				} else {
					arg3.anInt4577 = local16.anInt6283;
				}
			} else if (arg0 < 0 && local16.anInt6265 != -1) {
				arg3.anInt4577 = local16.anInt6265;
			} else if (arg0 <= 0 || local16.anInt6270 == -1) {
				arg3.anInt4577 = local16.anInt6258;
			} else {
				arg3.anInt4577 = local16.anInt6270;
			}
			arg3.aBoolean317 = false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qg;B)I", line = 181)
	public static int method2163(@OriginalArg(0) Class2_Sub4_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method4869(2);
		@Pc(22) int local22;
		if (local10 == 0) {
			local22 = 0;
		} else if (local10 == 1) {
			local22 = arg0.method4869(5);
		} else if (local10 == 2) {
			local22 = arg0.method4869(8);
		} else {
			local22 = arg0.method4869(11);
		}
		return local22;
	}
}
