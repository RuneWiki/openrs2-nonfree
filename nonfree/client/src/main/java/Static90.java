import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "Lclient!ai;")
	public static Class7 aClass7_16;

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "[I")
	public static int[] anIntArray247 = new int[200];

	@OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_688 = Static200.method3116(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZILclient!ab;III)V")
	public static void method1560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) long local5 = 0L;
		if (arg3 == 0) {
			local5 = Static84.method1047(arg4, arg0, arg1);
		}
		if (arg3 == 1) {
			local5 = Static133.method2219(arg4, arg0, arg1);
		}
		if (arg3 == 2) {
			local5 = Static31.method593(arg4, arg0, arg1);
		}
		if (arg3 == 3) {
			local5 = Static184.method2913(arg4, arg0, arg1);
		}
		if (local5 == 0L) {
			return;
		}
		@Pc(60) int local60 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
		@Pc(67) int local67 = (int) local5 >> 14 & 0x1F;
		@Pc(74) int local74 = (int) local5 >> 20 & 0x3;
		@Pc(78) Class1_Sub1_Sub23 local78 = Static44.method760(local60);
		if (arg3 == 0) {
			Static5.method86(arg4, arg0, arg1);
			if (local78.anInt4023 != 0) {
				arg2.method40(local67, local78.aBoolean223, arg1, arg0, local74);
			}
		}
		if (arg3 == 1) {
			Static203.method3159(arg4, arg0, arg1);
		}
		if (arg3 == 2) {
			Static190.method2983(arg4, arg0, arg1);
			if (local78.anInt4023 != 0 && local78.anInt4024 + arg0 < 104 && arg1 + local78.anInt4024 < 104 && arg0 + local78.anInt4018 < 104 && arg1 + local78.anInt4018 < 104) {
				arg2.method38(arg1, local78.anInt4024, local78.aBoolean223, arg0, local74, local78.anInt4018);
			}
		}
		if (arg3 != 3) {
			return;
		}
		Static47.method806(arg4, arg0, arg1);
		if (local78.anInt4023 == 1) {
			arg2.method44(arg0, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
	public static void method1561() {
		Static13.aClass19_1 = new Class19();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZLclient!pj;I)V")
	public static void method1562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class1_Sub1_Sub21 arg3, @OriginalArg(5) int arg4) {
		if (Static196.anInt4181 >= 50 || (arg3.anIntArrayArray55 == null || arg3.anIntArrayArray55.length < 1 || arg1 >= arg3.anIntArrayArray55.length || arg3.anIntArrayArray55[arg1] == null)) {
			return;
		}
		@Pc(35) int local35 = arg3.anIntArrayArray55[arg1][0];
		@Pc(39) int local39 = local35 >> 8;
		@Pc(45) int local45 = local35 >> 4 & 0x7;
		@Pc(68) int local68;
		if (arg3.anIntArrayArray55[arg1].length > 1) {
			local68 = (int) ((double) arg3.anIntArrayArray55[arg1].length * Math.random());
			if (local68 > 0) {
				local39 = arg3.anIntArrayArray55[arg1][local68];
			}
		}
		@Pc(81) int local81 = local35 & 0xF;
		if (local81 == 0) {
			if (arg2) {
				Static66.method1182(local39, local45, 0);
			}
		} else if (Static79.anInt1900 != 0) {
			Static158.anIntArray456[Static196.anInt4181] = local39;
			Static4.anIntArray12[Static196.anInt4181] = local45;
			local68 = (arg0 - 64) / 128;
			Static32.anIntArray112[Static196.anInt4181] = 0;
			Static73.aClass30Array1[Static196.anInt4181] = null;
			@Pc(128) int local128 = (arg4 - 64) / 128;
			Static154.anIntArray446[Static196.anInt4181] = local81 + (local128 << 8) + (local68 << 16);
			Static196.anInt4181++;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
	public static void method1563() {
		@Pc(7) byte[][] local7 = Static12.aByteArrayArray1;
		@Pc(14) int local14 = Static27.aByteArrayArray2.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) byte[] local22 = local7[local16];
			if (local22 != null) {
				@Pc(35) int local35 = (Static193.anIntArray536[local16] >> 8) * 64 - Static128.anInt2813;
				@Pc(46) int local46 = (Static193.anIntArray536[local16] & 0xFF) * 64 - Static163.anInt3587;
				Static84.method1044();
				Static147.method2512(local46, local22, local35, Static153.aClass3Array1);
			}
		}
	}
}
