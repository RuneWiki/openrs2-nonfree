import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class225 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray856 = new int[20];

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString449;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt6707;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray51;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public final int anInt6708;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString448;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class225(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString449 = arg1;
		this.anInt6707 = arg4;
		this.aStringArray51 = arg2;
		this.anInt6708 = arg3;
		this.aString448 = arg0;
		this.anIntArray856 = arg5;
	}
}
