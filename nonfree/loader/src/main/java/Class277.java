import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class277 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "[I")
	public int[] anIntArray667 = new int[20];

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public final int anInt7421;

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "I")
	public final int anInt7422;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class277(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7421 = arg4;
		this.aStringArray46 = arg2;
		this.aString75 = arg0;
		this.aString74 = arg1;
		this.anInt7422 = arg3;
		this.anIntArray667 = arg5;
	}
}
