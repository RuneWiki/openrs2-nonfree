import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class230 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "[I")
	public int[] anIntArray582 = new int[20];

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "I")
	public final int anInt7044;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "I")
	public final int anInt7045;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class230(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString76 = arg1;
		this.anIntArray582 = arg5;
		this.anInt7044 = arg3;
		this.aStringArray49 = arg2;
		this.anInt7045 = arg4;
		this.aString75 = arg0;
	}
}
