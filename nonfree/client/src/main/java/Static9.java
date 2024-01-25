import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_48 = new Class300(512);

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public static int anInt10600 = 13156520;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Lclient!cda;")
	public static Class28_Sub1_Sub3 method8812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class226 local7 = Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub1_Sub3_2;
	}
}
