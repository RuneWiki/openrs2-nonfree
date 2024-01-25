import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public static int anInt1498 = 0;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_14 = new Class32(8);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public static void method1198() {
		Static568.aClass109_66 = new Class109();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)I")
	public static int method1199(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!hg;B)V")
	public static void method1200(@OriginalArg(0) Class13_Sub1_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static262.anInt5597 == arg0.anInt4630 || arg0.anInt4559 == -1 || arg0.anInt4622 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class81 local29 = Static540.aClass173_2.method3791(arg0.anInt4559);
			if (local29.aBoolean158 || local29.anIntArray151[arg0.anInt4591] < arg0.anInt4564 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(52) int local52 = arg0.anInt4630 - arg0.anInt4619;
			@Pc(58) int local58 = Static262.anInt5597 - arg0.anInt4619;
			@Pc(69) int local69 = arg0.anInt4594 * 512 + arg0.method3950() * 256;
			@Pc(81) int local81 = arg0.anInt4590 * 512 + arg0.method3950() * 256;
			@Pc(92) int local92 = arg0.anInt4597 * 512 + arg0.method3950() * 256;
			@Pc(104) int local104 = arg0.anInt4572 * 512 + arg0.method3950() * 256;
			arg0.anInt10090 = (local58 * local92 + local69 * (local52 - local58)) / local52;
			arg0.anInt10089 = (local104 * local58 + local81 * (local52 - local58)) / local52;
		}
		arg0.anInt4640 = 0;
		if (arg0.anInt4571 == 0) {
			arg0.method3952(8192, false);
		}
		if (arg0.anInt4571 == 1) {
			arg0.method3952(12288, false);
		}
		if (arg0.anInt4571 == 2) {
			arg0.method3952(0, false);
		}
		if (arg0.anInt4571 == 3) {
			arg0.method3952(4096, false);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZILclient!ha;I)Lclient!ek;")
	public static Class91 method1201(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static200.anIntArray222 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static200.anIntArray222.length; local14++) {
				if (arg2 == Static200.anIntArray222[local14]) {
					return Static554.aClass91Array1[local14];
				}
			}
		}
		@Pc(41) Class91 local41 = (Class91) Static493.aClass32_72.method630((long) arg2);
		if (local41 != null) {
			if (arg0 && local41.aClass256_4 == null) {
				@Pc(53) Class256 local53 = Static3.method8590(Static343.aClass380_80, arg2);
				if (local53 == null) {
					return null;
				}
				local41.aClass256_4 = local53;
			}
			return local41;
		}
		@Pc(66) Class329[] local66 = Static655.method7422(Static144.aClass380_40, arg2);
		if (local66 == null) {
			return null;
		}
		@Pc(82) Class256 local82 = Static3.method8590(Static343.aClass380_80, arg2);
		if (local82 == null) {
			return null;
		}
		if (arg0) {
			local41 = new Class91(arg1.method6956(local82, local66), local82);
		} else {
			local41 = new Class91(arg1.method6956(local82, local66));
		}
		Static493.aClass32_72.method629(local41, (long) arg2);
		return local41;
	}
}
