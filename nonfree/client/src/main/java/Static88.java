import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!dm", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method1876(@OriginalArg(1) String arg0) {
		return Static525.method8028(16, arg0);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Lclient!ol;")
	public static Class216 method1877(@OriginalArg(0) int arg0) {
		@Pc(15) Class216 local15 = (Class216) Static440.aClass277_58.method7014((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static134.aClass69_30.method1888(arg0, 0);
		local15 = new Class216();
		if (local27 != null) {
			local15.method5779(new Class1_Sub17(local27));
		}
		local15.method5783();
		Static440.aClass277_58.method7016(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	public static void method1878() {
		if (!Static19.aBoolean21) {
			return;
		}
		while (true) {
			while (Static452.anInt7896 < Static529.aClass38_Sub1Array140.length) {
				@Pc(26) Class38_Sub1 local26 = Static529.aClass38_Sub1Array140[Static452.anInt7896];
				if (local26 != null && local26.anInt5577 == -1) {
					if (Static452.aClass1_Sub16_2 == null) {
						Static452.aClass1_Sub16_2 = Static288.aClass168_1.method4636(local26.aString132);
					}
					@Pc(50) int local50 = Static452.aClass1_Sub16_2.anInt2994;
					if (local50 == -1) {
						return;
					}
					local26.anInt5577 = local50;
					Static452.anInt7896++;
					Static452.aClass1_Sub16_2 = null;
				} else {
					Static452.anInt7896++;
				}
			}
			return;
		}
	}
}
