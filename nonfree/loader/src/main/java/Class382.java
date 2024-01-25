import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class382 {

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[I")
	public int[] anIntArray630 = new int[20];

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "I")
	public final int anInt10715;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString123;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString124;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "I")
	public final int anInt10714;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class382(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10715 = arg4;
		this.aString123 = arg1;
		this.aString124 = arg0;
		this.anInt10714 = arg3;
		this.aStringArray41 = arg2;
		this.anIntArray630 = arg5;
	}
}
