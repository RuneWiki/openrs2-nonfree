import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class229 {

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "[I")
	public int[] anIntArray525 = new int[20];

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "I")
	public final int anInt7061;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "I")
	public final int anInt7062;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class229(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString76 = arg0;
		this.anInt7061 = arg4;
		this.anInt7062 = arg3;
		this.aStringArray47 = arg2;
		this.aString77 = arg1;
		this.anIntArray525 = arg5;
	}
}
