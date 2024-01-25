import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class257 {

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "[I")
	public int[] anIntArray812 = new int[20];

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "I")
	public final int anInt6762;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public final int anInt6763;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class257(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString77 = arg0;
		this.aString76 = arg1;
		this.aStringArray47 = arg2;
		this.anInt6762 = arg3;
		this.anInt6763 = arg4;
		this.anIntArray812 = arg5;
	}
}
