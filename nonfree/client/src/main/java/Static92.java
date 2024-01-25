import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "Lclient!tj;")
	public static Class193 aClass193_10;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_2 = new Class116();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZ)Lclient!vp;")
	public static Class4_Sub44 method531(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) long local17 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class4_Sub44) Static107.aClass43_35.method1273(local17);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BII)V")
	public static void method532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static348.aClass16_8.method327(Static212.aClass159_150.method4311(Static180.anInt3835));
		@Pc(31) int local31;
		for (@Pc(18) Class4_Sub39 local18 = (Class4_Sub39) Static58.aClass116_7.method3270(); local18 != null; local18 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			local31 = Static173.method3340(local18);
			if (local13 < local31) {
				local13 = local31;
			}
		}
		local13 += 8;
		local31 = Static105.anInt2645 * 16 + 21;
		@Pc(63) int local63 = arg1 - local13 / 2;
		if (Static24.anInt496 < local63 + local13) {
			local63 = Static24.anInt496 - local13;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(82) int local82 = arg0;
		if (local31 + arg0 > Static23.anInt465) {
			local82 = Static23.anInt465 - local31;
		}
		Static70.anInt1838 = local63;
		if (local82 < 0) {
			local82 = 0;
		}
		Static272.aBoolean393 = true;
		Static127.anInt3018 = local82;
		Static184.anInt3880 = (Static140.aBoolean255 ? 26 : 22) + Static105.anInt2645 * 16;
		Static302.anInt5773 = local13;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)V")
	public static void method533(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub4_Sub18 local12 = Static302.method4961(arg0, 9);
		local12.method4902();
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)Lclient!br;")
	public static Class21 method534(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static271.aClass21ArrayArray1[local7] == null || Static271.aClass21ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static166.method3253(local7);
			if (!local25) {
				return null;
			}
		}
		return Static271.aClass21ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIZZ)I")
	public static int method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class4_Sub44 local8 = method531(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray502.length) {
			return local8.anIntArray502[arg0];
		} else {
			return -1;
		}
	}
}
