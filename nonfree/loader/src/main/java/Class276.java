import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class276 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray649 = new int[20];

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString210;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString211;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public final int anInt7326;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray44;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public final int anInt7325;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class276(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString210 = arg0;
		this.anIntArray649 = arg5;
		this.aString211 = arg1;
		this.anInt7326 = arg4;
		this.aStringArray44 = arg2;
		this.anInt7325 = arg3;
	}
}
