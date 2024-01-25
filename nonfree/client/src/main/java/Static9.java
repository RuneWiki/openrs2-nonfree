import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!us;")
	public static final Class344 aClass344_2 = new Class344(31, -1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!kha;ILclient!kha;I)V")
	public static void method111(@OriginalArg(0) Class181 arg0, @OriginalArg(2) Class181 arg1) {
		Static201.aClass181_43 = arg1;
		Static438.aClass181_82 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!dv;I)V")
	public static void method113(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static342.aClass276_43.method6907(); local15 != null; local15 = (Class3_Sub25) Static342.aClass276_43.method6912()) {
			if (local15.aClass2_Sub3_Sub1_Sub2_Sub1_1 == arg0) {
				if (local15.aClass3_Sub7_Sub1_3 != null) {
					Static581.aClass3_Sub7_Sub3_2.method2210(local15.aClass3_Sub7_Sub1_3);
					local15.aClass3_Sub7_Sub1_3 = null;
				}
				local15.method8671();
				return;
			}
		}
	}
}
