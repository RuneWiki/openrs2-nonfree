import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!da", name = "w", descriptor = "Lclient!cn;")
	public static Class73 aClass73_21;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!vaa;")
	public static Class361 aClass361_19 = new Class361(6, 1);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!el;")
	public static final Class109 aClass109_215 = new Class109(74, 5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ib;II)V")
	public static void method8786(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (Static620.aClass176_10 == null) {
			return;
		}
		try {
			Static620.aClass176_10.method3782(0L);
			Static620.aClass176_10.method3784(arg1, arg0.aByteArray102, 24);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method8793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
