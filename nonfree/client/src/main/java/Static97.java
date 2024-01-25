import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
	public static void method1519() {
		Static607.method8328();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I")
	public static int method1522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static220.aByteArrayArray10 == null ? 0 : Static220.aByteArrayArray10[arg0][arg1] & 0xFF;
	}
}
