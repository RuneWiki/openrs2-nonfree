import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!da", name = "g", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!da", name = "z", descriptor = "I")
	public static int anInt6976;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_84 = new Class218(8, -2);

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public static int anInt6965 = -1;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt6968 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!qca;)Z")
	public static boolean method5847(@OriginalArg(1) Class269 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean694) {
			return false;
		} else if (!arg0.method6796(Static361.anInterface6_2)) {
			return false;
		} else if (Static487.aClass307_44.method7424((long) arg0.anInt8173) == null) {
			return Static312.aClass307_54.method7424((long) arg0.anInt8161) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5851(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class3_Sub38 local7 = null;
		for (@Pc(12) Class3_Sub38 local12 = (Class3_Sub38) Static165.aClass276_29.method6907(); local12 != null; local12 = (Class3_Sub38) Static165.aClass276_29.method6912()) {
			if (arg6 == local12.anInt8096 && local12.anInt8095 == arg0 && arg3 == local12.anInt8088 && arg5 == local12.anInt8086) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub38();
			local7.anInt8095 = arg0;
			local7.anInt8088 = arg3;
			local7.anInt8096 = arg6;
			local7.anInt8086 = arg5;
			if (arg0 >= 0 && arg3 >= 0 && Static394.anInt7540 > arg0 && Static462.anInt8391 > arg3) {
				Static499.method7289(local7);
			}
			Static165.aClass276_29.method6906(local7);
		}
		local7.anInt8094 = 0;
		local7.anInt8093 = arg2;
		local7.anInt8089 = arg1;
		local7.anInt8087 = -1;
		local7.anInt8085 = arg4;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5853(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
