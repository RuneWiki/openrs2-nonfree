import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!es", name = "d", descriptor = "I")
	public static int anInt2102 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method1861(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(16) short[] local16 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg0 ? 32768 : 0;
		@Pc(34) int local34 = (arg0 ? Static135.aClass75_2.anInt2422 : Static135.aClass75_2.anInt2421) + local24;
		for (@Pc(36) int local36 = local24; local36 < local34; local36++) {
			@Pc(43) Class4_Sub1_Sub4 local43 = Static135.aClass75_2.method2200(local36);
			if (local43.aBoolean29 && local43.method475().toLowerCase().indexOf(local8) != -1) {
				if (local18 >= 50) {
					Static148.aShortArray90 = null;
					Static412.anInt7173 = -1;
					return;
				}
				if (local16.length <= local18) {
					@Pc(72) short[] local72 = new short[local16.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local18; local74++) {
						local72[local74] = local16[local74];
					}
					local16 = local72;
				}
				local16[local18++] = (short) local36;
			}
		}
		Static148.aShortArray90 = local16;
		Static253.anInt4882 = 0;
		Static412.anInt7173 = local18;
		@Pc(107) String[] local107 = new String[Static412.anInt7173];
		for (@Pc(109) int local109 = 0; local109 < Static412.anInt7173; local109++) {
			local107[local109] = Static135.aClass75_2.method2200(local16[local109]).method475();
		}
		Static319.method4776(Static148.aShortArray90, local107);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)I")
	public static int method1862(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
	public static int method1863(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
