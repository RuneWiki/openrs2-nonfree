import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
	public static int anInt6559;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_17 = new Class16(1);

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "Lclient!lt;")
	public static final Class185 aClass185_6 = new Class185("RC", 1);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)Z")
	public static boolean method5683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
