import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!dn;")
	public static Class69 aClass69_24;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array21;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "[I")
	public static int[] anIntArray143;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_34 = new Class45("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	public static int anInt2018 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!maa;")
	public static RuntimeException_Sub1 method1928(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString125 = local12.aString125 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
