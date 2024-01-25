import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_77 = new Class123(16, 0);

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_78 = new Class123(75, -1);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!lr;IIIB)V")
	public static void method2047(@OriginalArg(0) Class194 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) Class3_Sub30 local15 = (Class3_Sub30) Static407.aClass244_54.method5572(); local15 != null; local15 = (Class3_Sub30) Static407.aClass244_54.method5576()) {
			if (local15.anInt5184 == arg2 && arg1 << 9 == local15.anInt5180 && local15.anInt5181 == arg3 << 9 && local15.aClass194_1.anInt5827 == arg0.anInt5827) {
				if (local15.aClass3_Sub16_Sub2_2 != null) {
					Static354.aClass3_Sub16_Sub4_2.method7757(local15.aClass3_Sub16_Sub2_2);
					local15.aClass3_Sub16_Sub2_2 = null;
				}
				if (local15.aClass3_Sub16_Sub2_3 != null) {
					Static354.aClass3_Sub16_Sub4_2.method7757(local15.aClass3_Sub16_Sub2_3);
					local15.aClass3_Sub16_Sub2_3 = null;
				}
				local15.method8128();
				return;
			}
		}
	}
}
