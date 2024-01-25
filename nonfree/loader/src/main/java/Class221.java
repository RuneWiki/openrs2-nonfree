import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class221 {

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "[I")
	public int[] anIntArray817 = new int[20];

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public final int anInt6559;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString261;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "I")
	public final int anInt6558;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString260;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class221(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6559 = arg4;
		this.anIntArray817 = arg5;
		this.aStringArray47 = arg2;
		this.aString261 = arg1;
		this.anInt6558 = arg3;
		this.aString260 = arg0;
	}
}
