import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	public static int anInt122;

	@OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
	public static int anInt133;

	@OriginalMember(owner = "client!aea", name = "E", descriptor = "Lclient!ho;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_1 = new Class240(66, -1);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method172(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.length();
		if (local11 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local11 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local11 || Static416.method5660(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local11 <= local25 - 1 || Static416.method5660(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(66) byte[] local66 = new byte[local31];
		Static162.method2587(arg0, local66, 0);
		return local66;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lclient!ub;[III)V")
	public static void method173(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(10) boolean local10;
		if (arg0.anIntArray527 != null) {
			local10 = true;
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray527.length; local12++) {
				if (arg0.anIntArray527[local12] != arg1[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt9664 != -1) {
				@Pc(49) Class239 local49 = Static13.aClass213_1.method5008(arg0.anInt9664);
				@Pc(52) int local52 = local49.anInt6416;
				if (local52 == 1) {
					arg0.anInt9674 = 0;
					arg0.anInt9697 = 1;
					arg0.anInt9641 = 0;
					arg0.anInt9680 = 0;
					arg0.anInt9698 = arg2;
					if (!arg0.aBoolean674) {
						Static305.method4420(arg0, local49, arg0.anInt9674);
					}
				}
				if (local52 == 2) {
					arg0.anInt9641 = 0;
				}
			}
		}
		local10 = true;
		for (@Pc(101) int local101 = 0; local101 < arg1.length; local101++) {
			if (arg1[local101] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray527 == null || arg0.anIntArray527[local101] == -1 || Static13.aClass213_1.method5008(arg1[local101]).anInt6404 >= Static13.aClass213_1.method5008(arg0.anIntArray527[local101]).anInt6404) {
				arg0.anIntArray527 = arg1;
				arg0.anInt9698 = arg2;
				arg0.anInt9705 = arg0.anInt9703;
			}
		}
		if (local10) {
			arg0.anIntArray527 = arg1;
			arg0.anInt9705 = arg0.anInt9703;
			arg0.anInt9698 = arg2;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!dt;)Lclient!ea;")
	public static Class89_Sub1 method175(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(7) Class89 local7 = Static521.method6772(arg0);
		@Pc(16) int local16 = arg0.method7912();
		return new Class89_Sub1(local7.anInt2185, local7.aClass266_10, local7.aClass131_13, local7.anInt2186, local7.anInt2184, local16);
	}
}
