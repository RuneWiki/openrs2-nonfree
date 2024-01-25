import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static int anInt1945;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt1946;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public static int anInt1947;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_47 = new Class81(89, -2);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!nu;I[I[I[I)V")
	public static void method1706(@OriginalArg(0) Class20_Sub2_Sub4_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) int local18 = arg3[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg2[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && local28 < arg0.aClass313Array3.length) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass313Array3[local28] = null;
					} else {
						@Pc(50) Class131 local50 = Static594.aClass311_2.method7009(local18);
						@Pc(53) int local53 = local50.anInt3742;
						@Pc(58) Class313 local58 = arg0.aClass313Array3[local28];
						if (local58 != null) {
							if (local18 == local58.anInt8491) {
								if (local53 == 0) {
									local58 = arg0.aClass313Array3[local28] = null;
								} else if (local53 == 1) {
									local58.anInt8490 = 0;
									local58.anInt8488 = local26;
									local58.anInt8489 = 0;
									local58.anInt8493 = 0;
									local58.anInt8492 = 1;
									Static171.method2603(0, arg0.anInt8796, local50, arg0.anInt8795, arg0.aByte116, false);
								} else if (local53 == 2) {
									local58.anInt8490 = 0;
								}
							} else if (local50.anInt3734 >= Static594.aClass311_2.method7009(local58.anInt8491).anInt3734) {
								local58 = arg0.aClass313Array3[local28] = null;
							}
						}
						if (local58 == null) {
							local58 = arg0.aClass313Array3[local28] = new Class313();
							local58.anInt8493 = 0;
							local58.anInt8491 = local18;
							local58.anInt8492 = 1;
							local58.anInt8490 = 0;
							local58.anInt8488 = local26;
							local58.anInt8489 = 0;
							Static171.method2603(0, arg0.anInt8796, local50, arg0.anInt8795, arg0.aByte116, false);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1707() {
		@Pc(8) Class1_Sub13 local8 = (Class1_Sub13) Static270.aClass361_55.method7854();
		@Pc(16) boolean local16 = Static363.aClass365_14 != null || Static347.anInt9410 > 0;
		if (local16) {
			Static68.anInt1585 = 1;
		}
		if (Static490.aBoolean598 && Static595.aClass31_1.method985(81) && Static135.anInt2684 > 2) {
			if (local16) {
				Static330.aClass1_Sub23_2 = (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285.aClass1_285;
			} else {
				Static394.method5603(local8.method2537(), (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285.aClass1_285, local8.method2536());
			}
		} else if (local16) {
			Static330.aClass1_Sub23_2 = (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285;
		} else {
			Static394.method5603(local8.method2537(), (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285, local8.method2536());
		}
	}
}
