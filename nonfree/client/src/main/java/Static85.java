import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)I")
	public static int method1590(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([SIZ)[S")
	public static short[] method1591(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static681.method2475(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
