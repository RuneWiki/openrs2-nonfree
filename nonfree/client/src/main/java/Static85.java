import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!lga;")
	public static Class223 aClass223_20;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ih;I)V")
	public static void method1252(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub2 arg0) {
		for (@Pc(17) Class6_Sub35 local17 = (Class6_Sub35) Static81.aClass340_3.method8124(); local17 != null; local17 = (Class6_Sub35) Static81.aClass340_3.method8134()) {
			if (local17.aClass60_Sub1_Sub1_Sub3_Sub2_2 == arg0) {
				if (local17.aClass6_Sub17_Sub2_2 != null) {
					Static544.aClass6_Sub17_Sub3_2.method4663(local17.aClass6_Sub17_Sub2_2);
					local17.aClass6_Sub17_Sub2_2 = null;
				}
				local17.method9051();
				return;
			}
		}
	}
}
