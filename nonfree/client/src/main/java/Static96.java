import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dn", name = "Eb", descriptor = "Lclient!an;")
	public static Class16 aClass16_20;

	@OriginalMember(owner = "client!dn", name = "Fb", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
	public static int anInt2243 = 0;

	@OriginalMember(owner = "client!dn", name = "mb", descriptor = "I")
	public static int anInt2249 = 0;

	@OriginalMember(owner = "client!dn", name = "ob", descriptor = "I")
	public static int anInt2250 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([Lclient!mc;IIZII)V")
	public static void method2047(@OriginalArg(0) Class198[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(19) Class198 local19 = arg0[local3];
			if (local19 != null && local19.anInt5787 == arg4) {
				Static322.method7800(arg1, arg2, local19, arg3);
				Static188.method3653(arg1, arg2, local19);
				if (local19.anInt5732 > local19.anInt5758 - local19.anInt5762) {
					local19.anInt5732 = local19.anInt5758 - local19.anInt5762;
				}
				if (local19.anInt5732 < 0) {
					local19.anInt5732 = 0;
				}
				if (local19.anInt5733 - local19.anInt5715 < local19.anInt5791) {
					local19.anInt5791 = local19.anInt5733 - local19.anInt5715;
				}
				if (local19.anInt5791 < 0) {
					local19.anInt5791 = 0;
				}
				if (local19.anInt5776 == 0) {
					Static190.method3668(local19, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!mc;II)V")
	public static void method2048(@OriginalArg(1) Class198 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static129.aClass198_17 = arg0;
		Static171.anInt3907 = arg1;
		Static70.anInt1703 = arg2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method2050(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(34) int local34 = local19 + (arg0 ? Static186.aClass122_1.anInt3855 : Static186.aClass122_1.anInt3854);
		for (@Pc(36) int local36 = local19; local36 < local34; local36++) {
			@Pc(43) Class12_Sub4_Sub17 local43 = Static186.aClass122_1.method3365(local36);
			if (local43.aBoolean558 && local43.method6778().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static292.anInt5650 = -1;
					Static428.aShortArray105 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(76) short[] local76 = new short[local11.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local13; local78++) {
						local76[local78] = local11[local78];
					}
					local11 = local76;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static428.aShortArray105 = local11;
		Static358.anInt6699 = 0;
		Static292.anInt5650 = local13;
		@Pc(115) String[] local115 = new String[Static292.anInt5650];
		for (@Pc(117) int local117 = 0; local117 < Static292.anInt5650; local117++) {
			local115[local117] = Static186.aClass122_1.method3365(local11[local117]).method6778();
		}
		Static13.method353(Static428.aShortArray105, local115);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIB)V")
	public static void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static540.anInt9594 = arg4;
		Static241.anInt9538 = arg1;
		Static129.anInt9544 = arg0;
		Static405.anInt7612 = arg3;
		Static84.anInt2025 = arg2;
		if (Static84.anInt2025 >= 100) {
			@Pc(28) int local28 = Static405.anInt7612 * 128 + 64;
			@Pc(34) int local34 = Static241.anInt9538 * 128 + 64;
			@Pc(42) int local42 = Static443.method6717(local28, local34, Static56.anInt1418) - Static540.anInt9594;
			@Pc(47) int local47 = local28 - Static368.anInt6832;
			@Pc(52) int local52 = local42 - Static62.anInt1472;
			@Pc(57) int local57 = local34 - Static6.anInt93;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local47 * local47 + local57 * local57));
			Static519.anInt9341 = (int) (Math.atan2((double) local52, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static248.anInt5104 = (int) (Math.atan2((double) local47, (double) local57) * -2607.5945876176133D) & 0x3FFF;
			Static507.anInt9125 = 0;
			if (Static519.anInt9341 < 1024) {
				Static519.anInt9341 = 1024;
			}
			if (Static519.anInt9341 > 3072) {
				Static519.anInt9341 = 3072;
			}
		}
		Static242.anInt4993 = 2;
	}
}
