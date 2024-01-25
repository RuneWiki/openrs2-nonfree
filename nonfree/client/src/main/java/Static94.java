import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_37 = new Class130(3, -1);

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public static int anInt2209 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
	public static void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(43) String local43 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local43);
		Static601.method8395(false, local43, true);
	}
}
