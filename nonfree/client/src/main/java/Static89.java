import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dc", name = "Fb", descriptor = "I")
	public static int anInt6486;

	@OriginalMember(owner = "client!dc", name = "sb", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_40 = new Class136(32);

	@OriginalMember(owner = "client!dc", name = "zb", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_27 = new Class25(16);

	@OriginalMember(owner = "client!dc", name = "Db", descriptor = "Lclient!ww;")
	public static final Class384 aClass384_50 = new Class384(3, 2);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	public static void method5574(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(5, arg0);
		local12.method1473();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	public static int method5578() {
		return Static369.aClass302_1.method7391();
	}
}
