import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_35 = new Class322(50, 2);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(BII)Z")
	public static boolean method1363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(29) boolean local29 = (arg0 & 0x37) == 0 ? Static165.method3263(arg1, arg0) : Static313.method4966(arg1, arg0);
		return local29 | (arg1 & 0x10000) != 0 | Static70.method927(arg0, arg1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1365(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(15) String local15 = Static273.method4625(arg0);
		if (local15 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static265.anInt5023; local21++) {
			@Pc(27) String local27 = Static35.aStringArray5[local21];
			@Pc(31) String local31 = Static273.method4625(local27);
			if (Static591.method8213(arg0, local31, local27, local15)) {
				Static265.anInt5023--;
				for (@Pc(44) int local44 = local21; local44 < Static265.anInt5023; local44++) {
					Static35.aStringArray5[local44] = Static35.aStringArray5[local44 + 1];
					Static665.aStringArray45[local44] = Static665.aStringArray45[local44 + 1];
					Static241.anIntArray241[local44] = Static241.anIntArray241[local44 + 1];
					Static626.aStringArray41[local44] = Static626.aStringArray41[local44 + 1];
					Static609.anIntArray626[local44] = Static609.anIntArray626[local44 + 1];
					Static665.aBooleanArray31[local44] = Static665.aBooleanArray31[local44 + 1];
				}
				Static535.anInt4136 = Static633.anInt8242;
				@Pc(113) Class260 local113 = Static629.method8573();
				@Pc(119) Class6_Sub13 local119 = Static30.method353(Static121.aClass241_35, local113.aClass270_2);
				local119.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg0));
				local119.aClass6_Sub15_Sub1_1.method2991(arg0);
				local113.method6404(local119);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)V")
	public static void method1366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg1 | (long) arg0 << 32, 18);
		local14.method2038();
	}
}
