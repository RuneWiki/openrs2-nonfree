import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class365 {

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "[I")
	public int[] anIntArray723 = new int[20];

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "I")
	public final int anInt9646;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString115;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public final int anInt9645;

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class365(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9646 = arg3;
		this.aString115 = arg0;
		this.anIntArray723 = arg5;
		this.aString114 = arg1;
		this.anInt9645 = arg4;
		this.aStringArray41 = arg2;
	}
}
