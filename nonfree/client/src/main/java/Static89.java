import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public static int anInt4025;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1410 = Static120.method2057(":");

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public static int anInt4029 = 0;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1411 = Static120.method2057("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
	public static int anInt4032 = 0;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1412 = Static120.method2057("<img=0>");

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method3068() {
		anIntArray425 = null;
		aClass81_1411 = null;
		aClass81_1412 = null;
		aClass81_1410 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!vb;)V")
	public static void method3069(@OriginalArg(1) Class82 arg0) {
		Static33.aClass82_16 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!vb;ILclient!vb;Lclient!vb;Lclient!vb;)V")
	public static void method3070(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) Class82 arg3) {
		Static120.aClass82_45 = arg2;
		Static20.aClass82_8 = arg1;
		Static106.aClass82_38 = arg0;
		Static148.aClass82_59 = arg3;
		Static131.aClass77ArrayArray1 = new Class77[Static106.aClass82_38.method2958()][];
		Static53.aBooleanArray5 = new boolean[Static106.aClass82_38.method2958()];
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Lclient!tg;")
	public static Class81 method3071(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static127.method2169(new Class81[] { Static5.aClass81_57, Static149.method2548(arg0), Static149.aClass81_1211 });
		} else if (arg0 < 10000000) {
			return Static127.method2169(new Class81[] { Static97.aClass81_753, Static149.method2548(arg0 / 1000), Static104.aClass81_801, Static149.aClass81_1211 });
		} else {
			return Static127.method2169(new Class81[] { Static54.aClass81_458, Static149.method2548(arg0 / 1000000), Static35.aClass81_340, Static149.aClass81_1211 });
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!gh;II)V")
	public static void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub1_Sub3_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13;
		if ((arg2 & 0x2) != 0) {
			local13 = Static21.aClass1_Sub8_Sub1_1.method326();
			@Pc(16) byte[] local16 = new byte[local13];
			@Pc(21) Class1_Sub8 local21 = new Class1_Sub8(local16);
			Static21.aClass1_Sub8_Sub1_1.method342(local13, local16);
			Static21.aClass1_Sub8Array1[arg0] = local21;
			arg1.method1105(local21);
		}
		if ((arg2 & 0x40) != 0) {
			arg1.anInt3052 = Static21.aClass1_Sub8_Sub1_1.method312();
			if (arg1.anInt3052 == 65535) {
				arg1.anInt3052 = -1;
			}
		}
		@Pc(65) int local65;
		if ((arg2 & 0x4) != 0) {
			local13 = Static21.aClass1_Sub8_Sub1_1.method359();
			local65 = Static21.aClass1_Sub8_Sub1_1.method336();
			@Pc(69) int local69 = Static21.aClass1_Sub8_Sub1_1.method353();
			@Pc(72) int local72 = Static21.aClass1_Sub8_Sub1_1.anInt446;
			if (arg1.aClass81_518 != null && arg1.aClass90_2 != null) {
				@Pc(83) long local83 = arg1.aClass81_518.method2821();
				@Pc(85) boolean local85 = false;
				if (local65 <= 1) {
					for (@Pc(92) int local92 = 0; local92 < Static9.anInt178; local92++) {
						if (local83 == Static90.aLongArray4[local92]) {
							local85 = true;
							break;
						}
					}
				}
				if (!local85 && Static57.anInt1360 == 0) {
					Static96.aClass1_Sub8_3.anInt446 = 0;
					Static21.aClass1_Sub8_Sub1_1.method342(local69, Static96.aClass1_Sub8_3.aByteArray3);
					Static96.aClass1_Sub8_3.anInt446 = 0;
					@Pc(139) Class81 local139 = Static186.method1941(Static164.method2872(Static96.aClass1_Sub8_3).method2813());
					arg1.aClass81_1088 = local139.method2809();
					arg1.anInt3032 = local13 & 0xFF;
					arg1.anInt3035 = 150;
					arg1.anInt3015 = local13 >> 8;
					if (local65 == 2 || local65 == 3) {
						Static131.method2247(1, local139, Static127.method2169(new Class81[] { Static158.aClass81_1284, arg1.aClass81_518 }));
					} else if (local65 == 1) {
						Static131.method2247(1, local139, Static127.method2169(new Class81[] { Static93.aClass81_726, arg1.aClass81_518 }));
					} else {
						Static131.method2247(2, local139, arg1.aClass81_518);
					}
				}
			}
			Static21.aClass1_Sub8_Sub1_1.anInt446 = local72 + local69;
		}
		if ((arg2 & 0x100) != 0) {
			local13 = Static21.aClass1_Sub8_Sub1_1.method362();
			local65 = Static21.aClass1_Sub8_Sub1_1.method362();
			arg1.method2365(Static142.anInt3104, local13, local65);
		}
		if ((arg2 & 0x10) != 0) {
			local13 = Static21.aClass1_Sub8_Sub1_1.method338();
			if (local13 == 65535) {
				local13 = -1;
			}
			local65 = Static21.aClass1_Sub8_Sub1_1.method362();
			Static160.method2790(arg1, local65, local13);
		}
		if ((arg2 & 0x1) != 0) {
			local13 = Static21.aClass1_Sub8_Sub1_1.method326();
			local65 = Static21.aClass1_Sub8_Sub1_1.method326();
			arg1.method2365(Static142.anInt3104, local13, local65);
			arg1.anInt3043 = Static142.anInt3104 + 300;
			arg1.anInt3014 = Static21.aClass1_Sub8_Sub1_1.method326();
		}
		if ((arg2 & 0x20) != 0) {
			arg1.anInt3018 = Static21.aClass1_Sub8_Sub1_1.method359();
			arg1.anInt3053 = Static21.aClass1_Sub8_Sub1_1.method320();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt3021 = Static21.aClass1_Sub8_Sub1_1.method336();
			arg1.anInt3063 = Static21.aClass1_Sub8_Sub1_1.method362();
			arg1.anInt3056 = Static21.aClass1_Sub8_Sub1_1.method336();
			arg1.anInt3027 = Static21.aClass1_Sub8_Sub1_1.method362();
			arg1.anInt3029 = Static21.aClass1_Sub8_Sub1_1.method338() + Static142.anInt3104;
			arg1.anInt3038 = Static21.aClass1_Sub8_Sub1_1.method312() + Static142.anInt3104;
			arg1.anInt3016 = Static21.aClass1_Sub8_Sub1_1.method336();
			arg1.anInt3045 = 0;
			arg1.anInt3011 = 1;
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt3028 = Static21.aClass1_Sub8_Sub1_1.method312();
			local13 = Static21.aClass1_Sub8_Sub1_1.method347();
			arg1.anInt3044 = (local13 & 0xFFFF) + Static142.anInt3104;
			if (arg1.anInt3028 == 65535) {
				arg1.anInt3028 = -1;
			}
			arg1.anInt3020 = 0;
			arg1.anInt3058 = 0;
			arg1.anInt3042 = local13 >> 16;
			if (arg1.anInt3044 > Static142.anInt3104) {
				arg1.anInt3058 = -1;
			}
		}
		if ((arg2 & 0x80) == 0) {
			return;
		}
		arg1.aClass81_1088 = Static21.aClass1_Sub8_Sub1_1.method344();
		if (arg1.aClass81_1088.method2826(0) == 126) {
			arg1.aClass81_1088 = arg1.aClass81_1088.method2801(1);
			Static131.method2247(2, arg1.aClass81_1088, arg1.aClass81_518);
		} else if (arg1 == Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1) {
			Static131.method2247(2, arg1.aClass81_1088, arg1.aClass81_518);
		}
		arg1.anInt3015 = 0;
		arg1.anInt3032 = 0;
		arg1.anInt3035 = 150;
	}
}
