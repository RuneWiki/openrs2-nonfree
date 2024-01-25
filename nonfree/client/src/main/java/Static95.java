import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
	public static int anInt1501 = -1;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!fb;Z)V")
	public static void method1435(@OriginalArg(0) Class14_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort74; local2 <= arg0.aShort73; local2++) {
			for (@Pc(6) int local6 = arg0.aShort71; local6 <= arg0.aShort72; local6++) {
				@Pc(16) Class156 local16 = Static535.aClass156ArrayArrayArray2[arg0.aByte125][local2][local6];
				if (local16 != null) {
					@Pc(21) Class66 local21 = local16.aClass66_2;
					@Pc(23) Class66 local23 = null;
					while (local21 != null) {
						if (local21.aClass14_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass66_2 = local21.aClass66_1;
							} else {
								local23.aClass66_1 = local21.aClass66_1;
							}
							local21.method1339();
							break;
						}
						local23 = local21;
						local21 = local21.aClass66_1;
					}
				}
			}
		}
		if (!arg1) {
			Static139.method2092(arg0);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "([[BILclient!aha;)V")
	public static void method1436(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class15_Sub1 arg1) {
		@Pc(8) int local8 = Static112.aByteArrayArray4.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(33) int local33 = (Static594.anIntArray784[local15] >> 8) * 64 - Static113.anInt1785;
				@Pc(43) int local43 = (Static594.anIntArray784[local15] & 0xFF) * 64 - Static622.anInt10087;
				Static439.method6528();
				arg1.method405(Static308.aClass182Array1, Static485.aClass126_17, local21, local43, local33);
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)Z")
	public static boolean method1437() {
		try {
			@Pc(7) Class157 local7 = new Class157();
			@Pc(12) byte[] local12 = local7.method3633(Static616.aByteArray103);
			Static577.method8146(local12);
			return true;
		} catch (@Pc(25) Exception local25) {
			return false;
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
	public static void method1438() {
		for (@Pc(14) Class5_Sub52 local14 = (Class5_Sub52) Static250.aClass306_16.method7313(); local14 != null; local14 = (Class5_Sub52) Static250.aClass306_16.method7301()) {
			if (local14.aBoolean836) {
				local14.method8843();
			}
		}
		for (@Pc(38) Class5_Sub52 local38 = (Class5_Sub52) Static573.aClass306_59.method7313(); local38 != null; local38 = (Class5_Sub52) Static573.aClass306_59.method7301()) {
			if (local38.aBoolean836) {
				local38.method8843();
			}
		}
	}
}
