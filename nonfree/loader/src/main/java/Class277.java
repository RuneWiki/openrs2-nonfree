import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class277 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "[I")
	public int[] anIntArray549 = new int[20];

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "I")
	public final int anInt7444;

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public final int anInt7445;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray54;

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class277(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7444 = arg4;
		this.aString73 = arg1;
		this.anIntArray549 = arg5;
		this.anInt7445 = arg3;
		this.aStringArray54 = arg2;
		this.aString72 = arg0;
	}
}
