import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class275 {

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[I")
	public int[] anIntArray522 = new int[20];

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public final int anInt7553;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public final int anInt7552;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString81;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class275(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7553 = arg3;
		this.anInt7552 = arg4;
		this.anIntArray522 = arg5;
		this.aString82 = arg1;
		this.aString81 = arg0;
		this.aStringArray49 = arg2;
	}
}
