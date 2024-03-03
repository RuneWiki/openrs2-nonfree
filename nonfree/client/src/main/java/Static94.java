import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Lclient!r;")
	public static Class197 aClass197_23;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IIII)V", line = 19)
	public static void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg3 < local15) {
			@Pc(19) int local19 = arg3 + 1;
			arg1[local19] = arg2;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg2;
			arg3 = local49 + 1;
			arg1[arg3] = arg2;
		}
		while (arg3 < local12) {
			arg3++;
			arg1[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!np;)Z", line = 47)
	public static boolean method2166(@OriginalArg(1) Class164 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean305) {
			return false;
		} else if (!arg0.method4181(Static321.anInterface11_2)) {
			return false;
		} else if (Class154.aClass4_83.method90((long) arg0.anInt4423) == null) {
			return Class2_Sub3_Sub15.aClass4_58.method90((long) arg0.anInt4417) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIILclient!r;)Lclient!vi;", line = 78)
	public static Class239 method2167(@OriginalArg(2) int arg0, @OriginalArg(3) Class197 arg1) {
		@Pc(13) byte[] local13 = arg1.method5090(0, arg0);
		return local13 == null ? null : new Class239(local13);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I", line = 96)
	public static int method2168(@OriginalArg(1) int arg0) {
		if (Static312.aClass111_4 != null) {
			Static312.aClass111_4.method2801();
			Static312.aClass111_4 = null;
		}
		Class9.anInt270++;
		if (Class9.anInt270 > 4) {
			Class9.anInt270 = 0;
			Class2_Sub10.anInt1749 = 0;
			return arg0;
		}
		Class2_Sub10.anInt1749 = 0;
		if (Static255.anInt5144 == Static366.anInt7212) {
			Static255.anInt5144 = Static34.anInt919;
		} else {
			Static255.anInt5144 = Static366.anInt7212;
		}
		return -1;
	}
}
